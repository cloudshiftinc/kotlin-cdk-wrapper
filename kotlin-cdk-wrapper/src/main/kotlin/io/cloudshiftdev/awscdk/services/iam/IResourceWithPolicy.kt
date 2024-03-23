@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Node
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A resource with a resource policy that can be added to.
 */
public interface IResourceWithPolicy : IResource {
  /**
   * Add a statement to the resource's resource policy.
   *
   * @param statement 
   */
  public fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult

  /**
   * Add a statement to the resource's resource policy.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iam.IResourceWithPolicy,
  ) : CdkObject(cdkObject), IResourceWithPolicy {
    /**
     * Add a statement to the resource's resource policy.
     *
     * @param statement 
     */
    override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
        unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

    /**
     * Add a statement to the resource's resource policy.
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

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IResourceWithPolicy):
        IResourceWithPolicy = CdkObjectWrappers.wrap(cdkObject) as? IResourceWithPolicy ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IResourceWithPolicy):
        software.amazon.awscdk.services.iam.IResourceWithPolicy = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.IResourceWithPolicy
  }
}
