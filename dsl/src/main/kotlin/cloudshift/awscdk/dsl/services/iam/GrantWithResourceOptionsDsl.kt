@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.GrantWithResourceOptions
import software.amazon.awscdk.services.iam.IGrantable
import software.amazon.awscdk.services.iam.IResourceWithPolicy

/**
 * Options for a grant operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * Object conditions;
 * IGrantable grantable;
 * IResourceWithPolicy resourceWithPolicy;
 * GrantWithResourceOptions grantWithResourceOptions = GrantWithResourceOptions.builder()
 * .actions(List.of("actions"))
 * .grantee(grantable)
 * .resource(resourceWithPolicy)
 * .resourceArns(List.of("resourceArns"))
 * // the properties below are optional
 * .conditions(Map.of(
 * "conditionsKey", Map.of(
 * "conditionsKey", conditions)))
 * .resourceSelfArns(List.of("resourceSelfArns"))
 * .build();
 * ```
 */
@CdkDslMarker
public class GrantWithResourceOptionsDsl {
  private val cdkBuilder: GrantWithResourceOptions.Builder = GrantWithResourceOptions.builder()

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
   * The statement will be added to the resource policy if it couldn't be
   * added to the principal policy.
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

  public fun build(): GrantWithResourceOptions {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    if(_resourceArns.isNotEmpty()) cdkBuilder.resourceArns(_resourceArns)
    if(_resourceSelfArns.isNotEmpty()) cdkBuilder.resourceSelfArns(_resourceSelfArns)
    return cdkBuilder.build()
  }
}
