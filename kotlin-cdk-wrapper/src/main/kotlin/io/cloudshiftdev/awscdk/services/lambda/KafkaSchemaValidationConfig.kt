@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Specific schema validation configuration settings that tell Lambda the message attributes you
 * want to validate and filter using your schema registry.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * KafkaSchemaValidationAttribute kafkaSchemaValidationAttribute;
 * KafkaSchemaValidationConfig kafkaSchemaValidationConfig = KafkaSchemaValidationConfig.builder()
 * .attribute(kafkaSchemaValidationAttribute)
 * .build();
 * ```
 */
public interface KafkaSchemaValidationConfig {
  /**
   * The attributes you want your schema registry to validate and filter for.
   *
   * If you selected JSON as the EventRecordFormat, Lambda also deserializes the selected message
   * attributes.
   */
  public fun attribute(): KafkaSchemaValidationAttribute

  /**
   * A builder for [KafkaSchemaValidationConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param attribute The attributes you want your schema registry to validate and filter for. 
     * If you selected JSON as the EventRecordFormat, Lambda also deserializes the selected message
     * attributes.
     */
    public fun attribute(attribute: KafkaSchemaValidationAttribute)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.KafkaSchemaValidationConfig.Builder =
        software.amazon.awscdk.services.lambda.KafkaSchemaValidationConfig.builder()

    /**
     * @param attribute The attributes you want your schema registry to validate and filter for. 
     * If you selected JSON as the EventRecordFormat, Lambda also deserializes the selected message
     * attributes.
     */
    override fun attribute(attribute: KafkaSchemaValidationAttribute) {
      cdkBuilder.attribute(attribute.let(KafkaSchemaValidationAttribute.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.KafkaSchemaValidationConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.KafkaSchemaValidationConfig,
  ) : CdkObject(cdkObject),
      KafkaSchemaValidationConfig {
    /**
     * The attributes you want your schema registry to validate and filter for.
     *
     * If you selected JSON as the EventRecordFormat, Lambda also deserializes the selected message
     * attributes.
     */
    override fun attribute(): KafkaSchemaValidationAttribute =
        unwrap(this).getAttribute().let(KafkaSchemaValidationAttribute::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KafkaSchemaValidationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.KafkaSchemaValidationConfig):
        KafkaSchemaValidationConfig = CdkObjectWrappers.wrap(cdkObject) as?
        KafkaSchemaValidationConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: KafkaSchemaValidationConfig):
        software.amazon.awscdk.services.lambda.KafkaSchemaValidationConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.KafkaSchemaValidationConfig
  }
}
