@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Interface with properties necessary to import a reusable EventBus.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
 * EventBusAttributes eventBusAttributes = EventBusAttributes.builder()
 * .eventBusArn("eventBusArn")
 * .eventBusName("eventBusName")
 * .eventBusPolicy("eventBusPolicy")
 * // the properties below are optional
 * .eventSourceName("eventSourceName")
 * .build();
 * ```
 */
public interface EventBusAttributes {
  /**
   * The ARN of this event bus resource.
   */
  public fun eventBusArn(): String

  /**
   * The physical ID of this event bus resource.
   */
  public fun eventBusName(): String

  /**
   * The JSON policy of this event bus resource.
   */
  public fun eventBusPolicy(): String

  /**
   * The partner event source to associate with this event bus resource.
   *
   * Default: - no partner event source
   */
  public fun eventSourceName(): String? = unwrap(this).getEventSourceName()

  /**
   * A builder for [EventBusAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param eventBusArn The ARN of this event bus resource. 
     */
    public fun eventBusArn(eventBusArn: String)

    /**
     * @param eventBusName The physical ID of this event bus resource. 
     */
    public fun eventBusName(eventBusName: String)

    /**
     * @param eventBusPolicy The JSON policy of this event bus resource. 
     */
    public fun eventBusPolicy(eventBusPolicy: String)

    /**
     * @param eventSourceName The partner event source to associate with this event bus resource.
     */
    public fun eventSourceName(eventSourceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.EventBusAttributes.Builder =
        software.amazon.awscdk.services.events.EventBusAttributes.builder()

    /**
     * @param eventBusArn The ARN of this event bus resource. 
     */
    override fun eventBusArn(eventBusArn: String) {
      cdkBuilder.eventBusArn(eventBusArn)
    }

    /**
     * @param eventBusName The physical ID of this event bus resource. 
     */
    override fun eventBusName(eventBusName: String) {
      cdkBuilder.eventBusName(eventBusName)
    }

    /**
     * @param eventBusPolicy The JSON policy of this event bus resource. 
     */
    override fun eventBusPolicy(eventBusPolicy: String) {
      cdkBuilder.eventBusPolicy(eventBusPolicy)
    }

    /**
     * @param eventSourceName The partner event source to associate with this event bus resource.
     */
    override fun eventSourceName(eventSourceName: String) {
      cdkBuilder.eventSourceName(eventSourceName)
    }

    public fun build(): software.amazon.awscdk.services.events.EventBusAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.EventBusAttributes,
  ) : CdkObject(cdkObject), EventBusAttributes {
    /**
     * The ARN of this event bus resource.
     */
    override fun eventBusArn(): String = unwrap(this).getEventBusArn()

    /**
     * The physical ID of this event bus resource.
     */
    override fun eventBusName(): String = unwrap(this).getEventBusName()

    /**
     * The JSON policy of this event bus resource.
     */
    override fun eventBusPolicy(): String = unwrap(this).getEventBusPolicy()

    /**
     * The partner event source to associate with this event bus resource.
     *
     * Default: - no partner event source
     */
    override fun eventSourceName(): String? = unwrap(this).getEventSourceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EventBusAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.EventBusAttributes):
        EventBusAttributes = CdkObjectWrappers.wrap(cdkObject) as? EventBusAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventBusAttributes):
        software.amazon.awscdk.services.events.EventBusAttributes = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.events.EventBusAttributes
  }
}
