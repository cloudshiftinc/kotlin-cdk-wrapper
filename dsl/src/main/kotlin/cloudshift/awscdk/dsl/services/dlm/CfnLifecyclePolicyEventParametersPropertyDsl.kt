@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@CdkDslMarker
public class CfnLifecyclePolicyEventParametersPropertyDsl {
  private val cdkBuilder: CfnLifecyclePolicy.EventParametersProperty.Builder =
      CfnLifecyclePolicy.EventParametersProperty.builder()

  private val _snapshotOwner: MutableList<String> = mutableListOf()

  public fun descriptionRegex(descriptionRegex: String) {
    cdkBuilder.descriptionRegex(descriptionRegex)
  }

  public fun eventType(eventType: String) {
    cdkBuilder.eventType(eventType)
  }

  public fun snapshotOwner(vararg snapshotOwner: String) {
    _snapshotOwner.addAll(listOf(*snapshotOwner))
  }

  public fun snapshotOwner(snapshotOwner: Collection<String>) {
    _snapshotOwner.addAll(snapshotOwner)
  }

  public fun build(): CfnLifecyclePolicy.EventParametersProperty {
    if(_snapshotOwner.isNotEmpty()) cdkBuilder.snapshotOwner(_snapshotOwner)
    return cdkBuilder.build()
  }
}
