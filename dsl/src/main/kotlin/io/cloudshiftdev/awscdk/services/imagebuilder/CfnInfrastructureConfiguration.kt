package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.CfnResource
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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInfrastructureConfiguration internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceMetadataOptions(): Any? = unwrap(this).getInstanceMetadataOptions()

  public open fun instanceMetadataOptions(`value`: IResolvable) {
    unwrap(this).setInstanceMetadataOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun instanceMetadataOptions(`value`: InstanceMetadataOptionsProperty) {
    unwrap(this).setInstanceMetadataOptions(`value`.let(InstanceMetadataOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e42fdd1eab591949e29aea918b51efbd6cb9a65b1e0208eec8d964ec1e8c1961")
  public open
      fun instanceMetadataOptions(`value`: InstanceMetadataOptionsProperty.Builder.() -> Unit): Unit
      = instanceMetadataOptions(InstanceMetadataOptionsProperty(`value`))

  public open fun instanceProfileName(): String = unwrap(this).getInstanceProfileName()

  public open fun instanceProfileName(`value`: String) {
    unwrap(this).setInstanceProfileName(`value`)
  }

  public open fun instanceTypes(): List<String> = unwrap(this).getInstanceTypes() ?: emptyList()

  public open fun instanceTypes(`value`: List<String>) {
    unwrap(this).setInstanceTypes(`value`)
  }

  public open fun keyPair(): String? = unwrap(this).getKeyPair()

  public open fun keyPair(`value`: String) {
    unwrap(this).setKeyPair(`value`)
  }

  public open fun logging(): Any? = unwrap(this).getLogging()

  public open fun logging(`value`: IResolvable) {
    unwrap(this).setLogging(`value`.let(IResolvable::unwrap))
  }

  public open fun logging(`value`: LoggingProperty) {
    unwrap(this).setLogging(`value`.let(LoggingProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e663c026004e317139e7760979c3ea35760bb71aeabc9554e29b92449251d657")
  public open fun logging(`value`: LoggingProperty.Builder.() -> Unit): Unit =
      logging(LoggingProperty(`value`))

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun resourceTags(): Any? = unwrap(this).getResourceTags()

  public open fun resourceTags(`value`: IResolvable) {
    unwrap(this).setResourceTags(`value`.let(IResolvable::unwrap))
  }

  public open fun resourceTags(`value`: Map<String, String>) {
    unwrap(this).setResourceTags(`value`)
  }

  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  public open fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

  public open fun snsTopicArn(`value`: String) {
    unwrap(this).setSnsTopicArn(`value`)
  }

  public open fun subnetId(): String? = unwrap(this).getSubnetId()

  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun terminateInstanceOnFailure(): Any? = unwrap(this).getTerminateInstanceOnFailure()

  public open fun terminateInstanceOnFailure(`value`: Boolean) {
    unwrap(this).setTerminateInstanceOnFailure(`value`)
  }

  public open fun terminateInstanceOnFailure(`value`: IResolvable) {
    unwrap(this).setTerminateInstanceOnFailure(`value`.let(IResolvable::unwrap))
  }

  public interface Builder {
    public fun description(description: String)

    public fun instanceMetadataOptions(instanceMetadataOptions: IResolvable)

    public fun instanceMetadataOptions(instanceMetadataOptions: InstanceMetadataOptionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a248e5d7f6fd3e44d70ef3b895c0577238f43ea28ab2bef4a5b7492a38ef371")
    public
        fun instanceMetadataOptions(instanceMetadataOptions: InstanceMetadataOptionsProperty.Builder.() -> Unit)

    public fun instanceProfileName(instanceProfileName: String)

    public fun instanceTypes(instanceTypes: List<String>)

    public fun keyPair(keyPair: String)

    public fun logging(logging: IResolvable)

    public fun logging(logging: LoggingProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("668f7e605a157c72d15bc514ef2dec91a5b4d84d02e0db4d951ddae0a3db24ae")
    public fun logging(logging: LoggingProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun resourceTags(resourceTags: IResolvable)

    public fun resourceTags(resourceTags: Map<String, String>)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun snsTopicArn(snsTopicArn: String)

    public fun subnetId(subnetId: String)

    public fun tags(tags: Map<String, String>)

    public fun terminateInstanceOnFailure(terminateInstanceOnFailure: Boolean)

    public fun terminateInstanceOnFailure(terminateInstanceOnFailure: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.Builder.create(scope,
        id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun instanceMetadataOptions(instanceMetadataOptions: IResolvable) {
      cdkBuilder.instanceMetadataOptions(instanceMetadataOptions.let(IResolvable::unwrap))
    }

    override fun instanceMetadataOptions(instanceMetadataOptions: InstanceMetadataOptionsProperty) {
      cdkBuilder.instanceMetadataOptions(instanceMetadataOptions.let(InstanceMetadataOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a248e5d7f6fd3e44d70ef3b895c0577238f43ea28ab2bef4a5b7492a38ef371")
    override
        fun instanceMetadataOptions(instanceMetadataOptions: InstanceMetadataOptionsProperty.Builder.() -> Unit):
        Unit = instanceMetadataOptions(InstanceMetadataOptionsProperty(instanceMetadataOptions))

    override fun instanceProfileName(instanceProfileName: String) {
      cdkBuilder.instanceProfileName(instanceProfileName)
    }

    override fun instanceTypes(instanceTypes: List<String>) {
      cdkBuilder.instanceTypes(instanceTypes)
    }

    override fun keyPair(keyPair: String) {
      cdkBuilder.keyPair(keyPair)
    }

    override fun logging(logging: IResolvable) {
      cdkBuilder.logging(logging.let(IResolvable::unwrap))
    }

    override fun logging(logging: LoggingProperty) {
      cdkBuilder.logging(logging.let(LoggingProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("668f7e605a157c72d15bc514ef2dec91a5b4d84d02e0db4d951ddae0a3db24ae")
    override fun logging(logging: LoggingProperty.Builder.() -> Unit): Unit =
        logging(LoggingProperty(logging))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun resourceTags(resourceTags: IResolvable) {
      cdkBuilder.resourceTags(resourceTags.let(IResolvable::unwrap))
    }

    override fun resourceTags(resourceTags: Map<String, String>) {
      cdkBuilder.resourceTags(resourceTags)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun terminateInstanceOnFailure(terminateInstanceOnFailure: Boolean) {
      cdkBuilder.terminateInstanceOnFailure(terminateInstanceOnFailure)
    }

    override fun terminateInstanceOnFailure(terminateInstanceOnFailure: IResolvable) {
      cdkBuilder.terminateInstanceOnFailure(terminateInstanceOnFailure.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration
        = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInfrastructureConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInfrastructureConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration):
        CfnInfrastructureConfiguration = CfnInfrastructureConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnInfrastructureConfiguration):
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration =
        wrapped.cdkObject
  }

  public interface S3LogsProperty {
    public fun s3BucketName(): String? = unwrap(this).getS3BucketName()

    public fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

    public interface Builder {
      public fun s3BucketName(s3BucketName: String)

      public fun s3KeyPrefix(s3KeyPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.S3LogsProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.S3LogsProperty.builder()

      override fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
      }

      override fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.S3LogsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.S3LogsProperty,
    ) : S3LogsProperty {
      override fun s3BucketName(): String? = unwrap(this).getS3BucketName()

      override fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3LogsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.S3LogsProperty):
          S3LogsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LogsProperty):
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.S3LogsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LoggingProperty {
    public fun s3Logs(): Any? = unwrap(this).getS3Logs()

    public interface Builder {
      public fun s3Logs(s3Logs: IResolvable)

      public fun s3Logs(s3Logs: S3LogsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10e9563363a0603bf873c97808686b4ca093cdb2e6f9f28e63b7c800744cafff")
      public fun s3Logs(s3Logs: S3LogsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.LoggingProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.LoggingProperty.builder()

      override fun s3Logs(s3Logs: IResolvable) {
        cdkBuilder.s3Logs(s3Logs.let(IResolvable::unwrap))
      }

      override fun s3Logs(s3Logs: S3LogsProperty) {
        cdkBuilder.s3Logs(s3Logs.let(S3LogsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10e9563363a0603bf873c97808686b4ca093cdb2e6f9f28e63b7c800744cafff")
      override fun s3Logs(s3Logs: S3LogsProperty.Builder.() -> Unit): Unit =
          s3Logs(S3LogsProperty(s3Logs))

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.LoggingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.LoggingProperty,
    ) : LoggingProperty {
      override fun s3Logs(): Any? = unwrap(this).getS3Logs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.LoggingProperty):
          LoggingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingProperty):
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.LoggingProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InstanceMetadataOptionsProperty {
    public fun httpPutResponseHopLimit(): Number? = unwrap(this).getHttpPutResponseHopLimit()

    public fun httpTokens(): String? = unwrap(this).getHttpTokens()

    public interface Builder {
      public fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number)

      public fun httpTokens(httpTokens: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty.builder()

      override fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
        cdkBuilder.httpPutResponseHopLimit(httpPutResponseHopLimit)
      }

      override fun httpTokens(httpTokens: String) {
        cdkBuilder.httpTokens(httpTokens)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty,
    ) : InstanceMetadataOptionsProperty {
      override fun httpPutResponseHopLimit(): Number? = unwrap(this).getHttpPutResponseHopLimit()

      override fun httpTokens(): String? = unwrap(this).getHttpTokens()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceMetadataOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty):
          InstanceMetadataOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceMetadataOptionsProperty):
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
