@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface UnmanagedComputeEnvironmentProps : ComputeEnvironmentProps {
  public fun unmanagedvCpus(): Number? = unwrap(this).getUnmanagedvCpus()

  @CdkDslMarker
  public interface Builder {
    public fun computeEnvironmentName(computeEnvironmentName: String)

    public fun enabled(enabled: Boolean)

    public fun serviceRole(serviceRole: IRole)

    public fun unmanagedvCpus(unmanagedvCpus: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.batch.UnmanagedComputeEnvironmentProps.Builder =
        software.amazon.awscdk.services.batch.UnmanagedComputeEnvironmentProps.builder()

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

    public fun build(): software.amazon.awscdk.services.batch.UnmanagedComputeEnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.UnmanagedComputeEnvironmentProps,
  ) : CdkObject(cdkObject), UnmanagedComputeEnvironmentProps {
    override fun computeEnvironmentName(): String? = unwrap(this).getComputeEnvironmentName()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

    override fun unmanagedvCpus(): Number? = unwrap(this).getUnmanagedvCpus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UnmanagedComputeEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.UnmanagedComputeEnvironmentProps):
        UnmanagedComputeEnvironmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UnmanagedComputeEnvironmentProps):
        software.amazon.awscdk.services.batch.UnmanagedComputeEnvironmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.batch.UnmanagedComputeEnvironmentProps
  }
}
