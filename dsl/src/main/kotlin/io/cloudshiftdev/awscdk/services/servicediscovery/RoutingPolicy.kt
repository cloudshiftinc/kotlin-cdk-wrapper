package io.cloudshiftdev.awscdk.services.servicediscovery

public enum class RoutingPolicy(
  private val cdkObject: software.amazon.awscdk.services.servicediscovery.RoutingPolicy,
) {
  WEIGHTED(software.amazon.awscdk.services.servicediscovery.RoutingPolicy.WEIGHTED),
  MULTIVALUE(software.amazon.awscdk.services.servicediscovery.RoutingPolicy.MULTIVALUE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.RoutingPolicy):
        RoutingPolicy = when (cdkObject) {
      software.amazon.awscdk.services.servicediscovery.RoutingPolicy.WEIGHTED ->
          RoutingPolicy.WEIGHTED
      software.amazon.awscdk.services.servicediscovery.RoutingPolicy.MULTIVALUE ->
          RoutingPolicy.MULTIVALUE
    }

    internal fun unwrap(wrapped: RoutingPolicy):
        software.amazon.awscdk.services.servicediscovery.RoutingPolicy = wrapped.cdkObject
  }
}
