@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions

@CdkDslMarker
public class CfnPrincipalPermissionsLFTagPolicyResourcePropertyDsl {
  private val cdkBuilder: CfnPrincipalPermissions.LFTagPolicyResourceProperty.Builder =
      CfnPrincipalPermissions.LFTagPolicyResourceProperty.builder()

  private val _expression: MutableList<Any> = mutableListOf()

  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  public fun expression(vararg expression: Any) {
    _expression.addAll(listOf(*expression))
  }

  public fun expression(expression: Collection<Any>) {
    _expression.addAll(expression)
  }

  public fun expression(expression: IResolvable) {
    cdkBuilder.expression(expression)
  }

  public fun resourceType(resourceType: String) {
    cdkBuilder.resourceType(resourceType)
  }

  public fun build(): CfnPrincipalPermissions.LFTagPolicyResourceProperty {
    if(_expression.isNotEmpty()) cdkBuilder.expression(_expression)
    return cdkBuilder.build()
  }
}
