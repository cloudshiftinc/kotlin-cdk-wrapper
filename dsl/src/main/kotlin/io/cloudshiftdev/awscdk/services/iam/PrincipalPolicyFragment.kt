package io.cloudshiftdev.awscdk.services.iam

import kotlin.Any
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public open class PrincipalPolicyFragment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.PrincipalPolicyFragment,
) {
  public open fun conditions(): Map<String, Any> = unwrap(this).getConditions() ?: emptyMap()

  public open fun principalJson(): Map<String, List<String>> = unwrap(this).getPrincipalJson() ?:
      emptyMap()

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.PrincipalPolicyFragment):
        PrincipalPolicyFragment = PrincipalPolicyFragment(cdkObject)

    internal fun unwrap(wrapped: PrincipalPolicyFragment):
        software.amazon.awscdk.services.iam.PrincipalPolicyFragment = wrapped.cdkObject
  }
}
