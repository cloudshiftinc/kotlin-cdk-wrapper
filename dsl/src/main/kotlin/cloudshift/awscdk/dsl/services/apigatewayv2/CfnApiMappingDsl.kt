@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.CfnApiMapping
import software.constructs.Construct

@CdkDslMarker
public class CfnApiMappingDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApiMapping.Builder = CfnApiMapping.Builder.create(scope, id)

  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  public fun apiMappingKey(apiMappingKey: String) {
    cdkBuilder.apiMappingKey(apiMappingKey)
  }

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun stage(stage: String) {
    cdkBuilder.stage(stage)
  }

  public fun build(): CfnApiMapping = cdkBuilder.build()
}
