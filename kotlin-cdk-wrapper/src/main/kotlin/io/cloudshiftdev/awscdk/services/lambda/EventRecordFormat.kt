@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * The format target function should recieve record in.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.ManagedKafkaEventSource;
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.ConfluentSchemaRegistry;
 * import io.cloudshiftdev.awscdk.services.secretsmanager.Secret;
 * // Your MSK cluster arn
 * String clusterArn;
 * Function myFunction;
 * // The Kafka topic you want to subscribe to
 * String topic = "some-cool-topic";
 * Secret secret = Secret.Builder.create(this,
 * "Secret").secretName("AmazonMSK_KafkaSecret").build();
 * myFunction.addEventSource(ManagedKafkaEventSource.Builder.create()
 * .clusterArn(clusterArn)
 * .topic(topic)
 * .startingPosition(StartingPosition.TRIM_HORIZON)
 * .provisionedPollerConfig(ProvisionedPollerConfig.builder()
 * .minimumPollers(1)
 * .maximumPollers(3)
 * .build())
 * .schemaRegistryConfig(ConfluentSchemaRegistry.Builder.create()
 * .schemaRegistryUri("https://example.com")
 * .eventRecordFormat(EventRecordFormat.JSON)
 * .authenticationType(KafkaSchemaRegistryAccessConfigType.BASIC_AUTH)
 * .secret(secret)
 * .schemaValidationConfigs(List.of(KafkaSchemaValidationConfig.builder().attribute(KafkaSchemaValidationAttribute.KEY).build()))
 * .build())
 * .build());
 * ```
 */
public open class EventRecordFormat(
  cdkObject: software.amazon.awscdk.services.lambda.EventRecordFormat,
) : CdkObject(cdkObject) {
  /**
   * The enum to use in `SchemaRegistryConfig.EventRecordFormat` property in CloudFormation.
   */
  public open fun `value`(): String = unwrap(this).getValue()

  public companion object {
    public val JSON: EventRecordFormat =
        EventRecordFormat.wrap(software.amazon.awscdk.services.lambda.EventRecordFormat.JSON)

    public val SOURCE: EventRecordFormat =
        EventRecordFormat.wrap(software.amazon.awscdk.services.lambda.EventRecordFormat.SOURCE)

    public fun of(name: String): EventRecordFormat =
        software.amazon.awscdk.services.lambda.EventRecordFormat.of(name).let(EventRecordFormat::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.EventRecordFormat):
        EventRecordFormat = EventRecordFormat(cdkObject)

    internal fun unwrap(wrapped: EventRecordFormat):
        software.amazon.awscdk.services.lambda.EventRecordFormat = wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.EventRecordFormat
  }
}
