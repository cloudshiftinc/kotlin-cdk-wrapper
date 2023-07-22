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

  /**
   * @param accountId The account ID that this configuration applies to.
   */
  public fun accountId(accountId: String) {
    cdkBuilder.accountId(accountId)
  }

  /**
   * @param launchTemplateId Identifies the Amazon EC2 launch template to use.
   */
  public fun launchTemplateId(launchTemplateId: String) {
    cdkBuilder.launchTemplateId(launchTemplateId)
  }

  /**
   * @param setDefaultVersion Set the specified Amazon EC2 launch template as the default launch
   * template for the specified account.
   */
  public fun setDefaultVersion(setDefaultVersion: Boolean) {
    cdkBuilder.setDefaultVersion(setDefaultVersion)
  }

  /**
   * @param setDefaultVersion Set the specified Amazon EC2 launch template as the default launch
   * template for the specified account.
   */
  public fun setDefaultVersion(setDefaultVersion: IResolvable) {
    cdkBuilder.setDefaultVersion(setDefaultVersion)
  }

  public fun build(): CfnDistributionConfiguration.LaunchTemplateConfigurationProperty =
      cdkBuilder.build()
}
