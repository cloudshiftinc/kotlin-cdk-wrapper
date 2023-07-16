@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.iam.IPrincipal
import software.amazon.awscdk.services.route53.PublicHostedZoneProps

@CdkDslMarker
public class PublicHostedZonePropsDsl {
  private val cdkBuilder: PublicHostedZoneProps.Builder = PublicHostedZoneProps.builder()

  public fun addTrailingDot(addTrailingDot: Boolean) {
    cdkBuilder.addTrailingDot(addTrailingDot)
  }

  public fun caaAmazon(caaAmazon: Boolean) {
    cdkBuilder.caaAmazon(caaAmazon)
  }

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun crossAccountZoneDelegationPrincipal(crossAccountZoneDelegationPrincipal: IPrincipal) {
    cdkBuilder.crossAccountZoneDelegationPrincipal(crossAccountZoneDelegationPrincipal)
  }

  public fun crossAccountZoneDelegationRoleName(crossAccountZoneDelegationRoleName: String) {
    cdkBuilder.crossAccountZoneDelegationRoleName(crossAccountZoneDelegationRoleName)
  }

  public fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
    cdkBuilder.queryLogsLogGroupArn(queryLogsLogGroupArn)
  }

  public fun zoneName(zoneName: String) {
    cdkBuilder.zoneName(zoneName)
  }

  public fun build(): PublicHostedZoneProps = cdkBuilder.build()
}
