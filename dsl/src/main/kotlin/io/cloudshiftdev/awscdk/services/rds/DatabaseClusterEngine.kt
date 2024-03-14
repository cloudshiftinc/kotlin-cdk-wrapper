package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class DatabaseClusterEngine internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.DatabaseClusterEngine,
) : CdkObject(cdkObject) {
  public companion object {
    public val AURORA: IClusterEngine =
        IClusterEngine.wrap(software.amazon.awscdk.services.rds.DatabaseClusterEngine.AURORA)

    public val AURORA_MYSQL: IClusterEngine =
        IClusterEngine.wrap(software.amazon.awscdk.services.rds.DatabaseClusterEngine.AURORA_MYSQL)

    public val AURORA_POSTGRESQL: IClusterEngine =
        IClusterEngine.wrap(software.amazon.awscdk.services.rds.DatabaseClusterEngine.AURORA_POSTGRESQL)

    public fun aurora(props: AuroraClusterEngineProps): IClusterEngine =
        software.amazon.awscdk.services.rds.DatabaseClusterEngine.aurora(props.let(AuroraClusterEngineProps::unwrap)).let(IClusterEngine::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1f02e1d4bd833b2ddacfd2f40a683d8395cb34c6d2e7af327a81b567a376132")
    public fun aurora(props: AuroraClusterEngineProps.Builder.() -> Unit): IClusterEngine =
        aurora(AuroraClusterEngineProps(props))

    public fun auroraMysql(props: AuroraMysqlClusterEngineProps): IClusterEngine =
        software.amazon.awscdk.services.rds.DatabaseClusterEngine.auroraMysql(props.let(AuroraMysqlClusterEngineProps::unwrap)).let(IClusterEngine::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3d3cf57fa9c68e6a049cdc66547ec418a839675b4b45a864daca9a94e527d1d")
    public fun auroraMysql(props: AuroraMysqlClusterEngineProps.Builder.() -> Unit): IClusterEngine
        = auroraMysql(AuroraMysqlClusterEngineProps(props))

    public fun auroraPostgres(props: AuroraPostgresClusterEngineProps): IClusterEngine =
        software.amazon.awscdk.services.rds.DatabaseClusterEngine.auroraPostgres(props.let(AuroraPostgresClusterEngineProps::unwrap)).let(IClusterEngine::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("355efede4396c045c525bfc34e2572473047b19d816455428266fd105ba8d14e")
    public fun auroraPostgres(props: AuroraPostgresClusterEngineProps.Builder.() -> Unit):
        IClusterEngine = auroraPostgres(AuroraPostgresClusterEngineProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseClusterEngine):
        DatabaseClusterEngine = DatabaseClusterEngine(cdkObject)

    internal fun unwrap(wrapped: DatabaseClusterEngine):
        software.amazon.awscdk.services.rds.DatabaseClusterEngine = wrapped.cdkObject
  }
}
