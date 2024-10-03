@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a virtual private gateway.
 *
 * A virtual private gateway is the endpoint on the VPC side of your VPN connection. You can create
 * a virtual private gateway before creating the VPC itself.
 *
 * For more information, see [AWS Site-to-Site
 * VPN](https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html) in the *AWS Site-to-Site VPN User
 * Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVPNGateway cfnVPNGateway = CfnVPNGateway.Builder.create(this, "MyCfnVPNGateway")
 * .type("type")
 * // the properties below are optional
 * .amazonSideAsn(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html)
 */
public open class CfnVPNGateway(
  cdkObject: software.amazon.awscdk.services.ec2.CfnVPNGateway,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVPNGatewayProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnVPNGateway(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnVPNGatewayProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVPNGatewayProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVPNGatewayProps(props)
  )

  /**
   * The private Autonomous System Number (ASN) for the Amazon side of a BGP session.
   */
  public open fun amazonSideAsn(): Number? = unwrap(this).getAmazonSideAsn()

  /**
   * The private Autonomous System Number (ASN) for the Amazon side of a BGP session.
   */
  public open fun amazonSideAsn(`value`: Number) {
    unwrap(this).setAmazonSideAsn(`value`)
  }

  /**
   * The ID of the VPN gateway.
   */
  public open fun attrVpnGatewayId(): String = unwrap(this).getAttrVpnGatewayId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Any tags assigned to the virtual private gateway.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Any tags assigned to the virtual private gateway.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Any tags assigned to the virtual private gateway.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The type of VPN connection the virtual private gateway supports.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of VPN connection the virtual private gateway supports.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVPNGateway].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The private Autonomous System Number (ASN) for the Amazon side of a BGP session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html#cfn-ec2-vpngateway-amazonsideasn)
     * @param amazonSideAsn The private Autonomous System Number (ASN) for the Amazon side of a BGP
     * session. 
     */
    public fun amazonSideAsn(amazonSideAsn: Number)

    /**
     * Any tags assigned to the virtual private gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html#cfn-ec2-vpngateway-tags)
     * @param tags Any tags assigned to the virtual private gateway. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Any tags assigned to the virtual private gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html#cfn-ec2-vpngateway-tags)
     * @param tags Any tags assigned to the virtual private gateway. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of VPN connection the virtual private gateway supports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html#cfn-ec2-vpngateway-type)
     * @param type The type of VPN connection the virtual private gateway supports. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPNGateway.Builder =
        software.amazon.awscdk.services.ec2.CfnVPNGateway.Builder.create(scope, id)

    /**
     * The private Autonomous System Number (ASN) for the Amazon side of a BGP session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html#cfn-ec2-vpngateway-amazonsideasn)
     * @param amazonSideAsn The private Autonomous System Number (ASN) for the Amazon side of a BGP
     * session. 
     */
    override fun amazonSideAsn(amazonSideAsn: Number) {
      cdkBuilder.amazonSideAsn(amazonSideAsn)
    }

    /**
     * Any tags assigned to the virtual private gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html#cfn-ec2-vpngateway-tags)
     * @param tags Any tags assigned to the virtual private gateway. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Any tags assigned to the virtual private gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html#cfn-ec2-vpngateway-tags)
     * @param tags Any tags assigned to the virtual private gateway. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of VPN connection the virtual private gateway supports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html#cfn-ec2-vpngateway-type)
     * @param type The type of VPN connection the virtual private gateway supports. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPNGateway = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVPNGateway.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPNGateway {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPNGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNGateway): CfnVPNGateway =
        CfnVPNGateway(cdkObject)

    internal fun unwrap(wrapped: CfnVPNGateway): software.amazon.awscdk.services.ec2.CfnVPNGateway =
        wrapped.cdkObject as software.amazon.awscdk.services.ec2.CfnVPNGateway
  }
}
