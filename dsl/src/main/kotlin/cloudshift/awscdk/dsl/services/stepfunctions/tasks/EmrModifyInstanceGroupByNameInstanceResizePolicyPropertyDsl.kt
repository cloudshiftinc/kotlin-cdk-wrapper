@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName

/**
 * Custom policy for requesting termination protection or termination of specific instances when
 * shrinking an instance group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * InstanceResizePolicyProperty instanceResizePolicyProperty =
 * InstanceResizePolicyProperty.builder()
 * .instancesToProtect(List.of("instancesToProtect"))
 * .instancesToTerminate(List.of("instancesToTerminate"))
 * .instanceTerminationTimeout(Duration.minutes(30))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_InstanceResizePolicy.html)
 */
@CdkDslMarker
public class EmrModifyInstanceGroupByNameInstanceResizePolicyPropertyDsl {
  private val cdkBuilder: EmrModifyInstanceGroupByName.InstanceResizePolicyProperty.Builder =
      EmrModifyInstanceGroupByName.InstanceResizePolicyProperty.builder()

  private val _instancesToProtect: MutableList<String> = mutableListOf()

  private val _instancesToTerminate: MutableList<String> = mutableListOf()

  /**
   * @param instanceTerminationTimeout Decommissioning timeout override for the specific list of
   * instances to be terminated.
   */
  public fun instanceTerminationTimeout(instanceTerminationTimeout: Duration) {
    cdkBuilder.instanceTerminationTimeout(instanceTerminationTimeout)
  }

  /**
   * @param instancesToProtect Specific list of instances to be protected when shrinking an instance
   * group.
   */
  public fun instancesToProtect(vararg instancesToProtect: String) {
    _instancesToProtect.addAll(listOf(*instancesToProtect))
  }

  /**
   * @param instancesToProtect Specific list of instances to be protected when shrinking an instance
   * group.
   */
  public fun instancesToProtect(instancesToProtect: Collection<String>) {
    _instancesToProtect.addAll(instancesToProtect)
  }

  /**
   * @param instancesToTerminate Specific list of instances to be terminated when shrinking an
   * instance group.
   */
  public fun instancesToTerminate(vararg instancesToTerminate: String) {
    _instancesToTerminate.addAll(listOf(*instancesToTerminate))
  }

  /**
   * @param instancesToTerminate Specific list of instances to be terminated when shrinking an
   * instance group.
   */
  public fun instancesToTerminate(instancesToTerminate: Collection<String>) {
    _instancesToTerminate.addAll(instancesToTerminate)
  }

  public fun build(): EmrModifyInstanceGroupByName.InstanceResizePolicyProperty {
    if(_instancesToProtect.isNotEmpty()) cdkBuilder.instancesToProtect(_instancesToProtect)
    if(_instancesToTerminate.isNotEmpty()) cdkBuilder.instancesToTerminate(_instancesToTerminate)
    return cdkBuilder.build()
  }
}
