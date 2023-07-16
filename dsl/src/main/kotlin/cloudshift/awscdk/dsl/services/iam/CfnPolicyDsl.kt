@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.CfnPolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPolicy.Builder = CfnPolicy.Builder.create(scope, id)

  private val _groups: MutableList<String> = mutableListOf()

  private val _roles: MutableList<String> = mutableListOf()

  private val _users: MutableList<String> = mutableListOf()

  public fun groups(vararg groups: String) {
    _groups.addAll(listOf(*groups))
  }

  public fun groups(groups: Collection<String>) {
    _groups.addAll(groups)
  }

  public fun policyDocument(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.policyDocument(builder.map)
  }

  public fun policyDocument(policyDocument: Any) {
    cdkBuilder.policyDocument(policyDocument)
  }

  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  public fun roles(vararg roles: String) {
    _roles.addAll(listOf(*roles))
  }

  public fun roles(roles: Collection<String>) {
    _roles.addAll(roles)
  }

  public fun users(vararg users: String) {
    _users.addAll(listOf(*users))
  }

  public fun users(users: Collection<String>) {
    _users.addAll(users)
  }

  public fun build(): CfnPolicy {
    if(_groups.isNotEmpty()) cdkBuilder.groups(_groups)
    if(_roles.isNotEmpty()) cdkBuilder.roles(_roles)
    if(_users.isNotEmpty()) cdkBuilder.users(_users)
    return cdkBuilder.build()
  }
}
