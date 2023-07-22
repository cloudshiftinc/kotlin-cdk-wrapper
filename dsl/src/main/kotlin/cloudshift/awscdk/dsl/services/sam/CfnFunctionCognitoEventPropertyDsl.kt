@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * CognitoEventProperty cognitoEventProperty = CognitoEventProperty.builder()
 * .trigger("trigger")
 * .userPool("userPool")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cognitoevent.html)
 */
@CdkDslMarker
public class CfnFunctionCognitoEventPropertyDsl {
  private val cdkBuilder: CfnFunction.CognitoEventProperty.Builder =
      CfnFunction.CognitoEventProperty.builder()

  /**
   * @param trigger the value to be set. 
   */
  public fun trigger(trigger: String) {
    cdkBuilder.trigger(trigger)
  }

  /**
   * @param userPool the value to be set. 
   */
  public fun userPool(userPool: String) {
    cdkBuilder.userPool(userPool)
  }

  public fun build(): CfnFunction.CognitoEventProperty = cdkBuilder.build()
}
