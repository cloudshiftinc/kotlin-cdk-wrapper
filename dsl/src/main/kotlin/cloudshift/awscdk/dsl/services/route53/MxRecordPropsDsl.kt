@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.route53.IHostedZone
import software.amazon.awscdk.services.route53.MxRecordProps
import software.amazon.awscdk.services.route53.MxRecordValue

@CdkDslMarker
public class MxRecordPropsDsl {
  private val cdkBuilder: MxRecordProps.Builder = MxRecordProps.builder()

  private val _values: MutableList<MxRecordValue> = mutableListOf()

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

  public fun values(values: MxRecordValueDsl.() -> Unit) {
    _values.add(MxRecordValueDsl().apply(values).build())
  }

  public fun values(values: Collection<MxRecordValue>) {
    _values.addAll(values)
  }

  public fun zone(zone: IHostedZone) {
    cdkBuilder.zone(zone)
  }

  public fun build(): MxRecordProps {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
