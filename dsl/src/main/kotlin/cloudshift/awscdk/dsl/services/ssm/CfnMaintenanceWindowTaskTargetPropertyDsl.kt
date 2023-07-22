@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

@CdkDslMarker
public class CfnMaintenanceWindowTaskTargetPropertyDsl {
  private val cdkBuilder: CfnMaintenanceWindowTask.TargetProperty.Builder =
      CfnMaintenanceWindowTask.TargetProperty.builder()

  private val _values: MutableList<String> = mutableListOf()

  /**
   * @param key User-defined criteria for sending commands that target instances that meet the
   * criteria. 
   * `Key` can be `InstanceIds` or `WindowTargetIds` . For more information about how to target
   * instances within a maintenance window task, see [About 'register-task-with-maintenance-window'
   * Options and
   * Values](https://docs.aws.amazon.com/systems-manager/latest/userguide/register-tasks-options.html)
   * in the *AWS Systems Manager User Guide* .
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param values User-defined criteria that maps to `Key` . 
   * For example, if you specify `InstanceIds` , you can specify
   * `i-1234567890abcdef0,i-9876543210abcdef0` to run a command on two EC2 instances. For more
   * information about how to target instances within a maintenance window task, see [About
   * 'register-task-with-maintenance-window' Options and
   * Values](https://docs.aws.amazon.com/systems-manager/latest/userguide/register-tasks-options.html)
   * in the *AWS Systems Manager User Guide* .
   */
  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values User-defined criteria that maps to `Key` . 
   * For example, if you specify `InstanceIds` , you can specify
   * `i-1234567890abcdef0,i-9876543210abcdef0` to run a command on two EC2 instances. For more
   * information about how to target instances within a maintenance window task, see [About
   * 'register-task-with-maintenance-window' Options and
   * Values](https://docs.aws.amazon.com/systems-manager/latest/userguide/register-tasks-options.html)
   * in the *AWS Systems Manager User Guide* .
   */
  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnMaintenanceWindowTask.TargetProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
