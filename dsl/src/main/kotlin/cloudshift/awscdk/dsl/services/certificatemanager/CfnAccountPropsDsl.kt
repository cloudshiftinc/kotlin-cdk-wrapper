@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.certificatemanager.CfnAccount
import software.amazon.awscdk.services.certificatemanager.CfnAccountProps

@CdkDslMarker
public class CfnAccountPropsDsl {
  private val cdkBuilder: CfnAccountProps.Builder = CfnAccountProps.builder()

  public fun expiryEventsConfiguration(expiryEventsConfiguration: IResolvable) {
    cdkBuilder.expiryEventsConfiguration(expiryEventsConfiguration)
  }

  public
      fun expiryEventsConfiguration(expiryEventsConfiguration: CfnAccount.ExpiryEventsConfigurationProperty) {
    cdkBuilder.expiryEventsConfiguration(expiryEventsConfiguration)
  }

  public fun build(): CfnAccountProps = cdkBuilder.build()
}
