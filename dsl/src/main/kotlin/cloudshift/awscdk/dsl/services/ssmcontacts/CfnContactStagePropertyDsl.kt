@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnContact

@CdkDslMarker
public class CfnContactStagePropertyDsl {
  private val cdkBuilder: CfnContact.StageProperty.Builder = CfnContact.StageProperty.builder()

  private val _rotationIds: MutableList<String> = mutableListOf()

  private val _targets: MutableList<Any> = mutableListOf()

  public fun durationInMinutes(durationInMinutes: Number) {
    cdkBuilder.durationInMinutes(durationInMinutes)
  }

  public fun rotationIds(vararg rotationIds: String) {
    _rotationIds.addAll(listOf(*rotationIds))
  }

  public fun rotationIds(rotationIds: Collection<String>) {
    _rotationIds.addAll(rotationIds)
  }

  public fun targets(vararg targets: Any) {
    _targets.addAll(listOf(*targets))
  }

  public fun targets(targets: Collection<Any>) {
    _targets.addAll(targets)
  }

  public fun targets(targets: IResolvable) {
    cdkBuilder.targets(targets)
  }

  public fun build(): CfnContact.StageProperty {
    if(_rotationIds.isNotEmpty()) cdkBuilder.rotationIds(_rotationIds)
    if(_targets.isNotEmpty()) cdkBuilder.targets(_targets)
    return cdkBuilder.build()
  }
}
