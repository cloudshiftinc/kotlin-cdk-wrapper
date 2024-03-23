@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Options for a configuration set event destination.
 *
 * Example:
 *
 * ```
 * ConfigurationSet myConfigurationSet;
 * Topic myTopic;
 * myConfigurationSet.addEventDestination("ToSns", ConfigurationSetEventDestinationOptions.builder()
 * .destination(EventDestination.snsTopic(myTopic))
 * .build());
 * ```
 */
public interface ConfigurationSetEventDestinationOptions {
  /**
   * A name for the configuration set event destination.
   *
   * Default: - a CloudFormation generated name
   */
  public fun configurationSetEventDestinationName(): String? =
      unwrap(this).getConfigurationSetEventDestinationName()

  /**
   * The event destination.
   */
  public fun destination(): EventDestination

  /**
   * Whether Amazon SES publishes events to this destination.
   *
   * Default: true
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * The type of email sending events to publish to the event destination.
   *
   * Default: - send all event types
   */
  public fun events(): List<EmailSendingEvent> =
      unwrap(this).getEvents()?.map(EmailSendingEvent::wrap) ?: emptyList()

  /**
   * A builder for [ConfigurationSetEventDestinationOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configurationSetEventDestinationName A name for the configuration set event
     * destination.
     */
    public fun configurationSetEventDestinationName(configurationSetEventDestinationName: String)

    /**
     * @param destination The event destination. 
     */
    public fun destination(destination: EventDestination)

    /**
     * @param enabled Whether Amazon SES publishes events to this destination.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param events The type of email sending events to publish to the event destination.
     */
    public fun events(events: List<EmailSendingEvent>)

    /**
     * @param events The type of email sending events to publish to the event destination.
     */
    public fun events(vararg events: EmailSendingEvent)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationOptions.Builder =
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationOptions.builder()

    /**
     * @param configurationSetEventDestinationName A name for the configuration set event
     * destination.
     */
    override
        fun configurationSetEventDestinationName(configurationSetEventDestinationName: String) {
      cdkBuilder.configurationSetEventDestinationName(configurationSetEventDestinationName)
    }

    /**
     * @param destination The event destination. 
     */
    override fun destination(destination: EventDestination) {
      cdkBuilder.destination(destination.let(EventDestination::unwrap))
    }

    /**
     * @param enabled Whether Amazon SES publishes events to this destination.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param events The type of email sending events to publish to the event destination.
     */
    override fun events(events: List<EmailSendingEvent>) {
      cdkBuilder.events(events.map(EmailSendingEvent::unwrap))
    }

    /**
     * @param events The type of email sending events to publish to the event destination.
     */
    override fun events(vararg events: EmailSendingEvent): Unit = events(events.toList())

    public fun build(): software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationOptions
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationOptions,
  ) : CdkObject(cdkObject), ConfigurationSetEventDestinationOptions {
    /**
     * A name for the configuration set event destination.
     *
     * Default: - a CloudFormation generated name
     */
    override fun configurationSetEventDestinationName(): String? =
        unwrap(this).getConfigurationSetEventDestinationName()

    /**
     * The event destination.
     */
    override fun destination(): EventDestination =
        unwrap(this).getDestination().let(EventDestination::wrap)

    /**
     * Whether Amazon SES publishes events to this destination.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * The type of email sending events to publish to the event destination.
     *
     * Default: - send all event types
     */
    override fun events(): List<EmailSendingEvent> =
        unwrap(this).getEvents()?.map(EmailSendingEvent::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        ConfigurationSetEventDestinationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationOptions):
        ConfigurationSetEventDestinationOptions = CdkObjectWrappers.wrap(cdkObject) as?
        ConfigurationSetEventDestinationOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConfigurationSetEventDestinationOptions):
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationOptions
  }
}
