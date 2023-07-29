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

package cloudshift.awscdk.dsl.services.route53recoverycontrol

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps

/**
 * Properties for defining a `CfnRoutingControl`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53recoverycontrol.*;
 * CfnRoutingControlProps cfnRoutingControlProps = CfnRoutingControlProps.builder()
 * .name("name")
 * // the properties below are optional
 * .clusterArn("clusterArn")
 * .controlPanelArn("controlPanelArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-routingcontrol.html)
 */
@CdkDslMarker
public class CfnRoutingControlPropsDsl {
    private val cdkBuilder: CfnRoutingControlProps.Builder = CfnRoutingControlProps.builder()

    /**
     * @param clusterArn The Amazon Resource Name (ARN) of the cluster that hosts the routing
     *   control.
     */
    public fun clusterArn(clusterArn: String) {
        cdkBuilder.clusterArn(clusterArn)
    }

    /**
     * @param controlPanelArn The Amazon Resource Name (ARN) of the control panel that includes the
     *   routing control.
     */
    public fun controlPanelArn(controlPanelArn: String) {
        cdkBuilder.controlPanelArn(controlPanelArn)
    }

    /**
     * @param name The name of the routing control. You can use any non-white space character in the
     *   name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnRoutingControlProps = cdkBuilder.build()
}
