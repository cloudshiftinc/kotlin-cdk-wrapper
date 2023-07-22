@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@CdkDslMarker
public class CfnEventSourceMappingDestinationConfigPropertyDsl {
  private val cdkBuilder: CfnEventSourceMapping.DestinationConfigProperty.Builder =
      CfnEventSourceMapping.DestinationConfigProperty.builder()

  /**
   * @param onFailure The destination configuration for failed invocations.
   */
  public fun onFailure(onFailure: IResolvable) {
    cdkBuilder.onFailure(onFailure)
  }

  /**
   * @param onFailure The destination configuration for failed invocations.
   */
  public fun onFailure(onFailure: CfnEventSourceMapping.OnFailureProperty) {
    cdkBuilder.onFailure(onFailure)
  }

  public fun build(): CfnEventSourceMapping.DestinationConfigProperty = cdkBuilder.build()
}
