@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A configuration set event destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * ConfigurationSet configurationSet;
 * EventDestination eventDestination;
 * ConfigurationSetEventDestination configurationSetEventDestination =
 * ConfigurationSetEventDestination.Builder.create(this, "MyConfigurationSetEventDestination")
 * .configurationSet(configurationSet)
 * .destination(eventDestination)
 * // the properties below are optional
 * .configurationSetEventDestinationName("configurationSetEventDestinationName")
 * .enabled(false)
 * .events(List.of(EmailSendingEvent.SEND))
 * .build();
 * ```
 */
public open class ConfigurationSetEventDestination(
  cdkObject: software.amazon.awscdk.services.ses.ConfigurationSetEventDestination,
) : Resource(cdkObject), IConfigurationSetEventDestination {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ConfigurationSetEventDestinationProps,
  ) :
      this(software.amazon.awscdk.services.ses.ConfigurationSetEventDestination(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(ConfigurationSetEventDestinationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ConfigurationSetEventDestinationProps.Builder.() -> Unit,
  ) : this(scope, id, ConfigurationSetEventDestinationProps(props)
  )

  /**
   * The ID of the configuration set event destination.
   */
  public override fun configurationSetEventDestinationId(): String =
      unwrap(this).getConfigurationSetEventDestinationId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.ConfigurationSetEventDestination].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The configuration set that contains the event destination.
     *
     * @param configurationSet The configuration set that contains the event destination. 
     */
    public fun configurationSet(configurationSet: IConfigurationSet)

    /**
     * A name for the configuration set event destination.
     *
     * Default: - a CloudFormation generated name
     *
     * @param configurationSetEventDestinationName A name for the configuration set event
     * destination. 
     */
    public fun configurationSetEventDestinationName(configurationSetEventDestinationName: String)

    /**
     * The event destination.
     *
     * @param destination The event destination. 
     */
    public fun destination(destination: EventDestination)

    /**
     * Whether Amazon SES publishes events to this destination.
     *
     * Default: true
     *
     * @param enabled Whether Amazon SES publishes events to this destination. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * The type of email sending events to publish to the event destination.
     *
     * Default: - send all event types
     *
     * @param events The type of email sending events to publish to the event destination. 
     */
    public fun events(events: List<EmailSendingEvent>)

    /**
     * The type of email sending events to publish to the event destination.
     *
     * Default: - send all event types
     *
     * @param events The type of email sending events to publish to the event destination. 
     */
    public fun events(vararg events: EmailSendingEvent)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestination.Builder =
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestination.Builder.create(scope,
        id)

    /**
     * The configuration set that contains the event destination.
     *
     * @param configurationSet The configuration set that contains the event destination. 
     */
    override fun configurationSet(configurationSet: IConfigurationSet) {
      cdkBuilder.configurationSet(configurationSet.let(IConfigurationSet::unwrap))
    }

    /**
     * A name for the configuration set event destination.
     *
     * Default: - a CloudFormation generated name
     *
     * @param configurationSetEventDestinationName A name for the configuration set event
     * destination. 
     */
    override
        fun configurationSetEventDestinationName(configurationSetEventDestinationName: String) {
      cdkBuilder.configurationSetEventDestinationName(configurationSetEventDestinationName)
    }

    /**
     * The event destination.
     *
     * @param destination The event destination. 
     */
    override fun destination(destination: EventDestination) {
      cdkBuilder.destination(destination.let(EventDestination::unwrap))
    }

    /**
     * Whether Amazon SES publishes events to this destination.
     *
     * Default: true
     *
     * @param enabled Whether Amazon SES publishes events to this destination. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * The type of email sending events to publish to the event destination.
     *
     * Default: - send all event types
     *
     * @param events The type of email sending events to publish to the event destination. 
     */
    override fun events(events: List<EmailSendingEvent>) {
      cdkBuilder.events(events.map(EmailSendingEvent::unwrap))
    }

    /**
     * The type of email sending events to publish to the event destination.
     *
     * Default: - send all event types
     *
     * @param events The type of email sending events to publish to the event destination. 
     */
    override fun events(vararg events: EmailSendingEvent): Unit = events(events.toList())

    public fun build(): software.amazon.awscdk.services.ses.ConfigurationSetEventDestination =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromConfigurationSetEventDestinationId(
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
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestination = wrapped.cdkObject as
        software.amazon.awscdk.services.ses.ConfigurationSetEventDestination
  }
}
