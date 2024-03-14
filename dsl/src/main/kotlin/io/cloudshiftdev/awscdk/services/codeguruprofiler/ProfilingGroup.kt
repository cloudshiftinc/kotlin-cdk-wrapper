package io.cloudshiftdev.awscdk.services.codeguruprofiler

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ProfilingGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup,
) : Resource(cdkObject), IProfilingGroup {
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
  public override fun grantPublish(grantee: IGrantable): Grant =
      unwrap(this).grantPublish(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

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
  public override fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * The ARN of the Profiling Group.
   */
  public override fun profilingGroupArn(): String = unwrap(this).getProfilingGroupArn()

  /**
   * The name of the Profiling Group.
   */
  public override fun profilingGroupName(): String = unwrap(this).getProfilingGroupName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codeguruprofiler.ProfilingGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The compute platform of the profiling group.
     *
     * Default: ComputePlatform.DEFAULT
     *
     * @param computePlatform The compute platform of the profiling group. 
     */
    public fun computePlatform(computePlatform: ComputePlatform)

    /**
     * A name for the profiling group.
     *
     * Default: - automatically generated name.
     *
     * @param profilingGroupName A name for the profiling group. 
     */
    public fun profilingGroupName(profilingGroupName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup.Builder
        = software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup.Builder.create(scope, id)

    /**
     * The compute platform of the profiling group.
     *
     * Default: ComputePlatform.DEFAULT
     *
     * @param computePlatform The compute platform of the profiling group. 
     */
    override fun computePlatform(computePlatform: ComputePlatform) {
      cdkBuilder.computePlatform(computePlatform.let(ComputePlatform::unwrap))
    }

    /**
     * A name for the profiling group.
     *
     * Default: - automatically generated name.
     *
     * @param profilingGroupName A name for the profiling group. 
     */
    override fun profilingGroupName(profilingGroupName: String) {
      cdkBuilder.profilingGroupName(profilingGroupName)
    }

    public fun build(): software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromProfilingGroupArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      profilingGroupArn: String,
    ): IProfilingGroup =
        software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup.fromProfilingGroupArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, profilingGroupArn).let(IProfilingGroup::wrap)

    public fun fromProfilingGroupName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      profilingGroupName: String,
    ): IProfilingGroup =
        software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup.fromProfilingGroupName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, profilingGroupName).let(IProfilingGroup::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ProfilingGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ProfilingGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup):
        ProfilingGroup = ProfilingGroup(cdkObject)

    internal fun unwrap(wrapped: ProfilingGroup):
        software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup = wrapped.cdkObject
  }
}
