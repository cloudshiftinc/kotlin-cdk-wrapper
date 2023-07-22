@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ClarifyTextConfigProperty clarifyTextConfigProperty = ClarifyTextConfigProperty.builder()
 * .granularity("granularity")
 * .language("language")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifytextconfig.html)
 */
@CdkDslMarker
public class CfnEndpointConfigClarifyTextConfigPropertyDsl {
  private val cdkBuilder: CfnEndpointConfig.ClarifyTextConfigProperty.Builder =
      CfnEndpointConfig.ClarifyTextConfigProperty.builder()

  /**
   * @param granularity the value to be set. 
   */
  public fun granularity(granularity: String) {
    cdkBuilder.granularity(granularity)
  }

  /**
   * @param language the value to be set. 
   */
  public fun language(language: String) {
    cdkBuilder.language(language)
  }

  public fun build(): CfnEndpointConfig.ClarifyTextConfigProperty = cdkBuilder.build()
}
