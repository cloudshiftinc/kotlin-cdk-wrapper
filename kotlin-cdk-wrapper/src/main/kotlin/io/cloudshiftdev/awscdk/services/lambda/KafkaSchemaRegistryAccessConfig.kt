@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Specific access configuration settings that tell Lambda how to authenticate with your schema
 * registry.
 *
 * If you're working with an AWS Glue schema registry, don't provide authentication details in this
 * object. Instead, ensure that your execution role has the required permissions for Lambda to access
 * your cluster.
 *
 * If you're working with a Confluent schema registry, choose the authentication method in the Type
 * field, and provide the AWS Secrets Manager secret ARN in the URI field.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * KafkaSchemaRegistryAccessConfigType kafkaSchemaRegistryAccessConfigType;
 * KafkaSchemaRegistryAccessConfig kafkaSchemaRegistryAccessConfig =
 * KafkaSchemaRegistryAccessConfig.builder()
 * .type(kafkaSchemaRegistryAccessConfigType)
 * .uri("uri")
 * .build();
 * ```
 */
public interface KafkaSchemaRegistryAccessConfig {
  /**
   * The type of authentication Lambda uses to access your schema registry.
   */
  public fun type(): KafkaSchemaRegistryAccessConfigType

  /**
   * The URI of the secret (Secrets Manager secret ARN) to authenticate with your schema registry.
   *
   * [Documentation](KafkaSchemaRegistryAccessConfigType)
   */
  public fun uri(): String

  /**
   * A builder for [KafkaSchemaRegistryAccessConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param type The type of authentication Lambda uses to access your schema registry. 
     */
    public fun type(type: KafkaSchemaRegistryAccessConfigType)

    /**
     * @param uri The URI of the secret (Secrets Manager secret ARN) to authenticate with your
     * schema registry. 
     */
    public fun uri(uri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.KafkaSchemaRegistryAccessConfig.Builder =
        software.amazon.awscdk.services.lambda.KafkaSchemaRegistryAccessConfig.builder()

    /**
     * @param type The type of authentication Lambda uses to access your schema registry. 
     */
    override fun type(type: KafkaSchemaRegistryAccessConfigType) {
      cdkBuilder.type(type.let(KafkaSchemaRegistryAccessConfigType.Companion::unwrap))
    }

    /**
     * @param uri The URI of the secret (Secrets Manager secret ARN) to authenticate with your
     * schema registry. 
     */
    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.lambda.KafkaSchemaRegistryAccessConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.KafkaSchemaRegistryAccessConfig,
  ) : CdkObject(cdkObject),
      KafkaSchemaRegistryAccessConfig {
    /**
     * The type of authentication Lambda uses to access your schema registry.
     */
    override fun type(): KafkaSchemaRegistryAccessConfigType =
        unwrap(this).getType().let(KafkaSchemaRegistryAccessConfigType::wrap)

    /**
     * The URI of the secret (Secrets Manager secret ARN) to authenticate with your schema registry.
     *
     * [Documentation](KafkaSchemaRegistryAccessConfigType)
     */
    override fun uri(): String = unwrap(this).getUri()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KafkaSchemaRegistryAccessConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.KafkaSchemaRegistryAccessConfig):
        KafkaSchemaRegistryAccessConfig = CdkObjectWrappers.wrap(cdkObject) as?
        KafkaSchemaRegistryAccessConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: KafkaSchemaRegistryAccessConfig):
        software.amazon.awscdk.services.lambda.KafkaSchemaRegistryAccessConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.KafkaSchemaRegistryAccessConfig
  }
}
