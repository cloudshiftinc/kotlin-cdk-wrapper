@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import kotlin.String

/**
 * A principal that uses a literal '*' in the IAM JSON language.
 *
 * Some services behave differently when you specify `Principal: "*"`
 * or `Principal: { AWS: "*" }` in their resource policy.
 *
 * `StarPrincipal` renders to `Principal: *`. Most of the time, you
 * should use `AnyPrincipal` instead.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * StarPrincipal starPrincipal = new StarPrincipal();
 * ```
 */
public open class StarPrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.StarPrincipal,
) : PrincipalBase(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.iam.StarPrincipal())

  /**
   * Return whether or not this principal is equal to the given principal.
   */
  public override fun dedupeString(): String? = unwrap(this).dedupeString()

  /**
   * Return the policy fragment that identifies this principal in a Policy.
   */
  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.StarPrincipal): StarPrincipal =
        StarPrincipal(cdkObject)

    internal fun unwrap(wrapped: StarPrincipal): software.amazon.awscdk.services.iam.StarPrincipal =
        wrapped.cdkObject
  }
}
