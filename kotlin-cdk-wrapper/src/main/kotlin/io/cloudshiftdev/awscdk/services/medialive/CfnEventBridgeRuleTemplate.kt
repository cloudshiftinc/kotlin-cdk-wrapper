@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Definition of AWS::MediaLive::EventBridgeRuleTemplate Resource Type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * CfnEventBridgeRuleTemplate cfnEventBridgeRuleTemplate =
 * CfnEventBridgeRuleTemplate.Builder.create(this, "MyCfnEventBridgeRuleTemplate")
 * .eventType("eventType")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .eventTargets(List.of(EventBridgeRuleTemplateTargetProperty.builder()
 * .arn("arn")
 * .build()))
 * .groupIdentifier("groupIdentifier")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html)
 */
public open class CfnEventBridgeRuleTemplate(
  cdkObject: software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplate,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventBridgeRuleTemplateProps,
  ) :
      this(software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEventBridgeRuleTemplateProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventBridgeRuleTemplateProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEventBridgeRuleTemplateProps(props)
  )

  /**
   * Target ARNs must be either an SNS topic or CloudWatch log group.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time of resource creation.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * An eventbridge rule template group's id.
   *
   * Amazon Web Services provided template groups have ids that start with ``aws-``.
   */
  public open fun attrGroupId(): String = unwrap(this).getAttrGroupId()

  /**
   * An eventbridge rule template's id.
   *
   * Amazon Web Services provided templates have ids that start with ``aws-``
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Placeholder documentation for __string.
   */
  public open fun attrIdentifier(): String = unwrap(this).getAttrIdentifier()

  /**
   * The date and time of latest resource modification.
   */
  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A resource's optional description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A resource's optional description.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The destinations that will receive the event notifications.
   */
  public open fun eventTargets(): Any? = unwrap(this).getEventTargets()

  /**
   * The destinations that will receive the event notifications.
   */
  public open fun eventTargets(`value`: IResolvable) {
    unwrap(this).setEventTargets(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The destinations that will receive the event notifications.
   */
  public open fun eventTargets(`value`: List<Any>) {
    unwrap(this).setEventTargets(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The destinations that will receive the event notifications.
   */
  public open fun eventTargets(vararg `value`: Any): Unit = eventTargets(`value`.toList())

  /**
   * The type of event to match with the rule.
   */
  public open fun eventType(): String = unwrap(this).getEventType()

  /**
   * The type of event to match with the rule.
   */
  public open fun eventType(`value`: String) {
    unwrap(this).setEventType(`value`)
  }

  /**
   * An eventbridge rule template group's identifier.
   */
  public open fun groupIdentifier(): String? = unwrap(this).getGroupIdentifier()

  /**
   * An eventbridge rule template group's identifier.
   */
  public open fun groupIdentifier(`value`: String) {
    unwrap(this).setGroupIdentifier(`value`)
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
   * A resource's name.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A resource's name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Represents the tags associated with a resource.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * Represents the tags associated with a resource.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.medialive.CfnEventBridgeRuleTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A resource's optional description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-description)
     * @param description A resource's optional description. 
     */
    public fun description(description: String)

    /**
     * The destinations that will receive the event notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-eventtargets)
     * @param eventTargets The destinations that will receive the event notifications. 
     */
    public fun eventTargets(eventTargets: IResolvable)

    /**
     * The destinations that will receive the event notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-eventtargets)
     * @param eventTargets The destinations that will receive the event notifications. 
     */
    public fun eventTargets(eventTargets: List<Any>)

    /**
     * The destinations that will receive the event notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-eventtargets)
     * @param eventTargets The destinations that will receive the event notifications. 
     */
    public fun eventTargets(vararg eventTargets: Any)

    /**
     * The type of event to match with the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-eventtype)
     * @param eventType The type of event to match with the rule. 
     */
    public fun eventType(eventType: String)

    /**
     * An eventbridge rule template group's identifier.
     *
     * Can be either be its id or current name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-groupidentifier)
     * @param groupIdentifier An eventbridge rule template group's identifier. 
     */
    public fun groupIdentifier(groupIdentifier: String)

    /**
     * A resource's name.
     *
     * Names must be unique within the scope of a resource type in a specific region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-name)
     * @param name A resource's name. 
     */
    public fun name(name: String)

    /**
     * Represents the tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-tags)
     * @param tags Represents the tags associated with a resource. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplate.Builder =
        software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplate.Builder.create(scope,
        id)

    /**
     * A resource's optional description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-description)
     * @param description A resource's optional description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The destinations that will receive the event notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-eventtargets)
     * @param eventTargets The destinations that will receive the event notifications. 
     */
    override fun eventTargets(eventTargets: IResolvable) {
      cdkBuilder.eventTargets(eventTargets.let(IResolvable.Companion::unwrap))
    }

    /**
     * The destinations that will receive the event notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-eventtargets)
     * @param eventTargets The destinations that will receive the event notifications. 
     */
    override fun eventTargets(eventTargets: List<Any>) {
      cdkBuilder.eventTargets(eventTargets.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The destinations that will receive the event notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-eventtargets)
     * @param eventTargets The destinations that will receive the event notifications. 
     */
    override fun eventTargets(vararg eventTargets: Any): Unit = eventTargets(eventTargets.toList())

    /**
     * The type of event to match with the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-eventtype)
     * @param eventType The type of event to match with the rule. 
     */
    override fun eventType(eventType: String) {
      cdkBuilder.eventType(eventType)
    }

    /**
     * An eventbridge rule template group's identifier.
     *
     * Can be either be its id or current name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-groupidentifier)
     * @param groupIdentifier An eventbridge rule template group's identifier. 
     */
    override fun groupIdentifier(groupIdentifier: String) {
      cdkBuilder.groupIdentifier(groupIdentifier)
    }

    /**
     * A resource's name.
     *
     * Names must be unique within the scope of a resource type in a specific region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-name)
     * @param name A resource's name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Represents the tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-tags)
     * @param tags Represents the tags associated with a resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventBridgeRuleTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventBridgeRuleTemplate(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplate):
        CfnEventBridgeRuleTemplate = CfnEventBridgeRuleTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnEventBridgeRuleTemplate):
        software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplate = wrapped.cdkObject as
        software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplate
  }

  /**
   * The target to which to send matching events.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * EventBridgeRuleTemplateTargetProperty eventBridgeRuleTemplateTargetProperty =
   * EventBridgeRuleTemplateTargetProperty.builder()
   * .arn("arn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-eventbridgeruletemplate-eventbridgeruletemplatetarget.html)
   */
  public interface EventBridgeRuleTemplateTargetProperty {
    /**
     * Target ARNs must be either an SNS topic or CloudWatch log group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-eventbridgeruletemplate-eventbridgeruletemplatetarget.html#cfn-medialive-eventbridgeruletemplate-eventbridgeruletemplatetarget-arn)
     */
    public fun arn(): String

    /**
     * A builder for [EventBridgeRuleTemplateTargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn Target ARNs must be either an SNS topic or CloudWatch log group. 
       */
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplate.EventBridgeRuleTemplateTargetProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplate.EventBridgeRuleTemplateTargetProperty.builder()

      /**
       * @param arn Target ARNs must be either an SNS topic or CloudWatch log group. 
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplate.EventBridgeRuleTemplateTargetProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplate.EventBridgeRuleTemplateTargetProperty,
    ) : CdkObject(cdkObject),
        EventBridgeRuleTemplateTargetProperty {
      /**
       * Target ARNs must be either an SNS topic or CloudWatch log group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-eventbridgeruletemplate-eventbridgeruletemplatetarget.html#cfn-medialive-eventbridgeruletemplate-eventbridgeruletemplatetarget-arn)
       */
      override fun arn(): String = unwrap(this).getArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EventBridgeRuleTemplateTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplate.EventBridgeRuleTemplateTargetProperty):
          EventBridgeRuleTemplateTargetProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EventBridgeRuleTemplateTargetProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventBridgeRuleTemplateTargetProperty):
          software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplate.EventBridgeRuleTemplateTargetProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplate.EventBridgeRuleTemplateTargetProperty
    }
  }
}
