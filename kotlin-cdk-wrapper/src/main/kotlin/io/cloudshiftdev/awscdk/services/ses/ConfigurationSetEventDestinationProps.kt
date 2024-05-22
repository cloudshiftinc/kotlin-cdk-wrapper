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
 * Properties for a configuration set event destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * ConfigurationSet configurationSet;
 * EventDestination eventDestination;
 * ConfigurationSetEventDestinationProps configurationSetEventDestinationProps =
 * ConfigurationSetEventDestinationProps.builder()
 * .configurationSet(configurationSet)
 * .destination(eventDestination)
 * // the properties below are optional
 * .configurationSetEventDestinationName("configurationSetEventDestinationName")
 * .enabled(false)
 * .events(List.of(EmailSendingEvent.SEND))
 * .build();
 * ```
 */
public interface ConfigurationSetEventDestinationProps : ConfigurationSetEventDestinationOptions {
  /**
   * The configuration set that contains the event destination.
   */
  public fun configurationSet(): IConfigurationSet

  /**
   * A builder for [ConfigurationSetEventDestinationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configurationSet The configuration set that contains the event destination. 
     */
    public fun configurationSet(configurationSet: IConfigurationSet)

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
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationProps.Builder =
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationProps.builder()

    /**
     * @param configurationSet The configuration set that contains the event destination. 
     */
    override fun configurationSet(configurationSet: IConfigurationSet) {
      cdkBuilder.configurationSet(configurationSet.let(IConfigurationSet.Companion::unwrap))
    }

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
      cdkBuilder.destination(destination.let(EventDestination.Companion::unwrap))
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
      cdkBuilder.events(events.map(EmailSendingEvent.Companion::unwrap))
    }

    /**
     * @param events The type of email sending events to publish to the event destination.
     */
    override fun events(vararg events: EmailSendingEvent): Unit = events(events.toList())

    public fun build(): software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationProps,
  ) : CdkObject(cdkObject), ConfigurationSetEventDestinationProps {
    /**
     * The configuration set that contains the event destination.
     */
    override fun configurationSet(): IConfigurationSet =
        unwrap(this).getConfigurationSet().let(IConfigurationSet::wrap)

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
        ConfigurationSetEventDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationProps):
        ConfigurationSetEventDestinationProps = CdkObjectWrappers.wrap(cdkObject) as?
        ConfigurationSetEventDestinationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConfigurationSetEventDestinationProps):
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationProps
  }
}
