@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

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

public open class CfnCluster internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.CfnCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun capacityProviders(): List<String> = unwrap(this).getCapacityProviders() ?:
      emptyList()

  public open fun capacityProviders(`value`: List<String>) {
    unwrap(this).setCapacityProviders(`value`)
  }

  public open fun capacityProviders(vararg `value`: String): Unit =
      capacityProviders(`value`.toList())

  public open fun clusterName(): String? = unwrap(this).getClusterName()

  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  public open fun clusterSettings(): Any? = unwrap(this).getClusterSettings()

  public open fun clusterSettings(`value`: IResolvable) {
    unwrap(this).setClusterSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun clusterSettings(__idx_ac66f0: List<Any>) {
    unwrap(this).setClusterSettings(__idx_ac66f0)
  }

  public open fun clusterSettings(vararg __idx_ac66f0: Any): Unit =
      clusterSettings(__idx_ac66f0.toList())

  public open fun configuration(): Any? = unwrap(this).getConfiguration()

  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun configuration(`value`: ClusterConfigurationProperty) {
    unwrap(this).setConfiguration(`value`.let(ClusterConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1e266837809905aa2bb30e14c304754921c7d70fc5aa7a9315dbba12185f3738")
  public open fun configuration(`value`: ClusterConfigurationProperty.Builder.() -> Unit): Unit =
      configuration(ClusterConfigurationProperty(`value`))

  public open fun defaultCapacityProviderStrategy(): Any? =
      unwrap(this).getDefaultCapacityProviderStrategy()

  public open fun defaultCapacityProviderStrategy(`value`: IResolvable) {
    unwrap(this).setDefaultCapacityProviderStrategy(`value`.let(IResolvable::unwrap))
  }

  public open fun defaultCapacityProviderStrategy(__idx_ac66f0: List<Any>) {
    unwrap(this).setDefaultCapacityProviderStrategy(__idx_ac66f0)
  }

  public open fun defaultCapacityProviderStrategy(vararg __idx_ac66f0: Any): Unit =
      defaultCapacityProviderStrategy(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun serviceConnectDefaults(): Any? = unwrap(this).getServiceConnectDefaults()

  public open fun serviceConnectDefaults(`value`: IResolvable) {
    unwrap(this).setServiceConnectDefaults(`value`.let(IResolvable::unwrap))
  }

  public open fun serviceConnectDefaults(`value`: ServiceConnectDefaultsProperty) {
    unwrap(this).setServiceConnectDefaults(`value`.let(ServiceConnectDefaultsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("899bfd7e311a635ba16298ea27e86a52fa2a57f2c7d17322af833cb799312769")
  public open
      fun serviceConnectDefaults(`value`: ServiceConnectDefaultsProperty.Builder.() -> Unit): Unit =
      serviceConnectDefaults(ServiceConnectDefaultsProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun capacityProviders(capacityProviders: List<String>)

    public fun capacityProviders(vararg capacityProviders: String)

    public fun clusterName(clusterName: String)

    public fun clusterSettings(clusterSettings: IResolvable)

    public fun clusterSettings(clusterSettings: List<Any>)

    public fun clusterSettings(vararg clusterSettings: Any)

    public fun configuration(configuration: IResolvable)

    public fun configuration(configuration: ClusterConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ecbb13bf8972c170b1b30b1e3eebd7a17f7ed6b44e3908d3af4d9a7b84873c18")
    public fun configuration(configuration: ClusterConfigurationProperty.Builder.() -> Unit)

    public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: IResolvable)

    public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: List<Any>)

    public fun defaultCapacityProviderStrategy(vararg defaultCapacityProviderStrategy: Any)

    public fun serviceConnectDefaults(serviceConnectDefaults: IResolvable)

    public fun serviceConnectDefaults(serviceConnectDefaults: ServiceConnectDefaultsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d759decc7c48c6f8e33011e9904f33bc0821b4b354b01bd63de61ef880a9c1f")
    public
        fun serviceConnectDefaults(serviceConnectDefaults: ServiceConnectDefaultsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnCluster.Builder =
        software.amazon.awscdk.services.ecs.CfnCluster.Builder.create(scope, id)

    override fun capacityProviders(capacityProviders: List<String>) {
      cdkBuilder.capacityProviders(capacityProviders)
    }

    override fun capacityProviders(vararg capacityProviders: String): Unit =
        capacityProviders(capacityProviders.toList())

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun clusterSettings(clusterSettings: IResolvable) {
      cdkBuilder.clusterSettings(clusterSettings.let(IResolvable::unwrap))
    }

    override fun clusterSettings(clusterSettings: List<Any>) {
      cdkBuilder.clusterSettings(clusterSettings)
    }

    override fun clusterSettings(vararg clusterSettings: Any): Unit =
        clusterSettings(clusterSettings.toList())

    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    override fun configuration(configuration: ClusterConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(ClusterConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ecbb13bf8972c170b1b30b1e3eebd7a17f7ed6b44e3908d3af4d9a7b84873c18")
    override fun configuration(configuration: ClusterConfigurationProperty.Builder.() -> Unit): Unit
        = configuration(ClusterConfigurationProperty(configuration))

    override fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: IResolvable) {
      cdkBuilder.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy.let(IResolvable::unwrap))
    }

    override fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: List<Any>) {
      cdkBuilder.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy)
    }

    override fun defaultCapacityProviderStrategy(vararg defaultCapacityProviderStrategy: Any): Unit
        = defaultCapacityProviderStrategy(defaultCapacityProviderStrategy.toList())

    override fun serviceConnectDefaults(serviceConnectDefaults: IResolvable) {
      cdkBuilder.serviceConnectDefaults(serviceConnectDefaults.let(IResolvable::unwrap))
    }

    override fun serviceConnectDefaults(serviceConnectDefaults: ServiceConnectDefaultsProperty) {
      cdkBuilder.serviceConnectDefaults(serviceConnectDefaults.let(ServiceConnectDefaultsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d759decc7c48c6f8e33011e9904f33bc0821b4b354b01bd63de61ef880a9c1f")
    override
        fun serviceConnectDefaults(serviceConnectDefaults: ServiceConnectDefaultsProperty.Builder.() -> Unit):
        Unit = serviceConnectDefaults(ServiceConnectDefaultsProperty(serviceConnectDefaults))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ecs.CfnCluster = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ecs.CfnCluster.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCluster): CfnCluster =
        CfnCluster(cdkObject)

    internal fun unwrap(wrapped: CfnCluster): software.amazon.awscdk.services.ecs.CfnCluster =
        wrapped.cdkObject
  }

  public interface ExecuteCommandLogConfigurationProperty {
    public fun cloudWatchEncryptionEnabled(): Any? = unwrap(this).getCloudWatchEncryptionEnabled()

    public fun cloudWatchLogGroupName(): String? = unwrap(this).getCloudWatchLogGroupName()

    public fun s3BucketName(): String? = unwrap(this).getS3BucketName()

    public fun s3EncryptionEnabled(): Any? = unwrap(this).getS3EncryptionEnabled()

    public fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

    @CdkDslMarker
    public interface Builder {
      public fun cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled: Boolean)

      public fun cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled: IResolvable)

      public fun cloudWatchLogGroupName(cloudWatchLogGroupName: String)

      public fun s3BucketName(s3BucketName: String)

      public fun s3EncryptionEnabled(s3EncryptionEnabled: Boolean)

      public fun s3EncryptionEnabled(s3EncryptionEnabled: IResolvable)

      public fun s3KeyPrefix(s3KeyPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandLogConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandLogConfigurationProperty.builder()

      override fun cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled: Boolean) {
        cdkBuilder.cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled)
      }

      override fun cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled: IResolvable) {
        cdkBuilder.cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled.let(IResolvable::unwrap))
      }

      override fun cloudWatchLogGroupName(cloudWatchLogGroupName: String) {
        cdkBuilder.cloudWatchLogGroupName(cloudWatchLogGroupName)
      }

      override fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
      }

      override fun s3EncryptionEnabled(s3EncryptionEnabled: Boolean) {
        cdkBuilder.s3EncryptionEnabled(s3EncryptionEnabled)
      }

      override fun s3EncryptionEnabled(s3EncryptionEnabled: IResolvable) {
        cdkBuilder.s3EncryptionEnabled(s3EncryptionEnabled.let(IResolvable::unwrap))
      }

      override fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandLogConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandLogConfigurationProperty,
    ) : CdkObject(cdkObject), ExecuteCommandLogConfigurationProperty {
      override fun cloudWatchEncryptionEnabled(): Any? =
          unwrap(this).getCloudWatchEncryptionEnabled()

      override fun cloudWatchLogGroupName(): String? = unwrap(this).getCloudWatchLogGroupName()

      override fun s3BucketName(): String? = unwrap(this).getS3BucketName()

      override fun s3EncryptionEnabled(): Any? = unwrap(this).getS3EncryptionEnabled()

      override fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ExecuteCommandLogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandLogConfigurationProperty):
          ExecuteCommandLogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExecuteCommandLogConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandLogConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandLogConfigurationProperty
    }
  }

  public interface ExecuteCommandConfigurationProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

    public fun logging(): String? = unwrap(this).getLogging()

    @CdkDslMarker
    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String)

      public fun logConfiguration(logConfiguration: IResolvable)

      public fun logConfiguration(logConfiguration: ExecuteCommandLogConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a24f99e0a31bf052a42f798fef13d0e54580ffb764e0589c190da6b7d7a5013")
      public
          fun logConfiguration(logConfiguration: ExecuteCommandLogConfigurationProperty.Builder.() -> Unit)

      public fun logging(logging: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandConfigurationProperty.builder()

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      override fun logConfiguration(logConfiguration: IResolvable) {
        cdkBuilder.logConfiguration(logConfiguration.let(IResolvable::unwrap))
      }

      override fun logConfiguration(logConfiguration: ExecuteCommandLogConfigurationProperty) {
        cdkBuilder.logConfiguration(logConfiguration.let(ExecuteCommandLogConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a24f99e0a31bf052a42f798fef13d0e54580ffb764e0589c190da6b7d7a5013")
      override
          fun logConfiguration(logConfiguration: ExecuteCommandLogConfigurationProperty.Builder.() -> Unit):
          Unit = logConfiguration(ExecuteCommandLogConfigurationProperty(logConfiguration))

      override fun logging(logging: String) {
        cdkBuilder.logging(logging)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandConfigurationProperty,
    ) : CdkObject(cdkObject), ExecuteCommandConfigurationProperty {
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      override fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

      override fun logging(): String? = unwrap(this).getLogging()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ExecuteCommandConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandConfigurationProperty):
          ExecuteCommandConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExecuteCommandConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandConfigurationProperty
    }
  }

  public interface CapacityProviderStrategyItemProperty {
    public fun base(): Number? = unwrap(this).getBase()

    public fun capacityProvider(): String? = unwrap(this).getCapacityProvider()

    public fun weight(): Number? = unwrap(this).getWeight()

    @CdkDslMarker
    public interface Builder {
      public fun base(base: Number)

      public fun capacityProvider(capacityProvider: String)

      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnCluster.CapacityProviderStrategyItemProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnCluster.CapacityProviderStrategyItemProperty.builder()

      override fun base(base: Number) {
        cdkBuilder.base(base)
      }

      override fun capacityProvider(capacityProvider: String) {
        cdkBuilder.capacityProvider(capacityProvider)
      }

      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnCluster.CapacityProviderStrategyItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnCluster.CapacityProviderStrategyItemProperty,
    ) : CdkObject(cdkObject), CapacityProviderStrategyItemProperty {
      override fun base(): Number? = unwrap(this).getBase()

      override fun capacityProvider(): String? = unwrap(this).getCapacityProvider()

      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityProviderStrategyItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCluster.CapacityProviderStrategyItemProperty):
          CapacityProviderStrategyItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityProviderStrategyItemProperty):
          software.amazon.awscdk.services.ecs.CfnCluster.CapacityProviderStrategyItemProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnCluster.CapacityProviderStrategyItemProperty
    }
  }

  public interface ClusterSettingsProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun `value`(): String? = unwrap(this).getValue()

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterSettingsProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterSettingsProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnCluster.ClusterSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterSettingsProperty,
    ) : CdkObject(cdkObject), ClusterSettingsProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClusterSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCluster.ClusterSettingsProperty):
          ClusterSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterSettingsProperty):
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterSettingsProperty
    }
  }

  public interface ClusterConfigurationProperty {
    public fun executeCommandConfiguration(): Any? = unwrap(this).getExecuteCommandConfiguration()

    @CdkDslMarker
    public interface Builder {
      public fun executeCommandConfiguration(executeCommandConfiguration: IResolvable)

      public
          fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2c142dbeb86944d2f38ed48264d7c5a153056a38a629e653a939c6de008408f")
      public
          fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterConfigurationProperty.builder()

      override fun executeCommandConfiguration(executeCommandConfiguration: IResolvable) {
        cdkBuilder.executeCommandConfiguration(executeCommandConfiguration.let(IResolvable::unwrap))
      }

      override
          fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfigurationProperty) {
        cdkBuilder.executeCommandConfiguration(executeCommandConfiguration.let(ExecuteCommandConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2c142dbeb86944d2f38ed48264d7c5a153056a38a629e653a939c6de008408f")
      override
          fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfigurationProperty.Builder.() -> Unit):
          Unit =
          executeCommandConfiguration(ExecuteCommandConfigurationProperty(executeCommandConfiguration))

      public fun build():
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterConfigurationProperty,
    ) : CdkObject(cdkObject), ClusterConfigurationProperty {
      override fun executeCommandConfiguration(): Any? =
          unwrap(this).getExecuteCommandConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClusterConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCluster.ClusterConfigurationProperty):
          ClusterConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterConfigurationProperty
    }
  }

  public interface ServiceConnectDefaultsProperty {
    public fun namespace(): String? = unwrap(this).getNamespace()

    @CdkDslMarker
    public interface Builder {
      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnCluster.ServiceConnectDefaultsProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnCluster.ServiceConnectDefaultsProperty.builder()

      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnCluster.ServiceConnectDefaultsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnCluster.ServiceConnectDefaultsProperty,
    ) : CdkObject(cdkObject), ServiceConnectDefaultsProperty {
      override fun namespace(): String? = unwrap(this).getNamespace()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ServiceConnectDefaultsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCluster.ServiceConnectDefaultsProperty):
          ServiceConnectDefaultsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceConnectDefaultsProperty):
          software.amazon.awscdk.services.ecs.CfnCluster.ServiceConnectDefaultsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnCluster.ServiceConnectDefaultsProperty
    }
  }
}
