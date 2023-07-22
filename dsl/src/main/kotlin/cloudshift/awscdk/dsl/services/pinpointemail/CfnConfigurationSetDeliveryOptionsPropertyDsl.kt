@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet

@CdkDslMarker
public class CfnConfigurationSetDeliveryOptionsPropertyDsl {
  private val cdkBuilder: CfnConfigurationSet.DeliveryOptionsProperty.Builder =
      CfnConfigurationSet.DeliveryOptionsProperty.builder()

  /**
   * @param sendingPoolName The name of the dedicated IP pool that you want to associate with the
   * configuration set.
   */
  public fun sendingPoolName(sendingPoolName: String) {
    cdkBuilder.sendingPoolName(sendingPoolName)
  }

  public fun build(): CfnConfigurationSet.DeliveryOptionsProperty = cdkBuilder.build()
}
