@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * An IAM principal with additional conditions specifying when the policy is in effect.
 *
 * For more information about conditions, see:
 * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Object conditions;
 * IPrincipal principal;
 * PrincipalWithConditions principalWithConditions = new PrincipalWithConditions(principal, Map.of(
 * "conditionsKey", conditions));
 * ```
 */
public open class PrincipalWithConditions(
  cdkObject: software.amazon.awscdk.services.iam.PrincipalWithConditions,
) : PrincipalBase(cdkObject) {
  public constructor(principal: IPrincipal, conditions: Map<String, Any>) :
      this(software.amazon.awscdk.services.iam.PrincipalWithConditions(principal.let(IPrincipal.Companion::unwrap),
      conditions.mapValues{CdkObjectWrappers.unwrap(it.value)})
  )

  /**
   * Add a condition to the principal.
   *
   * @param key 
   * @param value 
   */
  public open fun addCondition(key: String, `value`: Any) {
    unwrap(this).addCondition(key, `value`)
  }

  /**
   * Adds multiple conditions to the principal.
   *
   * Values from the conditions parameter will overwrite existing values with the same operator
   * and key.
   *
   * @param conditions 
   */
  public open fun addConditions(conditions: Map<String, Any>) {
    unwrap(this).addConditions(conditions.mapValues{CdkObjectWrappers.unwrap(it.value)})
  }

  /**
   * Add the principal to the AssumeRolePolicyDocument.
   *
   * Add the statements to the AssumeRolePolicyDocument necessary to give this principal
   * permissions to assume the given role.
   *
   * @param doc 
   */
  public override fun addToAssumeRolePolicy(doc: PolicyDocument) {
    unwrap(this).addToAssumeRolePolicy(doc.let(PolicyDocument.Companion::unwrap))
  }

  /**
   * Add the principal to the AssumeRolePolicyDocument.
   *
   * Add the statements to the AssumeRolePolicyDocument necessary to give this principal
   * permissions to assume the given role.
   *
   * @param doc 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cef9e06c9678a219d566dc6f09959675ba743f7c64440ddbd5b37c4d552db9c0")
  public override fun addToAssumeRolePolicy(doc: PolicyDocument.Builder.() -> Unit): Unit =
      addToAssumeRolePolicy(PolicyDocument(doc))

  /**
   * Add to the policy of this principal.
   *
   * @param statement 
   */
  public override fun addToPolicy(statement: PolicyStatement): Boolean =
      unwrap(this).addToPolicy(statement.let(PolicyStatement.Companion::unwrap))

  /**
   * Add to the policy of this principal.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6148e52b961e7728ba57cdabfd202385d97a77f6d5da33adb746c32e8c75340f")
  public override fun addToPolicy(statement: PolicyStatement.Builder.() -> Unit): Boolean =
      addToPolicy(PolicyStatement(statement))

  /**
   * Add to the policy of this principal.
   *
   * @param statement 
   */
  public override fun addToPrincipalPolicy(statement: PolicyStatement): AddToPrincipalPolicyResult =
      unwrap(this).addToPrincipalPolicy(statement.let(PolicyStatement.Companion::unwrap)).let(AddToPrincipalPolicyResult::wrap)

  /**
   * Add to the policy of this principal.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e5a2b0fec5c17722d0dc719c3fd27344bee07d931f9f715b331523f4aadc0661")
  public override fun addToPrincipalPolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToPrincipalPolicyResult = addToPrincipalPolicy(PolicyStatement(statement))

  /**
   * When this Principal is used in an AssumeRole policy, the action to use.
   */
  public override fun assumeRoleAction(): String = unwrap(this).getAssumeRoleAction()

  /**
   * The conditions under which the policy is in effect.
   *
   * See [the IAM
   * documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html).
   */
  public open fun conditions(): Map<String, Any> = unwrap(this).getConditions() ?: emptyMap()

  /**
   * Return whether or not this principal is equal to the given principal.
   */
  public override fun dedupeString(): String? = unwrap(this).dedupeString()

  /**
   * Return the policy fragment that identifies this principal in a Policy.
   */
  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  /**
   * The AWS account ID of this principal.
   *
   * Can be undefined when the account is not known
   * (for example, for service principals).
   * Can be a Token - in that case,
   * it's assumed to be AWS::AccountId.
   */
  public override fun principalAccount(): String? = unwrap(this).getPrincipalAccount()

  /**
   * JSON-ify the principal.
   *
   * Used when JSON.stringify() is called
   */
  public override fun toJSON(): Map<String, List<String>> = unwrap(this).toJSON() ?: emptyMap()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.PrincipalWithConditions):
        PrincipalWithConditions = PrincipalWithConditions(cdkObject)

    internal fun unwrap(wrapped: PrincipalWithConditions):
        software.amazon.awscdk.services.iam.PrincipalWithConditions = wrapped.cdkObject as
        software.amazon.awscdk.services.iam.PrincipalWithConditions
  }
}
