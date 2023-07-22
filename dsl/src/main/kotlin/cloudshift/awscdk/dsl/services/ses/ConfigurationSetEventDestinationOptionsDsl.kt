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
@CdkDslMarker
public class ConfigurationSetEventDestinationOptionsDsl {
  private val cdkBuilder: ConfigurationSetEventDestinationOptions.Builder =
      ConfigurationSetEventDestinationOptions.builder()

  private val _events: MutableList<EmailSendingEvent> = mutableListOf()

  /**
   * @param configurationSetEventDestinationName A name for the configuration set event destination.
   */
  public fun configurationSetEventDestinationName(configurationSetEventDestinationName: String) {
    cdkBuilder.configurationSetEventDestinationName(configurationSetEventDestinationName)
  }

  /**
   * @param destination The event destination. 
   */
  public fun destination(destination: EventDestination) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param enabled Whether Amazon SES publishes events to this destination.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param events The type of email sending events to publish to the event destination.
   */
  public fun events(vararg events: EmailSendingEvent) {
    _events.addAll(listOf(*events))
  }

  /**
   * @param events The type of email sending events to publish to the event destination.
   */
  public fun events(events: Collection<EmailSendingEvent>) {
    _events.addAll(events)
  }

  public fun build(): ConfigurationSetEventDestinationOptions {
    if(_events.isNotEmpty()) cdkBuilder.events(_events)
    return cdkBuilder.build()
  }
}
