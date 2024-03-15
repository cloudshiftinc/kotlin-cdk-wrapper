@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

/**
 * Represents an event source mapping for a lambda function.
 *
 * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html)
 */
public interface IEventSourceMapping : IResource {
  /**
   * The ARN of the event source mapping (i.e.
   * arn:aws:lambda:region:account-id:event-source-mapping/event-source-mapping-id).
   */
  public fun eventSourceMappingArn(): String

  /**
   * The identifier for this EventSourceMapping.
   */
  public fun eventSourceMappingId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.IEventSourceMapping,
  ) : CdkObject(cdkObject), IEventSourceMapping {
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

    /**
     * The ARN of the event source mapping (i.e.
     * arn:aws:lambda:region:account-id:event-source-mapping/event-source-mapping-id).
     */
    override fun eventSourceMappingArn(): String = unwrap(this).getEventSourceMappingArn()

    /**
     * The identifier for this EventSourceMapping.
     */
    override fun eventSourceMappingId(): String = unwrap(this).getEventSourceMappingId()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
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
