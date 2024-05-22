@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.IDependable
import io.cloudshiftdev.constructs.Node
import kotlin.String

/**
 *
 */
public interface IPublicSubnet : ISubnet {
  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.IPublicSubnet,
  ) : CdkObject(cdkObject), IPublicSubnet {
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
     * Associate a Network ACL with this subnet.
     *
     * @param id 
     * @param acl The Network ACL to associate. 
     */
    override fun associateNetworkAcl(id: String, acl: INetworkAcl) {
      unwrap(this).associateNetworkAcl(id, acl.let(INetworkAcl.Companion::unwrap))
    }

    /**
     * The Availability Zone the subnet is located in.
     */
    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

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
     * Dependable that can be depended upon to force internet connectivity established on the VPC.
     */
    override fun internetConnectivityEstablished(): IDependable =
        unwrap(this).getInternetConnectivityEstablished().let(IDependable::wrap)

    /**
     * The IPv4 CIDR block for this subnet.
     */
    override fun ipv4CidrBlock(): String = unwrap(this).getIpv4CidrBlock()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The route table for this subnet.
     */
    override fun routeTable(): IRouteTable = unwrap(this).getRouteTable().let(IRouteTable::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * The subnetId for this particular subnet.
     */
    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IPublicSubnet): IPublicSubnet =
        CdkObjectWrappers.wrap(cdkObject) as? IPublicSubnet ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPublicSubnet): software.amazon.awscdk.services.ec2.IPublicSubnet =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IPublicSubnet
  }
}
