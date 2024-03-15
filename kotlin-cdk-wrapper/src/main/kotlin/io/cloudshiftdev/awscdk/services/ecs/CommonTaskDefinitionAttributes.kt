@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

public interface CommonTaskDefinitionAttributes {
  public fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

  public fun networkMode(): NetworkMode? = unwrap(this).getNetworkMode()?.let(NetworkMode::wrap)

  public fun taskDefinitionArn(): String

  public fun taskRole(): IRole? = unwrap(this).getTaskRole()?.let(IRole::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun executionRole(executionRole: IRole)

    public fun networkMode(networkMode: NetworkMode)

    public fun taskDefinitionArn(taskDefinitionArn: String)

    public fun taskRole(taskRole: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.CommonTaskDefinitionAttributes.Builder =
        software.amazon.awscdk.services.ecs.CommonTaskDefinitionAttributes.builder()

    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    override fun networkMode(networkMode: NetworkMode) {
      cdkBuilder.networkMode(networkMode.let(NetworkMode::unwrap))
    }

    override fun taskDefinitionArn(taskDefinitionArn: String) {
      cdkBuilder.taskDefinitionArn(taskDefinitionArn)
    }

    override fun taskRole(taskRole: IRole) {
      cdkBuilder.taskRole(taskRole.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.CommonTaskDefinitionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.CommonTaskDefinitionAttributes,
  ) : CdkObject(cdkObject), CommonTaskDefinitionAttributes {
    override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

    override fun networkMode(): NetworkMode? = unwrap(this).getNetworkMode()?.let(NetworkMode::wrap)

    override fun taskDefinitionArn(): String = unwrap(this).getTaskDefinitionArn()

    override fun taskRole(): IRole? = unwrap(this).getTaskRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CommonTaskDefinitionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CommonTaskDefinitionAttributes):
        CommonTaskDefinitionAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonTaskDefinitionAttributes):
        software.amazon.awscdk.services.ecs.CommonTaskDefinitionAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.CommonTaskDefinitionAttributes
  }
}