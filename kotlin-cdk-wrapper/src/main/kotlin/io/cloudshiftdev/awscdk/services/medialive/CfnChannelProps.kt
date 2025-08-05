@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
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
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html)
 */
public interface CfnChannelProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-anywheresettings)
   */
  public fun anywhereSettings(): Any? = unwrap(this).getAnywhereSettings()

  /**
   * Specification of CDI inputs for this channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-cdiinputspecification)
   */
  public fun cdiInputSpecification(): Any? = unwrap(this).getCdiInputSpecification()

  /**
   * The class for this channel.
   *
   * For a channel with two pipelines, the class is STANDARD. For a channel with one pipeline, the
   * class is SINGLE_PIPELINE.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-channelclass)
   */
  public fun channelClass(): String? = unwrap(this).getChannelClass()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-channelengineversion)
   */
  public fun channelEngineVersion(): Any? = unwrap(this).getChannelEngineVersion()

  /**
   * The settings that identify the destination for the outputs in this MediaLive output package.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-destinations)
   */
  public fun destinations(): Any? = unwrap(this).getDestinations()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-dryrun)
   */
  public fun dryRun(): Any? = unwrap(this).getDryRun()

  /**
   * The encoding configuration for the output content.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-encodersettings)
   */
  public fun encoderSettings(): Any? = unwrap(this).getEncoderSettings()

  /**
   * The list of input attachments for the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-inputattachments)
   */
  public fun inputAttachments(): Any? = unwrap(this).getInputAttachments()

  /**
   * The input specification for this channel.
   *
   * It specifies the key characteristics of the inputs for this channel: the maximum bitrate, the
   * resolution, and the codec.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-inputspecification)
   */
  public fun inputSpecification(): Any? = unwrap(this).getInputSpecification()

  /**
   * The verbosity for logging activity for this channel.
   *
   * Charges for logging (which are generated through Amazon CloudWatch Logging) are higher for
   * higher verbosities.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-loglevel)
   */
  public fun logLevel(): String? = unwrap(this).getLogLevel()

  /**
   * Maintenance settings for this channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-maintenance)
   */
  public fun maintenance(): Any? = unwrap(this).getMaintenance()

  /**
   * Name of channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The IAM role for MediaLive to assume when running this channel.
   *
   * The role is identified by its ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * A collection of tags for this channel.
   *
   * Each tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * Settings to enable VPC mode in the channel, so that the endpoints for all outputs are in your
   * VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-vpc)
   */
  public fun vpc(): Any? = unwrap(this).getVpc()

  /**
   * A builder for [CfnChannelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param anywhereSettings the value to be set.
     */
    public fun anywhereSettings(anywhereSettings: IResolvable)

    /**
     * @param anywhereSettings the value to be set.
     */
    public fun anywhereSettings(anywhereSettings: CfnChannel.AnywhereSettingsProperty)

    /**
     * @param anywhereSettings the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d92f6999a057d23bb5c801d8dc97e7e93c4c17eb0482f9850cac86595cdd7c8")
    public
        fun anywhereSettings(anywhereSettings: CfnChannel.AnywhereSettingsProperty.Builder.() -> Unit)

    /**
     * @param cdiInputSpecification Specification of CDI inputs for this channel.
     */
    public fun cdiInputSpecification(cdiInputSpecification: IResolvable)

    /**
     * @param cdiInputSpecification Specification of CDI inputs for this channel.
     */
    public
        fun cdiInputSpecification(cdiInputSpecification: CfnChannel.CdiInputSpecificationProperty)

    /**
     * @param cdiInputSpecification Specification of CDI inputs for this channel.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52ba2855cc08703a2ee9589e7588fca51b73169c3f98d0b2a6c8b5f12054cc70")
    public
        fun cdiInputSpecification(cdiInputSpecification: CfnChannel.CdiInputSpecificationProperty.Builder.() -> Unit)

    /**
     * @param channelClass The class for this channel.
     * For a channel with two pipelines, the class is STANDARD. For a channel with one pipeline, the
     * class is SINGLE_PIPELINE.
     */
    public fun channelClass(channelClass: String)

    /**
     * @param channelEngineVersion the value to be set.
     */
    public fun channelEngineVersion(channelEngineVersion: IResolvable)

    /**
     * @param channelEngineVersion the value to be set.
     */
    public
        fun channelEngineVersion(channelEngineVersion: CfnChannel.ChannelEngineVersionRequestProperty)

    /**
     * @param channelEngineVersion the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e97752f1d998510ca9970f4335ea335ba94a48f0246bbc22426a3d705ad2ac5")
    public
        fun channelEngineVersion(channelEngineVersion: CfnChannel.ChannelEngineVersionRequestProperty.Builder.() -> Unit)

    /**
     * @param destinations The settings that identify the destination for the outputs in this
     * MediaLive output package.
     */
    public fun destinations(destinations: IResolvable)

    /**
     * @param destinations The settings that identify the destination for the outputs in this
     * MediaLive output package.
     */
    public fun destinations(destinations: List<Any>)

    /**
     * @param destinations The settings that identify the destination for the outputs in this
     * MediaLive output package.
     */
    public fun destinations(vararg destinations: Any)

    /**
     * @param dryRun the value to be set.
     */
    public fun dryRun(dryRun: Boolean)

    /**
     * @param dryRun the value to be set.
     */
    public fun dryRun(dryRun: IResolvable)

    /**
     * @param encoderSettings The encoding configuration for the output content.
     */
    public fun encoderSettings(encoderSettings: IResolvable)

    /**
     * @param encoderSettings The encoding configuration for the output content.
     */
    public fun encoderSettings(encoderSettings: CfnChannel.EncoderSettingsProperty)

    /**
     * @param encoderSettings The encoding configuration for the output content.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dcc0ec157b308f78a2307c9a7bd27a270ddd63e1e272ff10176969a7c49315d1")
    public
        fun encoderSettings(encoderSettings: CfnChannel.EncoderSettingsProperty.Builder.() -> Unit)

    /**
     * @param inputAttachments The list of input attachments for the channel.
     */
    public fun inputAttachments(inputAttachments: IResolvable)

    /**
     * @param inputAttachments The list of input attachments for the channel.
     */
    public fun inputAttachments(inputAttachments: List<Any>)

    /**
     * @param inputAttachments The list of input attachments for the channel.
     */
    public fun inputAttachments(vararg inputAttachments: Any)

    /**
     * @param inputSpecification The input specification for this channel.
     * It specifies the key characteristics of the inputs for this channel: the maximum bitrate, the
     * resolution, and the codec.
     */
    public fun inputSpecification(inputSpecification: IResolvable)

    /**
     * @param inputSpecification The input specification for this channel.
     * It specifies the key characteristics of the inputs for this channel: the maximum bitrate, the
     * resolution, and the codec.
     */
    public fun inputSpecification(inputSpecification: CfnChannel.InputSpecificationProperty)

    /**
     * @param inputSpecification The input specification for this channel.
     * It specifies the key characteristics of the inputs for this channel: the maximum bitrate, the
     * resolution, and the codec.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c97a796698ebfa128c571ba04b8d30492718a217b66ee1a20596fd9355025f5f")
    public
        fun inputSpecification(inputSpecification: CfnChannel.InputSpecificationProperty.Builder.() -> Unit)

    /**
     * @param logLevel The verbosity for logging activity for this channel.
     * Charges for logging (which are generated through Amazon CloudWatch Logging) are higher for
     * higher verbosities.
     */
    public fun logLevel(logLevel: String)

    /**
     * @param maintenance Maintenance settings for this channel.
     */
    public fun maintenance(maintenance: IResolvable)

    /**
     * @param maintenance Maintenance settings for this channel.
     */
    public fun maintenance(maintenance: CfnChannel.MaintenanceCreateSettingsProperty)

    /**
     * @param maintenance Maintenance settings for this channel.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12bd38dbc8d3d9620b8cd2d869aa04a7d2f8c82809b2fee60bb5cc1cb24d15af")
    public
        fun maintenance(maintenance: CfnChannel.MaintenanceCreateSettingsProperty.Builder.() -> Unit)

    /**
     * @param name Name of channel.
     */
    public fun name(name: String)

    /**
     * @param roleArn The IAM role for MediaLive to assume when running this channel.
     * The role is identified by its ARN.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags A collection of tags for this channel.
     * Each tag is a key-value pair.
     */
    public fun tags(tags: Any)

    /**
     * @param vpc Settings to enable VPC mode in the channel, so that the endpoints for all outputs
     * are in your VPC.
     */
    public fun vpc(vpc: IResolvable)

    /**
     * @param vpc Settings to enable VPC mode in the channel, so that the endpoints for all outputs
     * are in your VPC.
     */
    public fun vpc(vpc: CfnChannel.VpcOutputSettingsProperty)

    /**
     * @param vpc Settings to enable VPC mode in the channel, so that the endpoints for all outputs
     * are in your VPC.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42009d47de4603978b65045987df80f3ef9a4317bc05191e371fd107c682eae4")
    public fun vpc(vpc: CfnChannel.VpcOutputSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnChannelProps.Builder =
        software.amazon.awscdk.services.medialive.CfnChannelProps.builder()

    /**
     * @param anywhereSettings the value to be set.
     */
    override fun anywhereSettings(anywhereSettings: IResolvable) {
      cdkBuilder.anywhereSettings(anywhereSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param anywhereSettings the value to be set.
     */
    override fun anywhereSettings(anywhereSettings: CfnChannel.AnywhereSettingsProperty) {
      cdkBuilder.anywhereSettings(anywhereSettings.let(CfnChannel.AnywhereSettingsProperty.Companion::unwrap))
    }

    /**
     * @param anywhereSettings the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d92f6999a057d23bb5c801d8dc97e7e93c4c17eb0482f9850cac86595cdd7c8")
    override
        fun anywhereSettings(anywhereSettings: CfnChannel.AnywhereSettingsProperty.Builder.() -> Unit):
        Unit = anywhereSettings(CfnChannel.AnywhereSettingsProperty(anywhereSettings))

    /**
     * @param cdiInputSpecification Specification of CDI inputs for this channel.
     */
    override fun cdiInputSpecification(cdiInputSpecification: IResolvable) {
      cdkBuilder.cdiInputSpecification(cdiInputSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param cdiInputSpecification Specification of CDI inputs for this channel.
     */
    override
        fun cdiInputSpecification(cdiInputSpecification: CfnChannel.CdiInputSpecificationProperty) {
      cdkBuilder.cdiInputSpecification(cdiInputSpecification.let(CfnChannel.CdiInputSpecificationProperty.Companion::unwrap))
    }

    /**
     * @param cdiInputSpecification Specification of CDI inputs for this channel.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52ba2855cc08703a2ee9589e7588fca51b73169c3f98d0b2a6c8b5f12054cc70")
    override
        fun cdiInputSpecification(cdiInputSpecification: CfnChannel.CdiInputSpecificationProperty.Builder.() -> Unit):
        Unit =
        cdiInputSpecification(CfnChannel.CdiInputSpecificationProperty(cdiInputSpecification))

    /**
     * @param channelClass The class for this channel.
     * For a channel with two pipelines, the class is STANDARD. For a channel with one pipeline, the
     * class is SINGLE_PIPELINE.
     */
    override fun channelClass(channelClass: String) {
      cdkBuilder.channelClass(channelClass)
    }

    /**
     * @param channelEngineVersion the value to be set.
     */
    override fun channelEngineVersion(channelEngineVersion: IResolvable) {
      cdkBuilder.channelEngineVersion(channelEngineVersion.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param channelEngineVersion the value to be set.
     */
    override
        fun channelEngineVersion(channelEngineVersion: CfnChannel.ChannelEngineVersionRequestProperty) {
      cdkBuilder.channelEngineVersion(channelEngineVersion.let(CfnChannel.ChannelEngineVersionRequestProperty.Companion::unwrap))
    }

    /**
     * @param channelEngineVersion the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e97752f1d998510ca9970f4335ea335ba94a48f0246bbc22426a3d705ad2ac5")
    override
        fun channelEngineVersion(channelEngineVersion: CfnChannel.ChannelEngineVersionRequestProperty.Builder.() -> Unit):
        Unit =
        channelEngineVersion(CfnChannel.ChannelEngineVersionRequestProperty(channelEngineVersion))

    /**
     * @param destinations The settings that identify the destination for the outputs in this
     * MediaLive output package.
     */
    override fun destinations(destinations: IResolvable) {
      cdkBuilder.destinations(destinations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param destinations The settings that identify the destination for the outputs in this
     * MediaLive output package.
     */
    override fun destinations(destinations: List<Any>) {
      cdkBuilder.destinations(destinations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param destinations The settings that identify the destination for the outputs in this
     * MediaLive output package.
     */
    override fun destinations(vararg destinations: Any): Unit = destinations(destinations.toList())

    /**
     * @param dryRun the value to be set.
     */
    override fun dryRun(dryRun: Boolean) {
      cdkBuilder.dryRun(dryRun)
    }

    /**
     * @param dryRun the value to be set.
     */
    override fun dryRun(dryRun: IResolvable) {
      cdkBuilder.dryRun(dryRun.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param encoderSettings The encoding configuration for the output content.
     */
    override fun encoderSettings(encoderSettings: IResolvable) {
      cdkBuilder.encoderSettings(encoderSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param encoderSettings The encoding configuration for the output content.
     */
    override fun encoderSettings(encoderSettings: CfnChannel.EncoderSettingsProperty) {
      cdkBuilder.encoderSettings(encoderSettings.let(CfnChannel.EncoderSettingsProperty.Companion::unwrap))
    }

    /**
     * @param encoderSettings The encoding configuration for the output content.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dcc0ec157b308f78a2307c9a7bd27a270ddd63e1e272ff10176969a7c49315d1")
    override
        fun encoderSettings(encoderSettings: CfnChannel.EncoderSettingsProperty.Builder.() -> Unit):
        Unit = encoderSettings(CfnChannel.EncoderSettingsProperty(encoderSettings))

    /**
     * @param inputAttachments The list of input attachments for the channel.
     */
    override fun inputAttachments(inputAttachments: IResolvable) {
      cdkBuilder.inputAttachments(inputAttachments.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param inputAttachments The list of input attachments for the channel.
     */
    override fun inputAttachments(inputAttachments: List<Any>) {
      cdkBuilder.inputAttachments(inputAttachments.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param inputAttachments The list of input attachments for the channel.
     */
    override fun inputAttachments(vararg inputAttachments: Any): Unit =
        inputAttachments(inputAttachments.toList())

    /**
     * @param inputSpecification The input specification for this channel.
     * It specifies the key characteristics of the inputs for this channel: the maximum bitrate, the
     * resolution, and the codec.
     */
    override fun inputSpecification(inputSpecification: IResolvable) {
      cdkBuilder.inputSpecification(inputSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param inputSpecification The input specification for this channel.
     * It specifies the key characteristics of the inputs for this channel: the maximum bitrate, the
     * resolution, and the codec.
     */
    override fun inputSpecification(inputSpecification: CfnChannel.InputSpecificationProperty) {
      cdkBuilder.inputSpecification(inputSpecification.let(CfnChannel.InputSpecificationProperty.Companion::unwrap))
    }

    /**
     * @param inputSpecification The input specification for this channel.
     * It specifies the key characteristics of the inputs for this channel: the maximum bitrate, the
     * resolution, and the codec.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c97a796698ebfa128c571ba04b8d30492718a217b66ee1a20596fd9355025f5f")
    override
        fun inputSpecification(inputSpecification: CfnChannel.InputSpecificationProperty.Builder.() -> Unit):
        Unit = inputSpecification(CfnChannel.InputSpecificationProperty(inputSpecification))

    /**
     * @param logLevel The verbosity for logging activity for this channel.
     * Charges for logging (which are generated through Amazon CloudWatch Logging) are higher for
     * higher verbosities.
     */
    override fun logLevel(logLevel: String) {
      cdkBuilder.logLevel(logLevel)
    }

    /**
     * @param maintenance Maintenance settings for this channel.
     */
    override fun maintenance(maintenance: IResolvable) {
      cdkBuilder.maintenance(maintenance.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param maintenance Maintenance settings for this channel.
     */
    override fun maintenance(maintenance: CfnChannel.MaintenanceCreateSettingsProperty) {
      cdkBuilder.maintenance(maintenance.let(CfnChannel.MaintenanceCreateSettingsProperty.Companion::unwrap))
    }

    /**
     * @param maintenance Maintenance settings for this channel.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12bd38dbc8d3d9620b8cd2d869aa04a7d2f8c82809b2fee60bb5cc1cb24d15af")
    override
        fun maintenance(maintenance: CfnChannel.MaintenanceCreateSettingsProperty.Builder.() -> Unit):
        Unit = maintenance(CfnChannel.MaintenanceCreateSettingsProperty(maintenance))

    /**
     * @param name Name of channel.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param roleArn The IAM role for MediaLive to assume when running this channel.
     * The role is identified by its ARN.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags A collection of tags for this channel.
     * Each tag is a key-value pair.
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param vpc Settings to enable VPC mode in the channel, so that the endpoints for all outputs
     * are in your VPC.
     */
    override fun vpc(vpc: IResolvable) {
      cdkBuilder.vpc(vpc.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vpc Settings to enable VPC mode in the channel, so that the endpoints for all outputs
     * are in your VPC.
     */
    override fun vpc(vpc: CfnChannel.VpcOutputSettingsProperty) {
      cdkBuilder.vpc(vpc.let(CfnChannel.VpcOutputSettingsProperty.Companion::unwrap))
    }

    /**
     * @param vpc Settings to enable VPC mode in the channel, so that the endpoints for all outputs
     * are in your VPC.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42009d47de4603978b65045987df80f3ef9a4317bc05191e371fd107c682eae4")
    override fun vpc(vpc: CfnChannel.VpcOutputSettingsProperty.Builder.() -> Unit): Unit =
        vpc(CfnChannel.VpcOutputSettingsProperty(vpc))

    public fun build(): software.amazon.awscdk.services.medialive.CfnChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.medialive.CfnChannelProps,
  ) : CdkObject(cdkObject),
      CfnChannelProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-anywheresettings)
     */
    override fun anywhereSettings(): Any? = unwrap(this).getAnywhereSettings()

    /**
     * Specification of CDI inputs for this channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-cdiinputspecification)
     */
    override fun cdiInputSpecification(): Any? = unwrap(this).getCdiInputSpecification()

    /**
     * The class for this channel.
     *
     * For a channel with two pipelines, the class is STANDARD. For a channel with one pipeline, the
     * class is SINGLE_PIPELINE.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-channelclass)
     */
    override fun channelClass(): String? = unwrap(this).getChannelClass()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-channelengineversion)
     */
    override fun channelEngineVersion(): Any? = unwrap(this).getChannelEngineVersion()

    /**
     * The settings that identify the destination for the outputs in this MediaLive output package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-destinations)
     */
    override fun destinations(): Any? = unwrap(this).getDestinations()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-dryrun)
     */
    override fun dryRun(): Any? = unwrap(this).getDryRun()

    /**
     * The encoding configuration for the output content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-encodersettings)
     */
    override fun encoderSettings(): Any? = unwrap(this).getEncoderSettings()

    /**
     * The list of input attachments for the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-inputattachments)
     */
    override fun inputAttachments(): Any? = unwrap(this).getInputAttachments()

    /**
     * The input specification for this channel.
     *
     * It specifies the key characteristics of the inputs for this channel: the maximum bitrate, the
     * resolution, and the codec.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-inputspecification)
     */
    override fun inputSpecification(): Any? = unwrap(this).getInputSpecification()

    /**
     * The verbosity for logging activity for this channel.
     *
     * Charges for logging (which are generated through Amazon CloudWatch Logging) are higher for
     * higher verbosities.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-loglevel)
     */
    override fun logLevel(): String? = unwrap(this).getLogLevel()

    /**
     * Maintenance settings for this channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-maintenance)
     */
    override fun maintenance(): Any? = unwrap(this).getMaintenance()

    /**
     * Name of channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The IAM role for MediaLive to assume when running this channel.
     *
     * The role is identified by its ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * A collection of tags for this channel.
     *
     * Each tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()

    /**
     * Settings to enable VPC mode in the channel, so that the endpoints for all outputs are in your
     * VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-vpc)
     */
    override fun vpc(): Any? = unwrap(this).getVpc()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannelProps):
        CfnChannelProps = CdkObjectWrappers.wrap(cdkObject) as? CfnChannelProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnChannelProps):
        software.amazon.awscdk.services.medialive.CfnChannelProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.medialive.CfnChannelProps
  }
}
