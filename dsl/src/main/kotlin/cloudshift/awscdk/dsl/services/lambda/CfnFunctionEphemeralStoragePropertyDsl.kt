@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.lambda.CfnFunction

/**
 * The size of the function's `/tmp` directory in MB.
 *
 * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * EphemeralStorageProperty ephemeralStorageProperty = EphemeralStorageProperty.builder()
 * .size(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-ephemeralstorage.html)
 */
@CdkDslMarker
public class CfnFunctionEphemeralStoragePropertyDsl {
  private val cdkBuilder: CfnFunction.EphemeralStorageProperty.Builder =
      CfnFunction.EphemeralStorageProperty.builder()

  /**
   * @param size The size of the function's `/tmp` directory. 
   */
  public fun size(size: Number) {
    cdkBuilder.size(size)
  }

  public fun build(): CfnFunction.EphemeralStorageProperty = cdkBuilder.build()
}
