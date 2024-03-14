package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.EventBusAttributes,
  ) : EventBusAttributes {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EventBusAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.EventBusAttributes):
        EventBusAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventBusAttributes):
        software.amazon.awscdk.services.events.EventBusAttributes = (wrapped as Wrapper).cdkObject
  }
}
