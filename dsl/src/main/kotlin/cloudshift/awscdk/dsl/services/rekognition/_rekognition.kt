@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rekognition

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rekognition.CfnCollection
import software.amazon.awscdk.services.rekognition.CfnCollectionProps
import software.amazon.awscdk.services.rekognition.CfnProject
import software.amazon.awscdk.services.rekognition.CfnProjectProps
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor
import software.amazon.awscdk.services.rekognition.CfnStreamProcessorProps
import software.constructs.Construct

public object rekognition {
  public inline fun cfnCollection(
    scope: Construct,
    id: String,
    block: CfnCollectionDsl.() -> Unit = {},
  ): CfnCollection {
    val builder = CfnCollectionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCollectionProps(block: CfnCollectionPropsDsl.() -> Unit = {}):
      CfnCollectionProps {
    val builder = CfnCollectionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnProject(
    scope: Construct,
    id: String,
    block: CfnProjectDsl.() -> Unit = {},
  ): CfnProject {
    val builder = CfnProjectDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnProjectProps(block: CfnProjectPropsDsl.() -> Unit = {}): CfnProjectProps {
    val builder = CfnProjectPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStreamProcessor(
    scope: Construct,
    id: String,
    block: CfnStreamProcessorDsl.() -> Unit = {},
  ): CfnStreamProcessor {
    val builder = CfnStreamProcessorDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStreamProcessorBoundingBoxProperty(block: CfnStreamProcessorBoundingBoxPropertyDsl.() -> Unit
      = {}): CfnStreamProcessor.BoundingBoxProperty {
    val builder = CfnStreamProcessorBoundingBoxPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStreamProcessorConnectedHomeSettingsProperty(block: CfnStreamProcessorConnectedHomeSettingsPropertyDsl.() -> Unit
      = {}): CfnStreamProcessor.ConnectedHomeSettingsProperty {
    val builder = CfnStreamProcessorConnectedHomeSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStreamProcessorDataSharingPreferenceProperty(block: CfnStreamProcessorDataSharingPreferencePropertyDsl.() -> Unit
      = {}): CfnStreamProcessor.DataSharingPreferenceProperty {
    val builder = CfnStreamProcessorDataSharingPreferencePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStreamProcessorFaceSearchSettingsProperty(block: CfnStreamProcessorFaceSearchSettingsPropertyDsl.() -> Unit
      = {}): CfnStreamProcessor.FaceSearchSettingsProperty {
    val builder = CfnStreamProcessorFaceSearchSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStreamProcessorKinesisDataStreamProperty(block: CfnStreamProcessorKinesisDataStreamPropertyDsl.() -> Unit
      = {}): CfnStreamProcessor.KinesisDataStreamProperty {
    val builder = CfnStreamProcessorKinesisDataStreamPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStreamProcessorKinesisVideoStreamProperty(block: CfnStreamProcessorKinesisVideoStreamPropertyDsl.() -> Unit
      = {}): CfnStreamProcessor.KinesisVideoStreamProperty {
    val builder = CfnStreamProcessorKinesisVideoStreamPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStreamProcessorNotificationChannelProperty(block: CfnStreamProcessorNotificationChannelPropertyDsl.() -> Unit
      = {}): CfnStreamProcessor.NotificationChannelProperty {
    val builder = CfnStreamProcessorNotificationChannelPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStreamProcessorProps(block: CfnStreamProcessorPropsDsl.() -> Unit = {}):
      CfnStreamProcessorProps {
    val builder = CfnStreamProcessorPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStreamProcessorS3DestinationProperty(block: CfnStreamProcessorS3DestinationPropertyDsl.() -> Unit
      = {}): CfnStreamProcessor.S3DestinationProperty {
    val builder = CfnStreamProcessorS3DestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
