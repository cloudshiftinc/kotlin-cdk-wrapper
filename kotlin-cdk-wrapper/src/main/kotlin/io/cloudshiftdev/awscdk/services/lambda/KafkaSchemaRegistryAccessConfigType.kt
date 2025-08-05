@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * The type of authentication protocol for your schema registry.
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
public open class KafkaSchemaRegistryAccessConfigType(
  cdkObject: software.amazon.awscdk.services.lambda.KafkaSchemaRegistryAccessConfigType,
) : CdkObject(cdkObject) {
  /**
   * The key to use in `SchemaRegistryConfig.AccessConfig.Type` property in CloudFormation.
   */
  public open fun type(): String = unwrap(this).getType()

  public companion object {
    public val BASIC_AUTH: KafkaSchemaRegistryAccessConfigType =
        KafkaSchemaRegistryAccessConfigType.wrap(software.amazon.awscdk.services.lambda.KafkaSchemaRegistryAccessConfigType.BASIC_AUTH)

    public val CLIENT_CERTIFICATE_TLS_AUTH: KafkaSchemaRegistryAccessConfigType =
        KafkaSchemaRegistryAccessConfigType.wrap(software.amazon.awscdk.services.lambda.KafkaSchemaRegistryAccessConfigType.CLIENT_CERTIFICATE_TLS_AUTH)

    public val SERVER_ROOT_CA_CERTIFICATE: KafkaSchemaRegistryAccessConfigType =
        KafkaSchemaRegistryAccessConfigType.wrap(software.amazon.awscdk.services.lambda.KafkaSchemaRegistryAccessConfigType.SERVER_ROOT_CA_CERTIFICATE)

    public fun of(name: String): KafkaSchemaRegistryAccessConfigType =
        software.amazon.awscdk.services.lambda.KafkaSchemaRegistryAccessConfigType.of(name).let(KafkaSchemaRegistryAccessConfigType::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.KafkaSchemaRegistryAccessConfigType):
        KafkaSchemaRegistryAccessConfigType = KafkaSchemaRegistryAccessConfigType(cdkObject)

    internal fun unwrap(wrapped: KafkaSchemaRegistryAccessConfigType):
        software.amazon.awscdk.services.lambda.KafkaSchemaRegistryAccessConfigType =
        wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.KafkaSchemaRegistryAccessConfigType
  }
}
