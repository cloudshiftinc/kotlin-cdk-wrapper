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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnSpotFleet
import kotlin.String

@CdkDslMarker
public class CfnSpotFleetClassicLoadBalancerPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.ClassicLoadBalancerProperty.Builder =
        CfnSpotFleet.ClassicLoadBalancerProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnSpotFleet.ClassicLoadBalancerProperty = cdkBuilder.build()
}
