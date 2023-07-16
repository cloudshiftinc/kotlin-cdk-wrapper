@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelHlsGroupSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.HlsGroupSettingsProperty.Builder =
      CfnChannel.HlsGroupSettingsProperty.builder()

  private val _adMarkers: MutableList<String> = mutableListOf()

  private val _captionLanguageMappings: MutableList<Any> = mutableListOf()

  public fun adMarkers(vararg adMarkers: String) {
    _adMarkers.addAll(listOf(*adMarkers))
  }

  public fun adMarkers(adMarkers: Collection<String>) {
    _adMarkers.addAll(adMarkers)
  }

  public fun baseUrlContent(baseUrlContent: String) {
    cdkBuilder.baseUrlContent(baseUrlContent)
  }

  public fun baseUrlContent1(baseUrlContent1: String) {
    cdkBuilder.baseUrlContent1(baseUrlContent1)
  }

  public fun baseUrlManifest(baseUrlManifest: String) {
    cdkBuilder.baseUrlManifest(baseUrlManifest)
  }

  public fun baseUrlManifest1(baseUrlManifest1: String) {
    cdkBuilder.baseUrlManifest1(baseUrlManifest1)
  }

  public fun captionLanguageMappings(vararg captionLanguageMappings: Any) {
    _captionLanguageMappings.addAll(listOf(*captionLanguageMappings))
  }

  public fun captionLanguageMappings(captionLanguageMappings: Collection<Any>) {
    _captionLanguageMappings.addAll(captionLanguageMappings)
  }

  public fun captionLanguageMappings(captionLanguageMappings: IResolvable) {
    cdkBuilder.captionLanguageMappings(captionLanguageMappings)
  }

  public fun captionLanguageSetting(captionLanguageSetting: String) {
    cdkBuilder.captionLanguageSetting(captionLanguageSetting)
  }

  public fun clientCache(clientCache: String) {
    cdkBuilder.clientCache(clientCache)
  }

  public fun codecSpecification(codecSpecification: String) {
    cdkBuilder.codecSpecification(codecSpecification)
  }

  public fun constantIv(constantIv: String) {
    cdkBuilder.constantIv(constantIv)
  }

  public fun destination(destination: IResolvable) {
    cdkBuilder.destination(destination)
  }

  public fun destination(destination: CfnChannel.OutputLocationRefProperty) {
    cdkBuilder.destination(destination)
  }

  public fun directoryStructure(directoryStructure: String) {
    cdkBuilder.directoryStructure(directoryStructure)
  }

  public fun discontinuityTags(discontinuityTags: String) {
    cdkBuilder.discontinuityTags(discontinuityTags)
  }

  public fun encryptionType(encryptionType: String) {
    cdkBuilder.encryptionType(encryptionType)
  }

  public fun hlsCdnSettings(hlsCdnSettings: IResolvable) {
    cdkBuilder.hlsCdnSettings(hlsCdnSettings)
  }

  public fun hlsCdnSettings(hlsCdnSettings: CfnChannel.HlsCdnSettingsProperty) {
    cdkBuilder.hlsCdnSettings(hlsCdnSettings)
  }

  public fun hlsId3SegmentTagging(hlsId3SegmentTagging: String) {
    cdkBuilder.hlsId3SegmentTagging(hlsId3SegmentTagging)
  }

  public fun iFrameOnlyPlaylists(iFrameOnlyPlaylists: String) {
    cdkBuilder.iFrameOnlyPlaylists(iFrameOnlyPlaylists)
  }

  public fun incompleteSegmentBehavior(incompleteSegmentBehavior: String) {
    cdkBuilder.incompleteSegmentBehavior(incompleteSegmentBehavior)
  }

  public fun indexNSegments(indexNSegments: Number) {
    cdkBuilder.indexNSegments(indexNSegments)
  }

  public fun inputLossAction(inputLossAction: String) {
    cdkBuilder.inputLossAction(inputLossAction)
  }

  public fun ivInManifest(ivInManifest: String) {
    cdkBuilder.ivInManifest(ivInManifest)
  }

  public fun ivSource(ivSource: String) {
    cdkBuilder.ivSource(ivSource)
  }

  public fun keepSegments(keepSegments: Number) {
    cdkBuilder.keepSegments(keepSegments)
  }

  public fun keyFormat(keyFormat: String) {
    cdkBuilder.keyFormat(keyFormat)
  }

  public fun keyFormatVersions(keyFormatVersions: String) {
    cdkBuilder.keyFormatVersions(keyFormatVersions)
  }

  public fun keyProviderSettings(keyProviderSettings: IResolvable) {
    cdkBuilder.keyProviderSettings(keyProviderSettings)
  }

  public fun keyProviderSettings(keyProviderSettings: CfnChannel.KeyProviderSettingsProperty) {
    cdkBuilder.keyProviderSettings(keyProviderSettings)
  }

  public fun manifestCompression(manifestCompression: String) {
    cdkBuilder.manifestCompression(manifestCompression)
  }

  public fun manifestDurationFormat(manifestDurationFormat: String) {
    cdkBuilder.manifestDurationFormat(manifestDurationFormat)
  }

  public fun minSegmentLength(minSegmentLength: Number) {
    cdkBuilder.minSegmentLength(minSegmentLength)
  }

  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  public fun outputSelection(outputSelection: String) {
    cdkBuilder.outputSelection(outputSelection)
  }

  public fun programDateTime(programDateTime: String) {
    cdkBuilder.programDateTime(programDateTime)
  }

  public fun programDateTimeClock(programDateTimeClock: String) {
    cdkBuilder.programDateTimeClock(programDateTimeClock)
  }

  public fun programDateTimePeriod(programDateTimePeriod: Number) {
    cdkBuilder.programDateTimePeriod(programDateTimePeriod)
  }

  public fun redundantManifest(redundantManifest: String) {
    cdkBuilder.redundantManifest(redundantManifest)
  }

  public fun segmentLength(segmentLength: Number) {
    cdkBuilder.segmentLength(segmentLength)
  }

  public fun segmentationMode(segmentationMode: String) {
    cdkBuilder.segmentationMode(segmentationMode)
  }

  public fun segmentsPerSubdirectory(segmentsPerSubdirectory: Number) {
    cdkBuilder.segmentsPerSubdirectory(segmentsPerSubdirectory)
  }

  public fun streamInfResolution(streamInfResolution: String) {
    cdkBuilder.streamInfResolution(streamInfResolution)
  }

  public fun timedMetadataId3Frame(timedMetadataId3Frame: String) {
    cdkBuilder.timedMetadataId3Frame(timedMetadataId3Frame)
  }

  public fun timedMetadataId3Period(timedMetadataId3Period: Number) {
    cdkBuilder.timedMetadataId3Period(timedMetadataId3Period)
  }

  public fun timestampDeltaMilliseconds(timestampDeltaMilliseconds: Number) {
    cdkBuilder.timestampDeltaMilliseconds(timestampDeltaMilliseconds)
  }

  public fun tsFileMode(tsFileMode: String) {
    cdkBuilder.tsFileMode(tsFileMode)
  }

  public fun build(): CfnChannel.HlsGroupSettingsProperty {
    if(_adMarkers.isNotEmpty()) cdkBuilder.adMarkers(_adMarkers)
    if(_captionLanguageMappings.isNotEmpty())
        cdkBuilder.captionLanguageMappings(_captionLanguageMappings)
    return cdkBuilder.build()
  }
}
