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
import software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControl
import software.constructs.Construct

/**
 * Creates a routing control in Amazon Route 53 Application Recovery Controller.
 *
 * Routing control states are maintained on the highly reliable cluster data plane.
 *
 * To get or update the state of the routing control, you must specify a cluster endpoint, which is
 * an endpoint URL and an AWS Region. For more information, see
 * [Code examples](https://docs.aws.amazon.com/r53recovery/latest/dg/service_code_examples.html) in
 * the Amazon Route 53 Application Recovery Controller Developer Guide.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53recoverycontrol.*;
 * CfnRoutingControl cfnRoutingControl = CfnRoutingControl.Builder.create(this,
 * "MyCfnRoutingControl")
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
public class CfnRoutingControlDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRoutingControl.Builder = CfnRoutingControl.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the cluster that hosts the routing control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-routingcontrol.html#cfn-route53recoverycontrol-routingcontrol-clusterarn)
     *
     * @param clusterArn The Amazon Resource Name (ARN) of the cluster that hosts the routing
     *   control.
     */
    public fun clusterArn(clusterArn: String) {
        cdkBuilder.clusterArn(clusterArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the control panel that includes the routing control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-routingcontrol.html#cfn-route53recoverycontrol-routingcontrol-controlpanelarn)
     *
     * @param controlPanelArn The Amazon Resource Name (ARN) of the control panel that includes the
     *   routing control.
     */
    public fun controlPanelArn(controlPanelArn: String) {
        cdkBuilder.controlPanelArn(controlPanelArn)
    }

    /**
     * The name of the routing control.
     *
     * You can use any non-white space character in the name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-routingcontrol.html#cfn-route53recoverycontrol-routingcontrol-name)
     *
     * @param name The name of the routing control.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnRoutingControl = cdkBuilder.build()
}
