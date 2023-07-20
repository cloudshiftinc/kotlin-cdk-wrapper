@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnUsagePlanKey
import software.constructs.Construct

@CdkDslMarker
public class CfnUsagePlanKeyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnUsagePlanKey.Builder = CfnUsagePlanKey.Builder.create(scope, id)

  public fun keyId(keyId: String) {
    cdkBuilder.keyId(keyId)
  }

  public fun keyType(keyType: String) {
    cdkBuilder.keyType(keyType)
  }

  public fun usagePlanId(usagePlanId: String) {
    cdkBuilder.usagePlanId(usagePlanId)
  }

  public fun build(): CfnUsagePlanKey = cdkBuilder.build()
}
