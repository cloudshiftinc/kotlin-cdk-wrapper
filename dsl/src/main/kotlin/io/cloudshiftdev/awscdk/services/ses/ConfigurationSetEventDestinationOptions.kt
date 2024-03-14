package io.cloudshiftdev.awscdk.services.ses

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ConfigurationSetEventDestinationOptions {
  public fun configurationSetEventDestinationName(): String? =
      unwrap(this).getConfigurationSetEventDestinationName()

  public fun destination(): EventDestination

  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun events(): List<EmailSendingEvent> =
      unwrap(this).getEvents()?.map(EmailSendingEvent::wrap) ?: emptyList()

  public interface Builder {
    public fun configurationSetEventDestinationName(configurationSetEventDestinationName: String)

    public fun destination(destination: EventDestination)

    public fun enabled(enabled: Boolean)

    public fun events(events: List<EmailSendingEvent>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationOptions.Builder =
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationOptions.builder()

    override
        fun configurationSetEventDestinationName(configurationSetEventDestinationName: String) {
      cdkBuilder.configurationSetEventDestinationName(configurationSetEventDestinationName)
    }

    override fun destination(destination: EventDestination) {
      cdkBuilder.destination(destination.let(EventDestination::unwrap))
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun events(events: List<EmailSendingEvent>) {
      cdkBuilder.events(events.map(EmailSendingEvent::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationOptions
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationOptions,
  ) : ConfigurationSetEventDestinationOptions {
    override fun configurationSetEventDestinationName(): String? =
        unwrap(this).getConfigurationSetEventDestinationName()

    override fun destination(): EventDestination =
        unwrap(this).getDestination().let(EventDestination::wrap)

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun events(): List<EmailSendingEvent> =
        unwrap(this).getEvents()?.map(EmailSendingEvent::wrap) ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}):
        ConfigurationSetEventDestinationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationOptions):
        ConfigurationSetEventDestinationOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConfigurationSetEventDestinationOptions):
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationOptions = (wrapped as
        Wrapper).cdkObject
  }
}
