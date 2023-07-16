@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.acmpca.CfnPermissionProps

@CdkDslMarker
public class CfnPermissionPropsDsl {
  private val cdkBuilder: CfnPermissionProps.Builder = CfnPermissionProps.builder()

  private val _actions: MutableList<String> = mutableListOf()

  public fun actions(vararg actions: String) {
    _actions.addAll(listOf(*actions))
  }

  public fun actions(actions: Collection<String>) {
    _actions.addAll(actions)
  }

  public fun certificateAuthorityArn(certificateAuthorityArn: String) {
    cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
  }

  public fun principal(principal: String) {
    cdkBuilder.principal(principal)
  }

  public fun sourceAccount(sourceAccount: String) {
    cdkBuilder.sourceAccount(sourceAccount)
  }

  public fun build(): CfnPermissionProps {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    return cdkBuilder.build()
  }
}
