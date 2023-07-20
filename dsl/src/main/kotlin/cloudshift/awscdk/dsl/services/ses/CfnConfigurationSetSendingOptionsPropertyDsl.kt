@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnConfigurationSet

@CdkDslMarker
public class CfnConfigurationSetSendingOptionsPropertyDsl {
  private val cdkBuilder: CfnConfigurationSet.SendingOptionsProperty.Builder =
      CfnConfigurationSet.SendingOptionsProperty.builder()

  public fun sendingEnabled(sendingEnabled: Boolean) {
    cdkBuilder.sendingEnabled(sendingEnabled)
  }

  public fun sendingEnabled(sendingEnabled: IResolvable) {
    cdkBuilder.sendingEnabled(sendingEnabled)
  }

  public fun build(): CfnConfigurationSet.SendingOptionsProperty = cdkBuilder.build()
}
