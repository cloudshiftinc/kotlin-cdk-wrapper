@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.apigateway.ContentHandling
import software.amazon.awscdk.services.apigateway.IntegrationResponse

@CdkDslMarker
public class IntegrationResponseDsl {
  private val cdkBuilder: IntegrationResponse.Builder = IntegrationResponse.builder()

  public fun contentHandling(contentHandling: ContentHandling) {
    cdkBuilder.contentHandling(contentHandling)
  }

  public fun responseParameters(responseParameters: Map<String, String>) {
    cdkBuilder.responseParameters(responseParameters)
  }

  public fun responseTemplates(responseTemplates: Map<String, String>) {
    cdkBuilder.responseTemplates(responseTemplates)
  }

  public fun selectionPattern(selectionPattern: String) {
    cdkBuilder.selectionPattern(selectionPattern)
  }

  public fun statusCode(statusCode: String) {
    cdkBuilder.statusCode(statusCode)
  }

  public fun build(): IntegrationResponse = cdkBuilder.build()
}
