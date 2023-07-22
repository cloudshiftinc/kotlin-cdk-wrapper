@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Expiration
import software.amazon.awscdk.services.appsync.ApiKeyConfig

@CdkDslMarker
public class ApiKeyConfigDsl {
  private val cdkBuilder: ApiKeyConfig.Builder = ApiKeyConfig.builder()

  /**
   * @param description Description of API key.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param expires The time from creation time after which the API key expires.
   * It must be a minimum of 1 day and a maximum of 365 days from date of creation.
   * Rounded down to the nearest hour.
   */
  public fun expires(expires: Expiration) {
    cdkBuilder.expires(expires)
  }

  /**
   * @param name Unique name of the API Key.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): ApiKeyConfig = cdkBuilder.build()
}
