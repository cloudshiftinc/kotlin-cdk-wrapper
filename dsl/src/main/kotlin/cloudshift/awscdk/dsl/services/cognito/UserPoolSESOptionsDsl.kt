@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.UserPoolSESOptions

@CdkDslMarker
public class UserPoolSESOptionsDsl {
  private val cdkBuilder: UserPoolSESOptions.Builder = UserPoolSESOptions.builder()

  public fun configurationSetName(configurationSetName: String) {
    cdkBuilder.configurationSetName(configurationSetName)
  }

  public fun fromEmail(fromEmail: String) {
    cdkBuilder.fromEmail(fromEmail)
  }

  public fun fromName(fromName: String) {
    cdkBuilder.fromName(fromName)
  }

  public fun replyTo(replyTo: String) {
    cdkBuilder.replyTo(replyTo)
  }

  public fun sesRegion(sesRegion: String) {
    cdkBuilder.sesRegion(sesRegion)
  }

  public fun sesVerifiedDomain(sesVerifiedDomain: String) {
    cdkBuilder.sesVerifiedDomain(sesVerifiedDomain)
  }

  public fun build(): UserPoolSESOptions = cdkBuilder.build()
}
