@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IUserPoolClient : IResource {
  public fun userPoolClientId(): String

  public fun userPoolClientSecret(): SecretValue

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.IUserPoolClient,
  ) : CdkObject(cdkObject), IUserPoolClient {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun userPoolClientId(): String = unwrap(this).getUserPoolClientId()

    override fun userPoolClientSecret(): SecretValue =
        unwrap(this).getUserPoolClientSecret().let(SecretValue::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.IUserPoolClient):
        IUserPoolClient = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IUserPoolClient):
        software.amazon.awscdk.services.cognito.IUserPoolClient = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cognito.IUserPoolClient
  }
}
