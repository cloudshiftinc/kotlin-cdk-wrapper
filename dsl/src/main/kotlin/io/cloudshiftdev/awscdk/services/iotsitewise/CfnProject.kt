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

public open class CfnProject internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnProject,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * A list that contains the IDs of each asset associated with the project.
   */
  public open fun assetIds(): List<String> = unwrap(this).getAssetIds() ?: emptyList()

  /**
   * A list that contains the IDs of each asset associated with the project.
   */
  public open fun assetIds(`value`: List<String>) {
    unwrap(this).setAssetIds(`value`)
  }

  /**
   * A list that contains the IDs of each asset associated with the project.
   */
  public open fun assetIds(vararg `value`: String): Unit = assetIds(`value`.toList())

  /**
   * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the
   * project, which has the following format.
   *
   * `arn:${Partition}:iotsitewise:${Region}:${Account}:project/${ProjectId}`
   */
  public open fun attrProjectArn(): String = unwrap(this).getAttrProjectArn()

  /**
   * The ID of the project.
   */
  public open fun attrProjectId(): String = unwrap(this).getAttrProjectId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the portal in which to create the project.
   */
  public open fun portalId(): String = unwrap(this).getPortalId()

  /**
   * The ID of the portal in which to create the project.
   */
  public open fun portalId(`value`: String) {
    unwrap(this).setPortalId(`value`)
  }

  /**
   * A description for the project.
   */
  public open fun projectDescription(): String? = unwrap(this).getProjectDescription()

  /**
   * A description for the project.
   */
  public open fun projectDescription(`value`: String) {
    unwrap(this).setProjectDescription(`value`)
  }

  /**
   * A friendly name for the project.
   */
  public open fun projectName(): String = unwrap(this).getProjectName()

  /**
   * A friendly name for the project.
   */
  public open fun projectName(`value`: String) {
    unwrap(this).setProjectName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of key-value pairs that contain metadata for the project.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of key-value pairs that contain metadata for the project.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of key-value pairs that contain metadata for the project.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotsitewise.CfnProject].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list that contains the IDs of each asset associated with the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-assetids)
     * @param assetIds A list that contains the IDs of each asset associated with the project. 
     */
    public fun assetIds(assetIds: List<String>)

    /**
     * A list that contains the IDs of each asset associated with the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-assetids)
     * @param assetIds A list that contains the IDs of each asset associated with the project. 
     */
    public fun assetIds(vararg assetIds: String)

    /**
     * The ID of the portal in which to create the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-portalid)
     * @param portalId The ID of the portal in which to create the project. 
     */
    public fun portalId(portalId: String)

    /**
     * A description for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-projectdescription)
     * @param projectDescription A description for the project. 
     */
    public fun projectDescription(projectDescription: String)

    /**
     * A friendly name for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-projectname)
     * @param projectName A friendly name for the project. 
     */
    public fun projectName(projectName: String)

    /**
     * A list of key-value pairs that contain metadata for the project.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-tags)
     * @param tags A list of key-value pairs that contain metadata for the project. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of key-value pairs that contain metadata for the project.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-tags)
     * @param tags A list of key-value pairs that contain metadata for the project. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnProject.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnProject.Builder.create(scope, id)

    /**
     * A list that contains the IDs of each asset associated with the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-assetids)
     * @param assetIds A list that contains the IDs of each asset associated with the project. 
     */
    override fun assetIds(assetIds: List<String>) {
      cdkBuilder.assetIds(assetIds)
    }

    /**
     * A list that contains the IDs of each asset associated with the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-assetids)
     * @param assetIds A list that contains the IDs of each asset associated with the project. 
     */
    override fun assetIds(vararg assetIds: String): Unit = assetIds(assetIds.toList())

    /**
     * The ID of the portal in which to create the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-portalid)
     * @param portalId The ID of the portal in which to create the project. 
     */
    override fun portalId(portalId: String) {
      cdkBuilder.portalId(portalId)
    }

    /**
     * A description for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-projectdescription)
     * @param projectDescription A description for the project. 
     */
    override fun projectDescription(projectDescription: String) {
      cdkBuilder.projectDescription(projectDescription)
    }

    /**
     * A friendly name for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-projectname)
     * @param projectName A friendly name for the project. 
     */
    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    /**
     * A list of key-value pairs that contain metadata for the project.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-tags)
     * @param tags A list of key-value pairs that contain metadata for the project. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of key-value pairs that contain metadata for the project.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-tags)
     * @param tags A list of key-value pairs that contain metadata for the project. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnProject = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotsitewise.CfnProject.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnProject): CfnProject
        = CfnProject(cdkObject)

    internal fun unwrap(wrapped: CfnProject): software.amazon.awscdk.services.iotsitewise.CfnProject
        = wrapped.cdkObject
  }
}
