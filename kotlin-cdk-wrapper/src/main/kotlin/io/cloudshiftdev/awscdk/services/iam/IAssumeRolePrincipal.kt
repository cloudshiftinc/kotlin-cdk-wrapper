@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A type of principal that has more control over its own representation in
 * AssumeRolePolicyDocuments.
 *
 * More complex types of identity providers need more control over Role's policy documents
 * than simply `{ Effect: 'Allow', Action: 'AssumeRole', Principal: &lt;Whatever&gt; }`.
 *
 * If that control is necessary, they can implement `IAssumeRolePrincipal` to get full
 * access to a Role's AssumeRolePolicyDocument.
 */
public interface IAssumeRolePrincipal : IPrincipal {
  /**
   * Add the principal to the AssumeRolePolicyDocument.
   *
   * Add the statements to the AssumeRolePolicyDocument necessary to give this principal
   * permissions to assume the given role.
   *
   * @param document 
   */
  public fun addToAssumeRolePolicy(document: PolicyDocument)

  /**
   * Add the principal to the AssumeRolePolicyDocument.
   *
   * Add the statements to the AssumeRolePolicyDocument necessary to give this principal
   * permissions to assume the given role.
   *
   * @param document 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cef9e06c9678a219d566dc6f09959675ba743f7c64440ddbd5b37c4d552db9c0")
  public fun addToAssumeRolePolicy(document: PolicyDocument.Builder.() -> Unit)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iam.IAssumeRolePrincipal,
  ) : CdkObject(cdkObject),
      IAssumeRolePrincipal {
    /**
     * Add the principal to the AssumeRolePolicyDocument.
     *
     * Add the statements to the AssumeRolePolicyDocument necessary to give this principal
     * permissions to assume the given role.
     *
     * @param document 
     */
    override fun addToAssumeRolePolicy(document: PolicyDocument) {
      unwrap(this).addToAssumeRolePolicy(document.let(PolicyDocument.Companion::unwrap))
    }

    /**
     * Add the principal to the AssumeRolePolicyDocument.
     *
     * Add the statements to the AssumeRolePolicyDocument necessary to give this principal
     * permissions to assume the given role.
     *
     * @param document 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cef9e06c9678a219d566dc6f09959675ba743f7c64440ddbd5b37c4d552db9c0")
    override fun addToAssumeRolePolicy(document: PolicyDocument.Builder.() -> Unit): Unit =
        addToAssumeRolePolicy(PolicyDocument(document))

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
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IAssumeRolePrincipal):
        IAssumeRolePrincipal = CdkObjectWrappers.wrap(cdkObject) as? IAssumeRolePrincipal ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAssumeRolePrincipal):
        software.amazon.awscdk.services.iam.IAssumeRolePrincipal = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.IAssumeRolePrincipal
  }
}
