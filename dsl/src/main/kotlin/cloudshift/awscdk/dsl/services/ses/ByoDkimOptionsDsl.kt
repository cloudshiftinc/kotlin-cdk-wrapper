@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.ses.ByoDkimOptions

@CdkDslMarker
public class ByoDkimOptionsDsl {
  private val cdkBuilder: ByoDkimOptions.Builder = ByoDkimOptions.builder()

  public fun privateKey(privateKey: SecretValue) {
    cdkBuilder.privateKey(privateKey)
  }

  public fun publicKey(publicKey: String) {
    cdkBuilder.publicKey(publicKey)
  }

  public fun selector(selector: String) {
    cdkBuilder.selector(selector)
  }

  public fun build(): ByoDkimOptions = cdkBuilder.build()
}
