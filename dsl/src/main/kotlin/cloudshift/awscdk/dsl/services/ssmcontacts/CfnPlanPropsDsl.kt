@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnPlanProps

@CdkDslMarker
public class CfnPlanPropsDsl {
  private val cdkBuilder: CfnPlanProps.Builder = CfnPlanProps.builder()

  private val _rotationIds: MutableList<String> = mutableListOf()

  private val _stages: MutableList<Any> = mutableListOf()

  public fun contactId(contactId: String) {
    cdkBuilder.contactId(contactId)
  }

  public fun rotationIds(vararg rotationIds: String) {
    _rotationIds.addAll(listOf(*rotationIds))
  }

  public fun rotationIds(rotationIds: Collection<String>) {
    _rotationIds.addAll(rotationIds)
  }

  public fun stages(vararg stages: Any) {
    _stages.addAll(listOf(*stages))
  }

  public fun stages(stages: Collection<Any>) {
    _stages.addAll(stages)
  }

  public fun stages(stages: IResolvable) {
    cdkBuilder.stages(stages)
  }

  public fun build(): CfnPlanProps {
    if(_rotationIds.isNotEmpty()) cdkBuilder.rotationIds(_rotationIds)
    if(_stages.isNotEmpty()) cdkBuilder.stages(_stages)
    return cdkBuilder.build()
  }
}
