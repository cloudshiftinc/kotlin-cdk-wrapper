@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.collections.List

/**
 * The interface of the Accelerator.
 */
public interface IAccelerator : IResource {
  /**
   * The ARN of the accelerator.
   */
  public fun acceleratorArn(): String

  /**
   * The Domain Name System (DNS) name that Global Accelerator creates that points to your
   * accelerator's static IP addresses.
   */
  public fun dnsName(): String

  /**
   * The DNS name that Global Accelerator creates that points to a dual-stack accelerator's four
   * static IP addresses: two IPv4 addresses and two IPv6 addresses.
   */
  public fun dualStackDnsName(): String? = unwrap(this).getDualStackDnsName()

  /**
   * The array of IPv4 addresses in the IP address set.
   *
   * An IP address set can have a maximum of two IP addresses.
   */
  public fun ipv4Addresses(): List<String> = unwrap(this).getIpv4Addresses() ?: emptyList()

  /**
   * The array of IPv6 addresses in the IP address set.
   *
   * An IP address set can have a maximum of two IP addresses.
   */
  public fun ipv6Addresses(): List<String> = unwrap(this).getIpv6Addresses() ?: emptyList()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.globalaccelerator.IAccelerator,
  ) : CdkObject(cdkObject),
      IAccelerator {
    /**
     * The ARN of the accelerator.
     */
    override fun acceleratorArn(): String = unwrap(this).getAcceleratorArn()

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
     * The Domain Name System (DNS) name that Global Accelerator creates that points to your
     * accelerator's static IP addresses.
     */
    override fun dnsName(): String = unwrap(this).getDnsName()

    /**
     * The DNS name that Global Accelerator creates that points to a dual-stack accelerator's four
     * static IP addresses: two IPv4 addresses and two IPv6 addresses.
     */
    override fun dualStackDnsName(): String? = unwrap(this).getDualStackDnsName()

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
     * The array of IPv4 addresses in the IP address set.
     *
     * An IP address set can have a maximum of two IP addresses.
     */
    override fun ipv4Addresses(): List<String> = unwrap(this).getIpv4Addresses() ?: emptyList()

    /**
     * The array of IPv6 addresses in the IP address set.
     *
     * An IP address set can have a maximum of two IP addresses.
     */
    override fun ipv6Addresses(): List<String> = unwrap(this).getIpv6Addresses() ?: emptyList()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.IAccelerator):
        IAccelerator = CdkObjectWrappers.wrap(cdkObject) as? IAccelerator ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAccelerator):
        software.amazon.awscdk.services.globalaccelerator.IAccelerator = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.globalaccelerator.IAccelerator
  }
}
