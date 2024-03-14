package io.cloudshiftdev.awscdk.services.iottwinmaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWorkspace internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnWorkspace,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The workspace ARN.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time the workspace was created.
   */
  public open fun attrCreationDateTime(): String = unwrap(this).getAttrCreationDateTime()

  /**
   * The date and time the workspace was updated.
   */
  public open fun attrUpdateDateTime(): String = unwrap(this).getAttrUpdateDateTime()

  /**
   * The description of the workspace.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the workspace.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * The ARN of the execution role associated with the workspace.
   */
  public open fun role(): String = unwrap(this).getRole()

  /**
   * The ARN of the execution role associated with the workspace.
   */
  public open fun role(`value`: String) {
    unwrap(this).setRole(`value`)
  }

  /**
   * The ARN of the S3 bucket where resources associated with the workspace are stored.
   */
  public open fun s3Location(): String = unwrap(this).getS3Location()

  /**
   * The ARN of the S3 bucket where resources associated with the workspace are stored.
   */
  public open fun s3Location(`value`: String) {
    unwrap(this).setS3Location(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata that you can use to manage the workspace.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * Metadata that you can use to manage the workspace.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The ID of the workspace.
   */
  public open fun workspaceId(): String = unwrap(this).getWorkspaceId()

  /**
   * The ID of the workspace.
   */
  public open fun workspaceId(`value`: String) {
    unwrap(this).setWorkspaceId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iottwinmaker.CfnWorkspace].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-description)
     * @param description The description of the workspace. 
     */
    public fun description(description: String)

    /**
     * The ARN of the execution role associated with the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-role)
     * @param role The ARN of the execution role associated with the workspace. 
     */
    public fun role(role: String)

    /**
     * The ARN of the S3 bucket where resources associated with the workspace are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-s3location)
     * @param s3Location The ARN of the S3 bucket where resources associated with the workspace are
     * stored. 
     */
    public fun s3Location(s3Location: String)

    /**
     * Metadata that you can use to manage the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-tags)
     * @param tags Metadata that you can use to manage the workspace. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The ID of the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-workspaceid)
     * @param workspaceId The ID of the workspace. 
     */
    public fun workspaceId(workspaceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iottwinmaker.CfnWorkspace.Builder =
        software.amazon.awscdk.services.iottwinmaker.CfnWorkspace.Builder.create(scope, id)

    /**
     * The description of the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-description)
     * @param description The description of the workspace. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ARN of the execution role associated with the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-role)
     * @param role The ARN of the execution role associated with the workspace. 
     */
    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    /**
     * The ARN of the S3 bucket where resources associated with the workspace are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-s3location)
     * @param s3Location The ARN of the S3 bucket where resources associated with the workspace are
     * stored. 
     */
    override fun s3Location(s3Location: String) {
      cdkBuilder.s3Location(s3Location)
    }

    /**
     * Metadata that you can use to manage the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-tags)
     * @param tags Metadata that you can use to manage the workspace. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The ID of the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-workspaceid)
     * @param workspaceId The ID of the workspace. 
     */
    override fun workspaceId(workspaceId: String) {
      cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnWorkspace =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkspace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkspace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnWorkspace):
        CfnWorkspace = CfnWorkspace(cdkObject)

    internal fun unwrap(wrapped: CfnWorkspace):
        software.amazon.awscdk.services.iottwinmaker.CfnWorkspace = wrapped.cdkObject
  }
}
