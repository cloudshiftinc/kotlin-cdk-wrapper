@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53.CfnRecordSetGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnRecordSetGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRecordSetGroup.Builder = CfnRecordSetGroup.Builder.create(scope, id)

  private val _recordSets: MutableList<Any> = mutableListOf()

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun hostedZoneId(hostedZoneId: String) {
    cdkBuilder.hostedZoneId(hostedZoneId)
  }

  public fun hostedZoneName(hostedZoneName: String) {
    cdkBuilder.hostedZoneName(hostedZoneName)
  }

  public fun recordSets(vararg recordSets: Any) {
    _recordSets.addAll(listOf(*recordSets))
  }

  public fun recordSets(recordSets: Collection<Any>) {
    _recordSets.addAll(recordSets)
  }

  public fun recordSets(recordSets: IResolvable) {
    cdkBuilder.recordSets(recordSets)
  }

  public fun build(): CfnRecordSetGroup {
    if(_recordSets.isNotEmpty()) cdkBuilder.recordSets(_recordSets)
    return cdkBuilder.build()
  }
}
