@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Interface for principals that can be compared.
 *
 * This only needs to be implemented for principals that could potentially be value-equal.
 * Identity-equal principals will be handled correctly by default.
 */
public interface IComparablePrincipal : IPrincipal {
  /**
   * Return a string format of this principal which should be identical if the two principals are
   * the same.
   */
  public fun dedupeString(): String?

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iam.IComparablePrincipal,
  ) : CdkObject(cdkObject),
      IComparablePrincipal {
    /**
     * Add to the policy of this principal.
     *
     * @param statement 
     */
    override fun addToPrincipalPolicy(statement: PolicyStatement): AddToPrincipalPolicyResult =
        unwrap(this).addToPrincipalPolicy(statement.let(PolicyStatement.Companion::unwrap)).let(AddToPrincipalPolicyResult::wrap)

    /**
     * Add to the policy of this principal.
     *
     * @param statement 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5a2b0fec5c17722d0dc719c3fd27344bee07d931f9f715b331523f4aadc0661")
    override fun addToPrincipalPolicy(statement: PolicyStatement.Builder.() -> Unit):
        AddToPrincipalPolicyResult = addToPrincipalPolicy(PolicyStatement(statement))

    /**
     * When this Principal is used in an AssumeRole policy, the action to use.
     */
    override fun assumeRoleAction(): String = unwrap(this).getAssumeRoleAction()

    /**
     * Return a string format of this principal which should be identical if the two principals are
     * the same.
     */
    override fun dedupeString(): String? = unwrap(this).dedupeString()

    /**
     * The principal to grant permissions to.
     */
    override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    /**
     * Return the policy fragment that identifies this principal in a Policy.
     */
    override fun policyFragment(): PrincipalPolicyFragment =
        unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

    /**
     * The AWS account ID of this principal.
     *
     * Can be undefined when the account is not known
     * (for example, for service principals).
     * Can be a Token - in that case,
     * it's assumed to be AWS::AccountId.
     */
    override fun principalAccount(): String? = unwrap(this).getPrincipalAccount()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IComparablePrincipal):
        IComparablePrincipal = CdkObjectWrappers.wrap(cdkObject) as? IComparablePrincipal ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IComparablePrincipal):
        software.amazon.awscdk.services.iam.IComparablePrincipal = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.IComparablePrincipal
  }
}
