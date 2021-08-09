package com.volmit.plague.util;


import com.volmit.iris.util.collection.KList;
import com.volmit.iris.util.format.ColoredString;
import com.volmit.iris.util.json.JSONArray;
import com.volmit.iris.util.json.JSONObject;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Raw Text EXTRA
 *
 * @author cyberpwn
 */
@NoArgsConstructor
public class RTEX
{
	@Getter
	private final KList<ColoredString> extras = new KList<>();

	/**
	 * Create a new raw text base
	 * @param extra the extras
	 */
	public RTEX(ColoredString... extra)
	{
		extras.addAll(List.of(extra));
	}

	/**
	 * @return the json object for this
	 */
	public JSONObject toJSON()
	{
		JSONObject js = new JSONObject();
		JSONArray jsa = new JSONArray();

		for(ColoredString i : extras)
		{
			JSONObject extra = new JSONObject();
			extra.put("text", i.getS());
			extra.put("color", i.getC().name().toLowerCase());
			jsa.put(extra);
		}

		js.put("text", "");
		js.put("extra", jsa);

		return js;
	}
}
