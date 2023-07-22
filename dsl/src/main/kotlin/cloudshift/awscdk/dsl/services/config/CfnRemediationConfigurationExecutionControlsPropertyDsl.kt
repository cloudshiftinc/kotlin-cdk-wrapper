@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnRemediationConfiguration

@CdkDslMarker
public class CfnRemediationConfigurationExecutionControlsPropertyDsl {
  private val cdkBuilder: CfnRemediationConfiguration.ExecutionControlsProperty.Builder =
      CfnRemediationConfiguration.ExecutionControlsProperty.builder()

  /**
   * @param ssmControls A SsmControls object.
   */
  public fun ssmControls(ssmControls: IResolvable) {
    cdkBuilder.ssmControls(ssmControls)
  }

  /**
   * @param ssmControls A SsmControls object.
   */
  public fun ssmControls(ssmControls: CfnRemediationConfiguration.SsmControlsProperty) {
    cdkBuilder.ssmControls(ssmControls)
  }

  public fun build(): CfnRemediationConfiguration.ExecutionControlsProperty = cdkBuilder.build()
}
