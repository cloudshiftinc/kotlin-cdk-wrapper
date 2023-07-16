@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationProps
import software.amazon.awscdk.services.ses.EmailSendingEvent
import software.amazon.awscdk.services.ses.EventDestination
import software.amazon.awscdk.services.ses.IConfigurationSet

@CdkDslMarker
public class ConfigurationSetEventDestinationPropsDsl {
  private val cdkBuilder: ConfigurationSetEventDestinationProps.Builder =
      ConfigurationSetEventDestinationProps.builder()

  private val _events: MutableList<EmailSendingEvent> = mutableListOf()

  public fun configurationSet(configurationSet: IConfigurationSet) {
    cdkBuilder.configurationSet(configurationSet)
  }

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

  public fun build(): ConfigurationSetEventDestinationProps {
    if(_events.isNotEmpty()) cdkBuilder.events(_events)
    return cdkBuilder.build()
  }
}
