@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ses.ConfigurationSetEventDestination
import software.amazon.awscdk.services.ses.EmailSendingEvent
import software.amazon.awscdk.services.ses.EventDestination
import software.amazon.awscdk.services.ses.IConfigurationSet
import software.constructs.Construct

@CdkDslMarker
public class ConfigurationSetEventDestinationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: ConfigurationSetEventDestination.Builder =
      ConfigurationSetEventDestination.Builder.create(scope, id)

  private val _events: MutableList<EmailSendingEvent> = mutableListOf()

  /**
   * The configuration set that contains the event destination.
   *
   * @param configurationSet The configuration set that contains the event destination. 
   */
  public fun configurationSet(configurationSet: IConfigurationSet) {
    cdkBuilder.configurationSet(configurationSet)
  }

  /**
   * A name for the configuration set event destination.
   *
   * Default: - a CloudFormation generated name
   *
   * @param configurationSetEventDestinationName A name for the configuration set event destination.
   * 
   */
  public fun configurationSetEventDestinationName(configurationSetEventDestinationName: String) {
    cdkBuilder.configurationSetEventDestinationName(configurationSetEventDestinationName)
  }

  /**
   * The event destination.
   *
   * @param destination The event destination. 
   */
  public fun destination(destination: EventDestination) {
    cdkBuilder.destination(destination)
  }

  /**
   * Whether Amazon SES publishes events to this destination.
   *
   * Default: true
   *
   * @param enabled Whether Amazon SES publishes events to this destination. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * The type of email sending events to publish to the event destination.
   *
   * Default: - send all event types
   *
   * @param events The type of email sending events to publish to the event destination. 
   */
  public fun events(vararg events: EmailSendingEvent) {
    _events.addAll(listOf(*events))
  }

  /**
   * The type of email sending events to publish to the event destination.
   *
   * Default: - send all event types
   *
   * @param events The type of email sending events to publish to the event destination. 
   */
  public fun events(events: Collection<EmailSendingEvent>) {
    _events.addAll(events)
  }

  public fun build(): ConfigurationSetEventDestination {
    if(_events.isNotEmpty()) cdkBuilder.events(_events)
    return cdkBuilder.build()
  }
}
