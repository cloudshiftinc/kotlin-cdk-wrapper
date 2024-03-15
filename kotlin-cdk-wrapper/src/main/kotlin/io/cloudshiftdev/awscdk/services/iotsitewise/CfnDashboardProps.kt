@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotsitewise

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDashboard`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
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
public interface CfnDashboardProps {
  /**
   * The dashboard definition specified in a JSON literal.
   *
   * For detailed information, see [Creating dashboards
   * (CLI)](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html)
   * in the *AWS IoT SiteWise User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-dashboarddefinition)
   */
  public fun dashboardDefinition(): String

  /**
   * A description for the dashboard.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-dashboarddescription)
   */
  public fun dashboardDescription(): String

  /**
   * A friendly name for the dashboard.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-dashboardname)
   */
  public fun dashboardName(): String

  /**
   * The ID of the project in which to create the dashboard.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-projectid)
   */
  public fun projectId(): String? = unwrap(this).getProjectId()

  /**
   * A list of key-value pairs that contain metadata for the dashboard.
   *
   * For more information, see [Tagging your AWS IoT SiteWise
   * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
   * *AWS IoT SiteWise User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDashboardProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dashboardDefinition The dashboard definition specified in a JSON literal. 
     * For detailed information, see [Creating dashboards
     * (CLI)](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html)
     * in the *AWS IoT SiteWise User Guide* .
     */
    public fun dashboardDefinition(dashboardDefinition: String)

    /**
     * @param dashboardDescription A description for the dashboard. 
     */
    public fun dashboardDescription(dashboardDescription: String)

    /**
     * @param dashboardName A friendly name for the dashboard. 
     */
    public fun dashboardName(dashboardName: String)

    /**
     * @param projectId The ID of the project in which to create the dashboard.
     */
    public fun projectId(projectId: String)

    /**
     * @param tags A list of key-value pairs that contain metadata for the dashboard.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs that contain metadata for the dashboard.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnDashboardProps.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnDashboardProps.builder()

    /**
     * @param dashboardDefinition The dashboard definition specified in a JSON literal. 
     * For detailed information, see [Creating dashboards
     * (CLI)](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html)
     * in the *AWS IoT SiteWise User Guide* .
     */
    override fun dashboardDefinition(dashboardDefinition: String) {
      cdkBuilder.dashboardDefinition(dashboardDefinition)
    }

    /**
     * @param dashboardDescription A description for the dashboard. 
     */
    override fun dashboardDescription(dashboardDescription: String) {
      cdkBuilder.dashboardDescription(dashboardDescription)
    }

    /**
     * @param dashboardName A friendly name for the dashboard. 
     */
    override fun dashboardName(dashboardName: String) {
      cdkBuilder.dashboardName(dashboardName)
    }

    /**
     * @param projectId The ID of the project in which to create the dashboard.
     */
    override fun projectId(projectId: String) {
      cdkBuilder.projectId(projectId)
    }

    /**
     * @param tags A list of key-value pairs that contain metadata for the dashboard.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of key-value pairs that contain metadata for the dashboard.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnDashboardProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnDashboardProps,
  ) : CdkObject(cdkObject), CfnDashboardProps {
    /**
     * The dashboard definition specified in a JSON literal.
     *
     * For detailed information, see [Creating dashboards
     * (CLI)](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-dashboarddefinition)
     */
    override fun dashboardDefinition(): String = unwrap(this).getDashboardDefinition()

    /**
     * A description for the dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-dashboarddescription)
     */
    override fun dashboardDescription(): String = unwrap(this).getDashboardDescription()

    /**
     * A friendly name for the dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-dashboardname)
     */
    override fun dashboardName(): String = unwrap(this).getDashboardName()

    /**
     * The ID of the project in which to create the dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-projectid)
     */
    override fun projectId(): String? = unwrap(this).getProjectId()

    /**
     * A list of key-value pairs that contain metadata for the dashboard.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDashboardProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnDashboardProps):
        CfnDashboardProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDashboardProps):
        software.amazon.awscdk.services.iotsitewise.CfnDashboardProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotsitewise.CfnDashboardProps
  }
}
