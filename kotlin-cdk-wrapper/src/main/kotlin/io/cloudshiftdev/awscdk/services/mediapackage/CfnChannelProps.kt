@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediapackage

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediapackage.*;
 * CfnChannelProps cfnChannelProps = CfnChannelProps.builder()
 * .id("id")
 * // the properties below are optional
 * .description("description")
 * .egressAccessLogs(LogConfigurationProperty.builder()
 * .logGroupName("logGroupName")
 * .build())
 * .hlsIngest(HlsIngestProperty.builder()
 * .ingestEndpoints(List.of(IngestEndpointProperty.builder()
 * .id("id")
 * .password("password")
 * .url("url")
 * .username("username")
 * .build()))
 * .build())
 * .ingressAccessLogs(LogConfigurationProperty.builder()
 * .logGroupName("logGroupName")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html)
 */
public interface CfnChannelProps {
  /**
   * Any descriptive information that you want to add to the channel for future identification
   * purposes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Configures egress access logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-egressaccesslogs)
   */
  public fun egressAccessLogs(): Any? = unwrap(this).getEgressAccessLogs()

  /**
   * The input URL where the source stream should be sent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-hlsingest)
   */
  public fun hlsIngest(): Any? = unwrap(this).getHlsIngest()

  /**
   * Unique identifier that you assign to the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-id)
   */
  public fun id(): String

  /**
   * Configures ingress access logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-ingressaccesslogs)
   */
  public fun ingressAccessLogs(): Any? = unwrap(this).getIngressAccessLogs()

  /**
   * The tags to assign to the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnChannelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description Any descriptive information that you want to add to the channel for future
     * identification purposes.
     */
    public fun description(description: String)

    /**
     * @param egressAccessLogs Configures egress access logs.
     */
    public fun egressAccessLogs(egressAccessLogs: IResolvable)

    /**
     * @param egressAccessLogs Configures egress access logs.
     */
    public fun egressAccessLogs(egressAccessLogs: CfnChannel.LogConfigurationProperty)

    /**
     * @param egressAccessLogs Configures egress access logs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f6e31b184dad57e45154299101465dee25d352ddaec0d900a0b2ca27e97edd7")
    public
        fun egressAccessLogs(egressAccessLogs: CfnChannel.LogConfigurationProperty.Builder.() -> Unit)

    /**
     * @param hlsIngest The input URL where the source stream should be sent.
     */
    public fun hlsIngest(hlsIngest: IResolvable)

    /**
     * @param hlsIngest The input URL where the source stream should be sent.
     */
    public fun hlsIngest(hlsIngest: CfnChannel.HlsIngestProperty)

    /**
     * @param hlsIngest The input URL where the source stream should be sent.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("114fedf728458f87cca22f473e2cfe5c551e5a406d3bee64e831920a9e78ac36")
    public fun hlsIngest(hlsIngest: CfnChannel.HlsIngestProperty.Builder.() -> Unit)

    /**
     * @param id Unique identifier that you assign to the channel. 
     */
    public fun id(id: String)

    /**
     * @param ingressAccessLogs Configures ingress access logs.
     */
    public fun ingressAccessLogs(ingressAccessLogs: IResolvable)

    /**
     * @param ingressAccessLogs Configures ingress access logs.
     */
    public fun ingressAccessLogs(ingressAccessLogs: CfnChannel.LogConfigurationProperty)

    /**
     * @param ingressAccessLogs Configures ingress access logs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17f0fbe9e87e41af5f2007a2bf99098a50efd7b281ca269701a8d5d341a37b54")
    public
        fun ingressAccessLogs(ingressAccessLogs: CfnChannel.LogConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags The tags to assign to the channel.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to assign to the channel.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediapackage.CfnChannelProps.Builder =
        software.amazon.awscdk.services.mediapackage.CfnChannelProps.builder()

    /**
     * @param description Any descriptive information that you want to add to the channel for future
     * identification purposes.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param egressAccessLogs Configures egress access logs.
     */
    override fun egressAccessLogs(egressAccessLogs: IResolvable) {
      cdkBuilder.egressAccessLogs(egressAccessLogs.let(IResolvable::unwrap))
    }

