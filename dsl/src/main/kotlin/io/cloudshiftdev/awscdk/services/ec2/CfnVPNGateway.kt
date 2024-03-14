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

public open class CfnVPNGateway internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnVPNGateway,
) : CfnResource(cdkObject), IInspectable, ITaggable {
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
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
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
    init {

    }

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
        wrapped.cdkObject
  }
}
