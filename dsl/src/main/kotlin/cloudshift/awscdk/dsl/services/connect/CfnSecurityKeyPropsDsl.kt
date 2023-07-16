@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnSecurityKeyProps

@CdkDslMarker
public class CfnSecurityKeyPropsDsl {
  private val cdkBuilder: CfnSecurityKeyProps.Builder = CfnSecurityKeyProps.builder()

  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun build(): CfnSecurityKeyProps = cdkBuilder.build()
}
