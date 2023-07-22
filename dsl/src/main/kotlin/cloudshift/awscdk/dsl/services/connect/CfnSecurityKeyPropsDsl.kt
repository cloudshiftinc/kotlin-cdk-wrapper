@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnSecurityKeyProps

@CdkDslMarker
public class CfnSecurityKeyPropsDsl {
  private val cdkBuilder: CfnSecurityKeyProps.Builder = CfnSecurityKeyProps.builder()

  /**
   * @param instanceId The Amazon Resource Name (ARN) of the instance. 
   * *Minimum* : `1`
   *
   * *Maximum* : `100`
   */
  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  /**
   * @param key A valid security key in PEM format. For example:. 
   * `"-----BEGIN PUBLIC KEY-----\ [a lot of characters] ----END PUBLIC KEY-----"`
   *
   * *Minimum* : `1`
   *
   * *Maximum* : `1024`
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun build(): CfnSecurityKeyProps = cdkBuilder.build()
}
