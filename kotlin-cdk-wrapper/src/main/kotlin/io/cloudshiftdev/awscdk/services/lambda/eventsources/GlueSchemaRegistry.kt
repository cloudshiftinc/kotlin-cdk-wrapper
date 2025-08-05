@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.glue.CfnRegistry
import io.cloudshiftdev.awscdk.services.lambda.EventRecordFormat
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceMapping
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.lambda.ISchemaRegistry
import io.cloudshiftdev.awscdk.services.lambda.KafkaSchemaRegistryConfig
import io.cloudshiftdev.awscdk.services.lambda.KafkaSchemaValidationConfig
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Glue schema registry configuration for a Lambda event source.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.glue.CfnRegistry;
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.ManagedKafkaEventSource;
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.GlueSchemaRegistry;
 * // Your MSK cluster arn
 * String clusterArn;
 * Function myFunction;
 * // The Kafka topic you want to subscribe to
 * String topic = "some-cool-topic";
 * // Your Glue Schema Registry
 * CfnRegistry glueRegistry = CfnRegistry.Builder.create(this, "Registry")
 * .name("schema-registry")
 * .description("Schema registry for event source")
 * .build();
 * myFunction.addEventSource(ManagedKafkaEventSource.Builder.create()
 * .clusterArn(clusterArn)
 * .topic(topic)
 * .startingPosition(StartingPosition.TRIM_HORIZON)
 * .provisionedPollerConfig(ProvisionedPollerConfig.builder()
 * .minimumPollers(1)
 * .maximumPollers(3)
 * .build())
 * .schemaRegistryConfig(GlueSchemaRegistry.Builder.create()
 * .schemaRegistry(glueRegistry)
 * .eventRecordFormat(EventRecordFormat.JSON)
 * .schemaValidationConfigs(List.of(KafkaSchemaValidationConfig.builder().attribute(KafkaSchemaValidationAttribute.KEY).build()))
 * .build())
 * .build());
 * ```
 */
public open class GlueSchemaRegistry(
  cdkObject: software.amazon.awscdk.services.lambda.eventsources.GlueSchemaRegistry,
) : CdkObject(cdkObject),
    ISchemaRegistry {
  public constructor(props: GlueSchemaRegistryProps) :
      this(software.amazon.awscdk.services.lambda.eventsources.GlueSchemaRegistry(props.let(GlueSchemaRegistryProps.Companion::unwrap))
  )

  public constructor(props: GlueSchemaRegistryProps.Builder.() -> Unit) :
      this(GlueSchemaRegistryProps(props)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.eventsources.GlueSchemaRegistry].
   */
  @CdkDslMarker
  public interface Builder {
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
     * The CfnRegistry reference of your glue schema registry.
     *
     * If used, schemaRegistryArn will be ignored.
     *
     * Default: - none
     *
     * @param schemaRegistry The CfnRegistry reference of your glue schema registry. 
     */
    public fun schemaRegistry(schemaRegistry: CfnRegistry)

    /**
     * The Arn of your glue schema registry.
     *
     * Default: - none
     *
     * @param schemaRegistryArn The Arn of your glue schema registry. 
     */
    public fun schemaRegistryArn(schemaRegistryArn: String)

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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.GlueSchemaRegistry.Builder =
        software.amazon.awscdk.services.lambda.eventsources.GlueSchemaRegistry.Builder.create()

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
     * The CfnRegistry reference of your glue schema registry.
     *
     * If used, schemaRegistryArn will be ignored.
     *
     * Default: - none
     *
     * @param schemaRegistry The CfnRegistry reference of your glue schema registry. 
     */
    override fun schemaRegistry(schemaRegistry: CfnRegistry) {
      cdkBuilder.schemaRegistry(schemaRegistry.let(CfnRegistry.Companion::unwrap))
    }

    /**
     * The Arn of your glue schema registry.
     *
     * Default: - none
     *
     * @param schemaRegistryArn The Arn of your glue schema registry. 
     */
    override fun schemaRegistryArn(schemaRegistryArn: String) {
      cdkBuilder.schemaRegistryArn(schemaRegistryArn)
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

    public fun build(): software.amazon.awscdk.services.lambda.eventsources.GlueSchemaRegistry =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GlueSchemaRegistry {
      val builderImpl = BuilderImpl()
      return GlueSchemaRegistry(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.GlueSchemaRegistry):
        GlueSchemaRegistry = GlueSchemaRegistry(cdkObject)

    internal fun unwrap(wrapped: GlueSchemaRegistry):
        software.amazon.awscdk.services.lambda.eventsources.GlueSchemaRegistry = wrapped.cdkObject
        as software.amazon.awscdk.services.lambda.eventsources.GlueSchemaRegistry
  }
}
