@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnConfigurationSet

@CdkDslMarker
public class CfnConfigurationSetDeliveryOptionsPropertyDsl {
  private val cdkBuilder: CfnConfigurationSet.DeliveryOptionsProperty.Builder =
      CfnConfigurationSet.DeliveryOptionsProperty.builder()

  public fun sendingPoolName(sendingPoolName: String) {
    cdkBuilder.sendingPoolName(sendingPoolName)
  }

  public fun tlsPolicy(tlsPolicy: String) {
    cdkBuilder.tlsPolicy(tlsPolicy)
  }

  public fun build(): CfnConfigurationSet.DeliveryOptionsProperty = cdkBuilder.build()
}
