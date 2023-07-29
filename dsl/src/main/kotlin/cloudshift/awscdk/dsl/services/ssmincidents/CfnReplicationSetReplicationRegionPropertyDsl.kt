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

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSet

/**
 * The `ReplicationRegion` property type specifies the Region and KMS key to add to the replication
 * set.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmincidents.*;
 * ReplicationRegionProperty replicationRegionProperty = ReplicationRegionProperty.builder()
 * .regionConfiguration(RegionConfigurationProperty.builder()
 * .sseKmsKeyId("sseKmsKeyId")
 * .build())
 * .regionName("regionName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-replicationset-replicationregion.html)
 */
@CdkDslMarker
public class CfnReplicationSetReplicationRegionPropertyDsl {
    private val cdkBuilder: CfnReplicationSet.ReplicationRegionProperty.Builder =
        CfnReplicationSet.ReplicationRegionProperty.builder()

    /** @param regionConfiguration Specifies the Region configuration. */
    public fun regionConfiguration(regionConfiguration: IResolvable) {
        cdkBuilder.regionConfiguration(regionConfiguration)
    }

    /** @param regionConfiguration Specifies the Region configuration. */
    public fun regionConfiguration(
        regionConfiguration: CfnReplicationSet.RegionConfigurationProperty
    ) {
        cdkBuilder.regionConfiguration(regionConfiguration)
    }

    /** @param regionName Specifies the region name to add to the replication set. */
    public fun regionName(regionName: String) {
        cdkBuilder.regionName(regionName)
    }

    public fun build(): CfnReplicationSet.ReplicationRegionProperty = cdkBuilder.build()
}
