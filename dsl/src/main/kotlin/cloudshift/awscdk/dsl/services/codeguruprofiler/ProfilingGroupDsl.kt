@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codeguruprofiler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codeguruprofiler.ComputePlatform
import software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup
import software.constructs.Construct

/**
 * A new Profiling Group.
 *
 * Example:
 *
 * ```
 * // The execution role of your application that publishes to the ProfilingGroup via CodeGuru
 * Profiler Profiling Agent. (the following is merely an example)
 * Role publishAppRole = Role.Builder.create(this, "PublishAppRole")
 * .assumedBy(new AccountRootPrincipal())
 * .build();
 * ProfilingGroup profilingGroup = new ProfilingGroup(this, "MyProfilingGroup");
 * profilingGroup.grantPublish(publishAppRole);
 * ```
 */
@CdkDslMarker
public class ProfilingGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: ProfilingGroup.Builder = ProfilingGroup.Builder.create(scope, id)

  /**
   * The compute platform of the profiling group.
   *
   * Default: ComputePlatform.DEFAULT
   *
   * @param computePlatform The compute platform of the profiling group. 
   */
  public fun computePlatform(computePlatform: ComputePlatform) {
    cdkBuilder.computePlatform(computePlatform)
  }

  /**
   * A name for the profiling group.
   *
   * Default: - automatically generated name.
   *
   * @param profilingGroupName A name for the profiling group. 
   */
  public fun profilingGroupName(profilingGroupName: String) {
    cdkBuilder.profilingGroupName(profilingGroupName)
  }

  public fun build(): ProfilingGroup = cdkBuilder.build()
}
