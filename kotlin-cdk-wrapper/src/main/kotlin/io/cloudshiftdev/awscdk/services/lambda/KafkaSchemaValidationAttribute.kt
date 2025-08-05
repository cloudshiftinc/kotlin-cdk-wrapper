@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Specific schema validation configuration settings that tell Lambda the message attributes you
 * want to validate and filter using your schema registry.
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
public open class KafkaSchemaValidationAttribute(
  cdkObject: software.amazon.awscdk.services.lambda.KafkaSchemaValidationAttribute,
) : CdkObject(cdkObject) {
  /**
   * The enum to use in `SchemaRegistryConfig.SchemaValidationConfigs.Attribute` property in
   * CloudFormation.
   */
  public open fun `value`(): String = unwrap(this).getValue()

  public companion object {
    public val KEY: KafkaSchemaValidationAttribute =
        KafkaSchemaValidationAttribute.wrap(software.amazon.awscdk.services.lambda.KafkaSchemaValidationAttribute.KEY)

    public val VALUE: KafkaSchemaValidationAttribute =
        KafkaSchemaValidationAttribute.wrap(software.amazon.awscdk.services.lambda.KafkaSchemaValidationAttribute.VALUE)

    public fun of(name: String): KafkaSchemaValidationAttribute =
        software.amazon.awscdk.services.lambda.KafkaSchemaValidationAttribute.of(name).let(KafkaSchemaValidationAttribute::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.KafkaSchemaValidationAttribute):
        KafkaSchemaValidationAttribute = KafkaSchemaValidationAttribute(cdkObject)

    internal fun unwrap(wrapped: KafkaSchemaValidationAttribute):
        software.amazon.awscdk.services.lambda.KafkaSchemaValidationAttribute = wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.KafkaSchemaValidationAttribute
  }
}
