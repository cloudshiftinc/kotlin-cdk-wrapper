@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings

@CdkDslMarker
public class CfnDataLakeSettingsPrincipalPermissionsPropertyDsl {
  private val cdkBuilder: CfnDataLakeSettings.PrincipalPermissionsProperty.Builder =
      CfnDataLakeSettings.PrincipalPermissionsProperty.builder()

  private val _permissions: MutableList<String> = mutableListOf()

  public fun permissions(vararg permissions: String) {
    _permissions.addAll(listOf(*permissions))
  }

  public fun permissions(permissions: Collection<String>) {
    _permissions.addAll(permissions)
  }

  public fun principal(principal: IResolvable) {
    cdkBuilder.principal(principal)
  }

  public fun principal(principal: CfnDataLakeSettings.DataLakePrincipalProperty) {
    cdkBuilder.principal(principal)
  }

  public fun build(): CfnDataLakeSettings.PrincipalPermissionsProperty {
    if(_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
    return cdkBuilder.build()
  }
}
