package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject

public open class FirehoseLogDestination internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.apigateway.FirehoseLogDestination,
) : CdkObject(cdkObject), IAccessLogDestination {
  /**
   * Binds this destination to the Firehose delivery stream.
   *
   * @param _stage 
   */
  public override fun bind(_stage: IStage): AccessLogDestinationConfig =
      unwrap(this).bind(_stage.let(IStage::unwrap)).let(AccessLogDestinationConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.FirehoseLogDestination):
        FirehoseLogDestination = FirehoseLogDestination(cdkObject)

    internal fun unwrap(wrapped: FirehoseLogDestination):
        software.amazon.awscdk.services.apigateway.FirehoseLogDestination = wrapped.cdkObject
  }
}
