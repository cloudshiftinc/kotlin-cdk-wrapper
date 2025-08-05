@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnEventBridgeRuleTemplate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * CfnEventBridgeRuleTemplateProps cfnEventBridgeRuleTemplateProps =
 * CfnEventBridgeRuleTemplateProps.builder()
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
public interface CfnEventBridgeRuleTemplateProps {
  /**
   * A resource's optional description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The destinations that will receive the event notifications.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-eventtargets)
   */
  public fun eventTargets(): Any? = unwrap(this).getEventTargets()

  /**
   * The type of event to match with the rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-eventtype)
   */
  public fun eventType(): String

  /**
   * An eventbridge rule template group's identifier.
   *
   * Can be either be its id or current name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-groupidentifier)
   */
  public fun groupIdentifier(): String? = unwrap(this).getGroupIdentifier()

  /**
   * A resource's name.
   *
   * Names must be unique within the scope of a resource type in a specific region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-name)
   */
  public fun name(): String

  /**
   * Represents the tags associated with a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnEventBridgeRuleTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A resource's optional description.
     */
    public fun description(description: String)

    /**
     * @param eventTargets The destinations that will receive the event notifications.
     */
    public fun eventTargets(eventTargets: IResolvable)

    /**
     * @param eventTargets The destinations that will receive the event notifications.
     */
    public fun eventTargets(eventTargets: List<Any>)

    /**
     * @param eventTargets The destinations that will receive the event notifications.
     */
    public fun eventTargets(vararg eventTargets: Any)

    /**
     * @param eventType The type of event to match with the rule. 
     */
    public fun eventType(eventType: String)

    /**
     * @param groupIdentifier An eventbridge rule template group's identifier.
     * Can be either be its id or current name.
     */
    public fun groupIdentifier(groupIdentifier: String)

    /**
     * @param name A resource's name. 
     * Names must be unique within the scope of a resource type in a specific region.
     */
    public fun name(name: String)

    /**
     * @param tags Represents the tags associated with a resource.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateProps.Builder =
        software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateProps.builder()

    /**
     * @param description A resource's optional description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param eventTargets The destinations that will receive the event notifications.
     */
    override fun eventTargets(eventTargets: IResolvable) {
      cdkBuilder.eventTargets(eventTargets.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param eventTargets The destinations that will receive the event notifications.
     */
    override fun eventTargets(eventTargets: List<Any>) {
      cdkBuilder.eventTargets(eventTargets.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param eventTargets The destinations that will receive the event notifications.
     */
    override fun eventTargets(vararg eventTargets: Any): Unit = eventTargets(eventTargets.toList())

    /**
     * @param eventType The type of event to match with the rule. 
     */
    override fun eventType(eventType: String) {
      cdkBuilder.eventType(eventType)
    }

    /**
     * @param groupIdentifier An eventbridge rule template group's identifier.
     * Can be either be its id or current name.
     */
    override fun groupIdentifier(groupIdentifier: String) {
      cdkBuilder.groupIdentifier(groupIdentifier)
    }

    /**
     * @param name A resource's name. 
     * Names must be unique within the scope of a resource type in a specific region.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Represents the tags associated with a resource.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateProps,
  ) : CdkObject(cdkObject),
      CfnEventBridgeRuleTemplateProps {
    /**
     * A resource's optional description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The destinations that will receive the event notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-eventtargets)
     */
    override fun eventTargets(): Any? = unwrap(this).getEventTargets()

    /**
     * The type of event to match with the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-eventtype)
     */
    override fun eventType(): String = unwrap(this).getEventType()

    /**
     * An eventbridge rule template group's identifier.
     *
     * Can be either be its id or current name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-groupidentifier)
     */
    override fun groupIdentifier(): String? = unwrap(this).getGroupIdentifier()

    /**
     * A resource's name.
     *
     * Names must be unique within the scope of a resource type in a specific region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Represents the tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplate.html#cfn-medialive-eventbridgeruletemplate-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventBridgeRuleTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateProps):
        CfnEventBridgeRuleTemplateProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnEventBridgeRuleTemplateProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventBridgeRuleTemplateProps):
        software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateProps
  }
}
