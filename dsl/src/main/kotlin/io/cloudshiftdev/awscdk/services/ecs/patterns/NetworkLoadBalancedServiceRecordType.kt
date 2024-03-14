package io.cloudshiftdev.awscdk.services.ecs.patterns

public enum class NetworkLoadBalancedServiceRecordType(
  private val cdkObject:
      software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType,
) {
  ALIAS(software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType.ALIAS),
  CNAME(software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType.CNAME),
  NONE(software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType.NONE),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType):
        NetworkLoadBalancedServiceRecordType = when (cdkObject) {
      software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType.ALIAS ->
          NetworkLoadBalancedServiceRecordType.ALIAS
      software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType.CNAME ->
          NetworkLoadBalancedServiceRecordType.CNAME
      software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType.NONE ->
          NetworkLoadBalancedServiceRecordType.NONE
    }

    internal fun unwrap(wrapped: NetworkLoadBalancedServiceRecordType):
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType =
        wrapped.cdkObject
  }
}
