@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IDomainName : IResource {
  public fun name(): String

  public fun regionalDomainName(): String

  public fun regionalHostedZoneId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.IDomainName,
  ) : CdkObject(cdkObject), IDomainName {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun name(): String = unwrap(this).getName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun regionalDomainName(): String = unwrap(this).getRegionalDomainName()

    override fun regionalHostedZoneId(): String = unwrap(this).getRegionalHostedZoneId()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IDomainName):
        IDomainName = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDomainName):
        software.amazon.awscdk.services.apigatewayv2.IDomainName = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigatewayv2.IDomainName
  }
}
