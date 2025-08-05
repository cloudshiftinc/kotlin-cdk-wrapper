@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.lambda.EventRecordFormat
import io.cloudshiftdev.awscdk.services.lambda.KafkaSchemaRegistryAccessConfigType
import io.cloudshiftdev.awscdk.services.lambda.KafkaSchemaValidationConfig
import io.cloudshiftdev.awscdk.services.lambda.SchemaRegistryProps
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for confluent schema registry configuration.
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
public interface ConfluentSchemaRegistryProps : SchemaRegistryProps {
  /**
   * The type of authentication for schema registry credentials.
   *
   * Default: none
   */
  public fun authenticationType(): KafkaSchemaRegistryAccessConfigType

  /**
   * The URI for your schema registry.
   *
   * Default: - none
   */
  public fun schemaRegistryUri(): String

  /**
   * The secret with the schema registry credentials.
   *
   * Default: none
   */
  public fun secret(): ISecret

  /**
   * A builder for [ConfluentSchemaRegistryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authenticationType The type of authentication for schema registry credentials. 
     */
    public fun authenticationType(authenticationType: KafkaSchemaRegistryAccessConfigType)

    /**
     * @param eventRecordFormat The record format that Lambda delivers to your function after schema
     * validation. 
     * * Choose JSON to have Lambda deliver the record to your function as a standard JSON object.
     * * Choose SOURCE to have Lambda deliver the record to your function in its original source
     * format. Lambda removes all schema metadata, such as the schema ID, before sending the record to
     * your function.
     */
    public fun eventRecordFormat(eventRecordFormat: EventRecordFormat)

    /**
     * @param schemaRegistryUri The URI for your schema registry. 
     */
    public fun schemaRegistryUri(schemaRegistryUri: String)

    /**
     * @param schemaValidationConfigs An array of schema validation configuration objects, which
     * tell Lambda the message attributes you want to validate and filter using your schema registry. 
     */
    public fun schemaValidationConfigs(schemaValidationConfigs: List<KafkaSchemaValidationConfig>)

    /**
     * @param schemaValidationConfigs An array of schema validation configuration objects, which
     * tell Lambda the message attributes you want to validate and filter using your schema registry. 
     */
    public fun schemaValidationConfigs(vararg schemaValidationConfigs: KafkaSchemaValidationConfig)

    /**
     * @param secret The secret with the schema registry credentials. 
     */
    public fun secret(secret: ISecret)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.ConfluentSchemaRegistryProps.Builder =
        software.amazon.awscdk.services.lambda.eventsources.ConfluentSchemaRegistryProps.builder()

    /**
     * @param authenticationType The type of authentication for schema registry credentials. 
     */
    override fun authenticationType(authenticationType: KafkaSchemaRegistryAccessConfigType) {
      cdkBuilder.authenticationType(authenticationType.let(KafkaSchemaRegistryAccessConfigType.Companion::unwrap))
    }

    /**
     * @param eventRecordFormat The record format that Lambda delivers to your function after schema
     * validation. 
     * * Choose JSON to have Lambda deliver the record to your function as a standard JSON object.
     * * Choose SOURCE to have Lambda deliver the record to your function in its original source
     * format. Lambda removes all schema metadata, such as the schema ID, before sending the record to
     * your function.
     */
    override fun eventRecordFormat(eventRecordFormat: EventRecordFormat) {
      cdkBuilder.eventRecordFormat(eventRecordFormat.let(EventRecordFormat.Companion::unwrap))
    }

    /**
     * @param schemaRegistryUri The URI for your schema registry. 
     */
    override fun schemaRegistryUri(schemaRegistryUri: String) {
      cdkBuilder.schemaRegistryUri(schemaRegistryUri)
    }

    /**
     * @param schemaValidationConfigs An array of schema validation configuration objects, which
     * tell Lambda the message attributes you want to validate and filter using your schema registry. 
     */
    override
        fun schemaValidationConfigs(schemaValidationConfigs: List<KafkaSchemaValidationConfig>) {
      cdkBuilder.schemaValidationConfigs(schemaValidationConfigs.map(KafkaSchemaValidationConfig.Companion::unwrap))
    }

    /**
     * @param schemaValidationConfigs An array of schema validation configuration objects, which
     * tell Lambda the message attributes you want to validate and filter using your schema registry. 
     */
    override fun schemaValidationConfigs(vararg
        schemaValidationConfigs: KafkaSchemaValidationConfig): Unit =
        schemaValidationConfigs(schemaValidationConfigs.toList())

    /**
     * @param secret The secret with the schema registry credentials. 
     */
    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.lambda.eventsources.ConfluentSchemaRegistryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.eventsources.ConfluentSchemaRegistryProps,
  ) : CdkObject(cdkObject),
      ConfluentSchemaRegistryProps {
    /**
     * The type of authentication for schema registry credentials.
     *
     * Default: none
     */
    override fun authenticationType(): KafkaSchemaRegistryAccessConfigType =
        unwrap(this).getAuthenticationType().let(KafkaSchemaRegistryAccessConfigType::wrap)

    /**
     * The record format that Lambda delivers to your function after schema validation.
     *
     * * Choose JSON to have Lambda deliver the record to your function as a standard JSON object.
     * * Choose SOURCE to have Lambda deliver the record to your function in its original source
     * format. Lambda removes all schema metadata, such as the schema ID, before sending the record to
     * your function.
     *
     * Default: - none
     */
    override fun eventRecordFormat(): EventRecordFormat =
        unwrap(this).getEventRecordFormat().let(EventRecordFormat::wrap)

    /**
     * The URI for your schema registry.
     *
     * Default: - none
     */
    override fun schemaRegistryUri(): String = unwrap(this).getSchemaRegistryUri()

    /**
     * An array of schema validation configuration objects, which tell Lambda the message attributes
     * you want to validate and filter using your schema registry.
     *
     * Default: - none
     */
    override fun schemaValidationConfigs(): List<KafkaSchemaValidationConfig> =
        unwrap(this).getSchemaValidationConfigs().map(KafkaSchemaValidationConfig::wrap)

    /**
     * The secret with the schema registry credentials.
     *
     * Default: none
     */
    override fun secret(): ISecret = unwrap(this).getSecret().let(ISecret::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ConfluentSchemaRegistryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.ConfluentSchemaRegistryProps):
        ConfluentSchemaRegistryProps = CdkObjectWrappers.wrap(cdkObject) as?
        ConfluentSchemaRegistryProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConfluentSchemaRegistryProps):
        software.amazon.awscdk.services.lambda.eventsources.ConfluentSchemaRegistryProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.ConfluentSchemaRegistryProps
  }
}
