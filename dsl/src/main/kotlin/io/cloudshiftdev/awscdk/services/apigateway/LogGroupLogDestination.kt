package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject

public open class LogGroupLogDestination internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.apigateway.LogGroupLogDestination,
) : CdkObject(cdkObject), IAccessLogDestination {
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
