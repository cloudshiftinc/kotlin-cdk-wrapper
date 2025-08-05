@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.EventRecordFormat
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceMapping
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.lambda.ISchemaRegistry
import io.cloudshiftdev.awscdk.services.lambda.KafkaSchemaRegistryAccessConfigType
import io.cloudshiftdev.awscdk.services.lambda.KafkaSchemaRegistryConfig
import io.cloudshiftdev.awscdk.services.lambda.KafkaSchemaValidationConfig
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Confluent schema registry configuration for a Lambda event source.
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
public open class ConfluentSchemaRegistry(
  cdkObject: software.amazon.awscdk.services.lambda.eventsources.ConfluentSchemaRegistry,
) : CdkObject(cdkObject),
    ISchemaRegistry {
  public constructor(props: ConfluentSchemaRegistryProps) :
      this(software.amazon.awscdk.services.lambda.eventsources.ConfluentSchemaRegistry(props.let(ConfluentSchemaRegistryProps.Companion::unwrap))
  )

  public constructor(props: ConfluentSchemaRegistryProps.Builder.() -> Unit) :
      this(ConfluentSchemaRegistryProps(props)
  )

  /**
   * Returns a schema registry configuration.
   *
   * @param _target 
   * @param targetHandler 
   */
  public override fun bind(target: IEventSourceMapping, targetHandler: IFunction):
      KafkaSchemaRegistryConfig =
      unwrap(this).bind(target.let(IEventSourceMapping.Companion::unwrap),
      targetHandler.let(IFunction.Companion::unwrap)).let(KafkaSchemaRegistryConfig::wrap)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.lambda.eventsources.ConfluentSchemaRegistry].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The type of authentication for schema registry credentials.
     *
     * Default: none
     *
     * @param authenticationType The type of authentication for schema registry credentials. 
     */
    public fun authenticationType(authenticationType: KafkaSchemaRegistryAccessConfigType)

    /**
     * The record format that Lambda delivers to your function after schema validation.
     *
     * * Choose JSON to have Lambda deliver the record to your function as a standard JSON object.
     * * Choose SOURCE to have Lambda deliver the record to your function in its original source
     * format. Lambda removes all schema metadata, such as the schema ID, before sending the record to
     * your function.
     *
     * Default: - none
     *
     * @param eventRecordFormat The record format that Lambda delivers to your function after schema
     * validation. 
     */
    public fun eventRecordFormat(eventRecordFormat: EventRecordFormat)

    /**
     * The URI for your schema registry.
     *
     * Default: - none
     *
     * @param schemaRegistryUri The URI for your schema registry. 
     */
    public fun schemaRegistryUri(schemaRegistryUri: String)

    /**
     * An array of schema validation configuration objects, which tell Lambda the message attributes
     * you want to validate and filter using your schema registry.
     *
     * Default: - none
     *
     * @param schemaValidationConfigs An array of schema validation configuration objects, which
     * tell Lambda the message attributes you want to validate and filter using your schema registry. 
     */
    public fun schemaValidationConfigs(schemaValidationConfigs: List<KafkaSchemaValidationConfig>)

    /**
     * An array of schema validation configuration objects, which tell Lambda the message attributes
     * you want to validate and filter using your schema registry.
     *
     * Default: - none
     *
     * @param schemaValidationConfigs An array of schema validation configuration objects, which
     * tell Lambda the message attributes you want to validate and filter using your schema registry. 
     */
    public fun schemaValidationConfigs(vararg schemaValidationConfigs: KafkaSchemaValidationConfig)

    /**
     * The secret with the schema registry credentials.
     *
     * Default: none
     *
     * @param secret The secret with the schema registry credentials. 
     */
    public fun secret(secret: ISecret)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.ConfluentSchemaRegistry.Builder =
        software.amazon.awscdk.services.lambda.eventsources.ConfluentSchemaRegistry.Builder.create()

    /**
     * The type of authentication for schema registry credentials.
     *
     * Default: none
     *
     * @param authenticationType The type of authentication for schema registry credentials. 
     */
    override fun authenticationType(authenticationType: KafkaSchemaRegistryAccessConfigType) {
      cdkBuilder.authenticationType(authenticationType.let(KafkaSchemaRegistryAccessConfigType.Companion::unwrap))
    }

    /**
     * The record format that Lambda delivers to your function after schema validation.
     *
     * * Choose JSON to have Lambda deliver the record to your function as a standard JSON object.
     * * Choose SOURCE to have Lambda deliver the record to your function in its original source
     * format. Lambda removes all schema metadata, such as the schema ID, before sending the record to
     * your function.
     *
     * Default: - none
     *
     * @param eventRecordFormat The record format that Lambda delivers to your function after schema
     * validation. 
     */
    override fun eventRecordFormat(eventRecordFormat: EventRecordFormat) {
      cdkBuilder.eventRecordFormat(eventRecordFormat.let(EventRecordFormat.Companion::unwrap))
    }

    /**
     * The URI for your schema registry.
     *
     * Default: - none
     *
     * @param schemaRegistryUri The URI for your schema registry. 
     */
    override fun schemaRegistryUri(schemaRegistryUri: String) {
      cdkBuilder.schemaRegistryUri(schemaRegistryUri)
    }

    /**
     * An array of schema validation configuration objects, which tell Lambda the message attributes
     * you want to validate and filter using your schema registry.
     *
     * Default: - none
     *
     * @param schemaValidationConfigs An array of schema validation configuration objects, which
     * tell Lambda the message attributes you want to validate and filter using your schema registry. 
     */
    override
        fun schemaValidationConfigs(schemaValidationConfigs: List<KafkaSchemaValidationConfig>) {
      cdkBuilder.schemaValidationConfigs(schemaValidationConfigs.map(KafkaSchemaValidationConfig.Companion::unwrap))
    }

    /**
     * An array of schema validation configuration objects, which tell Lambda the message attributes
     * you want to validate and filter using your schema registry.
     *
     * Default: - none
     *
     * @param schemaValidationConfigs An array of schema validation configuration objects, which
     * tell Lambda the message attributes you want to validate and filter using your schema registry. 
     */
    override fun schemaValidationConfigs(vararg
        schemaValidationConfigs: KafkaSchemaValidationConfig): Unit =
        schemaValidationConfigs(schemaValidationConfigs.toList())

    /**
     * The secret with the schema registry credentials.
     *
     * Default: none
     *
     * @param secret The secret with the schema registry credentials. 
     */
    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.eventsources.ConfluentSchemaRegistry
        = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ConfluentSchemaRegistry {
      val builderImpl = BuilderImpl()
      return ConfluentSchemaRegistry(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.ConfluentSchemaRegistry):
        ConfluentSchemaRegistry = ConfluentSchemaRegistry(cdkObject)

    internal fun unwrap(wrapped: ConfluentSchemaRegistry):
        software.amazon.awscdk.services.lambda.eventsources.ConfluentSchemaRegistry =
        wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.ConfluentSchemaRegistry
  }
}
