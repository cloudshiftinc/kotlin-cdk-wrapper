package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDeviceFleet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sagemaker.CfnDeviceFleet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun deviceFleetName(): String = unwrap(this).getDeviceFleetName()

  public open fun deviceFleetName(`value`: String) {
    unwrap(this).setDeviceFleetName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun outputConfig(): Any = unwrap(this).getOutputConfig()

  public open fun outputConfig(`value`: IResolvable) {
    unwrap(this).setOutputConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun outputConfig(`value`: EdgeOutputConfigProperty) {
    unwrap(this).setOutputConfig(`value`.let(EdgeOutputConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("96e638e358f25c3b8264512f204c8a561a17bc8e45952902d343fa4190154e51")
  public open fun outputConfig(`value`: EdgeOutputConfigProperty.Builder.() -> Unit): Unit =
      outputConfig(EdgeOutputConfigProperty(`value`))

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun description(description: String)

    public fun deviceFleetName(deviceFleetName: String)

    public fun outputConfig(outputConfig: IResolvable)

    public fun outputConfig(outputConfig: EdgeOutputConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b88d294cea23b1a959185b36e0dfa87ca8e9236822f671a0ae3e563a506650d")
    public fun outputConfig(outputConfig: EdgeOutputConfigProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.Builder =
        software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun deviceFleetName(deviceFleetName: String) {
      cdkBuilder.deviceFleetName(deviceFleetName)
    }

    override fun outputConfig(outputConfig: IResolvable) {
      cdkBuilder.outputConfig(outputConfig.let(IResolvable::unwrap))
    }

    override fun outputConfig(outputConfig: EdgeOutputConfigProperty) {
      cdkBuilder.outputConfig(outputConfig.let(EdgeOutputConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b88d294cea23b1a959185b36e0dfa87ca8e9236822f671a0ae3e563a506650d")
    override fun outputConfig(outputConfig: EdgeOutputConfigProperty.Builder.() -> Unit): Unit =
        outputConfig(EdgeOutputConfigProperty(outputConfig))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnDeviceFleet =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeviceFleet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeviceFleet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDeviceFleet):
        CfnDeviceFleet = CfnDeviceFleet(cdkObject)

    internal fun unwrap(wrapped: CfnDeviceFleet):
        software.amazon.awscdk.services.sagemaker.CfnDeviceFleet = wrapped.cdkObject
  }

  public interface EdgeOutputConfigProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun s3OutputLocation(): String

    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String)

      public fun s3OutputLocation(s3OutputLocation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.EdgeOutputConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.EdgeOutputConfigProperty.builder()

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      override fun s3OutputLocation(s3OutputLocation: String) {
        cdkBuilder.s3OutputLocation(s3OutputLocation)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.EdgeOutputConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.EdgeOutputConfigProperty,
    ) : EdgeOutputConfigProperty {
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      override fun s3OutputLocation(): String = unwrap(this).getS3OutputLocation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EdgeOutputConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.EdgeOutputConfigProperty):
          EdgeOutputConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EdgeOutputConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.EdgeOutputConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
