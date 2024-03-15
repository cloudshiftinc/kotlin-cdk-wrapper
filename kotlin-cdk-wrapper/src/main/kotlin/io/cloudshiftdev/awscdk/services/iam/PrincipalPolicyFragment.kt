@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public open class PrincipalPolicyFragment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.PrincipalPolicyFragment,
) : CdkObject(cdkObject) {
  public open fun conditions(): Map<String, Any> = unwrap(this).getConditions() ?: emptyMap()

  public open fun principalJson(): Map<String, List<String>> = unwrap(this).getPrincipalJson() ?:
      emptyMap()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.PrincipalPolicyFragment):
        PrincipalPolicyFragment = PrincipalPolicyFragment(cdkObject)

    internal fun unwrap(wrapped: PrincipalPolicyFragment):
        software.amazon.awscdk.services.iam.PrincipalPolicyFragment = wrapped.cdkObject
  }
}
