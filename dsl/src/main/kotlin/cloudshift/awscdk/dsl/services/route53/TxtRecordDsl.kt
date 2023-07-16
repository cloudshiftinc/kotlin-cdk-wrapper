@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.route53.IHostedZone
import software.amazon.awscdk.services.route53.TxtRecord
import software.constructs.Construct

@CdkDslMarker
public class TxtRecordDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: TxtRecord.Builder = TxtRecord.Builder.create(scope, id)

  private val _values: MutableList<String> = mutableListOf()

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

  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun zone(zone: IHostedZone) {
    cdkBuilder.zone(zone)
  }

  public fun build(): TxtRecord {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
