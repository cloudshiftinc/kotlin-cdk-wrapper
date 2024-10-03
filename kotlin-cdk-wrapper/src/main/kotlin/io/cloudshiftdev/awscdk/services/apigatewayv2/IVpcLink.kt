@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.constructs.Node
import kotlin.String

/**
 * Represents an API Gateway VpcLink.
 */
public interface IVpcLink : IResource {
  /**
   * The VPC to which this VPC Link is associated with.
   */
  public fun vpc(): IVpc

  /**
   * Physical ID of the VpcLink resource.
   */
  public fun vpcLinkId(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.IVpcLink,
  ) : CdkObject(cdkObject),
      IVpcLink {
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

    /**
     * The VPC to which this VPC Link is associated with.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    /**
     * Physical ID of the VpcLink resource.
     */
    override fun vpcLinkId(): String = unwrap(this).getVpcLinkId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IVpcLink): IVpcLink =
        CdkObjectWrappers.wrap(cdkObject) as? IVpcLink ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVpcLink): software.amazon.awscdk.services.apigatewayv2.IVpcLink =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IVpcLink
  }
}
