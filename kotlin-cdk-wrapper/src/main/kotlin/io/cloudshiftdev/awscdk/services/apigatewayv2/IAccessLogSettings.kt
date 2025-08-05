@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.apigateway.AccessLogFormat

/**
 * Settings for access logging.
 */
public interface IAccessLogSettings {
  /**
   * The destination where to write access logs.
   *
   * Default: - No destination
   */
  public fun destination(): IAccessLogDestination

  /**
   * A single line format of access logs of data, as specified by selected $context variables.
   *
   * The format must include either `AccessLogFormat.contextRequestId()`
   * or `AccessLogFormat.contextExtendedRequestId()`.
   *
   * Default: - Common Log Format
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-logging-variables.html)
   */
  public fun format(): AccessLogFormat? = unwrap(this).getFormat()?.let(AccessLogFormat::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.IAccessLogSettings,
  ) : CdkObject(cdkObject),
      IAccessLogSettings {
    /**
     * The destination where to write access logs.
     *
     * Default: - No destination
     */
    override fun destination(): IAccessLogDestination =
        unwrap(this).getDestination().let(IAccessLogDestination::wrap)

    /**
     * A single line format of access logs of data, as specified by selected $context variables.
     *
     * The format must include either `AccessLogFormat.contextRequestId()`
     * or `AccessLogFormat.contextExtendedRequestId()`.
     *
     * Default: - Common Log Format
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-logging-variables.html)
     */
    override fun format(): AccessLogFormat? = unwrap(this).getFormat()?.let(AccessLogFormat::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IAccessLogSettings):
        IAccessLogSettings = CdkObjectWrappers.wrap(cdkObject) as? IAccessLogSettings ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAccessLogSettings):
        software.amazon.awscdk.services.apigatewayv2.IAccessLogSettings = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IAccessLogSettings
  }
}
