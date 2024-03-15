@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediapackagev2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a channel to receive content.
 *
 * After it's created, a channel provides static input URLs. These URLs remain the same throughout
 * the lifetime of the channel, regardless of any failures or upgrades that might occur. Use these URLs
 * to configure the outputs of your upstream encoder.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
 * CfnChannel cfnChannel = CfnChannel.Builder.create(this, "MyCfnChannel")
 * .channelGroupName("channelGroupName")
 * .channelName("channelName")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html)
 */
public open class CfnChannel internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannel,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The Amazon Resource Name (ARN) of the channel.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The timestamp of the ccreation of the channel.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The ingest endpoints associated with the channel.
   */
  public open fun attrIngestEndpoints(): IResolvable =
      unwrap(this).getAttrIngestEndpoints().let(IResolvable::wrap)

  /**
   * The timestamp of the modification of the channel.
   */
  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The name of the channel group associated with the channel configuration.
   */
  public open fun channelGroupName(): String = unwrap(this).getChannelGroupName()

  /**
   * The name of the channel group associated with the channel configuration.
   */
  public open fun channelGroupName(`value`: String) {
    unwrap(this).setChannelGroupName(`value`)
  }

  /**
   * The name of the channel.
   */
  public open fun channelName(): String = unwrap(this).getChannelName()

  /**
   * The name of the channel.
   */
  public open fun channelName(`value`: String) {
    unwrap(this).setChannelName(`value`)
  }

  /**
   * The description of the channel.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the channel.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * The tags associated with the channel.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags associated with the channel.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags associated with the channel.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediapackagev2.CfnChannel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the channel group associated with the channel configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-channelgroupname)
     * @param channelGroupName The name of the channel group associated with the channel
     * configuration. 
     */
    public fun channelGroupName(channelGroupName: String)

    /**
     * The name of the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-channelname)
     * @param channelName The name of the channel. 
     */
    public fun channelName(channelName: String)

    /**
     * The description of the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-description)
     * @param description The description of the channel. 
     */
    public fun description(description: String)

    /**
     * The tags associated with the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-tags)
     * @param tags The tags associated with the channel. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags associated with the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-tags)
     * @param tags The tags associated with the channel. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediapackagev2.CfnChannel.Builder =
        software.amazon.awscdk.services.mediapackagev2.CfnChannel.Builder.create(scope, id)

    /**
     * The name of the channel group associated with the channel configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-channelgroupname)
     * @param channelGroupName The name of the channel group associated with the channel
     * configuration. 
     */
    override fun channelGroupName(channelGroupName: String) {
      cdkBuilder.channelGroupName(channelGroupName)
    }

    /**
     * The name of the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-channelname)
     * @param channelName The name of the channel. 
     */
    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    /**
     * The description of the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-description)
     * @param description The description of the channel. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The tags associated with the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-tags)
     * @param tags The tags associated with the channel. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags associated with the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-tags)
     * @param tags The tags associated with the channel. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediapackagev2.CfnChannel =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediapackagev2.CfnChannel.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannel):
        CfnChannel = CfnChannel(cdkObject)

    internal fun unwrap(wrapped: CfnChannel):
        software.amazon.awscdk.services.mediapackagev2.CfnChannel = wrapped.cdkObject
  }

  /**
   * The input URL where the source stream should be sent.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
   * IngestEndpointProperty ingestEndpointProperty = IngestEndpointProperty.builder()
   * .id("id")
   * .url("url")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-channel-ingestendpoint.html)
   */
  public interface IngestEndpointProperty {
    /**
     * The identifier associated with the ingest endpoint of the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-channel-ingestendpoint.html#cfn-mediapackagev2-channel-ingestendpoint-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * The URL associated with the ingest endpoint of the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-channel-ingestendpoint.html#cfn-mediapackagev2-channel-ingestendpoint-url)
     */
    public fun url(): String? = unwrap(this).getUrl()

    /**
     * A builder for [IngestEndpointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The identifier associated with the ingest endpoint of the channel.
       */
      public fun id(id: String)

      /**
       * @param url The URL associated with the ingest endpoint of the channel.
       */
      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.IngestEndpointProperty.Builder =
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.IngestEndpointProperty.builder()

      /**
       * @param id The identifier associated with the ingest endpoint of the channel.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param url The URL associated with the ingest endpoint of the channel.
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.IngestEndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.IngestEndpointProperty,
    ) : CdkObject(cdkObject), IngestEndpointProperty {
      /**
       * The identifier associated with the ingest endpoint of the channel.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-channel-ingestendpoint.html#cfn-mediapackagev2-channel-ingestendpoint-id)
       */
      override fun id(): String? = unwrap(this).getId()

      /**
       * The URL associated with the ingest endpoint of the channel.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-channel-ingestendpoint.html#cfn-mediapackagev2-channel-ingestendpoint-url)
       */
      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IngestEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannel.IngestEndpointProperty):
          IngestEndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngestEndpointProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.IngestEndpointProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.IngestEndpointProperty
    }
  }
}
