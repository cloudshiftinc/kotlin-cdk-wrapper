@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Define options which can be passed using the method `Source.jsonData()`.
 *
 * Example:
 *
 * ```
 * Bucket bucket;
 * StringParameter param;
 * // Example with a secret value that contains double quotes
 * BucketDeployment deployment = BucketDeployment.Builder.create(this, "JsonDeployment")
 * .sources(List.of(Source.jsonData("config.json", Map.of(
 * "api_endpoint", "https://api.example.com",
 * "secretValue", param.getStringValue(),  // value with double quotes
 * "config", Map.of(
 * "enabled", true,
 * "features", List.of("feature1", "feature2"))),
 * JsonProcessingOptions.builder().escape(true).build())))
 * .destinationBucket(bucket)
 * .build();
 * ```
 */
public interface JsonProcessingOptions {
  /**
   * If set to `true`, the marker substitution will make sure the value inserted in the file will be
   * a valid JSON string.
   *
   * Default: - false
   */
  public fun escape(): Boolean? = unwrap(this).getEscape()

  /**
   * A builder for [JsonProcessingOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param escape If set to `true`, the marker substitution will make sure the value inserted in
     * the file will be a valid JSON string.
     */
    public fun escape(escape: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.deployment.JsonProcessingOptions.Builder =
        software.amazon.awscdk.services.s3.deployment.JsonProcessingOptions.builder()

    /**
     * @param escape If set to `true`, the marker substitution will make sure the value inserted in
     * the file will be a valid JSON string.
     */
    override fun escape(escape: Boolean) {
      cdkBuilder.escape(escape)
    }

    public fun build(): software.amazon.awscdk.services.s3.deployment.JsonProcessingOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3.deployment.JsonProcessingOptions,
  ) : CdkObject(cdkObject),
      JsonProcessingOptions {
    /**
     * If set to `true`, the marker substitution will make sure the value inserted in the file will
     * be a valid JSON string.
     *
     * Default: - false
     */
    override fun escape(): Boolean? = unwrap(this).getEscape()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): JsonProcessingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.deployment.JsonProcessingOptions):
        JsonProcessingOptions = CdkObjectWrappers.wrap(cdkObject) as? JsonProcessingOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: JsonProcessingOptions):
        software.amazon.awscdk.services.s3.deployment.JsonProcessingOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.deployment.JsonProcessingOptions
  }
}
