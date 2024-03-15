@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rekognition

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnStreamProcessorProps {
  public fun boundingBoxRegionsOfInterest(): Any? = unwrap(this).getBoundingBoxRegionsOfInterest()

  public fun connectedHomeSettings(): Any? = unwrap(this).getConnectedHomeSettings()

  public fun dataSharingPreference(): Any? = unwrap(this).getDataSharingPreference()

  public fun faceSearchSettings(): Any? = unwrap(this).getFaceSearchSettings()

  public fun kinesisDataStream(): Any? = unwrap(this).getKinesisDataStream()

  public fun kinesisVideoStream(): Any

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun name(): String? = unwrap(this).getName()

  public fun notificationChannel(): Any? = unwrap(this).getNotificationChannel()

  public fun polygonRegionsOfInterest(): Any? = unwrap(this).getPolygonRegionsOfInterest()

  public fun roleArn(): String

  public fun s3Destination(): Any? = unwrap(this).getS3Destination()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest: IResolvable)

    public fun boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest: List<Any>)

    public fun boundingBoxRegionsOfInterest(vararg boundingBoxRegionsOfInterest: Any)

    public fun connectedHomeSettings(connectedHomeSettings: IResolvable)

    public
        fun connectedHomeSettings(connectedHomeSettings: CfnStreamProcessor.ConnectedHomeSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0df4936f52fcb42eec2f2c2eb60e9ff33d357a4962bdcdc3ea0f8c7a80a400c3")
    public
        fun connectedHomeSettings(connectedHomeSettings: CfnStreamProcessor.ConnectedHomeSettingsProperty.Builder.() -> Unit)

    public fun dataSharingPreference(dataSharingPreference: IResolvable)

    public
        fun dataSharingPreference(dataSharingPreference: CfnStreamProcessor.DataSharingPreferenceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25c193032b109d022f26136f97c4a6ae2700a51643a9a3176244fd0a93dccdcd")
    public
        fun dataSharingPreference(dataSharingPreference: CfnStreamProcessor.DataSharingPreferenceProperty.Builder.() -> Unit)

    public fun faceSearchSettings(faceSearchSettings: IResolvable)

    public fun faceSearchSettings(faceSearchSettings: CfnStreamProcessor.FaceSearchSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00d798a714393351c5fa39ec579b00d666182c1e2e3bd85eab59a564e7d98385")
    public
        fun faceSearchSettings(faceSearchSettings: CfnStreamProcessor.FaceSearchSettingsProperty.Builder.() -> Unit)

    public fun kinesisDataStream(kinesisDataStream: IResolvable)

    public fun kinesisDataStream(kinesisDataStream: CfnStreamProcessor.KinesisDataStreamProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0484b1ef33aab25e0e9f97239703054b7b0ceacf94dc9afe6053e4583759053b")
    public
        fun kinesisDataStream(kinesisDataStream: CfnStreamProcessor.KinesisDataStreamProperty.Builder.() -> Unit)

    public fun kinesisVideoStream(kinesisVideoStream: IResolvable)

    public fun kinesisVideoStream(kinesisVideoStream: CfnStreamProcessor.KinesisVideoStreamProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1078dd3e9ea542ce9d1e149c50ef6f9d60335815ba38f5baee0ed416e6eee731")
    public
        fun kinesisVideoStream(kinesisVideoStream: CfnStreamProcessor.KinesisVideoStreamProperty.Builder.() -> Unit)

    public fun kmsKeyId(kmsKeyId: String)

    public fun name(name: String)

    public fun notificationChannel(notificationChannel: IResolvable)

    public
        fun notificationChannel(notificationChannel: CfnStreamProcessor.NotificationChannelProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a296e054d644ab836f0f591f503dd9384d5c11db407db459ad4005ddaf24fc95")
    public
        fun notificationChannel(notificationChannel: CfnStreamProcessor.NotificationChannelProperty.Builder.() -> Unit)

    public fun polygonRegionsOfInterest(polygonRegionsOfInterest: Any)

    public fun roleArn(roleArn: String)

    public fun s3Destination(s3Destination: IResolvable)

    public fun s3Destination(s3Destination: CfnStreamProcessor.S3DestinationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4079668d7a0d539a143987041052690a2e6aad835bc55e3f7d326d985ed5f5a8")
    public
        fun s3Destination(s3Destination: CfnStreamProcessor.S3DestinationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rekognition.CfnStreamProcessorProps.Builder =
        software.amazon.awscdk.services.rekognition.CfnStreamProcessorProps.builder()

    override fun boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest: IResolvable) {
      cdkBuilder.boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest.let(IResolvable::unwrap))
    }

    override fun boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest: List<Any>) {
      cdkBuilder.boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest)
    }

    override fun boundingBoxRegionsOfInterest(vararg boundingBoxRegionsOfInterest: Any): Unit =
        boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest.toList())

    override fun connectedHomeSettings(connectedHomeSettings: IResolvable) {
      cdkBuilder.connectedHomeSettings(connectedHomeSettings.let(IResolvable::unwrap))
    }

    override
        fun connectedHomeSettings(connectedHomeSettings: CfnStreamProcessor.ConnectedHomeSettingsProperty) {
      cdkBuilder.connectedHomeSettings(connectedHomeSettings.let(CfnStreamProcessor.ConnectedHomeSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0df4936f52fcb42eec2f2c2eb60e9ff33d357a4962bdcdc3ea0f8c7a80a400c3")
    override
        fun connectedHomeSettings(connectedHomeSettings: CfnStreamProcessor.ConnectedHomeSettingsProperty.Builder.() -> Unit):
        Unit =
        connectedHomeSettings(CfnStreamProcessor.ConnectedHomeSettingsProperty(connectedHomeSettings))

    override fun dataSharingPreference(dataSharingPreference: IResolvable) {
      cdkBuilder.dataSharingPreference(dataSharingPreference.let(IResolvable::unwrap))
    }

    override
        fun dataSharingPreference(dataSharingPreference: CfnStreamProcessor.DataSharingPreferenceProperty) {
      cdkBuilder.dataSharingPreference(dataSharingPreference.let(CfnStreamProcessor.DataSharingPreferenceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25c193032b109d022f26136f97c4a6ae2700a51643a9a3176244fd0a93dccdcd")
    override
        fun dataSharingPreference(dataSharingPreference: CfnStreamProcessor.DataSharingPreferenceProperty.Builder.() -> Unit):
        Unit =
        dataSharingPreference(CfnStreamProcessor.DataSharingPreferenceProperty(dataSharingPreference))

    override fun faceSearchSettings(faceSearchSettings: IResolvable) {
      cdkBuilder.faceSearchSettings(faceSearchSettings.let(IResolvable::unwrap))
    }

    override
        fun faceSearchSettings(faceSearchSettings: CfnStreamProcessor.FaceSearchSettingsProperty) {
      cdkBuilder.faceSearchSettings(faceSearchSettings.let(CfnStreamProcessor.FaceSearchSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00d798a714393351c5fa39ec579b00d666182c1e2e3bd85eab59a564e7d98385")
    override
        fun faceSearchSettings(faceSearchSettings: CfnStreamProcessor.FaceSearchSettingsProperty.Builder.() -> Unit):
        Unit = faceSearchSettings(CfnStreamProcessor.FaceSearchSettingsProperty(faceSearchSettings))

    override fun kinesisDataStream(kinesisDataStream: IResolvable) {
      cdkBuilder.kinesisDataStream(kinesisDataStream.let(IResolvable::unwrap))
    }

    override
        fun kinesisDataStream(kinesisDataStream: CfnStreamProcessor.KinesisDataStreamProperty) {
      cdkBuilder.kinesisDataStream(kinesisDataStream.let(CfnStreamProcessor.KinesisDataStreamProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0484b1ef33aab25e0e9f97239703054b7b0ceacf94dc9afe6053e4583759053b")
    override
        fun kinesisDataStream(kinesisDataStream: CfnStreamProcessor.KinesisDataStreamProperty.Builder.() -> Unit):
        Unit = kinesisDataStream(CfnStreamProcessor.KinesisDataStreamProperty(kinesisDataStream))

    override fun kinesisVideoStream(kinesisVideoStream: IResolvable) {
      cdkBuilder.kinesisVideoStream(kinesisVideoStream.let(IResolvable::unwrap))
    }

    override
        fun kinesisVideoStream(kinesisVideoStream: CfnStreamProcessor.KinesisVideoStreamProperty) {
      cdkBuilder.kinesisVideoStream(kinesisVideoStream.let(CfnStreamProcessor.KinesisVideoStreamProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1078dd3e9ea542ce9d1e149c50ef6f9d60335815ba38f5baee0ed416e6eee731")
    override
        fun kinesisVideoStream(kinesisVideoStream: CfnStreamProcessor.KinesisVideoStreamProperty.Builder.() -> Unit):
        Unit = kinesisVideoStream(CfnStreamProcessor.KinesisVideoStreamProperty(kinesisVideoStream))

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun notificationChannel(notificationChannel: IResolvable) {
      cdkBuilder.notificationChannel(notificationChannel.let(IResolvable::unwrap))
    }

    override
        fun notificationChannel(notificationChannel: CfnStreamProcessor.NotificationChannelProperty) {
      cdkBuilder.notificationChannel(notificationChannel.let(CfnStreamProcessor.NotificationChannelProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a296e054d644ab836f0f591f503dd9384d5c11db407db459ad4005ddaf24fc95")
    override
        fun notificationChannel(notificationChannel: CfnStreamProcessor.NotificationChannelProperty.Builder.() -> Unit):
        Unit =
        notificationChannel(CfnStreamProcessor.NotificationChannelProperty(notificationChannel))

    override fun polygonRegionsOfInterest(polygonRegionsOfInterest: Any) {
      cdkBuilder.polygonRegionsOfInterest(polygonRegionsOfInterest)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun s3Destination(s3Destination: IResolvable) {
      cdkBuilder.s3Destination(s3Destination.let(IResolvable::unwrap))
    }

    override fun s3Destination(s3Destination: CfnStreamProcessor.S3DestinationProperty) {
      cdkBuilder.s3Destination(s3Destination.let(CfnStreamProcessor.S3DestinationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4079668d7a0d539a143987041052690a2e6aad835bc55e3f7d326d985ed5f5a8")
    override
        fun s3Destination(s3Destination: CfnStreamProcessor.S3DestinationProperty.Builder.() -> Unit):
        Unit = s3Destination(CfnStreamProcessor.S3DestinationProperty(s3Destination))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rekognition.CfnStreamProcessorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rekognition.CfnStreamProcessorProps,
  ) : CdkObject(cdkObject), CfnStreamProcessorProps {
    override fun boundingBoxRegionsOfInterest(): Any? =
        unwrap(this).getBoundingBoxRegionsOfInterest()

    override fun connectedHomeSettings(): Any? = unwrap(this).getConnectedHomeSettings()

    override fun dataSharingPreference(): Any? = unwrap(this).getDataSharingPreference()

    override fun faceSearchSettings(): Any? = unwrap(this).getFaceSearchSettings()

    override fun kinesisDataStream(): Any? = unwrap(this).getKinesisDataStream()

    override fun kinesisVideoStream(): Any = unwrap(this).getKinesisVideoStream()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun name(): String? = unwrap(this).getName()

    override fun notificationChannel(): Any? = unwrap(this).getNotificationChannel()

    override fun polygonRegionsOfInterest(): Any? = unwrap(this).getPolygonRegionsOfInterest()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun s3Destination(): Any? = unwrap(this).getS3Destination()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStreamProcessorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rekognition.CfnStreamProcessorProps):
        CfnStreamProcessorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStreamProcessorProps):
        software.amazon.awscdk.services.rekognition.CfnStreamProcessorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rekognition.CfnStreamProcessorProps
  }
}
