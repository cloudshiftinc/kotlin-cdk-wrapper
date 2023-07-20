@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codeguruprofiler

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup
import software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps
import software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup
import software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps
import software.constructs.Construct

public object codeguruprofiler {
  public inline fun cfnProfilingGroup(
    scope: Construct,
    id: String,
    block: CfnProfilingGroupDsl.() -> Unit = {},
  ): CfnProfilingGroup {
    val builder = CfnProfilingGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnProfilingGroupAgentPermissionsProperty(block: CfnProfilingGroupAgentPermissionsPropertyDsl.() -> Unit
      = {}): CfnProfilingGroup.AgentPermissionsProperty {
    val builder = CfnProfilingGroupAgentPermissionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnProfilingGroupChannelProperty(block: CfnProfilingGroupChannelPropertyDsl.() -> Unit =
      {}): CfnProfilingGroup.ChannelProperty {
    val builder = CfnProfilingGroupChannelPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnProfilingGroupProps(block: CfnProfilingGroupPropsDsl.() -> Unit = {}):
      CfnProfilingGroupProps {
    val builder = CfnProfilingGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun profilingGroup(
    scope: Construct,
    id: String,
    block: ProfilingGroupDsl.() -> Unit = {},
  ): ProfilingGroup {
    val builder = ProfilingGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun profilingGroupProps(block: ProfilingGroupPropsDsl.() -> Unit = {}):
      ProfilingGroupProps {
    val builder = ProfilingGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
