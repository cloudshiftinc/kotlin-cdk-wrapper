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
import software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControl
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnRoutingControlDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRoutingControl.Builder = CfnRoutingControl.Builder.create(scope, id)

    public fun clusterArn(clusterArn: String) {
        cdkBuilder.clusterArn(clusterArn)
    }

    public fun controlPanelArn(controlPanelArn: String) {
        cdkBuilder.controlPanelArn(controlPanelArn)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnRoutingControl = cdkBuilder.build()
}
