@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.constructs.Node
import kotlin.String

/**
 *
 */
public interface IInstance : IResource, IConnectable, IGrantable {
  /**
   * The availability zone the instance was launched in.
   */
  public fun instanceAvailabilityZone(): String

  /**
   * The instance's ID.
   */
  public fun instanceId(): String

  /**
   * Private DNS name for this instance.
   */
  public fun instancePrivateDnsName(): String

  /**
   * Private IP for this instance.
   */
  public fun instancePrivateIp(): String

  /**
   * Publicly-routable DNS name for this instance.
   *
   * (May be an empty string if the instance does not have a public name).
   */
  public fun instancePublicDnsName(): String

  /**
   * Publicly-routable IP  address for this instance.
   *
   * (May be an empty string if the instance does not have a public IP).
   */
  public fun instancePublicIp(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.IInstance,
  ) : CdkObject(cdkObject), IInstance {
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
     * The network connections associated with this resource.
     */
    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

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
     * The principal to grant permissions to.
     */
    override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    /**
     * The availability zone the instance was launched in.
     */
    override fun instanceAvailabilityZone(): String = unwrap(this).getInstanceAvailabilityZone()

    /**
     * The instance's ID.
     */
    override fun instanceId(): String = unwrap(this).getInstanceId()

    /**
     * Private DNS name for this instance.
     */
    override fun instancePrivateDnsName(): String = unwrap(this).getInstancePrivateDnsName()

    /**
     * Private IP for this instance.
     */
    override fun instancePrivateIp(): String = unwrap(this).getInstancePrivateIp()

    /**
     * Publicly-routable DNS name for this instance.
     *
     * (May be an empty string if the instance does not have a public name).
     */
    override fun instancePublicDnsName(): String = unwrap(this).getInstancePublicDnsName()

    /**
     * Publicly-routable IP  address for this instance.
     *
     * (May be an empty string if the instance does not have a public IP).
     */
    override fun instancePublicIp(): String = unwrap(this).getInstancePublicIp()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IInstance): IInstance =
        CdkObjectWrappers.wrap(cdkObject) as? IInstance ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IInstance): software.amazon.awscdk.services.ec2.IInstance =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IInstance
  }
}
