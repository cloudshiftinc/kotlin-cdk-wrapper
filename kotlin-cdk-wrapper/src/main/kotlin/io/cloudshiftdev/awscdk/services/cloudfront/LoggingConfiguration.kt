@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Logging configuration for incoming requests.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Bucket bucket;
 * LoggingConfiguration loggingConfiguration = LoggingConfiguration.builder()
 * .bucket(bucket)
 * .includeCookies(false)
 * .prefix("prefix")
 * .build();
 * ```
 */
public interface LoggingConfiguration {
  /**
   * Bucket to log requests to.
   *
   * Default: - A logging bucket is automatically created.
   */
  public fun bucket(): IBucket? = unwrap(this).getBucket()?.let(IBucket::wrap)

  /**
   * Whether to include the cookies in the logs.
   *
   * Default: false
   */
  public fun includeCookies(): Boolean? = unwrap(this).getIncludeCookies()

  /**
   * Where in the bucket to store logs.
   *
   * Default: - No prefix.
   */
  public fun prefix(): String? = unwrap(this).getPrefix()

  /**
   * A builder for [LoggingConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket Bucket to log requests to.
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param includeCookies Whether to include the cookies in the logs.
     */
    public fun includeCookies(includeCookies: Boolean)

    /**
     * @param prefix Where in the bucket to store logs.
     */
    public fun prefix(prefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.LoggingConfiguration.Builder
        = software.amazon.awscdk.services.cloudfront.LoggingConfiguration.builder()

    /**
     * @param bucket Bucket to log requests to.
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * @param includeCookies Whether to include the cookies in the logs.
     */
    override fun includeCookies(includeCookies: Boolean) {
      cdkBuilder.includeCookies(includeCookies)
    }

    /**
     * @param prefix Where in the bucket to store logs.
     */
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.LoggingConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.LoggingConfiguration,
  ) : CdkObject(cdkObject),
      LoggingConfiguration {
    /**
     * Bucket to log requests to.
     *
     * Default: - A logging bucket is automatically created.
     */
    override fun bucket(): IBucket? = unwrap(this).getBucket()?.let(IBucket::wrap)

    /**
     * Whether to include the cookies in the logs.
     *
     * Default: false
     */
    override fun includeCookies(): Boolean? = unwrap(this).getIncludeCookies()

    /**
     * Where in the bucket to store logs.
     *
     * Default: - No prefix.
     */
    override fun prefix(): String? = unwrap(this).getPrefix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.LoggingConfiguration):
        LoggingConfiguration = CdkObjectWrappers.wrap(cdkObject) as? LoggingConfiguration ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoggingConfiguration):
        software.amazon.awscdk.services.cloudfront.LoggingConfiguration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.LoggingConfiguration
  }
}
