@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.EmailSettings

@CdkDslMarker
public class EmailSettingsDsl {
  private val cdkBuilder: EmailSettings.Builder = EmailSettings.builder()

  /**
   * @param from The 'from' address on the emails received by the user.
   */
  public fun from(from: String) {
    cdkBuilder.from(from)
  }

  /**
   * @param replyTo The 'replyTo' address on the emails received by the user as defined by IETF
   * RFC-5322.
   * When set, most email clients recognize to change 'to' line to this address when a reply is
   * drafted.
   */
  public fun replyTo(replyTo: String) {
    cdkBuilder.replyTo(replyTo)
  }

  public fun build(): EmailSettings = cdkBuilder.build()
}
