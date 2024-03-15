@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IAccessPoint : IResource {
  public fun accessPointArn(): String

  public fun accessPointId(): String

  public fun fileSystem(): IFileSystem

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.efs.IAccessPoint,
  ) : CdkObject(cdkObject), IAccessPoint {
    override fun accessPointArn(): String = unwrap(this).getAccessPointArn()

    override fun accessPointId(): String = unwrap(this).getAccessPointId()

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun fileSystem(): IFileSystem = unwrap(this).getFileSystem().let(IFileSystem::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.IAccessPoint): IAccessPoint =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAccessPoint): software.amazon.awscdk.services.efs.IAccessPoint =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.efs.IAccessPoint
  }
}
