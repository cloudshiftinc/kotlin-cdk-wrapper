@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a Redshift-managed VPC endpoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.redshift.*;
 * CfnEndpointAccess cfnEndpointAccess = CfnEndpointAccess.Builder.create(this,
 * "MyCfnEndpointAccess")
 * .clusterIdentifier("clusterIdentifier")
 * .endpointName("endpointName")
 * .subnetGroupName("subnetGroupName")
 * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
 * // the properties below are optional
 * .resourceOwner("resourceOwner")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html)
 */
public open class CfnEndpointAccess internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.redshift.CfnEndpointAccess,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEndpointAccessProps,
  ) :
      this(software.amazon.awscdk.services.redshift.CfnEndpointAccess(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnEndpointAccessProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEndpointAccessProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEndpointAccessProps(props)
  )

  /**
   * The DNS address of the endpoint.
   */
  public open fun attrAddress(): String = unwrap(this).getAttrAddress()

  /**
   * The time (UTC) that the endpoint was created.
   */
  public open fun attrEndpointCreateTime(): String = unwrap(this).getAttrEndpointCreateTime()

  /**
   * The status of the endpoint.
   */
  public open fun attrEndpointStatus(): String = unwrap(this).getAttrEndpointStatus()

  /**
   * The port number on which the cluster accepts incoming connections.
   */
  public open fun attrPort(): Number = unwrap(this).getAttrPort()

  /**
   * The connection endpoint for connecting to an Amazon Redshift cluster through the proxy.
   */
  public open fun attrVpcEndpoint(): IResolvable =
      unwrap(this).getAttrVpcEndpoint().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrVpcEndpointNetworkInterfaces(): IResolvable =
      unwrap(this).getAttrVpcEndpointNetworkInterfaces().let(IResolvable::wrap)

  /**
   * The connection endpoint ID for connecting an Amazon Redshift cluster through the proxy.
   */
  public open fun attrVpcEndpointVpcEndpointId(): String =
      unwrap(this).getAttrVpcEndpointVpcEndpointId()

  /**
   * The VPC identifier that the endpoint is associated.
   */
  public open fun attrVpcEndpointVpcId(): String = unwrap(this).getAttrVpcEndpointVpcId()

  /**
   * The security groups associated with the endpoint.
   */
  public open fun attrVpcSecurityGroups(): IResolvable =
      unwrap(this).getAttrVpcSecurityGroups().let(IResolvable::wrap)

  /**
   * The cluster identifier of the cluster associated with the endpoint.
   */
  public open fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

  /**
   * The cluster identifier of the cluster associated with the endpoint.
   */
  public open fun clusterIdentifier(`value`: String) {
    unwrap(this).setClusterIdentifier(`value`)
  }

  /**
   * The name of the endpoint.
   */
  public open fun endpointName(): String = unwrap(this).getEndpointName()

  /**
   * The name of the endpoint.
   */
  public open fun endpointName(`value`: String) {
    unwrap(this).setEndpointName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The AWS account ID of the owner of the cluster.
   */
  public open fun resourceOwner(): String? = unwrap(this).getResourceOwner()

  /**
   * The AWS account ID of the owner of the cluster.
   */
  public open fun resourceOwner(`value`: String) {
    unwrap(this).setResourceOwner(`value`)
  }

  /**
   * The subnet group name where Amazon Redshift chooses to deploy the endpoint.
   */
  public open fun subnetGroupName(): String = unwrap(this).getSubnetGroupName()

  /**
   * The subnet group name where Amazon Redshift chooses to deploy the endpoint.
   */
  public open fun subnetGroupName(`value`: String) {
    unwrap(this).setSubnetGroupName(`value`)
  }

  /**
   * The security group that defines the ports, protocols, and sources for inbound traffic that you
   * are authorizing into your endpoint.
   */
  public open fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds()

  /**
   * The security group that defines the ports, protocols, and sources for inbound traffic that you
   * are authorizing into your endpoint.
   */
  public open fun vpcSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroupIds(`value`)
  }

  /**
   * The security group that defines the ports, protocols, and sources for inbound traffic that you
   * are authorizing into your endpoint.
   */
  public open fun vpcSecurityGroupIds(vararg `value`: String): Unit =
      vpcSecurityGroupIds(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.redshift.CfnEndpointAccess].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The cluster identifier of the cluster associated with the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-clusteridentifier)
     * @param clusterIdentifier The cluster identifier of the cluster associated with the endpoint. 
     */
    public fun clusterIdentifier(clusterIdentifier: String)

    /**
     * The name of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-endpointname)
     * @param endpointName The name of the endpoint. 
     */
    public fun endpointName(endpointName: String)

    /**
     * The AWS account ID of the owner of the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-resourceowner)
     * @param resourceOwner The AWS account ID of the owner of the cluster. 
     */
    public fun resourceOwner(resourceOwner: String)

    /**
     * The subnet group name where Amazon Redshift chooses to deploy the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-subnetgroupname)
     * @param subnetGroupName The subnet group name where Amazon Redshift chooses to deploy the
     * endpoint. 
     */
    public fun subnetGroupName(subnetGroupName: String)

    /**
     * The security group that defines the ports, protocols, and sources for inbound traffic that
     * you are authorizing into your endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds The security group that defines the ports, protocols, and sources
     * for inbound traffic that you are authorizing into your endpoint. 
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * The security group that defines the ports, protocols, and sources for inbound traffic that
     * you are authorizing into your endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds The security group that defines the ports, protocols, and sources
     * for inbound traffic that you are authorizing into your endpoint. 
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshift.CfnEndpointAccess.Builder =
        software.amazon.awscdk.services.redshift.CfnEndpointAccess.Builder.create(scope, id)

    /**
     * The cluster identifier of the cluster associated with the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-clusteridentifier)
     * @param clusterIdentifier The cluster identifier of the cluster associated with the endpoint. 
     */
    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    /**
     * The name of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-endpointname)
     * @param endpointName The name of the endpoint. 
     */
    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    /**
     * The AWS account ID of the owner of the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-resourceowner)
     * @param resourceOwner The AWS account ID of the owner of the cluster. 
     */
    override fun resourceOwner(resourceOwner: String) {
      cdkBuilder.resourceOwner(resourceOwner)
    }

    /**
     * The subnet group name where Amazon Redshift chooses to deploy the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-subnetgroupname)
     * @param subnetGroupName The subnet group name where Amazon Redshift chooses to deploy the
     * endpoint. 
     */
    override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    /**
     * The security group that defines the ports, protocols, and sources for inbound traffic that
     * you are authorizing into your endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds The security group that defines the ports, protocols, and sources
     * for inbound traffic that you are authorizing into your endpoint. 
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * The security group that defines the ports, protocols, and sources for inbound traffic that
     * you are authorizing into your endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds The security group that defines the ports, protocols, and sources
     * for inbound traffic that you are authorizing into your endpoint. 
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.redshift.CfnEndpointAccess =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.redshift.CfnEndpointAccess.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEndpointAccess {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEndpointAccess(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnEndpointAccess):
        CfnEndpointAccess = CfnEndpointAccess(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointAccess):
        software.amazon.awscdk.services.redshift.CfnEndpointAccess = wrapped.cdkObject
  }

  /**
   * Describes a network interface.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.redshift.*;
   * NetworkInterfaceProperty networkInterfaceProperty = NetworkInterfaceProperty.builder()
   * .availabilityZone("availabilityZone")
   * .networkInterfaceId("networkInterfaceId")
   * .privateIpAddress("privateIpAddress")
   * .subnetId("subnetId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-networkinterface.html)
   */
  public interface NetworkInterfaceProperty {
    /**
     * The Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-networkinterface.html#cfn-redshift-endpointaccess-networkinterface-availabilityzone)
     */
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The network interface identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-networkinterface.html#cfn-redshift-endpointaccess-networkinterface-networkinterfaceid)
     */
    public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    /**
     * The IPv4 address of the network interface within the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-networkinterface.html#cfn-redshift-endpointaccess-networkinterface-privateipaddress)
     */
    public fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

    /**
     * The subnet identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-networkinterface.html#cfn-redshift-endpointaccess-networkinterface-subnetid)
     */
    public fun subnetId(): String? = unwrap(this).getSubnetId()

    /**
     * A builder for [NetworkInterfaceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZone The Availability Zone.
       */
      public fun availabilityZone(availabilityZone: String)

      /**
       * @param networkInterfaceId The network interface identifier.
       */
      public fun networkInterfaceId(networkInterfaceId: String)

      /**
       * @param privateIpAddress The IPv4 address of the network interface within the subnet.
       */
      public fun privateIpAddress(privateIpAddress: String)

      /**
       * @param subnetId The subnet identifier.
       */
      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.NetworkInterfaceProperty.Builder
          =
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.NetworkInterfaceProperty.builder()

      /**
       * @param availabilityZone The Availability Zone.
       */
      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      /**
       * @param networkInterfaceId The network interface identifier.
       */
      override fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
      }

      /**
       * @param privateIpAddress The IPv4 address of the network interface within the subnet.
       */
      override fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
      }

      /**
       * @param subnetId The subnet identifier.
       */
      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build():
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.NetworkInterfaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.NetworkInterfaceProperty,
    ) : CdkObject(cdkObject), NetworkInterfaceProperty {
      /**
       * The Availability Zone.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-networkinterface.html#cfn-redshift-endpointaccess-networkinterface-availabilityzone)
       */
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      /**
       * The network interface identifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-networkinterface.html#cfn-redshift-endpointaccess-networkinterface-networkinterfaceid)
       */
      override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

      /**
       * The IPv4 address of the network interface within the subnet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-networkinterface.html#cfn-redshift-endpointaccess-networkinterface-privateipaddress)
       */
      override fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

      /**
       * The subnet identifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-networkinterface.html#cfn-redshift-endpointaccess-networkinterface-subnetid)
       */
      override fun subnetId(): String? = unwrap(this).getSubnetId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkInterfaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnEndpointAccess.NetworkInterfaceProperty):
          NetworkInterfaceProperty = CdkObjectWrappers.wrap(cdkObject) as? NetworkInterfaceProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfaceProperty):
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.NetworkInterfaceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.NetworkInterfaceProperty
    }
  }

  /**
   * The connection endpoint for connecting to an Amazon Redshift cluster through the proxy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.redshift.*;
   * VpcEndpointProperty vpcEndpointProperty = VpcEndpointProperty.builder()
   * .networkInterfaces(List.of(NetworkInterfaceProperty.builder()
   * .availabilityZone("availabilityZone")
   * .networkInterfaceId("networkInterfaceId")
   * .privateIpAddress("privateIpAddress")
   * .subnetId("subnetId")
   * .build()))
   * .vpcEndpointId("vpcEndpointId")
   * .vpcId("vpcId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-vpcendpoint.html)
   */
  public interface VpcEndpointProperty {
    /**
     * One or more network interfaces of the endpoint.
     *
     * Also known as an interface endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-vpcendpoint.html#cfn-redshift-endpointaccess-vpcendpoint-networkinterfaces)
     */
    public fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

    /**
     * The connection endpoint ID for connecting an Amazon Redshift cluster through the proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-vpcendpoint.html#cfn-redshift-endpointaccess-vpcendpoint-vpcendpointid)
     */
    public fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

    /**
     * The VPC identifier that the endpoint is associated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-vpcendpoint.html#cfn-redshift-endpointaccess-vpcendpoint-vpcid)
     */
    public fun vpcId(): String? = unwrap(this).getVpcId()

    /**
     * A builder for [VpcEndpointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param networkInterfaces One or more network interfaces of the endpoint.
       * Also known as an interface endpoint.
       */
      public fun networkInterfaces(networkInterfaces: IResolvable)

      /**
       * @param networkInterfaces One or more network interfaces of the endpoint.
       * Also known as an interface endpoint.
       */
      public fun networkInterfaces(networkInterfaces: List<Any>)

      /**
       * @param networkInterfaces One or more network interfaces of the endpoint.
       * Also known as an interface endpoint.
       */
      public fun networkInterfaces(vararg networkInterfaces: Any)

      /**
       * @param vpcEndpointId The connection endpoint ID for connecting an Amazon Redshift cluster
       * through the proxy.
       */
      public fun vpcEndpointId(vpcEndpointId: String)

      /**
       * @param vpcId The VPC identifier that the endpoint is associated.
       */
      public fun vpcId(vpcId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcEndpointProperty.Builder =
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcEndpointProperty.builder()

      /**
       * @param networkInterfaces One or more network interfaces of the endpoint.
       * Also known as an interface endpoint.
       */
      override fun networkInterfaces(networkInterfaces: IResolvable) {
        cdkBuilder.networkInterfaces(networkInterfaces.let(IResolvable::unwrap))
      }

      /**
       * @param networkInterfaces One or more network interfaces of the endpoint.
       * Also known as an interface endpoint.
       */
      override fun networkInterfaces(networkInterfaces: List<Any>) {
        cdkBuilder.networkInterfaces(networkInterfaces)
      }

      /**
       * @param networkInterfaces One or more network interfaces of the endpoint.
       * Also known as an interface endpoint.
       */
      override fun networkInterfaces(vararg networkInterfaces: Any): Unit =
          networkInterfaces(networkInterfaces.toList())

      /**
       * @param vpcEndpointId The connection endpoint ID for connecting an Amazon Redshift cluster
       * through the proxy.
       */
      override fun vpcEndpointId(vpcEndpointId: String) {
        cdkBuilder.vpcEndpointId(vpcEndpointId)
      }

      /**
       * @param vpcId The VPC identifier that the endpoint is associated.
       */
      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build():
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcEndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcEndpointProperty,
    ) : CdkObject(cdkObject), VpcEndpointProperty {
      /**
       * One or more network interfaces of the endpoint.
       *
       * Also known as an interface endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-vpcendpoint.html#cfn-redshift-endpointaccess-vpcendpoint-networkinterfaces)
       */
      override fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

      /**
       * The connection endpoint ID for connecting an Amazon Redshift cluster through the proxy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-vpcendpoint.html#cfn-redshift-endpointaccess-vpcendpoint-vpcendpointid)
       */
      override fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

      /**
       * The VPC identifier that the endpoint is associated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-vpcendpoint.html#cfn-redshift-endpointaccess-vpcendpoint-vpcid)
       */
      override fun vpcId(): String? = unwrap(this).getVpcId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcEndpointProperty):
          VpcEndpointProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcEndpointProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcEndpointProperty):
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcEndpointProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcEndpointProperty
    }
  }

  /**
   * The security groups associated with the endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.redshift.*;
   * VpcSecurityGroupProperty vpcSecurityGroupProperty = VpcSecurityGroupProperty.builder()
   * .status("status")
   * .vpcSecurityGroupId("vpcSecurityGroupId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-vpcsecuritygroup.html)
   */
  public interface VpcSecurityGroupProperty {
    /**
     * The status of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-vpcsecuritygroup.html#cfn-redshift-endpointaccess-vpcsecuritygroup-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * The identifier of the VPC security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-vpcsecuritygroup.html#cfn-redshift-endpointaccess-vpcsecuritygroup-vpcsecuritygroupid)
     */
    public fun vpcSecurityGroupId(): String? = unwrap(this).getVpcSecurityGroupId()

    /**
     * A builder for [VpcSecurityGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param status The status of the endpoint.
       */
      public fun status(status: String)

      /**
       * @param vpcSecurityGroupId The identifier of the VPC security group.
       */
      public fun vpcSecurityGroupId(vpcSecurityGroupId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcSecurityGroupProperty.Builder
          =
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcSecurityGroupProperty.builder()

      /**
       * @param status The status of the endpoint.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      /**
       * @param vpcSecurityGroupId The identifier of the VPC security group.
       */
      override fun vpcSecurityGroupId(vpcSecurityGroupId: String) {
        cdkBuilder.vpcSecurityGroupId(vpcSecurityGroupId)
      }

      public fun build():
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcSecurityGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcSecurityGroupProperty,
    ) : CdkObject(cdkObject), VpcSecurityGroupProperty {
      /**
       * The status of the endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-vpcsecuritygroup.html#cfn-redshift-endpointaccess-vpcsecuritygroup-status)
       */
      override fun status(): String? = unwrap(this).getStatus()

      /**
       * The identifier of the VPC security group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-vpcsecuritygroup.html#cfn-redshift-endpointaccess-vpcsecuritygroup-vpcsecuritygroupid)
       */
      override fun vpcSecurityGroupId(): String? = unwrap(this).getVpcSecurityGroupId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcSecurityGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcSecurityGroupProperty):
          VpcSecurityGroupProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcSecurityGroupProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcSecurityGroupProperty):
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcSecurityGroupProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcSecurityGroupProperty
    }
  }
}
