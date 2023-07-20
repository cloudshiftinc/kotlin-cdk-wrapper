@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rekognition

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor
import software.constructs.Construct

@CdkDslMarker
public class CfnStreamProcessorDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStreamProcessor.Builder = CfnStreamProcessor.Builder.create(scope, id)

  private val _boundingBoxRegionsOfInterest: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun boundingBoxRegionsOfInterest(vararg boundingBoxRegionsOfInterest: Any) {
    _boundingBoxRegionsOfInterest.addAll(listOf(*boundingBoxRegionsOfInterest))
  }

  public fun boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest: Collection<Any>) {
    _boundingBoxRegionsOfInterest.addAll(boundingBoxRegionsOfInterest)
  }

  public fun boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest: IResolvable) {
    cdkBuilder.boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest)
  }

  public fun connectedHomeSettings(connectedHomeSettings: IResolvable) {
    cdkBuilder.connectedHomeSettings(connectedHomeSettings)
  }

  public
      fun connectedHomeSettings(connectedHomeSettings: CfnStreamProcessor.ConnectedHomeSettingsProperty) {
    cdkBuilder.connectedHomeSettings(connectedHomeSettings)
  }

  public fun dataSharingPreference(dataSharingPreference: IResolvable) {
    cdkBuilder.dataSharingPreference(dataSharingPreference)
  }

  public
      fun dataSharingPreference(dataSharingPreference: CfnStreamProcessor.DataSharingPreferenceProperty) {
    cdkBuilder.dataSharingPreference(dataSharingPreference)
  }

  public fun faceSearchSettings(faceSearchSettings: IResolvable) {
    cdkBuilder.faceSearchSettings(faceSearchSettings)
  }

  public fun faceSearchSettings(faceSearchSettings: CfnStreamProcessor.FaceSearchSettingsProperty) {
    cdkBuilder.faceSearchSettings(faceSearchSettings)
  }

  public fun kinesisDataStream(kinesisDataStream: IResolvable) {
    cdkBuilder.kinesisDataStream(kinesisDataStream)
  }

  public fun kinesisDataStream(kinesisDataStream: CfnStreamProcessor.KinesisDataStreamProperty) {
    cdkBuilder.kinesisDataStream(kinesisDataStream)
  }

  public fun kinesisVideoStream(kinesisVideoStream: IResolvable) {
    cdkBuilder.kinesisVideoStream(kinesisVideoStream)
  }

  public fun kinesisVideoStream(kinesisVideoStream: CfnStreamProcessor.KinesisVideoStreamProperty) {
    cdkBuilder.kinesisVideoStream(kinesisVideoStream)
  }

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun notificationChannel(notificationChannel: IResolvable) {
    cdkBuilder.notificationChannel(notificationChannel)
  }

  public
      fun notificationChannel(notificationChannel: CfnStreamProcessor.NotificationChannelProperty) {
    cdkBuilder.notificationChannel(notificationChannel)
  }

  public fun polygonRegionsOfInterest(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.polygonRegionsOfInterest(builder.map)
  }

  public fun polygonRegionsOfInterest(polygonRegionsOfInterest: Any) {
    cdkBuilder.polygonRegionsOfInterest(polygonRegionsOfInterest)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun s3Destination(s3Destination: IResolvable) {
    cdkBuilder.s3Destination(s3Destination)
  }

  public fun s3Destination(s3Destination: CfnStreamProcessor.S3DestinationProperty) {
    cdkBuilder.s3Destination(s3Destination)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnStreamProcessor {
    if(_boundingBoxRegionsOfInterest.isNotEmpty())
        cdkBuilder.boundingBoxRegionsOfInterest(_boundingBoxRegionsOfInterest)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
