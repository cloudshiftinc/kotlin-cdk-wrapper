@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.AliasRecordTargetConfig

@CdkDslMarker
public class AliasRecordTargetConfigDsl {
  private val cdkBuilder: AliasRecordTargetConfig.Builder = AliasRecordTargetConfig.builder()

  public fun dnsName(dnsName: String) {
    cdkBuilder.dnsName(dnsName)
  }

  public fun hostedZoneId(hostedZoneId: String) {
    cdkBuilder.hostedZoneId(hostedZoneId)
  }

  public fun build(): AliasRecordTargetConfig = cdkBuilder.build()
}
