@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.WorkmailActionConfig

@CdkDslMarker
public class WorkmailActionConfigDsl {
  private val cdkBuilder: WorkmailActionConfig.Builder = WorkmailActionConfig.builder()

  public fun organizationArn(organizationArn: String) {
    cdkBuilder.organizationArn(organizationArn)
  }

  public fun topicArn(topicArn: String) {
    cdkBuilder.topicArn(topicArn)
  }

  public fun build(): WorkmailActionConfig = cdkBuilder.build()
}
