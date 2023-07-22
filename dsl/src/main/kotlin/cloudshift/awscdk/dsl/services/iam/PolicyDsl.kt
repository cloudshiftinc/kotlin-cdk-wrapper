@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.IGroup
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.iam.IUser
import software.amazon.awscdk.services.iam.Policy
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.iam.PolicyStatement
import software.constructs.Construct

@CdkDslMarker
public class PolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Policy.Builder = Policy.Builder.create(scope, id)

  private val _groups: MutableList<IGroup> = mutableListOf()

  private val _roles: MutableList<IRole> = mutableListOf()

  private val _statements: MutableList<PolicyStatement> = mutableListOf()

  private val _users: MutableList<IUser> = mutableListOf()

  /**
   * Initial PolicyDocument to use for this Policy.
   *
   * If omited, any
   * `PolicyStatement` provided in the `statements` property will be applied
   * against the empty default `PolicyDocument`.
   *
   * Default: - An empty policy.
   *
   * @param document Initial PolicyDocument to use for this Policy. 
   */
  public fun document(document: PolicyDocumentDsl.() -> Unit = {}) {
    val builder = PolicyDocumentDsl()
    builder.apply(document)
    cdkBuilder.document(builder.build())
  }

  /**
   * Initial PolicyDocument to use for this Policy.
   *
   * If omited, any
   * `PolicyStatement` provided in the `statements` property will be applied
   * against the empty default `PolicyDocument`.
   *
   * Default: - An empty policy.
   *
   * @param document Initial PolicyDocument to use for this Policy. 
   */
  public fun document(document: PolicyDocument) {
    cdkBuilder.document(document)
  }

  /**
   * Force creation of an `AWS::IAM::Policy`.
   *
   * Unless set to `true`, this `Policy` construct will not materialize to an
   * `AWS::IAM::Policy` CloudFormation resource in case it would have no effect
   * (for example, if it remains unattached to an IAM identity or if it has no
   * statements). This is generally desired behavior, since it prevents
   * creating invalid--and hence undeployable--CloudFormation templates.
   *
   * In cases where you know the policy must be created and it is actually
   * an error if no statements have been added to it, you can set this to `true`.
   *
   * Default: false
   *
   * @param force Force creation of an `AWS::IAM::Policy`. 
   */
  public fun force(force: Boolean) {
    cdkBuilder.force(force)
  }

  /**
   * Groups to attach this policy to.
   *
   * You can also use `attachToGroup(group)` to attach this policy to a group.
   *
   * Default: - No groups.
   *
   * @param groups Groups to attach this policy to. 
   */
  public fun groups(vararg groups: IGroup) {
    _groups.addAll(listOf(*groups))
  }

  /**
   * Groups to attach this policy to.
   *
   * You can also use `attachToGroup(group)` to attach this policy to a group.
   *
   * Default: - No groups.
   *
   * @param groups Groups to attach this policy to. 
   */
  public fun groups(groups: Collection<IGroup>) {
    _groups.addAll(groups)
  }

  /**
   * The name of the policy.
   *
   * If you specify multiple policies for an entity,
   * specify unique names. For example, if you specify a list of policies for
   * an IAM role, each policy must have a unique name.
   *
   * Default: - Uses the logical ID of the policy resource, which is ensured
   * to be unique within the stack.
   *
   * @param policyName The name of the policy. 
   */
  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  /**
   * Roles to attach this policy to.
   *
   * You can also use `attachToRole(role)` to attach this policy to a role.
   *
   * Default: - No roles.
   *
   * @param roles Roles to attach this policy to. 
   */
  public fun roles(vararg roles: IRole) {
    _roles.addAll(listOf(*roles))
  }

  /**
   * Roles to attach this policy to.
   *
   * You can also use `attachToRole(role)` to attach this policy to a role.
   *
   * Default: - No roles.
   *
   * @param roles Roles to attach this policy to. 
   */
  public fun roles(roles: Collection<IRole>) {
    _roles.addAll(roles)
  }

  /**
   * Initial set of permissions to add to this policy document.
   *
   * You can also use `addStatements(...statement)` to add permissions later.
   *
   * Default: - No statements.
   *
   * @param statements Initial set of permissions to add to this policy document. 
   */
  public fun statements(statements: PolicyStatementDsl.() -> Unit) {
    _statements.add(PolicyStatementDsl().apply(statements).build())
  }

  /**
   * Initial set of permissions to add to this policy document.
   *
   * You can also use `addStatements(...statement)` to add permissions later.
   *
   * Default: - No statements.
   *
   * @param statements Initial set of permissions to add to this policy document. 
   */
  public fun statements(statements: Collection<PolicyStatement>) {
    _statements.addAll(statements)
  }

  /**
   * Users to attach this policy to.
   *
   * You can also use `attachToUser(user)` to attach this policy to a user.
   *
   * Default: - No users.
   *
   * @param users Users to attach this policy to. 
   */
  public fun users(vararg users: IUser) {
    _users.addAll(listOf(*users))
  }

  /**
   * Users to attach this policy to.
   *
   * You can also use `attachToUser(user)` to attach this policy to a user.
   *
   * Default: - No users.
   *
   * @param users Users to attach this policy to. 
   */
  public fun users(users: Collection<IUser>) {
    _users.addAll(users)
  }

  public fun build(): Policy {
    if(_groups.isNotEmpty()) cdkBuilder.groups(_groups)
    if(_roles.isNotEmpty()) cdkBuilder.roles(_roles)
    if(_statements.isNotEmpty()) cdkBuilder.statements(_statements)
    if(_users.isNotEmpty()) cdkBuilder.users(_users)
    return cdkBuilder.build()
  }
}
