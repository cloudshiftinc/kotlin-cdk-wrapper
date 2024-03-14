package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTransitGatewayPeeringAttachment internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The time the transit gateway peering attachment was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The state of the transit gateway peering attachment.
   *
   * Note that the `initiating` state has been deprecated.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   *
   */
  public open fun attrStatus(): IResolvable = unwrap(this).getAttrStatus().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrStatusCode(): String = unwrap(this).getAttrStatusCode()

  /**
   *
   */
  public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

  /**
   * The ID of the transit gateway peering attachment.
   */
  public open fun attrTransitGatewayAttachmentId(): String =
      unwrap(this).getAttrTransitGatewayAttachmentId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the AWS account that owns the transit gateway.
   */
  public open fun peerAccountId(): String = unwrap(this).getPeerAccountId()

  /**
   * The ID of the AWS account that owns the transit gateway.
   */
  public open fun peerAccountId(`value`: String) {
    unwrap(this).setPeerAccountId(`value`)
  }

  /**
   * The Region of the transit gateway.
   */
  public open fun peerRegion(): String = unwrap(this).getPeerRegion()

  /**
   * The Region of the transit gateway.
   */
  public open fun peerRegion(`value`: String) {
    unwrap(this).setPeerRegion(`value`)
  }

  /**
   * The ID of the transit gateway.
   */
  public open fun peerTransitGatewayId(): String = unwrap(this).getPeerTransitGatewayId()

  /**
   * The ID of the transit gateway.
   */
  public open fun peerTransitGatewayId(`value`: String) {
    unwrap(this).setPeerTransitGatewayId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the transit gateway peering attachment.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the transit gateway peering attachment.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the transit gateway peering attachment.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the transit gateway peering attachment.
   */
  public open fun transitGatewayId(): String = unwrap(this).getTransitGatewayId()

  /**
   * The ID of the transit gateway peering attachment.
   */
  public open fun transitGatewayId(`value`: String) {
    unwrap(this).setTransitGatewayId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the AWS account that owns the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-peeraccountid)
     * @param peerAccountId The ID of the AWS account that owns the transit gateway. 
     */
    public fun peerAccountId(peerAccountId: String)

    /**
     * The Region of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-peerregion)
     * @param peerRegion The Region of the transit gateway. 
     */
    public fun peerRegion(peerRegion: String)

    /**
     * The ID of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-peertransitgatewayid)
     * @param peerTransitGatewayId The ID of the transit gateway. 
     */
    public fun peerTransitGatewayId(peerTransitGatewayId: String)

    /**
     * The tags for the transit gateway peering attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-tags)
     * @param tags The tags for the transit gateway peering attachment. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the transit gateway peering attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-tags)
     * @param tags The tags for the transit gateway peering attachment. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the transit gateway peering attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-transitgatewayid)
     * @param transitGatewayId The ID of the transit gateway peering attachment. 
     */
    public fun transitGatewayId(transitGatewayId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.Builder.create(scope,
        id)

    /**
     * The ID of the AWS account that owns the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-peeraccountid)
     * @param peerAccountId The ID of the AWS account that owns the transit gateway. 
     */
    override fun peerAccountId(peerAccountId: String) {
      cdkBuilder.peerAccountId(peerAccountId)
    }

    /**
     * The Region of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-peerregion)
     * @param peerRegion The Region of the transit gateway. 
     */
    override fun peerRegion(peerRegion: String) {
      cdkBuilder.peerRegion(peerRegion)
    }

    /**
     * The ID of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-peertransitgatewayid)
     * @param peerTransitGatewayId The ID of the transit gateway. 
     */
    override fun peerTransitGatewayId(peerTransitGatewayId: String) {
      cdkBuilder.peerTransitGatewayId(peerTransitGatewayId)
    }

    /**
     * The tags for the transit gateway peering attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-tags)
     * @param tags The tags for the transit gateway peering attachment. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the transit gateway peering attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-tags)
     * @param tags The tags for the transit gateway peering attachment. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the transit gateway peering attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-transitgatewayid)
     * @param transitGatewayId The ID of the transit gateway peering attachment. 
     */
    override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayPeeringAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayPeeringAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment):
        CfnTransitGatewayPeeringAttachment = CfnTransitGatewayPeeringAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayPeeringAttachment):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment = wrapped.cdkObject
  }

  public interface PeeringAttachmentStatusProperty {
    /**
     * The status code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewaypeeringattachment-peeringattachmentstatus.html#cfn-ec2-transitgatewaypeeringattachment-peeringattachmentstatus-code)
     */
    public fun code(): String? = unwrap(this).getCode()

    /**
     * The status message, if applicable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewaypeeringattachment-peeringattachmentstatus.html#cfn-ec2-transitgatewaypeeringattachment-peeringattachmentstatus-message)
     */
    public fun message(): String? = unwrap(this).getMessage()

    /**
     * A builder for [PeeringAttachmentStatusProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param code The status code.
       */
      public fun code(code: String)

      /**
       * @param message The status message, if applicable.
       */
      public fun message(message: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.PeeringAttachmentStatusProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.PeeringAttachmentStatusProperty.builder()

      /**
       * @param code The status code.
       */
      override fun code(code: String) {
        cdkBuilder.code(code)
      }

      /**
       * @param message The status message, if applicable.
       */
      override fun message(message: String) {
        cdkBuilder.message(message)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.PeeringAttachmentStatusProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.PeeringAttachmentStatusProperty,
    ) : CdkObject(cdkObject), PeeringAttachmentStatusProperty {
      /**
       * The status code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewaypeeringattachment-peeringattachmentstatus.html#cfn-ec2-transitgatewaypeeringattachment-peeringattachmentstatus-code)
       */
      override fun code(): String? = unwrap(this).getCode()

      /**
       * The status message, if applicable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewaypeeringattachment-peeringattachmentstatus.html#cfn-ec2-transitgatewaypeeringattachment-peeringattachmentstatus-message)
       */
      override fun message(): String? = unwrap(this).getMessage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PeeringAttachmentStatusProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.PeeringAttachmentStatusProperty):
          PeeringAttachmentStatusProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PeeringAttachmentStatusProperty):
          software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.PeeringAttachmentStatusProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.PeeringAttachmentStatusProperty
    }
  }
}
