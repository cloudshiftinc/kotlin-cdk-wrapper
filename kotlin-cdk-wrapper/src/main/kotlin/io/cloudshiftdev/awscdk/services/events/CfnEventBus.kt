@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

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

/**
 * Specifies an event bus within your account.
 *
 * This can be a custom event bus which you can use to receive events from your custom applications
 * and services, or it can be a partner event bus which can be matched to a partner event source.
 *
 *
 * As an aid to help you jumpstart developing CloudFormation templates, the EventBridge console
 * enables you to create templates from the existing event buses in your account. For more information,
 * see [Generating CloudFormation templates from an EventBridge event
 * bus](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-generate-event-bus-template.html)
 * in the *Amazon EventBridge User Guide* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
 * Object policy;
 * CfnEventBus cfnEventBus = CfnEventBus.Builder.create(this, "MyCfnEventBus")
 * .name("name")
 * // the properties below are optional
 * .eventSourceName("eventSourceName")
 * .policy(policy)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html)
 */
public open class CfnEventBus(
  cdkObject: software.amazon.awscdk.services.events.CfnEventBus,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventBusProps,
  ) :
      this(software.amazon.awscdk.services.events.CfnEventBus(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEventBusProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventBusProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEventBusProps(props)
  )

  /**
   * The ARN of the event bus, such as
   * `arn:aws:events:us-east-2:123456789012:event-bus/aws.partner/PartnerName/acct1/repo1` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The name of the event bus, such as `PartnerName/acct1/repo1` .
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   *
   */
  public open fun attrPolicy(): String = unwrap(this).getAttrPolicy()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * If you are creating a partner event bus, this specifies the partner event source that the new
   * event bus will be matched with.
   */
  public open fun eventSourceName(): String? = unwrap(this).getEventSourceName()

  /**
   * If you are creating a partner event bus, this specifies the partner event source that the new
   * event bus will be matched with.
   */
  public open fun eventSourceName(`value`: String) {
    unwrap(this).setEventSourceName(`value`)
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
   * The name of the new event bus.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the new event bus.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The permissions policy of the event bus, describing which other AWS accounts can write events
   * to this event bus.
   */
  public open fun policy(): Any? = unwrap(this).getPolicy()

  /**
   * The permissions policy of the event bus, describing which other AWS accounts can write events
   * to this event bus.
   */
  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  /**
   * Tags to associate with the event bus.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Tags to associate with the event bus.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Tags to associate with the event bus.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.CfnEventBus].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * If you are creating a partner event bus, this specifies the partner event source that the new
     * event bus will be matched with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-eventsourcename)
     * @param eventSourceName If you are creating a partner event bus, this specifies the partner
     * event source that the new event bus will be matched with. 
     */
    public fun eventSourceName(eventSourceName: String)

    /**
     * The name of the new event bus.
     *
     * Custom event bus names can't contain the `/` character, but you can use the `/` character in
     * partner event bus names. In addition, for partner event buses, the name must exactly match the
     * name of the partner event source that this event bus is matched to.
     *
     * You can't use the name `default` for a custom event bus, as this name is already used for
     * your account's default event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-name)
     * @param name The name of the new event bus. 
     */
    public fun name(name: String)

    /**
     * The permissions policy of the event bus, describing which other AWS accounts can write events
     * to this event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-policy)
     * @param policy The permissions policy of the event bus, describing which other AWS accounts
     * can write events to this event bus. 
     */
    public fun policy(policy: Any)

    /**
     * Tags to associate with the event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-tags)
     * @param tags Tags to associate with the event bus. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags to associate with the event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-tags)
     * @param tags Tags to associate with the event bus. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnEventBus.Builder =
        software.amazon.awscdk.services.events.CfnEventBus.Builder.create(scope, id)

    /**
     * If you are creating a partner event bus, this specifies the partner event source that the new
     * event bus will be matched with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-eventsourcename)
     * @param eventSourceName If you are creating a partner event bus, this specifies the partner
     * event source that the new event bus will be matched with. 
     */
    override fun eventSourceName(eventSourceName: String) {
      cdkBuilder.eventSourceName(eventSourceName)
    }

    /**
     * The name of the new event bus.
     *
     * Custom event bus names can't contain the `/` character, but you can use the `/` character in
     * partner event bus names. In addition, for partner event buses, the name must exactly match the
     * name of the partner event source that this event bus is matched to.
     *
     * You can't use the name `default` for a custom event bus, as this name is already used for
     * your account's default event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-name)
     * @param name The name of the new event bus. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The permissions policy of the event bus, describing which other AWS accounts can write events
     * to this event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-policy)
     * @param policy The permissions policy of the event bus, describing which other AWS accounts
     * can write events to this event bus. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * Tags to associate with the event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-tags)
     * @param tags Tags to associate with the event bus. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Tags to associate with the event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-tags)
     * @param tags Tags to associate with the event bus. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.events.CfnEventBus = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.events.CfnEventBus.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventBus {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventBus(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEventBus): CfnEventBus =
        CfnEventBus(cdkObject)

    internal fun unwrap(wrapped: CfnEventBus): software.amazon.awscdk.services.events.CfnEventBus =
        wrapped.cdkObject as software.amazon.awscdk.services.events.CfnEventBus
  }
}
