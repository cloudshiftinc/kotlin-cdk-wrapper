package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class UnmanagedComputeEnvironment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.UnmanagedComputeEnvironment,
) : Resource(cdkObject), IUnmanagedComputeEnvironment, IComputeEnvironment {
  public override fun computeEnvironmentArn(): String = unwrap(this).getComputeEnvironmentArn()

  public override fun computeEnvironmentName(): String = unwrap(this).getComputeEnvironmentName()

  public override fun enabled(): Boolean = unwrap(this).getEnabled()

  public override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

  public override fun unmanagedvCpUs(): Number? = unwrap(this).getUnmanagedvCPUs()

  public interface Builder {
    public fun computeEnvironmentName(computeEnvironmentName: String)

    public fun enabled(enabled: Boolean)

    public fun serviceRole(serviceRole: IRole)

    public fun unmanagedvCpus(unmanagedvCpus: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.batch.UnmanagedComputeEnvironment.Builder =
        software.amazon.awscdk.services.batch.UnmanagedComputeEnvironment.Builder.create(scope, id)

    override fun computeEnvironmentName(computeEnvironmentName: String) {
      cdkBuilder.computeEnvironmentName(computeEnvironmentName)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    override fun unmanagedvCpus(unmanagedvCpus: Number) {
      cdkBuilder.unmanagedvCpus(unmanagedvCpus)
    }

    public fun build(): software.amazon.awscdk.services.batch.UnmanagedComputeEnvironment =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromUnmanagedComputeEnvironmentArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      unmanagedComputeEnvironmentArn: String,
    ): IUnmanagedComputeEnvironment =
        software.amazon.awscdk.services.batch.UnmanagedComputeEnvironment.fromUnmanagedComputeEnvironmentArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, unmanagedComputeEnvironmentArn).let(IUnmanagedComputeEnvironment::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UnmanagedComputeEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UnmanagedComputeEnvironment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.UnmanagedComputeEnvironment):
        UnmanagedComputeEnvironment = UnmanagedComputeEnvironment(cdkObject)

    internal fun unwrap(wrapped: UnmanagedComputeEnvironment):
        software.amazon.awscdk.services.batch.UnmanagedComputeEnvironment = wrapped.cdkObject
  }
}
