@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.logs.ILogGroup

/**
 * Use CloudWatch Logs as a custom access log destination for API Gateway.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * HttpApi api;
 * LogGroup logGroup;
 * HttpStage stage = HttpStage.Builder.create(this, "Stage")
 * .httpApi(api)
 * .accessLogSettings(Map.of(
 * "destination", new LogGroupLogDestination(logGroup),
 * "format", AccessLogFormat.clf()))
 * .build();
 * ```
 */
public open class LogGroupLogDestination(
  cdkObject: software.amazon.awscdk.services.apigatewayv2.LogGroupLogDestination,
) : CdkObject(cdkObject),
    IAccessLogDestination {
  public constructor(logGroup: ILogGroup) :
      this(software.amazon.awscdk.services.apigatewayv2.LogGroupLogDestination(logGroup.let(ILogGroup.Companion::unwrap))
  )

  /**
   * Binds this destination to the CloudWatch Logs.
   *
   * @param _stage 
   */
  public override fun bind(stage: IStage): AccessLogDestinationConfig =
      unwrap(this).bind(stage.let(IStage.Companion::unwrap)).let(AccessLogDestinationConfig::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.LogGroupLogDestination):
        LogGroupLogDestination = LogGroupLogDestination(cdkObject)

    internal fun unwrap(wrapped: LogGroupLogDestination):
        software.amazon.awscdk.services.apigatewayv2.LogGroupLogDestination = wrapped.cdkObject as
        software.amazon.awscdk.services.apigatewayv2.LogGroupLogDestination
  }
}
