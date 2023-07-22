@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.certificatemanager.CfnAccount
import software.amazon.awscdk.services.certificatemanager.CfnAccountProps

@CdkDslMarker
public class CfnAccountPropsDsl {
  private val cdkBuilder: CfnAccountProps.Builder = CfnAccountProps.builder()

  /**
   * @param expiryEventsConfiguration Object containing expiration events options associated with an
   * AWS account . 
   * For more information, see
   * [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
   * in the API reference.
   */
  public fun expiryEventsConfiguration(expiryEventsConfiguration: IResolvable) {
    cdkBuilder.expiryEventsConfiguration(expiryEventsConfiguration)
  }

  /**
   * @param expiryEventsConfiguration Object containing expiration events options associated with an
   * AWS account . 
   * For more information, see
   * [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
   * in the API reference.
   */
  public
      fun expiryEventsConfiguration(expiryEventsConfiguration: CfnAccount.ExpiryEventsConfigurationProperty) {
    cdkBuilder.expiryEventsConfiguration(expiryEventsConfiguration)
  }

  public fun build(): CfnAccountProps = cdkBuilder.build()
}
