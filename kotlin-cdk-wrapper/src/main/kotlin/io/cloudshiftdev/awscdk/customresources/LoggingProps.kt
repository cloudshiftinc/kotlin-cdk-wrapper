@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Properties used to initialize Logging.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.customresources.*;
 * LoggingProps loggingProps = LoggingProps.builder()
 * .logApiResponseData(false)
 * .build();
 * ```
 */
public interface LoggingProps {
  /**
   * Whether or not to log data associated with the API call response.
   *
   * Default: true
   */
  public fun logApiResponseData(): Boolean? = unwrap(this).getLogApiResponseData()

  /**
   * A builder for [LoggingProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param logApiResponseData Whether or not to log data associated with the API call response.
     */
    public fun logApiResponseData(logApiResponseData: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.customresources.LoggingProps.Builder =
        software.amazon.awscdk.customresources.LoggingProps.builder()

    /**
     * @param logApiResponseData Whether or not to log data associated with the API call response.
     */
    override fun logApiResponseData(logApiResponseData: Boolean) {
      cdkBuilder.logApiResponseData(logApiResponseData)
    }

    public fun build(): software.amazon.awscdk.customresources.LoggingProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.customresources.LoggingProps,
  ) : CdkObject(cdkObject),
      LoggingProps {
    /**
     * Whether or not to log data associated with the API call response.
     *
     * Default: true
     */
    override fun logApiResponseData(): Boolean? = unwrap(this).getLogApiResponseData()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LoggingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.LoggingProps): LoggingProps
        = CdkObjectWrappers.wrap(cdkObject) as? LoggingProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoggingProps): software.amazon.awscdk.customresources.LoggingProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.customresources.LoggingProps
  }
}
