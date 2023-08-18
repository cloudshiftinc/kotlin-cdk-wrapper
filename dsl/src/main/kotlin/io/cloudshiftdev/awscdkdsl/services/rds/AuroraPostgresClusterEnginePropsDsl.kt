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
import software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps
import software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion

/**
 * Creation properties of the Aurora PostgreSQL database cluster engine.
 *
 * Used in `DatabaseClusterEngine.auroraPostgres`.
 *
 * Example:
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .engine(DatabaseClusterEngine.auroraPostgres(AuroraPostgresClusterEngineProps.builder().version(AuroraPostgresEngineVersion.VER_15_2).build()))
 * .credentials(Credentials.fromUsername("adminuser",
 * CredentialsFromUsernameOptions.builder().password(SecretValue.unsafePlainText("7959866cacc02c2d243ecfe177464fe6")).build()))
 * .instanceProps(InstanceProps.builder()
 * .instanceType(InstanceType.of(InstanceClass.X2G, InstanceSize.XLARGE))
 * .vpcSubnets(SubnetSelection.builder().subnetType(SubnetType.PUBLIC).build())
 * .vpc(vpc)
 * .build())
 * .storageType(DBClusterStorageType.AURORA_IOPT1)
 * .build();
 * ```
 */
@CdkDslMarker
public class AuroraPostgresClusterEnginePropsDsl {
    private val cdkBuilder: AuroraPostgresClusterEngineProps.Builder =
        AuroraPostgresClusterEngineProps.builder()

    /** @param version The version of the Aurora PostgreSQL cluster engine. */
    public fun version(version: AuroraPostgresEngineVersion) {
        cdkBuilder.version(version)
    }

    public fun build(): AuroraPostgresClusterEngineProps = cdkBuilder.build()
}
