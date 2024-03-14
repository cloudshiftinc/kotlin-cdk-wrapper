package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

public interface ResultWriterProps {
  /**
   * S3 Bucket in which to save Map Run results.
   */
  public fun bucket(): IBucket

  /**
   * S3 prefix in which to save Map Run results.
   *
   * Default: - No prefix
   */
  public fun prefix(): String? = unwrap(this).getPrefix()

  /**
   * A builder for [ResultWriterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket S3 Bucket in which to save Map Run results. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param prefix S3 prefix in which to save Map Run results.
     */
    public fun prefix(prefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.ResultWriterProps.Builder
        = software.amazon.awscdk.services.stepfunctions.ResultWriterProps.builder()

    /**
     * @param bucket S3 Bucket in which to save Map Run results. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    /**
     * @param prefix S3 prefix in which to save Map Run results.
     */
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.ResultWriterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.ResultWriterProps,
  ) : CdkObject(cdkObject), ResultWriterProps {
    /**
     * S3 Bucket in which to save Map Run results.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * S3 prefix in which to save Map Run results.
     *
     * Default: - No prefix
     */
    override fun prefix(): String? = unwrap(this).getPrefix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResultWriterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ResultWriterProps):
        ResultWriterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResultWriterProps):
        software.amazon.awscdk.services.stepfunctions.ResultWriterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.ResultWriterProps
  }
}
