@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Node
import kotlin.String

/**
 * Represents a Kinesis Data Firehose delivery stream.
 */
public interface IDeliveryStream : IResource {
  /**
   * The ARN of the delivery stream.
   */
  public fun deliveryStreamArn(): String

  /**
   * The name of the delivery stream.
   */
  public fun deliveryStreamName(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.targets.IDeliveryStream,
  ) : CdkObject(cdkObject),
      IDeliveryStream {
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
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * The ARN of the delivery stream.
     */
    override fun deliveryStreamArn(): String = unwrap(this).getDeliveryStreamArn()

    /**
     * The name of the delivery stream.
     */
    override fun deliveryStreamName(): String = unwrap(this).getDeliveryStreamName()

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
    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.IDeliveryStream):
        IDeliveryStream = CdkObjectWrappers.wrap(cdkObject) as? IDeliveryStream ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDeliveryStream):
        software.amazon.awscdk.services.events.targets.IDeliveryStream = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.IDeliveryStream
  }
}
