@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnDocumentationPart
import software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps

@CdkDslMarker
public class CfnDocumentationPartPropsDsl {
  private val cdkBuilder: CfnDocumentationPartProps.Builder = CfnDocumentationPartProps.builder()

  public fun location(location: IResolvable) {
    cdkBuilder.location(location)
  }

  public fun location(location: CfnDocumentationPart.LocationProperty) {
    cdkBuilder.location(location)
  }

  public fun properties(properties: String) {
    cdkBuilder.properties(properties)
  }

  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  public fun build(): CfnDocumentationPartProps = cdkBuilder.build()
}
