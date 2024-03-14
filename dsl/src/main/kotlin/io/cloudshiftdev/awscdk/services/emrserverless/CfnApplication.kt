package io.cloudshiftdev.awscdk.services.emrserverless

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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplication internal constructor(
  private val cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun architecture(): String? = unwrap(this).getArchitecture()

  public open fun architecture(`value`: String) {
    unwrap(this).setArchitecture(`value`)
  }

  public open fun attrApplicationId(): String = unwrap(this).getAttrApplicationId()

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun autoStartConfiguration(): Any? = unwrap(this).getAutoStartConfiguration()

  public open fun autoStartConfiguration(`value`: IResolvable) {
    unwrap(this).setAutoStartConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun autoStartConfiguration(`value`: AutoStartConfigurationProperty) {
    unwrap(this).setAutoStartConfiguration(`value`.let(AutoStartConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1e21bbbe9504800f0ad9d478ca7adecaa67cbd310f134888df90fe168905b2f2")
  public open
      fun autoStartConfiguration(`value`: AutoStartConfigurationProperty.Builder.() -> Unit): Unit =
      autoStartConfiguration(AutoStartConfigurationProperty(`value`))

  public open fun autoStopConfiguration(): Any? = unwrap(this).getAutoStopConfiguration()

  public open fun autoStopConfiguration(`value`: IResolvable) {
    unwrap(this).setAutoStopConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun autoStopConfiguration(`value`: AutoStopConfigurationProperty) {
    unwrap(this).setAutoStopConfiguration(`value`.let(AutoStopConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ea4e5defa32ba28ac648747a6c25c971b88fcc98750fd1f70a7fa799513da492")
  public open fun autoStopConfiguration(`value`: AutoStopConfigurationProperty.Builder.() -> Unit):
      Unit = autoStopConfiguration(AutoStopConfigurationProperty(`value`))

  public open fun imageConfiguration(): Any? = unwrap(this).getImageConfiguration()

  public open fun imageConfiguration(`value`: IResolvable) {
    unwrap(this).setImageConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun imageConfiguration(`value`: ImageConfigurationInputProperty) {
    unwrap(this).setImageConfiguration(`value`.let(ImageConfigurationInputProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7f2f899ff947c6b52866fbd1291aeae8591b98d1704bef9a0928152ee3e89f14")
  public open fun imageConfiguration(`value`: ImageConfigurationInputProperty.Builder.() -> Unit):
      Unit = imageConfiguration(ImageConfigurationInputProperty(`value`))

  public open fun initialCapacity(): Any? = unwrap(this).getInitialCapacity()

  public open fun initialCapacity(`value`: IResolvable) {
    unwrap(this).setInitialCapacity(`value`.let(IResolvable::unwrap))
  }

  public open fun initialCapacity(__idx_ac66f0: List<Any>) {
    unwrap(this).setInitialCapacity(__idx_ac66f0)
  }

  public open fun initialCapacity(vararg __idx_ac66f0: Any): Unit =
      initialCapacity(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun maximumCapacity(): Any? = unwrap(this).getMaximumCapacity()

  public open fun maximumCapacity(`value`: IResolvable) {
    unwrap(this).setMaximumCapacity(`value`.let(IResolvable::unwrap))
  }

  public open fun maximumCapacity(`value`: MaximumAllowedResourcesProperty) {
    unwrap(this).setMaximumCapacity(`value`.let(MaximumAllowedResourcesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc4b1f9d213822ea68014557fac85442ea2aaf5a53ae71034d82252cd0b2fc32")
  public open fun maximumCapacity(`value`: MaximumAllowedResourcesProperty.Builder.() -> Unit): Unit
      = maximumCapacity(MaximumAllowedResourcesProperty(`value`))

  public open fun monitoringConfiguration(): Any? = unwrap(this).getMonitoringConfiguration()

  public open fun monitoringConfiguration(`value`: IResolvable) {
    unwrap(this).setMonitoringConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun monitoringConfiguration(`value`: MonitoringConfigurationProperty) {
    unwrap(this).setMonitoringConfiguration(`value`.let(MonitoringConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c39356bc0b1fa81077db85b0c7c39c0829552e93ffe5172168c20f97681816b0")
  public open
      fun monitoringConfiguration(`value`: MonitoringConfigurationProperty.Builder.() -> Unit): Unit
      = monitoringConfiguration(MonitoringConfigurationProperty(`value`))

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  public open fun networkConfiguration(`value`: IResolvable) {
    unwrap(this).setNetworkConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun networkConfiguration(`value`: NetworkConfigurationProperty) {
    unwrap(this).setNetworkConfiguration(`value`.let(NetworkConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4c51ef35782b79b7f35abc161d840555211ee03a6e0100e7503fad8607d3961a")
  public open fun networkConfiguration(`value`: NetworkConfigurationProperty.Builder.() -> Unit):
      Unit = networkConfiguration(NetworkConfigurationProperty(`value`))

  public open fun releaseLabel(): String = unwrap(this).getReleaseLabel()

  public open fun releaseLabel(`value`: String) {
    unwrap(this).setReleaseLabel(`value`)
  }

  public open fun runtimeConfiguration(): Any? = unwrap(this).getRuntimeConfiguration()

  public open fun runtimeConfiguration(`value`: IResolvable) {
    unwrap(this).setRuntimeConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun runtimeConfiguration(__idx_ac66f0: List<Any>) {
    unwrap(this).setRuntimeConfiguration(__idx_ac66f0)
  }

  public open fun runtimeConfiguration(vararg __idx_ac66f0: Any): Unit =
      runtimeConfiguration(__idx_ac66f0.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public open fun workerTypeSpecifications(): Any? = unwrap(this).getWorkerTypeSpecifications()

  public open fun workerTypeSpecifications(`value`: IResolvable) {
    unwrap(this).setWorkerTypeSpecifications(`value`.let(IResolvable::unwrap))
  }

  public open fun workerTypeSpecifications(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setWorkerTypeSpecifications(__item_ac66f0)
  }

  public interface Builder {
    public fun architecture(architecture: String)

    public fun autoStartConfiguration(autoStartConfiguration: IResolvable)

    public fun autoStartConfiguration(autoStartConfiguration: AutoStartConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18fdb9afac26c4dbe15046dee5d150bce42e1254f86f6b615e4b758d23c1a7b5")
    public
        fun autoStartConfiguration(autoStartConfiguration: AutoStartConfigurationProperty.Builder.() -> Unit)

    public fun autoStopConfiguration(autoStopConfiguration: IResolvable)

    public fun autoStopConfiguration(autoStopConfiguration: AutoStopConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d640017ae5c55847f0b88c39709b93ad9217e264081c45ad93a0f20c4adc60a")
    public
        fun autoStopConfiguration(autoStopConfiguration: AutoStopConfigurationProperty.Builder.() -> Unit)

    public fun imageConfiguration(imageConfiguration: IResolvable)

    public fun imageConfiguration(imageConfiguration: ImageConfigurationInputProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("135c9a0f8dac4390742ce2e8e7fbaa6e44a3c55e3f426f6e57acf418b5a62d29")
    public
        fun imageConfiguration(imageConfiguration: ImageConfigurationInputProperty.Builder.() -> Unit)

    public fun initialCapacity(initialCapacity: IResolvable)

    public fun initialCapacity(initialCapacity: List<Any>)

    public fun initialCapacity(vararg initialCapacity: Any)

    public fun maximumCapacity(maximumCapacity: IResolvable)

    public fun maximumCapacity(maximumCapacity: MaximumAllowedResourcesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e5ff91bb8b13d7563d79d4ffb7db188e847e9c8b505d2e9303080b8b7bd0c88")
    public fun maximumCapacity(maximumCapacity: MaximumAllowedResourcesProperty.Builder.() -> Unit)

    public fun monitoringConfiguration(monitoringConfiguration: IResolvable)

    public fun monitoringConfiguration(monitoringConfiguration: MonitoringConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("242a10a764ade48a2bb8514baeb9e403cb10ce3537b62d75d6f04c94a7067ebb")
    public
        fun monitoringConfiguration(monitoringConfiguration: MonitoringConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun networkConfiguration(networkConfiguration: IResolvable)

    public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c009b63a19f1c75027791ae63828a9cb2a1fb2218e90e5f53b109f77c0728f1d")
    public
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit)

    public fun releaseLabel(releaseLabel: String)

    public fun runtimeConfiguration(runtimeConfiguration: IResolvable)

    public fun runtimeConfiguration(runtimeConfiguration: List<Any>)

    public fun runtimeConfiguration(vararg runtimeConfiguration: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)

    public fun workerTypeSpecifications(workerTypeSpecifications: IResolvable)

    public fun workerTypeSpecifications(workerTypeSpecifications: Map<String, Any>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emrserverless.CfnApplication.Builder =
        software.amazon.awscdk.services.emrserverless.CfnApplication.Builder.create(scope, id)

    override fun architecture(architecture: String) {
      cdkBuilder.architecture(architecture)
    }

    override fun autoStartConfiguration(autoStartConfiguration: IResolvable) {
      cdkBuilder.autoStartConfiguration(autoStartConfiguration.let(IResolvable::unwrap))
    }

    override fun autoStartConfiguration(autoStartConfiguration: AutoStartConfigurationProperty) {
      cdkBuilder.autoStartConfiguration(autoStartConfiguration.let(AutoStartConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18fdb9afac26c4dbe15046dee5d150bce42e1254f86f6b615e4b758d23c1a7b5")
    override
        fun autoStartConfiguration(autoStartConfiguration: AutoStartConfigurationProperty.Builder.() -> Unit):
        Unit = autoStartConfiguration(AutoStartConfigurationProperty(autoStartConfiguration))

    override fun autoStopConfiguration(autoStopConfiguration: IResolvable) {
      cdkBuilder.autoStopConfiguration(autoStopConfiguration.let(IResolvable::unwrap))
    }

    override fun autoStopConfiguration(autoStopConfiguration: AutoStopConfigurationProperty) {
      cdkBuilder.autoStopConfiguration(autoStopConfiguration.let(AutoStopConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d640017ae5c55847f0b88c39709b93ad9217e264081c45ad93a0f20c4adc60a")
    override
        fun autoStopConfiguration(autoStopConfiguration: AutoStopConfigurationProperty.Builder.() -> Unit):
        Unit = autoStopConfiguration(AutoStopConfigurationProperty(autoStopConfiguration))

    override fun imageConfiguration(imageConfiguration: IResolvable) {
      cdkBuilder.imageConfiguration(imageConfiguration.let(IResolvable::unwrap))
    }

    override fun imageConfiguration(imageConfiguration: ImageConfigurationInputProperty) {
      cdkBuilder.imageConfiguration(imageConfiguration.let(ImageConfigurationInputProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("135c9a0f8dac4390742ce2e8e7fbaa6e44a3c55e3f426f6e57acf418b5a62d29")
    override
        fun imageConfiguration(imageConfiguration: ImageConfigurationInputProperty.Builder.() -> Unit):
        Unit = imageConfiguration(ImageConfigurationInputProperty(imageConfiguration))

    override fun initialCapacity(initialCapacity: IResolvable) {
      cdkBuilder.initialCapacity(initialCapacity.let(IResolvable::unwrap))
    }

    override fun initialCapacity(initialCapacity: List<Any>) {
      cdkBuilder.initialCapacity(initialCapacity)
    }

    override fun initialCapacity(vararg initialCapacity: Any): Unit =
        initialCapacity(initialCapacity.toList())

    override fun maximumCapacity(maximumCapacity: IResolvable) {
      cdkBuilder.maximumCapacity(maximumCapacity.let(IResolvable::unwrap))
    }

    override fun maximumCapacity(maximumCapacity: MaximumAllowedResourcesProperty) {
      cdkBuilder.maximumCapacity(maximumCapacity.let(MaximumAllowedResourcesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e5ff91bb8b13d7563d79d4ffb7db188e847e9c8b505d2e9303080b8b7bd0c88")
    override
        fun maximumCapacity(maximumCapacity: MaximumAllowedResourcesProperty.Builder.() -> Unit):
        Unit = maximumCapacity(MaximumAllowedResourcesProperty(maximumCapacity))

    override fun monitoringConfiguration(monitoringConfiguration: IResolvable) {
      cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(IResolvable::unwrap))
    }

    override fun monitoringConfiguration(monitoringConfiguration: MonitoringConfigurationProperty) {
      cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(MonitoringConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("242a10a764ade48a2bb8514baeb9e403cb10ce3537b62d75d6f04c94a7067ebb")
    override
        fun monitoringConfiguration(monitoringConfiguration: MonitoringConfigurationProperty.Builder.() -> Unit):
        Unit = monitoringConfiguration(MonitoringConfigurationProperty(monitoringConfiguration))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
    }

    override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c009b63a19f1c75027791ae63828a9cb2a1fb2218e90e5f53b109f77c0728f1d")
    override
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

    override fun releaseLabel(releaseLabel: String) {
      cdkBuilder.releaseLabel(releaseLabel)
    }

    override fun runtimeConfiguration(runtimeConfiguration: IResolvable) {
      cdkBuilder.runtimeConfiguration(runtimeConfiguration.let(IResolvable::unwrap))
    }

    override fun runtimeConfiguration(runtimeConfiguration: List<Any>) {
      cdkBuilder.runtimeConfiguration(runtimeConfiguration)
    }

    override fun runtimeConfiguration(vararg runtimeConfiguration: Any): Unit =
        runtimeConfiguration(runtimeConfiguration.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun workerTypeSpecifications(workerTypeSpecifications: IResolvable) {
      cdkBuilder.workerTypeSpecifications(workerTypeSpecifications.let(IResolvable::unwrap))
    }

    override fun workerTypeSpecifications(workerTypeSpecifications: Map<String, Any>) {
      cdkBuilder.workerTypeSpecifications(workerTypeSpecifications)
    }

    public fun build(): software.amazon.awscdk.services.emrserverless.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication):
        CfnApplication = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication):
        software.amazon.awscdk.services.emrserverless.CfnApplication = wrapped.cdkObject
  }

  public interface AutoStopConfigurationProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun idleTimeoutMinutes(): Number? = unwrap(this).getIdleTimeoutMinutes()

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun idleTimeoutMinutes(idleTimeoutMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStopConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStopConfigurationProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun idleTimeoutMinutes(idleTimeoutMinutes: Number) {
        cdkBuilder.idleTimeoutMinutes(idleTimeoutMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStopConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStopConfigurationProperty,
    ) : AutoStopConfigurationProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun idleTimeoutMinutes(): Number? = unwrap(this).getIdleTimeoutMinutes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutoStopConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStopConfigurationProperty):
          AutoStopConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoStopConfigurationProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStopConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MonitoringConfigurationProperty {
    public fun cloudWatchLoggingConfiguration(): Any? =
        unwrap(this).getCloudWatchLoggingConfiguration()

    public fun managedPersistenceMonitoringConfiguration(): Any? =
        unwrap(this).getManagedPersistenceMonitoringConfiguration()

    public fun s3MonitoringConfiguration(): Any? = unwrap(this).getS3MonitoringConfiguration()

    public interface Builder {
      public fun cloudWatchLoggingConfiguration(cloudWatchLoggingConfiguration: IResolvable)

      public
          fun cloudWatchLoggingConfiguration(cloudWatchLoggingConfiguration: CloudWatchLoggingConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad1153ab61aa5057aecd5d7cafa7e097b24d047ba2769ca788886319ec68472f")
      public
          fun cloudWatchLoggingConfiguration(cloudWatchLoggingConfiguration: CloudWatchLoggingConfigurationProperty.Builder.() -> Unit)

      public
          fun managedPersistenceMonitoringConfiguration(managedPersistenceMonitoringConfiguration: IResolvable)

      public
          fun managedPersistenceMonitoringConfiguration(managedPersistenceMonitoringConfiguration: ManagedPersistenceMonitoringConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf88f1af2e44e51488e14d43737bb7f0119c63c83cdbc1fccbd5493652d82ad4")
      public
          fun managedPersistenceMonitoringConfiguration(managedPersistenceMonitoringConfiguration: ManagedPersistenceMonitoringConfigurationProperty.Builder.() -> Unit)

      public fun s3MonitoringConfiguration(s3MonitoringConfiguration: IResolvable)

      public
          fun s3MonitoringConfiguration(s3MonitoringConfiguration: S3MonitoringConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51e2ce2ff6b1aa9a20811f234f00a3bfd3472a639d524b2a3c765f488d3ab36b")
      public
          fun s3MonitoringConfiguration(s3MonitoringConfiguration: S3MonitoringConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.MonitoringConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.MonitoringConfigurationProperty.builder()

      override fun cloudWatchLoggingConfiguration(cloudWatchLoggingConfiguration: IResolvable) {
        cdkBuilder.cloudWatchLoggingConfiguration(cloudWatchLoggingConfiguration.let(IResolvable::unwrap))
      }

      override
          fun cloudWatchLoggingConfiguration(cloudWatchLoggingConfiguration: CloudWatchLoggingConfigurationProperty) {
        cdkBuilder.cloudWatchLoggingConfiguration(cloudWatchLoggingConfiguration.let(CloudWatchLoggingConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad1153ab61aa5057aecd5d7cafa7e097b24d047ba2769ca788886319ec68472f")
      override
          fun cloudWatchLoggingConfiguration(cloudWatchLoggingConfiguration: CloudWatchLoggingConfigurationProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLoggingConfiguration(CloudWatchLoggingConfigurationProperty(cloudWatchLoggingConfiguration))

      override
          fun managedPersistenceMonitoringConfiguration(managedPersistenceMonitoringConfiguration: IResolvable) {
        cdkBuilder.managedPersistenceMonitoringConfiguration(managedPersistenceMonitoringConfiguration.let(IResolvable::unwrap))
      }

      override
          fun managedPersistenceMonitoringConfiguration(managedPersistenceMonitoringConfiguration: ManagedPersistenceMonitoringConfigurationProperty) {
        cdkBuilder.managedPersistenceMonitoringConfiguration(managedPersistenceMonitoringConfiguration.let(ManagedPersistenceMonitoringConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf88f1af2e44e51488e14d43737bb7f0119c63c83cdbc1fccbd5493652d82ad4")
      override
          fun managedPersistenceMonitoringConfiguration(managedPersistenceMonitoringConfiguration: ManagedPersistenceMonitoringConfigurationProperty.Builder.() -> Unit):
          Unit =
          managedPersistenceMonitoringConfiguration(ManagedPersistenceMonitoringConfigurationProperty(managedPersistenceMonitoringConfiguration))

      override fun s3MonitoringConfiguration(s3MonitoringConfiguration: IResolvable) {
        cdkBuilder.s3MonitoringConfiguration(s3MonitoringConfiguration.let(IResolvable::unwrap))
      }

      override
          fun s3MonitoringConfiguration(s3MonitoringConfiguration: S3MonitoringConfigurationProperty) {
        cdkBuilder.s3MonitoringConfiguration(s3MonitoringConfiguration.let(S3MonitoringConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51e2ce2ff6b1aa9a20811f234f00a3bfd3472a639d524b2a3c765f488d3ab36b")
      override
          fun s3MonitoringConfiguration(s3MonitoringConfiguration: S3MonitoringConfigurationProperty.Builder.() -> Unit):
          Unit =
          s3MonitoringConfiguration(S3MonitoringConfigurationProperty(s3MonitoringConfiguration))

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.MonitoringConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.MonitoringConfigurationProperty,
    ) : MonitoringConfigurationProperty {
      override fun cloudWatchLoggingConfiguration(): Any? =
          unwrap(this).getCloudWatchLoggingConfiguration()

      override fun managedPersistenceMonitoringConfiguration(): Any? =
          unwrap(this).getManagedPersistenceMonitoringConfiguration()

      override fun s3MonitoringConfiguration(): Any? = unwrap(this).getS3MonitoringConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.MonitoringConfigurationProperty):
          MonitoringConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringConfigurationProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.MonitoringConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MaximumAllowedResourcesProperty {
    public fun cpu(): String

    public fun disk(): String? = unwrap(this).getDisk()

    public fun memory(): String

    public interface Builder {
      public fun cpu(cpu: String)

      public fun disk(disk: String)

      public fun memory(memory: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.MaximumAllowedResourcesProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.MaximumAllowedResourcesProperty.builder()

      override fun cpu(cpu: String) {
        cdkBuilder.cpu(cpu)
      }

      override fun disk(disk: String) {
        cdkBuilder.disk(disk)
      }

      override fun memory(memory: String) {
        cdkBuilder.memory(memory)
      }

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.MaximumAllowedResourcesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.MaximumAllowedResourcesProperty,
    ) : MaximumAllowedResourcesProperty {
      override fun cpu(): String = unwrap(this).getCpu()

      override fun disk(): String? = unwrap(this).getDisk()

      override fun memory(): String = unwrap(this).getMemory()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MaximumAllowedResourcesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.MaximumAllowedResourcesProperty):
          MaximumAllowedResourcesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaximumAllowedResourcesProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.MaximumAllowedResourcesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CloudWatchLoggingConfigurationProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

    public fun logGroupName(): String? = unwrap(this).getLogGroupName()

    public fun logStreamNamePrefix(): String? = unwrap(this).getLogStreamNamePrefix()

    public fun logTypeMap(): Any? = unwrap(this).getLogTypeMap()

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun encryptionKeyArn(encryptionKeyArn: String)

      public fun logGroupName(logGroupName: String)

      public fun logStreamNamePrefix(logStreamNamePrefix: String)

      public fun logTypeMap(logTypeMap: IResolvable)

      public fun logTypeMap(logTypeMap: List<Any>)

      public fun logTypeMap(vararg logTypeMap: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.CloudWatchLoggingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.CloudWatchLoggingConfigurationProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun encryptionKeyArn(encryptionKeyArn: String) {
        cdkBuilder.encryptionKeyArn(encryptionKeyArn)
      }

      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      override fun logStreamNamePrefix(logStreamNamePrefix: String) {
        cdkBuilder.logStreamNamePrefix(logStreamNamePrefix)
      }

      override fun logTypeMap(logTypeMap: IResolvable) {
        cdkBuilder.logTypeMap(logTypeMap.let(IResolvable::unwrap))
      }

      override fun logTypeMap(logTypeMap: List<Any>) {
        cdkBuilder.logTypeMap(logTypeMap)
      }

      override fun logTypeMap(vararg logTypeMap: Any): Unit = logTypeMap(logTypeMap.toList())

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.CloudWatchLoggingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.CloudWatchLoggingConfigurationProperty,
    ) : CloudWatchLoggingConfigurationProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

      override fun logGroupName(): String? = unwrap(this).getLogGroupName()

      override fun logStreamNamePrefix(): String? = unwrap(this).getLogStreamNamePrefix()

      override fun logTypeMap(): Any? = unwrap(this).getLogTypeMap()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudWatchLoggingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.CloudWatchLoggingConfigurationProperty):
          CloudWatchLoggingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLoggingConfigurationProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.CloudWatchLoggingConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface NetworkConfigurationProperty {
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun securityGroupIds(vararg securityGroupIds: String)

      public fun subnetIds(subnetIds: List<String>)

      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.NetworkConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.NetworkConfigurationProperty.builder()

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.NetworkConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.NetworkConfigurationProperty,
    ) : NetworkConfigurationProperty {
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.NetworkConfigurationProperty):
          NetworkConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.NetworkConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConfigurationObjectProperty {
    public fun classification(): String

    public fun configurations(): Any? = unwrap(this).getConfigurations()

    public fun properties(): Any? = unwrap(this).getProperties()

    public interface Builder {
      public fun classification(classification: String)

      public fun configurations(configurations: IResolvable)

      public fun configurations(configurations: List<Any>)

      public fun configurations(vararg configurations: Any)

      public fun properties(properties: IResolvable)

      public fun properties(properties: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.ConfigurationObjectProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.ConfigurationObjectProperty.builder()

      override fun classification(classification: String) {
        cdkBuilder.classification(classification)
      }

      override fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
      }

      override fun configurations(configurations: List<Any>) {
        cdkBuilder.configurations(configurations)
      }

      override fun configurations(vararg configurations: Any): Unit =
          configurations(configurations.toList())

      override fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties.let(IResolvable::unwrap))
      }

      override fun properties(properties: Map<String, String>) {
        cdkBuilder.properties(properties)
      }

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.ConfigurationObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.ConfigurationObjectProperty,
    ) : ConfigurationObjectProperty {
      override fun classification(): String = unwrap(this).getClassification()

      override fun configurations(): Any? = unwrap(this).getConfigurations()

      override fun properties(): Any? = unwrap(this).getProperties()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.ConfigurationObjectProperty):
          ConfigurationObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationObjectProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.ConfigurationObjectProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface WorkerConfigurationProperty {
    public fun cpu(): String

    public fun disk(): String? = unwrap(this).getDisk()

    public fun memory(): String

    public interface Builder {
      public fun cpu(cpu: String)

      public fun disk(disk: String)

      public fun memory(memory: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerConfigurationProperty.builder()

      override fun cpu(cpu: String) {
        cdkBuilder.cpu(cpu)
      }

      override fun disk(disk: String) {
        cdkBuilder.disk(disk)
      }

      override fun memory(memory: String) {
        cdkBuilder.memory(memory)
      }

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerConfigurationProperty,
    ) : WorkerConfigurationProperty {
      override fun cpu(): String = unwrap(this).getCpu()

      override fun disk(): String? = unwrap(this).getDisk()

      override fun memory(): String = unwrap(this).getMemory()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WorkerConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerConfigurationProperty):
          WorkerConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkerConfigurationProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ImageConfigurationInputProperty {
    public fun imageUri(): String? = unwrap(this).getImageUri()

    public interface Builder {
      public fun imageUri(imageUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.ImageConfigurationInputProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.ImageConfigurationInputProperty.builder()

      override fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
      }

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.ImageConfigurationInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.ImageConfigurationInputProperty,
    ) : ImageConfigurationInputProperty {
      override fun imageUri(): String? = unwrap(this).getImageUri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ImageConfigurationInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.ImageConfigurationInputProperty):
          ImageConfigurationInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageConfigurationInputProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.ImageConfigurationInputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InitialCapacityConfigKeyValuePairProperty {
    public fun key(): String

    public fun `value`(): Any

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: IResolvable)

      public fun `value`(`value`: InitialCapacityConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b966ae256b45ece3e93a3e47a1920499c7fa2b401640cb73b25823a42111ae9")
      public fun `value`(`value`: InitialCapacityConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigKeyValuePairProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigKeyValuePairProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      override fun `value`(`value`: InitialCapacityConfigProperty) {
        cdkBuilder.`value`(`value`.let(InitialCapacityConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b966ae256b45ece3e93a3e47a1920499c7fa2b401640cb73b25823a42111ae9")
      override fun `value`(`value`: InitialCapacityConfigProperty.Builder.() -> Unit): Unit =
          `value`(InitialCapacityConfigProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigKeyValuePairProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigKeyValuePairProperty,
    ) : InitialCapacityConfigKeyValuePairProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          InitialCapacityConfigKeyValuePairProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigKeyValuePairProperty):
          InitialCapacityConfigKeyValuePairProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InitialCapacityConfigKeyValuePairProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigKeyValuePairProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InitialCapacityConfigProperty {
    public fun workerConfiguration(): Any

    public fun workerCount(): Number

    public interface Builder {
      public fun workerConfiguration(workerConfiguration: IResolvable)

      public fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1191fb6c21246b6632678432607689a3e8e09fd368cce0ffc797efa1c110db8b")
      public
          fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty.Builder.() -> Unit)

      public fun workerCount(workerCount: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigProperty.builder()

      override fun workerConfiguration(workerConfiguration: IResolvable) {
        cdkBuilder.workerConfiguration(workerConfiguration.let(IResolvable::unwrap))
      }

      override fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty) {
        cdkBuilder.workerConfiguration(workerConfiguration.let(WorkerConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1191fb6c21246b6632678432607689a3e8e09fd368cce0ffc797efa1c110db8b")
      override
          fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty.Builder.() -> Unit):
          Unit = workerConfiguration(WorkerConfigurationProperty(workerConfiguration))

      override fun workerCount(workerCount: Number) {
        cdkBuilder.workerCount(workerCount)
      }

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigProperty,
    ) : InitialCapacityConfigProperty {
      override fun workerConfiguration(): Any = unwrap(this).getWorkerConfiguration()

      override fun workerCount(): Number = unwrap(this).getWorkerCount()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InitialCapacityConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigProperty):
          InitialCapacityConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InitialCapacityConfigProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3MonitoringConfigurationProperty {
    public fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

    public fun logUri(): String? = unwrap(this).getLogUri()

    public interface Builder {
      public fun encryptionKeyArn(encryptionKeyArn: String)

      public fun logUri(logUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.S3MonitoringConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.S3MonitoringConfigurationProperty.builder()

      override fun encryptionKeyArn(encryptionKeyArn: String) {
        cdkBuilder.encryptionKeyArn(encryptionKeyArn)
      }

      override fun logUri(logUri: String) {
        cdkBuilder.logUri(logUri)
      }

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.S3MonitoringConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.S3MonitoringConfigurationProperty,
    ) : S3MonitoringConfigurationProperty {
      override fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

      override fun logUri(): String? = unwrap(this).getLogUri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          S3MonitoringConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.S3MonitoringConfigurationProperty):
          S3MonitoringConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3MonitoringConfigurationProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.S3MonitoringConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface WorkerTypeSpecificationInputProperty {
    public fun imageConfiguration(): Any? = unwrap(this).getImageConfiguration()

    public interface Builder {
      public fun imageConfiguration(imageConfiguration: IResolvable)

      public fun imageConfiguration(imageConfiguration: ImageConfigurationInputProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dbfe53c6500fcc361b32ac969288665449377160edc69d9c75529b54801c000d")
      public
          fun imageConfiguration(imageConfiguration: ImageConfigurationInputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerTypeSpecificationInputProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerTypeSpecificationInputProperty.builder()

      override fun imageConfiguration(imageConfiguration: IResolvable) {
        cdkBuilder.imageConfiguration(imageConfiguration.let(IResolvable::unwrap))
      }

      override fun imageConfiguration(imageConfiguration: ImageConfigurationInputProperty) {
        cdkBuilder.imageConfiguration(imageConfiguration.let(ImageConfigurationInputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dbfe53c6500fcc361b32ac969288665449377160edc69d9c75529b54801c000d")
      override
          fun imageConfiguration(imageConfiguration: ImageConfigurationInputProperty.Builder.() -> Unit):
          Unit = imageConfiguration(ImageConfigurationInputProperty(imageConfiguration))

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerTypeSpecificationInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerTypeSpecificationInputProperty,
    ) : WorkerTypeSpecificationInputProperty {
      override fun imageConfiguration(): Any? = unwrap(this).getImageConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          WorkerTypeSpecificationInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerTypeSpecificationInputProperty):
          WorkerTypeSpecificationInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkerTypeSpecificationInputProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerTypeSpecificationInputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AutoStartConfigurationProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStartConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStartConfigurationProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStartConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStartConfigurationProperty,
    ) : AutoStartConfigurationProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutoStartConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStartConfigurationProperty):
          AutoStartConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoStartConfigurationProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStartConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ManagedPersistenceMonitoringConfigurationProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun encryptionKeyArn(encryptionKeyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.ManagedPersistenceMonitoringConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.ManagedPersistenceMonitoringConfigurationProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun encryptionKeyArn(encryptionKeyArn: String) {
        cdkBuilder.encryptionKeyArn(encryptionKeyArn)
      }

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.ManagedPersistenceMonitoringConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.ManagedPersistenceMonitoringConfigurationProperty,
    ) : ManagedPersistenceMonitoringConfigurationProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ManagedPersistenceMonitoringConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.ManagedPersistenceMonitoringConfigurationProperty):
          ManagedPersistenceMonitoringConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManagedPersistenceMonitoringConfigurationProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.ManagedPersistenceMonitoringConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LogTypeMapKeyValuePairProperty {
    public fun key(): String

    public fun `value`(): List<String>

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: List<String>)

      public fun `value`(vararg `value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.LogTypeMapKeyValuePairProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.LogTypeMapKeyValuePairProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: List<String>) {
        cdkBuilder.`value`(`value`)
      }

      override fun `value`(vararg `value`: String): Unit = `value`(`value`.toList())

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.LogTypeMapKeyValuePairProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.LogTypeMapKeyValuePairProperty,
    ) : LogTypeMapKeyValuePairProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): List<String> = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LogTypeMapKeyValuePairProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.LogTypeMapKeyValuePairProperty):
          LogTypeMapKeyValuePairProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogTypeMapKeyValuePairProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.LogTypeMapKeyValuePairProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
