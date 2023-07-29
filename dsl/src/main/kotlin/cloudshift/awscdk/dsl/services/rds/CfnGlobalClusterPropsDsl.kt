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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnGlobalClusterProps

/**
 * Properties for defining a `CfnGlobalCluster`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * CfnGlobalClusterProps cfnGlobalClusterProps = CfnGlobalClusterProps.builder()
 * .deletionProtection(false)
 * .engine("engine")
 * .engineVersion("engineVersion")
 * .globalClusterIdentifier("globalClusterIdentifier")
 * .sourceDbClusterIdentifier("sourceDbClusterIdentifier")
 * .storageEncrypted(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html)
 */
@CdkDslMarker
public class CfnGlobalClusterPropsDsl {
    private val cdkBuilder: CfnGlobalClusterProps.Builder = CfnGlobalClusterProps.builder()

    /**
     * @param deletionProtection Specifies whether to enable deletion protection for the new global
     *   database cluster. The global database can't be deleted when deletion protection is enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param deletionProtection Specifies whether to enable deletion protection for the new global
     *   database cluster. The global database can't be deleted when deletion protection is enabled.
     */
    public fun deletionProtection(deletionProtection: IResolvable) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param engine The database engine to use for this global database cluster. Valid Values:
     *   `aurora-mysql | aurora-postgresql`
     *
     * Constraints:
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     *   uses the engine of the source DB cluster.
     */
    public fun engine(engine: String) {
        cdkBuilder.engine(engine)
    }

    /**
     * @param engineVersion The engine version to use for this global database cluster. Constraints:
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     *   uses the engine version of the source DB cluster.
     */
    public fun engineVersion(engineVersion: String) {
        cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param globalClusterIdentifier The cluster identifier for this global database cluster. This
     *   parameter is stored as a lowercase string.
     */
    public fun globalClusterIdentifier(globalClusterIdentifier: String) {
        cdkBuilder.globalClusterIdentifier(globalClusterIdentifier)
    }

    /**
     * @param sourceDbClusterIdentifier The Amazon Resource Name (ARN) to use as the primary cluster
     *   of the global database. If you provide a value for this parameter, don't specify values for
     *   the following settings because Amazon Aurora uses the values from the specified source DB
     *   cluster:
     * * `DatabaseName`
     * * `Engine`
     * * `EngineVersion`
     * * `StorageEncrypted`
     */
    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
        cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
    }

    /**
     * @param storageEncrypted Specifies whether to enable storage encryption for the new global
     *   database cluster. Constraints:
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     *   uses the setting from the source DB cluster.
     */
    public fun storageEncrypted(storageEncrypted: Boolean) {
        cdkBuilder.storageEncrypted(storageEncrypted)
    }

    /**
     * @param storageEncrypted Specifies whether to enable storage encryption for the new global
     *   database cluster. Constraints:
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     *   uses the setting from the source DB cluster.
     */
    public fun storageEncrypted(storageEncrypted: IResolvable) {
        cdkBuilder.storageEncrypted(storageEncrypted)
    }

    public fun build(): CfnGlobalClusterProps = cdkBuilder.build()
}
