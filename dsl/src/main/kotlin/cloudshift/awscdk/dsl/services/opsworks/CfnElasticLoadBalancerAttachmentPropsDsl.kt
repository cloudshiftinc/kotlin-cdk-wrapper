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
import software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps
import kotlin.String

@CdkDslMarker
public class CfnElasticLoadBalancerAttachmentPropsDsl {
    private val cdkBuilder: CfnElasticLoadBalancerAttachmentProps.Builder =
        CfnElasticLoadBalancerAttachmentProps.builder()

    public fun elasticLoadBalancerName(elasticLoadBalancerName: String) {
        cdkBuilder.elasticLoadBalancerName(elasticLoadBalancerName)
    }

    public fun layerId(layerId: String) {
        cdkBuilder.layerId(layerId)
    }

    public fun build(): CfnElasticLoadBalancerAttachmentProps = cdkBuilder.build()
}
