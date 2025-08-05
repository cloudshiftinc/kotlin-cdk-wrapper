@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

/**
 * (deprecated) Interface for Result Writer configuration props.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Bucket bucket;
 * ResultWriterProps resultWriterProps = ResultWriterProps.builder()
 * .bucket(bucket)
 * // the properties below are optional
 * .prefix("prefix")
 * .build();
 * ```
 *
 * @deprecated use [ResultWriterV2Props ] instead
 */
public interface ResultWriterProps {
  /**
   * (deprecated) S3 Bucket in which to save Map Run results.
   */
  @Deprecated(message = "deprecated in CDK")
  public fun bucket(): IBucket

  /**
   * (deprecated) S3 prefix in which to save Map Run results.
   *
   * Default: - No prefix
   */
  @Deprecated(message = "deprecated in CDK")
  public fun prefix(): String? = unwrap(this).getPrefix()

  /**
   * A builder for [ResultWriterProps]
   */
  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    /**
     * @param bucket S3 Bucket in which to save Map Run results. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun bucket(bucket: IBucket)

    /**
     * @param prefix S3 prefix in which to save Map Run results.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun prefix(prefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.ResultWriterProps.Builder
        = software.amazon.awscdk.services.stepfunctions.ResultWriterProps.builder()

    /**
     * @param bucket S3 Bucket in which to save Map Run results. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * @param prefix S3 prefix in which to save Map Run results.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.ResultWriterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.ResultWriterProps,
  ) : CdkObject(cdkObject),
      ResultWriterProps {
    /**
     * (deprecated) S3 Bucket in which to save Map Run results.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * (deprecated) S3 prefix in which to save Map Run results.
     *
     * Default: - No prefix
     */
    @Deprecated(message = "deprecated in CDK")
    override fun prefix(): String? = unwrap(this).getPrefix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResultWriterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ResultWriterProps):
        ResultWriterProps = CdkObjectWrappers.wrap(cdkObject) as? ResultWriterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResultWriterProps):
        software.amazon.awscdk.services.stepfunctions.ResultWriterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.ResultWriterProps
  }
}
