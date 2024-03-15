@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IConfigurationSetEventDestination : IResource {
  public fun configurationSetEventDestinationId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.IConfigurationSetEventDestination,
  ) : CdkObject(cdkObject), IConfigurationSetEventDestination {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun configurationSetEventDestinationId(): String =
        unwrap(this).getConfigurationSetEventDestinationId()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ses.IConfigurationSetEventDestination):
        IConfigurationSetEventDestination = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IConfigurationSetEventDestination):
        software.amazon.awscdk.services.ses.IConfigurationSetEventDestination = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.IConfigurationSetEventDestination
  }
}
