package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Map;


class DAOMap extends DAOEntity<Map> {

	
	public DAOMap(final Connection connection) throws SQLException {
		super(connection);
	}

	
	@Override
	public boolean create(final Map entity) {
		// Not implemented
		return false;
	}

	
	@Override
	public boolean delete(final Map entity) {
		// Not implemented
		return false;
	}

	
	@Override
	public boolean update(final Map entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#find(int)
	 */
	@Override
	public Map find(final int id) {
		Map Map = new Map();

		try {
			final String sql = "{call MapById(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, id);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			if (resultSet.first()) {
				Map = new Map(id, resultSet.getString("code"), resultSet.getString("Map"));
			}
			return Map;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#find(java.lang.String)
	 */
	@Override
	public Map find(final String code) {
		Map Map = new Map();

		try {
			final String sql = "{call MapByCode(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setString(1, code);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			if (resultSet.first()) {
				Map = new Map(resultSet.getInt("id"), code, resultSet.getString("Map"));
			}
			return Map;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
