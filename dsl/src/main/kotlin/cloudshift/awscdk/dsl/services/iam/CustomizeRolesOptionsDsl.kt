@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.iam.CustomizeRolesOptions

@CdkDslMarker
public class CustomizeRolesOptionsDsl {
  private val cdkBuilder: CustomizeRolesOptions.Builder = CustomizeRolesOptions.builder()

  public fun preventSynthesis(preventSynthesis: Boolean) {
    cdkBuilder.preventSynthesis(preventSynthesis)
  }

  public fun usePrecreatedRoles(usePrecreatedRoles: Map<String, String>) {
    cdkBuilder.usePrecreatedRoles(usePrecreatedRoles)
  }

  public fun build(): CustomizeRolesOptions = cdkBuilder.build()
}
