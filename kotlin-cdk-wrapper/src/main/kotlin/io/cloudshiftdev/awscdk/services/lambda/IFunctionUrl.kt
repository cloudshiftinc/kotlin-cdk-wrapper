@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IFunctionUrl : IResource {
  public fun functionArn(): String

  public fun grantInvokeUrl(arg0: IGrantable): Grant

  public fun url(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.IFunctionUrl,
  ) : CdkObject(cdkObject), IFunctionUrl {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun functionArn(): String = unwrap(this).getFunctionArn()

    override fun grantInvokeUrl(arg0: IGrantable): Grant =
        unwrap(this).grantInvokeUrl(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun url(): String = unwrap(this).getUrl()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IFunctionUrl): IFunctionUrl
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFunctionUrl): software.amazon.awscdk.services.lambda.IFunctionUrl
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.IFunctionUrl
  }
}
