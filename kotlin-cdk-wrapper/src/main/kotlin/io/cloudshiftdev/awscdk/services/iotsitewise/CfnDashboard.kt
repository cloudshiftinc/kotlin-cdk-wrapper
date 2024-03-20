@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotsitewise

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a dashboard in an AWS IoT SiteWise Monitor project.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
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
public open class CfnDashboard internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnDashboard,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDashboardProps,
  ) :
      this(software.amazon.awscdk.services.iotsitewise.CfnDashboard(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDashboardProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDashboardProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDashboardProps(props)
  )

  /**
   * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the
   * dashboard, which has the following format.
   *
   * `arn:${Partition}:iotsitewise:${Region}:${Account}:dashboard/${DashboardId}`
   */
  public open fun attrDashboardArn(): String = unwrap(this).getAttrDashboardArn()

  /**
   * The ID of the dashboard.
   */
  public open fun attrDashboardId(): String = unwrap(this).getAttrDashboardId()

  /**
   * The dashboard definition specified in a JSON literal.
   */
  public open fun dashboardDefinition(): String = unwrap(this).getDashboardDefinition()

  /**
   * The dashboard definition specified in a JSON literal.
   */
  public open fun dashboardDefinition(`value`: String) {
    unwrap(this).setDashboardDefinition(`value`)
  }

  /**
   * A description for the dashboard.
   */
  public open fun dashboardDescription(): String = unwrap(this).getDashboardDescription()

  /**
   * A description for the dashboard.
   */
  public open fun dashboardDescription(`value`: String) {
    unwrap(this).setDashboardDescription(`value`)
  }

  /**
   * A friendly name for the dashboard.
   */
  public open fun dashboardName(): String = unwrap(this).getDashboardName()

  /**
   * A friendly name for the dashboard.
   */
  public open fun dashboardName(`value`: String) {
    unwrap(this).setDashboardName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the project in which to create the dashboard.
   */
  public open fun projectId(): String? = unwrap(this).getProjectId()

  /**
   * The ID of the project in which to create the dashboard.
   */
  public open fun projectId(`value`: String) {
    unwrap(this).setProjectId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of key-value pairs that contain metadata for the dashboard.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of key-value pairs that contain metadata for the dashboard.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of key-value pairs that contain metadata for the dashboard.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotsitewise.CfnDashboard].
   */
  @CdkDslMarker
  public interface Builder {
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
    public fun dashboardDefinition(dashboardDefinition: String)

    /**
     * A description for the dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-dashboarddescription)
     * @param dashboardDescription A description for the dashboard. 
     */
    public fun dashboardDescription(dashboardDescription: String)

    /**
     * A friendly name for the dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-dashboardname)
     * @param dashboardName A friendly name for the dashboard. 
     */
    public fun dashboardName(dashboardName: String)

    /**
     * The ID of the project in which to create the dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-projectid)
     * @param projectId The ID of the project in which to create the dashboard. 
     */
    public fun projectId(projectId: String)

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
    public fun tags(tags: List<CfnTag>)

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
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnDashboard.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnDashboard.Builder.create(scope, id)

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
    override fun dashboardDefinition(dashboardDefinition: String) {
      cdkBuilder.dashboardDefinition(dashboardDefinition)
    }

    /**
     * A description for the dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-dashboarddescription)
     * @param dashboardDescription A description for the dashboard. 
     */
    override fun dashboardDescription(dashboardDescription: String) {
      cdkBuilder.dashboardDescription(dashboardDescription)
    }

    /**
     * A friendly name for the dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-dashboardname)
     * @param dashboardName A friendly name for the dashboard. 
     */
    override fun dashboardName(dashboardName: String) {
      cdkBuilder.dashboardName(dashboardName)
    }

    /**
     * The ID of the project in which to create the dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html#cfn-iotsitewise-dashboard-projectid)
     * @param projectId The ID of the project in which to create the dashboard. 
     */
    override fun projectId(projectId: String) {
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
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnDashboard =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotsitewise.CfnDashboard.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDashboard {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDashboard(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnDashboard):
        CfnDashboard = CfnDashboard(cdkObject)

    internal fun unwrap(wrapped: CfnDashboard):
        software.amazon.awscdk.services.iotsitewise.CfnDashboard = wrapped.cdkObject
  }
}
