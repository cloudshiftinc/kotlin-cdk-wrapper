@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Subnet requested for allocation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * RequestedSubnet requestedSubnet = RequestedSubnet.builder()
 * .availabilityZone("availabilityZone")
 * .configuration(SubnetConfiguration.builder()
 * .name("name")
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * // the properties below are optional
 * .cidrMask(123)
 * .ipv6AssignAddressOnCreation(false)
 * .mapPublicIpOnLaunch(false)
 * .reserved(false)
 * .build())
 * .subnetConstructId("subnetConstructId")
 * .build();
 * ```
 */
public interface RequestedSubnet {
  /**
   * The availability zone for the subnet.
   */
  public fun availabilityZone(): String

  /**
   * Specify configuration parameters for a single subnet group in a VPC.
   */
  public fun configuration(): SubnetConfiguration

  /**
   * Id for the Subnet construct.
   */
  public fun subnetConstructId(): String

  /**
   * A builder for [RequestedSubnet]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZone The availability zone for the subnet. 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param configuration Specify configuration parameters for a single subnet group in a VPC. 
     */
    public fun configuration(configuration: SubnetConfiguration)

    /**
     * @param configuration Specify configuration parameters for a single subnet group in a VPC. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3f87569b62eacfcfcda010420159d9d3ceee882f942f9f1a29533e4aac952cc")
    public fun configuration(configuration: SubnetConfiguration.Builder.() -> Unit)

    /**
     * @param subnetConstructId Id for the Subnet construct. 
     */
    public fun subnetConstructId(subnetConstructId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.RequestedSubnet.Builder =
        software.amazon.awscdk.services.ec2.RequestedSubnet.builder()

    /**
     * @param availabilityZone The availability zone for the subnet. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param configuration Specify configuration parameters for a single subnet group in a VPC. 
     */
    override fun configuration(configuration: SubnetConfiguration) {
      cdkBuilder.configuration(configuration.let(SubnetConfiguration::unwrap))
    }

    /**
     * @param configuration Specify configuration parameters for a single subnet group in a VPC. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3f87569b62eacfcfcda010420159d9d3ceee882f942f9f1a29533e4aac952cc")
    override fun configuration(configuration: SubnetConfiguration.Builder.() -> Unit): Unit =
        configuration(SubnetConfiguration(configuration))

    /**
     * @param subnetConstructId Id for the Subnet construct. 
     */
    override fun subnetConstructId(subnetConstructId: String) {
      cdkBuilder.subnetConstructId(subnetConstructId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.RequestedSubnet = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.RequestedSubnet,
  ) : CdkObject(cdkObject), RequestedSubnet {
    /**
     * The availability zone for the subnet.
     */
    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    /**
     * Specify configuration parameters for a single subnet group in a VPC.
     */
    override fun configuration(): SubnetConfiguration =
        unwrap(this).getConfiguration().let(SubnetConfiguration::wrap)

    /**
     * Id for the Subnet construct.
     */
    override fun subnetConstructId(): String = unwrap(this).getSubnetConstructId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RequestedSubnet {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.RequestedSubnet):
        RequestedSubnet = CdkObjectWrappers.wrap(cdkObject) as? RequestedSubnet ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RequestedSubnet):
        software.amazon.awscdk.services.ec2.RequestedSubnet = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.RequestedSubnet
  }
}
