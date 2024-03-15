@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.String

public interface IComputeEnvironment : IResource {
  public fun computeEnvironmentArn(): String

  public fun computeEnvironmentName(): String

  public fun enabled(): Boolean

  public fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.IComputeEnvironment,
  ) : CdkObject(cdkObject), IComputeEnvironment {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun computeEnvironmentArn(): String = unwrap(this).getComputeEnvironmentArn()

    override fun computeEnvironmentName(): String = unwrap(this).getComputeEnvironmentName()

    override fun enabled(): Boolean = unwrap(this).getEnabled()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IComputeEnvironment):
        IComputeEnvironment = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IComputeEnvironment):
        software.amazon.awscdk.services.batch.IComputeEnvironment = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.batch.IComputeEnvironment
  }
}
