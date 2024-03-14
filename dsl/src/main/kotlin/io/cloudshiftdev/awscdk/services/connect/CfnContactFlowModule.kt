package io.cloudshiftdev.awscdk.services.connect

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

public open class CfnContactFlowModule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.connect.CfnContactFlowModule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * `Ref` returns the Amazon Resource Name (ARN) of the flow module. For example:.
   *
   * `{ "Ref": "myFlowModuleArn" }`
   */
  public open fun attrContactFlowModuleArn(): String = unwrap(this).getAttrContactFlowModuleArn()

  /**
   * The status of the contact flow module.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The content of the flow module.
   */
  public open fun content(): String = unwrap(this).getContent()

  /**
   * The content of the flow module.
   */
  public open fun content(`value`: String) {
    unwrap(this).setContent(`value`)
  }

  /**
   * The description of the flow module.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the flow module.
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
   * The Amazon Resource Name (ARN) of the Amazon Connect instance.
   */
  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Connect instance.
   */
  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  /**
   * The name of the flow module.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the flow module.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The state of the flow module.
   */
  public open fun state(): String? = unwrap(this).getState()

  /**
   * The state of the flow module.
   */
  public open fun state(`value`: String) {
    unwrap(this).setState(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnContactFlowModule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The content of the flow module.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowmodule.html#cfn-connect-contactflowmodule-content)
     * @param content The content of the flow module. 
     */
    public fun content(content: String)

    /**
     * The description of the flow module.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowmodule.html#cfn-connect-contactflowmodule-description)
     * @param description The description of the flow module. 
     */
    public fun description(description: String)

    /**
     * The Amazon Resource Name (ARN) of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowmodule.html#cfn-connect-contactflowmodule-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the Amazon Connect instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * The name of the flow module.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowmodule.html#cfn-connect-contactflowmodule-name)
     * @param name The name of the flow module. 
     */
    public fun name(name: String)

    /**
     * The state of the flow module.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowmodule.html#cfn-connect-contactflowmodule-state)
     * @param state The state of the flow module. 
     */
    public fun state(state: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowmodule.html#cfn-connect-contactflowmodule-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowmodule.html#cfn-connect-contactflowmodule-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnContactFlowModule.Builder =
        software.amazon.awscdk.services.connect.CfnContactFlowModule.Builder.create(scope, id)

    /**
     * The content of the flow module.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowmodule.html#cfn-connect-contactflowmodule-content)
     * @param content The content of the flow module. 
     */
    override fun content(content: String) {
      cdkBuilder.content(content)
    }

    /**
     * The description of the flow module.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowmodule.html#cfn-connect-contactflowmodule-description)
     * @param description The description of the flow module. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowmodule.html#cfn-connect-contactflowmodule-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the Amazon Connect instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The name of the flow module.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowmodule.html#cfn-connect-contactflowmodule-name)
     * @param name The name of the flow module. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The state of the flow module.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowmodule.html#cfn-connect-contactflowmodule-state)
     * @param state The state of the flow module. 
     */
    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowmodule.html#cfn-connect-contactflowmodule-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowmodule.html#cfn-connect-contactflowmodule-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnContactFlowModule =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnContactFlowModule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnContactFlowModule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnContactFlowModule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnContactFlowModule):
        CfnContactFlowModule = CfnContactFlowModule(cdkObject)

    internal fun unwrap(wrapped: CfnContactFlowModule):
        software.amazon.awscdk.services.connect.CfnContactFlowModule = wrapped.cdkObject
  }
}
