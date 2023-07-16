@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.route53.CnameRecordProps
import software.amazon.awscdk.services.route53.IHostedZone

@CdkDslMarker
public class CnameRecordPropsDsl {
  private val cdkBuilder: CnameRecordProps.Builder = CnameRecordProps.builder()

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun deleteExisting(deleteExisting: Boolean) {
    cdkBuilder.deleteExisting(deleteExisting)
  }

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun recordName(recordName: String) {
    cdkBuilder.recordName(recordName)
  }

  public fun ttl(ttl: Duration) {
    cdkBuilder.ttl(ttl)
  }

  public fun zone(zone: IHostedZone) {
    cdkBuilder.zone(zone)
  }

  public fun build(): CnameRecordProps = cdkBuilder.build()
}
