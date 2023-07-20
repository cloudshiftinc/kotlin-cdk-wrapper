@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.route53.IHostedZone
import software.amazon.awscdk.services.route53.RecordSetProps
import software.amazon.awscdk.services.route53.RecordTarget
import software.amazon.awscdk.services.route53.RecordType

@CdkDslMarker
public class RecordSetPropsDsl {
  private val cdkBuilder: RecordSetProps.Builder = RecordSetProps.builder()

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun deleteExisting(deleteExisting: Boolean) {
    cdkBuilder.deleteExisting(deleteExisting)
  }

  public fun recordName(recordName: String) {
    cdkBuilder.recordName(recordName)
  }

  public fun recordType(recordType: RecordType) {
    cdkBuilder.recordType(recordType)
  }

  public fun target(target: RecordTarget) {
    cdkBuilder.target(target)
  }

  public fun ttl(ttl: Duration) {
    cdkBuilder.ttl(ttl)
  }

  public fun zone(zone: IHostedZone) {
    cdkBuilder.zone(zone)
  }

  public fun build(): RecordSetProps = cdkBuilder.build()
}
