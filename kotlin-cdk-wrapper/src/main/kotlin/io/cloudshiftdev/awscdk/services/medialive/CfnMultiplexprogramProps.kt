@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnMultiplexprogram`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * CfnMultiplexprogramProps cfnMultiplexprogramProps = CfnMultiplexprogramProps.builder()
 * .channelId("channelId")
 * .multiplexId("multiplexId")
 * .multiplexProgramSettings(MultiplexProgramSettingsProperty.builder()
 * .programNumber(123)
 * // the properties below are optional
 * .preferredChannelPipeline("preferredChannelPipeline")
 * .serviceDescriptor(MultiplexProgramServiceDescriptorProperty.builder()
 * .providerName("providerName")
 * .serviceName("serviceName")
 * .build())
 * .videoSettings(MultiplexVideoSettingsProperty.builder()
 * .constantBitrate(123)
 * .statmuxSettings(MultiplexStatmuxVideoSettingsProperty.builder()
 * .maximumBitrate(123)
 * .minimumBitrate(123)
 * .priority(123)
 * .build())
 * .build())
 * .build())
 * .packetIdentifiersMap(MultiplexProgramPacketIdentifiersMapProperty.builder()
 * .audioPids(List.of(123))
 * .dvbSubPids(List.of(123))
 * .dvbTeletextPid(123)
 * .etvPlatformPid(123)
 * .etvSignalPid(123)
 * .klvDataPids(List.of(123))
 * .pcrPid(123)
 * .pmtPid(123)
 * .privateMetadataPid(123)
 * .scte27Pids(List.of(123))
 * .scte35Pid(123)
 * .timedMetadataPid(123)
 * .videoPid(123)
 * .build())
 * .pipelineDetails(List.of(MultiplexProgramPipelineDetailProperty.builder()
 * .activeChannelPipeline("activeChannelPipeline")
 * .pipelineId("pipelineId")
 * .build()))
 * .preferredChannelPipeline("preferredChannelPipeline")
 * .programName("programName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html)
 */
public interface CfnMultiplexprogramProps {
  /**
   * The unique ID of the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-channelid)
   */
  public fun channelId(): String? = unwrap(this).getChannelId()

  /**
   * The unique id of the multiplex.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-multiplexid)
   */
  public fun multiplexId(): String? = unwrap(this).getMultiplexId()

  /**
   * Multiplex Program settings configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-multiplexprogramsettings)
   */
  public fun multiplexProgramSettings(): Any? = unwrap(this).getMultiplexProgramSettings()

  /**
   * Packet identifiers map for a given Multiplex program.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-packetidentifiersmap)
   */
  public fun packetIdentifiersMap(): Any? = unwrap(this).getPacketIdentifiersMap()

  /**
   * Contains information about the current sources for the specified program in the specified
   * multiplex.
   *
   * Keep in mind that each multiplex pipeline connects to both pipelines in a given source channel
   * (the channel identified by the program). But only one of those channel pipelines is ever active at
   * one time.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-pipelinedetails)
   */
  public fun pipelineDetails(): Any? = unwrap(this).getPipelineDetails()

  /**
   * Indicates which pipeline is preferred by the multiplex for program ingest.
   *
   * If set to "PIPELINE_0" or "PIPELINE_1" and an unhealthy ingest causes the multiplex to switch
   * to the non-preferred pipeline,
   * it will switch back once that ingest is healthy again. If set to "CURRENTLY_ACTIVE",
   * it will not switch back to the other pipeline based on it recovering to a healthy state,
   * it will only switch if the active pipeline becomes unhealthy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-preferredchannelpipeline)
   */
  public fun preferredChannelPipeline(): String? = unwrap(this).getPreferredChannelPipeline()

  /**
   * The name of the multiplex program.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-programname)
   */
  public fun programName(): String? = unwrap(this).getProgramName()

  /**
   * A builder for [CfnMultiplexprogramProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param channelId The unique ID of the channel.
     */
    public fun channelId(channelId: String)

    /**
     * @param multiplexId The unique id of the multiplex.
     */
    public fun multiplexId(multiplexId: String)

    /**
     * @param multiplexProgramSettings Multiplex Program settings configuration.
     */
    public fun multiplexProgramSettings(multiplexProgramSettings: IResolvable)

    /**
     * @param multiplexProgramSettings Multiplex Program settings configuration.
     */
    public
        fun multiplexProgramSettings(multiplexProgramSettings: CfnMultiplexprogram.MultiplexProgramSettingsProperty)

    /**
     * @param multiplexProgramSettings Multiplex Program settings configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f86e838824de0bc11c5110b5446a9979e87cf0041223062bc7ac6f30eb20167")
    public
        fun multiplexProgramSettings(multiplexProgramSettings: CfnMultiplexprogram.MultiplexProgramSettingsProperty.Builder.() -> Unit)

    /**
     * @param packetIdentifiersMap Packet identifiers map for a given Multiplex program.
     */
    public fun packetIdentifiersMap(packetIdentifiersMap: IResolvable)

    /**
     * @param packetIdentifiersMap Packet identifiers map for a given Multiplex program.
     */
    public
        fun packetIdentifiersMap(packetIdentifiersMap: CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty)

    /**
     * @param packetIdentifiersMap Packet identifiers map for a given Multiplex program.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46950dcf087d812755c96b310e4d26126f47af1f8f3ed21d991060bf2e424791")
    public
        fun packetIdentifiersMap(packetIdentifiersMap: CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty.Builder.() -> Unit)

    /**
     * @param pipelineDetails Contains information about the current sources for the specified
     * program in the specified multiplex.
     * Keep in mind that each multiplex pipeline connects to both pipelines in a given source
     * channel (the channel identified by the program). But only one of those channel pipelines is ever
     * active at one time.
     */
    public fun pipelineDetails(pipelineDetails: IResolvable)

    /**
     * @param pipelineDetails Contains information about the current sources for the specified
     * program in the specified multiplex.
     * Keep in mind that each multiplex pipeline connects to both pipelines in a given source
     * channel (the channel identified by the program). But only one of those channel pipelines is ever
     * active at one time.
     */
    public fun pipelineDetails(pipelineDetails: List<Any>)

    /**
     * @param pipelineDetails Contains information about the current sources for the specified
     * program in the specified multiplex.
     * Keep in mind that each multiplex pipeline connects to both pipelines in a given source
     * channel (the channel identified by the program). But only one of those channel pipelines is ever
     * active at one time.
     */
    public fun pipelineDetails(vararg pipelineDetails: Any)

    /**
     * @param preferredChannelPipeline Indicates which pipeline is preferred by the multiplex for
     * program ingest.
     * If set to "PIPELINE_0" or "PIPELINE_1" and an unhealthy ingest causes the multiplex to switch
     * to the non-preferred pipeline,
     * it will switch back once that ingest is healthy again. If set to "CURRENTLY_ACTIVE",
     * it will not switch back to the other pipeline based on it recovering to a healthy state,
     * it will only switch if the active pipeline becomes unhealthy.
     */
    public fun preferredChannelPipeline(preferredChannelPipeline: String)

    /**
     * @param programName The name of the multiplex program.
     */
    public fun programName(programName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.medialive.CfnMultiplexprogramProps.Builder =
        software.amazon.awscdk.services.medialive.CfnMultiplexprogramProps.builder()

    /**
     * @param channelId The unique ID of the channel.
     */
    override fun channelId(channelId: String) {
      cdkBuilder.channelId(channelId)
    }

    /**
     * @param multiplexId The unique id of the multiplex.
     */
    override fun multiplexId(multiplexId: String) {
      cdkBuilder.multiplexId(multiplexId)
    }

    /**
     * @param multiplexProgramSettings Multiplex Program settings configuration.
     */
    override fun multiplexProgramSettings(multiplexProgramSettings: IResolvable) {
      cdkBuilder.multiplexProgramSettings(multiplexProgramSettings.let(IResolvable::unwrap))
    }

    /**
     * @param multiplexProgramSettings Multiplex Program settings configuration.
     */
    override
        fun multiplexProgramSettings(multiplexProgramSettings: CfnMultiplexprogram.MultiplexProgramSettingsProperty) {
      cdkBuilder.multiplexProgramSettings(multiplexProgramSettings.let(CfnMultiplexprogram.MultiplexProgramSettingsProperty::unwrap))
    }

    /**
     * @param multiplexProgramSettings Multiplex Program settings configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f86e838824de0bc11c5110b5446a9979e87cf0041223062bc7ac6f30eb20167")
    override
        fun multiplexProgramSettings(multiplexProgramSettings: CfnMultiplexprogram.MultiplexProgramSettingsProperty.Builder.() -> Unit):
        Unit =
        multiplexProgramSettings(CfnMultiplexprogram.MultiplexProgramSettingsProperty(multiplexProgramSettings))

    /**
     * @param packetIdentifiersMap Packet identifiers map for a given Multiplex program.
     */
    override fun packetIdentifiersMap(packetIdentifiersMap: IResolvable) {
      cdkBuilder.packetIdentifiersMap(packetIdentifiersMap.let(IResolvable::unwrap))
    }

    /**
     * @param packetIdentifiersMap Packet identifiers map for a given Multiplex program.
     */
    override
        fun packetIdentifiersMap(packetIdentifiersMap: CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty) {
      cdkBuilder.packetIdentifiersMap(packetIdentifiersMap.let(CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty::unwrap))
    }

    /**
     * @param packetIdentifiersMap Packet identifiers map for a given Multiplex program.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46950dcf087d812755c96b310e4d26126f47af1f8f3ed21d991060bf2e424791")
    override
        fun packetIdentifiersMap(packetIdentifiersMap: CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty.Builder.() -> Unit):
        Unit =
        packetIdentifiersMap(CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty(packetIdentifiersMap))

    /**
     * @param pipelineDetails Contains information about the current sources for the specified
     * program in the specified multiplex.
     * Keep in mind that each multiplex pipeline connects to both pipelines in a given source
     * channel (the channel identified by the program). But only one of those channel pipelines is ever
     * active at one time.
     */
    override fun pipelineDetails(pipelineDetails: IResolvable) {
      cdkBuilder.pipelineDetails(pipelineDetails.let(IResolvable::unwrap))
    }

    /**
     * @param pipelineDetails Contains information about the current sources for the specified
     * program in the specified multiplex.
     * Keep in mind that each multiplex pipeline connects to both pipelines in a given source
     * channel (the channel identified by the program). But only one of those channel pipelines is ever
     * active at one time.
     */
    override fun pipelineDetails(pipelineDetails: List<Any>) {
      cdkBuilder.pipelineDetails(pipelineDetails)
    }

    /**
     * @param pipelineDetails Contains information about the current sources for the specified
     * program in the specified multiplex.
     * Keep in mind that each multiplex pipeline connects to both pipelines in a given source
     * channel (the channel identified by the program). But only one of those channel pipelines is ever
     * active at one time.
     */
    override fun pipelineDetails(vararg pipelineDetails: Any): Unit =
        pipelineDetails(pipelineDetails.toList())

    /**
     * @param preferredChannelPipeline Indicates which pipeline is preferred by the multiplex for
     * program ingest.
     * If set to "PIPELINE_0" or "PIPELINE_1" and an unhealthy ingest causes the multiplex to switch
     * to the non-preferred pipeline,
     * it will switch back once that ingest is healthy again. If set to "CURRENTLY_ACTIVE",
     * it will not switch back to the other pipeline based on it recovering to a healthy state,
     * it will only switch if the active pipeline becomes unhealthy.
     */
    override fun preferredChannelPipeline(preferredChannelPipeline: String) {
      cdkBuilder.preferredChannelPipeline(preferredChannelPipeline)
    }

    /**
     * @param programName The name of the multiplex program.
     */
    override fun programName(programName: String) {
      cdkBuilder.programName(programName)
    }

    public fun build(): software.amazon.awscdk.services.medialive.CfnMultiplexprogramProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplexprogramProps,
  ) : CdkObject(cdkObject), CfnMultiplexprogramProps {
    /**
     * The unique ID of the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-channelid)
     */
    override fun channelId(): String? = unwrap(this).getChannelId()

    /**
     * The unique id of the multiplex.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-multiplexid)
     */
    override fun multiplexId(): String? = unwrap(this).getMultiplexId()

    /**
     * Multiplex Program settings configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-multiplexprogramsettings)
     */
    override fun multiplexProgramSettings(): Any? = unwrap(this).getMultiplexProgramSettings()

    /**
     * Packet identifiers map for a given Multiplex program.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-packetidentifiersmap)
     */
    override fun packetIdentifiersMap(): Any? = unwrap(this).getPacketIdentifiersMap()

    /**
     * Contains information about the current sources for the specified program in the specified
     * multiplex.
     *
     * Keep in mind that each multiplex pipeline connects to both pipelines in a given source
     * channel (the channel identified by the program). But only one of those channel pipelines is ever
     * active at one time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-pipelinedetails)
     */
    override fun pipelineDetails(): Any? = unwrap(this).getPipelineDetails()

    /**
     * Indicates which pipeline is preferred by the multiplex for program ingest.
     *
     * If set to "PIPELINE_0" or "PIPELINE_1" and an unhealthy ingest causes the multiplex to switch
     * to the non-preferred pipeline,
     * it will switch back once that ingest is healthy again. If set to "CURRENTLY_ACTIVE",
     * it will not switch back to the other pipeline based on it recovering to a healthy state,
     * it will only switch if the active pipeline becomes unhealthy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-preferredchannelpipeline)
     */
    override fun preferredChannelPipeline(): String? = unwrap(this).getPreferredChannelPipeline()

    /**
     * The name of the multiplex program.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-programname)
     */
    override fun programName(): String? = unwrap(this).getProgramName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMultiplexprogramProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplexprogramProps):
        CfnMultiplexprogramProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMultiplexprogramProps):
        software.amazon.awscdk.services.medialive.CfnMultiplexprogramProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.medialive.CfnMultiplexprogramProps
  }
}
