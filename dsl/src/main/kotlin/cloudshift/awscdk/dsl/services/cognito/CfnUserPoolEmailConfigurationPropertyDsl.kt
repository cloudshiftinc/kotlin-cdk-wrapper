@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPool

@CdkDslMarker
public class CfnUserPoolEmailConfigurationPropertyDsl {
  private val cdkBuilder: CfnUserPool.EmailConfigurationProperty.Builder =
      CfnUserPool.EmailConfigurationProperty.builder()

  public fun configurationSet(configurationSet: String) {
    cdkBuilder.configurationSet(configurationSet)
  }

  public fun emailSendingAccount(emailSendingAccount: String) {
    cdkBuilder.emailSendingAccount(emailSendingAccount)
  }

  public fun from(from: String) {
    cdkBuilder.from(from)
  }

  public fun replyToEmailAddress(replyToEmailAddress: String) {
    cdkBuilder.replyToEmailAddress(replyToEmailAddress)
  }

  public fun sourceArn(sourceArn: String) {
    cdkBuilder.sourceArn(sourceArn)
  }

  public fun build(): CfnUserPool.EmailConfigurationProperty = cdkBuilder.build()
}