    /**
     * @param egressAccessLogs Configures egress access logs.
     */
    override fun egressAccessLogs(egressAccessLogs: CfnChannel.LogConfigurationProperty) {
      cdkBuilder.egressAccessLogs(egressAccessLogs.let(CfnChannel.LogConfigurationProperty::unwrap))
    }

    /**
     * @param egressAccessLogs Configures egress access logs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f6e31b184dad57e45154299101465dee25d352ddaec0d900a0b2ca27e97edd7")
    override
        fun egressAccessLogs(egressAccessLogs: CfnChannel.LogConfigurationProperty.Builder.() -> Unit):
        Unit = egressAccessLogs(CfnChannel.LogConfigurationProperty(egressAccessLogs))

    /**
     * @param hlsIngest The input URL where the source stream should be sent.
     */
    override fun hlsIngest(hlsIngest: IResolvable) {
      cdkBuilder.hlsIngest(hlsIngest.let(IResolvable::unwrap))
    }

    /**
     * @param hlsIngest The input URL where the source stream should be sent.
     */
    override fun hlsIngest(hlsIngest: CfnChannel.HlsIngestProperty) {
      cdkBuilder.hlsIngest(hlsIngest.let(CfnChannel.HlsIngestProperty::unwrap))
    }

    /**
     * @param hlsIngest The input URL where the source stream should be sent.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("114fedf728458f87cca22f473e2cfe5c551e5a406d3bee64e831920a9e78ac36")
    override fun hlsIngest(hlsIngest: CfnChannel.HlsIngestProperty.Builder.() -> Unit): Unit =
        hlsIngest(CfnChannel.HlsIngestProperty(hlsIngest))

    /**
     * @param id Unique identifier that you assign to the channel. 
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * @param ingressAccessLogs Configures ingress access logs.
     */
    override fun ingressAccessLogs(ingressAccessLogs: IResolvable) {
      cdkBuilder.ingressAccessLogs(ingressAccessLogs.let(IResolvable::unwrap))
    }

    /**
     * @param ingressAccessLogs Configures ingress access logs.
     */
    override fun ingressAccessLogs(ingressAccessLogs: CfnChannel.LogConfigurationProperty) {
      cdkBuilder.ingressAccessLogs(ingressAccessLogs.let(CfnChannel.LogConfigurationProperty::unwrap))
    }

    /**
     * @param ingressAccessLogs Configures ingress access logs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17f0fbe9e87e41af5f2007a2bf99098a50efd7b281ca269701a8d5d341a37b54")
    override
        fun ingressAccessLogs(ingressAccessLogs: CfnChannel.LogConfigurationProperty.Builder.() -> Unit):
        Unit = ingressAccessLogs(CfnChannel.LogConfigurationProperty(ingressAccessLogs))

    /**
     * @param tags The tags to assign to the channel.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to assign to the channel.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediapackage.CfnChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediapackage.CfnChannelProps,
  ) : CdkObject(cdkObject), CfnChannelProps {
    /**
     * Any descriptive information that you want to add to the channel for future identification
     * purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Configures egress access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-egressaccesslogs)
     */
    override fun egressAccessLogs(): Any? = unwrap(this).getEgressAccessLogs()

    /**
     * The input URL where the source stream should be sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-hlsingest)
     */
    override fun hlsIngest(): Any? = unwrap(this).getHlsIngest()

    /**
     * Unique identifier that you assign to the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-id)
     */
    override fun id(): String = unwrap(this).getId()

    /**
     * Configures ingress access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-ingressaccesslogs)
     */
    override fun ingressAccessLogs(): Any? = unwrap(this).getIngressAccessLogs()

    /**
     * The tags to assign to the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnChannelProps):
        CfnChannelProps = CdkObjectWrappers.wrap(cdkObject) as? CfnChannelProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnChannelProps):
        software.amazon.awscdk.services.mediapackage.CfnChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediapackage.CfnChannelProps
  }
}
