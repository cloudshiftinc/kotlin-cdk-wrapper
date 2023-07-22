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
 * KeySAMPTProperty keySAMPTProperty = KeySAMPTProperty.builder()
 * .keyId("keyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-keysampt.html)
 */
@CdkDslMarker
public class CfnFunctionKeySAMPTPropertyDsl {
  private val cdkBuilder: CfnFunction.KeySAMPTProperty.Builder =
      CfnFunction.KeySAMPTProperty.builder()

  /**
   * @param keyId the value to be set. 
   */
  public fun keyId(keyId: String) {
    cdkBuilder.keyId(keyId)
  }

  public fun build(): CfnFunction.KeySAMPTProperty = cdkBuilder.build()
}
