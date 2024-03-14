package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnEventBusProps {
  /**
   * If you are creating a partner event bus, this specifies the partner event source that the new
   * event bus will be matched with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-eventsourcename)
   */
  public fun eventSourceName(): String? = unwrap(this).getEventSourceName()

  /**
   * The name of the new event bus.
   *
   * Custom event bus names can't contain the `/` character, but you can use the `/` character in
   * partner event bus names. In addition, for partner event buses, the name must exactly match the
   * name of the partner event source that this event bus is matched to.
   *
   * You can't use the name `default` for a custom event bus, as this name is already used for your
   * account's default event bus.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-name)
   */
  public fun name(): String

  /**
   * The permissions policy of the event bus, describing which other AWS accounts can write events
   * to this event bus.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-policy)
   */
  public fun policy(): Any? = unwrap(this).getPolicy()

  /**
   * Tags to associate with the event bus.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnEventBusProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param eventSourceName If you are creating a partner event bus, this specifies the partner
     * event source that the new event bus will be matched with.
     */
    public fun eventSourceName(eventSourceName: String)

    /**
     * @param name The name of the new event bus. 
     * Custom event bus names can't contain the `/` character, but you can use the `/` character in
     * partner event bus names. In addition, for partner event buses, the name must exactly match the
     * name of the partner event source that this event bus is matched to.
     *
     * You can't use the name `default` for a custom event bus, as this name is already used for
     * your account's default event bus.
     */
    public fun name(name: String)

    /**
     * @param policy The permissions policy of the event bus, describing which other AWS accounts
     * can write events to this event bus.
     */
    public fun policy(policy: Any)

    /**
     * @param tags Tags to associate with the event bus.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags to associate with the event bus.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnEventBusProps.Builder =
        software.amazon.awscdk.services.events.CfnEventBusProps.builder()

    /**
     * @param eventSourceName If you are creating a partner event bus, this specifies the partner
     * event source that the new event bus will be matched with.
     */
    override fun eventSourceName(eventSourceName: String) {
      cdkBuilder.eventSourceName(eventSourceName)
    }

    /**
     * @param name The name of the new event bus. 
     * Custom event bus names can't contain the `/` character, but you can use the `/` character in
     * partner event bus names. In addition, for partner event buses, the name must exactly match the
     * name of the partner event source that this event bus is matched to.
     *
     * You can't use the name `default` for a custom event bus, as this name is already used for
     * your account's default event bus.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param policy The permissions policy of the event bus, describing which other AWS accounts
     * can write events to this event bus.
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * @param tags Tags to associate with the event bus.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Tags to associate with the event bus.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.events.CfnEventBusProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.CfnEventBusProps,
  ) : CdkObject(cdkObject), CfnEventBusProps {
    /**
     * If you are creating a partner event bus, this specifies the partner event source that the new
     * event bus will be matched with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-eventsourcename)
     */
    override fun eventSourceName(): String? = unwrap(this).getEventSourceName()

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
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The permissions policy of the event bus, describing which other AWS accounts can write events
     * to this event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-policy)
     */
    override fun policy(): Any? = unwrap(this).getPolicy()

    /**
     * Tags to associate with the event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventBusProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEventBusProps):
        CfnEventBusProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventBusProps):
        software.amazon.awscdk.services.events.CfnEventBusProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.events.CfnEventBusProps
  }
}
