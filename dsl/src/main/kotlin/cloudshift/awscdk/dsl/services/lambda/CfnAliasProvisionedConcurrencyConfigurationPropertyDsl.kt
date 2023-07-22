@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.lambda.CfnAlias

/**
 * A provisioned concurrency configuration for a function's alias.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * ProvisionedConcurrencyConfigurationProperty provisionedConcurrencyConfigurationProperty =
 * ProvisionedConcurrencyConfigurationProperty.builder()
 * .provisionedConcurrentExecutions(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-provisionedconcurrencyconfiguration.html)
 */
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
