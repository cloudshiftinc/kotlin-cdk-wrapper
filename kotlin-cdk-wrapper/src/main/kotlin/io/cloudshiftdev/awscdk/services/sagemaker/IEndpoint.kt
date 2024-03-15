@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IEndpoint : IResource {
  public fun endpointArn(): String

  public fun endpointName(): String

  public fun grantInvoke(arg0: IGrantable): Grant

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.IEndpoint,
  ) : CdkObject(cdkObject), IEndpoint {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun endpointArn(): String = unwrap(this).getEndpointArn()

    override fun endpointName(): String = unwrap(this).getEndpointName()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grantInvoke(arg0: IGrantable): Grant =
        unwrap(this).grantInvoke(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.IEndpoint): IEndpoint =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEndpoint): software.amazon.awscdk.services.sagemaker.IEndpoint =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.IEndpoint
  }
}
