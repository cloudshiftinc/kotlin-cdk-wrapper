@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnTransitGatewayConnect`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnTransitGatewayConnectProps cfnTransitGatewayConnectProps =
 * CfnTransitGatewayConnectProps.builder()
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
public interface CfnTransitGatewayConnectProps {
  /**
   * The Connect attachment options.
   *
   * * protocol (gre)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-options)
   */
  public fun options(): Any

  /**
   * The tags for the attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the attachment from which the Connect attachment was created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-transporttransitgatewayattachmentid)
   */
  public fun transportTransitGatewayAttachmentId(): String

  /**
   * A builder for [CfnTransitGatewayConnectProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param options The Connect attachment options. 
     * * protocol (gre)
     */
    public fun options(options: IResolvable)

    /**
     * @param options The Connect attachment options. 
     * * protocol (gre)
     */
    public fun options(options: CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty)

    /**
     * @param options The Connect attachment options. 
     * * protocol (gre)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76987fcdbaf02be97ffe5677ac5175f015452920c7dc494414f663c321cf6797")
    public
        fun options(options: CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty.Builder.() -> Unit)

    /**
     * @param tags The tags for the attachment.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the attachment.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param transportTransitGatewayAttachmentId The ID of the attachment from which the Connect
     * attachment was created. 
     */
    public fun transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps.builder()

    /**
     * @param options The Connect attachment options. 
     * * protocol (gre)
     */
    override fun options(options: IResolvable) {
      cdkBuilder.options(options.let(IResolvable::unwrap))
    }

    /**
     * @param options The Connect attachment options. 
     * * protocol (gre)
     */
    override fun options(options: CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty) {
      cdkBuilder.options(options.let(CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty::unwrap))
    }

    /**
     * @param options The Connect attachment options. 
     * * protocol (gre)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76987fcdbaf02be97ffe5677ac5175f015452920c7dc494414f663c321cf6797")
    override
        fun options(options: CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty.Builder.() -> Unit):
        Unit = options(CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty(options))

    /**
     * @param tags The tags for the attachment.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags for the attachment.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param transportTransitGatewayAttachmentId The ID of the attachment from which the Connect
     * attachment was created. 
     */
    override fun transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId: String) {
      cdkBuilder.transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayConnectProps {
    /**
     * The Connect attachment options.
     *
     * * protocol (gre)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-options)
     */
    override fun options(): Any = unwrap(this).getOptions()

    /**
     * The tags for the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the attachment from which the Connect attachment was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-transporttransitgatewayattachmentid)
     */
    override fun transportTransitGatewayAttachmentId(): String =
        unwrap(this).getTransportTransitGatewayAttachmentId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTransitGatewayConnectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps):
        CfnTransitGatewayConnectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayConnectProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps
  }
}
