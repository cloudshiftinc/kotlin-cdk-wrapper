@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sso

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sso.CfnPermissionSet
import software.constructs.Construct

@CdkDslMarker
public class CfnPermissionSetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPermissionSet.Builder = CfnPermissionSet.Builder.create(scope, id)

  private val _customerManagedPolicyReferences: MutableList<Any> = mutableListOf()

  private val _managedPolicies: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun customerManagedPolicyReferences(vararg customerManagedPolicyReferences: Any) {
    _customerManagedPolicyReferences.addAll(listOf(*customerManagedPolicyReferences))
  }

  public fun customerManagedPolicyReferences(customerManagedPolicyReferences: Collection<Any>) {
    _customerManagedPolicyReferences.addAll(customerManagedPolicyReferences)
  }

  public fun customerManagedPolicyReferences(customerManagedPolicyReferences: IResolvable) {
    cdkBuilder.customerManagedPolicyReferences(customerManagedPolicyReferences)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun inlinePolicy(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.inlinePolicy(builder.map)
  }

  public fun inlinePolicy(inlinePolicy: Any) {
    cdkBuilder.inlinePolicy(inlinePolicy)
  }

  public fun instanceArn(instanceArn: String) {
    cdkBuilder.instanceArn(instanceArn)
  }

  public fun managedPolicies(vararg managedPolicies: String) {
    _managedPolicies.addAll(listOf(*managedPolicies))
  }

  public fun managedPolicies(managedPolicies: Collection<String>) {
    _managedPolicies.addAll(managedPolicies)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun permissionsBoundary(permissionsBoundary: IResolvable) {
    cdkBuilder.permissionsBoundary(permissionsBoundary)
  }

  public
      fun permissionsBoundary(permissionsBoundary: CfnPermissionSet.PermissionsBoundaryProperty) {
    cdkBuilder.permissionsBoundary(permissionsBoundary)
  }

  public fun relayStateType(relayStateType: String) {
    cdkBuilder.relayStateType(relayStateType)
  }

  public fun sessionDuration(sessionDuration: String) {
    cdkBuilder.sessionDuration(sessionDuration)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPermissionSet {
    if(_customerManagedPolicyReferences.isNotEmpty())
        cdkBuilder.customerManagedPolicyReferences(_customerManagedPolicyReferences)
    if(_managedPolicies.isNotEmpty()) cdkBuilder.managedPolicies(_managedPolicies)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
