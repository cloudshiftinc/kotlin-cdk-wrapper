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

package io.cloudshiftdev.awscdkdsl.services.opsworks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps

/**
 * Properties for defining a `CfnElasticLoadBalancerAttachment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * CfnElasticLoadBalancerAttachmentProps cfnElasticLoadBalancerAttachmentProps =
 * CfnElasticLoadBalancerAttachmentProps.builder()
 * .elasticLoadBalancerName("elasticLoadBalancerName")
 * .layerId("layerId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elasticloadbalancerattachment.html)
 */
@CdkDslMarker
public class CfnElasticLoadBalancerAttachmentPropsDsl {
    private val cdkBuilder: CfnElasticLoadBalancerAttachmentProps.Builder =
        CfnElasticLoadBalancerAttachmentProps.builder()

    /** @param elasticLoadBalancerName The Elastic Load Balancing instance name. */
    public fun elasticLoadBalancerName(elasticLoadBalancerName: String) {
        cdkBuilder.elasticLoadBalancerName(elasticLoadBalancerName)
    }

    /**
     * @param layerId The AWS OpsWorks layer ID to which the Elastic Load Balancing load balancer is
     *   attached.
     */
    public fun layerId(layerId: String) {
        cdkBuilder.layerId(layerId)
    }

    public fun build(): CfnElasticLoadBalancerAttachmentProps = cdkBuilder.build()
}
