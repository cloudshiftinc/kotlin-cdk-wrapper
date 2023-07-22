@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnComputeEnvironment

@CdkDslMarker
public class CfnComputeEnvironmentUpdatePolicyPropertyDsl {
  private val cdkBuilder: CfnComputeEnvironment.UpdatePolicyProperty.Builder =
      CfnComputeEnvironment.UpdatePolicyProperty.builder()

  /**
   * @param jobExecutionTimeoutMinutes Specifies the job timeout (in minutes) when the compute
   * environment infrastructure is updated.
   * The default value is 30.
   */
  public fun jobExecutionTimeoutMinutes(jobExecutionTimeoutMinutes: Number) {
    cdkBuilder.jobExecutionTimeoutMinutes(jobExecutionTimeoutMinutes)
  }

  /**
   * @param terminateJobsOnUpdate Specifies whether jobs are automatically terminated when the
   * computer environment infrastructure is updated.
   * The default value is `false` .
   */
  public fun terminateJobsOnUpdate(terminateJobsOnUpdate: Boolean) {
    cdkBuilder.terminateJobsOnUpdate(terminateJobsOnUpdate)
  }

  /**
   * @param terminateJobsOnUpdate Specifies whether jobs are automatically terminated when the
   * computer environment infrastructure is updated.
   * The default value is `false` .
   */
  public fun terminateJobsOnUpdate(terminateJobsOnUpdate: IResolvable) {
    cdkBuilder.terminateJobsOnUpdate(terminateJobsOnUpdate)
  }

  public fun build(): CfnComputeEnvironment.UpdatePolicyProperty = cdkBuilder.build()
}
