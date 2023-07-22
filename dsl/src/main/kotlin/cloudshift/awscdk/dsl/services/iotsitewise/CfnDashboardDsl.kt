@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iotsitewise.CfnDashboard
import software.constructs.Construct

/**
 * Creates a dashboard in an AWS IoT SiteWise Monitor project.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * CfnDashboard cfnDashboard = CfnDashboard.Builder.create(this, "MyCfnDashboard")
 * .dashboardDefinition("dashboardDefinition")
 * .dashboardDescription("dashboardDescription")
 * .dashboardName("dashboardName")
 * // the properties below are optional
 * .projectId("projectId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html)
 */
@CdkDslMarker
public class CfnDashboardDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDashboard.Builder = CfnDashboard.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The dashboard definition specified in a JSON literal.
   *
   * For detailed information, see [Creating dashboards
   * (CLI)](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html)
   * in the *AWS IoT SiteWise User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-dashboarddefinition)
   * @param dashboardDefinition The dashboard definition specified in a JSON literal. 
   */
  public fun dashboardDefinition(dashboardDefinition: String) {
    cdkBuilder.dashboardDefinition(dashboardDefinition)
  }

  /**
   * A description for the dashboard.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-dashboarddescription)
   * @param dashboardDescription A description for the dashboard. 
   */
  public fun dashboardDescription(dashboardDescription: String) {
    cdkBuilder.dashboardDescription(dashboardDescription)
  }

  /**
   * A friendly name for the dashboard.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-dashboardname)
   * @param dashboardName A friendly name for the dashboard. 
   */
  public fun dashboardName(dashboardName: String) {
    cdkBuilder.dashboardName(dashboardName)
  }

  /**
   * The ID of the project in which to create the dashboard.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-projectid)
   * @param projectId The ID of the project in which to create the dashboard. 
   */
  public fun projectId(projectId: String) {
    cdkBuilder.projectId(projectId)
  }

  /**
   * A list of key-value pairs that contain metadata for the dashboard.
   *
   * For more information, see [Tagging your AWS IoT SiteWise
   * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
   * *AWS IoT SiteWise User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-tags)
   * @param tags A list of key-value pairs that contain metadata for the dashboard. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A list of key-value pairs that contain metadata for the dashboard.
   *
   * For more information, see [Tagging your AWS IoT SiteWise
   * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
   * *AWS IoT SiteWise User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-tags)
   * @param tags A list of key-value pairs that contain metadata for the dashboard. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDashboard {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
