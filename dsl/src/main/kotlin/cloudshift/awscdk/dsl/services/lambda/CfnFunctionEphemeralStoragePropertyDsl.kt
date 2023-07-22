@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.lambda.CfnFunction

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
