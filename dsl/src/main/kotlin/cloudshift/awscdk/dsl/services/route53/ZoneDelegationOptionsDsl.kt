@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.route53.ZoneDelegationOptions

@CdkDslMarker
public class ZoneDelegationOptionsDsl {
  private val cdkBuilder: ZoneDelegationOptions.Builder = ZoneDelegationOptions.builder()

  /**
   * @param comment A comment to add on the DNS record created to incorporate the delegation.
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * @param ttl The TTL (Time To Live) of the DNS delegation record in DNS caches.
   */
  public fun ttl(ttl: Duration) {
    cdkBuilder.ttl(ttl)
  }

  public fun build(): ZoneDelegationOptions = cdkBuilder.build()
}
