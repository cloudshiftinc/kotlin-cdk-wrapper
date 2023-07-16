@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.route53.CaaRecord
import software.amazon.awscdk.services.route53.CaaRecordValue
import software.amazon.awscdk.services.route53.IHostedZone
import software.constructs.Construct

@CdkDslMarker
public class CaaRecordDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CaaRecord.Builder = CaaRecord.Builder.create(scope, id)

  private val _values: MutableList<CaaRecordValue> = mutableListOf()

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun deleteExisting(deleteExisting: Boolean) {
    cdkBuilder.deleteExisting(deleteExisting)
  }

  public fun recordName(recordName: String) {
    cdkBuilder.recordName(recordName)
  }

  public fun ttl(ttl: Duration) {
    cdkBuilder.ttl(ttl)
  }

  public fun values(values: CaaRecordValueDsl.() -> Unit) {
    _values.add(CaaRecordValueDsl().apply(values).build())
  }

  public fun values(values: Collection<CaaRecordValue>) {
    _values.addAll(values)
  }

  public fun zone(zone: IHostedZone) {
    cdkBuilder.zone(zone)
  }

  public fun build(): CaaRecord {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
