@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnQuickConnect

@CdkDslMarker
public class CfnQuickConnectQuickConnectConfigPropertyDsl {
  private val cdkBuilder: CfnQuickConnect.QuickConnectConfigProperty.Builder =
      CfnQuickConnect.QuickConnectConfigProperty.builder()

  public fun phoneConfig(phoneConfig: IResolvable) {
    cdkBuilder.phoneConfig(phoneConfig)
  }

  public fun phoneConfig(phoneConfig: CfnQuickConnect.PhoneNumberQuickConnectConfigProperty) {
    cdkBuilder.phoneConfig(phoneConfig)
  }

  public fun queueConfig(queueConfig: IResolvable) {
    cdkBuilder.queueConfig(queueConfig)
  }

  public fun queueConfig(queueConfig: CfnQuickConnect.QueueQuickConnectConfigProperty) {
    cdkBuilder.queueConfig(queueConfig)
  }

  public fun quickConnectType(quickConnectType: String) {
    cdkBuilder.quickConnectType(quickConnectType)
  }

  public fun userConfig(userConfig: IResolvable) {
    cdkBuilder.userConfig(userConfig)
  }

  public fun userConfig(userConfig: CfnQuickConnect.UserQuickConnectConfigProperty) {
    cdkBuilder.userConfig(userConfig)
  }

  public fun build(): CfnQuickConnect.QuickConnectConfigProperty = cdkBuilder.build()
}
