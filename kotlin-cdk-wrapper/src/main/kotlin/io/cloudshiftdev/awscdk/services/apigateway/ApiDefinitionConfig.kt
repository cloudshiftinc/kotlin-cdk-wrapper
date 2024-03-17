@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Post-Binding Configuration for a CDK construct.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * Object inlineDefinition;
 * ApiDefinitionConfig apiDefinitionConfig = ApiDefinitionConfig.builder()
 * .inlineDefinition(inlineDefinition)
 * .s3Location(ApiDefinitionS3Location.builder()
 * .bucket("bucket")
 * .key("key")
 * // the properties below are optional
 * .version("version")
 * .build())
 * .build();
 * ```
 */
public interface ApiDefinitionConfig {
  /**
   * Inline specification (mutually exclusive with `s3Location`).
   *
   * Default: - API definition is not defined inline
   */
  public fun inlineDefinition(): Any? = unwrap(this).getInlineDefinition()

  /**
   * The location of the specification in S3 (mutually exclusive with `inlineDefinition`).
   *
   * Default: - API definition is not an S3 location
   */
  public fun s3Location(): ApiDefinitionS3Location? =
      unwrap(this).getS3Location()?.let(ApiDefinitionS3Location::wrap)

  /**
   * A builder for [ApiDefinitionConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param inlineDefinition Inline specification (mutually exclusive with `s3Location`).
     */
    public fun inlineDefinition(inlineDefinition: Any)

    /**
     * @param s3Location The location of the specification in S3 (mutually exclusive with
     * `inlineDefinition`).
     */
    public fun s3Location(s3Location: ApiDefinitionS3Location)

    /**
     * @param s3Location The location of the specification in S3 (mutually exclusive with
     * `inlineDefinition`).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4eceb3142d927046d2ff9f8c231ea40847b258880f47c118a3b88b7a29b4b7d7")
    public fun s3Location(s3Location: ApiDefinitionS3Location.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ApiDefinitionConfig.Builder =
        software.amazon.awscdk.services.apigateway.ApiDefinitionConfig.builder()

    /**
     * @param inlineDefinition Inline specification (mutually exclusive with `s3Location`).
     */
    override fun inlineDefinition(inlineDefinition: Any) {
      cdkBuilder.inlineDefinition(inlineDefinition)
    }

    /**
     * @param s3Location The location of the specification in S3 (mutually exclusive with
     * `inlineDefinition`).
     */
    override fun s3Location(s3Location: ApiDefinitionS3Location) {
      cdkBuilder.s3Location(s3Location.let(ApiDefinitionS3Location::unwrap))
    }

    /**
     * @param s3Location The location of the specification in S3 (mutually exclusive with
     * `inlineDefinition`).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4eceb3142d927046d2ff9f8c231ea40847b258880f47c118a3b88b7a29b4b7d7")
    override fun s3Location(s3Location: ApiDefinitionS3Location.Builder.() -> Unit): Unit =
        s3Location(ApiDefinitionS3Location(s3Location))

    public fun build(): software.amazon.awscdk.services.apigateway.ApiDefinitionConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.ApiDefinitionConfig,
  ) : CdkObject(cdkObject), ApiDefinitionConfig {
    /**
     * Inline specification (mutually exclusive with `s3Location`).
     *
     * Default: - API definition is not defined inline
     */
    override fun inlineDefinition(): Any? = unwrap(this).getInlineDefinition()

    /**
     * The location of the specification in S3 (mutually exclusive with `inlineDefinition`).
     *
     * Default: - API definition is not an S3 location
     */
    override fun s3Location(): ApiDefinitionS3Location? =
        unwrap(this).getS3Location()?.let(ApiDefinitionS3Location::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApiDefinitionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ApiDefinitionConfig):
        ApiDefinitionConfig = CdkObjectWrappers.wrap(cdkObject) as? ApiDefinitionConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiDefinitionConfig):
        software.amazon.awscdk.services.apigateway.ApiDefinitionConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.ApiDefinitionConfig
  }
}
