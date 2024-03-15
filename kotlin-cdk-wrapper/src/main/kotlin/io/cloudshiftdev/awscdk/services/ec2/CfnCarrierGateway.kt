@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a carrier gateway.
 *
 * For more information about carrier gateways, see [Carrier
 * gateways](https://docs.aws.amazon.com/wavelength/latest/developerguide/how-wavelengths-work.html#wavelength-carrier-gateway)
 * in the *AWS Wavelength Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnCarrierGateway cfnCarrierGateway = CfnCarrierGateway.Builder.create(this,
 * "MyCfnCarrierGateway")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-carriergateway.html)
 */
public open class CfnCarrierGateway internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnCarrierGateway,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ID of the carrier gateway.
   */
  public open fun attrCarrierGatewayId(): String = unwrap(this).getAttrCarrierGatewayId()

  /**
   * The AWS account ID of the owner of the carrier gateway.
   */
  public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

  /**
   * The state of the carrier gateway.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

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
   * The tags assigned to the carrier gateway.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags assigned to the carrier gateway.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags assigned to the carrier gateway.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the VPC associated with the carrier gateway.
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The ID of the VPC associated with the carrier gateway.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnCarrierGateway].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The tags assigned to the carrier gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-carriergateway.html#cfn-ec2-carriergateway-tags)
     * @param tags The tags assigned to the carrier gateway. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags assigned to the carrier gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-carriergateway.html#cfn-ec2-carriergateway-tags)
     * @param tags The tags assigned to the carrier gateway. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the VPC associated with the carrier gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-carriergateway.html#cfn-ec2-carriergateway-vpcid)
     * @param vpcId The ID of the VPC associated with the carrier gateway. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnCarrierGateway.Builder =
        software.amazon.awscdk.services.ec2.CfnCarrierGateway.Builder.create(scope, id)

    /**
     * The tags assigned to the carrier gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-carriergateway.html#cfn-ec2-carriergateway-tags)
     * @param tags The tags assigned to the carrier gateway. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags assigned to the carrier gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-carriergateway.html#cfn-ec2-carriergateway-tags)
     * @param tags The tags assigned to the carrier gateway. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the VPC associated with the carrier gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-carriergateway.html#cfn-ec2-carriergateway-vpcid)
     * @param vpcId The ID of the VPC associated with the carrier gateway. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnCarrierGateway = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnCarrierGateway.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCarrierGateway {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCarrierGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnCarrierGateway):
        CfnCarrierGateway = CfnCarrierGateway(cdkObject)

    internal fun unwrap(wrapped: CfnCarrierGateway):
        software.amazon.awscdk.services.ec2.CfnCarrierGateway = wrapped.cdkObject
  }
}
