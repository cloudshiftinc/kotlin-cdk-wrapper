@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sso

import kotlin.Unit
import software.amazon.awscdk.services.sso.CfnPermissionSet

public inline
    fun CfnPermissionSet.setPermissionsBoundary(block: CfnPermissionSetPermissionsBoundaryPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPermissionSetPermissionsBoundaryPropertyDsl()
  builder.apply(block)
  return setPermissionsBoundary(builder.build())
}
