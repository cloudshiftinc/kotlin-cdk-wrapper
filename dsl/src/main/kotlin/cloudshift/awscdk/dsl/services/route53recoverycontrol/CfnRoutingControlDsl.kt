@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoverycontrol

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControl
import software.constructs.Construct

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
   * @param clusterArn The Amazon Resource Name (ARN) of the cluster that hosts the routing control.
   * 
   */
  public fun clusterArn(clusterArn: String) {
    cdkBuilder.clusterArn(clusterArn)
  }

  /**
   * The Amazon Resource Name (ARN) of the control panel that includes the routing control.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-routingcontrol.html#cfn-route53recoverycontrol-routingcontrol-controlpanelarn)
   * @param controlPanelArn The Amazon Resource Name (ARN) of the control panel that includes the
   * routing control. 
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
   * @param name The name of the routing control. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnRoutingControl = cdkBuilder.build()
}
