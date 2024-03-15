@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IComparablePrincipal : IPrincipal {
  public fun dedupeString(): String?

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.IComparablePrincipal,
  ) : CdkObject(cdkObject), IComparablePrincipal {
    override fun addToPrincipalPolicy(arg0: PolicyStatement): AddToPrincipalPolicyResult =
        unwrap(this).addToPrincipalPolicy(arg0.let(PolicyStatement::unwrap)).let(AddToPrincipalPolicyResult::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5a2b0fec5c17722d0dc719c3fd27344bee07d931f9f715b331523f4aadc0661")
    override fun addToPrincipalPolicy(arg0: PolicyStatement.Builder.() -> Unit):
        AddToPrincipalPolicyResult = addToPrincipalPolicy(PolicyStatement(arg0))

    override fun assumeRoleAction(): String = unwrap(this).getAssumeRoleAction()

    override fun dedupeString(): String? = unwrap(this).dedupeString()

    override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    override fun policyFragment(): PrincipalPolicyFragment =
        unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

    override fun principalAccount(): String? = unwrap(this).getPrincipalAccount()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IComparablePrincipal):
        IComparablePrincipal = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IComparablePrincipal):
        software.amazon.awscdk.services.iam.IComparablePrincipal = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.IComparablePrincipal
  }
}
