@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.BaseUrlOptions

@CdkDslMarker
public class BaseUrlOptionsDsl {
  private val cdkBuilder: BaseUrlOptions.Builder = BaseUrlOptions.builder()

  /**
   * @param fips Whether to return the FIPS-compliant endpoint.
   */
  public fun fips(fips: Boolean) {
    cdkBuilder.fips(fips)
  }

  public fun build(): BaseUrlOptions = cdkBuilder.build()
}
