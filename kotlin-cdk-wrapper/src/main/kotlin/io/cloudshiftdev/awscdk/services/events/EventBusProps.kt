@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

/**
 * Properties to define an event bus.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.events.*;
 * EventBus myEventBus = EventBus.Builder.create(this, "EventBus")
 * .eventBusName("MyEventBus1")
 * .build();
 * EventBridgePutEvents.Builder.create(this, "Send an event to EventBridge")
 * .entries(List.of(EventBridgePutEventsEntry.builder()
 * .detail(TaskInput.fromObject(Map.of(
 * "Message", "Hello from Step Functions!")))
 * .eventBus(myEventBus)
 * .detailType("MessageFromStepFunctions")
 * .source("step.functions")
 * .build()))
 * .build();
 * ```
 */
public interface EventBusProps {
  /**
   * The event bus description.
   *
   * The description can be up to 512 characters long.
   *
   * Default: - no description
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the event bus you are creating Note: If 'eventSourceName' is passed in, you cannot
   * set this.
   *
   * Default: - automatically generated name
   */
  public fun eventBusName(): String? = unwrap(this).getEventBusName()

  /**
   * The partner event source to associate with this event bus resource Note: If 'eventBusName' is
   * passed in, you cannot set this.
   *
   * Default: - no partner event source
   */
  public fun eventSourceName(): String? = unwrap(this).getEventSourceName()

  /**
   * The customer managed key that encrypt events on this event bus.
   *
   * Default: - Use an AWS managed key
   */
  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  /**
   * A builder for [EventBusProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The event bus description.
     * The description can be up to 512 characters long.
     */
    public fun description(description: String)

    /**
     * @param eventBusName The name of the event bus you are creating Note: If 'eventSourceName' is
     * passed in, you cannot set this.
     */
    public fun eventBusName(eventBusName: String)

    /**
     * @param eventSourceName The partner event source to associate with this event bus resource
     * Note: If 'eventBusName' is passed in, you cannot set this.
     */
    public fun eventSourceName(eventSourceName: String)

    /**
     * @param kmsKey The customer managed key that encrypt events on this event bus.
     */
    public fun kmsKey(kmsKey: IKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.EventBusProps.Builder =
        software.amazon.awscdk.services.events.EventBusProps.builder()

    /**
     * @param description The event bus description.
     * The description can be up to 512 characters long.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param eventBusName The name of the event bus you are creating Note: If 'eventSourceName' is
     * passed in, you cannot set this.
     */
    override fun eventBusName(eventBusName: String) {
      cdkBuilder.eventBusName(eventBusName)
    }

    /**
     * @param eventSourceName The partner event source to associate with this event bus resource
     * Note: If 'eventBusName' is passed in, you cannot set this.
     */
    override fun eventSourceName(eventSourceName: String) {
      cdkBuilder.eventSourceName(eventSourceName)
    }

    /**
     * @param kmsKey The customer managed key that encrypt events on this event bus.
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.EventBusProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.EventBusProps,
  ) : CdkObject(cdkObject),
      EventBusProps {
    /**
     * The event bus description.
     *
     * The description can be up to 512 characters long.
     *
     * Default: - no description
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the event bus you are creating Note: If 'eventSourceName' is passed in, you
     * cannot set this.
     *
     * Default: - automatically generated name
     */
    override fun eventBusName(): String? = unwrap(this).getEventBusName()

    /**
     * The partner event source to associate with this event bus resource Note: If 'eventBusName' is
     * passed in, you cannot set this.
     *
     * Default: - no partner event source
     */
    override fun eventSourceName(): String? = unwrap(this).getEventSourceName()

    /**
     * The customer managed key that encrypt events on this event bus.
     *
     * Default: - Use an AWS managed key
     */
    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EventBusProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.EventBusProps):
        EventBusProps = CdkObjectWrappers.wrap(cdkObject) as? EventBusProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventBusProps):
        software.amazon.awscdk.services.events.EventBusProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.events.EventBusProps
  }
}
