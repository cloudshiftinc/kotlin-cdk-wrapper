@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.BaseUrlOptions

/**
 * Options to customize the behaviour of `baseUrl()`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * BaseUrlOptions baseUrlOptions = BaseUrlOptions.builder()
 * .fips(false)
 * .build();
 * ```
 */
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
