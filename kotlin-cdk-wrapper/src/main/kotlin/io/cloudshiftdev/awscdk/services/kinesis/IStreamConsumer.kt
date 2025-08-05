@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A Kinesis Stream Consumer.
 */
public interface IStreamConsumer : IResource {
  /**
   * Adds a statement to the IAM resource policy associated with this stream consumer.
   *
   * If this stream consumer was created in this stack (`new StreamConsumer`), a resource policy
   * will be automatically created upon the first call to `addToResourcePolicy`. If
   * the stream consumer is imported (`StreamConsumer.from`), then this is a no-op.
   *
   * @param statement 
   */
  public fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult

  /**
   * Adds a statement to the IAM resource policy associated with this stream consumer.
   *
   * If this stream consumer was created in this stack (`new StreamConsumer`), a resource policy
   * will be automatically created upon the first call to `addToResourcePolicy`. If
   * the stream consumer is imported (`StreamConsumer.from`), then this is a no-op.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult

  /**
   * Grant the indicated permissions on this stream consumer to the provided IAM principal.
   *
   * @param grantee 
   * @param actions 
   */
  public fun grant(grantee: IGrantable, vararg actions: String): Grant

  /**
   * Grant read permissions for this stream consumer and its associated stream to an IAM principal
   * (Role/Group/User).
   *
   * @param grantee 
   */
  public fun grantRead(grantee: IGrantable): Grant

  /**
   * The stream associated with this consumer.
   */
  public fun stream(): IStream

  /**
   * The ARN of the stream consumer.
   */
  public fun streamConsumerArn(): String

  /**
   * The name of the stream consumer.
   */
  public fun streamConsumerName(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesis.IStreamConsumer,
  ) : CdkObject(cdkObject),
      IStreamConsumer {
    /**
     * Adds a statement to the IAM resource policy associated with this stream consumer.
     *
     * If this stream consumer was created in this stack (`new StreamConsumer`), a resource policy
     * will be automatically created upon the first call to `addToResourcePolicy`. If
     * the stream consumer is imported (`StreamConsumer.from`), then this is a no-op.
     *
     * @param statement 
     */
    override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
        unwrap(this).addToResourcePolicy(statement.let(PolicyStatement.Companion::unwrap)).let(AddToResourcePolicyResult::wrap)

    /**
     * Adds a statement to the IAM resource policy associated with this stream consumer.
     *
     * If this stream consumer was created in this stack (`new StreamConsumer`), a resource policy
     * will be automatically created upon the first call to `addToResourcePolicy`. If
     * the stream consumer is imported (`StreamConsumer.from`), then this is a no-op.
     *
     * @param statement 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
    override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
        AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

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
     * Grant the indicated permissions on this stream consumer to the provided IAM principal.
     *
     * @param grantee 
     * @param actions 
     */
    override fun grant(grantee: IGrantable, vararg actions: String): Grant =
        unwrap(this).grant(grantee.let(IGrantable.Companion::unwrap),
        *actions.map{CdkObjectWrappers.unwrap(it) as String}.toTypedArray()).let(Grant::wrap)

    /**
     * Grant read permissions for this stream consumer and its associated stream to an IAM principal
     * (Role/Group/User).
     *
     * @param grantee 
     */
    override fun grantRead(grantee: IGrantable): Grant =
        unwrap(this).grantRead(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * The stream associated with this consumer.
     */
    override fun stream(): IStream = unwrap(this).getStream().let(IStream::wrap)

    /**
     * The ARN of the stream consumer.
     */
    override fun streamConsumerArn(): String = unwrap(this).getStreamConsumerArn()

    /**
     * The name of the stream consumer.
     */
    override fun streamConsumerName(): String = unwrap(this).getStreamConsumerName()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.IStreamConsumer):
        IStreamConsumer = CdkObjectWrappers.wrap(cdkObject) as? IStreamConsumer ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStreamConsumer):
        software.amazon.awscdk.services.kinesis.IStreamConsumer = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.kinesis.IStreamConsumer
  }
}
