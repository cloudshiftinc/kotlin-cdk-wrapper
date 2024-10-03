@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnAgentStatus`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnAgentStatusProps cfnAgentStatusProps = CfnAgentStatusProps.builder()
 * .instanceArn("instanceArn")
 * .name("name")
 * .state("state")
 * // the properties below are optional
 * .description("description")
 * .displayOrder(123)
 * .resetOrderNumber(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html)
 */
public interface CfnAgentStatusProps {
  /**
   * The description of the agent status.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The display order of the agent status.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-displayorder)
   */
  public fun displayOrder(): Number? = unwrap(this).getDisplayOrder()

  /**
   * The Amazon Resource Name (ARN) of the instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-instancearn)
   */
  public fun instanceArn(): String

  /**
   * The name of the agent status.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-name)
   */
  public fun name(): String

  /**
   * A number indicating the reset order of the agent status.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-resetordernumber)
   */
  public fun resetOrderNumber(): Any? = unwrap(this).getResetOrderNumber()

  /**
   * The state of the agent status.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-state)
   */
  public fun state(): String

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of agent status.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-type)
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * A builder for [CfnAgentStatusProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the agent status.
     */
    public fun description(description: String)

    /**
     * @param displayOrder The display order of the agent status.
     */
    public fun displayOrder(displayOrder: Number)

    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * @param name The name of the agent status. 
     */
    public fun name(name: String)

    /**
     * @param resetOrderNumber A number indicating the reset order of the agent status.
     */
    public fun resetOrderNumber(resetOrderNumber: Boolean)

    /**
     * @param resetOrderNumber A number indicating the reset order of the agent status.
     */
    public fun resetOrderNumber(resetOrderNumber: IResolvable)

    /**
     * @param state The state of the agent status. 
     */
    public fun state(state: String)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of agent status.
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnAgentStatusProps.Builder =
        software.amazon.awscdk.services.connect.CfnAgentStatusProps.builder()

    /**
     * @param description The description of the agent status.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayOrder The display order of the agent status.
     */
    override fun displayOrder(displayOrder: Number) {
      cdkBuilder.displayOrder(displayOrder)
    }

    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param name The name of the agent status. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param resetOrderNumber A number indicating the reset order of the agent status.
     */
    override fun resetOrderNumber(resetOrderNumber: Boolean) {
      cdkBuilder.resetOrderNumber(resetOrderNumber)
    }

    /**
     * @param resetOrderNumber A number indicating the reset order of the agent status.
     */
    override fun resetOrderNumber(resetOrderNumber: IResolvable) {
      cdkBuilder.resetOrderNumber(resetOrderNumber.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param state The state of the agent status. 
     */
    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of agent status.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnAgentStatusProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.connect.CfnAgentStatusProps,
  ) : CdkObject(cdkObject),
      CfnAgentStatusProps {
    /**
     * The description of the agent status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The display order of the agent status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-displayorder)
     */
    override fun displayOrder(): Number? = unwrap(this).getDisplayOrder()

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-instancearn)
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /**
     * The name of the agent status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A number indicating the reset order of the agent status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-resetordernumber)
     */
    override fun resetOrderNumber(): Any? = unwrap(this).getResetOrderNumber()

    /**
     * The state of the agent status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-state)
     */
    override fun state(): String = unwrap(this).getState()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of agent status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-type)
     */
    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAgentStatusProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnAgentStatusProps):
        CfnAgentStatusProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAgentStatusProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAgentStatusProps):
        software.amazon.awscdk.services.connect.CfnAgentStatusProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnAgentStatusProps
  }
}
