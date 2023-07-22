@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.lambda.CfnAlias

@CdkDslMarker
public class CfnAliasProvisionedConcurrencyConfigurationPropertyDsl {
  private val cdkBuilder: CfnAlias.ProvisionedConcurrencyConfigurationProperty.Builder =
      CfnAlias.ProvisionedConcurrencyConfigurationProperty.builder()

  /**
   * @param provisionedConcurrentExecutions The amount of provisioned concurrency to allocate for
   * the alias. 
   */
  public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number) {
    cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
  }

  public fun build(): CfnAlias.ProvisionedConcurrencyConfigurationProperty = cdkBuilder.build()
}
