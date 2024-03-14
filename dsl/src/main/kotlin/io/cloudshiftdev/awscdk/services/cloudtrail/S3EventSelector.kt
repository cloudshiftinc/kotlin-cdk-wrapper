package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

public interface S3EventSelector {
  /**
   * S3 bucket.
   */
  public fun bucket(): IBucket

  /**
   * Data events for objects whose key matches this prefix will be logged.
   *
   * Default: - all objects
   */
  public fun objectPrefix(): String? = unwrap(this).getObjectPrefix()

  /**
   * A builder for [S3EventSelector]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket S3 bucket. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param objectPrefix Data events for objects whose key matches this prefix will be logged.
     */
    public fun objectPrefix(objectPrefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudtrail.S3EventSelector.Builder =
        software.amazon.awscdk.services.cloudtrail.S3EventSelector.builder()

    /**
     * @param bucket S3 bucket. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    /**
     * @param objectPrefix Data events for objects whose key matches this prefix will be logged.
     */
    override fun objectPrefix(objectPrefix: String) {
      cdkBuilder.objectPrefix(objectPrefix)
    }

    public fun build(): software.amazon.awscdk.services.cloudtrail.S3EventSelector =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudtrail.S3EventSelector,
  ) : S3EventSelector {
    /**
     * S3 bucket.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * Data events for objects whose key matches this prefix will be logged.
     *
     * Default: - all objects
     */
    override fun objectPrefix(): String? = unwrap(this).getObjectPrefix()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): S3EventSelector {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.S3EventSelector):
        S3EventSelector = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3EventSelector):
        software.amazon.awscdk.services.cloudtrail.S3EventSelector = (wrapped as Wrapper).cdkObject
  }
}
