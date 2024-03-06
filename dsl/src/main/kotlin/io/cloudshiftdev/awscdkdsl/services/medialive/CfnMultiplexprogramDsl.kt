@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnMultiplexprogram
import software.constructs.Construct

/**
 * Resource schema for AWS::MediaLive::Multiplexprogram.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * CfnMultiplexprogram cfnMultiplexprogram = CfnMultiplexprogram.Builder.create(this,
 * "MyCfnMultiplexprogram")
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
@CdkDslMarker
public class CfnMultiplexprogramDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMultiplexprogram.Builder =
        CfnMultiplexprogram.Builder.create(scope, id)

    private val _pipelineDetails: MutableList<Any> = mutableListOf()

    /**
     * The unique ID of the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-channelid)
     *
     * @param channelId The unique ID of the channel.
     */
    public fun channelId(channelId: String) {
        cdkBuilder.channelId(channelId)
    }

    /**
     * The unique id of the multiplex.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-multiplexid)
     *
     * @param multiplexId The unique id of the multiplex.
     */
    public fun multiplexId(multiplexId: String) {
        cdkBuilder.multiplexId(multiplexId)
    }

    /**
     * Multiplex Program settings configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-multiplexprogramsettings)
     *
     * @param multiplexProgramSettings Multiplex Program settings configuration.
     */
    public fun multiplexProgramSettings(multiplexProgramSettings: IResolvable) {
        cdkBuilder.multiplexProgramSettings(multiplexProgramSettings)
    }

    /**
     * Multiplex Program settings configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-multiplexprogramsettings)
     *
     * @param multiplexProgramSettings Multiplex Program settings configuration.
     */
    public fun multiplexProgramSettings(
        multiplexProgramSettings: CfnMultiplexprogram.MultiplexProgramSettingsProperty
    ) {
        cdkBuilder.multiplexProgramSettings(multiplexProgramSettings)
    }

    /**
     * Packet identifiers map for a given Multiplex program.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-packetidentifiersmap)
     *
     * @param packetIdentifiersMap Packet identifiers map for a given Multiplex program.
     */
    public fun packetIdentifiersMap(packetIdentifiersMap: IResolvable) {
        cdkBuilder.packetIdentifiersMap(packetIdentifiersMap)
    }

    /**
     * Packet identifiers map for a given Multiplex program.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-packetidentifiersmap)
     *
     * @param packetIdentifiersMap Packet identifiers map for a given Multiplex program.
     */
    public fun packetIdentifiersMap(
        packetIdentifiersMap: CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty
    ) {
        cdkBuilder.packetIdentifiersMap(packetIdentifiersMap)
    }

    /**
     * Contains information about the current sources for the specified program in the specified
     * multiplex.
     *
     * Keep in mind that each multiplex pipeline connects to both pipelines in a given source
     * channel (the channel identified by the program). But only one of those channel pipelines is
     * ever active at one time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-pipelinedetails)
     *
     * @param pipelineDetails Contains information about the current sources for the specified
     *   program in the specified multiplex.
     */
    public fun pipelineDetails(vararg pipelineDetails: Any) {
        _pipelineDetails.addAll(listOf(*pipelineDetails))
    }

    /**
     * Contains information about the current sources for the specified program in the specified
     * multiplex.
     *
     * Keep in mind that each multiplex pipeline connects to both pipelines in a given source
     * channel (the channel identified by the program). But only one of those channel pipelines is
     * ever active at one time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-pipelinedetails)
     *
     * @param pipelineDetails Contains information about the current sources for the specified
     *   program in the specified multiplex.
     */
    public fun pipelineDetails(pipelineDetails: Collection<Any>) {
        _pipelineDetails.addAll(pipelineDetails)
    }

    /**
     * Contains information about the current sources for the specified program in the specified
     * multiplex.
     *
     * Keep in mind that each multiplex pipeline connects to both pipelines in a given source
     * channel (the channel identified by the program). But only one of those channel pipelines is
     * ever active at one time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-pipelinedetails)
     *
     * @param pipelineDetails Contains information about the current sources for the specified
     *   program in the specified multiplex.
     */
    public fun pipelineDetails(pipelineDetails: IResolvable) {
        cdkBuilder.pipelineDetails(pipelineDetails)
    }

    /**
     * Indicates which pipeline is preferred by the multiplex for program ingest.
     *
     * If set to "PIPELINE_0" or "PIPELINE_1" and an unhealthy ingest causes the multiplex to switch
     * to the non-preferred pipeline, it will switch back once that ingest is healthy again. If set
     * to "CURRENTLY_ACTIVE", it will not switch back to the other pipeline based on it recovering
     * to a healthy state, it will only switch if the active pipeline becomes unhealthy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-preferredchannelpipeline)
     *
     * @param preferredChannelPipeline Indicates which pipeline is preferred by the multiplex for
     *   program ingest.
     */
    public fun preferredChannelPipeline(preferredChannelPipeline: String) {
        cdkBuilder.preferredChannelPipeline(preferredChannelPipeline)
    }

    /**
     * The name of the multiplex program.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-programname)
     *
     * @param programName The name of the multiplex program.
     */
    public fun programName(programName: String) {
        cdkBuilder.programName(programName)
    }

    public fun build(): CfnMultiplexprogram {
        if (_pipelineDetails.isNotEmpty()) cdkBuilder.pipelineDetails(_pipelineDetails)
        return cdkBuilder.build()
    }
}
