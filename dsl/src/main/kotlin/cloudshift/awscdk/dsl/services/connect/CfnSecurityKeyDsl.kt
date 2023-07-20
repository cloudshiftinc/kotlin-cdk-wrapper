@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnSecurityKey
import software.constructs.Construct

@CdkDslMarker
public class CfnSecurityKeyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSecurityKey.Builder = CfnSecurityKey.Builder.create(scope, id)

  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun build(): CfnSecurityKey = cdkBuilder.build()
}
