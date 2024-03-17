@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

/**
 * Options for specifying the s3 location that stores the data of each canary run.
 *
 * The artifacts bucket location **cannot**
 * be updated once the canary is created.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * import io.cloudshiftdev.awscdk.services.synthetics.*;
 * Bucket bucket;
 * ArtifactsBucketLocation artifactsBucketLocation = ArtifactsBucketLocation.builder()
 * .bucket(bucket)
 * // the properties below are optional
 * .prefix("prefix")
 * .build();
 * ```
 */
public interface ArtifactsBucketLocation {
  /**
   * The s3 location that stores the data of each run.
   */
  public fun bucket(): IBucket

  /**
   * The S3 bucket prefix.
   *
   * Specify this if you want a more specific path within the artifacts bucket.
   *
   * Default: - no prefix
   */
  public fun prefix(): String? = unwrap(this).getPrefix()

  /**
   * A builder for [ArtifactsBucketLocation]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket The s3 location that stores the data of each run. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param prefix The S3 bucket prefix.
     * Specify this if you want a more specific path within the artifacts bucket.
     */
    public fun prefix(prefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation.Builder =
        software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation.builder()

    /**
     * @param bucket The s3 location that stores the data of each run. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    /**
     * @param prefix The S3 bucket prefix.
     * Specify this if you want a more specific path within the artifacts bucket.
     */
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    public fun build(): software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation,
  ) : CdkObject(cdkObject), ArtifactsBucketLocation {
    /**
     * The s3 location that stores the data of each run.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * The S3 bucket prefix.
     *
     * Specify this if you want a more specific path within the artifacts bucket.
     *
     * Default: - no prefix
     */
    override fun prefix(): String? = unwrap(this).getPrefix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ArtifactsBucketLocation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation):
        ArtifactsBucketLocation = CdkObjectWrappers.wrap(cdkObject) as? ArtifactsBucketLocation ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ArtifactsBucketLocation):
        software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation
  }
}
