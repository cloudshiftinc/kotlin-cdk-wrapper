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
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
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
 * .inputSwitchConfiguration(InputSwitchConfigurationProperty.builder()
 * .mqcsInputSwitching(false)
 * .build())
 * .inputType("inputType")
 * .outputHeaderConfiguration(OutputHeaderConfigurationProperty.builder()
 * .publishMqcs(false)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html)
 */
public open class CfnChannel(
  cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannel,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnChannelProps,
  ) :
      this(software.amazon.awscdk.services.mediapackagev2.CfnChannel(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnChannelProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnChannelProps.Builder.() -> Unit,
  ) : this(scope, id, CfnChannelProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the channel.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The timestamp of the creation of the channel.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The ingest domain URL where the source stream should be sent.
   */
  public open fun attrIngestEndpointUrls(): List<String> = unwrap(this).getAttrIngestEndpointUrls()

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
   * The configuration for input switching based on the media quality confidence score (MQCS) as
   * provided from AWS Elemental MediaLive.
   */
  public open fun inputSwitchConfiguration(): Any? = unwrap(this).getInputSwitchConfiguration()

  /**
   * The configuration for input switching based on the media quality confidence score (MQCS) as
   * provided from AWS Elemental MediaLive.
   */
  public open fun inputSwitchConfiguration(`value`: IResolvable) {
    unwrap(this).setInputSwitchConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration for input switching based on the media quality confidence score (MQCS) as
   * provided from AWS Elemental MediaLive.
   */
  public open fun inputSwitchConfiguration(`value`: InputSwitchConfigurationProperty) {
    unwrap(this).setInputSwitchConfiguration(`value`.let(InputSwitchConfigurationProperty.Companion::unwrap))
  }

  /**
   * The configuration for input switching based on the media quality confidence score (MQCS) as
   * provided from AWS Elemental MediaLive.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e9986a54d46f0acc19b9c96644727dde6fb5a29b00a0899271f862a0ada43153")
  public open
      fun inputSwitchConfiguration(`value`: InputSwitchConfigurationProperty.Builder.() -> Unit):
      Unit = inputSwitchConfiguration(InputSwitchConfigurationProperty(`value`))

  /**
   * The input type will be an immutable field which will be used to define whether the channel will
   * allow CMAF ingest or HLS ingest.
   */
  public open fun inputType(): String? = unwrap(this).getInputType()

  /**
   * The input type will be an immutable field which will be used to define whether the channel will
   * allow CMAF ingest or HLS ingest.
   */
  public open fun inputType(`value`: String) {
    unwrap(this).setInputType(`value`)
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
   * The settings for what common media server data (CMSD) headers AWS Elemental MediaPackage
   * includes in responses to the CDN.
   */
  public open fun outputHeaderConfiguration(): Any? = unwrap(this).getOutputHeaderConfiguration()

  /**
   * The settings for what common media server data (CMSD) headers AWS Elemental MediaPackage
   * includes in responses to the CDN.
   */
  public open fun outputHeaderConfiguration(`value`: IResolvable) {
    unwrap(this).setOutputHeaderConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The settings for what common media server data (CMSD) headers AWS Elemental MediaPackage
   * includes in responses to the CDN.
   */
  public open fun outputHeaderConfiguration(`value`: OutputHeaderConfigurationProperty) {
    unwrap(this).setOutputHeaderConfiguration(`value`.let(OutputHeaderConfigurationProperty.Companion::unwrap))
  }

  /**
   * The settings for what common media server data (CMSD) headers AWS Elemental MediaPackage
   * includes in responses to the CDN.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fd4837f76898d1547ccf787131713bf906a5bb6357f9f5c5065e098387ec3af4")
  public open
      fun outputHeaderConfiguration(`value`: OutputHeaderConfigurationProperty.Builder.() -> Unit):
      Unit = outputHeaderConfiguration(OutputHeaderConfigurationProperty(`value`))

  /**
   *
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   *
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   *
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
     * The configuration for input switching based on the media quality confidence score (MQCS) as
     * provided from AWS Elemental MediaLive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-inputswitchconfiguration)
     * @param inputSwitchConfiguration The configuration for input switching based on the media
     * quality confidence score (MQCS) as provided from AWS Elemental MediaLive. 
     */
    public fun inputSwitchConfiguration(inputSwitchConfiguration: IResolvable)

    /**
     * The configuration for input switching based on the media quality confidence score (MQCS) as
     * provided from AWS Elemental MediaLive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-inputswitchconfiguration)
     * @param inputSwitchConfiguration The configuration for input switching based on the media
     * quality confidence score (MQCS) as provided from AWS Elemental MediaLive. 
     */
    public fun inputSwitchConfiguration(inputSwitchConfiguration: InputSwitchConfigurationProperty)

    /**
     * The configuration for input switching based on the media quality confidence score (MQCS) as
     * provided from AWS Elemental MediaLive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-inputswitchconfiguration)
     * @param inputSwitchConfiguration The configuration for input switching based on the media
     * quality confidence score (MQCS) as provided from AWS Elemental MediaLive. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9337f9553574d19ff2b85a9456edafb419ab1e4236a18cdaa58ff17c0022422")
    public
        fun inputSwitchConfiguration(inputSwitchConfiguration: InputSwitchConfigurationProperty.Builder.() -> Unit)

    /**
     * The input type will be an immutable field which will be used to define whether the channel
     * will allow CMAF ingest or HLS ingest.
     *
     * If unprovided, it will default to HLS to preserve current behavior.
     *
     * The allowed values are:
     *
     * * `HLS` - The HLS streaming specification (which defines M3U8 manifests and TS segments).
     * * `CMAF` - The DASH-IF CMAF Ingest specification (which defines CMAF segments with optional
     * DASH manifests).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-inputtype)
     * @param inputType The input type will be an immutable field which will be used to define
     * whether the channel will allow CMAF ingest or HLS ingest. 
     */
    public fun inputType(inputType: String)

    /**
     * The settings for what common media server data (CMSD) headers AWS Elemental MediaPackage
     * includes in responses to the CDN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-outputheaderconfiguration)
     * @param outputHeaderConfiguration The settings for what common media server data (CMSD)
     * headers AWS Elemental MediaPackage includes in responses to the CDN. 
     */
    public fun outputHeaderConfiguration(outputHeaderConfiguration: IResolvable)

    /**
     * The settings for what common media server data (CMSD) headers AWS Elemental MediaPackage
     * includes in responses to the CDN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-outputheaderconfiguration)
     * @param outputHeaderConfiguration The settings for what common media server data (CMSD)
     * headers AWS Elemental MediaPackage includes in responses to the CDN. 
     */
    public
        fun outputHeaderConfiguration(outputHeaderConfiguration: OutputHeaderConfigurationProperty)

    /**
     * The settings for what common media server data (CMSD) headers AWS Elemental MediaPackage
     * includes in responses to the CDN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-outputheaderconfiguration)
     * @param outputHeaderConfiguration The settings for what common media server data (CMSD)
     * headers AWS Elemental MediaPackage includes in responses to the CDN. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1c23dd63c66b679fdabb9360a2330295c0d58d35efd4f4b12079b99643a7085a")
    public
        fun outputHeaderConfiguration(outputHeaderConfiguration: OutputHeaderConfigurationProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-tags)
     * @param tags 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-tags)
     * @param tags 
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
     * The configuration for input switching based on the media quality confidence score (MQCS) as
     * provided from AWS Elemental MediaLive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-inputswitchconfiguration)
     * @param inputSwitchConfiguration The configuration for input switching based on the media
     * quality confidence score (MQCS) as provided from AWS Elemental MediaLive. 
     */
    override fun inputSwitchConfiguration(inputSwitchConfiguration: IResolvable) {
      cdkBuilder.inputSwitchConfiguration(inputSwitchConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration for input switching based on the media quality confidence score (MQCS) as
     * provided from AWS Elemental MediaLive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-inputswitchconfiguration)
     * @param inputSwitchConfiguration The configuration for input switching based on the media
     * quality confidence score (MQCS) as provided from AWS Elemental MediaLive. 
     */
    override
        fun inputSwitchConfiguration(inputSwitchConfiguration: InputSwitchConfigurationProperty) {
      cdkBuilder.inputSwitchConfiguration(inputSwitchConfiguration.let(InputSwitchConfigurationProperty.Companion::unwrap))
    }

    /**
     * The configuration for input switching based on the media quality confidence score (MQCS) as
     * provided from AWS Elemental MediaLive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-inputswitchconfiguration)
     * @param inputSwitchConfiguration The configuration for input switching based on the media
     * quality confidence score (MQCS) as provided from AWS Elemental MediaLive. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9337f9553574d19ff2b85a9456edafb419ab1e4236a18cdaa58ff17c0022422")
    override
        fun inputSwitchConfiguration(inputSwitchConfiguration: InputSwitchConfigurationProperty.Builder.() -> Unit):
        Unit = inputSwitchConfiguration(InputSwitchConfigurationProperty(inputSwitchConfiguration))

    /**
     * The input type will be an immutable field which will be used to define whether the channel
     * will allow CMAF ingest or HLS ingest.
     *
     * If unprovided, it will default to HLS to preserve current behavior.
     *
     * The allowed values are:
     *
     * * `HLS` - The HLS streaming specification (which defines M3U8 manifests and TS segments).
     * * `CMAF` - The DASH-IF CMAF Ingest specification (which defines CMAF segments with optional
     * DASH manifests).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-inputtype)
     * @param inputType The input type will be an immutable field which will be used to define
     * whether the channel will allow CMAF ingest or HLS ingest. 
     */
    override fun inputType(inputType: String) {
      cdkBuilder.inputType(inputType)
    }

    /**
     * The settings for what common media server data (CMSD) headers AWS Elemental MediaPackage
     * includes in responses to the CDN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-outputheaderconfiguration)
     * @param outputHeaderConfiguration The settings for what common media server data (CMSD)
     * headers AWS Elemental MediaPackage includes in responses to the CDN. 
     */
    override fun outputHeaderConfiguration(outputHeaderConfiguration: IResolvable) {
      cdkBuilder.outputHeaderConfiguration(outputHeaderConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The settings for what common media server data (CMSD) headers AWS Elemental MediaPackage
     * includes in responses to the CDN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-outputheaderconfiguration)
     * @param outputHeaderConfiguration The settings for what common media server data (CMSD)
     * headers AWS Elemental MediaPackage includes in responses to the CDN. 
     */
    override
        fun outputHeaderConfiguration(outputHeaderConfiguration: OutputHeaderConfigurationProperty) {
      cdkBuilder.outputHeaderConfiguration(outputHeaderConfiguration.let(OutputHeaderConfigurationProperty.Companion::unwrap))
    }

    /**
     * The settings for what common media server data (CMSD) headers AWS Elemental MediaPackage
     * includes in responses to the CDN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-outputheaderconfiguration)
     * @param outputHeaderConfiguration The settings for what common media server data (CMSD)
     * headers AWS Elemental MediaPackage includes in responses to the CDN. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1c23dd63c66b679fdabb9360a2330295c0d58d35efd4f4b12079b99643a7085a")
    override
        fun outputHeaderConfiguration(outputHeaderConfiguration: OutputHeaderConfigurationProperty.Builder.() -> Unit):
        Unit =
        outputHeaderConfiguration(OutputHeaderConfigurationProperty(outputHeaderConfiguration))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-tags)
     * @param tags 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-tags)
     * @param tags 
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
        software.amazon.awscdk.services.mediapackagev2.CfnChannel = wrapped.cdkObject as
        software.amazon.awscdk.services.mediapackagev2.CfnChannel
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
      cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannel.IngestEndpointProperty,
    ) : CdkObject(cdkObject),
        IngestEndpointProperty {
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
          IngestEndpointProperty = CdkObjectWrappers.wrap(cdkObject) as? IngestEndpointProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngestEndpointProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.IngestEndpointProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.IngestEndpointProperty
    }
  }

  /**
   * The configuration for input switching based on the media quality confidence score (MQCS) as
   * provided from AWS Elemental MediaLive.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
   * InputSwitchConfigurationProperty inputSwitchConfigurationProperty =
   * InputSwitchConfigurationProperty.builder()
   * .mqcsInputSwitching(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-channel-inputswitchconfiguration.html)
   */
  public interface InputSwitchConfigurationProperty {
    /**
     * When true, AWS Elemental MediaPackage performs input switching based on the MQCS.
     *
     * Default is true. This setting is valid only when `InputType` is `CMAF` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-channel-inputswitchconfiguration.html#cfn-mediapackagev2-channel-inputswitchconfiguration-mqcsinputswitching)
     */
    public fun mqcsInputSwitching(): Any? = unwrap(this).getMqcsInputSwitching()

    /**
     * A builder for [InputSwitchConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mqcsInputSwitching When true, AWS Elemental MediaPackage performs input switching
       * based on the MQCS.
       * Default is true. This setting is valid only when `InputType` is `CMAF` .
       */
      public fun mqcsInputSwitching(mqcsInputSwitching: Boolean)

      /**
       * @param mqcsInputSwitching When true, AWS Elemental MediaPackage performs input switching
       * based on the MQCS.
       * Default is true. This setting is valid only when `InputType` is `CMAF` .
       */
      public fun mqcsInputSwitching(mqcsInputSwitching: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.InputSwitchConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.InputSwitchConfigurationProperty.builder()

      /**
       * @param mqcsInputSwitching When true, AWS Elemental MediaPackage performs input switching
       * based on the MQCS.
       * Default is true. This setting is valid only when `InputType` is `CMAF` .
       */
      override fun mqcsInputSwitching(mqcsInputSwitching: Boolean) {
        cdkBuilder.mqcsInputSwitching(mqcsInputSwitching)
      }

      /**
       * @param mqcsInputSwitching When true, AWS Elemental MediaPackage performs input switching
       * based on the MQCS.
       * Default is true. This setting is valid only when `InputType` is `CMAF` .
       */
      override fun mqcsInputSwitching(mqcsInputSwitching: IResolvable) {
        cdkBuilder.mqcsInputSwitching(mqcsInputSwitching.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.InputSwitchConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannel.InputSwitchConfigurationProperty,
    ) : CdkObject(cdkObject),
        InputSwitchConfigurationProperty {
      /**
       * When true, AWS Elemental MediaPackage performs input switching based on the MQCS.
       *
       * Default is true. This setting is valid only when `InputType` is `CMAF` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-channel-inputswitchconfiguration.html#cfn-mediapackagev2-channel-inputswitchconfiguration-mqcsinputswitching)
       */
      override fun mqcsInputSwitching(): Any? = unwrap(this).getMqcsInputSwitching()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputSwitchConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannel.InputSwitchConfigurationProperty):
          InputSwitchConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InputSwitchConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputSwitchConfigurationProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.InputSwitchConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.InputSwitchConfigurationProperty
    }
  }

  /**
   * The settings for what common media server data (CMSD) headers AWS Elemental MediaPackage
   * includes in responses to the CDN.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
   * OutputHeaderConfigurationProperty outputHeaderConfigurationProperty =
   * OutputHeaderConfigurationProperty.builder()
   * .publishMqcs(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-channel-outputheaderconfiguration.html)
   */
  public interface OutputHeaderConfigurationProperty {
    /**
     * When true, AWS Elemental MediaPackage includes the MQCS in responses to the CDN.
     *
     * This setting is valid only when `InputType` is `CMAF` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-channel-outputheaderconfiguration.html#cfn-mediapackagev2-channel-outputheaderconfiguration-publishmqcs)
     */
    public fun publishMqcs(): Any? = unwrap(this).getPublishMqcs()

    /**
     * A builder for [OutputHeaderConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param publishMqcs When true, AWS Elemental MediaPackage includes the MQCS in responses to
       * the CDN.
       * This setting is valid only when `InputType` is `CMAF` .
       */
      public fun publishMqcs(publishMqcs: Boolean)

      /**
       * @param publishMqcs When true, AWS Elemental MediaPackage includes the MQCS in responses to
       * the CDN.
       * This setting is valid only when `InputType` is `CMAF` .
       */
      public fun publishMqcs(publishMqcs: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.OutputHeaderConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.OutputHeaderConfigurationProperty.builder()

      /**
       * @param publishMqcs When true, AWS Elemental MediaPackage includes the MQCS in responses to
       * the CDN.
       * This setting is valid only when `InputType` is `CMAF` .
       */
      override fun publishMqcs(publishMqcs: Boolean) {
        cdkBuilder.publishMqcs(publishMqcs)
      }

      /**
       * @param publishMqcs When true, AWS Elemental MediaPackage includes the MQCS in responses to
       * the CDN.
       * This setting is valid only when `InputType` is `CMAF` .
       */
      override fun publishMqcs(publishMqcs: IResolvable) {
        cdkBuilder.publishMqcs(publishMqcs.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.OutputHeaderConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannel.OutputHeaderConfigurationProperty,
    ) : CdkObject(cdkObject),
        OutputHeaderConfigurationProperty {
      /**
       * When true, AWS Elemental MediaPackage includes the MQCS in responses to the CDN.
       *
       * This setting is valid only when `InputType` is `CMAF` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-channel-outputheaderconfiguration.html#cfn-mediapackagev2-channel-outputheaderconfiguration-publishmqcs)
       */
      override fun publishMqcs(): Any? = unwrap(this).getPublishMqcs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OutputHeaderConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannel.OutputHeaderConfigurationProperty):
          OutputHeaderConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OutputHeaderConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputHeaderConfigurationProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.OutputHeaderConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.OutputHeaderConfigurationProperty
    }
  }
}
