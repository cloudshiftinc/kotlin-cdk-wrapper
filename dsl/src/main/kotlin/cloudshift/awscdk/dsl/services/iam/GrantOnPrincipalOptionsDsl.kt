@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.GrantOnPrincipalOptions
import software.amazon.awscdk.services.iam.IGrantable
import software.constructs.IConstruct

/**
 * Options for a grant operation that only applies to principals.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * import software.constructs.*;
 * Object conditions;
 * Construct construct;
 * IGrantable grantable;
 * GrantOnPrincipalOptions grantOnPrincipalOptions = GrantOnPrincipalOptions.builder()
 * .actions(List.of("actions"))
 * .grantee(grantable)
 * .resourceArns(List.of("resourceArns"))
 * // the properties below are optional
 * .conditions(Map.of(
 * "conditionsKey", Map.of(
 * "conditionsKey", conditions)))
 * .scope(construct)
 * .build();
 * ```
 */
@CdkDslMarker
public class GrantOnPrincipalOptionsDsl {
  private val cdkBuilder: GrantOnPrincipalOptions.Builder = GrantOnPrincipalOptions.builder()

  private val _actions: MutableList<String> = mutableListOf()

  private val _resourceArns: MutableList<String> = mutableListOf()

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
   * @param scope Construct to report warnings on in case grant could not be registered.
   */
  public fun scope(scope: IConstruct) {
    cdkBuilder.scope(scope)
  }

  public fun build(): GrantOnPrincipalOptions {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    if(_resourceArns.isNotEmpty()) cdkBuilder.resourceArns(_resourceArns)
    return cdkBuilder.build()
  }
}
