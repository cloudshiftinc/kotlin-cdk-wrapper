@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * (Amazon MSK and self-managed Apache Kafka only) Specific configuration settings for a Kafka
 * schema registry.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * EventRecordFormat eventRecordFormat;
 * KafkaSchemaRegistryAccessConfigType kafkaSchemaRegistryAccessConfigType;
 * KafkaSchemaValidationAttribute kafkaSchemaValidationAttribute;
 * KafkaSchemaRegistryConfig kafkaSchemaRegistryConfig = KafkaSchemaRegistryConfig.builder()
 * .eventRecordFormat(eventRecordFormat)
 * .schemaRegistryUri("schemaRegistryUri")
 * .schemaValidationConfigs(List.of(KafkaSchemaValidationConfig.builder()
 * .attribute(kafkaSchemaValidationAttribute)
 * .build()))
 * // the properties below are optional
 * .accessConfigs(List.of(KafkaSchemaRegistryAccessConfig.builder()
 * .type(kafkaSchemaRegistryAccessConfigType)
 * .uri("uri")
 * .build()))
 * .build();
 * ```
 */
public interface KafkaSchemaRegistryConfig {
  /**
   * An array of access configuration objects that tell Lambda how to authenticate with your schema
   * registry.
   *
   * Default: - none
   */
  public fun accessConfigs(): List<KafkaSchemaRegistryAccessConfig> =
      unwrap(this).getAccessConfigs()?.map(KafkaSchemaRegistryAccessConfig::wrap) ?: emptyList()

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
   * The URI for your schema registry.
   *
   * The correct URI format depends on the type of schema registry you're using.
   *
   * Default: - none
   */
  public fun schemaRegistryUri(): String

  /**
   * An array of schema validation configuration objects, which tell Lambda the message attributes
   * you want to validate and filter using your schema registry.
   *
   * Default: - none
   */
  public fun schemaValidationConfigs(): List<KafkaSchemaValidationConfig>

  /**
   * A builder for [KafkaSchemaRegistryConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessConfigs An array of access configuration objects that tell Lambda how to
     * authenticate with your schema registry.
     */
    public fun accessConfigs(accessConfigs: List<KafkaSchemaRegistryAccessConfig>)

    /**
     * @param accessConfigs An array of access configuration objects that tell Lambda how to
     * authenticate with your schema registry.
     */
    public fun accessConfigs(vararg accessConfigs: KafkaSchemaRegistryAccessConfig)

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
     * The correct URI format depends on the type of schema registry you're using.
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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.KafkaSchemaRegistryConfig.Builder
        = software.amazon.awscdk.services.lambda.KafkaSchemaRegistryConfig.builder()

    /**
     * @param accessConfigs An array of access configuration objects that tell Lambda how to
     * authenticate with your schema registry.
     */
    override fun accessConfigs(accessConfigs: List<KafkaSchemaRegistryAccessConfig>) {
      cdkBuilder.accessConfigs(accessConfigs.map(KafkaSchemaRegistryAccessConfig.Companion::unwrap))
    }

    /**
     * @param accessConfigs An array of access configuration objects that tell Lambda how to
     * authenticate with your schema registry.
     */
    override fun accessConfigs(vararg accessConfigs: KafkaSchemaRegistryAccessConfig): Unit =
        accessConfigs(accessConfigs.toList())

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
     * The correct URI format depends on the type of schema registry you're using.
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

    public fun build(): software.amazon.awscdk.services.lambda.KafkaSchemaRegistryConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.KafkaSchemaRegistryConfig,
  ) : CdkObject(cdkObject),
      KafkaSchemaRegistryConfig {
    /**
     * An array of access configuration objects that tell Lambda how to authenticate with your
     * schema registry.
     *
     * Default: - none
     */
    override fun accessConfigs(): List<KafkaSchemaRegistryAccessConfig> =
        unwrap(this).getAccessConfigs()?.map(KafkaSchemaRegistryAccessConfig::wrap) ?: emptyList()

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
     * The correct URI format depends on the type of schema registry you're using.
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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KafkaSchemaRegistryConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.KafkaSchemaRegistryConfig):
        KafkaSchemaRegistryConfig = CdkObjectWrappers.wrap(cdkObject) as? KafkaSchemaRegistryConfig
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: KafkaSchemaRegistryConfig):
        software.amazon.awscdk.services.lambda.KafkaSchemaRegistryConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.KafkaSchemaRegistryConfig
  }
}
