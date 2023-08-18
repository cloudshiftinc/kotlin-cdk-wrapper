@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps
import software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion

/**
 * Creation properties of the Aurora MySQL database cluster engine.
 *
 * Used in `DatabaseClusterEngine.auroraMysql`.
 *
 * Example:
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder().version(AuroraMysqlEngineVersion.VER_2_08_1).build()))
 * .writer(ClusterInstance.provisioned("writer", ProvisionedClusterInstanceProps.builder()
 * .instanceType(InstanceType.of(InstanceClass.R6G, InstanceSize.XLARGE4))
 * .build()))
 * .serverlessV2MinCapacity(6.5)
 * .serverlessV2MaxCapacity(64)
 * .readers(List.of(ClusterInstance.serverlessV2("reader1",
 * ServerlessV2ClusterInstanceProps.builder().scaleWithWriter(true).build()),
 * ClusterInstance.serverlessV2("reader2")))
 * .vpc(vpc)
 * .build();
 * ```
 */
@CdkDslMarker
public class AuroraMysqlClusterEnginePropsDsl {
    private val cdkBuilder: AuroraMysqlClusterEngineProps.Builder =
        AuroraMysqlClusterEngineProps.builder()

    /** @param version The version of the Aurora MySQL cluster engine. */
    public fun version(version: AuroraMysqlEngineVersion) {
        cdkBuilder.version(version)
    }

    public fun build(): AuroraMysqlClusterEngineProps = cdkBuilder.build()
}
