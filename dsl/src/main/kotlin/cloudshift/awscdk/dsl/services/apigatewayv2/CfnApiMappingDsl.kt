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

  /**
   * The identifier of the API.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-apiid)
   * @param apiId The identifier of the API. 
   */
  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  /**
   * The API mapping key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-apimappingkey)
   * @param apiMappingKey The API mapping key. 
   */
  public fun apiMappingKey(apiMappingKey: String) {
    cdkBuilder.apiMappingKey(apiMappingKey)
  }

  /**
   * The domain name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-domainname)
   * @param domainName The domain name. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * The API stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-stage)
   * @param stage The API stage. 
   */
  public fun stage(stage: String) {
    cdkBuilder.stage(stage)
  }

  public fun build(): CfnApiMapping = cdkBuilder.build()
}
