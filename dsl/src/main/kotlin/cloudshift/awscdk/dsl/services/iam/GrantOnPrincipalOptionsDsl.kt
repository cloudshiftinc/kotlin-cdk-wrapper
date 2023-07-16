@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.GrantOnPrincipalOptions
import software.amazon.awscdk.services.iam.IGrantable
import software.constructs.IConstruct

@CdkDslMarker
public class GrantOnPrincipalOptionsDsl {
  private val cdkBuilder: GrantOnPrincipalOptions.Builder = GrantOnPrincipalOptions.builder()

  private val _actions: MutableList<String> = mutableListOf()

  private val _resourceArns: MutableList<String> = mutableListOf()

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

  public fun resourceArns(vararg resourceArns: String) {
    _resourceArns.addAll(listOf(*resourceArns))
  }

  public fun resourceArns(resourceArns: Collection<String>) {
    _resourceArns.addAll(resourceArns)
  }

  public fun scope(scope: IConstruct) {
    cdkBuilder.scope(scope)
  }

  public fun build(): GrantOnPrincipalOptions {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    if(_resourceArns.isNotEmpty()) cdkBuilder.resourceArns(_resourceArns)
    return cdkBuilder.build()
  }
}
