@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * EmptySAMPTProperty emptySAMPTProperty = EmptySAMPTProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-emptysampt.html)
 */
@CdkDslMarker
public class CfnFunctionEmptySAMPTPropertyDsl {
  private val cdkBuilder: CfnFunction.EmptySAMPTProperty.Builder =
      CfnFunction.EmptySAMPTProperty.builder()

  public fun build(): CfnFunction.EmptySAMPTProperty = cdkBuilder.build()
}
