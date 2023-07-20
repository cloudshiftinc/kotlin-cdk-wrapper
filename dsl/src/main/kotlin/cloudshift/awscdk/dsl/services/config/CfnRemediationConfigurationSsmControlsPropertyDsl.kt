@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.config.CfnRemediationConfiguration

@CdkDslMarker
public class CfnRemediationConfigurationSsmControlsPropertyDsl {
  private val cdkBuilder: CfnRemediationConfiguration.SsmControlsProperty.Builder =
      CfnRemediationConfiguration.SsmControlsProperty.builder()

  public fun concurrentExecutionRatePercentage(concurrentExecutionRatePercentage: Number) {
    cdkBuilder.concurrentExecutionRatePercentage(concurrentExecutionRatePercentage)
  }

  public fun errorPercentage(errorPercentage: Number) {
    cdkBuilder.errorPercentage(errorPercentage)
  }

  public fun build(): CfnRemediationConfiguration.SsmControlsProperty = cdkBuilder.build()
}
