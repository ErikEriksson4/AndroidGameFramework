package com.erikeriksson.framework;

import com.erikeriksson.framework.Graphics.ImageFormat;

public interface Image {

	public int getWidth();

	public int getHeight();

	public ImageFormat getFormat();

	public void dispose();

}
