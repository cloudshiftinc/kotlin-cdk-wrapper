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
import software.amazon.awscdk.services.medialive.CfnMultiplexprogramProps

/**
 * Properties for defining a `CfnMultiplexprogram`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
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
@CdkDslMarker
public class CfnMultiplexprogramPropsDsl {
    private val cdkBuilder: CfnMultiplexprogramProps.Builder = CfnMultiplexprogramProps.builder()

    private val _pipelineDetails: MutableList<Any> = mutableListOf()

    /** @param channelId The unique ID of the channel. */
    public fun channelId(channelId: String) {
        cdkBuilder.channelId(channelId)
    }

    /** @param multiplexId The unique id of the multiplex. */
    public fun multiplexId(multiplexId: String) {
        cdkBuilder.multiplexId(multiplexId)
    }

    /** @param multiplexProgramSettings Multiplex Program settings configuration. */
    public fun multiplexProgramSettings(multiplexProgramSettings: IResolvable) {
        cdkBuilder.multiplexProgramSettings(multiplexProgramSettings)
    }

    /** @param multiplexProgramSettings Multiplex Program settings configuration. */
    public fun multiplexProgramSettings(
        multiplexProgramSettings: CfnMultiplexprogram.MultiplexProgramSettingsProperty
    ) {
        cdkBuilder.multiplexProgramSettings(multiplexProgramSettings)
    }

    /** @param packetIdentifiersMap Packet identifiers map for a given Multiplex program. */
    public fun packetIdentifiersMap(packetIdentifiersMap: IResolvable) {
        cdkBuilder.packetIdentifiersMap(packetIdentifiersMap)
    }

    /** @param packetIdentifiersMap Packet identifiers map for a given Multiplex program. */
    public fun packetIdentifiersMap(
        packetIdentifiersMap: CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty
    ) {
        cdkBuilder.packetIdentifiersMap(packetIdentifiersMap)
    }

    /**
     * @param pipelineDetails Contains information about the current sources for the specified
     *   program in the specified multiplex. Keep in mind that each multiplex pipeline connects to
     *   both pipelines in a given source channel (the channel identified by the program). But only
     *   one of those channel pipelines is ever active at one time.
     */
    public fun pipelineDetails(vararg pipelineDetails: Any) {
        _pipelineDetails.addAll(listOf(*pipelineDetails))
    }

    /**
     * @param pipelineDetails Contains information about the current sources for the specified
     *   program in the specified multiplex. Keep in mind that each multiplex pipeline connects to
     *   both pipelines in a given source channel (the channel identified by the program). But only
     *   one of those channel pipelines is ever active at one time.
     */
    public fun pipelineDetails(pipelineDetails: Collection<Any>) {
        _pipelineDetails.addAll(pipelineDetails)
    }

    /**
     * @param pipelineDetails Contains information about the current sources for the specified
     *   program in the specified multiplex. Keep in mind that each multiplex pipeline connects to
     *   both pipelines in a given source channel (the channel identified by the program). But only
     *   one of those channel pipelines is ever active at one time.
     */
    public fun pipelineDetails(pipelineDetails: IResolvable) {
        cdkBuilder.pipelineDetails(pipelineDetails)
    }

    /**
     * @param preferredChannelPipeline Indicates which pipeline is preferred by the multiplex for
     *   program ingest. If set to "PIPELINE_0" or "PIPELINE_1" and an unhealthy ingest causes the
     *   multiplex to switch to the non-preferred pipeline, it will switch back once that ingest is
     *   healthy again. If set to "CURRENTLY_ACTIVE", it will not switch back to the other pipeline
     *   based on it recovering to a healthy state, it will only switch if the active pipeline
     *   becomes unhealthy.
     */
    public fun preferredChannelPipeline(preferredChannelPipeline: String) {
        cdkBuilder.preferredChannelPipeline(preferredChannelPipeline)
    }

    /** @param programName The name of the multiplex program. */
    public fun programName(programName: String) {
        cdkBuilder.programName(programName)
    }

    public fun build(): CfnMultiplexprogramProps {
        if (_pipelineDetails.isNotEmpty()) cdkBuilder.pipelineDetails(_pipelineDetails)
        return cdkBuilder.build()
    }
}
