package io.cloudshiftdev.awscdk.services.codeguruprofiler

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ProfilingGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup,
) : Resource(cdkObject), IProfilingGroup {
  public override fun grantPublish(grantee: IGrantable): Grant =
      unwrap(this).grantPublish(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun profilingGroupArn(): String = unwrap(this).getProfilingGroupArn()

  public override fun profilingGroupName(): String = unwrap(this).getProfilingGroupName()

  public interface Builder {
    public fun computePlatform(computePlatform: ComputePlatform)

    public fun profilingGroupName(profilingGroupName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup.Builder
        = software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup.Builder.create(scope, id)

    override fun computePlatform(computePlatform: ComputePlatform) {
      cdkBuilder.computePlatform(computePlatform.let(ComputePlatform::unwrap))
    }

    override fun profilingGroupName(profilingGroupName: String) {
      cdkBuilder.profilingGroupName(profilingGroupName)
    }

    public fun build(): software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromProfilingGroupArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      profilingGroupArn: String,
    ): IProfilingGroup =
        software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup.fromProfilingGroupArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, profilingGroupArn).let(IProfilingGroup::wrap)

    public open fun fromProfilingGroupName(
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
