package com.cigolsoftware.cigol.measurement.utilities;

public class Constants {
	public static final class Column {
		public static final String CODE_MAG = "code" + Column.MAG;
		public static final String ID_MAG = "id" + Column.MAG;
		private static final String MAG = "_mag";

		private Column() {
		}
	}

	public static final class Mapping {
		public static final String CHANGE = "change";
		public static final String FIND_ALL = "findAll";
		public static final String MAGNITUDE = "/{magnitude}";
		public static final String MAGNITUDES = "magnitudes";

		private Mapping() {
		}
	}

	public static final class Properties {
		public static final String PARAMS = "params";

		private Properties() {
		}
	}

	public static final class Table {
		public static final String MEASUREMENT = "measurement";

		private Table() {
		}
	}

	private Constants() {
	}
}
