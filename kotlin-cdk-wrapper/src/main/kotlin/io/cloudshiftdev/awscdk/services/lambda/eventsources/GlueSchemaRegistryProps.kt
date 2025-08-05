@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.glue.CfnRegistry
import io.cloudshiftdev.awscdk.services.lambda.EventRecordFormat
import io.cloudshiftdev.awscdk.services.lambda.KafkaSchemaValidationConfig
import io.cloudshiftdev.awscdk.services.lambda.SchemaRegistryProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for glue schema registry configuration.
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
public interface GlueSchemaRegistryProps : SchemaRegistryProps {
  /**
   * The CfnRegistry reference of your glue schema registry.
   *
   * If used, schemaRegistryArn will be ignored.
   *
   * Default: - none
   */
  public fun schemaRegistry(): CfnRegistry? =
      unwrap(this).getSchemaRegistry()?.let(CfnRegistry::wrap)

  /**
   * The Arn of your glue schema registry.
   *
   * Default: - none
   */
  public fun schemaRegistryArn(): String? = unwrap(this).getSchemaRegistryArn()

  /**
   * A builder for [GlueSchemaRegistryProps]
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param schemaRegistry The CfnRegistry reference of your glue schema registry.
     * If used, schemaRegistryArn will be ignored.
     */
    public fun schemaRegistry(schemaRegistry: CfnRegistry)

    /**
     * @param schemaRegistryArn The Arn of your glue schema registry.
     */
    public fun schemaRegistryArn(schemaRegistryArn: String)

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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.GlueSchemaRegistryProps.Builder =
        software.amazon.awscdk.services.lambda.eventsources.GlueSchemaRegistryProps.builder()

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
     * @param schemaRegistry The CfnRegistry reference of your glue schema registry.
     * If used, schemaRegistryArn will be ignored.
     */
    override fun schemaRegistry(schemaRegistry: CfnRegistry) {
      cdkBuilder.schemaRegistry(schemaRegistry.let(CfnRegistry.Companion::unwrap))
    }

    /**
     * @param schemaRegistryArn The Arn of your glue schema registry.
     */
    override fun schemaRegistryArn(schemaRegistryArn: String) {
      cdkBuilder.schemaRegistryArn(schemaRegistryArn)
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

    public fun build(): software.amazon.awscdk.services.lambda.eventsources.GlueSchemaRegistryProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.eventsources.GlueSchemaRegistryProps,
  ) : CdkObject(cdkObject),
      GlueSchemaRegistryProps {
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
     * The CfnRegistry reference of your glue schema registry.
     *
     * If used, schemaRegistryArn will be ignored.
     *
     * Default: - none
     */
    override fun schemaRegistry(): CfnRegistry? =
        unwrap(this).getSchemaRegistry()?.let(CfnRegistry::wrap)

    /**
     * The Arn of your glue schema registry.
     *
     * Default: - none
     */
    override fun schemaRegistryArn(): String? = unwrap(this).getSchemaRegistryArn()

    /**
     * An array of schema validation configuration objects, which tell Lambda the message attributes
     * you want to validate and filter using your schema registry.
     *
     * Default: - none
     */
    override fun schemaValidationConfigs(): List<KafkaSchemaValidationConfig> =
        unwrap(this).getSchemaValidationConfigs().map(KafkaSchemaValidationConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GlueSchemaRegistryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.GlueSchemaRegistryProps):
        GlueSchemaRegistryProps = CdkObjectWrappers.wrap(cdkObject) as? GlueSchemaRegistryProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: GlueSchemaRegistryProps):
        software.amazon.awscdk.services.lambda.eventsources.GlueSchemaRegistryProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.GlueSchemaRegistryProps
  }
}
