package io.cloudshiftdev.awscdk.services.lookoutequipment

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInferenceScheduler internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrInferenceSchedulerArn(): String = unwrap(this).getAttrInferenceSchedulerArn()

  public open fun dataDelayOffsetInMinutes(): Number? = unwrap(this).getDataDelayOffsetInMinutes()

  public open fun dataDelayOffsetInMinutes(`value`: Number) {
    unwrap(this).setDataDelayOffsetInMinutes(`value`)
  }

  public open fun dataInputConfiguration(): Any = unwrap(this).getDataInputConfiguration()

  public open fun dataInputConfiguration(`value`: Any) {
    unwrap(this).setDataInputConfiguration(`value`)
  }

  public open fun dataOutputConfiguration(): Any = unwrap(this).getDataOutputConfiguration()

  public open fun dataOutputConfiguration(`value`: Any) {
    unwrap(this).setDataOutputConfiguration(`value`)
  }

  public open fun dataUploadFrequency(): String = unwrap(this).getDataUploadFrequency()

  public open fun dataUploadFrequency(`value`: String) {
    unwrap(this).setDataUploadFrequency(`value`)
  }

  public open fun inferenceSchedulerName(): String? = unwrap(this).getInferenceSchedulerName()

  public open fun inferenceSchedulerName(`value`: String) {
    unwrap(this).setInferenceSchedulerName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun modelName(): String = unwrap(this).getModelName()

  public open fun modelName(`value`: String) {
    unwrap(this).setModelName(`value`)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun serverSideKmsKeyId(): String? = unwrap(this).getServerSideKmsKeyId()

  public open fun serverSideKmsKeyId(`value`: String) {
    unwrap(this).setServerSideKmsKeyId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun dataDelayOffsetInMinutes(dataDelayOffsetInMinutes: Number)

    public fun dataInputConfiguration(dataInputConfiguration: Any)

    public fun dataOutputConfiguration(dataOutputConfiguration: Any)

    public fun dataUploadFrequency(dataUploadFrequency: String)

    public fun inferenceSchedulerName(inferenceSchedulerName: String)

    public fun modelName(modelName: String)

    public fun roleArn(roleArn: String)

    public fun serverSideKmsKeyId(serverSideKmsKeyId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.Builder =
        software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.Builder.create(scope,
        id)

    override fun dataDelayOffsetInMinutes(dataDelayOffsetInMinutes: Number) {
      cdkBuilder.dataDelayOffsetInMinutes(dataDelayOffsetInMinutes)
    }

    override fun dataInputConfiguration(dataInputConfiguration: Any) {
      cdkBuilder.dataInputConfiguration(dataInputConfiguration)
    }

    override fun dataOutputConfiguration(dataOutputConfiguration: Any) {
      cdkBuilder.dataOutputConfiguration(dataOutputConfiguration)
    }

    override fun dataUploadFrequency(dataUploadFrequency: String) {
      cdkBuilder.dataUploadFrequency(dataUploadFrequency)
    }

    override fun inferenceSchedulerName(inferenceSchedulerName: String) {
      cdkBuilder.inferenceSchedulerName(inferenceSchedulerName)
    }

    override fun modelName(modelName: String) {
      cdkBuilder.modelName(modelName)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun serverSideKmsKeyId(serverSideKmsKeyId: String) {
      cdkBuilder.serverSideKmsKeyId(serverSideKmsKeyId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInferenceScheduler {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInferenceScheduler(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler):
        CfnInferenceScheduler = CfnInferenceScheduler(cdkObject)

    internal fun unwrap(wrapped: CfnInferenceScheduler):
        software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler = wrapped.cdkObject
  }

  public interface DataInputConfigurationProperty {
    public fun inferenceInputNameConfiguration(): Any? =
        unwrap(this).getInferenceInputNameConfiguration()

    public fun inputTimeZoneOffset(): String? = unwrap(this).getInputTimeZoneOffset()

    public fun s3InputConfiguration(): Any

    public interface Builder {
      public fun inferenceInputNameConfiguration(inferenceInputNameConfiguration: IResolvable)

      public
          fun inferenceInputNameConfiguration(inferenceInputNameConfiguration: InputNameConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cc3f0e0ed00422f895da9a493862858ac7c1a8f3e5221bac391be6a411abf54")
      public
          fun inferenceInputNameConfiguration(inferenceInputNameConfiguration: InputNameConfigurationProperty.Builder.() -> Unit)

      public fun inputTimeZoneOffset(inputTimeZoneOffset: String)

      public fun s3InputConfiguration(s3InputConfiguration: IResolvable)

      public fun s3InputConfiguration(s3InputConfiguration: S3InputConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("581c61355ec25fe90a3613d8b08027e9c9a03c8b726cb116e503600ae4ef83c9")
      public
          fun s3InputConfiguration(s3InputConfiguration: S3InputConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataInputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataInputConfigurationProperty.builder()

      override fun inferenceInputNameConfiguration(inferenceInputNameConfiguration: IResolvable) {
        cdkBuilder.inferenceInputNameConfiguration(inferenceInputNameConfiguration.let(IResolvable::unwrap))
      }

      override
          fun inferenceInputNameConfiguration(inferenceInputNameConfiguration: InputNameConfigurationProperty) {
        cdkBuilder.inferenceInputNameConfiguration(inferenceInputNameConfiguration.let(InputNameConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cc3f0e0ed00422f895da9a493862858ac7c1a8f3e5221bac391be6a411abf54")
      override
          fun inferenceInputNameConfiguration(inferenceInputNameConfiguration: InputNameConfigurationProperty.Builder.() -> Unit):
          Unit =
          inferenceInputNameConfiguration(InputNameConfigurationProperty(inferenceInputNameConfiguration))

      override fun inputTimeZoneOffset(inputTimeZoneOffset: String) {
        cdkBuilder.inputTimeZoneOffset(inputTimeZoneOffset)
      }

      override fun s3InputConfiguration(s3InputConfiguration: IResolvable) {
        cdkBuilder.s3InputConfiguration(s3InputConfiguration.let(IResolvable::unwrap))
      }

      override fun s3InputConfiguration(s3InputConfiguration: S3InputConfigurationProperty) {
        cdkBuilder.s3InputConfiguration(s3InputConfiguration.let(S3InputConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("581c61355ec25fe90a3613d8b08027e9c9a03c8b726cb116e503600ae4ef83c9")
      override
          fun s3InputConfiguration(s3InputConfiguration: S3InputConfigurationProperty.Builder.() -> Unit):
          Unit = s3InputConfiguration(S3InputConfigurationProperty(s3InputConfiguration))

      public fun build():
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataInputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataInputConfigurationProperty,
    ) : DataInputConfigurationProperty {
      override fun inferenceInputNameConfiguration(): Any? =
          unwrap(this).getInferenceInputNameConfiguration()

      override fun inputTimeZoneOffset(): String? = unwrap(this).getInputTimeZoneOffset()

      override fun s3InputConfiguration(): Any = unwrap(this).getS3InputConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataInputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataInputConfigurationProperty):
          DataInputConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataInputConfigurationProperty):
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataInputConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputNameConfigurationProperty {
    public fun componentTimestampDelimiter(): String? =
        unwrap(this).getComponentTimestampDelimiter()

    public fun timestampFormat(): String? = unwrap(this).getTimestampFormat()

    public interface Builder {
      public fun componentTimestampDelimiter(componentTimestampDelimiter: String)

      public fun timestampFormat(timestampFormat: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.InputNameConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.InputNameConfigurationProperty.builder()

      override fun componentTimestampDelimiter(componentTimestampDelimiter: String) {
        cdkBuilder.componentTimestampDelimiter(componentTimestampDelimiter)
      }

      override fun timestampFormat(timestampFormat: String) {
        cdkBuilder.timestampFormat(timestampFormat)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.InputNameConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.InputNameConfigurationProperty,
    ) : InputNameConfigurationProperty {
      override fun componentTimestampDelimiter(): String? =
          unwrap(this).getComponentTimestampDelimiter()

      override fun timestampFormat(): String? = unwrap(this).getTimestampFormat()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputNameConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.InputNameConfigurationProperty):
          InputNameConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputNameConfigurationProperty):
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.InputNameConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3InputConfigurationProperty {
    public fun bucket(): String

    public fun prefix(): String? = unwrap(this).getPrefix()

    public interface Builder {
      public fun bucket(bucket: String)

      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3InputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3InputConfigurationProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3InputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3InputConfigurationProperty,
    ) : S3InputConfigurationProperty {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3InputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3InputConfigurationProperty):
          S3InputConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3InputConfigurationProperty):
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3InputConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataOutputConfigurationProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun s3OutputConfiguration(): Any

    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String)

      public fun s3OutputConfiguration(s3OutputConfiguration: IResolvable)

      public fun s3OutputConfiguration(s3OutputConfiguration: S3OutputConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("58f2e19d838f5a1605d85010c381976bec8cbbb520d702395aa620174c42879c")
      public
          fun s3OutputConfiguration(s3OutputConfiguration: S3OutputConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataOutputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataOutputConfigurationProperty.builder()

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      override fun s3OutputConfiguration(s3OutputConfiguration: IResolvable) {
        cdkBuilder.s3OutputConfiguration(s3OutputConfiguration.let(IResolvable::unwrap))
      }

      override fun s3OutputConfiguration(s3OutputConfiguration: S3OutputConfigurationProperty) {
        cdkBuilder.s3OutputConfiguration(s3OutputConfiguration.let(S3OutputConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("58f2e19d838f5a1605d85010c381976bec8cbbb520d702395aa620174c42879c")
      override
          fun s3OutputConfiguration(s3OutputConfiguration: S3OutputConfigurationProperty.Builder.() -> Unit):
          Unit = s3OutputConfiguration(S3OutputConfigurationProperty(s3OutputConfiguration))

      public fun build():
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataOutputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataOutputConfigurationProperty,
    ) : DataOutputConfigurationProperty {
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      override fun s3OutputConfiguration(): Any = unwrap(this).getS3OutputConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataOutputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataOutputConfigurationProperty):
          DataOutputConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataOutputConfigurationProperty):
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataOutputConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3OutputConfigurationProperty {
    public fun bucket(): String

    public fun prefix(): String? = unwrap(this).getPrefix()

    public interface Builder {
      public fun bucket(bucket: String)

      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3OutputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3OutputConfigurationProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3OutputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3OutputConfigurationProperty,
    ) : S3OutputConfigurationProperty {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3OutputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3OutputConfigurationProperty):
          S3OutputConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3OutputConfigurationProperty):
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3OutputConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
