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

  /**
   * @param excludeBootVolume *[Snapshot policies that target instances only]* Indicates whether to
   * exclude the root volume from multi-volume snapshot sets.
   * The default is `false` . If you specify `true` , then the root volumes attached to targeted
   * instances will be excluded from the multi-volume snapshot sets created by the policy.
   */
  public fun excludeBootVolume(excludeBootVolume: Boolean) {
    cdkBuilder.excludeBootVolume(excludeBootVolume)
  }

  /**
   * @param excludeBootVolume *[Snapshot policies that target instances only]* Indicates whether to
   * exclude the root volume from multi-volume snapshot sets.
   * The default is `false` . If you specify `true` , then the root volumes attached to targeted
   * instances will be excluded from the multi-volume snapshot sets created by the policy.
   */
  public fun excludeBootVolume(excludeBootVolume: IResolvable) {
    cdkBuilder.excludeBootVolume(excludeBootVolume)
  }

  /**
   * @param excludeDataVolumeTags the value to be set.
   */
  public fun excludeDataVolumeTags(vararg excludeDataVolumeTags: Any) {
    _excludeDataVolumeTags.addAll(listOf(*excludeDataVolumeTags))
  }

  /**
   * @param excludeDataVolumeTags the value to be set.
   */
  public fun excludeDataVolumeTags(excludeDataVolumeTags: Collection<Any>) {
    _excludeDataVolumeTags.addAll(excludeDataVolumeTags)
  }

  /**
   * @param excludeDataVolumeTags the value to be set.
   */
  public fun excludeDataVolumeTags(excludeDataVolumeTags: IResolvable) {
    cdkBuilder.excludeDataVolumeTags(excludeDataVolumeTags)
  }

  /**
   * @param noReboot *[AMI policies only]* Indicates whether targeted instances are rebooted when
   * the lifecycle policy runs.
   * `true` indicates that targeted instances are not rebooted when the policy runs. `false`
   * indicates that target instances are rebooted when the policy runs. The default is `true`
   * (instances are not rebooted).
   */
  public fun noReboot(noReboot: Boolean) {
    cdkBuilder.noReboot(noReboot)
  }

  /**
   * @param noReboot *[AMI policies only]* Indicates whether targeted instances are rebooted when
   * the lifecycle policy runs.
   * `true` indicates that targeted instances are not rebooted when the policy runs. `false`
   * indicates that target instances are rebooted when the policy runs. The default is `true`
   * (instances are not rebooted).
   */
  public fun noReboot(noReboot: IResolvable) {
    cdkBuilder.noReboot(noReboot)
  }

  public fun build(): CfnLifecyclePolicy.ParametersProperty {
    if(_excludeDataVolumeTags.isNotEmpty()) cdkBuilder.excludeDataVolumeTags(_excludeDataVolumeTags)
    return cdkBuilder.build()
  }
}
