@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Information about logs built to an S3 bucket for a build project.
 *
 * Example:
 *
 * ```
 * Project.Builder.create(this, "Project")
 * .logging(LoggingOptions.builder()
 * .s3(S3LoggingOptions.builder()
 * .bucket(new Bucket(this, "LogBucket"))
 * .build())
 * .build())
 * .build();
 * ```
 */
public interface S3LoggingOptions {
  /**
   * The S3 Bucket to send logs to.
   */
  public fun bucket(): IBucket

  /**
   * The current status of the logs in Amazon CloudWatch Logs for a build project.
   *
   * Default: true
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * Encrypt the S3 build log output.
   *
   * Default: true
   */
  public fun encrypted(): Boolean? = unwrap(this).getEncrypted()

  /**
   * The path prefix for S3 logs.
   *
   * Default: - no prefix
   */
  public fun prefix(): String? = unwrap(this).getPrefix()

  /**
   * A builder for [S3LoggingOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket The S3 Bucket to send logs to. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param enabled The current status of the logs in Amazon CloudWatch Logs for a build project.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param encrypted Encrypt the S3 build log output.
     */
    public fun encrypted(encrypted: Boolean)

    /**
     * @param prefix The path prefix for S3 logs.
     */
    public fun prefix(prefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.S3LoggingOptions.Builder =
        software.amazon.awscdk.services.codebuild.S3LoggingOptions.builder()

    /**
     * @param bucket The S3 Bucket to send logs to. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    /**
     * @param enabled The current status of the logs in Amazon CloudWatch Logs for a build project.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param encrypted Encrypt the S3 build log output.
     */
    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param prefix The path prefix for S3 logs.
     */
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.S3LoggingOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.S3LoggingOptions,
  ) : CdkObject(cdkObject), S3LoggingOptions {
    /**
     * The S3 Bucket to send logs to.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * The current status of the logs in Amazon CloudWatch Logs for a build project.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * Encrypt the S3 build log output.
     *
     * Default: true
     */
    override fun encrypted(): Boolean? = unwrap(this).getEncrypted()

    /**
     * The path prefix for S3 logs.
     *
     * Default: - no prefix
     */
    override fun prefix(): String? = unwrap(this).getPrefix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3LoggingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.S3LoggingOptions):
        S3LoggingOptions = CdkObjectWrappers.wrap(cdkObject) as S3LoggingOptions

    internal fun unwrap(wrapped: S3LoggingOptions):
        software.amazon.awscdk.services.codebuild.S3LoggingOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.S3LoggingOptions
  }
}
