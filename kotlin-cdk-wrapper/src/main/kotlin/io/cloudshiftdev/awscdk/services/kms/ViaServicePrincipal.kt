@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.PrincipalBase
import io.cloudshiftdev.awscdk.services.iam.PrincipalPolicyFragment
import kotlin.String

/**
 * A principal to allow access to a key if it's being used through another AWS service.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * IPrincipal principal;
 * ViaServicePrincipal viaServicePrincipal = new ViaServicePrincipal("serviceName", principal);
 * ```
 */
public open class ViaServicePrincipal(
  cdkObject: software.amazon.awscdk.services.kms.ViaServicePrincipal,
) : PrincipalBase(cdkObject) {
  public constructor(serviceName: String) :
      this(software.amazon.awscdk.services.kms.ViaServicePrincipal(serviceName)
  )

  public constructor(serviceName: String, basePrincipal: IPrincipal) :
      this(software.amazon.awscdk.services.kms.ViaServicePrincipal(serviceName,
      basePrincipal.let(IPrincipal::unwrap))
  )

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
    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.ViaServicePrincipal):
        ViaServicePrincipal = ViaServicePrincipal(cdkObject)

    internal fun unwrap(wrapped: ViaServicePrincipal):
        software.amazon.awscdk.services.kms.ViaServicePrincipal = wrapped.cdkObject as
        software.amazon.awscdk.services.kms.ViaServicePrincipal
  }
}
