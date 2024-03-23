@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an EC2 Instance Connect Endpoint.
 *
 * An EC2 Instance Connect Endpoint allows you to connect to an instance, without requiring the
 * instance to have a public IPv4 address. For more information, see [Connect to your instances without
 * requiring a public IPv4 address using EC2 Instance Connect
 * Endpoint](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Connect-using-EC2-Instance-Connect-Endpoint.html)
 * in the *Amazon EC2 User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnInstanceConnectEndpoint cfnInstanceConnectEndpoint =
 * CfnInstanceConnectEndpoint.Builder.create(this, "MyCfnInstanceConnectEndpoint")
 * .subnetId("subnetId")
 * // the properties below are optional
 * .clientToken("clientToken")
 * .preserveClientIp(false)
 * .securityGroupIds(List.of("securityGroupIds"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html)
 */
public open class CfnInstanceConnectEndpoint(
  cdkObject: software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpoint,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInstanceConnectEndpointProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpoint(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnInstanceConnectEndpointProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInstanceConnectEndpointProps.Builder.() -> Unit,
  ) : this(scope, id, CfnInstanceConnectEndpointProps(props)
  )

  /**
   * The ID of the EC2 Instance Connect Endpoint.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
   */
  public open fun clientToken(): String? = unwrap(this).getClientToken()

  /**
   * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
   */
  public open fun clientToken(`value`: String) {
    unwrap(this).setClientToken(`value`)
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
   * Indicates whether your client's IP address is preserved as the source.
   *
   * The value is `true` or `false` .
   */
  public open fun preserveClientIp(): Any? = unwrap(this).getPreserveClientIp()

  /**
   * Indicates whether your client's IP address is preserved as the source.
   *
   * The value is `true` or `false` .
   */
  public open fun preserveClientIp(`value`: Boolean) {
    unwrap(this).setPreserveClientIp(`value`)
  }

  /**
   * Indicates whether your client's IP address is preserved as the source.
   *
   * The value is `true` or `false` .
   */
  public open fun preserveClientIp(`value`: IResolvable) {
    unwrap(this).setPreserveClientIp(`value`.let(IResolvable::unwrap))
  }

  /**
   * One or more security groups to associate with the endpoint.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * One or more security groups to associate with the endpoint.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * One or more security groups to associate with the endpoint.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * The ID of the subnet in which to create the EC2 Instance Connect Endpoint.
   */
  public open fun subnetId(): String = unwrap(this).getSubnetId()

  /**
   * The ID of the subnet in which to create the EC2 Instance Connect Endpoint.
   */
  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  /**
   * The tags to apply to the EC2 Instance Connect Endpoint during creation.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags to apply to the EC2 Instance Connect Endpoint during creation.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to apply to the EC2 Instance Connect Endpoint during creation.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnInstanceConnectEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-clienttoken)
     * @param clientToken Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. 
     */
    public fun clientToken(clientToken: String)

    /**
     * Indicates whether your client's IP address is preserved as the source. The value is `true` or
     * `false` .
     *
     * * If `true` , your client's IP address is used when you connect to a resource.
     * * If `false` , the elastic network interface IP address is used when you connect to a
     * resource.
     *
     * Default: `true`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-preserveclientip)
     * @param preserveClientIp Indicates whether your client's IP address is preserved as the
     * source. The value is `true` or `false` . 
     */
    public fun preserveClientIp(preserveClientIp: Boolean)

    /**
     * Indicates whether your client's IP address is preserved as the source. The value is `true` or
     * `false` .
     *
     * * If `true` , your client's IP address is used when you connect to a resource.
     * * If `false` , the elastic network interface IP address is used when you connect to a
     * resource.
     *
     * Default: `true`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-preserveclientip)
     * @param preserveClientIp Indicates whether your client's IP address is preserved as the
     * source. The value is `true` or `false` . 
     */
    public fun preserveClientIp(preserveClientIp: IResolvable)

    /**
     * One or more security groups to associate with the endpoint.
     *
     * If you don't specify a security group, the default security group for your VPC will be
     * associated with the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-securitygroupids)
     * @param securityGroupIds One or more security groups to associate with the endpoint. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * One or more security groups to associate with the endpoint.
     *
     * If you don't specify a security group, the default security group for your VPC will be
     * associated with the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-securitygroupids)
     * @param securityGroupIds One or more security groups to associate with the endpoint. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * The ID of the subnet in which to create the EC2 Instance Connect Endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-subnetid)
     * @param subnetId The ID of the subnet in which to create the EC2 Instance Connect Endpoint. 
     */
    public fun subnetId(subnetId: String)

    /**
     * The tags to apply to the EC2 Instance Connect Endpoint during creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-tags)
     * @param tags The tags to apply to the EC2 Instance Connect Endpoint during creation. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to apply to the EC2 Instance Connect Endpoint during creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-tags)
     * @param tags The tags to apply to the EC2 Instance Connect Endpoint during creation. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpoint.Builder =
        software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpoint.Builder.create(scope, id)

    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-clienttoken)
     * @param clientToken Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. 
     */
    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    /**
     * Indicates whether your client's IP address is preserved as the source. The value is `true` or
     * `false` .
     *
     * * If `true` , your client's IP address is used when you connect to a resource.
     * * If `false` , the elastic network interface IP address is used when you connect to a
     * resource.
     *
     * Default: `true`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-preserveclientip)
     * @param preserveClientIp Indicates whether your client's IP address is preserved as the
     * source. The value is `true` or `false` . 
     */
    override fun preserveClientIp(preserveClientIp: Boolean) {
      cdkBuilder.preserveClientIp(preserveClientIp)
    }

    /**
     * Indicates whether your client's IP address is preserved as the source. The value is `true` or
     * `false` .
     *
     * * If `true` , your client's IP address is used when you connect to a resource.
     * * If `false` , the elastic network interface IP address is used when you connect to a
     * resource.
     *
     * Default: `true`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-preserveclientip)
     * @param preserveClientIp Indicates whether your client's IP address is preserved as the
     * source. The value is `true` or `false` . 
     */
    override fun preserveClientIp(preserveClientIp: IResolvable) {
      cdkBuilder.preserveClientIp(preserveClientIp.let(IResolvable::unwrap))
    }

    /**
     * One or more security groups to associate with the endpoint.
     *
     * If you don't specify a security group, the default security group for your VPC will be
     * associated with the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-securitygroupids)
     * @param securityGroupIds One or more security groups to associate with the endpoint. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * One or more security groups to associate with the endpoint.
     *
     * If you don't specify a security group, the default security group for your VPC will be
     * associated with the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-securitygroupids)
     * @param securityGroupIds One or more security groups to associate with the endpoint. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * The ID of the subnet in which to create the EC2 Instance Connect Endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-subnetid)
     * @param subnetId The ID of the subnet in which to create the EC2 Instance Connect Endpoint. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * The tags to apply to the EC2 Instance Connect Endpoint during creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-tags)
     * @param tags The tags to apply to the EC2 Instance Connect Endpoint during creation. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to apply to the EC2 Instance Connect Endpoint during creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-tags)
     * @param tags The tags to apply to the EC2 Instance Connect Endpoint during creation. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstanceConnectEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstanceConnectEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpoint):
        CfnInstanceConnectEndpoint = CfnInstanceConnectEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceConnectEndpoint):
        software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpoint = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpoint
  }
}
