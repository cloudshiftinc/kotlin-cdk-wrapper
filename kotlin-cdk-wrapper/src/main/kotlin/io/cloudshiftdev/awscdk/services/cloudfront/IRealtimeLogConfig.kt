@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Node
import kotlin.String

/**
 * Represents Realtime Log Configuration.
 */
public interface IRealtimeLogConfig : IResource {
  /**
   * The arn of the realtime log config.
   */
  public fun realtimeLogConfigArn(): String

  /**
   * The name of the realtime log config.
   */
  public fun realtimeLogConfigName(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.IRealtimeLogConfig,
  ) : CdkObject(cdkObject),
      IRealtimeLogConfig {
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
     * The arn of the realtime log config.
     */
    override fun realtimeLogConfigArn(): String = unwrap(this).getRealtimeLogConfigArn()

    /**
     * The name of the realtime log config.
     */
    override fun realtimeLogConfigName(): String = unwrap(this).getRealtimeLogConfigName()

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IRealtimeLogConfig):
        IRealtimeLogConfig = CdkObjectWrappers.wrap(cdkObject) as? IRealtimeLogConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IRealtimeLogConfig):
        software.amazon.awscdk.services.cloudfront.IRealtimeLogConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.IRealtimeLogConfig
  }
}
