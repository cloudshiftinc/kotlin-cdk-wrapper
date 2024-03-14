package io.cloudshiftdev.awscdk.services.apigateway

public interface IAccessLogDestination {
  public fun bind(arg0: IStage): AccessLogDestinationConfig

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.IAccessLogDestination,
  ) : IAccessLogDestination {
    public override fun bind(arg0: IStage): AccessLogDestinationConfig =
        unwrap(this).bind(arg0.let(IStage::unwrap)).let(AccessLogDestinationConfig::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IAccessLogDestination):
        IAccessLogDestination = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAccessLogDestination):
        software.amazon.awscdk.services.apigateway.IAccessLogDestination = (wrapped as
        Wrapper).cdkObject
  }
}
