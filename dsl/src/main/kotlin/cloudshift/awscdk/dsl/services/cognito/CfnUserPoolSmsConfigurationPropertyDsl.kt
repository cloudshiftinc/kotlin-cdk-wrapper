@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPool

@CdkDslMarker
public class CfnUserPoolSmsConfigurationPropertyDsl {
  private val cdkBuilder: CfnUserPool.SmsConfigurationProperty.Builder =
      CfnUserPool.SmsConfigurationProperty.builder()

  public fun externalId(externalId: String) {
    cdkBuilder.externalId(externalId)
  }

  public fun snsCallerArn(snsCallerArn: String) {
    cdkBuilder.snsCallerArn(snsCallerArn)
  }

  public fun snsRegion(snsRegion: String) {
    cdkBuilder.snsRegion(snsRegion)
  }

  public fun build(): CfnUserPool.SmsConfigurationProperty = cdkBuilder.build()
}
