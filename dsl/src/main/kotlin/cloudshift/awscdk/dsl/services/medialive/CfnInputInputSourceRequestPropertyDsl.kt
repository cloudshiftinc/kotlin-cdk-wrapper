@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnInput

@CdkDslMarker
public class CfnInputInputSourceRequestPropertyDsl {
  private val cdkBuilder: CfnInput.InputSourceRequestProperty.Builder =
      CfnInput.InputSourceRequestProperty.builder()

  public fun passwordParam(passwordParam: String) {
    cdkBuilder.passwordParam(passwordParam)
  }

  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnInput.InputSourceRequestProperty = cdkBuilder.build()
}
