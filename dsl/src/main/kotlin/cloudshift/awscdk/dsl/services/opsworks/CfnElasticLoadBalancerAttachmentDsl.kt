@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnElasticLoadBalancerAttachmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnElasticLoadBalancerAttachment.Builder =
        CfnElasticLoadBalancerAttachment.Builder.create(scope, id)

    public fun elasticLoadBalancerName(elasticLoadBalancerName: String) {
        cdkBuilder.elasticLoadBalancerName(elasticLoadBalancerName)
    }

    public fun layerId(layerId: String) {
        cdkBuilder.layerId(layerId)
    }

    public fun build(): CfnElasticLoadBalancerAttachment = cdkBuilder.build()
}
