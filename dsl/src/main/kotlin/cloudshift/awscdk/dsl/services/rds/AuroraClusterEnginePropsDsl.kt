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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.AuroraClusterEngineProps
import software.amazon.awscdk.services.rds.AuroraEngineVersion

/**
 * Creation properties of the plain Aurora database cluster engine.
 *
 * Used in `DatabaseClusterEngine.aurora`.
 *
 * Example:
 * ```
 * Vpc vpc;
 * DatabaseClusterFromSnapshot.Builder.create(this, "Database")
 * .engine(DatabaseClusterEngine.aurora(AuroraClusterEngineProps.builder().version(AuroraEngineVersion.VER_1_22_2).build()))
 * .writer(ClusterInstance.provisioned("writer"))
 * .vpc(vpc)
 * .snapshotIdentifier("mySnapshot")
 * .build();
 * ```
 */
@CdkDslMarker
public class AuroraClusterEnginePropsDsl {
    private val cdkBuilder: AuroraClusterEngineProps.Builder = AuroraClusterEngineProps.builder()

    /** @param version The version of the Aurora cluster engine. */
    public fun version(version: AuroraEngineVersion) {
        cdkBuilder.version(version)
    }

    public fun build(): AuroraClusterEngineProps = cdkBuilder.build()
}
