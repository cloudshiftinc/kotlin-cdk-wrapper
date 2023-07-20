@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

@CdkDslMarker
public class CfnDistributionConfigurationLaunchTemplateConfigurationPropertyDsl {
  private val cdkBuilder: CfnDistributionConfiguration.LaunchTemplateConfigurationProperty.Builder =
      CfnDistributionConfiguration.LaunchTemplateConfigurationProperty.builder()

  public fun accountId(accountId: String) {
    cdkBuilder.accountId(accountId)
  }

  public fun launchTemplateId(launchTemplateId: String) {
    cdkBuilder.launchTemplateId(launchTemplateId)
  }

  public fun setDefaultVersion(setDefaultVersion: Boolean) {
    cdkBuilder.setDefaultVersion(setDefaultVersion)
  }

  public fun setDefaultVersion(setDefaultVersion: IResolvable) {
    cdkBuilder.setDefaultVersion(setDefaultVersion)
  }

  public fun build(): CfnDistributionConfiguration.LaunchTemplateConfigurationProperty =
      cdkBuilder.build()
}
