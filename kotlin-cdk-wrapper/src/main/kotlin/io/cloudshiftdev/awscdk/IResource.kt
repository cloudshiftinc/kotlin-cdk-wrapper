@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.IConstruct
import io.cloudshiftdev.constructs.Node

/**
 * Interface for the Resource construct.
 */
public interface IResource : IConstruct {
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
  public fun applyRemovalPolicy(policy: RemovalPolicy)

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
  public fun env(): ResourceEnvironment

  /**
   * The stack in which this resource is defined.
   */
  public fun stack(): Stack

  private class Wrapper(
    cdkObject: software.amazon.awscdk.IResource,
  ) : CdkObject(cdkObject), IResource {
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

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IResource): IResource =
        CdkObjectWrappers.wrap(cdkObject) as? IResource ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IResource): software.amazon.awscdk.IResource = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.IResource
  }
}
