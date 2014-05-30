package com.cxy.redisclient.integration.set;

import java.util.List;

import com.cxy.redisclient.integration.JedisCommandFactory;

public class AddSetFactory extends JedisCommandFactory {

	public AddSetFactory(int id, int db, String key, List<String> values) {
		super(id);
		commands.add(new AddSet10(id, db, key, values));
		commands.add(new AddSet24(id, db, key, values));
	}

}
