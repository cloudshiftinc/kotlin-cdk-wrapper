@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A database instance engine.
 *
 * Provides mapping to DatabaseEngine used for
 * secret rotation.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseInstance iopsInstance = DatabaseInstance.Builder.create(this, "IopsInstance")
 * .engine(DatabaseInstanceEngine.mysql(MySqlInstanceEngineProps.builder().version(MysqlEngineVersion.VER_8_0_30).build()))
 * .vpc(vpc)
 * .storageType(StorageType.IO1)
 * .iops(5000)
 * .build();
 * DatabaseInstance gp3Instance = DatabaseInstance.Builder.create(this, "Gp3Instance")
 * .engine(DatabaseInstanceEngine.mysql(MySqlInstanceEngineProps.builder().version(MysqlEngineVersion.VER_8_0_30).build()))
 * .vpc(vpc)
 * .allocatedStorage(500)
 * .storageType(StorageType.GP3)
 * .storageThroughput(500)
 * .build();
 * ```
 */
public open class DatabaseInstanceEngine internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.DatabaseInstanceEngine,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.rds.DatabaseInstanceEngine())

  public companion object {
    public val MARIADB: IInstanceEngine =
        IInstanceEngine.wrap(software.amazon.awscdk.services.rds.DatabaseInstanceEngine.MARIADB)

    public val MYSQL: IInstanceEngine =
        IInstanceEngine.wrap(software.amazon.awscdk.services.rds.DatabaseInstanceEngine.MYSQL)

    public val ORACLE_EE: IInstanceEngine =
        IInstanceEngine.wrap(software.amazon.awscdk.services.rds.DatabaseInstanceEngine.ORACLE_EE)

    public val ORACLE_EE_CDB: IInstanceEngine =
        IInstanceEngine.wrap(software.amazon.awscdk.services.rds.DatabaseInstanceEngine.ORACLE_EE_CDB)

    public val ORACLE_SE2: IInstanceEngine =
        IInstanceEngine.wrap(software.amazon.awscdk.services.rds.DatabaseInstanceEngine.ORACLE_SE2)

    public val ORACLE_SE2_CDB: IInstanceEngine =
        IInstanceEngine.wrap(software.amazon.awscdk.services.rds.DatabaseInstanceEngine.ORACLE_SE2_CDB)

    public val POSTGRES: IInstanceEngine =
        IInstanceEngine.wrap(software.amazon.awscdk.services.rds.DatabaseInstanceEngine.POSTGRES)

    public val SQL_SERVER_EE: IInstanceEngine =
        IInstanceEngine.wrap(software.amazon.awscdk.services.rds.DatabaseInstanceEngine.SQL_SERVER_EE)

    public val SQL_SERVER_EX: IInstanceEngine =
        IInstanceEngine.wrap(software.amazon.awscdk.services.rds.DatabaseInstanceEngine.SQL_SERVER_EX)

    public val SQL_SERVER_SE: IInstanceEngine =
        IInstanceEngine.wrap(software.amazon.awscdk.services.rds.DatabaseInstanceEngine.SQL_SERVER_SE)

    public val SQL_SERVER_WEB: IInstanceEngine =
        IInstanceEngine.wrap(software.amazon.awscdk.services.rds.DatabaseInstanceEngine.SQL_SERVER_WEB)

    public fun mariaDb(props: MariaDbInstanceEngineProps): IInstanceEngine =
        software.amazon.awscdk.services.rds.DatabaseInstanceEngine.mariaDb(props.let(MariaDbInstanceEngineProps::unwrap)).let(IInstanceEngine::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9575d4157463557a462f39a3569bdd03468f3ceb7edb2306c8cb1d3a455bbb57")
    public fun mariaDb(props: MariaDbInstanceEngineProps.Builder.() -> Unit): IInstanceEngine =
        mariaDb(MariaDbInstanceEngineProps(props))

    public fun mysql(props: MySqlInstanceEngineProps): IInstanceEngine =
        software.amazon.awscdk.services.rds.DatabaseInstanceEngine.mysql(props.let(MySqlInstanceEngineProps::unwrap)).let(IInstanceEngine::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6337f42418745d4136b8be1c456c93f905937067fd0b5d7890f4978b689a7a93")
    public fun mysql(props: MySqlInstanceEngineProps.Builder.() -> Unit): IInstanceEngine =
        mysql(MySqlInstanceEngineProps(props))

    public fun oracleEe(props: OracleEeInstanceEngineProps): IInstanceEngine =
        software.amazon.awscdk.services.rds.DatabaseInstanceEngine.oracleEe(props.let(OracleEeInstanceEngineProps::unwrap)).let(IInstanceEngine::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d25575be2373812bb0124de35a433db1ad97175edd4e11ed565965cdf1e3f6cf")
    public fun oracleEe(props: OracleEeInstanceEngineProps.Builder.() -> Unit): IInstanceEngine =
        oracleEe(OracleEeInstanceEngineProps(props))

    public fun oracleEeCdb(props: OracleEeCdbInstanceEngineProps): IInstanceEngine =
        software.amazon.awscdk.services.rds.DatabaseInstanceEngine.oracleEeCdb(props.let(OracleEeCdbInstanceEngineProps::unwrap)).let(IInstanceEngine::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2831566e5206506601708f7f7d9347d3df9526961227d65813f91ece19a18424")
    public fun oracleEeCdb(props: OracleEeCdbInstanceEngineProps.Builder.() -> Unit):
        IInstanceEngine = oracleEeCdb(OracleEeCdbInstanceEngineProps(props))

    public fun oracleSe2(props: OracleSe2InstanceEngineProps): IInstanceEngine =
        software.amazon.awscdk.services.rds.DatabaseInstanceEngine.oracleSe2(props.let(OracleSe2InstanceEngineProps::unwrap)).let(IInstanceEngine::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36c6c34b0f512075022a680b824f0c33cb455f353c003e2364a142bfc074d50f")
    public fun oracleSe2(props: OracleSe2InstanceEngineProps.Builder.() -> Unit): IInstanceEngine =
        oracleSe2(OracleSe2InstanceEngineProps(props))

    public fun oracleSe2Cdb(props: OracleSe2CdbInstanceEngineProps): IInstanceEngine =
        software.amazon.awscdk.services.rds.DatabaseInstanceEngine.oracleSe2Cdb(props.let(OracleSe2CdbInstanceEngineProps::unwrap)).let(IInstanceEngine::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("afdd1bf6a0513b364b70f4471e6bd79b759ff88432defaebdac19f7babaf84be")
    public fun oracleSe2Cdb(props: OracleSe2CdbInstanceEngineProps.Builder.() -> Unit):
        IInstanceEngine = oracleSe2Cdb(OracleSe2CdbInstanceEngineProps(props))

    public fun postgres(props: PostgresInstanceEngineProps): IInstanceEngine =
        software.amazon.awscdk.services.rds.DatabaseInstanceEngine.postgres(props.let(PostgresInstanceEngineProps::unwrap)).let(IInstanceEngine::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("546283da5baec0be9191260d38e074801b3d94e82e89302fa03ad7dcb185d0a4")
    public fun postgres(props: PostgresInstanceEngineProps.Builder.() -> Unit): IInstanceEngine =
        postgres(PostgresInstanceEngineProps(props))

    public fun sqlServerEe(props: SqlServerEeInstanceEngineProps): IInstanceEngine =
        software.amazon.awscdk.services.rds.DatabaseInstanceEngine.sqlServerEe(props.let(SqlServerEeInstanceEngineProps::unwrap)).let(IInstanceEngine::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16085e4bdfb996bed65bd94facd8f6a7274cba4bf3fe9f72304b9d627ceacb81")
    public fun sqlServerEe(props: SqlServerEeInstanceEngineProps.Builder.() -> Unit):
        IInstanceEngine = sqlServerEe(SqlServerEeInstanceEngineProps(props))

    public fun sqlServerEx(props: SqlServerExInstanceEngineProps): IInstanceEngine =
        software.amazon.awscdk.services.rds.DatabaseInstanceEngine.sqlServerEx(props.let(SqlServerExInstanceEngineProps::unwrap)).let(IInstanceEngine::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08868346059a4c267f8109692438c91afac2be5eb341cdfc05f8b8022e10a513")
    public fun sqlServerEx(props: SqlServerExInstanceEngineProps.Builder.() -> Unit):
        IInstanceEngine = sqlServerEx(SqlServerExInstanceEngineProps(props))

    public fun sqlServerSe(props: SqlServerSeInstanceEngineProps): IInstanceEngine =
        software.amazon.awscdk.services.rds.DatabaseInstanceEngine.sqlServerSe(props.let(SqlServerSeInstanceEngineProps::unwrap)).let(IInstanceEngine::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("035d2ef6f9cdf57e7bdd77bf5d84b091d893532ac9629ed35b24c192225ee24c")
    public fun sqlServerSe(props: SqlServerSeInstanceEngineProps.Builder.() -> Unit):
        IInstanceEngine = sqlServerSe(SqlServerSeInstanceEngineProps(props))

    public fun sqlServerWeb(props: SqlServerWebInstanceEngineProps): IInstanceEngine =
        software.amazon.awscdk.services.rds.DatabaseInstanceEngine.sqlServerWeb(props.let(SqlServerWebInstanceEngineProps::unwrap)).let(IInstanceEngine::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e882c5bd610ee1428681e37a490ef3089fbfb899387d40e2a45e7ff0db35cb9c")
    public fun sqlServerWeb(props: SqlServerWebInstanceEngineProps.Builder.() -> Unit):
        IInstanceEngine = sqlServerWeb(SqlServerWebInstanceEngineProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseInstanceEngine):
        DatabaseInstanceEngine = DatabaseInstanceEngine(cdkObject)

    internal fun unwrap(wrapped: DatabaseInstanceEngine):
        software.amazon.awscdk.services.rds.DatabaseInstanceEngine = wrapped.cdkObject
  }
}
