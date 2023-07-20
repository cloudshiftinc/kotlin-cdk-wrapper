@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnPatchBaseline

@CdkDslMarker
public class CfnPatchBaselinePatchFilterGroupPropertyDsl {
  private val cdkBuilder: CfnPatchBaseline.PatchFilterGroupProperty.Builder =
      CfnPatchBaseline.PatchFilterGroupProperty.builder()

  private val _patchFilters: MutableList<Any> = mutableListOf()

  public fun patchFilters(vararg patchFilters: Any) {
    _patchFilters.addAll(listOf(*patchFilters))
  }

  public fun patchFilters(patchFilters: Collection<Any>) {
    _patchFilters.addAll(patchFilters)
  }

  public fun patchFilters(patchFilters: IResolvable) {
    cdkBuilder.patchFilters(patchFilters)
  }

  public fun build(): CfnPatchBaseline.PatchFilterGroupProperty {
    if(_patchFilters.isNotEmpty()) cdkBuilder.patchFilters(_patchFilters)
    return cdkBuilder.build()
  }
}
