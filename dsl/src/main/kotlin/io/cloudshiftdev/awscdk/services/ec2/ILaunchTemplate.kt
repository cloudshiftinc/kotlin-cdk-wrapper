package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface ILaunchTemplate : IResource {
  /**
   * The identifier of the Launch Template.
   *
   * Exactly one of `launchTemplateId` and `launchTemplateName` will be set.
   */
  public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

  /**
   * The name of the Launch Template.
   *
   * Exactly one of `launchTemplateId` and `launchTemplateName` will be set.
   */
  public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

  /**
   * The version number of this launch template to use.
   */
  public fun versionNumber(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.ILaunchTemplate,
  ) : CdkObject(cdkObject), ILaunchTemplate {
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
     * The identifier of the Launch Template.
     *
     * Exactly one of `launchTemplateId` and `launchTemplateName` will be set.
     */
    override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    /**
     * The name of the Launch Template.
     *
     * Exactly one of `launchTemplateId` and `launchTemplateName` will be set.
     */
    override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * The version number of this launch template to use.
     */
    override fun versionNumber(): String = unwrap(this).getVersionNumber()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ILaunchTemplate):
        ILaunchTemplate = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILaunchTemplate):
        software.amazon.awscdk.services.ec2.ILaunchTemplate = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.ILaunchTemplate
  }
}
