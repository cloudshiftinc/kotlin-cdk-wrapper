package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.Resource
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ConfigurationSetEventDestination internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ses.ConfigurationSetEventDestination,
) : Resource(cdkObject), IConfigurationSetEventDestination {
  public override fun configurationSetEventDestinationId(): String =
      unwrap(this).getConfigurationSetEventDestinationId()

  public interface Builder {
    public fun configurationSet(configurationSet: IConfigurationSet)

    public fun configurationSetEventDestinationName(configurationSetEventDestinationName: String)

    public fun destination(destination: EventDestination)

    public fun enabled(enabled: Boolean)

    public fun events(events: List<EmailSendingEvent>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestination.Builder =
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestination.Builder.create(scope,
        id)

    override fun configurationSet(configurationSet: IConfigurationSet) {
      cdkBuilder.configurationSet(configurationSet.let(IConfigurationSet::unwrap))
    }

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

    public fun build(): software.amazon.awscdk.services.ses.ConfigurationSetEventDestination =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromConfigurationSetEventDestinationId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      configurationSetEventDestinationId: String,
    ): IConfigurationSetEventDestination =
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestination.fromConfigurationSetEventDestinationId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, configurationSetEventDestinationId).let(IConfigurationSetEventDestination::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ConfigurationSetEventDestination {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ConfigurationSetEventDestination(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ses.ConfigurationSetEventDestination):
        ConfigurationSetEventDestination = ConfigurationSetEventDestination(cdkObject)

    internal fun unwrap(wrapped: ConfigurationSetEventDestination):
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestination = wrapped.cdkObject
  }
}
