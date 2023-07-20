@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Expiration
import software.amazon.awscdk.services.appsync.ApiKeyConfig

@CdkDslMarker
public class ApiKeyConfigDsl {
  private val cdkBuilder: ApiKeyConfig.Builder = ApiKeyConfig.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun expires(expires: Expiration) {
    cdkBuilder.expires(expires)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): ApiKeyConfig = cdkBuilder.build()
}
