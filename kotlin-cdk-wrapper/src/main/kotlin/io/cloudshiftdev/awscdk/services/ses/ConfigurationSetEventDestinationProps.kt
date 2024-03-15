@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ConfigurationSetEventDestinationProps : ConfigurationSetEventDestinationOptions {
  public fun configurationSet(): IConfigurationSet

  @CdkDslMarker
  public interface Builder {
    public fun configurationSet(configurationSet: IConfigurationSet)

    public fun configurationSetEventDestinationName(configurationSetEventDestinationName: String)

    public fun destination(destination: EventDestination)

    public fun enabled(enabled: Boolean)

    public fun events(events: List<EmailSendingEvent>)

    public fun events(vararg events: EmailSendingEvent)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationProps.Builder =
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationProps.builder()

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

    override fun events(vararg events: EmailSendingEvent): Unit = events(events.toList())

    public fun build(): software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationProps,
  ) : CdkObject(cdkObject), ConfigurationSetEventDestinationProps {
    override fun configurationSet(): IConfigurationSet =
        unwrap(this).getConfigurationSet().let(IConfigurationSet::wrap)

    override fun configurationSetEventDestinationName(): String? =
        unwrap(this).getConfigurationSetEventDestinationName()

    override fun destination(): EventDestination =
        unwrap(this).getDestination().let(EventDestination::wrap)

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

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
        ConfigurationSetEventDestinationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConfigurationSetEventDestinationProps):
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationProps
  }
}
