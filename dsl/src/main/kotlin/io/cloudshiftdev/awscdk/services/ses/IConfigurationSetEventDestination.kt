package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IConfigurationSetEventDestination : IResource {
  /**
   * The ID of the configuration set event destination.
   */
  public fun configurationSetEventDestinationId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ses.IConfigurationSetEventDestination,
  ) : IConfigurationSetEventDestination {
    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * The ID of the configuration set event destination.
     */
    override fun configurationSetEventDestinationId(): String =
        unwrap(this).getConfigurationSetEventDestinationId()

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ses.IConfigurationSetEventDestination):
        IConfigurationSetEventDestination = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IConfigurationSetEventDestination):
        software.amazon.awscdk.services.ses.IConfigurationSetEventDestination = (wrapped as
        Wrapper).cdkObject
  }
}
