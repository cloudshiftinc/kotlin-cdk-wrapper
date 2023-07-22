@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.certificatemanager.CfnAccount

@CdkDslMarker
public class CfnAccountExpiryEventsConfigurationPropertyDsl {
  private val cdkBuilder: CfnAccount.ExpiryEventsConfigurationProperty.Builder =
      CfnAccount.ExpiryEventsConfigurationProperty.builder()

  /**
   * @param daysBeforeExpiry This option specifies the number of days prior to certificate
   * expiration when ACM starts generating `EventBridge` events.
   * ACM sends one event per day per certificate until the certificate expires. By default, accounts
   * receive events starting 45 days before certificate expiration.
   */
  public fun daysBeforeExpiry(daysBeforeExpiry: Number) {
    cdkBuilder.daysBeforeExpiry(daysBeforeExpiry)
  }

  public fun build(): CfnAccount.ExpiryEventsConfigurationProperty = cdkBuilder.build()
}
