@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Node
import kotlin.String

/**
 * Represents a reference to a CodeDeploy Application deploying to Amazon ECS.
 *
 * If you're managing the Application alongside the rest of your CDK resources,
 * use the `EcsApplication` class.
 *
 * If you want to reference an already existing Application,
 * or one defined in a different CDK Stack,
 * use the `EcsApplication#fromEcsApplicationName` method.
 */
public interface IEcsApplication : IResource {
  /**
   *
   */
  public fun applicationArn(): String

  /**
   *
   */
  public fun applicationName(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codedeploy.IEcsApplication,
  ) : CdkObject(cdkObject),
      IEcsApplication {
    /**
     *
     */
    override fun applicationArn(): String = unwrap(this).getApplicationArn()

    /**
     *
     */
    override fun applicationName(): String = unwrap(this).getApplicationName()

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
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.IEcsApplication):
        IEcsApplication = CdkObjectWrappers.wrap(cdkObject) as? IEcsApplication ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEcsApplication):
        software.amazon.awscdk.services.codedeploy.IEcsApplication = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.IEcsApplication
  }
}
