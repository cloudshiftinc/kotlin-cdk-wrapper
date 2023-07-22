@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionProvisionedConcurrencyConfigPropertyDsl {
  private val cdkBuilder: CfnFunction.ProvisionedConcurrencyConfigProperty.Builder =
      CfnFunction.ProvisionedConcurrencyConfigProperty.builder()

  /**
   * @param provisionedConcurrentExecutions the value to be set. 
   */
  public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: String) {
    cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
  }

  public fun build(): CfnFunction.ProvisionedConcurrencyConfigProperty = cdkBuilder.build()
}
