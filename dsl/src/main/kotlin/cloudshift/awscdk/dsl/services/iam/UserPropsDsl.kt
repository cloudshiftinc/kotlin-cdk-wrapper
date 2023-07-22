@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.iam.IGroup
import software.amazon.awscdk.services.iam.IManagedPolicy
import software.amazon.awscdk.services.iam.UserProps

@CdkDslMarker
public class UserPropsDsl {
  private val cdkBuilder: UserProps.Builder = UserProps.builder()

  private val _groups: MutableList<IGroup> = mutableListOf()

  private val _managedPolicies: MutableList<IManagedPolicy> = mutableListOf()

  /**
   * @param groups Groups to add this user to.
   * You can also use `addToGroup` to add this
   * user to a group.
   */
  public fun groups(vararg groups: IGroup) {
    _groups.addAll(listOf(*groups))
  }

  /**
   * @param groups Groups to add this user to.
   * You can also use `addToGroup` to add this
   * user to a group.
   */
  public fun groups(groups: Collection<IGroup>) {
    _groups.addAll(groups)
  }

  /**
   * @param managedPolicies A list of managed policies associated with this role.
   * You can add managed policies later using
   * `addManagedPolicy(ManagedPolicy.fromAwsManagedPolicyName(policyName))`.
   */
  public fun managedPolicies(vararg managedPolicies: IManagedPolicy) {
    _managedPolicies.addAll(listOf(*managedPolicies))
  }

  /**
   * @param managedPolicies A list of managed policies associated with this role.
   * You can add managed policies later using
   * `addManagedPolicy(ManagedPolicy.fromAwsManagedPolicyName(policyName))`.
   */
  public fun managedPolicies(managedPolicies: Collection<IManagedPolicy>) {
    _managedPolicies.addAll(managedPolicies)
  }

  /**
   * @param password The password for the user. This is required so the user can access the AWS
   * Management Console.
   * You can use `SecretValue.unsafePlainText` to specify a password in plain text or
   * use `secretsmanager.Secret.fromSecretAttributes` to reference a secret in
   * Secrets Manager.
   */
  public fun password(password: SecretValue) {
    cdkBuilder.password(password)
  }

  /**
   * @param passwordResetRequired Specifies whether the user is required to set a new password the
   * next time the user logs in to the AWS Management Console.
   * If this is set to 'true', you must also specify "initialPassword".
   */
  public fun passwordResetRequired(passwordResetRequired: Boolean) {
    cdkBuilder.passwordResetRequired(passwordResetRequired)
  }

  /**
   * @param path The path for the user name.
   * For more information about paths, see IAM
   * Identifiers in the IAM User Guide.
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  /**
   * @param permissionsBoundary AWS supports permissions boundaries for IAM entities (users or
   * roles).
   * A permissions boundary is an advanced feature for using a managed policy
   * to set the maximum permissions that an identity-based policy can grant to
   * an IAM entity. An entity's permissions boundary allows it to perform only
   * the actions that are allowed by both its identity-based policies and its
   * permissions boundaries.
   */
  public fun permissionsBoundary(permissionsBoundary: IManagedPolicy) {
    cdkBuilder.permissionsBoundary(permissionsBoundary)
  }

  /**
   * @param userName A name for the IAM user.
   * For valid values, see the UserName parameter for
   * the CreateUser action in the IAM API Reference. If you don't specify a
   * name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the user name.
   *
   * If you specify a name, you cannot perform updates that require
   * replacement of this resource. You can perform updates that require no or
   * some interruption. If you must replace the resource, specify a new name.
   *
   * If you specify a name, you must specify the CAPABILITY_NAMED_IAM value to
   * acknowledge your template's capabilities. For more information, see
   * Acknowledging IAM Resources in AWS CloudFormation Templates.
   */
  public fun userName(userName: String) {
    cdkBuilder.userName(userName)
  }

  public fun build(): UserProps {
    if(_groups.isNotEmpty()) cdkBuilder.groups(_groups)
    if(_managedPolicies.isNotEmpty()) cdkBuilder.managedPolicies(_managedPolicies)
    return cdkBuilder.build()
  }
}
