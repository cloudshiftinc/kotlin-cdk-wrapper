@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iotsitewise.CfnDashboardProps

/**
 * Properties for defining a `CfnDashboard`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * CfnDashboardProps cfnDashboardProps = CfnDashboardProps.builder()
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
public class CfnDashboardPropsDsl {
  private val cdkBuilder: CfnDashboardProps.Builder = CfnDashboardProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param dashboardDefinition The dashboard definition specified in a JSON literal. 
   * For detailed information, see [Creating dashboards
   * (CLI)](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html)
   * in the *AWS IoT SiteWise User Guide* .
   */
  public fun dashboardDefinition(dashboardDefinition: String) {
    cdkBuilder.dashboardDefinition(dashboardDefinition)
  }

  /**
   * @param dashboardDescription A description for the dashboard. 
   */
  public fun dashboardDescription(dashboardDescription: String) {
    cdkBuilder.dashboardDescription(dashboardDescription)
  }

  /**
   * @param dashboardName A friendly name for the dashboard. 
   */
  public fun dashboardName(dashboardName: String) {
    cdkBuilder.dashboardName(dashboardName)
  }

  /**
   * @param projectId The ID of the project in which to create the dashboard.
   */
  public fun projectId(projectId: String) {
    cdkBuilder.projectId(projectId)
  }

  /**
   * @param tags A list of key-value pairs that contain metadata for the dashboard.
   * For more information, see [Tagging your AWS IoT SiteWise
   * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
   * *AWS IoT SiteWise User Guide* .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A list of key-value pairs that contain metadata for the dashboard.
   * For more information, see [Tagging your AWS IoT SiteWise
   * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
   * *AWS IoT SiteWise User Guide* .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDashboardProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
