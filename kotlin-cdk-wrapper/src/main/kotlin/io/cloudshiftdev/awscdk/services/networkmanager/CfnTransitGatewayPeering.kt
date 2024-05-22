@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

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
 * Creates a transit gateway peering connection.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnTransitGatewayPeering cfnTransitGatewayPeering = CfnTransitGatewayPeering.Builder.create(this,
 * "MyCfnTransitGatewayPeering")
 * .coreNetworkId("coreNetworkId")
 * .transitGatewayArn("transitGatewayArn")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewaypeering.html)
 */
public open class CfnTransitGatewayPeering(
  cdkObject: software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeering,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransitGatewayPeeringProps,
  ) :
      this(software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeering(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTransitGatewayPeeringProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransitGatewayPeeringProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTransitGatewayPeeringProps(props)
  )

  /**
   * The ARN of the core network.
   */
  public open fun attrCoreNetworkArn(): String = unwrap(this).getAttrCoreNetworkArn()

  /**
   * The timestamp when the core network peering was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The edge location for the peer.
   */
  public open fun attrEdgeLocation(): String = unwrap(this).getAttrEdgeLocation()

  /**
   * The ID of the account owner.
   */
  public open fun attrOwnerAccountId(): String = unwrap(this).getAttrOwnerAccountId()

  /**
   * The ID of the peering.
   */
  public open fun attrPeeringId(): String = unwrap(this).getAttrPeeringId()

  /**
   * The peering type.
   *
   * This will be `TRANSIT_GATEWAY` .
   */
  public open fun attrPeeringType(): String = unwrap(this).getAttrPeeringType()

  /**
   * The ARN of the resource peered to a core network.
   */
  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  /**
   * The current state of the peer.
   *
   * This can be `CREATING` | `FAILED` | `AVAILABLE` | `DELETING` .
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * The ID of the peering attachment.
   */
  public open fun attrTransitGatewayPeeringAttachmentId(): String =
      unwrap(this).getAttrTransitGatewayPeeringAttachmentId()

  /**
   * The ID of the core network.
   */
  public open fun coreNetworkId(): String = unwrap(this).getCoreNetworkId()

  /**
   * The ID of the core network.
   */
  public open fun coreNetworkId(`value`: String) {
    unwrap(this).setCoreNetworkId(`value`)
  }

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
   * The list of key-value tags associated with the peering.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The list of key-value tags associated with the peering.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The list of key-value tags associated with the peering.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ARN of the transit gateway.
   */
  public open fun transitGatewayArn(): String = unwrap(this).getTransitGatewayArn()

  /**
   * The ARN of the transit gateway.
   */
  public open fun transitGatewayArn(`value`: String) {
    unwrap(this).setTransitGatewayArn(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.networkmanager.CfnTransitGatewayPeering].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the core network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewaypeering.html#cfn-networkmanager-transitgatewaypeering-corenetworkid)
     * @param coreNetworkId The ID of the core network. 
     */
    public fun coreNetworkId(coreNetworkId: String)

    /**
     * The list of key-value tags associated with the peering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewaypeering.html#cfn-networkmanager-transitgatewaypeering-tags)
     * @param tags The list of key-value tags associated with the peering. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The list of key-value tags associated with the peering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewaypeering.html#cfn-networkmanager-transitgatewaypeering-tags)
     * @param tags The list of key-value tags associated with the peering. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ARN of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewaypeering.html#cfn-networkmanager-transitgatewaypeering-transitgatewayarn)
     * @param transitGatewayArn The ARN of the transit gateway. 
     */
    public fun transitGatewayArn(transitGatewayArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeering.Builder =
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeering.Builder.create(scope,
        id)

    /**
     * The ID of the core network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewaypeering.html#cfn-networkmanager-transitgatewaypeering-corenetworkid)
     * @param coreNetworkId The ID of the core network. 
     */
    override fun coreNetworkId(coreNetworkId: String) {
      cdkBuilder.coreNetworkId(coreNetworkId)
    }

    /**
     * The list of key-value tags associated with the peering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewaypeering.html#cfn-networkmanager-transitgatewaypeering-tags)
     * @param tags The list of key-value tags associated with the peering. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The list of key-value tags associated with the peering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewaypeering.html#cfn-networkmanager-transitgatewaypeering-tags)
     * @param tags The list of key-value tags associated with the peering. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ARN of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewaypeering.html#cfn-networkmanager-transitgatewaypeering-transitgatewayarn)
     * @param transitGatewayArn The ARN of the transit gateway. 
     */
    override fun transitGatewayArn(transitGatewayArn: String) {
      cdkBuilder.transitGatewayArn(transitGatewayArn)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeering =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeering.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayPeering {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayPeering(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeering):
        CfnTransitGatewayPeering = CfnTransitGatewayPeering(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayPeering):
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeering = wrapped.cdkObject
        as software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeering
  }
}
