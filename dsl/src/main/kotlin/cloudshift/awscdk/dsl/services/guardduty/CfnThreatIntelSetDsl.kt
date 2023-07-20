@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnThreatIntelSet
import software.constructs.Construct

@CdkDslMarker
public class CfnThreatIntelSetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnThreatIntelSet.Builder = CfnThreatIntelSet.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun activate(activate: Boolean) {
    cdkBuilder.activate(activate)
  }

  public fun activate(activate: IResolvable) {
    cdkBuilder.activate(activate)
  }

  public fun detectorId(detectorId: String) {
    cdkBuilder.detectorId(detectorId)
  }

  public fun format(format: String) {
    cdkBuilder.format(format)
  }

  public fun location(location: String) {
    cdkBuilder.location(location)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnThreatIntelSet {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
