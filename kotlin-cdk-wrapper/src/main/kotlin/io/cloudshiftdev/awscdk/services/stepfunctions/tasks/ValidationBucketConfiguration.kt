@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

/**
 * S3 bucket configuration for the validation data.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * Bucket bucket;
 * ValidationBucketConfiguration validationBucketConfiguration =
 * ValidationBucketConfiguration.builder()
 * .bucket(bucket)
 * // the properties below are optional
 * .path("path")
 * .build();
 * ```
 */
public interface ValidationBucketConfiguration : DataBucketConfiguration {
  /**
   * A builder for [ValidationBucketConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket The S3 bucket. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param path Path to file or directory within the bucket.
     */
    public fun path(path: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.ValidationBucketConfiguration.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ValidationBucketConfiguration.builder()

    /**
     * @param bucket The S3 bucket. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * @param path Path to file or directory within the bucket.
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.ValidationBucketConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ValidationBucketConfiguration,
  ) : CdkObject(cdkObject),
      ValidationBucketConfiguration {
    /**
     * The S3 bucket.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * Path to file or directory within the bucket.
     *
     * Default: - root of the bucket
     */
    override fun path(): String? = unwrap(this).getPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ValidationBucketConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ValidationBucketConfiguration):
        ValidationBucketConfiguration = CdkObjectWrappers.wrap(cdkObject) as?
        ValidationBucketConfiguration ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ValidationBucketConfiguration):
        software.amazon.awscdk.services.stepfunctions.tasks.ValidationBucketConfiguration = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.ValidationBucketConfiguration
  }
}
