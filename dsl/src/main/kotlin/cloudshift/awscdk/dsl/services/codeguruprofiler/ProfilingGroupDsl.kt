@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codeguruprofiler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codeguruprofiler.ComputePlatform
import software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup
import software.constructs.Construct

@CdkDslMarker
public class ProfilingGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: ProfilingGroup.Builder = ProfilingGroup.Builder.create(scope, id)

  public fun computePlatform(computePlatform: ComputePlatform) {
    cdkBuilder.computePlatform(computePlatform)
  }

  public fun profilingGroupName(profilingGroupName: String) {
    cdkBuilder.profilingGroupName(profilingGroupName)
  }

  public fun build(): ProfilingGroup = cdkBuilder.build()
}
