@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.CommonGrantOptions
import software.amazon.awscdk.services.iam.IGrantable

@CdkDslMarker
public class CommonGrantOptionsDsl {
  private val cdkBuilder: CommonGrantOptions.Builder = CommonGrantOptions.builder()

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

  public fun build(): CommonGrantOptions {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    if(_resourceArns.isNotEmpty()) cdkBuilder.resourceArns(_resourceArns)
    return cdkBuilder.build()
  }
}
