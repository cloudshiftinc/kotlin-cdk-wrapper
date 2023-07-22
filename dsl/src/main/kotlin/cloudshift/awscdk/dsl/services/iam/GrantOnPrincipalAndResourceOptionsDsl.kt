@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
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

  /**
   * @param actions The actions to grant. 
   */
  public fun actions(vararg actions: String) {
    _actions.addAll(listOf(*actions))
  }

  /**
   * @param actions The actions to grant. 
   */
  public fun actions(actions: Collection<String>) {
    _actions.addAll(actions)
  }

  /**
   * @param conditions Any conditions to attach to the grant.
   */
  public fun conditions(conditions: Map<String, Map<String, Any>>) {
    cdkBuilder.conditions(conditions)
  }

  /**
   * @param grantee The principal to grant to. 
   */
  public fun grantee(grantee: IGrantable) {
    cdkBuilder.grantee(grantee)
  }

  /**
   * @param resource The resource with a resource policy. 
   * The statement will always be added to the resource policy.
   */
  public fun resource(resource: IResourceWithPolicy) {
    cdkBuilder.resource(resource)
  }

  /**
   * @param resourceArns The resource ARNs to grant to. 
   */
  public fun resourceArns(vararg resourceArns: String) {
    _resourceArns.addAll(listOf(*resourceArns))
  }

  /**
   * @param resourceArns The resource ARNs to grant to. 
   */
  public fun resourceArns(resourceArns: Collection<String>) {
    _resourceArns.addAll(resourceArns)
  }

  /**
   * @param resourcePolicyPrincipal The principal to use in the statement for the resource policy.
   */
  public fun resourcePolicyPrincipal(resourcePolicyPrincipal: IPrincipal) {
    cdkBuilder.resourcePolicyPrincipal(resourcePolicyPrincipal)
  }

  /**
   * @param resourceSelfArns When referring to the resource in a resource policy, use this as ARN.
   * (Depending on the resource type, this needs to be '*' in a resource policy).
   */
  public fun resourceSelfArns(vararg resourceSelfArns: String) {
    _resourceSelfArns.addAll(listOf(*resourceSelfArns))
  }

  /**
   * @param resourceSelfArns When referring to the resource in a resource policy, use this as ARN.
   * (Depending on the resource type, this needs to be '*' in a resource policy).
   */
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
