@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.osis

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPipeline internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.osis.CfnPipeline,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrIngestEndpointUrls(): List<String> = unwrap(this).getAttrIngestEndpointUrls()

  public open fun attrPipelineArn(): String = unwrap(this).getAttrPipelineArn()

  public open fun attrVpcEndpoints(): IResolvable =
      unwrap(this).getAttrVpcEndpoints().let(IResolvable::wrap)

  public open fun bufferOptions(): Any? = unwrap(this).getBufferOptions()

  public open fun bufferOptions(`value`: IResolvable) {
    unwrap(this).setBufferOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun bufferOptions(`value`: BufferOptionsProperty) {
    unwrap(this).setBufferOptions(`value`.let(BufferOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0088db915d29a68bf145c26c3199caa8a9a4262e623a97a00fd4a0e830f230c2")
  public open fun bufferOptions(`value`: BufferOptionsProperty.Builder.() -> Unit): Unit =
      bufferOptions(BufferOptionsProperty(`value`))

  public open fun encryptionAtRestOptions(): Any? = unwrap(this).getEncryptionAtRestOptions()

  public open fun encryptionAtRestOptions(`value`: IResolvable) {
    unwrap(this).setEncryptionAtRestOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun encryptionAtRestOptions(`value`: EncryptionAtRestOptionsProperty) {
    unwrap(this).setEncryptionAtRestOptions(`value`.let(EncryptionAtRestOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("46156800434f7da75e187fcab458d4d81337878d6fab246df65df6cb085a4546")
  public open
      fun encryptionAtRestOptions(`value`: EncryptionAtRestOptionsProperty.Builder.() -> Unit): Unit
      = encryptionAtRestOptions(EncryptionAtRestOptionsProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logPublishingOptions(): Any? = unwrap(this).getLogPublishingOptions()

  public open fun logPublishingOptions(`value`: IResolvable) {
    unwrap(this).setLogPublishingOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun logPublishingOptions(`value`: LogPublishingOptionsProperty) {
    unwrap(this).setLogPublishingOptions(`value`.let(LogPublishingOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3095123317b3a645c780713ea59505306e98994cec5d3cfb3418b8a9ad15bfee")
  public open fun logPublishingOptions(`value`: LogPublishingOptionsProperty.Builder.() -> Unit):
      Unit = logPublishingOptions(LogPublishingOptionsProperty(`value`))

  public open fun maxUnits(): Number = unwrap(this).getMaxUnits()

  public open fun maxUnits(`value`: Number) {
    unwrap(this).setMaxUnits(`value`)
  }

  public open fun minUnits(): Number = unwrap(this).getMinUnits()

  public open fun minUnits(`value`: Number) {
    unwrap(this).setMinUnits(`value`)
  }

  public open fun pipelineConfigurationBody(): String = unwrap(this).getPipelineConfigurationBody()

  public open fun pipelineConfigurationBody(`value`: String) {
    unwrap(this).setPipelineConfigurationBody(`value`)
  }

  public open fun pipelineName(): String = unwrap(this).getPipelineName()

  public open fun pipelineName(`value`: String) {
    unwrap(this).setPipelineName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun vpcOptions(): Any? = unwrap(this).getVpcOptions()

  public open fun vpcOptions(`value`: IResolvable) {
    unwrap(this).setVpcOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcOptions(`value`: VpcOptionsProperty) {
    unwrap(this).setVpcOptions(`value`.let(VpcOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("56f4cd78ce89b44248447c64b7a56945ce3708bbbe4bd283a0d0cd9beb9afa32")
  public open fun vpcOptions(`value`: VpcOptionsProperty.Builder.() -> Unit): Unit =
      vpcOptions(VpcOptionsProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun bufferOptions(bufferOptions: IResolvable)

    public fun bufferOptions(bufferOptions: BufferOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("521a6f5455e187f1cb3cae2d62862342904aaecc39219120de7f96054dc111f6")
    public fun bufferOptions(bufferOptions: BufferOptionsProperty.Builder.() -> Unit)

    public fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable)

    public fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0240d8c5b5549905909b79de6e5be06b178608e62cf3ccb2d1b13259fccffd5")
    public
        fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty.Builder.() -> Unit)

    public fun logPublishingOptions(logPublishingOptions: IResolvable)

    public fun logPublishingOptions(logPublishingOptions: LogPublishingOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c08b220362234c4cc0e216143ac2603e48f9251daf1947aeb3a3ce258c859b03")
    public
        fun logPublishingOptions(logPublishingOptions: LogPublishingOptionsProperty.Builder.() -> Unit)

    public fun maxUnits(maxUnits: Number)

    public fun minUnits(minUnits: Number)

    public fun pipelineConfigurationBody(pipelineConfigurationBody: String)

    public fun pipelineName(pipelineName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcOptions(vpcOptions: IResolvable)

    public fun vpcOptions(vpcOptions: VpcOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c5c8165a7472a670581694263ef16a917ca8417fe109d0ed9d7c63fb0e00823")
    public fun vpcOptions(vpcOptions: VpcOptionsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.osis.CfnPipeline.Builder =
        software.amazon.awscdk.services.osis.CfnPipeline.Builder.create(scope, id)

    override fun bufferOptions(bufferOptions: IResolvable) {
      cdkBuilder.bufferOptions(bufferOptions.let(IResolvable::unwrap))
    }

    override fun bufferOptions(bufferOptions: BufferOptionsProperty) {
      cdkBuilder.bufferOptions(bufferOptions.let(BufferOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("521a6f5455e187f1cb3cae2d62862342904aaecc39219120de7f96054dc111f6")
    override fun bufferOptions(bufferOptions: BufferOptionsProperty.Builder.() -> Unit): Unit =
        bufferOptions(BufferOptionsProperty(bufferOptions))

    override fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(IResolvable::unwrap))
    }

    override fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(EncryptionAtRestOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0240d8c5b5549905909b79de6e5be06b178608e62cf3ccb2d1b13259fccffd5")
    override
        fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty.Builder.() -> Unit):
        Unit = encryptionAtRestOptions(EncryptionAtRestOptionsProperty(encryptionAtRestOptions))

    override fun logPublishingOptions(logPublishingOptions: IResolvable) {
      cdkBuilder.logPublishingOptions(logPublishingOptions.let(IResolvable::unwrap))
    }

    override fun logPublishingOptions(logPublishingOptions: LogPublishingOptionsProperty) {
      cdkBuilder.logPublishingOptions(logPublishingOptions.let(LogPublishingOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c08b220362234c4cc0e216143ac2603e48f9251daf1947aeb3a3ce258c859b03")
    override
        fun logPublishingOptions(logPublishingOptions: LogPublishingOptionsProperty.Builder.() -> Unit):
        Unit = logPublishingOptions(LogPublishingOptionsProperty(logPublishingOptions))

    override fun maxUnits(maxUnits: Number) {
      cdkBuilder.maxUnits(maxUnits)
    }

    override fun minUnits(minUnits: Number) {
      cdkBuilder.minUnits(minUnits)
    }

    override fun pipelineConfigurationBody(pipelineConfigurationBody: String) {
      cdkBuilder.pipelineConfigurationBody(pipelineConfigurationBody)
    }

    override fun pipelineName(pipelineName: String) {
      cdkBuilder.pipelineName(pipelineName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcOptions(vpcOptions: IResolvable) {
      cdkBuilder.vpcOptions(vpcOptions.let(IResolvable::unwrap))
    }

    override fun vpcOptions(vpcOptions: VpcOptionsProperty) {
      cdkBuilder.vpcOptions(vpcOptions.let(VpcOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c5c8165a7472a670581694263ef16a917ca8417fe109d0ed9d7c63fb0e00823")
    override fun vpcOptions(vpcOptions: VpcOptionsProperty.Builder.() -> Unit): Unit =
        vpcOptions(VpcOptionsProperty(vpcOptions))

    public fun build(): software.amazon.awscdk.services.osis.CfnPipeline = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.osis.CfnPipeline.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPipeline {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPipeline(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.osis.CfnPipeline): CfnPipeline =
        CfnPipeline(cdkObject)

    internal fun unwrap(wrapped: CfnPipeline): software.amazon.awscdk.services.osis.CfnPipeline =
        wrapped.cdkObject
  }

  public interface VpcEndpointProperty {
    public fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

    public fun vpcId(): String? = unwrap(this).getVpcId()

    public fun vpcOptions(): Any? = unwrap(this).getVpcOptions()

    @CdkDslMarker
    public interface Builder {
      public fun vpcEndpointId(vpcEndpointId: String)

      public fun vpcId(vpcId: String)

      public fun vpcOptions(vpcOptions: IResolvable)

      public fun vpcOptions(vpcOptions: VpcOptionsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0a2165aaf343d4811e4e25e9ba8d41cb49e837d7f30f2c7b5b764ef380e3c74")
      public fun vpcOptions(vpcOptions: VpcOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.osis.CfnPipeline.VpcEndpointProperty.Builder =
          software.amazon.awscdk.services.osis.CfnPipeline.VpcEndpointProperty.builder()

      override fun vpcEndpointId(vpcEndpointId: String) {
        cdkBuilder.vpcEndpointId(vpcEndpointId)
      }

      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      override fun vpcOptions(vpcOptions: IResolvable) {
        cdkBuilder.vpcOptions(vpcOptions.let(IResolvable::unwrap))
      }

      override fun vpcOptions(vpcOptions: VpcOptionsProperty) {
        cdkBuilder.vpcOptions(vpcOptions.let(VpcOptionsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0a2165aaf343d4811e4e25e9ba8d41cb49e837d7f30f2c7b5b764ef380e3c74")
      override fun vpcOptions(vpcOptions: VpcOptionsProperty.Builder.() -> Unit): Unit =
          vpcOptions(VpcOptionsProperty(vpcOptions))

      public fun build(): software.amazon.awscdk.services.osis.CfnPipeline.VpcEndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.VpcEndpointProperty,
    ) : CdkObject(cdkObject), VpcEndpointProperty {
      override fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

      override fun vpcId(): String? = unwrap(this).getVpcId()

      override fun vpcOptions(): Any? = unwrap(this).getVpcOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.VpcEndpointProperty):
          VpcEndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcEndpointProperty):
          software.amazon.awscdk.services.osis.CfnPipeline.VpcEndpointProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.osis.CfnPipeline.VpcEndpointProperty
    }
  }

  public interface CloudWatchLogDestinationProperty {
    public fun logGroup(): String

    @CdkDslMarker
    public interface Builder {
      public fun logGroup(logGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.osis.CfnPipeline.CloudWatchLogDestinationProperty.Builder
          =
          software.amazon.awscdk.services.osis.CfnPipeline.CloudWatchLogDestinationProperty.builder()

      override fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
      }

      public fun build():
          software.amazon.awscdk.services.osis.CfnPipeline.CloudWatchLogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.osis.CfnPipeline.CloudWatchLogDestinationProperty,
    ) : CdkObject(cdkObject), CloudWatchLogDestinationProperty {
      override fun logGroup(): String = unwrap(this).getLogGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.CloudWatchLogDestinationProperty):
          CloudWatchLogDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogDestinationProperty):
          software.amazon.awscdk.services.osis.CfnPipeline.CloudWatchLogDestinationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.osis.CfnPipeline.CloudWatchLogDestinationProperty
    }
  }

  public interface BufferOptionsProperty {
    public fun persistentBufferEnabled(): Any

    @CdkDslMarker
    public interface Builder {
      public fun persistentBufferEnabled(persistentBufferEnabled: Boolean)

      public fun persistentBufferEnabled(persistentBufferEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.osis.CfnPipeline.BufferOptionsProperty.Builder =
          software.amazon.awscdk.services.osis.CfnPipeline.BufferOptionsProperty.builder()

      override fun persistentBufferEnabled(persistentBufferEnabled: Boolean) {
        cdkBuilder.persistentBufferEnabled(persistentBufferEnabled)
      }

      override fun persistentBufferEnabled(persistentBufferEnabled: IResolvable) {
        cdkBuilder.persistentBufferEnabled(persistentBufferEnabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.osis.CfnPipeline.BufferOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.osis.CfnPipeline.BufferOptionsProperty,
    ) : CdkObject(cdkObject), BufferOptionsProperty {
      override fun persistentBufferEnabled(): Any = unwrap(this).getPersistentBufferEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BufferOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.BufferOptionsProperty):
          BufferOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BufferOptionsProperty):
          software.amazon.awscdk.services.osis.CfnPipeline.BufferOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.osis.CfnPipeline.BufferOptionsProperty
    }
  }

  public interface LogPublishingOptionsProperty {
    public fun cloudWatchLogDestination(): Any? = unwrap(this).getCloudWatchLogDestination()

    public fun isLoggingEnabled(): Any? = unwrap(this).getIsLoggingEnabled()

    @CdkDslMarker
    public interface Builder {
      public fun cloudWatchLogDestination(cloudWatchLogDestination: IResolvable)

      public
          fun cloudWatchLogDestination(cloudWatchLogDestination: CloudWatchLogDestinationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b9483073fa5903db0fd5376daeba740fd76ef4814aaeb929e2c3eca7fbca7a4")
      public
          fun cloudWatchLogDestination(cloudWatchLogDestination: CloudWatchLogDestinationProperty.Builder.() -> Unit)

      public fun isLoggingEnabled(isLoggingEnabled: Boolean)

      public fun isLoggingEnabled(isLoggingEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.osis.CfnPipeline.LogPublishingOptionsProperty.Builder =
          software.amazon.awscdk.services.osis.CfnPipeline.LogPublishingOptionsProperty.builder()

      override fun cloudWatchLogDestination(cloudWatchLogDestination: IResolvable) {
        cdkBuilder.cloudWatchLogDestination(cloudWatchLogDestination.let(IResolvable::unwrap))
      }

      override
          fun cloudWatchLogDestination(cloudWatchLogDestination: CloudWatchLogDestinationProperty) {
        cdkBuilder.cloudWatchLogDestination(cloudWatchLogDestination.let(CloudWatchLogDestinationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b9483073fa5903db0fd5376daeba740fd76ef4814aaeb929e2c3eca7fbca7a4")
      override
          fun cloudWatchLogDestination(cloudWatchLogDestination: CloudWatchLogDestinationProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLogDestination(CloudWatchLogDestinationProperty(cloudWatchLogDestination))

      override fun isLoggingEnabled(isLoggingEnabled: Boolean) {
        cdkBuilder.isLoggingEnabled(isLoggingEnabled)
      }

      override fun isLoggingEnabled(isLoggingEnabled: IResolvable) {
        cdkBuilder.isLoggingEnabled(isLoggingEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.osis.CfnPipeline.LogPublishingOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.osis.CfnPipeline.LogPublishingOptionsProperty,
    ) : CdkObject(cdkObject), LogPublishingOptionsProperty {
      override fun cloudWatchLogDestination(): Any? = unwrap(this).getCloudWatchLogDestination()

      override fun isLoggingEnabled(): Any? = unwrap(this).getIsLoggingEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogPublishingOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.LogPublishingOptionsProperty):
          LogPublishingOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogPublishingOptionsProperty):
          software.amazon.awscdk.services.osis.CfnPipeline.LogPublishingOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.osis.CfnPipeline.LogPublishingOptionsProperty
    }
  }

  public interface EncryptionAtRestOptionsProperty {
    public fun kmsKeyArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun kmsKeyArn(kmsKeyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.osis.CfnPipeline.EncryptionAtRestOptionsProperty.Builder =
          software.amazon.awscdk.services.osis.CfnPipeline.EncryptionAtRestOptionsProperty.builder()

      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      public fun build():
          software.amazon.awscdk.services.osis.CfnPipeline.EncryptionAtRestOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.osis.CfnPipeline.EncryptionAtRestOptionsProperty,
    ) : CdkObject(cdkObject), EncryptionAtRestOptionsProperty {
      override fun kmsKeyArn(): String = unwrap(this).getKmsKeyArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionAtRestOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.EncryptionAtRestOptionsProperty):
          EncryptionAtRestOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionAtRestOptionsProperty):
          software.amazon.awscdk.services.osis.CfnPipeline.EncryptionAtRestOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.osis.CfnPipeline.EncryptionAtRestOptionsProperty
    }
  }

  public interface VpcOptionsProperty {
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    public fun subnetIds(): List<String>

    @CdkDslMarker
    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun securityGroupIds(vararg securityGroupIds: String)

      public fun subnetIds(subnetIds: List<String>)

      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.osis.CfnPipeline.VpcOptionsProperty.Builder =
          software.amazon.awscdk.services.osis.CfnPipeline.VpcOptionsProperty.builder()

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build(): software.amazon.awscdk.services.osis.CfnPipeline.VpcOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.VpcOptionsProperty,
    ) : CdkObject(cdkObject), VpcOptionsProperty {
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.VpcOptionsProperty):
          VpcOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcOptionsProperty):
          software.amazon.awscdk.services.osis.CfnPipeline.VpcOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.osis.CfnPipeline.VpcOptionsProperty
    }
  }
}
