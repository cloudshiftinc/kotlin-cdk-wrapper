@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet

@CdkDslMarker
public class CfnConfigurationSetSendingOptionsPropertyDsl {
  private val cdkBuilder: CfnConfigurationSet.SendingOptionsProperty.Builder =
      CfnConfigurationSet.SendingOptionsProperty.builder()

  /**
   * @param sendingEnabled If `true` , email sending is enabled for the configuration set.
   * If `false` , email sending is disabled for the configuration set.
   */
  public fun sendingEnabled(sendingEnabled: Boolean) {
    cdkBuilder.sendingEnabled(sendingEnabled)
  }

  /**
   * @param sendingEnabled If `true` , email sending is enabled for the configuration set.
   * If `false` , email sending is disabled for the configuration set.
   */
  public fun sendingEnabled(sendingEnabled: IResolvable) {
    cdkBuilder.sendingEnabled(sendingEnabled)
  }

  public fun build(): CfnConfigurationSet.SendingOptionsProperty = cdkBuilder.build()
}
