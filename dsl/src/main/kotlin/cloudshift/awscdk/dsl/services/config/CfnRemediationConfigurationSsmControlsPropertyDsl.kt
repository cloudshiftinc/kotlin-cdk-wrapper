@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.config.CfnRemediationConfiguration

@CdkDslMarker
public class CfnRemediationConfigurationSsmControlsPropertyDsl {
  private val cdkBuilder: CfnRemediationConfiguration.SsmControlsProperty.Builder =
      CfnRemediationConfiguration.SsmControlsProperty.builder()

  /**
   * @param concurrentExecutionRatePercentage The maximum percentage of remediation actions allowed
   * to run in parallel on the non-compliant resources for that specific rule.
   * You can specify a percentage, such as 10%. The default value is 10.
   */
  public fun concurrentExecutionRatePercentage(concurrentExecutionRatePercentage: Number) {
    cdkBuilder.concurrentExecutionRatePercentage(concurrentExecutionRatePercentage)
  }

  /**
   * @param errorPercentage The percentage of errors that are allowed before SSM stops running
   * automations on non-compliant resources for that specific rule.
   * You can specify a percentage of errors, for example 10%. If you do not specifiy a percentage,
   * the default is 50%. For example, if you set the ErrorPercentage to 40% for 10 non-compliant
   * resources, then SSM stops running the automations when the fifth error is received.
   */
  public fun errorPercentage(errorPercentage: Number) {
    cdkBuilder.errorPercentage(errorPercentage)
  }

  public fun build(): CfnRemediationConfiguration.SsmControlsProperty = cdkBuilder.build()
}
