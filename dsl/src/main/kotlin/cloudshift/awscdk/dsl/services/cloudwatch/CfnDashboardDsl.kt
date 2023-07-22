@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.CfnDashboard
import software.constructs.Construct

@CdkDslMarker
public class CfnDashboardDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDashboard.Builder = CfnDashboard.Builder.create(scope, id)

  /**
   * The detailed information about the dashboard in JSON format, including the widgets to include
   * and their location on the dashboard.
   *
   *
   *
   * For more information about the syntax, see [Dashboard Body Structure and
   * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardbody)
   * @param dashboardBody The detailed information about the dashboard in JSON format, including the
   * widgets to include and their location on the dashboard. 
   */
  public fun dashboardBody(dashboardBody: String) {
    cdkBuilder.dashboardBody(dashboardBody)
  }

  /**
   * The name of the dashboard.
   *
   * The name must be between 1 and 255 characters. If you do not specify a name, one will be
   * generated automatically.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardname)
   * @param dashboardName The name of the dashboard. 
   */
  public fun dashboardName(dashboardName: String) {
    cdkBuilder.dashboardName(dashboardName)
  }

  public fun build(): CfnDashboard = cdkBuilder.build()
}
