@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnDatabase

@CdkDslMarker
public class CfnDatabasePrincipalPrivilegesPropertyDsl {
  private val cdkBuilder: CfnDatabase.PrincipalPrivilegesProperty.Builder =
      CfnDatabase.PrincipalPrivilegesProperty.builder()

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

  public fun principal(principal: CfnDatabase.DataLakePrincipalProperty) {
    cdkBuilder.principal(principal)
  }

  public fun build(): CfnDatabase.PrincipalPrivilegesProperty {
    if(_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
    return cdkBuilder.build()
  }
}
