@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents a logical IAM principal.
 *
 * An IPrincipal describes a logical entity that can perform AWS API calls
 * against sets of resources, optionally under certain conditions.
 *
 * Examples of simple principals are IAM objects that you create, such
 * as Users or Roles.
 *
 * An example of a more complex principals is a `ServicePrincipal` (such as
 * `new ServicePrincipal("sns.amazonaws.com")`, which represents the Simple
 * Notifications Service).
 *
 * A single logical Principal may also map to a set of physical principals.
 * For example, `new OrganizationPrincipal('o-1234')` represents all
 * identities that are part of the given AWS Organization.
 */
public interface IPrincipal : IGrantable {
  /**
   * Add to the policy of this principal.
   *
   * @param statement 
   */
  public fun addToPrincipalPolicy(statement: PolicyStatement): AddToPrincipalPolicyResult

  /**
   * Add to the policy of this principal.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e5a2b0fec5c17722d0dc719c3fd27344bee07d931f9f715b331523f4aadc0661")
  public fun addToPrincipalPolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToPrincipalPolicyResult

  /**
   * When this Principal is used in an AssumeRole policy, the action to use.
   */
  public fun assumeRoleAction(): String

  /**
   * Return the policy fragment that identifies this principal in a Policy.
   */
  public fun policyFragment(): PrincipalPolicyFragment

  /**
   * The AWS account ID of this principal.
   *
   * Can be undefined when the account is not known
   * (for example, for service principals).
   * Can be a Token - in that case,
   * it's assumed to be AWS::AccountId.
   */
  public fun principalAccount(): String? = unwrap(this).getPrincipalAccount()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IPrincipal): IPrincipal =
        CdkObjectWrappers.wrap(cdkObject) as IPrincipal

    internal fun unwrap(wrapped: IPrincipal): software.amazon.awscdk.services.iam.IPrincipal =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.IPrincipal
  }
}
