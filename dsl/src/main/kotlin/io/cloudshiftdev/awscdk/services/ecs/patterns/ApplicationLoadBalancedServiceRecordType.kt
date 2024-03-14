package io.cloudshiftdev.awscdk.services.ecs.patterns

public enum class ApplicationLoadBalancedServiceRecordType(
  private val cdkObject:
      software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType,
) {
  ALIAS(software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType.ALIAS),
  CNAME(software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType.CNAME),
  NONE(software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType.NONE),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType):
        ApplicationLoadBalancedServiceRecordType = when (cdkObject) {
      software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType.ALIAS ->
          ApplicationLoadBalancedServiceRecordType.ALIAS
      software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType.CNAME ->
          ApplicationLoadBalancedServiceRecordType.CNAME
      software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType.NONE ->
          ApplicationLoadBalancedServiceRecordType.NONE
    }

    internal fun unwrap(wrapped: ApplicationLoadBalancedServiceRecordType):
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType =
        wrapped.cdkObject
  }
}
