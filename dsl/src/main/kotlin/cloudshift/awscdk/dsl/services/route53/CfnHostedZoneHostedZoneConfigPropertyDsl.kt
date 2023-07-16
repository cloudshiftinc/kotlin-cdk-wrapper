@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnHostedZone

@CdkDslMarker
public class CfnHostedZoneHostedZoneConfigPropertyDsl {
  private val cdkBuilder: CfnHostedZone.HostedZoneConfigProperty.Builder =
      CfnHostedZone.HostedZoneConfigProperty.builder()

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun build(): CfnHostedZone.HostedZoneConfigProperty = cdkBuilder.build()
}
