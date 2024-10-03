@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Node
import kotlin.String

/**
 * Interface for AppSync Functions.
 */
public interface IAppsyncFunction : IResource {
  /**
   * the ARN of the AppSync function.
   */
  public fun functionArn(): String

  /**
   * the name of this AppSync Function.
   */
  public fun functionId(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.IAppsyncFunction,
  ) : CdkObject(cdkObject),
      IAppsyncFunction {
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
     * the ARN of the AppSync function.
     */
    override fun functionArn(): String = unwrap(this).getFunctionArn()

    /**
     * the name of this AppSync Function.
     */
    override fun functionId(): String = unwrap(this).getFunctionId()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.IAppsyncFunction):
        IAppsyncFunction = CdkObjectWrappers.wrap(cdkObject) as? IAppsyncFunction ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAppsyncFunction):
        software.amazon.awscdk.services.appsync.IAppsyncFunction = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appsync.IAppsyncFunction
  }
}
