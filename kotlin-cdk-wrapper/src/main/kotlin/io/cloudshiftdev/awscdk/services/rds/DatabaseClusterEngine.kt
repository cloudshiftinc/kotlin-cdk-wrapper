@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A database cluster engine.
 *
 * Provides mapping to the serverless application
 * used for secret rotation.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder().version(AuroraMysqlEngineVersion.VER_3_01_0).build()))
 * .credentials(Credentials.fromGeneratedSecret("clusteradmin")) // Optional - will default to
 * 'admin' username and generated password
 * .writer(ClusterInstance.provisioned("writer", ProvisionedClusterInstanceProps.builder()
 * .publiclyAccessible(false)
 * .build()))
 * .readers(List.of(ClusterInstance.provisioned("reader1",
 * ProvisionedClusterInstanceProps.builder().promotionTier(1).build()),
 * ClusterInstance.serverlessV2("reader2")))
 * .vpcSubnets(SubnetSelection.builder()
 * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
 * .build())
 * .vpc(vpc)
 * .build();
 * ```
 */
public open class DatabaseClusterEngine(
  cdkObject: software.amazon.awscdk.services.rds.DatabaseClusterEngine,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.rds.DatabaseClusterEngine()
  )

  public companion object {
    public val AURORA: IClusterEngine =
        IClusterEngine.wrap(software.amazon.awscdk.services.rds.DatabaseClusterEngine.AURORA)

    public val AURORA_MYSQL: IClusterEngine =
        IClusterEngine.wrap(software.amazon.awscdk.services.rds.DatabaseClusterEngine.AURORA_MYSQL)

    public val AURORA_POSTGRESQL: IClusterEngine =
        IClusterEngine.wrap(software.amazon.awscdk.services.rds.DatabaseClusterEngine.AURORA_POSTGRESQL)

    public fun aurora(props: AuroraClusterEngineProps): IClusterEngine =
        software.amazon.awscdk.services.rds.DatabaseClusterEngine.aurora(props.let(AuroraClusterEngineProps.Companion::unwrap)).let(IClusterEngine::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1f02e1d4bd833b2ddacfd2f40a683d8395cb34c6d2e7af327a81b567a376132")
    public fun aurora(props: AuroraClusterEngineProps.Builder.() -> Unit): IClusterEngine =
        aurora(AuroraClusterEngineProps(props))

    public fun auroraMysql(props: AuroraMysqlClusterEngineProps): IClusterEngine =
        software.amazon.awscdk.services.rds.DatabaseClusterEngine.auroraMysql(props.let(AuroraMysqlClusterEngineProps.Companion::unwrap)).let(IClusterEngine::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3d3cf57fa9c68e6a049cdc66547ec418a839675b4b45a864daca9a94e527d1d")
    public fun auroraMysql(props: AuroraMysqlClusterEngineProps.Builder.() -> Unit): IClusterEngine
        = auroraMysql(AuroraMysqlClusterEngineProps(props))

    public fun auroraPostgres(props: AuroraPostgresClusterEngineProps): IClusterEngine =
        software.amazon.awscdk.services.rds.DatabaseClusterEngine.auroraPostgres(props.let(AuroraPostgresClusterEngineProps.Companion::unwrap)).let(IClusterEngine::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("355efede4396c045c525bfc34e2572473047b19d816455428266fd105ba8d14e")
    public fun auroraPostgres(props: AuroraPostgresClusterEngineProps.Builder.() -> Unit):
        IClusterEngine = auroraPostgres(AuroraPostgresClusterEngineProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseClusterEngine):
        DatabaseClusterEngine = DatabaseClusterEngine(cdkObject)

    internal fun unwrap(wrapped: DatabaseClusterEngine):
        software.amazon.awscdk.services.rds.DatabaseClusterEngine = wrapped.cdkObject as
        software.amazon.awscdk.services.rds.DatabaseClusterEngine
  }
}
