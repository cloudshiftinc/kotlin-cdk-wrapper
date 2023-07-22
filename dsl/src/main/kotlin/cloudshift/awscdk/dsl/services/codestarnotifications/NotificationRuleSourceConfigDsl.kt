@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestarnotifications

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig

@CdkDslMarker
public class NotificationRuleSourceConfigDsl {
  private val cdkBuilder: NotificationRuleSourceConfig.Builder =
      NotificationRuleSourceConfig.builder()

  /**
   * @param sourceArn The Amazon Resource Name (ARN) of the notification source. 
   */
  public fun sourceArn(sourceArn: String) {
    cdkBuilder.sourceArn(sourceArn)
  }

  public fun build(): NotificationRuleSourceConfig = cdkBuilder.build()
}
