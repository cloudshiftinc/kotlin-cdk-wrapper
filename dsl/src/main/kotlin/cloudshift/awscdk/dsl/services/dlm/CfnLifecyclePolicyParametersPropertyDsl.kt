@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@CdkDslMarker
public class CfnLifecyclePolicyParametersPropertyDsl {
  private val cdkBuilder: CfnLifecyclePolicy.ParametersProperty.Builder =
      CfnLifecyclePolicy.ParametersProperty.builder()

  private val _excludeDataVolumeTags: MutableList<Any> = mutableListOf()

  public fun excludeBootVolume(excludeBootVolume: Boolean) {
    cdkBuilder.excludeBootVolume(excludeBootVolume)
  }

  public fun excludeBootVolume(excludeBootVolume: IResolvable) {
    cdkBuilder.excludeBootVolume(excludeBootVolume)
  }

  public fun excludeDataVolumeTags(vararg excludeDataVolumeTags: Any) {
    _excludeDataVolumeTags.addAll(listOf(*excludeDataVolumeTags))
  }

  public fun excludeDataVolumeTags(excludeDataVolumeTags: Collection<Any>) {
    _excludeDataVolumeTags.addAll(excludeDataVolumeTags)
  }

  public fun excludeDataVolumeTags(excludeDataVolumeTags: IResolvable) {
    cdkBuilder.excludeDataVolumeTags(excludeDataVolumeTags)
  }

  public fun noReboot(noReboot: Boolean) {
    cdkBuilder.noReboot(noReboot)
  }

  public fun noReboot(noReboot: IResolvable) {
    cdkBuilder.noReboot(noReboot)
  }

  public fun build(): CfnLifecyclePolicy.ParametersProperty {
    if(_excludeDataVolumeTags.isNotEmpty()) cdkBuilder.excludeDataVolumeTags(_excludeDataVolumeTags)
    return cdkBuilder.build()
  }
}
