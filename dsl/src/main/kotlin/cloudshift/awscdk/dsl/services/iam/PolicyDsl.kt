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

  public fun document(block: PolicyDocumentDsl.() -> Unit = {}) {
    val builder = PolicyDocumentDsl()
    builder.apply(block)
    cdkBuilder.document(builder.build())
  }

  public fun document(document: PolicyDocument) {
    cdkBuilder.document(document)
  }

  public fun force(force: Boolean) {
    cdkBuilder.force(force)
  }

  public fun groups(vararg groups: IGroup) {
    _groups.addAll(listOf(*groups))
  }

  public fun groups(groups: Collection<IGroup>) {
    _groups.addAll(groups)
  }

  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  public fun roles(vararg roles: IRole) {
    _roles.addAll(listOf(*roles))
  }

  public fun roles(roles: Collection<IRole>) {
    _roles.addAll(roles)
  }

  public fun statements(statements: PolicyStatementDsl.() -> Unit) {
    _statements.add(PolicyStatementDsl().apply(statements).build())
  }

  public fun statements(statements: Collection<PolicyStatement>) {
    _statements.addAll(statements)
  }

  public fun users(vararg users: IUser) {
    _users.addAll(listOf(*users))
  }

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
