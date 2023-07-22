@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnApiKey

/**
 * `StageKey` is a property of the
 * [AWS::ApiGateway::ApiKey](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html)
 * resource that specifies the stage to associate with the API key. This association allows only
 * clients with the key to make requests to methods in that stage.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * StageKeyProperty stageKeyProperty = StageKeyProperty.builder()
 * .restApiId("restApiId")
 * .stageName("stageName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html)
 */
@CdkDslMarker
public class CfnApiKeyStageKeyPropertyDsl {
  private val cdkBuilder: CfnApiKey.StageKeyProperty.Builder = CfnApiKey.StageKeyProperty.builder()

  /**
   * @param restApiId The string identifier of the associated RestApi.
   */
  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  /**
   * @param stageName The stage name associated with the stage key.
   */
  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  public fun build(): CfnApiKey.StageKeyProperty = cdkBuilder.build()
}
