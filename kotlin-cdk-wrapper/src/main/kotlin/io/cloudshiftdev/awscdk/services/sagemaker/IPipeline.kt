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

public interface IPipeline : IResource {
  public fun grantStartPipelineExecution(arg0: IGrantable): Grant

  public fun pipelineArn(): String

  public fun pipelineName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.IPipeline,
  ) : CdkObject(cdkObject), IPipeline {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grantStartPipelineExecution(arg0: IGrantable): Grant =
        unwrap(this).grantStartPipelineExecution(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun pipelineArn(): String = unwrap(this).getPipelineArn()

    override fun pipelineName(): String = unwrap(this).getPipelineName()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.IPipeline): IPipeline =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPipeline): software.amazon.awscdk.services.sagemaker.IPipeline =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.IPipeline
  }
}
