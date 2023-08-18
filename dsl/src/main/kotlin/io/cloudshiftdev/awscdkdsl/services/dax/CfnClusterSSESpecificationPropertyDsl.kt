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

package io.cloudshiftdev.awscdkdsl.services.dax

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dax.CfnCluster

/**
 * Represents the settings used to enable server-side encryption.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dax.*;
 * SSESpecificationProperty sSESpecificationProperty = SSESpecificationProperty.builder()
 * .sseEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dax-cluster-ssespecification.html)
 */
@CdkDslMarker
public class CfnClusterSSESpecificationPropertyDsl {
    private val cdkBuilder: CfnCluster.SSESpecificationProperty.Builder =
        CfnCluster.SSESpecificationProperty.builder()

    /**
     * @param sseEnabled Indicates whether server-side encryption is enabled (true) or disabled
     *   (false) on the cluster.
     */
    public fun sseEnabled(sseEnabled: Boolean) {
        cdkBuilder.sseEnabled(sseEnabled)
    }

    /**
     * @param sseEnabled Indicates whether server-side encryption is enabled (true) or disabled
     *   (false) on the cluster.
     */
    public fun sseEnabled(sseEnabled: IResolvable) {
        cdkBuilder.sseEnabled(sseEnabled)
    }

    public fun build(): CfnCluster.SSESpecificationProperty = cdkBuilder.build()
}
