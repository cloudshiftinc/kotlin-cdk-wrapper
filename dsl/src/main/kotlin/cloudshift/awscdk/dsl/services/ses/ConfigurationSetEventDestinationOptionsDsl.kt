@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationOptions
import software.amazon.awscdk.services.ses.EmailSendingEvent
import software.amazon.awscdk.services.ses.EventDestination

@CdkDslMarker
public class ConfigurationSetEventDestinationOptionsDsl {
  private val cdkBuilder: ConfigurationSetEventDestinationOptions.Builder =
      ConfigurationSetEventDestinationOptions.builder()

  private val _events: MutableList<EmailSendingEvent> = mutableListOf()

  public fun configurationSetEventDestinationName(configurationSetEventDestinationName: String) {
    cdkBuilder.configurationSetEventDestinationName(configurationSetEventDestinationName)
  }

  public fun destination(destination: EventDestination) {
    cdkBuilder.destination(destination)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun events(vararg events: EmailSendingEvent) {
    _events.addAll(listOf(*events))
  }

  public fun events(events: Collection<EmailSendingEvent>) {
    _events.addAll(events)
  }

  public fun build(): ConfigurationSetEventDestinationOptions {
    if(_events.isNotEmpty()) cdkBuilder.events(_events)
    return cdkBuilder.build()
  }
}
