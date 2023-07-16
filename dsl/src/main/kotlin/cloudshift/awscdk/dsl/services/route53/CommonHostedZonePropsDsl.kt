@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.route53.CommonHostedZoneProps

@CdkDslMarker
public class CommonHostedZonePropsDsl {
  private val cdkBuilder: CommonHostedZoneProps.Builder = CommonHostedZoneProps.builder()

  public fun addTrailingDot(addTrailingDot: Boolean) {
    cdkBuilder.addTrailingDot(addTrailingDot)
  }

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
    cdkBuilder.queryLogsLogGroupArn(queryLogsLogGroupArn)
  }

  public fun zoneName(zoneName: String) {
    cdkBuilder.zoneName(zoneName)
  }

  public fun build(): CommonHostedZoneProps = cdkBuilder.build()
}
