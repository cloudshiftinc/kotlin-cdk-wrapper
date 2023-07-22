@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.CfnDashboardProps

@CdkDslMarker
public class CfnDashboardPropsDsl {
  private val cdkBuilder: CfnDashboardProps.Builder = CfnDashboardProps.builder()

  /**
   * @param dashboardBody The detailed information about the dashboard in JSON format, including the
   * widgets to include and their location on the dashboard. 
   *
   *
   * For more information about the syntax, see [Dashboard Body Structure and
   * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html)
   * .
   */
  public fun dashboardBody(dashboardBody: String) {
    cdkBuilder.dashboardBody(dashboardBody)
  }

  /**
   * @param dashboardName The name of the dashboard.
   * The name must be between 1 and 255 characters. If you do not specify a name, one will be
   * generated automatically.
   */
  public fun dashboardName(dashboardName: String) {
    cdkBuilder.dashboardName(dashboardName)
  }

  public fun build(): CfnDashboardProps = cdkBuilder.build()
}
