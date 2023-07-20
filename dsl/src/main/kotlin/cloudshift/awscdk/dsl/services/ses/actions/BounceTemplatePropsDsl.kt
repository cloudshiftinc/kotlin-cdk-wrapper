@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.actions.BounceTemplateProps

@CdkDslMarker
public class BounceTemplatePropsDsl {
  private val cdkBuilder: BounceTemplateProps.Builder = BounceTemplateProps.builder()

  public fun message(message: String) {
    cdkBuilder.message(message)
  }

  public fun smtpReplyCode(smtpReplyCode: String) {
    cdkBuilder.smtpReplyCode(smtpReplyCode)
  }

  public fun statusCode(statusCode: String) {
    cdkBuilder.statusCode(statusCode)
  }

  public fun build(): BounceTemplateProps = cdkBuilder.build()
}
