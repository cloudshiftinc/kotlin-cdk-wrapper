@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnApiKey

@CdkDslMarker
public class CfnApiKeyStageKeyPropertyDsl {
  private val cdkBuilder: CfnApiKey.StageKeyProperty.Builder = CfnApiKey.StageKeyProperty.builder()

  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  public fun build(): CfnApiKey.StageKeyProperty = cdkBuilder.build()
}
