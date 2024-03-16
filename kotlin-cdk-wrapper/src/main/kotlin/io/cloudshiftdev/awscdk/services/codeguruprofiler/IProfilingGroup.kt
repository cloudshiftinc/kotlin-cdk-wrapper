@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codeguruprofiler

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String

/**
 * IResource represents a Profiling Group.
 */
public interface IProfilingGroup : IResource {
  /**
   * Grant access to publish profiling information to the Profiling Group to the given identity.
   *
   * This will grant the following permissions:
   *
   * * codeguru-profiler:ConfigureAgent
   * * codeguru-profiler:PostAgentProfile
   *
   * @param grantee Principal to grant publish rights to. 
   */
  public fun grantPublish(grantee: IGrantable): Grant

  /**
   * Grant access to read profiling information from the Profiling Group to the given identity.
   *
   * This will grant the following permissions:
   *
   * * codeguru-profiler:GetProfile
   * * codeguru-profiler:DescribeProfilingGroup
   *
   * @param grantee Principal to grant read rights to. 
   */
  public fun grantRead(grantee: IGrantable): Grant

  /**
   * The ARN of the profiling group.
   */
  public fun profilingGroupArn(): String

  /**
   * The name of the profiling group.
   */
  public fun profilingGroupName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup):
        IProfilingGroup = CdkObjectWrappers.wrap(cdkObject) as IProfilingGroup

    internal fun unwrap(wrapped: IProfilingGroup):
        software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup
  }
}
