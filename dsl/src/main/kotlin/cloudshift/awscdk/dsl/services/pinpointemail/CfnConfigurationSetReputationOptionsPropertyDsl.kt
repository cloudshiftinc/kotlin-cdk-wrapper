@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet

@CdkDslMarker
public class CfnConfigurationSetReputationOptionsPropertyDsl {
  private val cdkBuilder: CfnConfigurationSet.ReputationOptionsProperty.Builder =
      CfnConfigurationSet.ReputationOptionsProperty.builder()

  /**
   * @param reputationMetricsEnabled If `true` , tracking of reputation metrics is enabled for the
   * configuration set.
   * If `false` , tracking of reputation metrics is disabled for the configuration set.
   */
  public fun reputationMetricsEnabled(reputationMetricsEnabled: Boolean) {
    cdkBuilder.reputationMetricsEnabled(reputationMetricsEnabled)
  }

  /**
   * @param reputationMetricsEnabled If `true` , tracking of reputation metrics is enabled for the
   * configuration set.
   * If `false` , tracking of reputation metrics is disabled for the configuration set.
   */
  public fun reputationMetricsEnabled(reputationMetricsEnabled: IResolvable) {
    cdkBuilder.reputationMetricsEnabled(reputationMetricsEnabled)
  }

  public fun build(): CfnConfigurationSet.ReputationOptionsProperty = cdkBuilder.build()
}
