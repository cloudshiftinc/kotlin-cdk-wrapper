@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.logs.ILogGroup

/**
 * Use CloudWatch Logs as a custom access log destination for API Gateway.
 *
 * Example:
 *
 * ```
 * LogGroup logGroup = new LogGroup(this, "ApiGatewayAccessLogs");
 * RestApi.Builder.create(this, "books")
 * .deployOptions(StageOptions.builder()
 * .accessLogDestination(new LogGroupLogDestination(logGroup))
 * .accessLogFormat(AccessLogFormat.custom(String.format("%s %s %s%n      %s %s",
 * AccessLogField.contextRequestId(), AccessLogField.contextErrorMessage(),
 * AccessLogField.contextErrorMessageString(), AccessLogField.contextAuthorizerError(),
 * AccessLogField.contextAuthorizerIntegrationStatus())))
 * .build())
 * .build();
 * ```
 */
public open class LogGroupLogDestination internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.apigateway.LogGroupLogDestination,
) : CdkObject(cdkObject), IAccessLogDestination {
  public constructor(logGroup: ILogGroup) :
      this(software.amazon.awscdk.services.apigateway.LogGroupLogDestination(ILogGroup.unwrap(logGroup)))

  /**
   * Binds this destination to the CloudWatch Logs.
   *
   * @param _stage 
   */
  public override fun bind(_stage: IStage): AccessLogDestinationConfig =
      unwrap(this).bind(_stage.let(IStage::unwrap)).let(AccessLogDestinationConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.LogGroupLogDestination):
        LogGroupLogDestination = LogGroupLogDestination(cdkObject)

    internal fun unwrap(wrapped: LogGroupLogDestination):
        software.amazon.awscdk.services.apigateway.LogGroupLogDestination = wrapped.cdkObject
  }
}
