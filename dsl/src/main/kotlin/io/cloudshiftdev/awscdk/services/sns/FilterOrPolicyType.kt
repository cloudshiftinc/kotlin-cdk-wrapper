package io.cloudshiftdev.awscdk.services.sns

public enum class FilterOrPolicyType(
  private val cdkObject: software.amazon.awscdk.services.sns.FilterOrPolicyType,
) {
  FILTER(software.amazon.awscdk.services.sns.FilterOrPolicyType.FILTER),
  POLICY(software.amazon.awscdk.services.sns.FilterOrPolicyType.POLICY),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.FilterOrPolicyType):
        FilterOrPolicyType = when (cdkObject) {
      software.amazon.awscdk.services.sns.FilterOrPolicyType.FILTER -> FilterOrPolicyType.FILTER
      software.amazon.awscdk.services.sns.FilterOrPolicyType.POLICY -> FilterOrPolicyType.POLICY
    }

    internal fun unwrap(wrapped: FilterOrPolicyType):
        software.amazon.awscdk.services.sns.FilterOrPolicyType = wrapped.cdkObject
  }
}
