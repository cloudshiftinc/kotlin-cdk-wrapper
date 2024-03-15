@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnLayerProps {
  public fun attributes(): Any? = unwrap(this).getAttributes()

  public fun autoAssignElasticIps(): Any

  public fun autoAssignPublicIps(): Any

  public fun customInstanceProfileArn(): String? = unwrap(this).getCustomInstanceProfileArn()

  public fun customJson(): Any? = unwrap(this).getCustomJson()

  public fun customRecipes(): Any? = unwrap(this).getCustomRecipes()

  public fun customSecurityGroupIds(): List<String> = unwrap(this).getCustomSecurityGroupIds() ?:
      emptyList()

  public fun enableAutoHealing(): Any

  public fun installUpdatesOnBoot(): Any? = unwrap(this).getInstallUpdatesOnBoot()

  public fun lifecycleEventConfiguration(): Any? = unwrap(this).getLifecycleEventConfiguration()

  public fun loadBasedAutoScaling(): Any? = unwrap(this).getLoadBasedAutoScaling()

  public fun name(): String

  public fun packages(): List<String> = unwrap(this).getPackages() ?: emptyList()

  public fun shortname(): String

  public fun stackId(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String

  public fun useEbsOptimizedInstances(): Any? = unwrap(this).getUseEbsOptimizedInstances()

  public fun volumeConfigurations(): Any? = unwrap(this).getVolumeConfigurations()

  @CdkDslMarker
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

    public fun customRecipes(customRecipes: CfnLayer.RecipesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8707f16d32d99548e9a81d45bd59464955c904213deaf82be4f0067b1e1eafb5")
    public fun customRecipes(customRecipes: CfnLayer.RecipesProperty.Builder.() -> Unit)

    public fun customSecurityGroupIds(customSecurityGroupIds: List<String>)

    public fun customSecurityGroupIds(vararg customSecurityGroupIds: String)

    public fun enableAutoHealing(enableAutoHealing: Boolean)

    public fun enableAutoHealing(enableAutoHealing: IResolvable)

    public fun installUpdatesOnBoot(installUpdatesOnBoot: Boolean)

    public fun installUpdatesOnBoot(installUpdatesOnBoot: IResolvable)

    public fun lifecycleEventConfiguration(lifecycleEventConfiguration: IResolvable)

    public
        fun lifecycleEventConfiguration(lifecycleEventConfiguration: CfnLayer.LifecycleEventConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e64c6ab13bf1e3a04bbe68447d03393090c04d29343a8e0481d1c34947fb2d1a")
    public
        fun lifecycleEventConfiguration(lifecycleEventConfiguration: CfnLayer.LifecycleEventConfigurationProperty.Builder.() -> Unit)

    public fun loadBasedAutoScaling(loadBasedAutoScaling: IResolvable)

    public fun loadBasedAutoScaling(loadBasedAutoScaling: CfnLayer.LoadBasedAutoScalingProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9e5143608c398f23ec77672f5e01d153d428f9024d707a6d8edfba42ed648e6")
    public
        fun loadBasedAutoScaling(loadBasedAutoScaling: CfnLayer.LoadBasedAutoScalingProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun packages(packages: List<String>)

    public fun packages(vararg packages: String)

    public fun shortname(shortname: String)

    public fun stackId(stackId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)

    public fun useEbsOptimizedInstances(useEbsOptimizedInstances: Boolean)

    public fun useEbsOptimizedInstances(useEbsOptimizedInstances: IResolvable)

    public fun volumeConfigurations(volumeConfigurations: IResolvable)

    public fun volumeConfigurations(volumeConfigurations: List<Any>)

    public fun volumeConfigurations(vararg volumeConfigurations: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder =
        software.amazon.awscdk.services.opsworks.CfnLayerProps.builder()

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

    override fun customRecipes(customRecipes: CfnLayer.RecipesProperty) {
      cdkBuilder.customRecipes(customRecipes.let(CfnLayer.RecipesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8707f16d32d99548e9a81d45bd59464955c904213deaf82be4f0067b1e1eafb5")
    override fun customRecipes(customRecipes: CfnLayer.RecipesProperty.Builder.() -> Unit): Unit =
        customRecipes(CfnLayer.RecipesProperty(customRecipes))

    override fun customSecurityGroupIds(customSecurityGroupIds: List<String>) {
      cdkBuilder.customSecurityGroupIds(customSecurityGroupIds)
    }

    override fun customSecurityGroupIds(vararg customSecurityGroupIds: String): Unit =
        customSecurityGroupIds(customSecurityGroupIds.toList())

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
        fun lifecycleEventConfiguration(lifecycleEventConfiguration: CfnLayer.LifecycleEventConfigurationProperty) {
      cdkBuilder.lifecycleEventConfiguration(lifecycleEventConfiguration.let(CfnLayer.LifecycleEventConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e64c6ab13bf1e3a04bbe68447d03393090c04d29343a8e0481d1c34947fb2d1a")
    override
        fun lifecycleEventConfiguration(lifecycleEventConfiguration: CfnLayer.LifecycleEventConfigurationProperty.Builder.() -> Unit):
        Unit =
        lifecycleEventConfiguration(CfnLayer.LifecycleEventConfigurationProperty(lifecycleEventConfiguration))

    override fun loadBasedAutoScaling(loadBasedAutoScaling: IResolvable) {
      cdkBuilder.loadBasedAutoScaling(loadBasedAutoScaling.let(IResolvable::unwrap))
    }

    override fun loadBasedAutoScaling(loadBasedAutoScaling: CfnLayer.LoadBasedAutoScalingProperty) {
      cdkBuilder.loadBasedAutoScaling(loadBasedAutoScaling.let(CfnLayer.LoadBasedAutoScalingProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9e5143608c398f23ec77672f5e01d153d428f9024d707a6d8edfba42ed648e6")
    override
        fun loadBasedAutoScaling(loadBasedAutoScaling: CfnLayer.LoadBasedAutoScalingProperty.Builder.() -> Unit):
        Unit = loadBasedAutoScaling(CfnLayer.LoadBasedAutoScalingProperty(loadBasedAutoScaling))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun packages(packages: List<String>) {
      cdkBuilder.packages(packages)
    }

    override fun packages(vararg packages: String): Unit = packages(packages.toList())

    override fun shortname(shortname: String) {
      cdkBuilder.shortname(shortname)
    }

    override fun stackId(stackId: String) {
      cdkBuilder.stackId(stackId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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

    override fun volumeConfigurations(vararg volumeConfigurations: Any): Unit =
        volumeConfigurations(volumeConfigurations.toList())

    public fun build(): software.amazon.awscdk.services.opsworks.CfnLayerProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opsworks.CfnLayerProps,
  ) : CdkObject(cdkObject), CfnLayerProps {
    override fun attributes(): Any? = unwrap(this).getAttributes()

    override fun autoAssignElasticIps(): Any = unwrap(this).getAutoAssignElasticIps()

    override fun autoAssignPublicIps(): Any = unwrap(this).getAutoAssignPublicIps()

    override fun customInstanceProfileArn(): String? = unwrap(this).getCustomInstanceProfileArn()

    override fun customJson(): Any? = unwrap(this).getCustomJson()

    override fun customRecipes(): Any? = unwrap(this).getCustomRecipes()

    override fun customSecurityGroupIds(): List<String> = unwrap(this).getCustomSecurityGroupIds()
        ?: emptyList()

    override fun enableAutoHealing(): Any = unwrap(this).getEnableAutoHealing()

    override fun installUpdatesOnBoot(): Any? = unwrap(this).getInstallUpdatesOnBoot()

    override fun lifecycleEventConfiguration(): Any? = unwrap(this).getLifecycleEventConfiguration()

    override fun loadBasedAutoScaling(): Any? = unwrap(this).getLoadBasedAutoScaling()

    override fun name(): String = unwrap(this).getName()

    override fun packages(): List<String> = unwrap(this).getPackages() ?: emptyList()

    override fun shortname(): String = unwrap(this).getShortname()

    override fun stackId(): String = unwrap(this).getStackId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String = unwrap(this).getType()

    override fun useEbsOptimizedInstances(): Any? = unwrap(this).getUseEbsOptimizedInstances()

    override fun volumeConfigurations(): Any? = unwrap(this).getVolumeConfigurations()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLayerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnLayerProps):
        CfnLayerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLayerProps):
        software.amazon.awscdk.services.opsworks.CfnLayerProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.opsworks.CfnLayerProps
  }
}
