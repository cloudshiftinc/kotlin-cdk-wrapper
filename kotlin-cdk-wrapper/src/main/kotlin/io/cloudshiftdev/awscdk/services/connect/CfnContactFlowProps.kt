@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnContactFlow`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnContactFlowProps cfnContactFlowProps = CfnContactFlowProps.builder()
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
public interface CfnContactFlowProps {
  /**
   * The content of the flow.
   *
   * For more information, see [Amazon Connect Flow
   * language](https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html) in the *Amazon
   * Connect Administrator Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-content)
   */
  public fun content(): String

  /**
   * The description of the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Connect instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-instancearn)
   */
  public fun instanceArn(): String

  /**
   * The name of the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-name)
   */
  public fun name(): String

  /**
   * The state of the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-state)
   */
  public fun state(): String? = unwrap(this).getState()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of the flow.
   *
   * For descriptions of the available types, see [Choose a flow
   * type](https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types)
   * in the *Amazon Connect Administrator Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnContactFlowProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param content The content of the flow. 
     * For more information, see [Amazon Connect Flow
     * language](https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html) in the
     * *Amazon Connect Administrator Guide* .
     */
    public fun content(content: String)

    /**
     * @param description The description of the flow.
     */
    public fun description(description: String)

    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the Amazon Connect instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * @param name The name of the flow. 
     */
    public fun name(name: String)

    /**
     * @param state The state of the flow.
     */
    public fun state(state: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of the flow. 
     * For descriptions of the available types, see [Choose a flow
     * type](https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types)
     * in the *Amazon Connect Administrator Guide* .
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnContactFlowProps.Builder =
        software.amazon.awscdk.services.connect.CfnContactFlowProps.builder()

    /**
     * @param content The content of the flow. 
     * For more information, see [Amazon Connect Flow
     * language](https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html) in the
     * *Amazon Connect Administrator Guide* .
     */
    override fun content(content: String) {
      cdkBuilder.content(content)
    }

    /**
     * @param description The description of the flow.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the Amazon Connect instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param name The name of the flow. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param state The state of the flow.
     */
    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of the flow. 
     * For descriptions of the available types, see [Choose a flow
     * type](https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types)
     * in the *Amazon Connect Administrator Guide* .
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnContactFlowProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.connect.CfnContactFlowProps,
  ) : CdkObject(cdkObject),
      CfnContactFlowProps {
    /**
     * The content of the flow.
     *
     * For more information, see [Amazon Connect Flow
     * language](https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html) in the
     * *Amazon Connect Administrator Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-content)
     */
    override fun content(): String = unwrap(this).getContent()

    /**
     * The description of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Amazon Resource Name (ARN) of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-instancearn)
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /**
     * The name of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The state of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-state)
     */
    override fun state(): String? = unwrap(this).getState()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of the flow.
     *
     * For descriptions of the available types, see [Choose a flow
     * type](https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types)
     * in the *Amazon Connect Administrator Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html#cfn-connect-contactflow-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnContactFlowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnContactFlowProps):
        CfnContactFlowProps = CdkObjectWrappers.wrap(cdkObject) as? CfnContactFlowProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnContactFlowProps):
        software.amazon.awscdk.services.connect.CfnContactFlowProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnContactFlowProps
  }
}
