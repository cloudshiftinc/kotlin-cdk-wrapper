package io.cloudshiftdev.awscdk.services.iam

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IPrincipal : IGrantable {
  public fun addToPrincipalPolicy(arg0: PolicyStatement): AddToPrincipalPolicyResult

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e5a2b0fec5c17722d0dc719c3fd27344bee07d931f9f715b331523f4aadc0661")
  public fun addToPrincipalPolicy(arg0: PolicyStatement.Builder.() -> Unit):
      AddToPrincipalPolicyResult

  public fun assumeRoleAction(): String

  public fun policyFragment(): PrincipalPolicyFragment

  public fun principalAccount(): String? = unwrap(this).getPrincipalAccount()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.iam.IPrincipal,
  ) : IPrincipal {
    public override fun addToPrincipalPolicy(arg0: PolicyStatement): AddToPrincipalPolicyResult =
        unwrap(this).addToPrincipalPolicy(arg0.let(PolicyStatement::unwrap)).let(AddToPrincipalPolicyResult::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5a2b0fec5c17722d0dc719c3fd27344bee07d931f9f715b331523f4aadc0661")
    public override fun addToPrincipalPolicy(arg0: PolicyStatement.Builder.() -> Unit):
        AddToPrincipalPolicyResult = addToPrincipalPolicy(PolicyStatement(arg0))

    public override fun assumeRoleAction(): String = unwrap(this).getAssumeRoleAction()

    public override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    public override fun policyFragment(): PrincipalPolicyFragment =
        unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

    public override fun principalAccount(): String? = unwrap(this).getPrincipalAccount()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IPrincipal): IPrincipal =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPrincipal): software.amazon.awscdk.services.iam.IPrincipal =
        (wrapped as Wrapper).cdkObject
  }
}
