@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IEventSourceMapping : IResource {
  public fun eventSourceMappingArn(): String

  public fun eventSourceMappingId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.IEventSourceMapping,
  ) : CdkObject(cdkObject), IEventSourceMapping {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun eventSourceMappingArn(): String = unwrap(this).getEventSourceMappingArn()

    override fun eventSourceMappingId(): String = unwrap(this).getEventSourceMappingId()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IEventSourceMapping):
        IEventSourceMapping = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEventSourceMapping):
        software.amazon.awscdk.services.lambda.IEventSourceMapping = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.IEventSourceMapping
  }
}
