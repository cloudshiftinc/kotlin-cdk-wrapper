@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Contains information about an agent status.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnAgentStatus cfnAgentStatus = CfnAgentStatus.Builder.create(this, "MyCfnAgentStatus")
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
public open class CfnAgentStatus(
  cdkObject: software.amazon.awscdk.services.connect.CfnAgentStatus,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAgentStatusProps,
  ) :
      this(software.amazon.awscdk.services.connect.CfnAgentStatus(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAgentStatusProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAgentStatusProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAgentStatusProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the agent status.
   */
  public open fun attrAgentStatusArn(): String = unwrap(this).getAttrAgentStatusArn()

  /**
   * The AWS Region where this resource was last modified.
   */
  public open fun attrLastModifiedRegion(): String = unwrap(this).getAttrLastModifiedRegion()

  /**
   * The timestamp when this resource was last modified.
   */
  public open fun attrLastModifiedTime(): IResolvable =
      unwrap(this).getAttrLastModifiedTime().let(IResolvable::wrap)

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the agent status.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the agent status.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The display order of the agent status.
   */
  public open fun displayOrder(): Number? = unwrap(this).getDisplayOrder()

  /**
   * The display order of the agent status.
   */
  public open fun displayOrder(`value`: Number) {
    unwrap(this).setDisplayOrder(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
   * The name of the agent status.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the agent status.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A number indicating the reset order of the agent status.
   */
  public open fun resetOrderNumber(): Any? = unwrap(this).getResetOrderNumber()

  /**
   * A number indicating the reset order of the agent status.
   */
  public open fun resetOrderNumber(`value`: Boolean) {
    unwrap(this).setResetOrderNumber(`value`)
  }

  /**
   * A number indicating the reset order of the agent status.
   */
  public open fun resetOrderNumber(`value`: IResolvable) {
    unwrap(this).setResetOrderNumber(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The state of the agent status.
   */
  public open fun state(): String = unwrap(this).getState()

  /**
   * The state of the agent status.
   */
  public open fun state(`value`: String) {
    unwrap(this).setState(`value`)
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The type of agent status.
   */
  public open fun type(): String? = unwrap(this).getType()

  /**
   * The type of agent status.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnAgentStatus].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the agent status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-description)
     * @param description The description of the agent status. 
     */
    public fun description(description: String)

    /**
     * The display order of the agent status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-displayorder)
     * @param displayOrder The display order of the agent status. 
     */
    public fun displayOrder(displayOrder: Number)

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * The name of the agent status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-name)
     * @param name The name of the agent status. 
     */
    public fun name(name: String)

    /**
     * A number indicating the reset order of the agent status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-resetordernumber)
     * @param resetOrderNumber A number indicating the reset order of the agent status. 
     */
    public fun resetOrderNumber(resetOrderNumber: Boolean)

    /**
     * A number indicating the reset order of the agent status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-resetordernumber)
     * @param resetOrderNumber A number indicating the reset order of the agent status. 
     */
    public fun resetOrderNumber(resetOrderNumber: IResolvable)

    /**
     * The state of the agent status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-state)
     * @param state The state of the agent status. 
     */
    public fun state(state: String)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of agent status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-type)
     * @param type The type of agent status. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnAgentStatus.Builder =
        software.amazon.awscdk.services.connect.CfnAgentStatus.Builder.create(scope, id)

    /**
     * The description of the agent status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-description)
     * @param description The description of the agent status. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The display order of the agent status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-displayorder)
     * @param displayOrder The display order of the agent status. 
     */
    override fun displayOrder(displayOrder: Number) {
      cdkBuilder.displayOrder(displayOrder)
    }

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The name of the agent status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-name)
     * @param name The name of the agent status. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A number indicating the reset order of the agent status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-resetordernumber)
     * @param resetOrderNumber A number indicating the reset order of the agent status. 
     */
    override fun resetOrderNumber(resetOrderNumber: Boolean) {
      cdkBuilder.resetOrderNumber(resetOrderNumber)
    }

    /**
     * A number indicating the reset order of the agent status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-resetordernumber)
     * @param resetOrderNumber A number indicating the reset order of the agent status. 
     */
    override fun resetOrderNumber(resetOrderNumber: IResolvable) {
      cdkBuilder.resetOrderNumber(resetOrderNumber.let(IResolvable.Companion::unwrap))
    }

    /**
     * The state of the agent status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-state)
     * @param state The state of the agent status. 
     */
    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of agent status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-agentstatus.html#cfn-connect-agentstatus-type)
     * @param type The type of agent status. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnAgentStatus = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnAgentStatus.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAgentStatus {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAgentStatus(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnAgentStatus):
        CfnAgentStatus = CfnAgentStatus(cdkObject)

    internal fun unwrap(wrapped: CfnAgentStatus):
        software.amazon.awscdk.services.connect.CfnAgentStatus = wrapped.cdkObject as
        software.amazon.awscdk.services.connect.CfnAgentStatus
  }
}
