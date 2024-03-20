@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3outposts

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This AWS::S3Outposts::Endpoint resource specifies an endpoint and associates it with the
 * specified Outpost.
 *
 * Amazon S3 on Outposts access points simplify managing data access at scale for shared datasets in
 * S3 on Outposts. S3 on Outposts uses endpoints to connect to S3 on Outposts buckets so that you can
 * perform actions within your virtual private cloud (VPC). For more information, see [Accessing S3 on
 * Outposts using VPC-only access
 * points](https://docs.aws.amazon.com/AmazonS3/latest/userguide/AccessingS3Outposts.html) .
 *
 *
 * It can take up to 5 minutes for this resource to be created.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3outposts.*;
 * CfnEndpoint cfnEndpoint = CfnEndpoint.Builder.create(this, "MyCfnEndpoint")
 * .outpostId("outpostId")
 * .securityGroupId("securityGroupId")
 * .subnetId("subnetId")
 * // the properties below are optional
 * .accessType("accessType")
 * .customerOwnedIpv4Pool("customerOwnedIpv4Pool")
 * .failedReason(FailedReasonProperty.builder()
 * .errorCode("errorCode")
 * .message("message")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html)
 */
public open class CfnEndpoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3outposts.CfnEndpoint,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEndpointProps,
  ) :
      this(software.amazon.awscdk.services.s3outposts.CfnEndpoint(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnEndpointProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEndpointProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEndpointProps(props)
  )

  /**
   * The container for the type of connectivity used to access the Amazon S3 on Outposts endpoint.
   */
  public open fun accessType(): String? = unwrap(this).getAccessType()

  /**
   * The container for the type of connectivity used to access the Amazon S3 on Outposts endpoint.
   */
  public open fun accessType(`value`: String) {
    unwrap(this).setAccessType(`value`)
  }

  /**
   * The ARN of the endpoint.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The VPC CIDR block committed by this endpoint.
   */
  public open fun attrCidrBlock(): String = unwrap(this).getAttrCidrBlock()

  /**
   * The time the endpoint was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The ID of the endpoint.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The network interface of the endpoint.
   */
  public open fun attrNetworkInterfaces(): IResolvable =
      unwrap(this).getAttrNetworkInterfaces().let(IResolvable::wrap)

  /**
   * The status of the endpoint.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The ID of the customer-owned IPv4 address pool (CoIP pool) for the endpoint.
   */
  public open fun customerOwnedIpv4Pool(): String? = unwrap(this).getCustomerOwnedIpv4Pool()

  /**
   * The ID of the customer-owned IPv4 address pool (CoIP pool) for the endpoint.
   */
  public open fun customerOwnedIpv4Pool(`value`: String) {
    unwrap(this).setCustomerOwnedIpv4Pool(`value`)
  }

  /**
   * The failure reason, if any, for a create or delete endpoint operation.
   */
  public open fun failedReason(): Any? = unwrap(this).getFailedReason()

  /**
   * The failure reason, if any, for a create or delete endpoint operation.
   */
  public open fun failedReason(`value`: IResolvable) {
    unwrap(this).setFailedReason(`value`.let(IResolvable::unwrap))
  }

  /**
   * The failure reason, if any, for a create or delete endpoint operation.
   */
  public open fun failedReason(`value`: FailedReasonProperty) {
    unwrap(this).setFailedReason(`value`.let(FailedReasonProperty::unwrap))
  }

  /**
   * The failure reason, if any, for a create or delete endpoint operation.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5f2ff391bfccd338cfbbf223cbf665cecd7cd1cc1a8a176e11954563609a9c97")
  public open fun failedReason(`value`: FailedReasonProperty.Builder.() -> Unit): Unit =
      failedReason(FailedReasonProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the Outpost.
   */
  public open fun outpostId(): String = unwrap(this).getOutpostId()

  /**
   * The ID of the Outpost.
   */
  public open fun outpostId(`value`: String) {
    unwrap(this).setOutpostId(`value`)
  }

  /**
   * The ID of the security group used for the endpoint.
   */
  public open fun securityGroupId(): String = unwrap(this).getSecurityGroupId()

  /**
   * The ID of the security group used for the endpoint.
   */
  public open fun securityGroupId(`value`: String) {
    unwrap(this).setSecurityGroupId(`value`)
  }

  /**
   * The ID of the subnet used for the endpoint.
   */
  public open fun subnetId(): String = unwrap(this).getSubnetId()

  /**
   * The ID of the subnet used for the endpoint.
   */
  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3outposts.CfnEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The container for the type of connectivity used to access the Amazon S3 on Outposts endpoint.
     *
     * To use the Amazon VPC , choose `Private` . To use the endpoint with an on-premises network,
     * choose `CustomerOwnedIp` . If you choose `CustomerOwnedIp` , you must also provide the
     * customer-owned IP address pool (CoIP pool).
     *
     *
     * `Private` is the default access type value.
     *
     *
     * Default: - "Private"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-accesstype)
     * @param accessType The container for the type of connectivity used to access the Amazon S3 on
     * Outposts endpoint. 
     */
    public fun accessType(accessType: String)

    /**
     * The ID of the customer-owned IPv4 address pool (CoIP pool) for the endpoint.
     *
     * IP addresses are allocated from this pool for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-customerownedipv4pool)
     * @param customerOwnedIpv4Pool The ID of the customer-owned IPv4 address pool (CoIP pool) for
     * the endpoint. 
     */
    public fun customerOwnedIpv4Pool(customerOwnedIpv4Pool: String)

    /**
     * The failure reason, if any, for a create or delete endpoint operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-failedreason)
     * @param failedReason The failure reason, if any, for a create or delete endpoint operation. 
     */
    public fun failedReason(failedReason: IResolvable)

    /**
     * The failure reason, if any, for a create or delete endpoint operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-failedreason)
     * @param failedReason The failure reason, if any, for a create or delete endpoint operation. 
     */
    public fun failedReason(failedReason: FailedReasonProperty)

    /**
     * The failure reason, if any, for a create or delete endpoint operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-failedreason)
     * @param failedReason The failure reason, if any, for a create or delete endpoint operation. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2bf573711bed046c73a2b08df717f4c5cb82e06bd041f2269347a95c18c91d2")
    public fun failedReason(failedReason: FailedReasonProperty.Builder.() -> Unit)

    /**
     * The ID of the Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-outpostid)
     * @param outpostId The ID of the Outpost. 
     */
    public fun outpostId(outpostId: String)

    /**
     * The ID of the security group used for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-securitygroupid)
     * @param securityGroupId The ID of the security group used for the endpoint. 
     */
    public fun securityGroupId(securityGroupId: String)

    /**
     * The ID of the subnet used for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-subnetid)
     * @param subnetId The ID of the subnet used for the endpoint. 
     */
    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3outposts.CfnEndpoint.Builder =
        software.amazon.awscdk.services.s3outposts.CfnEndpoint.Builder.create(scope, id)

    /**
     * The container for the type of connectivity used to access the Amazon S3 on Outposts endpoint.
     *
     * To use the Amazon VPC , choose `Private` . To use the endpoint with an on-premises network,
     * choose `CustomerOwnedIp` . If you choose `CustomerOwnedIp` , you must also provide the
     * customer-owned IP address pool (CoIP pool).
     *
     *
     * `Private` is the default access type value.
     *
     *
     * Default: - "Private"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-accesstype)
     * @param accessType The container for the type of connectivity used to access the Amazon S3 on
     * Outposts endpoint. 
     */
    override fun accessType(accessType: String) {
      cdkBuilder.accessType(accessType)
    }

    /**
     * The ID of the customer-owned IPv4 address pool (CoIP pool) for the endpoint.
     *
     * IP addresses are allocated from this pool for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-customerownedipv4pool)
     * @param customerOwnedIpv4Pool The ID of the customer-owned IPv4 address pool (CoIP pool) for
     * the endpoint. 
     */
    override fun customerOwnedIpv4Pool(customerOwnedIpv4Pool: String) {
      cdkBuilder.customerOwnedIpv4Pool(customerOwnedIpv4Pool)
    }

    /**
     * The failure reason, if any, for a create or delete endpoint operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-failedreason)
     * @param failedReason The failure reason, if any, for a create or delete endpoint operation. 
     */
    override fun failedReason(failedReason: IResolvable) {
      cdkBuilder.failedReason(failedReason.let(IResolvable::unwrap))
    }

    /**
     * The failure reason, if any, for a create or delete endpoint operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-failedreason)
     * @param failedReason The failure reason, if any, for a create or delete endpoint operation. 
     */
    override fun failedReason(failedReason: FailedReasonProperty) {
      cdkBuilder.failedReason(failedReason.let(FailedReasonProperty::unwrap))
    }

    /**
     * The failure reason, if any, for a create or delete endpoint operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-failedreason)
     * @param failedReason The failure reason, if any, for a create or delete endpoint operation. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2bf573711bed046c73a2b08df717f4c5cb82e06bd041f2269347a95c18c91d2")
    override fun failedReason(failedReason: FailedReasonProperty.Builder.() -> Unit): Unit =
        failedReason(FailedReasonProperty(failedReason))

    /**
     * The ID of the Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-outpostid)
     * @param outpostId The ID of the Outpost. 
     */
    override fun outpostId(outpostId: String) {
      cdkBuilder.outpostId(outpostId)
    }

    /**
     * The ID of the security group used for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-securitygroupid)
     * @param securityGroupId The ID of the security group used for the endpoint. 
     */
    override fun securityGroupId(securityGroupId: String) {
      cdkBuilder.securityGroupId(securityGroupId)
    }

    /**
     * The ID of the subnet used for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-subnetid)
     * @param subnetId The ID of the subnet used for the endpoint. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.s3outposts.CfnEndpoint = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3outposts.CfnEndpoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnEndpoint):
        CfnEndpoint = CfnEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnEndpoint):
        software.amazon.awscdk.services.s3outposts.CfnEndpoint = wrapped.cdkObject
  }

  /**
   * The failure reason, if any, for a create or delete endpoint operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3outposts.*;
   * FailedReasonProperty failedReasonProperty = FailedReasonProperty.builder()
   * .errorCode("errorCode")
   * .message("message")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-endpoint-failedreason.html)
   */
  public interface FailedReasonProperty {
    /**
     * The failure code, if any, for a create or delete endpoint operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-endpoint-failedreason.html#cfn-s3outposts-endpoint-failedreason-errorcode)
     */
    public fun errorCode(): String? = unwrap(this).getErrorCode()

    /**
     * Additional error details describing the endpoint failure and recommended action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-endpoint-failedreason.html#cfn-s3outposts-endpoint-failedreason-message)
     */
    public fun message(): String? = unwrap(this).getMessage()

    /**
     * A builder for [FailedReasonProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param errorCode The failure code, if any, for a create or delete endpoint operation.
       */
      public fun errorCode(errorCode: String)

      /**
       * @param message Additional error details describing the endpoint failure and recommended
       * action.
       */
      public fun message(message: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.FailedReasonProperty.Builder =
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.FailedReasonProperty.builder()

      /**
       * @param errorCode The failure code, if any, for a create or delete endpoint operation.
       */
      override fun errorCode(errorCode: String) {
        cdkBuilder.errorCode(errorCode)
      }

      /**
       * @param message Additional error details describing the endpoint failure and recommended
       * action.
       */
      override fun message(message: String) {
        cdkBuilder.message(message)
      }

      public fun build():
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.FailedReasonProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.FailedReasonProperty,
    ) : CdkObject(cdkObject), FailedReasonProperty {
      /**
       * The failure code, if any, for a create or delete endpoint operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-endpoint-failedreason.html#cfn-s3outposts-endpoint-failedreason-errorcode)
       */
      override fun errorCode(): String? = unwrap(this).getErrorCode()

      /**
       * Additional error details describing the endpoint failure and recommended action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-endpoint-failedreason.html#cfn-s3outposts-endpoint-failedreason-message)
       */
      override fun message(): String? = unwrap(this).getMessage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FailedReasonProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnEndpoint.FailedReasonProperty):
          FailedReasonProperty = CdkObjectWrappers.wrap(cdkObject) as? FailedReasonProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FailedReasonProperty):
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.FailedReasonProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.FailedReasonProperty
    }
  }

  /**
   * The container for the network interface.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3outposts.*;
   * NetworkInterfaceProperty networkInterfaceProperty = NetworkInterfaceProperty.builder()
   * .networkInterfaceId("networkInterfaceId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-endpoint-networkinterface.html)
   */
  public interface NetworkInterfaceProperty {
    /**
     * The ID for the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-endpoint-networkinterface.html#cfn-s3outposts-endpoint-networkinterface-networkinterfaceid)
     */
    public fun networkInterfaceId(): String

    /**
     * A builder for [NetworkInterfaceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param networkInterfaceId The ID for the network interface. 
       */
      public fun networkInterfaceId(networkInterfaceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.NetworkInterfaceProperty.Builder =
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.NetworkInterfaceProperty.builder()

      /**
       * @param networkInterfaceId The ID for the network interface. 
       */
      override fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
      }

      public fun build():
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.NetworkInterfaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.NetworkInterfaceProperty,
    ) : CdkObject(cdkObject), NetworkInterfaceProperty {
      /**
       * The ID for the network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-endpoint-networkinterface.html#cfn-s3outposts-endpoint-networkinterface-networkinterfaceid)
       */
      override fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkInterfaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnEndpoint.NetworkInterfaceProperty):
          NetworkInterfaceProperty = CdkObjectWrappers.wrap(cdkObject) as? NetworkInterfaceProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfaceProperty):
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.NetworkInterfaceProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.NetworkInterfaceProperty
    }
  }
}
