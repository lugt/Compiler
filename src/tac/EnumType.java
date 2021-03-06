package tac;

public enum EnumType {
	// types simples
	SHORT, UNSIGNED_SHORT, INTEGER, UNSIGNED_INTEGER,
	REAL, UNSIGNED_REAL, BOOLEAN, ENUM,

	// types complexes
	POINTER, TIMES,

	OP_ARITHMETIQUE, OP_BOOL,
    CHARACTER, CHARACTERS,
    TABLEAU, INTERVALLE, VARIABLE,

    POINTER_INT, POINTER_REAL,
    POINTER_CHARACTER, POINTER_CHARACTERS,

    PROCEDURE;
}
