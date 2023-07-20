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

package cloudshift.awscdk.dsl.services.route53recoverycontrol

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps
import kotlin.String

@CdkDslMarker
public class CfnRoutingControlPropsDsl {
    private val cdkBuilder: CfnRoutingControlProps.Builder = CfnRoutingControlProps.builder()

    public fun clusterArn(clusterArn: String) {
        cdkBuilder.clusterArn(clusterArn)
    }

    public fun controlPanelArn(controlPanelArn: String) {
        cdkBuilder.controlPanelArn(controlPanelArn)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnRoutingControlProps = cdkBuilder.build()
}
