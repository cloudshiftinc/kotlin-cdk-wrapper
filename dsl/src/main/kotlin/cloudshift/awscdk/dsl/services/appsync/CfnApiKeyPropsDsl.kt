@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnApiKeyProps

@CdkDslMarker
public class CfnApiKeyPropsDsl {
  private val cdkBuilder: CfnApiKeyProps.Builder = CfnApiKeyProps.builder()

  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  public fun apiKeyId(apiKeyId: String) {
    cdkBuilder.apiKeyId(apiKeyId)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun expires(expires: Number) {
    cdkBuilder.expires(expires)
  }

  public fun build(): CfnApiKeyProps = cdkBuilder.build()
}
