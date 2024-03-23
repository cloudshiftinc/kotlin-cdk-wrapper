@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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

/**
 * Specifies a flow for an Amazon Connect instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnContactFlow cfnContactFlow = CfnContactFlow.Builder.create(this, "MyCfnContactFlow")
 * .content("content")
 * .instanceArn("instanceArn")
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .state("state")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html)
 */
public open class CfnContactFlow(
  cdkObject: software.amazon.awscdk.services.connect.CfnContactFlow,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnContactFlowProps,
  ) :
      this(software.amazon.awscdk.services.connect.CfnContactFlow(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnContactFlowProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnContactFlowProps.Builder.() -> Unit,
  ) : this(scope, id, CfnContactFlowProps(props)
  )

  /**
   * `Ref` returns the Amazon Resource Name (ARN) of the flow. For example:.
   *
   * `{ "Ref": "myFlowArn" }`
   */
  public open fun attrContactFlowArn(): String = unwrap(this).getAttrContactFlowArn()

  /**
   * The content of the flow.
   */
  public open fun content(): String = unwrap(this).getContent()

  /**
   * The content of the flow.
   */
  public open fun content(`value`: String) {
    unwrap(this).setContent(`value`)
  }

  /**
   * The description of the flow.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the flow.
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
   * The name of the flow.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the flow.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The state of the flow.
   */
  public open fun state(): String? = unwrap(this).getState()

  /**
   * The state of the flow.
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
   * The type of the flow.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of the flow.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnContactFlow].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The content of the flow.
     *
     * For more information, see [Amazon Connect Flow
     * language](https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html) in the
     * *Amazon Connect Administrator Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-content)
     * @param content The content of the flow. 
     */
    public fun content(content: String)

    /**
     * The description of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-description)
     * @param description The description of the flow. 
     */
    public fun description(description: String)

    /**
     * The Amazon Resource Name (ARN) of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the Amazon Connect instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * The name of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-name)
     * @param name The name of the flow. 
     */
    public fun name(name: String)

    /**
     * The state of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-state)
     * @param state The state of the flow. 
     */
    public fun state(state: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of the flow.
     *
     * For descriptions of the available types, see [Choose a flow
     * type](https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types)
     * in the *Amazon Connect Administrator Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-type)
     * @param type The type of the flow. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnContactFlow.Builder =
        software.amazon.awscdk.services.connect.CfnContactFlow.Builder.create(scope, id)

    /**
     * The content of the flow.
     *
     * For more information, see [Amazon Connect Flow
     * language](https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html) in the
     * *Amazon Connect Administrator Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-content)
     * @param content The content of the flow. 
     */
    override fun content(content: String) {
      cdkBuilder.content(content)
    }

    /**
     * The description of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-description)
     * @param description The description of the flow. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the Amazon Connect instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The name of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-name)
     * @param name The name of the flow. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The state of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-state)
     * @param state The state of the flow. 
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of the flow.
     *
     * For descriptions of the available types, see [Choose a flow
     * type](https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types)
     * in the *Amazon Connect Administrator Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-type)
     * @param type The type of the flow. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnContactFlow = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnContactFlow.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnContactFlow {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnContactFlow(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnContactFlow):
        CfnContactFlow = CfnContactFlow(cdkObject)

    internal fun unwrap(wrapped: CfnContactFlow):
        software.amazon.awscdk.services.connect.CfnContactFlow = wrapped.cdkObject as
        software.amazon.awscdk.services.connect.CfnContactFlow
  }
}
