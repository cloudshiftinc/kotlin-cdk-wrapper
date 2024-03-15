@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IRequestValidator : IResource {
  public fun requestValidatorId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.IRequestValidator,
  ) : CdkObject(cdkObject), IRequestValidator {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun requestValidatorId(): String = unwrap(this).getRequestValidatorId()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IRequestValidator):
        IRequestValidator = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IRequestValidator):
        software.amazon.awscdk.services.apigateway.IRequestValidator = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IRequestValidator
  }
}
