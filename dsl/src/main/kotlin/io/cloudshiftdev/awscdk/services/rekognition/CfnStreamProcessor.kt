package io.cloudshiftdev.awscdk.services.rekognition

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStreamProcessor internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rekognition.CfnStreamProcessor,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

  public open fun boundingBoxRegionsOfInterest(): Any? =
      unwrap(this).getBoundingBoxRegionsOfInterest()

  public open fun boundingBoxRegionsOfInterest(`value`: IResolvable) {
    unwrap(this).setBoundingBoxRegionsOfInterest(`value`.let(IResolvable::unwrap))
  }

  public open fun boundingBoxRegionsOfInterest(__idx_ac66f0: List<Any>) {
    unwrap(this).setBoundingBoxRegionsOfInterest(__idx_ac66f0)
  }

  public open fun boundingBoxRegionsOfInterest(vararg __idx_ac66f0: Any): Unit =
      boundingBoxRegionsOfInterest(__idx_ac66f0.toList())

  public open fun connectedHomeSettings(): Any? = unwrap(this).getConnectedHomeSettings()

  public open fun connectedHomeSettings(`value`: IResolvable) {
    unwrap(this).setConnectedHomeSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun connectedHomeSettings(`value`: ConnectedHomeSettingsProperty) {
    unwrap(this).setConnectedHomeSettings(`value`.let(ConnectedHomeSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9530bf209475bcab6efc9bad07658e4b6fed74e07075ff9bc8928b5d1b141eee")
  public open fun connectedHomeSettings(`value`: ConnectedHomeSettingsProperty.Builder.() -> Unit):
      Unit = connectedHomeSettings(ConnectedHomeSettingsProperty(`value`))

  public open fun dataSharingPreference(): Any? = unwrap(this).getDataSharingPreference()

  public open fun dataSharingPreference(`value`: IResolvable) {
    unwrap(this).setDataSharingPreference(`value`.let(IResolvable::unwrap))
  }

  public open fun dataSharingPreference(`value`: DataSharingPreferenceProperty) {
    unwrap(this).setDataSharingPreference(`value`.let(DataSharingPreferenceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e26b3bc42d0bc3272ed36de8710bb622d34048dfe857510696bece32d0e8d298")
  public open fun dataSharingPreference(`value`: DataSharingPreferenceProperty.Builder.() -> Unit):
      Unit = dataSharingPreference(DataSharingPreferenceProperty(`value`))

  public open fun faceSearchSettings(): Any? = unwrap(this).getFaceSearchSettings()

  public open fun faceSearchSettings(`value`: IResolvable) {
    unwrap(this).setFaceSearchSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun faceSearchSettings(`value`: FaceSearchSettingsProperty) {
    unwrap(this).setFaceSearchSettings(`value`.let(FaceSearchSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a116ccf30b6d2932eae1fde1a79faed9d6627b797d55cca752d9cd7777dc642e")
  public open fun faceSearchSettings(`value`: FaceSearchSettingsProperty.Builder.() -> Unit): Unit =
      faceSearchSettings(FaceSearchSettingsProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kinesisDataStream(): Any? = unwrap(this).getKinesisDataStream()

  public open fun kinesisDataStream(`value`: IResolvable) {
    unwrap(this).setKinesisDataStream(`value`.let(IResolvable::unwrap))
  }

  public open fun kinesisDataStream(`value`: KinesisDataStreamProperty) {
    unwrap(this).setKinesisDataStream(`value`.let(KinesisDataStreamProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc13ec97d87ca5a32c33147f4015c264a27551347ed5219815f562ba3db3fecb")
  public open fun kinesisDataStream(`value`: KinesisDataStreamProperty.Builder.() -> Unit): Unit =
      kinesisDataStream(KinesisDataStreamProperty(`value`))

  public open fun kinesisVideoStream(): Any = unwrap(this).getKinesisVideoStream()

  public open fun kinesisVideoStream(`value`: IResolvable) {
    unwrap(this).setKinesisVideoStream(`value`.let(IResolvable::unwrap))
  }

  public open fun kinesisVideoStream(`value`: KinesisVideoStreamProperty) {
    unwrap(this).setKinesisVideoStream(`value`.let(KinesisVideoStreamProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6246b62bce18fa918390220a01b856d41b358f61bf4e017b3196bd83c1b1d1ae")
  public open fun kinesisVideoStream(`value`: KinesisVideoStreamProperty.Builder.() -> Unit): Unit =
      kinesisVideoStream(KinesisVideoStreamProperty(`value`))

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun notificationChannel(): Any? = unwrap(this).getNotificationChannel()

  public open fun notificationChannel(`value`: IResolvable) {
    unwrap(this).setNotificationChannel(`value`.let(IResolvable::unwrap))
  }

  public open fun notificationChannel(`value`: NotificationChannelProperty) {
    unwrap(this).setNotificationChannel(`value`.let(NotificationChannelProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("63a823012ae69928fc478933f674f70c8cc37ba00f318f89fc49079df4d12f7d")
  public open fun notificationChannel(`value`: NotificationChannelProperty.Builder.() -> Unit): Unit
      = notificationChannel(NotificationChannelProperty(`value`))

  public open fun polygonRegionsOfInterest(): Any? = unwrap(this).getPolygonRegionsOfInterest()

  public open fun polygonRegionsOfInterest(`value`: Any) {
    unwrap(this).setPolygonRegionsOfInterest(`value`)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun s3Destination(): Any? = unwrap(this).getS3Destination()

  public open fun s3Destination(`value`: IResolvable) {
    unwrap(this).setS3Destination(`value`.let(IResolvable::unwrap))
  }

  public open fun s3Destination(`value`: S3DestinationProperty) {
    unwrap(this).setS3Destination(`value`.let(S3DestinationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c486822afa96b644d8e314f2de6c5e75bf084e891a7b29e89c9216c783eeaebb")
  public open fun s3Destination(`value`: S3DestinationProperty.Builder.() -> Unit): Unit =
      s3Destination(S3DestinationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest: IResolvable)

    public fun boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest: List<Any>)

    public fun boundingBoxRegionsOfInterest(vararg boundingBoxRegionsOfInterest: Any)

    public fun connectedHomeSettings(connectedHomeSettings: IResolvable)

    public fun connectedHomeSettings(connectedHomeSettings: ConnectedHomeSettingsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6dcc189d64dd7b9e39501f9bf61298a83859e475de162997eb0899961553f788")
    public
        fun connectedHomeSettings(connectedHomeSettings: ConnectedHomeSettingsProperty.Builder.() -> Unit)

    public fun dataSharingPreference(dataSharingPreference: IResolvable)

    public fun dataSharingPreference(dataSharingPreference: DataSharingPreferenceProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e60578ad8922c64e0c0ae907cb984e9edd221c57e73ceb3adeafbc9ceee53c1b")
    public
        fun dataSharingPreference(dataSharingPreference: DataSharingPreferenceProperty.Builder.() -> Unit)

    public fun faceSearchSettings(faceSearchSettings: IResolvable)

    public fun faceSearchSettings(faceSearchSettings: FaceSearchSettingsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82fc4261e3fd5e80298d1996f3e3c9cb76cc436f381309ca4c188f7283265555")
    public fun faceSearchSettings(faceSearchSettings: FaceSearchSettingsProperty.Builder.() -> Unit)

    public fun kinesisDataStream(kinesisDataStream: IResolvable)

    public fun kinesisDataStream(kinesisDataStream: KinesisDataStreamProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1327b8dfe08728ad8a4a963d4d8113fd2de16847b083f60dba7fd09e3c38a56b")
    public fun kinesisDataStream(kinesisDataStream: KinesisDataStreamProperty.Builder.() -> Unit)

    public fun kinesisVideoStream(kinesisVideoStream: IResolvable)

    public fun kinesisVideoStream(kinesisVideoStream: KinesisVideoStreamProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e6cd4d5b1ef02e8a26a9ea52d0de652e36e2c355e6e5a868c4b37ff6bc0f6019")
    public fun kinesisVideoStream(kinesisVideoStream: KinesisVideoStreamProperty.Builder.() -> Unit)

    public fun kmsKeyId(kmsKeyId: String)

    public fun name(name: String)

    public fun notificationChannel(notificationChannel: IResolvable)

    public fun notificationChannel(notificationChannel: NotificationChannelProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6de3e7e6dcf25778967cf555d6cd8f7e27b9d67c26332a4c8fd43bafdd64a998")
    public
        fun notificationChannel(notificationChannel: NotificationChannelProperty.Builder.() -> Unit)

    public fun polygonRegionsOfInterest(polygonRegionsOfInterest: Any)

    public fun roleArn(roleArn: String)

    public fun s3Destination(s3Destination: IResolvable)

    public fun s3Destination(s3Destination: S3DestinationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("157e6c6a57e4e2b0411189d582a8d38aed20235a06a942c6a3e506552af482f8")
    public fun s3Destination(s3Destination: S3DestinationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rekognition.CfnStreamProcessor.Builder =
        software.amazon.awscdk.services.rekognition.CfnStreamProcessor.Builder.create(scope, id)

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

    override fun connectedHomeSettings(connectedHomeSettings: ConnectedHomeSettingsProperty) {
      cdkBuilder.connectedHomeSettings(connectedHomeSettings.let(ConnectedHomeSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6dcc189d64dd7b9e39501f9bf61298a83859e475de162997eb0899961553f788")
    override
        fun connectedHomeSettings(connectedHomeSettings: ConnectedHomeSettingsProperty.Builder.() -> Unit):
        Unit = connectedHomeSettings(ConnectedHomeSettingsProperty(connectedHomeSettings))

    override fun dataSharingPreference(dataSharingPreference: IResolvable) {
      cdkBuilder.dataSharingPreference(dataSharingPreference.let(IResolvable::unwrap))
    }

    override fun dataSharingPreference(dataSharingPreference: DataSharingPreferenceProperty) {
      cdkBuilder.dataSharingPreference(dataSharingPreference.let(DataSharingPreferenceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e60578ad8922c64e0c0ae907cb984e9edd221c57e73ceb3adeafbc9ceee53c1b")
    override
        fun dataSharingPreference(dataSharingPreference: DataSharingPreferenceProperty.Builder.() -> Unit):
        Unit = dataSharingPreference(DataSharingPreferenceProperty(dataSharingPreference))

    override fun faceSearchSettings(faceSearchSettings: IResolvable) {
      cdkBuilder.faceSearchSettings(faceSearchSettings.let(IResolvable::unwrap))
    }

    override fun faceSearchSettings(faceSearchSettings: FaceSearchSettingsProperty) {
      cdkBuilder.faceSearchSettings(faceSearchSettings.let(FaceSearchSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82fc4261e3fd5e80298d1996f3e3c9cb76cc436f381309ca4c188f7283265555")
    override
        fun faceSearchSettings(faceSearchSettings: FaceSearchSettingsProperty.Builder.() -> Unit):
        Unit = faceSearchSettings(FaceSearchSettingsProperty(faceSearchSettings))

    override fun kinesisDataStream(kinesisDataStream: IResolvable) {
      cdkBuilder.kinesisDataStream(kinesisDataStream.let(IResolvable::unwrap))
    }

    override fun kinesisDataStream(kinesisDataStream: KinesisDataStreamProperty) {
      cdkBuilder.kinesisDataStream(kinesisDataStream.let(KinesisDataStreamProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1327b8dfe08728ad8a4a963d4d8113fd2de16847b083f60dba7fd09e3c38a56b")
    override fun kinesisDataStream(kinesisDataStream: KinesisDataStreamProperty.Builder.() -> Unit):
        Unit = kinesisDataStream(KinesisDataStreamProperty(kinesisDataStream))

    override fun kinesisVideoStream(kinesisVideoStream: IResolvable) {
      cdkBuilder.kinesisVideoStream(kinesisVideoStream.let(IResolvable::unwrap))
    }

    override fun kinesisVideoStream(kinesisVideoStream: KinesisVideoStreamProperty) {
      cdkBuilder.kinesisVideoStream(kinesisVideoStream.let(KinesisVideoStreamProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e6cd4d5b1ef02e8a26a9ea52d0de652e36e2c355e6e5a868c4b37ff6bc0f6019")
    override
        fun kinesisVideoStream(kinesisVideoStream: KinesisVideoStreamProperty.Builder.() -> Unit):
        Unit = kinesisVideoStream(KinesisVideoStreamProperty(kinesisVideoStream))

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun notificationChannel(notificationChannel: IResolvable) {
      cdkBuilder.notificationChannel(notificationChannel.let(IResolvable::unwrap))
    }

    override fun notificationChannel(notificationChannel: NotificationChannelProperty) {
      cdkBuilder.notificationChannel(notificationChannel.let(NotificationChannelProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6de3e7e6dcf25778967cf555d6cd8f7e27b9d67c26332a4c8fd43bafdd64a998")
    override
        fun notificationChannel(notificationChannel: NotificationChannelProperty.Builder.() -> Unit):
        Unit = notificationChannel(NotificationChannelProperty(notificationChannel))

    override fun polygonRegionsOfInterest(polygonRegionsOfInterest: Any) {
      cdkBuilder.polygonRegionsOfInterest(polygonRegionsOfInterest)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun s3Destination(s3Destination: IResolvable) {
      cdkBuilder.s3Destination(s3Destination.let(IResolvable::unwrap))
    }

    override fun s3Destination(s3Destination: S3DestinationProperty) {
      cdkBuilder.s3Destination(s3Destination.let(S3DestinationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("157e6c6a57e4e2b0411189d582a8d38aed20235a06a942c6a3e506552af482f8")
    override fun s3Destination(s3Destination: S3DestinationProperty.Builder.() -> Unit): Unit =
        s3Destination(S3DestinationProperty(s3Destination))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rekognition.CfnStreamProcessor =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStreamProcessor {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStreamProcessor(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rekognition.CfnStreamProcessor):
        CfnStreamProcessor = CfnStreamProcessor(cdkObject)

    internal fun unwrap(wrapped: CfnStreamProcessor):
        software.amazon.awscdk.services.rekognition.CfnStreamProcessor = wrapped.cdkObject
  }

  public interface DataSharingPreferenceProperty {
    public fun optIn(): Any

    public interface Builder {
      public fun optIn(optIn: Boolean)

      public fun optIn(optIn: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.DataSharingPreferenceProperty.Builder
          =
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.DataSharingPreferenceProperty.builder()

      override fun optIn(optIn: Boolean) {
        cdkBuilder.optIn(optIn)
      }

      override fun optIn(optIn: IResolvable) {
        cdkBuilder.optIn(optIn.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.DataSharingPreferenceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.DataSharingPreferenceProperty,
    ) : DataSharingPreferenceProperty {
      override fun optIn(): Any = unwrap(this).getOptIn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataSharingPreferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rekognition.CfnStreamProcessor.DataSharingPreferenceProperty):
          DataSharingPreferenceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSharingPreferenceProperty):
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.DataSharingPreferenceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface NotificationChannelProperty {
    public fun arn(): String

    public interface Builder {
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.NotificationChannelProperty.Builder
          =
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.NotificationChannelProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.NotificationChannelProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.NotificationChannelProperty,
    ) : NotificationChannelProperty {
      override fun arn(): String = unwrap(this).getArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NotificationChannelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rekognition.CfnStreamProcessor.NotificationChannelProperty):
          NotificationChannelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationChannelProperty):
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.NotificationChannelProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface BoundingBoxProperty {
    public fun height(): Number

    public fun left(): Number

    public fun top(): Number

    public fun width(): Number

    public interface Builder {
      public fun height(height: Number)

      public fun left(left: Number)

      public fun top(top: Number)

      public fun width(width: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.BoundingBoxProperty.Builder
          =
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.BoundingBoxProperty.builder()

      override fun height(height: Number) {
        cdkBuilder.height(height)
      }

      override fun left(left: Number) {
        cdkBuilder.left(left)
      }

      override fun top(top: Number) {
        cdkBuilder.top(top)
      }

      override fun width(width: Number) {
        cdkBuilder.width(width)
      }

      public fun build():
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.BoundingBoxProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.BoundingBoxProperty,
    ) : BoundingBoxProperty {
      override fun height(): Number = unwrap(this).getHeight()

      override fun left(): Number = unwrap(this).getLeft()

      override fun top(): Number = unwrap(this).getTop()

      override fun width(): Number = unwrap(this).getWidth()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BoundingBoxProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rekognition.CfnStreamProcessor.BoundingBoxProperty):
          BoundingBoxProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BoundingBoxProperty):
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.BoundingBoxProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConnectedHomeSettingsProperty {
    public fun labels(): List<String>

    public fun minConfidence(): Number? = unwrap(this).getMinConfidence()

    public interface Builder {
      public fun labels(labels: List<String>)

      public fun labels(vararg labels: String)

      public fun minConfidence(minConfidence: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.ConnectedHomeSettingsProperty.Builder
          =
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.ConnectedHomeSettingsProperty.builder()

      override fun labels(labels: List<String>) {
        cdkBuilder.labels(labels)
      }

      override fun labels(vararg labels: String): Unit = labels(labels.toList())

      override fun minConfidence(minConfidence: Number) {
        cdkBuilder.minConfidence(minConfidence)
      }

      public fun build():
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.ConnectedHomeSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.ConnectedHomeSettingsProperty,
    ) : ConnectedHomeSettingsProperty {
      override fun labels(): List<String> = unwrap(this).getLabels()

      override fun minConfidence(): Number? = unwrap(this).getMinConfidence()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectedHomeSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rekognition.CfnStreamProcessor.ConnectedHomeSettingsProperty):
          ConnectedHomeSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectedHomeSettingsProperty):
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.ConnectedHomeSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface KinesisDataStreamProperty {
    public fun arn(): String

    public interface Builder {
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisDataStreamProperty.Builder
          =
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisDataStreamProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisDataStreamProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisDataStreamProperty,
    ) : KinesisDataStreamProperty {
      override fun arn(): String = unwrap(this).getArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisDataStreamProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisDataStreamProperty):
          KinesisDataStreamProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisDataStreamProperty):
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisDataStreamProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3DestinationProperty {
    public fun bucketName(): String

    public fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()

    public interface Builder {
      public fun bucketName(bucketName: String)

      public fun objectKeyPrefix(objectKeyPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.S3DestinationProperty.Builder
          =
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.S3DestinationProperty.builder()

      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      override fun objectKeyPrefix(objectKeyPrefix: String) {
        cdkBuilder.objectKeyPrefix(objectKeyPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.S3DestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.S3DestinationProperty,
    ) : S3DestinationProperty {
      override fun bucketName(): String = unwrap(this).getBucketName()

      override fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3DestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rekognition.CfnStreamProcessor.S3DestinationProperty):
          S3DestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DestinationProperty):
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.S3DestinationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface KinesisVideoStreamProperty {
    public fun arn(): String

    public interface Builder {
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisVideoStreamProperty.Builder
          =
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisVideoStreamProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisVideoStreamProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisVideoStreamProperty,
    ) : KinesisVideoStreamProperty {
      override fun arn(): String = unwrap(this).getArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisVideoStreamProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisVideoStreamProperty):
          KinesisVideoStreamProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisVideoStreamProperty):
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisVideoStreamProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FaceSearchSettingsProperty {
    public fun collectionId(): String

    public fun faceMatchThreshold(): Number? = unwrap(this).getFaceMatchThreshold()

    public interface Builder {
      public fun collectionId(collectionId: String)

      public fun faceMatchThreshold(faceMatchThreshold: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.FaceSearchSettingsProperty.Builder
          =
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.FaceSearchSettingsProperty.builder()

      override fun collectionId(collectionId: String) {
        cdkBuilder.collectionId(collectionId)
      }

      override fun faceMatchThreshold(faceMatchThreshold: Number) {
        cdkBuilder.faceMatchThreshold(faceMatchThreshold)
      }

      public fun build():
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.FaceSearchSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.FaceSearchSettingsProperty,
    ) : FaceSearchSettingsProperty {
      override fun collectionId(): String = unwrap(this).getCollectionId()

      override fun faceMatchThreshold(): Number? = unwrap(this).getFaceMatchThreshold()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FaceSearchSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rekognition.CfnStreamProcessor.FaceSearchSettingsProperty):
          FaceSearchSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FaceSearchSettingsProperty):
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.FaceSearchSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PointProperty {
    public fun x(): Number

    public fun y(): Number

    public interface Builder {
      public fun x(x: Number)

      public fun y(y: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.PointProperty.Builder =
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.PointProperty.builder()

      override fun x(x: Number) {
        cdkBuilder.x(x)
      }

      override fun y(y: Number) {
        cdkBuilder.y(y)
      }

      public fun build():
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.PointProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.PointProperty,
    ) : PointProperty {
      override fun x(): Number = unwrap(this).getX()

      override fun y(): Number = unwrap(this).getY()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rekognition.CfnStreamProcessor.PointProperty):
          PointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PointProperty):
          software.amazon.awscdk.services.rekognition.CfnStreamProcessor.PointProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
