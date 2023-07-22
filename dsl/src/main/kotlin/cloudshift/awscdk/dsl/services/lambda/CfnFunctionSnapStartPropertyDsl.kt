@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnFunction

/**
 * The function's [AWS Lambda
 * SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * SnapStartProperty snapStartProperty = SnapStartProperty.builder()
 * .applyOn("applyOn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-snapstart.html)
 */
@CdkDslMarker
public class CfnFunctionSnapStartPropertyDsl {
  private val cdkBuilder: CfnFunction.SnapStartProperty.Builder =
      CfnFunction.SnapStartProperty.builder()

  /**
   * @param applyOn Set `ApplyOn` to `PublishedVersions` to create a snapshot of the initialized
   * execution environment when you publish a function version. 
   */
  public fun applyOn(applyOn: String) {
    cdkBuilder.applyOn(applyOn)
  }

  public fun build(): CfnFunction.SnapStartProperty = cdkBuilder.build()
}
