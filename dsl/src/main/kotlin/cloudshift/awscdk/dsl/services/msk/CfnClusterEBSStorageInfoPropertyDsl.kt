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

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * Contains information about the EBS storage volumes attached to the broker nodes.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * EBSStorageInfoProperty eBSStorageInfoProperty = EBSStorageInfoProperty.builder()
 * .provisionedThroughput(ProvisionedThroughputProperty.builder()
 * .enabled(false)
 * .volumeThroughput(123)
 * .build())
 * .volumeSize(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-ebsstorageinfo.html)
 */
@CdkDslMarker
public class CfnClusterEBSStorageInfoPropertyDsl {
    private val cdkBuilder: CfnCluster.EBSStorageInfoProperty.Builder =
        CfnCluster.EBSStorageInfoProperty.builder()

    /** @param provisionedThroughput EBS volume provisioned throughput information. */
    public fun provisionedThroughput(provisionedThroughput: IResolvable) {
        cdkBuilder.provisionedThroughput(provisionedThroughput)
    }

    /** @param provisionedThroughput EBS volume provisioned throughput information. */
    public fun provisionedThroughput(
        provisionedThroughput: CfnCluster.ProvisionedThroughputProperty
    ) {
        cdkBuilder.provisionedThroughput(provisionedThroughput)
    }

    /**
     * @param volumeSize The size in GiB of the EBS volume for the data drive on each broker node.
     */
    public fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
    }

    public fun build(): CfnCluster.EBSStorageInfoProperty = cdkBuilder.build()
}
