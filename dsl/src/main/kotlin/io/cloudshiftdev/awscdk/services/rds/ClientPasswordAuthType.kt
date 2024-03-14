package io.cloudshiftdev.awscdk.services.rds

public enum class ClientPasswordAuthType(
    private val cdkObject: software.amazon.awscdk.services.rds.ClientPasswordAuthType,
) {
    MYSQL_NATIVE_PASSWORD(
        software.amazon.awscdk.services.rds.ClientPasswordAuthType.MYSQL_NATIVE_PASSWORD
    ),
    POSTGRES_SCRAM_SHA_256(
        software.amazon.awscdk.services.rds.ClientPasswordAuthType.POSTGRES_SCRAM_SHA_256
    ),
    POSTGRES_MD5(software.amazon.awscdk.services.rds.ClientPasswordAuthType.POSTGRES_MD5),
    SQL_SERVER_AUTHENTICATION(
        software.amazon.awscdk.services.rds.ClientPasswordAuthType.SQL_SERVER_AUTHENTICATION
    ),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.rds.ClientPasswordAuthType
        ): ClientPasswordAuthType =
            when (cdkObject) {
                software.amazon.awscdk.services.rds.ClientPasswordAuthType.MYSQL_NATIVE_PASSWORD ->
                    ClientPasswordAuthType.MYSQL_NATIVE_PASSWORD
                software.amazon.awscdk.services.rds.ClientPasswordAuthType.POSTGRES_SCRAM_SHA_256 ->
                    ClientPasswordAuthType.POSTGRES_SCRAM_SHA_256
                software.amazon.awscdk.services.rds.ClientPasswordAuthType.POSTGRES_MD5 ->
                    ClientPasswordAuthType.POSTGRES_MD5
                software.amazon.awscdk.services.rds.ClientPasswordAuthType
                    .SQL_SERVER_AUTHENTICATION -> ClientPasswordAuthType.SQL_SERVER_AUTHENTICATION
            }

        internal fun unwrap(
            wrapped: ClientPasswordAuthType
        ): software.amazon.awscdk.services.rds.ClientPasswordAuthType = wrapped.cdkObject
    }
}
