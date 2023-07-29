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

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment
import software.constructs.Construct

/**
 * Attaches an Elastic Load Balancing load balancer to an AWS OpsWorks layer that you specify.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * CfnElasticLoadBalancerAttachment cfnElasticLoadBalancerAttachment =
 * CfnElasticLoadBalancerAttachment.Builder.create(this, "MyCfnElasticLoadBalancerAttachment")
 * .elasticLoadBalancerName("elasticLoadBalancerName")
 * .layerId("layerId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elasticloadbalancerattachment.html)
 */
@CdkDslMarker
public class CfnElasticLoadBalancerAttachmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnElasticLoadBalancerAttachment.Builder =
        CfnElasticLoadBalancerAttachment.Builder.create(scope, id)

    /**
     * The Elastic Load Balancing instance name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elasticloadbalancerattachment.html#cfn-opsworks-elasticloadbalancerattachment-elasticloadbalancername)
     *
     * @param elasticLoadBalancerName The Elastic Load Balancing instance name.
     */
    public fun elasticLoadBalancerName(elasticLoadBalancerName: String) {
        cdkBuilder.elasticLoadBalancerName(elasticLoadBalancerName)
    }

    /**
     * The AWS OpsWorks layer ID to which the Elastic Load Balancing load balancer is attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elasticloadbalancerattachment.html#cfn-opsworks-elasticloadbalancerattachment-layerid)
     *
     * @param layerId The AWS OpsWorks layer ID to which the Elastic Load Balancing load balancer is
     *   attached.
     */
    public fun layerId(layerId: String) {
        cdkBuilder.layerId(layerId)
    }

    public fun build(): CfnElasticLoadBalancerAttachment = cdkBuilder.build()
}
