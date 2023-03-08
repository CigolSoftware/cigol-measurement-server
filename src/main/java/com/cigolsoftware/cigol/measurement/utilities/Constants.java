package com.cigolsoftware.cigol.measurement.utilities;

public class Constants {
	public static final class Application {
		public static final String PACKAGES = "com.cigolsoftware.cigol.measurement.repositories";

		private Application() {
		}
	}

	public static final class Column {
		public static final String CODE_MAG = "code" + Column.MAG;
		public static final String CODE_PRE = "code" + Column.PRE;
		public static final String ID_MAG = "id" + Column.MAG;
		public static final String ID_PRE = "id" + Column.PRE;
		private static final String MAG = "_mag";
		private static final String PRE = "_pre";

		private Column() {
		}
	}

	public static final class Mapping {
		public static final String CHANGE = "change";
		public static final String CODE = "/{code}";
		public static final String FIND_ALL = "findAll";
		public static final String MAGNITUDES = "magnitudes";
		public static final String PREFIXES = "prefixes";

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
