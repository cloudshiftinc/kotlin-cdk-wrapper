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
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnMultiplexprogram

/**
 * Packet identifiers map for a given Multiplex program.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * MultiplexProgramPacketIdentifiersMapProperty multiplexProgramPacketIdentifiersMapProperty =
 * MultiplexProgramPacketIdentifiersMapProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html)
 */
@CdkDslMarker
public class CfnMultiplexprogramMultiplexProgramPacketIdentifiersMapPropertyDsl {
    private val cdkBuilder:
        CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty.Builder =
        CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty.builder()

    private val _audioPids: MutableList<Number> = mutableListOf()

    private val _dvbSubPids: MutableList<Number> = mutableListOf()

    private val _klvDataPids: MutableList<Number> = mutableListOf()

    private val _scte27Pids: MutableList<Number> = mutableListOf()

    /** @param audioPids the value to be set. */
    public fun audioPids(vararg audioPids: Number) {
        _audioPids.addAll(listOf(*audioPids))
    }

    /** @param audioPids the value to be set. */
    public fun audioPids(audioPids: Collection<Number>) {
        _audioPids.addAll(audioPids)
    }

    /** @param audioPids the value to be set. */
    public fun audioPids(audioPids: IResolvable) {
        cdkBuilder.audioPids(audioPids)
    }

    /** @param dvbSubPids the value to be set. */
    public fun dvbSubPids(vararg dvbSubPids: Number) {
        _dvbSubPids.addAll(listOf(*dvbSubPids))
    }

    /** @param dvbSubPids the value to be set. */
    public fun dvbSubPids(dvbSubPids: Collection<Number>) {
        _dvbSubPids.addAll(dvbSubPids)
    }

    /** @param dvbSubPids the value to be set. */
    public fun dvbSubPids(dvbSubPids: IResolvable) {
        cdkBuilder.dvbSubPids(dvbSubPids)
    }

    /** @param dvbTeletextPid the value to be set. */
    public fun dvbTeletextPid(dvbTeletextPid: Number) {
        cdkBuilder.dvbTeletextPid(dvbTeletextPid)
    }

    /** @param etvPlatformPid the value to be set. */
    public fun etvPlatformPid(etvPlatformPid: Number) {
        cdkBuilder.etvPlatformPid(etvPlatformPid)
    }

    /** @param etvSignalPid the value to be set. */
    public fun etvSignalPid(etvSignalPid: Number) {
        cdkBuilder.etvSignalPid(etvSignalPid)
    }

    /** @param klvDataPids the value to be set. */
    public fun klvDataPids(vararg klvDataPids: Number) {
        _klvDataPids.addAll(listOf(*klvDataPids))
    }

    /** @param klvDataPids the value to be set. */
    public fun klvDataPids(klvDataPids: Collection<Number>) {
        _klvDataPids.addAll(klvDataPids)
    }

    /** @param klvDataPids the value to be set. */
    public fun klvDataPids(klvDataPids: IResolvable) {
        cdkBuilder.klvDataPids(klvDataPids)
    }

    /** @param pcrPid the value to be set. */
    public fun pcrPid(pcrPid: Number) {
        cdkBuilder.pcrPid(pcrPid)
    }

    /** @param pmtPid the value to be set. */
    public fun pmtPid(pmtPid: Number) {
        cdkBuilder.pmtPid(pmtPid)
    }

    /** @param privateMetadataPid the value to be set. */
    public fun privateMetadataPid(privateMetadataPid: Number) {
        cdkBuilder.privateMetadataPid(privateMetadataPid)
    }

    /** @param scte27Pids the value to be set. */
    public fun scte27Pids(vararg scte27Pids: Number) {
        _scte27Pids.addAll(listOf(*scte27Pids))
    }

    /** @param scte27Pids the value to be set. */
    public fun scte27Pids(scte27Pids: Collection<Number>) {
        _scte27Pids.addAll(scte27Pids)
    }

    /** @param scte27Pids the value to be set. */
    public fun scte27Pids(scte27Pids: IResolvable) {
        cdkBuilder.scte27Pids(scte27Pids)
    }

    /** @param scte35Pid the value to be set. */
    public fun scte35Pid(scte35Pid: Number) {
        cdkBuilder.scte35Pid(scte35Pid)
    }

    /** @param timedMetadataPid the value to be set. */
    public fun timedMetadataPid(timedMetadataPid: Number) {
        cdkBuilder.timedMetadataPid(timedMetadataPid)
    }

    /** @param videoPid the value to be set. */
    public fun videoPid(videoPid: Number) {
        cdkBuilder.videoPid(videoPid)
    }

    public fun build(): CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty {
        if (_audioPids.isNotEmpty()) cdkBuilder.audioPids(_audioPids)
        if (_dvbSubPids.isNotEmpty()) cdkBuilder.dvbSubPids(_dvbSubPids)
        if (_klvDataPids.isNotEmpty()) cdkBuilder.klvDataPids(_klvDataPids)
        if (_scte27Pids.isNotEmpty()) cdkBuilder.scte27Pids(_scte27Pids)
        return cdkBuilder.build()
    }
}
