package io.cloudshiftdev.awscdk.services.apigateway

public enum class EndpointType(
  private val cdkObject: software.amazon.awscdk.services.apigateway.EndpointType,
) {
  EDGE(software.amazon.awscdk.services.apigateway.EndpointType.EDGE),
  REGIONAL(software.amazon.awscdk.services.apigateway.EndpointType.REGIONAL),
  PRIVATE(software.amazon.awscdk.services.apigateway.EndpointType.PRIVATE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.EndpointType):
        EndpointType = when (cdkObject) {
      software.amazon.awscdk.services.apigateway.EndpointType.EDGE -> EndpointType.EDGE
      software.amazon.awscdk.services.apigateway.EndpointType.REGIONAL -> EndpointType.REGIONAL
      software.amazon.awscdk.services.apigateway.EndpointType.PRIVATE -> EndpointType.PRIVATE
    }

    internal fun unwrap(wrapped: EndpointType):
        software.amazon.awscdk.services.apigateway.EndpointType = wrapped.cdkObject
  }
}
