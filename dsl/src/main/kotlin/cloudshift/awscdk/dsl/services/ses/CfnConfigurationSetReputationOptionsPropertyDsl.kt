@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnConfigurationSet

@CdkDslMarker
public class CfnConfigurationSetReputationOptionsPropertyDsl {
  private val cdkBuilder: CfnConfigurationSet.ReputationOptionsProperty.Builder =
      CfnConfigurationSet.ReputationOptionsProperty.builder()

  public fun reputationMetricsEnabled(reputationMetricsEnabled: Boolean) {
    cdkBuilder.reputationMetricsEnabled(reputationMetricsEnabled)
  }

  public fun reputationMetricsEnabled(reputationMetricsEnabled: IResolvable) {
    cdkBuilder.reputationMetricsEnabled(reputationMetricsEnabled)
  }

  public fun build(): CfnConfigurationSet.ReputationOptionsProperty = cdkBuilder.build()
}
