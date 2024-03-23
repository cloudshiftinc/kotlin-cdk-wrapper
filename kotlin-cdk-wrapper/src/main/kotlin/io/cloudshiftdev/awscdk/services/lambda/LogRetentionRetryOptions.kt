@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Deprecated
import kotlin.Number
import kotlin.Unit

/**
 * Retry options for all AWS API calls.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * LogRetentionRetryOptions logRetentionRetryOptions = LogRetentionRetryOptions.builder()
 * .base(Duration.minutes(30))
 * .maxRetries(123)
 * .build();
 * ```
 */
public interface LogRetentionRetryOptions :
    io.cloudshiftdev.awscdk.services.logs.LogRetentionRetryOptions {
  /**
   * A builder for [LogRetentionRetryOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param base The base duration to use in the exponential backoff for operation retries.
     * @deprecated Unused since the upgrade to AWS SDK v3, which uses a different retry strategy
     */
    @Deprecated(message = "deprecated in CDK")
    public fun base(base: Duration)

    /**
     * @param maxRetries The maximum amount of retries.
     */
    public fun maxRetries(maxRetries: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.LogRetentionRetryOptions.Builder
        = software.amazon.awscdk.services.lambda.LogRetentionRetryOptions.builder()

    /**
     * @param base The base duration to use in the exponential backoff for operation retries.
     * @deprecated Unused since the upgrade to AWS SDK v3, which uses a different retry strategy
     */
    @Deprecated(message = "deprecated in CDK")
    override fun base(base: Duration) {
      cdkBuilder.base(base.let(Duration::unwrap))
    }

    /**
     * @param maxRetries The maximum amount of retries.
     */
    override fun maxRetries(maxRetries: Number) {
      cdkBuilder.maxRetries(maxRetries)
    }

    public fun build(): software.amazon.awscdk.services.lambda.LogRetentionRetryOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.LogRetentionRetryOptions,
  ) : CdkObject(cdkObject), LogRetentionRetryOptions {
    /**
     * (deprecated) The base duration to use in the exponential backoff for operation retries.
     *
     * Default: - none, not used anymore
     *
     * @deprecated Unused since the upgrade to AWS SDK v3, which uses a different retry strategy
     */
    @Deprecated(message = "deprecated in CDK")
    override fun base(): Duration? = unwrap(this).getBase()?.let(Duration::wrap)

    /**
     * The maximum amount of retries.
     *
     * Default: 5
     */
    override fun maxRetries(): Number? = unwrap(this).getMaxRetries()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LogRetentionRetryOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.LogRetentionRetryOptions):
        LogRetentionRetryOptions = CdkObjectWrappers.wrap(cdkObject) as? LogRetentionRetryOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogRetentionRetryOptions):
        software.amazon.awscdk.services.lambda.LogRetentionRetryOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.LogRetentionRetryOptions
  }
}
