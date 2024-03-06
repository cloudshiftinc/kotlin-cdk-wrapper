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

package io.cloudshiftdev.awscdkdsl.services.msk

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.msk.CfnReplicator

/**
 * Details of an Amazon MSK cluster.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * AmazonMskClusterProperty amazonMskClusterProperty = AmazonMskClusterProperty.builder()
 * .mskClusterArn("mskClusterArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-amazonmskcluster.html)
 */
@CdkDslMarker
public class CfnReplicatorAmazonMskClusterPropertyDsl {
    private val cdkBuilder: CfnReplicator.AmazonMskClusterProperty.Builder =
        CfnReplicator.AmazonMskClusterProperty.builder()

    /** @param mskClusterArn The ARN of an Amazon MSK cluster. */
    public fun mskClusterArn(mskClusterArn: String) {
        cdkBuilder.mskClusterArn(mskClusterArn)
    }

    public fun build(): CfnReplicator.AmazonMskClusterProperty = cdkBuilder.build()
}
