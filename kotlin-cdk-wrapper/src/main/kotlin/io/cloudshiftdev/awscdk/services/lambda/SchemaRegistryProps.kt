@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for schema registry configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * EventRecordFormat eventRecordFormat;
 * KafkaSchemaValidationAttribute kafkaSchemaValidationAttribute;
 * SchemaRegistryProps schemaRegistryProps = SchemaRegistryProps.builder()
 * .eventRecordFormat(eventRecordFormat)
 * .schemaValidationConfigs(List.of(KafkaSchemaValidationConfig.builder()
 * .attribute(kafkaSchemaValidationAttribute)
 * .build()))
 * .build();
 * ```
 */
public interface SchemaRegistryProps {
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
  public fun eventRecordFormat(): EventRecordFormat

  /**
   * An array of schema validation configuration objects, which tell Lambda the message attributes
   * you want to validate and filter using your schema registry.
   *
   * Default: - none
   */
  public fun schemaValidationConfigs(): List<KafkaSchemaValidationConfig>

  /**
   * A builder for [SchemaRegistryProps]
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
    private val cdkBuilder: software.amazon.awscdk.services.lambda.SchemaRegistryProps.Builder =
        software.amazon.awscdk.services.lambda.SchemaRegistryProps.builder()

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

    public fun build(): software.amazon.awscdk.services.lambda.SchemaRegistryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.SchemaRegistryProps,
  ) : CdkObject(cdkObject),
      SchemaRegistryProps {
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
     * An array of schema validation configuration objects, which tell Lambda the message attributes
     * you want to validate and filter using your schema registry.
     *
     * Default: - none
     */
    override fun schemaValidationConfigs(): List<KafkaSchemaValidationConfig> =
        unwrap(this).getSchemaValidationConfigs().map(KafkaSchemaValidationConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SchemaRegistryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.SchemaRegistryProps):
        SchemaRegistryProps = CdkObjectWrappers.wrap(cdkObject) as? SchemaRegistryProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SchemaRegistryProps):
        software.amazon.awscdk.services.lambda.SchemaRegistryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.SchemaRegistryProps
  }
}
