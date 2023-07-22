@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

/**
 * Identifies an Amazon EC2 launch template to use for a specific account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * LaunchTemplateConfigurationProperty launchTemplateConfigurationProperty =
 * LaunchTemplateConfigurationProperty.builder()
 * .accountId("accountId")
 * .launchTemplateId("launchTemplateId")
 * .setDefaultVersion(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-launchtemplateconfiguration.html)
 */
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
