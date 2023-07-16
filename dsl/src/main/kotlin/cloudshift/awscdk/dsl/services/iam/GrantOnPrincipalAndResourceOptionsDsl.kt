@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions
import software.amazon.awscdk.services.iam.IGrantable
import software.amazon.awscdk.services.iam.IPrincipal
import software.amazon.awscdk.services.iam.IResourceWithPolicy

@CdkDslMarker
public class GrantOnPrincipalAndResourceOptionsDsl {
  private val cdkBuilder: GrantOnPrincipalAndResourceOptions.Builder =
      GrantOnPrincipalAndResourceOptions.builder()

  private val _actions: MutableList<String> = mutableListOf()

  private val _resourceArns: MutableList<String> = mutableListOf()

  private val _resourceSelfArns: MutableList<String> = mutableListOf()

  public fun actions(vararg actions: String) {
    _actions.addAll(listOf(*actions))
  }

  public fun actions(actions: Collection<String>) {
    _actions.addAll(actions)
  }

  public fun conditions(conditions: Map<String, out Map<String, *>>) {
    cdkBuilder.conditions(conditions)
  }

  public fun grantee(grantee: IGrantable) {
    cdkBuilder.grantee(grantee)
  }

  public fun resource(resource: IResourceWithPolicy) {
    cdkBuilder.resource(resource)
  }

  public fun resourceArns(vararg resourceArns: String) {
    _resourceArns.addAll(listOf(*resourceArns))
  }

  public fun resourceArns(resourceArns: Collection<String>) {
    _resourceArns.addAll(resourceArns)
  }

  public fun resourcePolicyPrincipal(resourcePolicyPrincipal: IPrincipal) {
    cdkBuilder.resourcePolicyPrincipal(resourcePolicyPrincipal)
  }

  public fun resourceSelfArns(vararg resourceSelfArns: String) {
    _resourceSelfArns.addAll(listOf(*resourceSelfArns))
  }

  public fun resourceSelfArns(resourceSelfArns: Collection<String>) {
    _resourceSelfArns.addAll(resourceSelfArns)
  }

  public fun build(): GrantOnPrincipalAndResourceOptions {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    if(_resourceArns.isNotEmpty()) cdkBuilder.resourceArns(_resourceArns)
    if(_resourceSelfArns.isNotEmpty()) cdkBuilder.resourceSelfArns(_resourceSelfArns)
    return cdkBuilder.build()
  }
}
