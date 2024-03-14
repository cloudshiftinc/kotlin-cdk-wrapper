package io.cloudshiftdev.awscdk.services.opsworks

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

public open class CfnLayer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.opsworks.CfnLayer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attributes(): Any? = unwrap(this).getAttributes()

  public open fun attributes(`value`: IResolvable) {
    unwrap(this).setAttributes(`value`.let(IResolvable::unwrap))
  }

  public open fun attributes(`value`: Map<String, String>) {
    unwrap(this).setAttributes(`value`)
  }

  public open fun autoAssignElasticIps(): Any = unwrap(this).getAutoAssignElasticIps()

  public open fun autoAssignElasticIps(`value`: Boolean) {
    unwrap(this).setAutoAssignElasticIps(`value`)
  }

  public open fun autoAssignElasticIps(`value`: IResolvable) {
    unwrap(this).setAutoAssignElasticIps(`value`.let(IResolvable::unwrap))
  }

  public open fun autoAssignPublicIps(): Any = unwrap(this).getAutoAssignPublicIps()

  public open fun autoAssignPublicIps(`value`: Boolean) {
    unwrap(this).setAutoAssignPublicIps(`value`)
  }

  public open fun autoAssignPublicIps(`value`: IResolvable) {
    unwrap(this).setAutoAssignPublicIps(`value`.let(IResolvable::unwrap))
  }

  public open fun customInstanceProfileArn(): String? = unwrap(this).getCustomInstanceProfileArn()

  public open fun customInstanceProfileArn(`value`: String) {
    unwrap(this).setCustomInstanceProfileArn(`value`)
  }

  public open fun customJson(): Any? = unwrap(this).getCustomJson()

  public open fun customJson(`value`: Any) {
    unwrap(this).setCustomJson(`value`)
  }

  public open fun customRecipes(): Any? = unwrap(this).getCustomRecipes()

  public open fun customRecipes(`value`: IResolvable) {
    unwrap(this).setCustomRecipes(`value`.let(IResolvable::unwrap))
  }

  public open fun customRecipes(`value`: RecipesProperty) {
    unwrap(this).setCustomRecipes(`value`.let(RecipesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("46eb96de669e8dcbb5f6c92957606bd6939e70d03b609c4b12fbfdd84e48e58c")
  public open fun customRecipes(`value`: RecipesProperty.Builder.() -> Unit): Unit =
      customRecipes(RecipesProperty(`value`))

  public open fun customSecurityGroupIds(): List<String> = unwrap(this).getCustomSecurityGroupIds()
      ?: emptyList()

  public open fun customSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setCustomSecurityGroupIds(`value`)
  }

  public open fun enableAutoHealing(): Any = unwrap(this).getEnableAutoHealing()

  public open fun enableAutoHealing(`value`: Boolean) {
    unwrap(this).setEnableAutoHealing(`value`)
  }

  public open fun enableAutoHealing(`value`: IResolvable) {
    unwrap(this).setEnableAutoHealing(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun installUpdatesOnBoot(): Any? = unwrap(this).getInstallUpdatesOnBoot()

  public open fun installUpdatesOnBoot(`value`: Boolean) {
    unwrap(this).setInstallUpdatesOnBoot(`value`)
  }

  public open fun installUpdatesOnBoot(`value`: IResolvable) {
    unwrap(this).setInstallUpdatesOnBoot(`value`.let(IResolvable::unwrap))
  }

  public open fun lifecycleEventConfiguration(): Any? =
      unwrap(this).getLifecycleEventConfiguration()

  public open fun lifecycleEventConfiguration(`value`: IResolvable) {
    unwrap(this).setLifecycleEventConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun lifecycleEventConfiguration(`value`: LifecycleEventConfigurationProperty) {
    unwrap(this).setLifecycleEventConfiguration(`value`.let(LifecycleEventConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("075d950d92919d5acca9e9c17184231aabdd84fb31b2a2dc92dd4c4ab2b894c6")
  public open
      fun lifecycleEventConfiguration(`value`: LifecycleEventConfigurationProperty.Builder.() -> Unit):
      Unit = lifecycleEventConfiguration(LifecycleEventConfigurationProperty(`value`))

  public open fun loadBasedAutoScaling(): Any? = unwrap(this).getLoadBasedAutoScaling()

  public open fun loadBasedAutoScaling(`value`: IResolvable) {
    unwrap(this).setLoadBasedAutoScaling(`value`.let(IResolvable::unwrap))
  }

  public open fun loadBasedAutoScaling(`value`: LoadBasedAutoScalingProperty) {
    unwrap(this).setLoadBasedAutoScaling(`value`.let(LoadBasedAutoScalingProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c2cce91339f84d14ead6bb576b157dfdb52ff57a450e50cb78ef2ff06829de7c")
  public open fun loadBasedAutoScaling(`value`: LoadBasedAutoScalingProperty.Builder.() -> Unit):
      Unit = loadBasedAutoScaling(LoadBasedAutoScalingProperty(`value`))

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun packages(): List<String> = unwrap(this).getPackages() ?: emptyList()

  public open fun packages(`value`: List<String>) {
    unwrap(this).setPackages(`value`)
  }

  public open fun shortname(): String = unwrap(this).getShortname()

  public open fun shortname(`value`: String) {
    unwrap(this).setShortname(`value`)
  }

  public open fun stackId(): String = unwrap(this).getStackId()

  public open fun stackId(`value`: String) {
    unwrap(this).setStackId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public open fun useEbsOptimizedInstances(): Any? = unwrap(this).getUseEbsOptimizedInstances()

  public open fun useEbsOptimizedInstances(`value`: Boolean) {
    unwrap(this).setUseEbsOptimizedInstances(`value`)
  }

  public open fun useEbsOptimizedInstances(`value`: IResolvable) {
    unwrap(this).setUseEbsOptimizedInstances(`value`.let(IResolvable::unwrap))
  }

  public open fun volumeConfigurations(): Any? = unwrap(this).getVolumeConfigurations()

  public open fun volumeConfigurations(`value`: IResolvable) {
    unwrap(this).setVolumeConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun volumeConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setVolumeConfigurations(__idx_ac66f0)
  }

  public interface Builder {
    public fun attributes(attributes: IResolvable)

    public fun attributes(attributes: Map<String, String>)

    public fun autoAssignElasticIps(autoAssignElasticIps: Boolean)

    public fun autoAssignElasticIps(autoAssignElasticIps: IResolvable)

    public fun autoAssignPublicIps(autoAssignPublicIps: Boolean)

    public fun autoAssignPublicIps(autoAssignPublicIps: IResolvable)

    public fun customInstanceProfileArn(customInstanceProfileArn: String)

    public fun customJson(customJson: Any)

    public fun customRecipes(customRecipes: IResolvable)

    public fun customRecipes(customRecipes: RecipesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83070b06fe28ef87c0df7331304021d0187bbeecda558eae821e7c0f11716b1b")
    public fun customRecipes(customRecipes: RecipesProperty.Builder.() -> Unit)

    public fun customSecurityGroupIds(customSecurityGroupIds: List<String>)

    public fun enableAutoHealing(enableAutoHealing: Boolean)

    public fun enableAutoHealing(enableAutoHealing: IResolvable)

    public fun installUpdatesOnBoot(installUpdatesOnBoot: Boolean)

    public fun installUpdatesOnBoot(installUpdatesOnBoot: IResolvable)

    public fun lifecycleEventConfiguration(lifecycleEventConfiguration: IResolvable)

    public
        fun lifecycleEventConfiguration(lifecycleEventConfiguration: LifecycleEventConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9cfe03c735b50e01df06229337d8df96730c8d22d4711a4fc5002b328edcee4")
    public
        fun lifecycleEventConfiguration(lifecycleEventConfiguration: LifecycleEventConfigurationProperty.Builder.() -> Unit)

    public fun loadBasedAutoScaling(loadBasedAutoScaling: IResolvable)

    public fun loadBasedAutoScaling(loadBasedAutoScaling: LoadBasedAutoScalingProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("671c26bd97fcf55213bf45b05b04f31b88c41667f1af0a8b21ab011d83bb7a76")
    public
        fun loadBasedAutoScaling(loadBasedAutoScaling: LoadBasedAutoScalingProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun packages(packages: List<String>)

    public fun shortname(shortname: String)

    public fun stackId(stackId: String)

    public fun tags(tags: List<CfnTag>)

    public fun type(type: String)

    public fun useEbsOptimizedInstances(useEbsOptimizedInstances: Boolean)

    public fun useEbsOptimizedInstances(useEbsOptimizedInstances: IResolvable)

    public fun volumeConfigurations(volumeConfigurations: IResolvable)

    public fun volumeConfigurations(volumeConfigurations: List<Any>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnLayer.Builder =
        software.amazon.awscdk.services.opsworks.CfnLayer.Builder.create(scope, id)

    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
    }

    override fun attributes(attributes: Map<String, String>) {
      cdkBuilder.attributes(attributes)
    }

    override fun autoAssignElasticIps(autoAssignElasticIps: Boolean) {
      cdkBuilder.autoAssignElasticIps(autoAssignElasticIps)
    }

    override fun autoAssignElasticIps(autoAssignElasticIps: IResolvable) {
      cdkBuilder.autoAssignElasticIps(autoAssignElasticIps.let(IResolvable::unwrap))
    }

    override fun autoAssignPublicIps(autoAssignPublicIps: Boolean) {
      cdkBuilder.autoAssignPublicIps(autoAssignPublicIps)
    }

    override fun autoAssignPublicIps(autoAssignPublicIps: IResolvable) {
      cdkBuilder.autoAssignPublicIps(autoAssignPublicIps.let(IResolvable::unwrap))
    }

    override fun customInstanceProfileArn(customInstanceProfileArn: String) {
      cdkBuilder.customInstanceProfileArn(customInstanceProfileArn)
    }

    override fun customJson(customJson: Any) {
      cdkBuilder.customJson(customJson)
    }

    override fun customRecipes(customRecipes: IResolvable) {
      cdkBuilder.customRecipes(customRecipes.let(IResolvable::unwrap))
    }

    override fun customRecipes(customRecipes: RecipesProperty) {
      cdkBuilder.customRecipes(customRecipes.let(RecipesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83070b06fe28ef87c0df7331304021d0187bbeecda558eae821e7c0f11716b1b")
    override fun customRecipes(customRecipes: RecipesProperty.Builder.() -> Unit): Unit =
        customRecipes(RecipesProperty(customRecipes))

    override fun customSecurityGroupIds(customSecurityGroupIds: List<String>) {
      cdkBuilder.customSecurityGroupIds(customSecurityGroupIds)
    }

    override fun enableAutoHealing(enableAutoHealing: Boolean) {
      cdkBuilder.enableAutoHealing(enableAutoHealing)
    }

    override fun enableAutoHealing(enableAutoHealing: IResolvable) {
      cdkBuilder.enableAutoHealing(enableAutoHealing.let(IResolvable::unwrap))
    }

    override fun installUpdatesOnBoot(installUpdatesOnBoot: Boolean) {
      cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot)
    }

    override fun installUpdatesOnBoot(installUpdatesOnBoot: IResolvable) {
      cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot.let(IResolvable::unwrap))
    }

    override fun lifecycleEventConfiguration(lifecycleEventConfiguration: IResolvable) {
      cdkBuilder.lifecycleEventConfiguration(lifecycleEventConfiguration.let(IResolvable::unwrap))
    }

    override
        fun lifecycleEventConfiguration(lifecycleEventConfiguration: LifecycleEventConfigurationProperty) {
      cdkBuilder.lifecycleEventConfiguration(lifecycleEventConfiguration.let(LifecycleEventConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9cfe03c735b50e01df06229337d8df96730c8d22d4711a4fc5002b328edcee4")
    override
        fun lifecycleEventConfiguration(lifecycleEventConfiguration: LifecycleEventConfigurationProperty.Builder.() -> Unit):
        Unit =
        lifecycleEventConfiguration(LifecycleEventConfigurationProperty(lifecycleEventConfiguration))

    override fun loadBasedAutoScaling(loadBasedAutoScaling: IResolvable) {
      cdkBuilder.loadBasedAutoScaling(loadBasedAutoScaling.let(IResolvable::unwrap))
    }

    override fun loadBasedAutoScaling(loadBasedAutoScaling: LoadBasedAutoScalingProperty) {
      cdkBuilder.loadBasedAutoScaling(loadBasedAutoScaling.let(LoadBasedAutoScalingProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("671c26bd97fcf55213bf45b05b04f31b88c41667f1af0a8b21ab011d83bb7a76")
    override
        fun loadBasedAutoScaling(loadBasedAutoScaling: LoadBasedAutoScalingProperty.Builder.() -> Unit):
        Unit = loadBasedAutoScaling(LoadBasedAutoScalingProperty(loadBasedAutoScaling))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun packages(packages: List<String>) {
      cdkBuilder.packages(packages)
    }

    override fun shortname(shortname: String) {
      cdkBuilder.shortname(shortname)
    }

    override fun stackId(stackId: String) {
      cdkBuilder.stackId(stackId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun useEbsOptimizedInstances(useEbsOptimizedInstances: Boolean) {
      cdkBuilder.useEbsOptimizedInstances(useEbsOptimizedInstances)
    }

    override fun useEbsOptimizedInstances(useEbsOptimizedInstances: IResolvable) {
      cdkBuilder.useEbsOptimizedInstances(useEbsOptimizedInstances.let(IResolvable::unwrap))
    }

    override fun volumeConfigurations(volumeConfigurations: IResolvable) {
      cdkBuilder.volumeConfigurations(volumeConfigurations.let(IResolvable::unwrap))
    }

    override fun volumeConfigurations(volumeConfigurations: List<Any>) {
      cdkBuilder.volumeConfigurations(volumeConfigurations)
    }

    public fun build(): software.amazon.awscdk.services.opsworks.CfnLayer = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLayer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLayer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnLayer): CfnLayer =
        CfnLayer(cdkObject)

    internal fun unwrap(wrapped: CfnLayer): software.amazon.awscdk.services.opsworks.CfnLayer =
        wrapped.cdkObject
  }

  public interface AutoScalingThresholdsProperty {
    public fun cpuThreshold(): Number? = unwrap(this).getCpuThreshold()

    public fun ignoreMetricsTime(): Number? = unwrap(this).getIgnoreMetricsTime()

    public fun instanceCount(): Number? = unwrap(this).getInstanceCount()

    public fun loadThreshold(): Number? = unwrap(this).getLoadThreshold()

    public fun memoryThreshold(): Number? = unwrap(this).getMemoryThreshold()

    public fun thresholdsWaitTime(): Number? = unwrap(this).getThresholdsWaitTime()

    public interface Builder {
      public fun cpuThreshold(cpuThreshold: Number)

      public fun ignoreMetricsTime(ignoreMetricsTime: Number)

      public fun instanceCount(instanceCount: Number)

      public fun loadThreshold(loadThreshold: Number)

      public fun memoryThreshold(memoryThreshold: Number)

      public fun thresholdsWaitTime(thresholdsWaitTime: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty.builder()

      override fun cpuThreshold(cpuThreshold: Number) {
        cdkBuilder.cpuThreshold(cpuThreshold)
      }

      override fun ignoreMetricsTime(ignoreMetricsTime: Number) {
        cdkBuilder.ignoreMetricsTime(ignoreMetricsTime)
      }

      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      override fun loadThreshold(loadThreshold: Number) {
        cdkBuilder.loadThreshold(loadThreshold)
      }

      override fun memoryThreshold(memoryThreshold: Number) {
        cdkBuilder.memoryThreshold(memoryThreshold)
      }

      override fun thresholdsWaitTime(thresholdsWaitTime: Number) {
        cdkBuilder.thresholdsWaitTime(thresholdsWaitTime)
      }

      public fun build():
          software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty,
    ) : AutoScalingThresholdsProperty {
      override fun cpuThreshold(): Number? = unwrap(this).getCpuThreshold()

      override fun ignoreMetricsTime(): Number? = unwrap(this).getIgnoreMetricsTime()

      override fun instanceCount(): Number? = unwrap(this).getInstanceCount()

      override fun loadThreshold(): Number? = unwrap(this).getLoadThreshold()

      override fun memoryThreshold(): Number? = unwrap(this).getMemoryThreshold()

      override fun thresholdsWaitTime(): Number? = unwrap(this).getThresholdsWaitTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingThresholdsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty):
          AutoScalingThresholdsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoScalingThresholdsProperty):
          software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface LifecycleEventConfigurationProperty {
    public fun shutdownEventConfiguration(): Any? = unwrap(this).getShutdownEventConfiguration()

    public interface Builder {
      public fun shutdownEventConfiguration(shutdownEventConfiguration: IResolvable)

      public
          fun shutdownEventConfiguration(shutdownEventConfiguration: ShutdownEventConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("623d73a9a99a95e14394bdc7c031e0b34a162762be601099054abf7bb03a2646")
      public
          fun shutdownEventConfiguration(shutdownEventConfiguration: ShutdownEventConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty.builder()

      override fun shutdownEventConfiguration(shutdownEventConfiguration: IResolvable) {
        cdkBuilder.shutdownEventConfiguration(shutdownEventConfiguration.let(IResolvable::unwrap))
      }

      override
          fun shutdownEventConfiguration(shutdownEventConfiguration: ShutdownEventConfigurationProperty) {
        cdkBuilder.shutdownEventConfiguration(shutdownEventConfiguration.let(ShutdownEventConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("623d73a9a99a95e14394bdc7c031e0b34a162762be601099054abf7bb03a2646")
      override
          fun shutdownEventConfiguration(shutdownEventConfiguration: ShutdownEventConfigurationProperty.Builder.() -> Unit):
          Unit =
          shutdownEventConfiguration(ShutdownEventConfigurationProperty(shutdownEventConfiguration))

      public fun build():
          software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty,
    ) : LifecycleEventConfigurationProperty {
      override fun shutdownEventConfiguration(): Any? = unwrap(this).getShutdownEventConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LifecycleEventConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty):
          LifecycleEventConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LifecycleEventConfigurationProperty):
          software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RecipesProperty {
    public fun configure(): List<String> = unwrap(this).getConfigure() ?: emptyList()

    public fun deploy(): List<String> = unwrap(this).getDeploy() ?: emptyList()

    public fun setup(): List<String> = unwrap(this).getSetup() ?: emptyList()

    public fun shutdown(): List<String> = unwrap(this).getShutdown() ?: emptyList()

    public fun undeploy(): List<String> = unwrap(this).getUndeploy() ?: emptyList()

    public interface Builder {
      public fun configure(configure: List<String>)

      public fun deploy(deploy: List<String>)

      public fun shutdown(shutdown: List<String>)

      public fun undeploy(undeploy: List<String>)

      public fun up(setup: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnLayer.RecipesProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnLayer.RecipesProperty.builder()

      override fun configure(configure: List<String>) {
        cdkBuilder.configure(configure)
      }

      override fun deploy(deploy: List<String>) {
        cdkBuilder.deploy(deploy)
      }

      override fun shutdown(shutdown: List<String>) {
        cdkBuilder.shutdown(shutdown)
      }

      override fun undeploy(undeploy: List<String>) {
        cdkBuilder.undeploy(undeploy)
      }

      override fun up(setup: List<String>) {
        cdkBuilder.setup(setup)
      }

      public fun build(): software.amazon.awscdk.services.opsworks.CfnLayer.RecipesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.opsworks.CfnLayer.RecipesProperty,
    ) : RecipesProperty {
      override fun configure(): List<String> = unwrap(this).getConfigure() ?: emptyList()

      override fun deploy(): List<String> = unwrap(this).getDeploy() ?: emptyList()

      override fun setup(): List<String> = unwrap(this).getSetup() ?: emptyList()

      override fun shutdown(): List<String> = unwrap(this).getShutdown() ?: emptyList()

      override fun undeploy(): List<String> = unwrap(this).getUndeploy() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RecipesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnLayer.RecipesProperty):
          RecipesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecipesProperty):
          software.amazon.awscdk.services.opsworks.CfnLayer.RecipesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LoadBasedAutoScalingProperty {
    public fun downScaling(): Any? = unwrap(this).getDownScaling()

    public fun enable(): Any? = unwrap(this).getEnable()

    public fun upScaling(): Any? = unwrap(this).getUpScaling()

    public interface Builder {
      public fun downScaling(downScaling: IResolvable)

      public fun downScaling(downScaling: AutoScalingThresholdsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f9cda7a5b9775e3f009d9a6d189c785654f2ecd2ae9d640b1d53e089103a9535")
      public fun downScaling(downScaling: AutoScalingThresholdsProperty.Builder.() -> Unit)

      public fun enable(enable: Boolean)

      public fun enable(enable: IResolvable)

      public fun upScaling(upScaling: IResolvable)

      public fun upScaling(upScaling: AutoScalingThresholdsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e98bf6335bbca94e6f468a1b112e8bd884eff09cac00c5118212d2e46a79fce4")
      public fun upScaling(upScaling: AutoScalingThresholdsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty.builder()

      override fun downScaling(downScaling: IResolvable) {
        cdkBuilder.downScaling(downScaling.let(IResolvable::unwrap))
      }

      override fun downScaling(downScaling: AutoScalingThresholdsProperty) {
        cdkBuilder.downScaling(downScaling.let(AutoScalingThresholdsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f9cda7a5b9775e3f009d9a6d189c785654f2ecd2ae9d640b1d53e089103a9535")
      override fun downScaling(downScaling: AutoScalingThresholdsProperty.Builder.() -> Unit): Unit
          = downScaling(AutoScalingThresholdsProperty(downScaling))

      override fun enable(enable: Boolean) {
        cdkBuilder.enable(enable)
      }

      override fun enable(enable: IResolvable) {
        cdkBuilder.enable(enable.let(IResolvable::unwrap))
      }

      override fun upScaling(upScaling: IResolvable) {
        cdkBuilder.upScaling(upScaling.let(IResolvable::unwrap))
      }

      override fun upScaling(upScaling: AutoScalingThresholdsProperty) {
        cdkBuilder.upScaling(upScaling.let(AutoScalingThresholdsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e98bf6335bbca94e6f468a1b112e8bd884eff09cac00c5118212d2e46a79fce4")
      override fun upScaling(upScaling: AutoScalingThresholdsProperty.Builder.() -> Unit): Unit =
          upScaling(AutoScalingThresholdsProperty(upScaling))

      public fun build():
          software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty,
    ) : LoadBasedAutoScalingProperty {
      override fun downScaling(): Any? = unwrap(this).getDownScaling()

      override fun enable(): Any? = unwrap(this).getEnable()

      override fun upScaling(): Any? = unwrap(this).getUpScaling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoadBasedAutoScalingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty):
          LoadBasedAutoScalingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoadBasedAutoScalingProperty):
          software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface VolumeConfigurationProperty {
    public fun encrypted(): Any? = unwrap(this).getEncrypted()

    public fun iops(): Number? = unwrap(this).getIops()

    public fun mountPoint(): String? = unwrap(this).getMountPoint()

    public fun numberOfDisks(): Number? = unwrap(this).getNumberOfDisks()

    public fun raidLevel(): Number? = unwrap(this).getRaidLevel()

    public fun size(): Number? = unwrap(this).getSize()

    public fun volumeType(): String? = unwrap(this).getVolumeType()

    public interface Builder {
      public fun encrypted(encrypted: Boolean)

      public fun encrypted(encrypted: IResolvable)

      public fun iops(iops: Number)

      public fun mountPoint(mountPoint: String)

      public fun numberOfDisks(numberOfDisks: Number)

      public fun raidLevel(raidLevel: Number)

      public fun size(size: Number)

      public fun volumeType(volumeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.builder()

      override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
      }

      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      override fun mountPoint(mountPoint: String) {
        cdkBuilder.mountPoint(mountPoint)
      }

      override fun numberOfDisks(numberOfDisks: Number) {
        cdkBuilder.numberOfDisks(numberOfDisks)
      }

      override fun raidLevel(raidLevel: Number) {
        cdkBuilder.raidLevel(raidLevel)
      }

      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build():
          software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty,
    ) : VolumeConfigurationProperty {
      override fun encrypted(): Any? = unwrap(this).getEncrypted()

      override fun iops(): Number? = unwrap(this).getIops()

      override fun mountPoint(): String? = unwrap(this).getMountPoint()

      override fun numberOfDisks(): Number? = unwrap(this).getNumberOfDisks()

      override fun raidLevel(): Number? = unwrap(this).getRaidLevel()

      override fun size(): Number? = unwrap(this).getSize()

      override fun volumeType(): String? = unwrap(this).getVolumeType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty):
          VolumeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeConfigurationProperty):
          software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ShutdownEventConfigurationProperty {
    public fun delayUntilElbConnectionsDrained(): Any? =
        unwrap(this).getDelayUntilElbConnectionsDrained()

    public fun executionTimeout(): Number? = unwrap(this).getExecutionTimeout()

    public interface Builder {
      public fun delayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained: Boolean)

      public fun delayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained: IResolvable)

      public fun executionTimeout(executionTimeout: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty.builder()

      override fun delayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained: Boolean) {
        cdkBuilder.delayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained)
      }

      override fun delayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained: IResolvable) {
        cdkBuilder.delayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained.let(IResolvable::unwrap))
      }

      override fun executionTimeout(executionTimeout: Number) {
        cdkBuilder.executionTimeout(executionTimeout)
      }

      public fun build():
          software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty,
    ) : ShutdownEventConfigurationProperty {
      override fun delayUntilElbConnectionsDrained(): Any? =
          unwrap(this).getDelayUntilElbConnectionsDrained()

      override fun executionTimeout(): Number? = unwrap(this).getExecutionTimeout()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ShutdownEventConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty):
          ShutdownEventConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ShutdownEventConfigurationProperty):
          software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
