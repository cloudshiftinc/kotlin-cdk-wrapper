package io.cloudshiftdev.awscdk.services.sagemaker

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

public open class CfnEndpointConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun asyncInferenceConfig(): Any? = unwrap(this).getAsyncInferenceConfig()

  public open fun asyncInferenceConfig(`value`: IResolvable) {
    unwrap(this).setAsyncInferenceConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun asyncInferenceConfig(`value`: AsyncInferenceConfigProperty) {
    unwrap(this).setAsyncInferenceConfig(`value`.let(AsyncInferenceConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("976bdf23661427f7a2a9a858f8bbbf9d0a296c5d136262299bfcce2b1a638c41")
  public open fun asyncInferenceConfig(`value`: AsyncInferenceConfigProperty.Builder.() -> Unit):
      Unit = asyncInferenceConfig(AsyncInferenceConfigProperty(`value`))

  public open fun attrEndpointConfigName(): String = unwrap(this).getAttrEndpointConfigName()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun dataCaptureConfig(): Any? = unwrap(this).getDataCaptureConfig()

  public open fun dataCaptureConfig(`value`: IResolvable) {
    unwrap(this).setDataCaptureConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun dataCaptureConfig(`value`: DataCaptureConfigProperty) {
    unwrap(this).setDataCaptureConfig(`value`.let(DataCaptureConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("90cc48f28fc54362889d70ded327856c6bcf8cf5fdd2c88565cb10e586f1685a")
  public open fun dataCaptureConfig(`value`: DataCaptureConfigProperty.Builder.() -> Unit): Unit =
      dataCaptureConfig(DataCaptureConfigProperty(`value`))

  public open fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

  public open fun enableNetworkIsolation(`value`: Boolean) {
    unwrap(this).setEnableNetworkIsolation(`value`)
  }

  public open fun enableNetworkIsolation(`value`: IResolvable) {
    unwrap(this).setEnableNetworkIsolation(`value`.let(IResolvable::unwrap))
  }

  public open fun endpointConfigName(): String? = unwrap(this).getEndpointConfigName()

  public open fun endpointConfigName(`value`: String) {
    unwrap(this).setEndpointConfigName(`value`)
  }

  public open fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  public open fun executionRoleArn(`value`: String) {
    unwrap(this).setExecutionRoleArn(`value`)
  }

  public open fun explainerConfig(): Any? = unwrap(this).getExplainerConfig()

  public open fun explainerConfig(`value`: IResolvable) {
    unwrap(this).setExplainerConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun explainerConfig(`value`: ExplainerConfigProperty) {
    unwrap(this).setExplainerConfig(`value`.let(ExplainerConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8709e7c75723d88b0cf8d9df2ddef570dfa484116f10dc49b246594b2ee3fb0")
  public open fun explainerConfig(`value`: ExplainerConfigProperty.Builder.() -> Unit): Unit =
      explainerConfig(ExplainerConfigProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun productionVariants(): Any = unwrap(this).getProductionVariants()

  public open fun productionVariants(`value`: IResolvable) {
    unwrap(this).setProductionVariants(`value`.let(IResolvable::unwrap))
  }

  public open fun productionVariants(__idx_ac66f0: List<Any>) {
    unwrap(this).setProductionVariants(__idx_ac66f0)
  }

  public open fun productionVariants(vararg __idx_ac66f0: Any): Unit =
      productionVariants(__idx_ac66f0.toList())

  public open fun shadowProductionVariants(): Any? = unwrap(this).getShadowProductionVariants()

  public open fun shadowProductionVariants(`value`: IResolvable) {
    unwrap(this).setShadowProductionVariants(`value`.let(IResolvable::unwrap))
  }

  public open fun shadowProductionVariants(__idx_ac66f0: List<Any>) {
    unwrap(this).setShadowProductionVariants(__idx_ac66f0)
  }

  public open fun shadowProductionVariants(vararg __idx_ac66f0: Any): Unit =
      shadowProductionVariants(__idx_ac66f0.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0d0e0d67a782e560057042c142e413625f84277956f56c453ba72ae5de1d8654")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  public interface Builder {
    public fun asyncInferenceConfig(asyncInferenceConfig: IResolvable)

    public fun asyncInferenceConfig(asyncInferenceConfig: AsyncInferenceConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5b161f3d4c9c90e2a50a1acb77024e6445bdc5c90081a5331e349cfdd02a5eff")
    public
        fun asyncInferenceConfig(asyncInferenceConfig: AsyncInferenceConfigProperty.Builder.() -> Unit)

    public fun dataCaptureConfig(dataCaptureConfig: IResolvable)

    public fun dataCaptureConfig(dataCaptureConfig: DataCaptureConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c77feac906306e2d425d19ecb2dbb536e58a1389beb090dad924c75955f10ecf")
    public fun dataCaptureConfig(dataCaptureConfig: DataCaptureConfigProperty.Builder.() -> Unit)

    public fun enableNetworkIsolation(enableNetworkIsolation: Boolean)

    public fun enableNetworkIsolation(enableNetworkIsolation: IResolvable)

    public fun endpointConfigName(endpointConfigName: String)

    public fun executionRoleArn(executionRoleArn: String)

    public fun explainerConfig(explainerConfig: IResolvable)

    public fun explainerConfig(explainerConfig: ExplainerConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4cb18e4f82559478eb0db3989658df1207cb2f2ba889ad6285241ee2b2bf5795")
    public fun explainerConfig(explainerConfig: ExplainerConfigProperty.Builder.() -> Unit)

    public fun kmsKeyId(kmsKeyId: String)

    public fun productionVariants(productionVariants: IResolvable)

    public fun productionVariants(productionVariants: List<Any>)

    public fun productionVariants(vararg productionVariants: Any)

    public fun shadowProductionVariants(shadowProductionVariants: IResolvable)

    public fun shadowProductionVariants(shadowProductionVariants: List<Any>)

    public fun shadowProductionVariants(vararg shadowProductionVariants: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcConfig(vpcConfig: IResolvable)

    public fun vpcConfig(vpcConfig: VpcConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0e487acd79cd44c96b3bacebbc3966f4d25697c1f1702f0beb4b09f533242be")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.Builder =
        software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.Builder.create(scope, id)

    override fun asyncInferenceConfig(asyncInferenceConfig: IResolvable) {
      cdkBuilder.asyncInferenceConfig(asyncInferenceConfig.let(IResolvable::unwrap))
    }

    override fun asyncInferenceConfig(asyncInferenceConfig: AsyncInferenceConfigProperty) {
      cdkBuilder.asyncInferenceConfig(asyncInferenceConfig.let(AsyncInferenceConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5b161f3d4c9c90e2a50a1acb77024e6445bdc5c90081a5331e349cfdd02a5eff")
    override
        fun asyncInferenceConfig(asyncInferenceConfig: AsyncInferenceConfigProperty.Builder.() -> Unit):
        Unit = asyncInferenceConfig(AsyncInferenceConfigProperty(asyncInferenceConfig))

    override fun dataCaptureConfig(dataCaptureConfig: IResolvable) {
      cdkBuilder.dataCaptureConfig(dataCaptureConfig.let(IResolvable::unwrap))
    }

    override fun dataCaptureConfig(dataCaptureConfig: DataCaptureConfigProperty) {
      cdkBuilder.dataCaptureConfig(dataCaptureConfig.let(DataCaptureConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c77feac906306e2d425d19ecb2dbb536e58a1389beb090dad924c75955f10ecf")
    override fun dataCaptureConfig(dataCaptureConfig: DataCaptureConfigProperty.Builder.() -> Unit):
        Unit = dataCaptureConfig(DataCaptureConfigProperty(dataCaptureConfig))

    override fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
      cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
    }

    override fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
      cdkBuilder.enableNetworkIsolation(enableNetworkIsolation.let(IResolvable::unwrap))
    }

    override fun endpointConfigName(endpointConfigName: String) {
      cdkBuilder.endpointConfigName(endpointConfigName)
    }

    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    override fun explainerConfig(explainerConfig: IResolvable) {
      cdkBuilder.explainerConfig(explainerConfig.let(IResolvable::unwrap))
    }

    override fun explainerConfig(explainerConfig: ExplainerConfigProperty) {
      cdkBuilder.explainerConfig(explainerConfig.let(ExplainerConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4cb18e4f82559478eb0db3989658df1207cb2f2ba889ad6285241ee2b2bf5795")
    override fun explainerConfig(explainerConfig: ExplainerConfigProperty.Builder.() -> Unit): Unit
        = explainerConfig(ExplainerConfigProperty(explainerConfig))

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun productionVariants(productionVariants: IResolvable) {
      cdkBuilder.productionVariants(productionVariants.let(IResolvable::unwrap))
    }

    override fun productionVariants(productionVariants: List<Any>) {
      cdkBuilder.productionVariants(productionVariants)
    }

    override fun productionVariants(vararg productionVariants: Any): Unit =
        productionVariants(productionVariants.toList())

    override fun shadowProductionVariants(shadowProductionVariants: IResolvable) {
      cdkBuilder.shadowProductionVariants(shadowProductionVariants.let(IResolvable::unwrap))
    }

    override fun shadowProductionVariants(shadowProductionVariants: List<Any>) {
      cdkBuilder.shadowProductionVariants(shadowProductionVariants)
    }

    override fun shadowProductionVariants(vararg shadowProductionVariants: Any): Unit =
        shadowProductionVariants(shadowProductionVariants.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    override fun vpcConfig(vpcConfig: VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0e487acd79cd44c96b3bacebbc3966f4d25697c1f1702f0beb4b09f533242be")
    override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnEndpointConfig =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEndpointConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEndpointConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig):
        CfnEndpointConfig = CfnEndpointConfig(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointConfig):
        software.amazon.awscdk.services.sagemaker.CfnEndpointConfig = wrapped.cdkObject
  }

  public interface ServerlessConfigProperty {
    public fun maxConcurrency(): Number

    public fun memorySizeInMb(): Number

    public fun provisionedConcurrency(): Number? = unwrap(this).getProvisionedConcurrency()

    public interface Builder {
      public fun maxConcurrency(maxConcurrency: Number)

      public fun memorySizeInMb(memorySizeInMb: Number)

      public fun provisionedConcurrency(provisionedConcurrency: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ServerlessConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ServerlessConfigProperty.builder()

      override fun maxConcurrency(maxConcurrency: Number) {
        cdkBuilder.maxConcurrency(maxConcurrency)
      }

      override fun memorySizeInMb(memorySizeInMb: Number) {
        cdkBuilder.memorySizeInMb(memorySizeInMb)
      }

      override fun provisionedConcurrency(provisionedConcurrency: Number) {
        cdkBuilder.provisionedConcurrency(provisionedConcurrency)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ServerlessConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ServerlessConfigProperty,
    ) : ServerlessConfigProperty {
      override fun maxConcurrency(): Number = unwrap(this).getMaxConcurrency()

      override fun memorySizeInMb(): Number = unwrap(this).getMemorySizeInMb()

      override fun provisionedConcurrency(): Number? = unwrap(this).getProvisionedConcurrency()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ServerlessConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ServerlessConfigProperty):
          ServerlessConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerlessConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ServerlessConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AsyncInferenceNotificationConfigProperty {
    public fun errorTopic(): String? = unwrap(this).getErrorTopic()

    public fun includeInferenceResponseIn(): List<String> =
        unwrap(this).getIncludeInferenceResponseIn() ?: emptyList()

    public fun successTopic(): String? = unwrap(this).getSuccessTopic()

    public interface Builder {
      public fun errorTopic(errorTopic: String)

      public fun includeInferenceResponseIn(includeInferenceResponseIn: List<String>)

      public fun includeInferenceResponseIn(vararg includeInferenceResponseIn: String)

      public fun successTopic(successTopic: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceNotificationConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceNotificationConfigProperty.builder()

      override fun errorTopic(errorTopic: String) {
        cdkBuilder.errorTopic(errorTopic)
      }

      override fun includeInferenceResponseIn(includeInferenceResponseIn: List<String>) {
        cdkBuilder.includeInferenceResponseIn(includeInferenceResponseIn)
      }

      override fun includeInferenceResponseIn(vararg includeInferenceResponseIn: String): Unit =
          includeInferenceResponseIn(includeInferenceResponseIn.toList())

      override fun successTopic(successTopic: String) {
        cdkBuilder.successTopic(successTopic)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceNotificationConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceNotificationConfigProperty,
    ) : AsyncInferenceNotificationConfigProperty {
      override fun errorTopic(): String? = unwrap(this).getErrorTopic()

      override fun includeInferenceResponseIn(): List<String> =
          unwrap(this).getIncludeInferenceResponseIn() ?: emptyList()

      override fun successTopic(): String? = unwrap(this).getSuccessTopic()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AsyncInferenceNotificationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceNotificationConfigProperty):
          AsyncInferenceNotificationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AsyncInferenceNotificationConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceNotificationConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AsyncInferenceConfigProperty {
    public fun clientConfig(): Any? = unwrap(this).getClientConfig()

    public fun outputConfig(): Any

    public interface Builder {
      public fun clientConfig(clientConfig: IResolvable)

      public fun clientConfig(clientConfig: AsyncInferenceClientConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1451d55f7c6dcc93f208c9544ff16035452f4f231f52fafb3c53a316a2c1cce2")
      public fun clientConfig(clientConfig: AsyncInferenceClientConfigProperty.Builder.() -> Unit)

      public fun outputConfig(outputConfig: IResolvable)

      public fun outputConfig(outputConfig: AsyncInferenceOutputConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("330ef4c48ff9947d6c2c196a853e54d1c8fc468d35a6ff22ea2b66f9b4f42287")
      public fun outputConfig(outputConfig: AsyncInferenceOutputConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceConfigProperty.builder()

      override fun clientConfig(clientConfig: IResolvable) {
        cdkBuilder.clientConfig(clientConfig.let(IResolvable::unwrap))
      }

      override fun clientConfig(clientConfig: AsyncInferenceClientConfigProperty) {
        cdkBuilder.clientConfig(clientConfig.let(AsyncInferenceClientConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1451d55f7c6dcc93f208c9544ff16035452f4f231f52fafb3c53a316a2c1cce2")
      override
          fun clientConfig(clientConfig: AsyncInferenceClientConfigProperty.Builder.() -> Unit):
          Unit = clientConfig(AsyncInferenceClientConfigProperty(clientConfig))

      override fun outputConfig(outputConfig: IResolvable) {
        cdkBuilder.outputConfig(outputConfig.let(IResolvable::unwrap))
      }

      override fun outputConfig(outputConfig: AsyncInferenceOutputConfigProperty) {
        cdkBuilder.outputConfig(outputConfig.let(AsyncInferenceOutputConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("330ef4c48ff9947d6c2c196a853e54d1c8fc468d35a6ff22ea2b66f9b4f42287")
      override
          fun outputConfig(outputConfig: AsyncInferenceOutputConfigProperty.Builder.() -> Unit):
          Unit = outputConfig(AsyncInferenceOutputConfigProperty(outputConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceConfigProperty,
    ) : AsyncInferenceConfigProperty {
      override fun clientConfig(): Any? = unwrap(this).getClientConfig()

      override fun outputConfig(): Any = unwrap(this).getOutputConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AsyncInferenceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceConfigProperty):
          AsyncInferenceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AsyncInferenceConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ClarifyTextConfigProperty {
    public fun granularity(): String

    public fun language(): String

    public interface Builder {
      public fun granularity(granularity: String)

      public fun language(language: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyTextConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyTextConfigProperty.builder()

      override fun granularity(granularity: String) {
        cdkBuilder.granularity(granularity)
      }

      override fun language(language: String) {
        cdkBuilder.language(language)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyTextConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyTextConfigProperty,
    ) : ClarifyTextConfigProperty {
      override fun granularity(): String = unwrap(this).getGranularity()

      override fun language(): String = unwrap(this).getLanguage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClarifyTextConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyTextConfigProperty):
          ClarifyTextConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClarifyTextConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyTextConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AsyncInferenceClientConfigProperty {
    public fun maxConcurrentInvocationsPerInstance(): Number? =
        unwrap(this).getMaxConcurrentInvocationsPerInstance()

    public interface Builder {
      public fun maxConcurrentInvocationsPerInstance(maxConcurrentInvocationsPerInstance: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceClientConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceClientConfigProperty.builder()

      override
          fun maxConcurrentInvocationsPerInstance(maxConcurrentInvocationsPerInstance: Number) {
        cdkBuilder.maxConcurrentInvocationsPerInstance(maxConcurrentInvocationsPerInstance)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceClientConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceClientConfigProperty,
    ) : AsyncInferenceClientConfigProperty {
      override fun maxConcurrentInvocationsPerInstance(): Number? =
          unwrap(this).getMaxConcurrentInvocationsPerInstance()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AsyncInferenceClientConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceClientConfigProperty):
          AsyncInferenceClientConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AsyncInferenceClientConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceClientConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CaptureContentTypeHeaderProperty {
    public fun csvContentTypes(): List<String> = unwrap(this).getCsvContentTypes() ?: emptyList()

    public fun jsonContentTypes(): List<String> = unwrap(this).getJsonContentTypes() ?: emptyList()

    public interface Builder {
      public fun csvContentTypes(csvContentTypes: List<String>)

      public fun csvContentTypes(vararg csvContentTypes: String)

      public fun jsonContentTypes(jsonContentTypes: List<String>)

      public fun jsonContentTypes(vararg jsonContentTypes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureContentTypeHeaderProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureContentTypeHeaderProperty.builder()

      override fun csvContentTypes(csvContentTypes: List<String>) {
        cdkBuilder.csvContentTypes(csvContentTypes)
      }

      override fun csvContentTypes(vararg csvContentTypes: String): Unit =
          csvContentTypes(csvContentTypes.toList())

      override fun jsonContentTypes(jsonContentTypes: List<String>) {
        cdkBuilder.jsonContentTypes(jsonContentTypes)
      }

      override fun jsonContentTypes(vararg jsonContentTypes: String): Unit =
          jsonContentTypes(jsonContentTypes.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureContentTypeHeaderProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureContentTypeHeaderProperty,
    ) : CaptureContentTypeHeaderProperty {
      override fun csvContentTypes(): List<String> = unwrap(this).getCsvContentTypes() ?:
          emptyList()

      override fun jsonContentTypes(): List<String> = unwrap(this).getJsonContentTypes() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CaptureContentTypeHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureContentTypeHeaderProperty):
          CaptureContentTypeHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptureContentTypeHeaderProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureContentTypeHeaderProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ClarifyInferenceConfigProperty {
    public fun contentTemplate(): String? = unwrap(this).getContentTemplate()

    public fun featureHeaders(): List<String> = unwrap(this).getFeatureHeaders() ?: emptyList()

    public fun featureTypes(): List<String> = unwrap(this).getFeatureTypes() ?: emptyList()

    public fun featuresAttribute(): String? = unwrap(this).getFeaturesAttribute()

    public fun labelAttribute(): String? = unwrap(this).getLabelAttribute()

    public fun labelHeaders(): List<String> = unwrap(this).getLabelHeaders() ?: emptyList()

    public fun labelIndex(): Number? = unwrap(this).getLabelIndex()

    public fun maxPayloadInMb(): Number? = unwrap(this).getMaxPayloadInMb()

    public fun maxRecordCount(): Number? = unwrap(this).getMaxRecordCount()

    public fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

    public fun probabilityIndex(): Number? = unwrap(this).getProbabilityIndex()

    public interface Builder {
      public fun contentTemplate(contentTemplate: String)

      public fun featureHeaders(featureHeaders: List<String>)

      public fun featureHeaders(vararg featureHeaders: String)

      public fun featureTypes(featureTypes: List<String>)

      public fun featureTypes(vararg featureTypes: String)

      public fun featuresAttribute(featuresAttribute: String)

      public fun labelAttribute(labelAttribute: String)

      public fun labelHeaders(labelHeaders: List<String>)

      public fun labelHeaders(vararg labelHeaders: String)

      public fun labelIndex(labelIndex: Number)

      public fun maxPayloadInMb(maxPayloadInMb: Number)

      public fun maxRecordCount(maxRecordCount: Number)

      public fun probabilityAttribute(probabilityAttribute: String)

      public fun probabilityIndex(probabilityIndex: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyInferenceConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyInferenceConfigProperty.builder()

      override fun contentTemplate(contentTemplate: String) {
        cdkBuilder.contentTemplate(contentTemplate)
      }

      override fun featureHeaders(featureHeaders: List<String>) {
        cdkBuilder.featureHeaders(featureHeaders)
      }

      override fun featureHeaders(vararg featureHeaders: String): Unit =
          featureHeaders(featureHeaders.toList())

      override fun featureTypes(featureTypes: List<String>) {
        cdkBuilder.featureTypes(featureTypes)
      }

      override fun featureTypes(vararg featureTypes: String): Unit =
          featureTypes(featureTypes.toList())

      override fun featuresAttribute(featuresAttribute: String) {
        cdkBuilder.featuresAttribute(featuresAttribute)
      }

      override fun labelAttribute(labelAttribute: String) {
        cdkBuilder.labelAttribute(labelAttribute)
      }

      override fun labelHeaders(labelHeaders: List<String>) {
        cdkBuilder.labelHeaders(labelHeaders)
      }

      override fun labelHeaders(vararg labelHeaders: String): Unit =
          labelHeaders(labelHeaders.toList())

      override fun labelIndex(labelIndex: Number) {
        cdkBuilder.labelIndex(labelIndex)
      }

      override fun maxPayloadInMb(maxPayloadInMb: Number) {
        cdkBuilder.maxPayloadInMb(maxPayloadInMb)
      }

      override fun maxRecordCount(maxRecordCount: Number) {
        cdkBuilder.maxRecordCount(maxRecordCount)
      }

      override fun probabilityAttribute(probabilityAttribute: String) {
        cdkBuilder.probabilityAttribute(probabilityAttribute)
      }

      override fun probabilityIndex(probabilityIndex: Number) {
        cdkBuilder.probabilityIndex(probabilityIndex)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyInferenceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyInferenceConfigProperty,
    ) : ClarifyInferenceConfigProperty {
      override fun contentTemplate(): String? = unwrap(this).getContentTemplate()

      override fun featureHeaders(): List<String> = unwrap(this).getFeatureHeaders() ?: emptyList()

      override fun featureTypes(): List<String> = unwrap(this).getFeatureTypes() ?: emptyList()

      override fun featuresAttribute(): String? = unwrap(this).getFeaturesAttribute()

      override fun labelAttribute(): String? = unwrap(this).getLabelAttribute()

      override fun labelHeaders(): List<String> = unwrap(this).getLabelHeaders() ?: emptyList()

      override fun labelIndex(): Number? = unwrap(this).getLabelIndex()

      override fun maxPayloadInMb(): Number? = unwrap(this).getMaxPayloadInMb()

      override fun maxRecordCount(): Number? = unwrap(this).getMaxRecordCount()

      override fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

      override fun probabilityIndex(): Number? = unwrap(this).getProbabilityIndex()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClarifyInferenceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyInferenceConfigProperty):
          ClarifyInferenceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClarifyInferenceConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyInferenceConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VpcConfigProperty {
    public fun securityGroupIds(): List<String>

    public fun subnets(): List<String>

    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun securityGroupIds(vararg securityGroupIds: String)

      public fun subnets(subnets: List<String>)

      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.VpcConfigProperty.builder()

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.VpcConfigProperty,
    ) : VpcConfigProperty {
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      override fun subnets(): List<String> = unwrap(this).getSubnets()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.VpcConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ProductionVariantProperty {
    public fun acceleratorType(): String? = unwrap(this).getAcceleratorType()

    public fun containerStartupHealthCheckTimeoutInSeconds(): Number? =
        unwrap(this).getContainerStartupHealthCheckTimeoutInSeconds()

    public fun enableSsmAccess(): Any? = unwrap(this).getEnableSsmAccess()

    public fun initialInstanceCount(): Number? = unwrap(this).getInitialInstanceCount()

    public fun initialVariantWeight(): Number? = unwrap(this).getInitialVariantWeight()

    public fun instanceType(): String? = unwrap(this).getInstanceType()

    public fun managedInstanceScaling(): Any? = unwrap(this).getManagedInstanceScaling()

    public fun modelDataDownloadTimeoutInSeconds(): Number? =
        unwrap(this).getModelDataDownloadTimeoutInSeconds()

    public fun modelName(): String? = unwrap(this).getModelName()

    public fun routingConfig(): Any? = unwrap(this).getRoutingConfig()

    public fun serverlessConfig(): Any? = unwrap(this).getServerlessConfig()

    public fun variantName(): String

    public fun volumeSizeInGb(): Number? = unwrap(this).getVolumeSizeInGb()

    public interface Builder {
      public fun acceleratorType(acceleratorType: String)

      public
          fun containerStartupHealthCheckTimeoutInSeconds(containerStartupHealthCheckTimeoutInSeconds: Number)

      public fun enableSsmAccess(enableSsmAccess: Boolean)

      public fun enableSsmAccess(enableSsmAccess: IResolvable)

      public fun initialInstanceCount(initialInstanceCount: Number)

      public fun initialVariantWeight(initialVariantWeight: Number)

      public fun instanceType(instanceType: String)

      public fun managedInstanceScaling(managedInstanceScaling: IResolvable)

      public fun managedInstanceScaling(managedInstanceScaling: ManagedInstanceScalingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e16d9dac6a790bb283d273d4e7065bfc001dcde6903dd4c168a3e781ca8f8f37")
      public
          fun managedInstanceScaling(managedInstanceScaling: ManagedInstanceScalingProperty.Builder.() -> Unit)

      public fun modelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds: Number)

      public fun modelName(modelName: String)

      public fun routingConfig(routingConfig: IResolvable)

      public fun routingConfig(routingConfig: RoutingConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2507a2cd03e4f8e17a6d899f02b51fb4fbbd89145598c29b99e68027686dc3ae")
      public fun routingConfig(routingConfig: RoutingConfigProperty.Builder.() -> Unit)

      public fun serverlessConfig(serverlessConfig: IResolvable)

      public fun serverlessConfig(serverlessConfig: ServerlessConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8518f8619a032369fb0d6b65bdcd28bf38289354fc8fd8a25a1d2a36ef3cd14d")
      public fun serverlessConfig(serverlessConfig: ServerlessConfigProperty.Builder.() -> Unit)

      public fun variantName(variantName: String)

      public fun volumeSizeInGb(volumeSizeInGb: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty.builder()

      override fun acceleratorType(acceleratorType: String) {
        cdkBuilder.acceleratorType(acceleratorType)
      }

      override
          fun containerStartupHealthCheckTimeoutInSeconds(containerStartupHealthCheckTimeoutInSeconds: Number) {
        cdkBuilder.containerStartupHealthCheckTimeoutInSeconds(containerStartupHealthCheckTimeoutInSeconds)
      }

      override fun enableSsmAccess(enableSsmAccess: Boolean) {
        cdkBuilder.enableSsmAccess(enableSsmAccess)
      }

      override fun enableSsmAccess(enableSsmAccess: IResolvable) {
        cdkBuilder.enableSsmAccess(enableSsmAccess.let(IResolvable::unwrap))
      }

      override fun initialInstanceCount(initialInstanceCount: Number) {
        cdkBuilder.initialInstanceCount(initialInstanceCount)
      }

      override fun initialVariantWeight(initialVariantWeight: Number) {
        cdkBuilder.initialVariantWeight(initialVariantWeight)
      }

      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      override fun managedInstanceScaling(managedInstanceScaling: IResolvable) {
        cdkBuilder.managedInstanceScaling(managedInstanceScaling.let(IResolvable::unwrap))
      }

      override fun managedInstanceScaling(managedInstanceScaling: ManagedInstanceScalingProperty) {
        cdkBuilder.managedInstanceScaling(managedInstanceScaling.let(ManagedInstanceScalingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e16d9dac6a790bb283d273d4e7065bfc001dcde6903dd4c168a3e781ca8f8f37")
      override
          fun managedInstanceScaling(managedInstanceScaling: ManagedInstanceScalingProperty.Builder.() -> Unit):
          Unit = managedInstanceScaling(ManagedInstanceScalingProperty(managedInstanceScaling))

      override fun modelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds: Number) {
        cdkBuilder.modelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds)
      }

      override fun modelName(modelName: String) {
        cdkBuilder.modelName(modelName)
      }

      override fun routingConfig(routingConfig: IResolvable) {
        cdkBuilder.routingConfig(routingConfig.let(IResolvable::unwrap))
      }

      override fun routingConfig(routingConfig: RoutingConfigProperty) {
        cdkBuilder.routingConfig(routingConfig.let(RoutingConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2507a2cd03e4f8e17a6d899f02b51fb4fbbd89145598c29b99e68027686dc3ae")
      override fun routingConfig(routingConfig: RoutingConfigProperty.Builder.() -> Unit): Unit =
          routingConfig(RoutingConfigProperty(routingConfig))

      override fun serverlessConfig(serverlessConfig: IResolvable) {
        cdkBuilder.serverlessConfig(serverlessConfig.let(IResolvable::unwrap))
      }

      override fun serverlessConfig(serverlessConfig: ServerlessConfigProperty) {
        cdkBuilder.serverlessConfig(serverlessConfig.let(ServerlessConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8518f8619a032369fb0d6b65bdcd28bf38289354fc8fd8a25a1d2a36ef3cd14d")
      override fun serverlessConfig(serverlessConfig: ServerlessConfigProperty.Builder.() -> Unit):
          Unit = serverlessConfig(ServerlessConfigProperty(serverlessConfig))

      override fun variantName(variantName: String) {
        cdkBuilder.variantName(variantName)
      }

      override fun volumeSizeInGb(volumeSizeInGb: Number) {
        cdkBuilder.volumeSizeInGb(volumeSizeInGb)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty,
    ) : ProductionVariantProperty {
      override fun acceleratorType(): String? = unwrap(this).getAcceleratorType()

      override fun containerStartupHealthCheckTimeoutInSeconds(): Number? =
          unwrap(this).getContainerStartupHealthCheckTimeoutInSeconds()

      override fun enableSsmAccess(): Any? = unwrap(this).getEnableSsmAccess()

      override fun initialInstanceCount(): Number? = unwrap(this).getInitialInstanceCount()

      override fun initialVariantWeight(): Number? = unwrap(this).getInitialVariantWeight()

      override fun instanceType(): String? = unwrap(this).getInstanceType()

      override fun managedInstanceScaling(): Any? = unwrap(this).getManagedInstanceScaling()

      override fun modelDataDownloadTimeoutInSeconds(): Number? =
          unwrap(this).getModelDataDownloadTimeoutInSeconds()

      override fun modelName(): String? = unwrap(this).getModelName()

      override fun routingConfig(): Any? = unwrap(this).getRoutingConfig()

      override fun serverlessConfig(): Any? = unwrap(this).getServerlessConfig()

      override fun variantName(): String = unwrap(this).getVariantName()

      override fun volumeSizeInGb(): Number? = unwrap(this).getVolumeSizeInGb()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProductionVariantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty):
          ProductionVariantProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProductionVariantProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RoutingConfigProperty {
    public fun routingStrategy(): String? = unwrap(this).getRoutingStrategy()

    public interface Builder {
      public fun routingStrategy(routingStrategy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.RoutingConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.RoutingConfigProperty.builder()

      override fun routingStrategy(routingStrategy: String) {
        cdkBuilder.routingStrategy(routingStrategy)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.RoutingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.RoutingConfigProperty,
    ) : RoutingConfigProperty {
      override fun routingStrategy(): String? = unwrap(this).getRoutingStrategy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RoutingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.RoutingConfigProperty):
          RoutingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoutingConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.RoutingConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ManagedInstanceScalingProperty {
    public fun maxInstanceCount(): Number? = unwrap(this).getMaxInstanceCount()

    public fun minInstanceCount(): Number? = unwrap(this).getMinInstanceCount()

    public fun status(): String? = unwrap(this).getStatus()

    public interface Builder {
      public fun maxInstanceCount(maxInstanceCount: Number)

      public fun minInstanceCount(minInstanceCount: Number)

      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ManagedInstanceScalingProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ManagedInstanceScalingProperty.builder()

      override fun maxInstanceCount(maxInstanceCount: Number) {
        cdkBuilder.maxInstanceCount(maxInstanceCount)
      }

      override fun minInstanceCount(minInstanceCount: Number) {
        cdkBuilder.minInstanceCount(minInstanceCount)
      }

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ManagedInstanceScalingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ManagedInstanceScalingProperty,
    ) : ManagedInstanceScalingProperty {
      override fun maxInstanceCount(): Number? = unwrap(this).getMaxInstanceCount()

      override fun minInstanceCount(): Number? = unwrap(this).getMinInstanceCount()

      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ManagedInstanceScalingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ManagedInstanceScalingProperty):
          ManagedInstanceScalingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManagedInstanceScalingProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ManagedInstanceScalingProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ClarifyShapConfigProperty {
    public fun numberOfSamples(): Number? = unwrap(this).getNumberOfSamples()

    public fun seed(): Number? = unwrap(this).getSeed()

    public fun shapBaselineConfig(): Any

    public fun textConfig(): Any? = unwrap(this).getTextConfig()

    public fun useLogit(): Any? = unwrap(this).getUseLogit()

    public interface Builder {
      public fun numberOfSamples(numberOfSamples: Number)

      public fun seed(seed: Number)

      public fun shapBaselineConfig(shapBaselineConfig: IResolvable)

      public fun shapBaselineConfig(shapBaselineConfig: ClarifyShapBaselineConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44aefe325dc16ac11efdebc723e4ef1555d693949ab2ed27cb854537e5ad5c16")
      public
          fun shapBaselineConfig(shapBaselineConfig: ClarifyShapBaselineConfigProperty.Builder.() -> Unit)

      public fun textConfig(textConfig: IResolvable)

      public fun textConfig(textConfig: ClarifyTextConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b91c22d36031d535f6f206b20d3bc0e1f205b2edf557d1a5e89ad765b0363479")
      public fun textConfig(textConfig: ClarifyTextConfigProperty.Builder.() -> Unit)

      public fun useLogit(useLogit: Boolean)

      public fun useLogit(useLogit: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapConfigProperty.builder()

      override fun numberOfSamples(numberOfSamples: Number) {
        cdkBuilder.numberOfSamples(numberOfSamples)
      }

      override fun seed(seed: Number) {
        cdkBuilder.seed(seed)
      }

      override fun shapBaselineConfig(shapBaselineConfig: IResolvable) {
        cdkBuilder.shapBaselineConfig(shapBaselineConfig.let(IResolvable::unwrap))
      }

      override fun shapBaselineConfig(shapBaselineConfig: ClarifyShapBaselineConfigProperty) {
        cdkBuilder.shapBaselineConfig(shapBaselineConfig.let(ClarifyShapBaselineConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44aefe325dc16ac11efdebc723e4ef1555d693949ab2ed27cb854537e5ad5c16")
      override
          fun shapBaselineConfig(shapBaselineConfig: ClarifyShapBaselineConfigProperty.Builder.() -> Unit):
          Unit = shapBaselineConfig(ClarifyShapBaselineConfigProperty(shapBaselineConfig))

      override fun textConfig(textConfig: IResolvable) {
        cdkBuilder.textConfig(textConfig.let(IResolvable::unwrap))
      }

      override fun textConfig(textConfig: ClarifyTextConfigProperty) {
        cdkBuilder.textConfig(textConfig.let(ClarifyTextConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b91c22d36031d535f6f206b20d3bc0e1f205b2edf557d1a5e89ad765b0363479")
      override fun textConfig(textConfig: ClarifyTextConfigProperty.Builder.() -> Unit): Unit =
          textConfig(ClarifyTextConfigProperty(textConfig))

      override fun useLogit(useLogit: Boolean) {
        cdkBuilder.useLogit(useLogit)
      }

      override fun useLogit(useLogit: IResolvable) {
        cdkBuilder.useLogit(useLogit.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapConfigProperty,
    ) : ClarifyShapConfigProperty {
      override fun numberOfSamples(): Number? = unwrap(this).getNumberOfSamples()

      override fun seed(): Number? = unwrap(this).getSeed()

      override fun shapBaselineConfig(): Any = unwrap(this).getShapBaselineConfig()

      override fun textConfig(): Any? = unwrap(this).getTextConfig()

      override fun useLogit(): Any? = unwrap(this).getUseLogit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClarifyShapConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapConfigProperty):
          ClarifyShapConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClarifyShapConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataCaptureConfigProperty {
    public fun captureContentTypeHeader(): Any? = unwrap(this).getCaptureContentTypeHeader()

    public fun captureOptions(): Any

    public fun destinationS3Uri(): String

    public fun enableCapture(): Any? = unwrap(this).getEnableCapture()

    public fun initialSamplingPercentage(): Number

    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public interface Builder {
      public fun captureContentTypeHeader(captureContentTypeHeader: IResolvable)

      public
          fun captureContentTypeHeader(captureContentTypeHeader: CaptureContentTypeHeaderProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31a3df691231e3741b21575ed4957e82fdb752b2995392ce72f37435a3fbfd17")
      public
          fun captureContentTypeHeader(captureContentTypeHeader: CaptureContentTypeHeaderProperty.Builder.() -> Unit)

      public fun captureOptions(captureOptions: IResolvable)

      public fun captureOptions(captureOptions: List<Any>)

      public fun captureOptions(vararg captureOptions: Any)

      public fun destinationS3Uri(destinationS3Uri: String)

      public fun enableCapture(enableCapture: Boolean)

      public fun enableCapture(enableCapture: IResolvable)

      public fun initialSamplingPercentage(initialSamplingPercentage: Number)

      public fun kmsKeyId(kmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.DataCaptureConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.DataCaptureConfigProperty.builder()

      override fun captureContentTypeHeader(captureContentTypeHeader: IResolvable) {
        cdkBuilder.captureContentTypeHeader(captureContentTypeHeader.let(IResolvable::unwrap))
      }

      override
          fun captureContentTypeHeader(captureContentTypeHeader: CaptureContentTypeHeaderProperty) {
        cdkBuilder.captureContentTypeHeader(captureContentTypeHeader.let(CaptureContentTypeHeaderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31a3df691231e3741b21575ed4957e82fdb752b2995392ce72f37435a3fbfd17")
      override
          fun captureContentTypeHeader(captureContentTypeHeader: CaptureContentTypeHeaderProperty.Builder.() -> Unit):
          Unit =
          captureContentTypeHeader(CaptureContentTypeHeaderProperty(captureContentTypeHeader))

      override fun captureOptions(captureOptions: IResolvable) {
        cdkBuilder.captureOptions(captureOptions.let(IResolvable::unwrap))
      }

      override fun captureOptions(captureOptions: List<Any>) {
        cdkBuilder.captureOptions(captureOptions)
      }

      override fun captureOptions(vararg captureOptions: Any): Unit =
          captureOptions(captureOptions.toList())

      override fun destinationS3Uri(destinationS3Uri: String) {
        cdkBuilder.destinationS3Uri(destinationS3Uri)
      }

      override fun enableCapture(enableCapture: Boolean) {
        cdkBuilder.enableCapture(enableCapture)
      }

      override fun enableCapture(enableCapture: IResolvable) {
        cdkBuilder.enableCapture(enableCapture.let(IResolvable::unwrap))
      }

      override fun initialSamplingPercentage(initialSamplingPercentage: Number) {
        cdkBuilder.initialSamplingPercentage(initialSamplingPercentage)
      }

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.DataCaptureConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.DataCaptureConfigProperty,
    ) : DataCaptureConfigProperty {
      override fun captureContentTypeHeader(): Any? = unwrap(this).getCaptureContentTypeHeader()

      override fun captureOptions(): Any = unwrap(this).getCaptureOptions()

      override fun destinationS3Uri(): String = unwrap(this).getDestinationS3Uri()

      override fun enableCapture(): Any? = unwrap(this).getEnableCapture()

      override fun initialSamplingPercentage(): Number = unwrap(this).getInitialSamplingPercentage()

      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataCaptureConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.DataCaptureConfigProperty):
          DataCaptureConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataCaptureConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.DataCaptureConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ClarifyExplainerConfigProperty {
    public fun enableExplanations(): String? = unwrap(this).getEnableExplanations()

    public fun inferenceConfig(): Any? = unwrap(this).getInferenceConfig()

    public fun shapConfig(): Any

    public interface Builder {
      public fun enableExplanations(enableExplanations: String)

      public fun inferenceConfig(inferenceConfig: IResolvable)

      public fun inferenceConfig(inferenceConfig: ClarifyInferenceConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d3847dc1e89bbccd4521b78d7f69dfe3103728da680575e496f455e90b0ba64")
      public fun inferenceConfig(inferenceConfig: ClarifyInferenceConfigProperty.Builder.() -> Unit)

      public fun shapConfig(shapConfig: IResolvable)

      public fun shapConfig(shapConfig: ClarifyShapConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e18830621d5bb7e43df94655ffbe11f05a35ea31fe7a0d8210a2f1b7d359d47")
      public fun shapConfig(shapConfig: ClarifyShapConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyExplainerConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyExplainerConfigProperty.builder()

      override fun enableExplanations(enableExplanations: String) {
        cdkBuilder.enableExplanations(enableExplanations)
      }

      override fun inferenceConfig(inferenceConfig: IResolvable) {
        cdkBuilder.inferenceConfig(inferenceConfig.let(IResolvable::unwrap))
      }

      override fun inferenceConfig(inferenceConfig: ClarifyInferenceConfigProperty) {
        cdkBuilder.inferenceConfig(inferenceConfig.let(ClarifyInferenceConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d3847dc1e89bbccd4521b78d7f69dfe3103728da680575e496f455e90b0ba64")
      override
          fun inferenceConfig(inferenceConfig: ClarifyInferenceConfigProperty.Builder.() -> Unit):
          Unit = inferenceConfig(ClarifyInferenceConfigProperty(inferenceConfig))

      override fun shapConfig(shapConfig: IResolvable) {
        cdkBuilder.shapConfig(shapConfig.let(IResolvable::unwrap))
      }

      override fun shapConfig(shapConfig: ClarifyShapConfigProperty) {
        cdkBuilder.shapConfig(shapConfig.let(ClarifyShapConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e18830621d5bb7e43df94655ffbe11f05a35ea31fe7a0d8210a2f1b7d359d47")
      override fun shapConfig(shapConfig: ClarifyShapConfigProperty.Builder.() -> Unit): Unit =
          shapConfig(ClarifyShapConfigProperty(shapConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyExplainerConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyExplainerConfigProperty,
    ) : ClarifyExplainerConfigProperty {
      override fun enableExplanations(): String? = unwrap(this).getEnableExplanations()

      override fun inferenceConfig(): Any? = unwrap(this).getInferenceConfig()

      override fun shapConfig(): Any = unwrap(this).getShapConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClarifyExplainerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyExplainerConfigProperty):
          ClarifyExplainerConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClarifyExplainerConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyExplainerConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ExplainerConfigProperty {
    public fun clarifyExplainerConfig(): Any? = unwrap(this).getClarifyExplainerConfig()

    public interface Builder {
      public fun clarifyExplainerConfig(clarifyExplainerConfig: IResolvable)

      public fun clarifyExplainerConfig(clarifyExplainerConfig: ClarifyExplainerConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61e075251fd9dec5d2e4d8a12c1f17e34e37cb8efce9a075355d11388bc99d53")
      public
          fun clarifyExplainerConfig(clarifyExplainerConfig: ClarifyExplainerConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ExplainerConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ExplainerConfigProperty.builder()

      override fun clarifyExplainerConfig(clarifyExplainerConfig: IResolvable) {
        cdkBuilder.clarifyExplainerConfig(clarifyExplainerConfig.let(IResolvable::unwrap))
      }

      override fun clarifyExplainerConfig(clarifyExplainerConfig: ClarifyExplainerConfigProperty) {
        cdkBuilder.clarifyExplainerConfig(clarifyExplainerConfig.let(ClarifyExplainerConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61e075251fd9dec5d2e4d8a12c1f17e34e37cb8efce9a075355d11388bc99d53")
      override
          fun clarifyExplainerConfig(clarifyExplainerConfig: ClarifyExplainerConfigProperty.Builder.() -> Unit):
          Unit = clarifyExplainerConfig(ClarifyExplainerConfigProperty(clarifyExplainerConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ExplainerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ExplainerConfigProperty,
    ) : ExplainerConfigProperty {
      override fun clarifyExplainerConfig(): Any? = unwrap(this).getClarifyExplainerConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ExplainerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ExplainerConfigProperty):
          ExplainerConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExplainerConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ExplainerConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CaptureOptionProperty {
    public fun captureMode(): String

    public interface Builder {
      public fun captureMode(captureMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureOptionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureOptionProperty.builder()

      override fun captureMode(captureMode: String) {
        cdkBuilder.captureMode(captureMode)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureOptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureOptionProperty,
    ) : CaptureOptionProperty {
      override fun captureMode(): String = unwrap(this).getCaptureMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CaptureOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureOptionProperty):
          CaptureOptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptureOptionProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureOptionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ClarifyShapBaselineConfigProperty {
    public fun mimeType(): String? = unwrap(this).getMimeType()

    public fun shapBaseline(): String? = unwrap(this).getShapBaseline()

    public fun shapBaselineUri(): String? = unwrap(this).getShapBaselineUri()

    public interface Builder {
      public fun mimeType(mimeType: String)

      public fun shapBaseline(shapBaseline: String)

      public fun shapBaselineUri(shapBaselineUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapBaselineConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapBaselineConfigProperty.builder()

      override fun mimeType(mimeType: String) {
        cdkBuilder.mimeType(mimeType)
      }

      override fun shapBaseline(shapBaseline: String) {
        cdkBuilder.shapBaseline(shapBaseline)
      }

      override fun shapBaselineUri(shapBaselineUri: String) {
        cdkBuilder.shapBaselineUri(shapBaselineUri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapBaselineConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapBaselineConfigProperty,
    ) : ClarifyShapBaselineConfigProperty {
      override fun mimeType(): String? = unwrap(this).getMimeType()

      override fun shapBaseline(): String? = unwrap(this).getShapBaseline()

      override fun shapBaselineUri(): String? = unwrap(this).getShapBaselineUri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ClarifyShapBaselineConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapBaselineConfigProperty):
          ClarifyShapBaselineConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClarifyShapBaselineConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapBaselineConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AsyncInferenceOutputConfigProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun notificationConfig(): Any? = unwrap(this).getNotificationConfig()

    public fun s3FailurePath(): String? = unwrap(this).getS3FailurePath()

    public fun s3OutputPath(): String? = unwrap(this).getS3OutputPath()

    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String)

      public fun notificationConfig(notificationConfig: IResolvable)

      public fun notificationConfig(notificationConfig: AsyncInferenceNotificationConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3338c4e7a789e490c929ebb44cd454a0619e9b7a124dc2800175ea742e577929")
      public
          fun notificationConfig(notificationConfig: AsyncInferenceNotificationConfigProperty.Builder.() -> Unit)

      public fun s3FailurePath(s3FailurePath: String)

      public fun s3OutputPath(s3OutputPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceOutputConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceOutputConfigProperty.builder()

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      override fun notificationConfig(notificationConfig: IResolvable) {
        cdkBuilder.notificationConfig(notificationConfig.let(IResolvable::unwrap))
      }

      override
          fun notificationConfig(notificationConfig: AsyncInferenceNotificationConfigProperty) {
        cdkBuilder.notificationConfig(notificationConfig.let(AsyncInferenceNotificationConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3338c4e7a789e490c929ebb44cd454a0619e9b7a124dc2800175ea742e577929")
      override
          fun notificationConfig(notificationConfig: AsyncInferenceNotificationConfigProperty.Builder.() -> Unit):
          Unit = notificationConfig(AsyncInferenceNotificationConfigProperty(notificationConfig))

      override fun s3FailurePath(s3FailurePath: String) {
        cdkBuilder.s3FailurePath(s3FailurePath)
      }

      override fun s3OutputPath(s3OutputPath: String) {
        cdkBuilder.s3OutputPath(s3OutputPath)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceOutputConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceOutputConfigProperty,
    ) : AsyncInferenceOutputConfigProperty {
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      override fun notificationConfig(): Any? = unwrap(this).getNotificationConfig()

      override fun s3FailurePath(): String? = unwrap(this).getS3FailurePath()

      override fun s3OutputPath(): String? = unwrap(this).getS3OutputPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AsyncInferenceOutputConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceOutputConfigProperty):
          AsyncInferenceOutputConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AsyncInferenceOutputConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceOutputConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
