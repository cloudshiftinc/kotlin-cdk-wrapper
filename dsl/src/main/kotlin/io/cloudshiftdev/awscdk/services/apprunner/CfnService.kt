package io.cloudshiftdev.awscdk.services.apprunner

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

public open class CfnService internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apprunner.CfnService,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrServiceArn(): String = unwrap(this).getAttrServiceArn()

  public open fun attrServiceId(): String = unwrap(this).getAttrServiceId()

  public open fun attrServiceUrl(): String = unwrap(this).getAttrServiceUrl()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun autoScalingConfigurationArn(): String? =
      unwrap(this).getAutoScalingConfigurationArn()

  public open fun autoScalingConfigurationArn(`value`: String) {
    unwrap(this).setAutoScalingConfigurationArn(`value`)
  }

  public open fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

  public open fun encryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setEncryptionConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun encryptionConfiguration(`value`: EncryptionConfigurationProperty) {
    unwrap(this).setEncryptionConfiguration(`value`.let(EncryptionConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("98b91e5756ce40a80d5bc0e4703cad4ab2223a2c40031f2995d027775f6a50a7")
  public open
      fun encryptionConfiguration(`value`: EncryptionConfigurationProperty.Builder.() -> Unit): Unit
      = encryptionConfiguration(EncryptionConfigurationProperty(`value`))

  public open fun healthCheckConfiguration(): Any? = unwrap(this).getHealthCheckConfiguration()

  public open fun healthCheckConfiguration(`value`: IResolvable) {
    unwrap(this).setHealthCheckConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun healthCheckConfiguration(`value`: HealthCheckConfigurationProperty) {
    unwrap(this).setHealthCheckConfiguration(`value`.let(HealthCheckConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3e1f01cf9f303d2c4c34bb69fed0e62c8935d776293113f73d1db67e18d2df7b")
  public open
      fun healthCheckConfiguration(`value`: HealthCheckConfigurationProperty.Builder.() -> Unit):
      Unit = healthCheckConfiguration(HealthCheckConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceConfiguration(): Any? = unwrap(this).getInstanceConfiguration()

  public open fun instanceConfiguration(`value`: IResolvable) {
    unwrap(this).setInstanceConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun instanceConfiguration(`value`: InstanceConfigurationProperty) {
    unwrap(this).setInstanceConfiguration(`value`.let(InstanceConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1b425254fdaf4d2116d2417104df1a4bec5a27985ad0d2e2c69ba42c04fe97b9")
  public open fun instanceConfiguration(`value`: InstanceConfigurationProperty.Builder.() -> Unit):
      Unit = instanceConfiguration(InstanceConfigurationProperty(`value`))

  public open fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  public open fun networkConfiguration(`value`: IResolvable) {
    unwrap(this).setNetworkConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun networkConfiguration(`value`: NetworkConfigurationProperty) {
    unwrap(this).setNetworkConfiguration(`value`.let(NetworkConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("75ec6f659f4953aafc4723cb5b9a2e096f3823927e537d908ffb73f0a0a80b73")
  public open fun networkConfiguration(`value`: NetworkConfigurationProperty.Builder.() -> Unit):
      Unit = networkConfiguration(NetworkConfigurationProperty(`value`))

  public open fun observabilityConfiguration(): Any? = unwrap(this).getObservabilityConfiguration()

  public open fun observabilityConfiguration(`value`: IResolvable) {
    unwrap(this).setObservabilityConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun observabilityConfiguration(`value`: ServiceObservabilityConfigurationProperty) {
    unwrap(this).setObservabilityConfiguration(`value`.let(ServiceObservabilityConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc8cea312fbe5343c218302d22f437142f8c88841188eb3f17fae21c25d3061e")
  public open
      fun observabilityConfiguration(`value`: ServiceObservabilityConfigurationProperty.Builder.() -> Unit):
      Unit = observabilityConfiguration(ServiceObservabilityConfigurationProperty(`value`))

  public open fun serviceName(): String? = unwrap(this).getServiceName()

  public open fun serviceName(`value`: String) {
    unwrap(this).setServiceName(`value`)
  }

  public open fun sourceConfiguration(): Any = unwrap(this).getSourceConfiguration()

  public open fun sourceConfiguration(`value`: IResolvable) {
    unwrap(this).setSourceConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun sourceConfiguration(`value`: SourceConfigurationProperty) {
    unwrap(this).setSourceConfiguration(`value`.let(SourceConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("be8be8cfc5d8d1969301c427df51fdb2295bccc14ee982d008feb5efced5d92a")
  public open fun sourceConfiguration(`value`: SourceConfigurationProperty.Builder.() -> Unit): Unit
      = sourceConfiguration(SourceConfigurationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun autoScalingConfigurationArn(autoScalingConfigurationArn: String) {
    }

    public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
    }

    public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6498dc7a71a174c57ad39eae3b9c2e6322be2abcb7d9a9a6a26930976fa6e5b8")
    public
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit) {
    }

    public fun healthCheckConfiguration(healthCheckConfiguration: IResolvable) {
    }

    public
        fun healthCheckConfiguration(healthCheckConfiguration: HealthCheckConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f62a68b137bdd3c7e07a451d4318dfc24514f312ec7f8ff0e901f827c427f855")
    public
        fun healthCheckConfiguration(healthCheckConfiguration: HealthCheckConfigurationProperty.Builder.() -> Unit) {
    }

    public fun instanceConfiguration(instanceConfiguration: IResolvable) {
    }

    public fun instanceConfiguration(instanceConfiguration: InstanceConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1abd6f08e7082f3902aa808d8829de5df2cbb8d39e8d0fcbeb1fb526632ca27")
    public
        fun instanceConfiguration(instanceConfiguration: InstanceConfigurationProperty.Builder.() -> Unit) {
    }

    public fun networkConfiguration(networkConfiguration: IResolvable) {
    }

    public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd8c38eb6ac3af2147ea5dde6ebf5d1db79f047da5f232cde4afa22c6b4c6512")
    public
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit) {
    }

    public fun observabilityConfiguration(observabilityConfiguration: IResolvable) {
    }

    public
        fun observabilityConfiguration(observabilityConfiguration: ServiceObservabilityConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27d1d16e2081902ee728d09204f028dd72160207f8aae659443d5763ab9d421d")
    public
        fun observabilityConfiguration(observabilityConfiguration: ServiceObservabilityConfigurationProperty.Builder.() -> Unit) {
    }

    public fun serviceName(serviceName: String) {
    }

    public fun sourceConfiguration(sourceConfiguration: IResolvable) {
    }

    public fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc962744b16adfa22376e3d1bfc9d1527c09ca3bb1e4fd7a7e3a8fb839ee24ec")
    public
        fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apprunner.CfnService.Builder =
        software.amazon.awscdk.services.apprunner.CfnService.Builder.create(scope, id)

    public override fun autoScalingConfigurationArn(autoScalingConfigurationArn: String) {
      cdkBuilder.autoScalingConfigurationArn(autoScalingConfigurationArn)
    }

    public override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6498dc7a71a174c57ad39eae3b9c2e6322be2abcb7d9a9a6a26930976fa6e5b8")
    public override
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

    public override fun healthCheckConfiguration(healthCheckConfiguration: IResolvable) {
      cdkBuilder.healthCheckConfiguration(healthCheckConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun healthCheckConfiguration(healthCheckConfiguration: HealthCheckConfigurationProperty) {
      cdkBuilder.healthCheckConfiguration(healthCheckConfiguration.let(HealthCheckConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f62a68b137bdd3c7e07a451d4318dfc24514f312ec7f8ff0e901f827c427f855")
    public override
        fun healthCheckConfiguration(healthCheckConfiguration: HealthCheckConfigurationProperty.Builder.() -> Unit):
        Unit = healthCheckConfiguration(HealthCheckConfigurationProperty(healthCheckConfiguration))

    public override fun instanceConfiguration(instanceConfiguration: IResolvable) {
      cdkBuilder.instanceConfiguration(instanceConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun instanceConfiguration(instanceConfiguration: InstanceConfigurationProperty) {
      cdkBuilder.instanceConfiguration(instanceConfiguration.let(InstanceConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1abd6f08e7082f3902aa808d8829de5df2cbb8d39e8d0fcbeb1fb526632ca27")
    public override
        fun instanceConfiguration(instanceConfiguration: InstanceConfigurationProperty.Builder.() -> Unit):
        Unit = instanceConfiguration(InstanceConfigurationProperty(instanceConfiguration))

    public override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
    }

    public override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd8c38eb6ac3af2147ea5dde6ebf5d1db79f047da5f232cde4afa22c6b4c6512")
    public override
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

    public override fun observabilityConfiguration(observabilityConfiguration: IResolvable) {
      cdkBuilder.observabilityConfiguration(observabilityConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun observabilityConfiguration(observabilityConfiguration: ServiceObservabilityConfigurationProperty) {
      cdkBuilder.observabilityConfiguration(observabilityConfiguration.let(ServiceObservabilityConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27d1d16e2081902ee728d09204f028dd72160207f8aae659443d5763ab9d421d")
    public override
        fun observabilityConfiguration(observabilityConfiguration: ServiceObservabilityConfigurationProperty.Builder.() -> Unit):
        Unit =
        observabilityConfiguration(ServiceObservabilityConfigurationProperty(observabilityConfiguration))

    public override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public override fun sourceConfiguration(sourceConfiguration: IResolvable) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(IResolvable::unwrap))
    }

    public override fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(SourceConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc962744b16adfa22376e3d1bfc9d1527c09ca3bb1e4fd7a7e3a8fb839ee24ec")
    public override
        fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty.Builder.() -> Unit):
        Unit = sourceConfiguration(SourceConfigurationProperty(sourceConfiguration))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apprunner.CfnService = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnService(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService): CfnService =
        CfnService(cdkObject)

    internal fun unwrap(wrapped: CfnService): software.amazon.awscdk.services.apprunner.CfnService =
        wrapped.cdkObject
  }

  public interface EgressConfigurationProperty {
    public fun egressType(): String

    public fun vpcConnectorArn(): String? = unwrap(this).getVpcConnectorArn()

    public interface Builder {
      public fun egressType(egressType: String) {
      }

      public fun vpcConnectorArn(vpcConnectorArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.EgressConfigurationProperty.Builder =
          software.amazon.awscdk.services.apprunner.CfnService.EgressConfigurationProperty.builder()

      public override fun egressType(egressType: String) {
        cdkBuilder.egressType(egressType)
      }

      public override fun vpcConnectorArn(vpcConnectorArn: String) {
        cdkBuilder.vpcConnectorArn(vpcConnectorArn)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.EgressConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.EgressConfigurationProperty,
    ) : EgressConfigurationProperty {
      public override fun egressType(): String = unwrap(this).getEgressType()

      public override fun vpcConnectorArn(): String? = unwrap(this).getVpcConnectorArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EgressConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.EgressConfigurationProperty):
          EgressConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EgressConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.EgressConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface KeyValuePairProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun name(name: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.KeyValuePairProperty.Builder =
          software.amazon.awscdk.services.apprunner.CfnService.KeyValuePairProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.apprunner.CfnService.KeyValuePairProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.KeyValuePairProperty,
    ) : KeyValuePairProperty {
      public override fun name(): String? = unwrap(this).getName()

      public override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KeyValuePairProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.KeyValuePairProperty):
          KeyValuePairProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyValuePairProperty):
          software.amazon.awscdk.services.apprunner.CfnService.KeyValuePairProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CodeRepositoryProperty {
    public fun codeConfiguration(): Any? = unwrap(this).getCodeConfiguration()

    public fun repositoryUrl(): String

    public fun sourceCodeVersion(): Any

    public fun sourceDirectory(): String? = unwrap(this).getSourceDirectory()

    public interface Builder {
      public fun codeConfiguration(codeConfiguration: IResolvable) {
      }

      public fun codeConfiguration(codeConfiguration: CodeConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c960440565fa14856e944f7527e19099e496dfbf425fca9c114aee146a28bb8")
      public
          fun codeConfiguration(codeConfiguration: CodeConfigurationProperty.Builder.() -> Unit) {
      }

      public fun repositoryUrl(repositoryUrl: String) {
      }

      public fun sourceCodeVersion(sourceCodeVersion: IResolvable) {
      }

      public fun sourceCodeVersion(sourceCodeVersion: SourceCodeVersionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a11280fe561d2ce9c9bc534329afd076e0d9e81b43d363d4234a98a691185152")
      public
          fun sourceCodeVersion(sourceCodeVersion: SourceCodeVersionProperty.Builder.() -> Unit) {
      }

      public fun sourceDirectory(sourceDirectory: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.CodeRepositoryProperty.Builder =
          software.amazon.awscdk.services.apprunner.CfnService.CodeRepositoryProperty.builder()

      public override fun codeConfiguration(codeConfiguration: IResolvable) {
        cdkBuilder.codeConfiguration(codeConfiguration.let(IResolvable::unwrap))
      }

      public override fun codeConfiguration(codeConfiguration: CodeConfigurationProperty) {
        cdkBuilder.codeConfiguration(codeConfiguration.let(CodeConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c960440565fa14856e944f7527e19099e496dfbf425fca9c114aee146a28bb8")
      public override
          fun codeConfiguration(codeConfiguration: CodeConfigurationProperty.Builder.() -> Unit):
          Unit = codeConfiguration(CodeConfigurationProperty(codeConfiguration))

      public override fun repositoryUrl(repositoryUrl: String) {
        cdkBuilder.repositoryUrl(repositoryUrl)
      }

      public override fun sourceCodeVersion(sourceCodeVersion: IResolvable) {
        cdkBuilder.sourceCodeVersion(sourceCodeVersion.let(IResolvable::unwrap))
      }

      public override fun sourceCodeVersion(sourceCodeVersion: SourceCodeVersionProperty) {
        cdkBuilder.sourceCodeVersion(sourceCodeVersion.let(SourceCodeVersionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a11280fe561d2ce9c9bc534329afd076e0d9e81b43d363d4234a98a691185152")
      public override
          fun sourceCodeVersion(sourceCodeVersion: SourceCodeVersionProperty.Builder.() -> Unit):
          Unit = sourceCodeVersion(SourceCodeVersionProperty(sourceCodeVersion))

      public override fun sourceDirectory(sourceDirectory: String) {
        cdkBuilder.sourceDirectory(sourceDirectory)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.CodeRepositoryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.CodeRepositoryProperty,
    ) : CodeRepositoryProperty {
      public override fun codeConfiguration(): Any? = unwrap(this).getCodeConfiguration()

      public override fun repositoryUrl(): String = unwrap(this).getRepositoryUrl()

      public override fun sourceCodeVersion(): Any = unwrap(this).getSourceCodeVersion()

      public override fun sourceDirectory(): String? = unwrap(this).getSourceDirectory()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CodeRepositoryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.CodeRepositoryProperty):
          CodeRepositoryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeRepositoryProperty):
          software.amazon.awscdk.services.apprunner.CfnService.CodeRepositoryProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CodeConfigurationProperty {
    public fun codeConfigurationValues(): Any? = unwrap(this).getCodeConfigurationValues()

    public fun configurationSource(): String

    public interface Builder {
      public fun codeConfigurationValues(codeConfigurationValues: IResolvable) {
      }

      public fun codeConfigurationValues(codeConfigurationValues: CodeConfigurationValuesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c42f1eedb0abdc71ecbbfd342f8f06aa8ff7fa1c27900a53c5476cca7e690d4")
      public
          fun codeConfigurationValues(codeConfigurationValues: CodeConfigurationValuesProperty.Builder.() -> Unit) {
      }

      public fun configurationSource(configurationSource: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationProperty.Builder =
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationProperty.builder()

      public override fun codeConfigurationValues(codeConfigurationValues: IResolvable) {
        cdkBuilder.codeConfigurationValues(codeConfigurationValues.let(IResolvable::unwrap))
      }

      public override
          fun codeConfigurationValues(codeConfigurationValues: CodeConfigurationValuesProperty) {
        cdkBuilder.codeConfigurationValues(codeConfigurationValues.let(CodeConfigurationValuesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c42f1eedb0abdc71ecbbfd342f8f06aa8ff7fa1c27900a53c5476cca7e690d4")
      public override
          fun codeConfigurationValues(codeConfigurationValues: CodeConfigurationValuesProperty.Builder.() -> Unit):
          Unit = codeConfigurationValues(CodeConfigurationValuesProperty(codeConfigurationValues))

      public override fun configurationSource(configurationSource: String) {
        cdkBuilder.configurationSource(configurationSource)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationProperty,
    ) : CodeConfigurationProperty {
      public override fun codeConfigurationValues(): Any? =
          unwrap(this).getCodeConfigurationValues()

      public override fun configurationSource(): String = unwrap(this).getConfigurationSource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationProperty):
          CodeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface NetworkConfigurationProperty {
    public fun egressConfiguration(): Any? = unwrap(this).getEgressConfiguration()

    public fun ingressConfiguration(): Any? = unwrap(this).getIngressConfiguration()

    public fun ipAddressType(): String? = unwrap(this).getIpAddressType()

    public interface Builder {
      public fun egressConfiguration(egressConfiguration: IResolvable) {
      }

      public fun egressConfiguration(egressConfiguration: EgressConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbc4db8dd90c63a25c3388567ce4c7f7f89dba05a84fd00996bc034934570ca8")
      public
          fun egressConfiguration(egressConfiguration: EgressConfigurationProperty.Builder.() -> Unit) {
      }

      public fun ingressConfiguration(ingressConfiguration: IResolvable) {
      }

      public fun ingressConfiguration(ingressConfiguration: IngressConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc0e7a6417da092d1c97a93c9b80849c6d1cf9ba836ca868306454679bdf4fb3")
      public
          fun ingressConfiguration(ingressConfiguration: IngressConfigurationProperty.Builder.() -> Unit) {
      }

      public fun ipAddressType(ipAddressType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.NetworkConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apprunner.CfnService.NetworkConfigurationProperty.builder()

      public override fun egressConfiguration(egressConfiguration: IResolvable) {
        cdkBuilder.egressConfiguration(egressConfiguration.let(IResolvable::unwrap))
      }

      public override fun egressConfiguration(egressConfiguration: EgressConfigurationProperty) {
        cdkBuilder.egressConfiguration(egressConfiguration.let(EgressConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbc4db8dd90c63a25c3388567ce4c7f7f89dba05a84fd00996bc034934570ca8")
      public override
          fun egressConfiguration(egressConfiguration: EgressConfigurationProperty.Builder.() -> Unit):
          Unit = egressConfiguration(EgressConfigurationProperty(egressConfiguration))

      public override fun ingressConfiguration(ingressConfiguration: IResolvable) {
        cdkBuilder.ingressConfiguration(ingressConfiguration.let(IResolvable::unwrap))
      }

      public override fun ingressConfiguration(ingressConfiguration: IngressConfigurationProperty) {
        cdkBuilder.ingressConfiguration(ingressConfiguration.let(IngressConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc0e7a6417da092d1c97a93c9b80849c6d1cf9ba836ca868306454679bdf4fb3")
      public override
          fun ingressConfiguration(ingressConfiguration: IngressConfigurationProperty.Builder.() -> Unit):
          Unit = ingressConfiguration(IngressConfigurationProperty(ingressConfiguration))

      public override fun ipAddressType(ipAddressType: String) {
        cdkBuilder.ipAddressType(ipAddressType)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.NetworkConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.NetworkConfigurationProperty,
    ) : NetworkConfigurationProperty {
      public override fun egressConfiguration(): Any? = unwrap(this).getEgressConfiguration()

      public override fun ingressConfiguration(): Any? = unwrap(this).getIngressConfiguration()

      public override fun ipAddressType(): String? = unwrap(this).getIpAddressType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.NetworkConfigurationProperty):
          NetworkConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.NetworkConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ServiceObservabilityConfigurationProperty {
    public fun observabilityConfigurationArn(): String? =
        unwrap(this).getObservabilityConfigurationArn()

    public fun observabilityEnabled(): Any

    public interface Builder {
      public fun observabilityConfigurationArn(observabilityConfigurationArn: String) {
      }

      public fun observabilityEnabled(observabilityEnabled: Boolean) {
      }

      public fun observabilityEnabled(observabilityEnabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.ServiceObservabilityConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apprunner.CfnService.ServiceObservabilityConfigurationProperty.builder()

      public override fun observabilityConfigurationArn(observabilityConfigurationArn: String) {
        cdkBuilder.observabilityConfigurationArn(observabilityConfigurationArn)
      }

      public override fun observabilityEnabled(observabilityEnabled: Boolean) {
        cdkBuilder.observabilityEnabled(observabilityEnabled)
      }

      public override fun observabilityEnabled(observabilityEnabled: IResolvable) {
        cdkBuilder.observabilityEnabled(observabilityEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.ServiceObservabilityConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.ServiceObservabilityConfigurationProperty,
    ) : ServiceObservabilityConfigurationProperty {
      public override fun observabilityConfigurationArn(): String? =
          unwrap(this).getObservabilityConfigurationArn()

      public override fun observabilityEnabled(): Any = unwrap(this).getObservabilityEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceObservabilityConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.ServiceObservabilityConfigurationProperty):
          ServiceObservabilityConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceObservabilityConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.ServiceObservabilityConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EncryptionConfigurationProperty {
    public fun kmsKey(): String

    public interface Builder {
      public fun kmsKey(kmsKey: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.EncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apprunner.CfnService.EncryptionConfigurationProperty.builder()

      public override fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.EncryptionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.EncryptionConfigurationProperty,
    ) : EncryptionConfigurationProperty {
      public override fun kmsKey(): String = unwrap(this).getKmsKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.EncryptionConfigurationProperty):
          EncryptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.EncryptionConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ImageConfigurationProperty {
    public fun port(): String? = unwrap(this).getPort()

    public fun runtimeEnvironmentSecrets(): Any? = unwrap(this).getRuntimeEnvironmentSecrets()

    public fun runtimeEnvironmentVariables(): Any? = unwrap(this).getRuntimeEnvironmentVariables()

    public fun startCommand(): String? = unwrap(this).getStartCommand()

    public interface Builder {
      public fun port(port: String) {
      }

      public fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: IResolvable) {
      }

      public fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: List<Any>) {
      }

      public fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: IResolvable) {
      }

      public fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: List<Any>) {
      }

      public fun startCommand(startCommand: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.ImageConfigurationProperty.Builder =
          software.amazon.awscdk.services.apprunner.CfnService.ImageConfigurationProperty.builder()

      public override fun port(port: String) {
        cdkBuilder.port(port)
      }

      public override fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: IResolvable) {
        cdkBuilder.runtimeEnvironmentSecrets(runtimeEnvironmentSecrets.let(IResolvable::unwrap))
      }

      public override fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: List<Any>) {
        cdkBuilder.runtimeEnvironmentSecrets(runtimeEnvironmentSecrets)
      }

      public override fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: IResolvable) {
        cdkBuilder.runtimeEnvironmentVariables(runtimeEnvironmentVariables.let(IResolvable::unwrap))
      }

      public override fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: List<Any>) {
        cdkBuilder.runtimeEnvironmentVariables(runtimeEnvironmentVariables)
      }

      public override fun startCommand(startCommand: String) {
        cdkBuilder.startCommand(startCommand)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.ImageConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.ImageConfigurationProperty,
    ) : ImageConfigurationProperty {
      public override fun port(): String? = unwrap(this).getPort()

      public override fun runtimeEnvironmentSecrets(): Any? =
          unwrap(this).getRuntimeEnvironmentSecrets()

      public override fun runtimeEnvironmentVariables(): Any? =
          unwrap(this).getRuntimeEnvironmentVariables()

      public override fun startCommand(): String? = unwrap(this).getStartCommand()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ImageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.ImageConfigurationProperty):
          ImageConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.ImageConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AuthenticationConfigurationProperty {
    public fun accessRoleArn(): String? = unwrap(this).getAccessRoleArn()

    public fun connectionArn(): String? = unwrap(this).getConnectionArn()

    public interface Builder {
      public fun accessRoleArn(accessRoleArn: String) {
      }

      public fun connectionArn(connectionArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.AuthenticationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apprunner.CfnService.AuthenticationConfigurationProperty.builder()

      public override fun accessRoleArn(accessRoleArn: String) {
        cdkBuilder.accessRoleArn(accessRoleArn)
      }

      public override fun connectionArn(connectionArn: String) {
        cdkBuilder.connectionArn(connectionArn)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.AuthenticationConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.AuthenticationConfigurationProperty,
    ) : AuthenticationConfigurationProperty {
      public override fun accessRoleArn(): String? = unwrap(this).getAccessRoleArn()

      public override fun connectionArn(): String? = unwrap(this).getConnectionArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AuthenticationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.AuthenticationConfigurationProperty):
          AuthenticationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthenticationConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.AuthenticationConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CodeConfigurationValuesProperty {
    public fun buildCommand(): String? = unwrap(this).getBuildCommand()

    public fun port(): String? = unwrap(this).getPort()

    public fun runtime(): String

    public fun runtimeEnvironmentSecrets(): Any? = unwrap(this).getRuntimeEnvironmentSecrets()

    public fun runtimeEnvironmentVariables(): Any? = unwrap(this).getRuntimeEnvironmentVariables()

    public fun startCommand(): String? = unwrap(this).getStartCommand()

    public interface Builder {
      public fun buildCommand(buildCommand: String) {
      }

      public fun port(port: String) {
      }

      public fun runtime(runtime: String) {
      }

      public fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: IResolvable) {
      }

      public fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: List<Any>) {
      }

      public fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: IResolvable) {
      }

      public fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: List<Any>) {
      }

      public fun startCommand(startCommand: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationValuesProperty.Builder
          =
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationValuesProperty.builder()

      public override fun buildCommand(buildCommand: String) {
        cdkBuilder.buildCommand(buildCommand)
      }

      public override fun port(port: String) {
        cdkBuilder.port(port)
      }

      public override fun runtime(runtime: String) {
        cdkBuilder.runtime(runtime)
      }

      public override fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: IResolvable) {
        cdkBuilder.runtimeEnvironmentSecrets(runtimeEnvironmentSecrets.let(IResolvable::unwrap))
      }

      public override fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: List<Any>) {
        cdkBuilder.runtimeEnvironmentSecrets(runtimeEnvironmentSecrets)
      }

      public override fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: IResolvable) {
        cdkBuilder.runtimeEnvironmentVariables(runtimeEnvironmentVariables.let(IResolvable::unwrap))
      }

      public override fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: List<Any>) {
        cdkBuilder.runtimeEnvironmentVariables(runtimeEnvironmentVariables)
      }

      public override fun startCommand(startCommand: String) {
        cdkBuilder.startCommand(startCommand)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationValuesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationValuesProperty,
    ) : CodeConfigurationValuesProperty {
      public override fun buildCommand(): String? = unwrap(this).getBuildCommand()

      public override fun port(): String? = unwrap(this).getPort()

      public override fun runtime(): String = unwrap(this).getRuntime()

      public override fun runtimeEnvironmentSecrets(): Any? =
          unwrap(this).getRuntimeEnvironmentSecrets()

      public override fun runtimeEnvironmentVariables(): Any? =
          unwrap(this).getRuntimeEnvironmentVariables()

      public override fun startCommand(): String? = unwrap(this).getStartCommand()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CodeConfigurationValuesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationValuesProperty):
          CodeConfigurationValuesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeConfigurationValuesProperty):
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationValuesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface HealthCheckConfigurationProperty {
    public fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

    public fun interval(): Number? = unwrap(this).getInterval()

    public fun path(): String? = unwrap(this).getPath()

    public fun protocol(): String? = unwrap(this).getProtocol()

    public fun timeout(): Number? = unwrap(this).getTimeout()

    public fun unhealthyThreshold(): Number? = unwrap(this).getUnhealthyThreshold()

    public interface Builder {
      public fun healthyThreshold(healthyThreshold: Number) {
      }

      public fun interval(interval: Number) {
      }

      public fun path(path: String) {
      }

      public fun protocol(protocol: String) {
      }

      public fun timeout(timeout: Number) {
      }

      public fun unhealthyThreshold(unhealthyThreshold: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.HealthCheckConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apprunner.CfnService.HealthCheckConfigurationProperty.builder()

      public override fun healthyThreshold(healthyThreshold: Number) {
        cdkBuilder.healthyThreshold(healthyThreshold)
      }

      public override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      public override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public override fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
      }

      public override fun unhealthyThreshold(unhealthyThreshold: Number) {
        cdkBuilder.unhealthyThreshold(unhealthyThreshold)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.HealthCheckConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.HealthCheckConfigurationProperty,
    ) : HealthCheckConfigurationProperty {
      public override fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

      public override fun interval(): Number? = unwrap(this).getInterval()

      public override fun path(): String? = unwrap(this).getPath()

      public override fun protocol(): String? = unwrap(this).getProtocol()

      public override fun timeout(): Number? = unwrap(this).getTimeout()

      public override fun unhealthyThreshold(): Number? = unwrap(this).getUnhealthyThreshold()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.HealthCheckConfigurationProperty):
          HealthCheckConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HealthCheckConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.HealthCheckConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SourceCodeVersionProperty {
    public fun type(): String

    public fun `value`(): String

    public interface Builder {
      public fun type(type: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.SourceCodeVersionProperty.Builder =
          software.amazon.awscdk.services.apprunner.CfnService.SourceCodeVersionProperty.builder()

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.SourceCodeVersionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.SourceCodeVersionProperty,
    ) : SourceCodeVersionProperty {
      public override fun type(): String = unwrap(this).getType()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SourceCodeVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.SourceCodeVersionProperty):
          SourceCodeVersionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceCodeVersionProperty):
          software.amazon.awscdk.services.apprunner.CfnService.SourceCodeVersionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface IngressConfigurationProperty {
    public fun isPubliclyAccessible(): Any

    public interface Builder {
      public fun isPubliclyAccessible(isPubliclyAccessible: Boolean) {
      }

      public fun isPubliclyAccessible(isPubliclyAccessible: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.IngressConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apprunner.CfnService.IngressConfigurationProperty.builder()

      public override fun isPubliclyAccessible(isPubliclyAccessible: Boolean) {
        cdkBuilder.isPubliclyAccessible(isPubliclyAccessible)
      }

      public override fun isPubliclyAccessible(isPubliclyAccessible: IResolvable) {
        cdkBuilder.isPubliclyAccessible(isPubliclyAccessible.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.IngressConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.IngressConfigurationProperty,
    ) : IngressConfigurationProperty {
      public override fun isPubliclyAccessible(): Any = unwrap(this).getIsPubliclyAccessible()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IngressConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.IngressConfigurationProperty):
          IngressConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.IngressConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ImageRepositoryProperty {
    public fun imageConfiguration(): Any? = unwrap(this).getImageConfiguration()

    public fun imageIdentifier(): String

    public fun imageRepositoryType(): String

    public interface Builder {
      public fun imageConfiguration(imageConfiguration: IResolvable) {
      }

      public fun imageConfiguration(imageConfiguration: ImageConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90d6a3be65eee3a6be6da28afa8bc2b0a11a91f2090a2f062c14a88d278eb9d3")
      public
          fun imageConfiguration(imageConfiguration: ImageConfigurationProperty.Builder.() -> Unit) {
      }

      public fun imageIdentifier(imageIdentifier: String) {
      }

      public fun imageRepositoryType(imageRepositoryType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.ImageRepositoryProperty.Builder =
          software.amazon.awscdk.services.apprunner.CfnService.ImageRepositoryProperty.builder()

      public override fun imageConfiguration(imageConfiguration: IResolvable) {
        cdkBuilder.imageConfiguration(imageConfiguration.let(IResolvable::unwrap))
      }

      public override fun imageConfiguration(imageConfiguration: ImageConfigurationProperty) {
        cdkBuilder.imageConfiguration(imageConfiguration.let(ImageConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90d6a3be65eee3a6be6da28afa8bc2b0a11a91f2090a2f062c14a88d278eb9d3")
      public override
          fun imageConfiguration(imageConfiguration: ImageConfigurationProperty.Builder.() -> Unit):
          Unit = imageConfiguration(ImageConfigurationProperty(imageConfiguration))

      public override fun imageIdentifier(imageIdentifier: String) {
        cdkBuilder.imageIdentifier(imageIdentifier)
      }

      public override fun imageRepositoryType(imageRepositoryType: String) {
        cdkBuilder.imageRepositoryType(imageRepositoryType)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.ImageRepositoryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.ImageRepositoryProperty,
    ) : ImageRepositoryProperty {
      public override fun imageConfiguration(): Any? = unwrap(this).getImageConfiguration()

      public override fun imageIdentifier(): String = unwrap(this).getImageIdentifier()

      public override fun imageRepositoryType(): String = unwrap(this).getImageRepositoryType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ImageRepositoryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.ImageRepositoryProperty):
          ImageRepositoryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageRepositoryProperty):
          software.amazon.awscdk.services.apprunner.CfnService.ImageRepositoryProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface InstanceConfigurationProperty {
    public fun cpu(): String? = unwrap(this).getCpu()

    public fun instanceRoleArn(): String? = unwrap(this).getInstanceRoleArn()

    public fun memory(): String? = unwrap(this).getMemory()

    public interface Builder {
      public fun cpu(cpu: String) {
      }

      public fun instanceRoleArn(instanceRoleArn: String) {
      }

      public fun memory(memory: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.InstanceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apprunner.CfnService.InstanceConfigurationProperty.builder()

      public override fun cpu(cpu: String) {
        cdkBuilder.cpu(cpu)
      }

      public override fun instanceRoleArn(instanceRoleArn: String) {
        cdkBuilder.instanceRoleArn(instanceRoleArn)
      }

      public override fun memory(memory: String) {
        cdkBuilder.memory(memory)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.InstanceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.InstanceConfigurationProperty,
    ) : InstanceConfigurationProperty {
      public override fun cpu(): String? = unwrap(this).getCpu()

      public override fun instanceRoleArn(): String? = unwrap(this).getInstanceRoleArn()

      public override fun memory(): String? = unwrap(this).getMemory()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.InstanceConfigurationProperty):
          InstanceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.InstanceConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SourceConfigurationProperty {
    public fun authenticationConfiguration(): Any? = unwrap(this).getAuthenticationConfiguration()

    public fun autoDeploymentsEnabled(): Any? = unwrap(this).getAutoDeploymentsEnabled()

    public fun codeRepository(): Any? = unwrap(this).getCodeRepository()

    public fun imageRepository(): Any? = unwrap(this).getImageRepository()

    public interface Builder {
      public fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
      }

      public
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8b4e8d7ae67b928510329223e6db44f4b83151a19c872277c0b1c31a0a802a01")
      public
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty.Builder.() -> Unit) {
      }

      public fun autoDeploymentsEnabled(autoDeploymentsEnabled: Boolean) {
      }

      public fun autoDeploymentsEnabled(autoDeploymentsEnabled: IResolvable) {
      }

      public fun codeRepository(codeRepository: IResolvable) {
      }

      public fun codeRepository(codeRepository: CodeRepositoryProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b6e601cdd762408eac86c9420a55af5ce88448e3d9abf2069db9b6f957177af")
      public fun codeRepository(codeRepository: CodeRepositoryProperty.Builder.() -> Unit) {
      }

      public fun imageRepository(imageRepository: IResolvable) {
      }

      public fun imageRepository(imageRepository: ImageRepositoryProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad7463a502823666b37c437aa3a4a5e0156e29964fcdb9e2574540916df3fb31")
      public fun imageRepository(imageRepository: ImageRepositoryProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.SourceConfigurationProperty.Builder =
          software.amazon.awscdk.services.apprunner.CfnService.SourceConfigurationProperty.builder()

      public override fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(AuthenticationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8b4e8d7ae67b928510329223e6db44f4b83151a19c872277c0b1c31a0a802a01")
      public override
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty.Builder.() -> Unit):
          Unit =
          authenticationConfiguration(AuthenticationConfigurationProperty(authenticationConfiguration))

      public override fun autoDeploymentsEnabled(autoDeploymentsEnabled: Boolean) {
        cdkBuilder.autoDeploymentsEnabled(autoDeploymentsEnabled)
      }

      public override fun autoDeploymentsEnabled(autoDeploymentsEnabled: IResolvable) {
        cdkBuilder.autoDeploymentsEnabled(autoDeploymentsEnabled.let(IResolvable::unwrap))
      }

      public override fun codeRepository(codeRepository: IResolvable) {
        cdkBuilder.codeRepository(codeRepository.let(IResolvable::unwrap))
      }

      public override fun codeRepository(codeRepository: CodeRepositoryProperty) {
        cdkBuilder.codeRepository(codeRepository.let(CodeRepositoryProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b6e601cdd762408eac86c9420a55af5ce88448e3d9abf2069db9b6f957177af")
      public override fun codeRepository(codeRepository: CodeRepositoryProperty.Builder.() -> Unit):
          Unit = codeRepository(CodeRepositoryProperty(codeRepository))

      public override fun imageRepository(imageRepository: IResolvable) {
        cdkBuilder.imageRepository(imageRepository.let(IResolvable::unwrap))
      }

      public override fun imageRepository(imageRepository: ImageRepositoryProperty) {
        cdkBuilder.imageRepository(imageRepository.let(ImageRepositoryProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad7463a502823666b37c437aa3a4a5e0156e29964fcdb9e2574540916df3fb31")
      public override
          fun imageRepository(imageRepository: ImageRepositoryProperty.Builder.() -> Unit): Unit =
          imageRepository(ImageRepositoryProperty(imageRepository))

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.SourceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.SourceConfigurationProperty,
    ) : SourceConfigurationProperty {
      public override fun authenticationConfiguration(): Any? =
          unwrap(this).getAuthenticationConfiguration()

      public override fun autoDeploymentsEnabled(): Any? = unwrap(this).getAutoDeploymentsEnabled()

      public override fun codeRepository(): Any? = unwrap(this).getCodeRepository()

      public override fun imageRepository(): Any? = unwrap(this).getImageRepository()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.SourceConfigurationProperty):
          SourceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.SourceConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
