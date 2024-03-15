@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface ComputeEnvironmentProps {
  public fun computeEnvironmentName(): String? = unwrap(this).getComputeEnvironmentName()

  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun computeEnvironmentName(computeEnvironmentName: String)

    public fun enabled(enabled: Boolean)

    public fun serviceRole(serviceRole: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.ComputeEnvironmentProps.Builder =
        software.amazon.awscdk.services.batch.ComputeEnvironmentProps.builder()

    override fun computeEnvironmentName(computeEnvironmentName: String) {
      cdkBuilder.computeEnvironmentName(computeEnvironmentName)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.ComputeEnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.ComputeEnvironmentProps,
  ) : CdkObject(cdkObject), ComputeEnvironmentProps {
    override fun computeEnvironmentName(): String? = unwrap(this).getComputeEnvironmentName()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ComputeEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.ComputeEnvironmentProps):
        ComputeEnvironmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ComputeEnvironmentProps):
        software.amazon.awscdk.services.batch.ComputeEnvironmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.ComputeEnvironmentProps
  }
}
