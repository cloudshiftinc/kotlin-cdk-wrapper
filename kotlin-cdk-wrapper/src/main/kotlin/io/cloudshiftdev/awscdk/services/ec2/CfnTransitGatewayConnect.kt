@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a Connect attachment from a specified transit gateway attachment.
 *
 * A Connect attachment is a GRE-based tunnel attachment that you can use to establish a connection
 * between a transit gateway and an appliance.
 *
 * A Connect attachment uses an existing VPC or AWS Direct Connect attachment as the underlying
 * transport mechanism.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnTransitGatewayConnect cfnTransitGatewayConnect = CfnTransitGatewayConnect.Builder.create(this,
 * "MyCfnTransitGatewayConnect")
 * .options(TransitGatewayConnectOptionsProperty.builder()
 * .protocol("protocol")
 * .build())
 * .transportTransitGatewayAttachmentId("transportTransitGatewayAttachmentId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html)
 */
public open class CfnTransitGatewayConnect internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The creation time.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The state of the attachment.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * The ID of the transit gateway attachment.
   */
  public open fun attrTransitGatewayAttachmentId(): String =
      unwrap(this).getAttrTransitGatewayAttachmentId()

  /**
   * The ID of the transit gateway.
   */
  public open fun attrTransitGatewayId(): String = unwrap(this).getAttrTransitGatewayId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Connect attachment options.
   */
  public open fun options(): Any = unwrap(this).getOptions()

  /**
   * The Connect attachment options.
   */
  public open fun options(`value`: IResolvable) {
    unwrap(this).setOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Connect attachment options.
   */
  public open fun options(`value`: TransitGatewayConnectOptionsProperty) {
    unwrap(this).setOptions(`value`.let(TransitGatewayConnectOptionsProperty::unwrap))
  }

  /**
   * The Connect attachment options.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("77935793ebec9bdf3b5c82feda60f560ee5efcd38fb8e99bdd22e505308b704f")
  public open fun options(`value`: TransitGatewayConnectOptionsProperty.Builder.() -> Unit): Unit =
      options(TransitGatewayConnectOptionsProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the attachment.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the attachment.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the attachment.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the attachment from which the Connect attachment was created.
   */
  public open fun transportTransitGatewayAttachmentId(): String =
      unwrap(this).getTransportTransitGatewayAttachmentId()

  /**
   * The ID of the attachment from which the Connect attachment was created.
   */
  public open fun transportTransitGatewayAttachmentId(`value`: String) {
    unwrap(this).setTransportTransitGatewayAttachmentId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnTransitGatewayConnect].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Connect attachment options.
     *
     * * protocol (gre)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-options)
     * @param options The Connect attachment options. 
     */
    public fun options(options: IResolvable)

    /**
     * The Connect attachment options.
     *
     * * protocol (gre)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-options)
     * @param options The Connect attachment options. 
     */
    public fun options(options: TransitGatewayConnectOptionsProperty)

    /**
     * The Connect attachment options.
     *
     * * protocol (gre)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-options)
     * @param options The Connect attachment options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21b92d09de996ca5f42748c09084837f9a531a7edcfeaebde1daee4f1162274d")
    public fun options(options: TransitGatewayConnectOptionsProperty.Builder.() -> Unit)

    /**
     * The tags for the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-tags)
     * @param tags The tags for the attachment. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-tags)
     * @param tags The tags for the attachment. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the attachment from which the Connect attachment was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-transporttransitgatewayattachmentid)
     * @param transportTransitGatewayAttachmentId The ID of the attachment from which the Connect
     * attachment was created. 
     */
    public fun transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.Builder.create(scope, id)

    /**
     * The Connect attachment options.
     *
     * * protocol (gre)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-options)
     * @param options The Connect attachment options. 
     */
    override fun options(options: IResolvable) {
      cdkBuilder.options(options.let(IResolvable::unwrap))
    }

    /**
     * The Connect attachment options.
     *
     * * protocol (gre)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-options)
     * @param options The Connect attachment options. 
     */
    override fun options(options: TransitGatewayConnectOptionsProperty) {
      cdkBuilder.options(options.let(TransitGatewayConnectOptionsProperty::unwrap))
    }

    /**
     * The Connect attachment options.
     *
     * * protocol (gre)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-options)
     * @param options The Connect attachment options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21b92d09de996ca5f42748c09084837f9a531a7edcfeaebde1daee4f1162274d")
    override fun options(options: TransitGatewayConnectOptionsProperty.Builder.() -> Unit): Unit =
        options(TransitGatewayConnectOptionsProperty(options))

    /**
     * The tags for the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-tags)
     * @param tags The tags for the attachment. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-tags)
     * @param tags The tags for the attachment. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the attachment from which the Connect attachment was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-transporttransitgatewayattachmentid)
     * @param transportTransitGatewayAttachmentId The ID of the attachment from which the Connect
     * attachment was created. 
     */
    override fun transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId: String) {
      cdkBuilder.transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayConnect {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayConnect(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect):
        CfnTransitGatewayConnect = CfnTransitGatewayConnect(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayConnect):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect = wrapped.cdkObject
  }

  /**
   * Describes the Connect attachment options.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * TransitGatewayConnectOptionsProperty transitGatewayConnectOptionsProperty =
   * TransitGatewayConnectOptionsProperty.builder()
   * .protocol("protocol")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayconnect-transitgatewayconnectoptions.html)
   */
  public interface TransitGatewayConnectOptionsProperty {
    /**
     * The tunnel protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayconnect-transitgatewayconnectoptions.html#cfn-ec2-transitgatewayconnect-transitgatewayconnectoptions-protocol)
     */
    public fun protocol(): String? = unwrap(this).getProtocol()

    /**
     * A builder for [TransitGatewayConnectOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param protocol The tunnel protocol.
       */
      public fun protocol(protocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty.builder()

      /**
       * @param protocol The tunnel protocol.
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty,
    ) : CdkObject(cdkObject), TransitGatewayConnectOptionsProperty {
      /**
       * The tunnel protocol.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayconnect-transitgatewayconnectoptions.html#cfn-ec2-transitgatewayconnect-transitgatewayconnectoptions-protocol)
       */
      override fun protocol(): String? = unwrap(this).getProtocol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TransitGatewayConnectOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty):
          TransitGatewayConnectOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TransitGatewayConnectOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransitGatewayConnectOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty
    }
  }
}
