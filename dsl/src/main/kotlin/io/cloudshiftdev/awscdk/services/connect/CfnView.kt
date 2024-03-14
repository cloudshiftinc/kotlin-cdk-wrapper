package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnView internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.connect.CfnView,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * A list of actions possible from the view.
   */
  public open fun actions(): List<String> = unwrap(this).getActions()

  /**
   * A list of actions possible from the view.
   */
  public open fun actions(`value`: List<String>) {
    unwrap(this).setActions(`value`)
  }

  /**
   * A list of actions possible from the view.
   */
  public open fun actions(vararg `value`: String): Unit = actions(`value`.toList())

  /**
   * The unqualified Amazon Resource Name (ARN) of the view.
   *
   * For example:
   *
   * `arn:&lt;partition&gt;:connect:&lt;region&gt;:&lt;accountId&gt;:instance/00000000-0000-0000-0000-000000000000/view/00000000-0000-0000-0000-000000000000`
   */
  public open fun attrViewArn(): String = unwrap(this).getAttrViewArn()

  /**
   * Indicates the checksum value of the latest published view content.
   */
  public open fun attrViewContentSha256(): String = unwrap(this).getAttrViewContentSha256()

  /**
   * The identifier of the view.
   */
  public open fun attrViewId(): String = unwrap(this).getAttrViewId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the view.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the view.
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
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  /**
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  /**
   * The name of the view.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the view.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The tags associated with the view resource (not specific to view version).
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags associated with the view resource (not specific to view version).
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags associated with the view resource (not specific to view version).
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The view template representing the structure of the view.
   */
  public open fun template(): Any = unwrap(this).getTemplate()

  /**
   * The view template representing the structure of the view.
   */
  public open fun template(`value`: Any) {
    unwrap(this).setTemplate(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnView].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of actions possible from the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-actions)
     * @param actions A list of actions possible from the view. 
     */
    public fun actions(actions: List<String>)

    /**
     * A list of actions possible from the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-actions)
     * @param actions A list of actions possible from the view. 
     */
    public fun actions(vararg actions: String)

    /**
     * The description of the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-description)
     * @param description The description of the view. 
     */
    public fun description(description: String)

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * The name of the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-name)
     * @param name The name of the view. 
     */
    public fun name(name: String)

    /**
     * The tags associated with the view resource (not specific to view version).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-tags)
     * @param tags The tags associated with the view resource (not specific to view version). 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags associated with the view resource (not specific to view version).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-tags)
     * @param tags The tags associated with the view resource (not specific to view version). 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The view template representing the structure of the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-template)
     * @param template The view template representing the structure of the view. 
     */
    public fun template(template: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnView.Builder =
        software.amazon.awscdk.services.connect.CfnView.Builder.create(scope, id)

    /**
     * A list of actions possible from the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-actions)
     * @param actions A list of actions possible from the view. 
     */
    override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

    /**
     * A list of actions possible from the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-actions)
     * @param actions A list of actions possible from the view. 
     */
    override fun actions(vararg actions: String): Unit = actions(actions.toList())

    /**
     * The description of the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-description)
     * @param description The description of the view. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The name of the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-name)
     * @param name The name of the view. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags associated with the view resource (not specific to view version).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-tags)
     * @param tags The tags associated with the view resource (not specific to view version). 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags associated with the view resource (not specific to view version).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-tags)
     * @param tags The tags associated with the view resource (not specific to view version). 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The view template representing the structure of the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-template)
     * @param template The view template representing the structure of the view. 
     */
    override fun template(template: Any) {
      cdkBuilder.template(template)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnView = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnView.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnView {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnView(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnView): CfnView =
        CfnView(cdkObject)

    internal fun unwrap(wrapped: CfnView): software.amazon.awscdk.services.connect.CfnView =
        wrapped.cdkObject
  }
}
