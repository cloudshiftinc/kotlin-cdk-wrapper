@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emrserverless

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnApplicationProps {
  public fun architecture(): String? = unwrap(this).getArchitecture()

  public fun autoStartConfiguration(): Any? = unwrap(this).getAutoStartConfiguration()

  public fun autoStopConfiguration(): Any? = unwrap(this).getAutoStopConfiguration()

  public fun imageConfiguration(): Any? = unwrap(this).getImageConfiguration()

  public fun initialCapacity(): Any? = unwrap(this).getInitialCapacity()

  public fun maximumCapacity(): Any? = unwrap(this).getMaximumCapacity()

  public fun monitoringConfiguration(): Any? = unwrap(this).getMonitoringConfiguration()

  public fun name(): String? = unwrap(this).getName()

  public fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  public fun releaseLabel(): String

  public fun runtimeConfiguration(): Any? = unwrap(this).getRuntimeConfiguration()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String

  public fun workerTypeSpecifications(): Any? = unwrap(this).getWorkerTypeSpecifications()

  @CdkDslMarker
  public interface Builder {
    public fun architecture(architecture: String)

    public fun autoStartConfiguration(autoStartConfiguration: IResolvable)

    public
        fun autoStartConfiguration(autoStartConfiguration: CfnApplication.AutoStartConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c56e55427ffc6e9c88a76c0c2518dca5cef2cfb032fe06c6248e8db95a4abaa")
    public
        fun autoStartConfiguration(autoStartConfiguration: CfnApplication.AutoStartConfigurationProperty.Builder.() -> Unit)

    public fun autoStopConfiguration(autoStopConfiguration: IResolvable)

    public
        fun autoStopConfiguration(autoStopConfiguration: CfnApplication.AutoStopConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("500de897cc0a94d16dfca0ecba731277b538dc74743b3d5fc3facb0a078777c1")
    public
        fun autoStopConfiguration(autoStopConfiguration: CfnApplication.AutoStopConfigurationProperty.Builder.() -> Unit)

    public fun imageConfiguration(imageConfiguration: IResolvable)

    public
        fun imageConfiguration(imageConfiguration: CfnApplication.ImageConfigurationInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("acb4744c2049de24c6ffd41fb642b97c83fa2ae1fd542d99699ad72a9c791bd6")
    public
        fun imageConfiguration(imageConfiguration: CfnApplication.ImageConfigurationInputProperty.Builder.() -> Unit)

    public fun initialCapacity(initialCapacity: IResolvable)

    public fun initialCapacity(initialCapacity: List<Any>)

    public fun initialCapacity(vararg initialCapacity: Any)

    public fun maximumCapacity(maximumCapacity: IResolvable)

    public fun maximumCapacity(maximumCapacity: CfnApplication.MaximumAllowedResourcesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84ff62a12028d75d395fc0763ba45836088c0bc553ebd77b789c88019a944155")
    public
        fun maximumCapacity(maximumCapacity: CfnApplication.MaximumAllowedResourcesProperty.Builder.() -> Unit)

    public fun monitoringConfiguration(monitoringConfiguration: IResolvable)

    public
        fun monitoringConfiguration(monitoringConfiguration: CfnApplication.MonitoringConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8dc81f1ffc2da6af1f80f12f17224058b6a286e36ac05b5f737f104823e4f40d")
    public
        fun monitoringConfiguration(monitoringConfiguration: CfnApplication.MonitoringConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun networkConfiguration(networkConfiguration: IResolvable)

    public
        fun networkConfiguration(networkConfiguration: CfnApplication.NetworkConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be091b832776d5e5dded16980a31d452d52a7d11ec6f094c4e3358f3be7099e9")
    public
        fun networkConfiguration(networkConfiguration: CfnApplication.NetworkConfigurationProperty.Builder.() -> Unit)

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

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.emrserverless.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.emrserverless.CfnApplicationProps.builder()

    override fun architecture(architecture: String) {
      cdkBuilder.architecture(architecture)
    }

    override fun autoStartConfiguration(autoStartConfiguration: IResolvable) {
      cdkBuilder.autoStartConfiguration(autoStartConfiguration.let(IResolvable::unwrap))
    }

    override
        fun autoStartConfiguration(autoStartConfiguration: CfnApplication.AutoStartConfigurationProperty) {
      cdkBuilder.autoStartConfiguration(autoStartConfiguration.let(CfnApplication.AutoStartConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c56e55427ffc6e9c88a76c0c2518dca5cef2cfb032fe06c6248e8db95a4abaa")
    override
        fun autoStartConfiguration(autoStartConfiguration: CfnApplication.AutoStartConfigurationProperty.Builder.() -> Unit):
        Unit =
        autoStartConfiguration(CfnApplication.AutoStartConfigurationProperty(autoStartConfiguration))

    override fun autoStopConfiguration(autoStopConfiguration: IResolvable) {
      cdkBuilder.autoStopConfiguration(autoStopConfiguration.let(IResolvable::unwrap))
    }

    override
        fun autoStopConfiguration(autoStopConfiguration: CfnApplication.AutoStopConfigurationProperty) {
      cdkBuilder.autoStopConfiguration(autoStopConfiguration.let(CfnApplication.AutoStopConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("500de897cc0a94d16dfca0ecba731277b538dc74743b3d5fc3facb0a078777c1")
    override
        fun autoStopConfiguration(autoStopConfiguration: CfnApplication.AutoStopConfigurationProperty.Builder.() -> Unit):
        Unit =
        autoStopConfiguration(CfnApplication.AutoStopConfigurationProperty(autoStopConfiguration))

    override fun imageConfiguration(imageConfiguration: IResolvable) {
      cdkBuilder.imageConfiguration(imageConfiguration.let(IResolvable::unwrap))
    }

    override
        fun imageConfiguration(imageConfiguration: CfnApplication.ImageConfigurationInputProperty) {
      cdkBuilder.imageConfiguration(imageConfiguration.let(CfnApplication.ImageConfigurationInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("acb4744c2049de24c6ffd41fb642b97c83fa2ae1fd542d99699ad72a9c791bd6")
    override
        fun imageConfiguration(imageConfiguration: CfnApplication.ImageConfigurationInputProperty.Builder.() -> Unit):
        Unit =
        imageConfiguration(CfnApplication.ImageConfigurationInputProperty(imageConfiguration))

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

    override fun maximumCapacity(maximumCapacity: CfnApplication.MaximumAllowedResourcesProperty) {
      cdkBuilder.maximumCapacity(maximumCapacity.let(CfnApplication.MaximumAllowedResourcesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84ff62a12028d75d395fc0763ba45836088c0bc553ebd77b789c88019a944155")
    override
        fun maximumCapacity(maximumCapacity: CfnApplication.MaximumAllowedResourcesProperty.Builder.() -> Unit):
        Unit = maximumCapacity(CfnApplication.MaximumAllowedResourcesProperty(maximumCapacity))

    override fun monitoringConfiguration(monitoringConfiguration: IResolvable) {
      cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(IResolvable::unwrap))
    }

    override
        fun monitoringConfiguration(monitoringConfiguration: CfnApplication.MonitoringConfigurationProperty) {
      cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(CfnApplication.MonitoringConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8dc81f1ffc2da6af1f80f12f17224058b6a286e36ac05b5f737f104823e4f40d")
    override
        fun monitoringConfiguration(monitoringConfiguration: CfnApplication.MonitoringConfigurationProperty.Builder.() -> Unit):
        Unit =
        monitoringConfiguration(CfnApplication.MonitoringConfigurationProperty(monitoringConfiguration))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
    }

    override
        fun networkConfiguration(networkConfiguration: CfnApplication.NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(CfnApplication.NetworkConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be091b832776d5e5dded16980a31d452d52a7d11ec6f094c4e3358f3be7099e9")
    override
        fun networkConfiguration(networkConfiguration: CfnApplication.NetworkConfigurationProperty.Builder.() -> Unit):
        Unit =
        networkConfiguration(CfnApplication.NetworkConfigurationProperty(networkConfiguration))

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

    public fun build(): software.amazon.awscdk.services.emrserverless.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplicationProps,
  ) : CdkObject(cdkObject), CfnApplicationProps {
    override fun architecture(): String? = unwrap(this).getArchitecture()

    override fun autoStartConfiguration(): Any? = unwrap(this).getAutoStartConfiguration()

    override fun autoStopConfiguration(): Any? = unwrap(this).getAutoStopConfiguration()

    override fun imageConfiguration(): Any? = unwrap(this).getImageConfiguration()

    override fun initialCapacity(): Any? = unwrap(this).getInitialCapacity()

    override fun maximumCapacity(): Any? = unwrap(this).getMaximumCapacity()

    override fun monitoringConfiguration(): Any? = unwrap(this).getMonitoringConfiguration()

    override fun name(): String? = unwrap(this).getName()

    override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

    override fun releaseLabel(): String = unwrap(this).getReleaseLabel()

    override fun runtimeConfiguration(): Any? = unwrap(this).getRuntimeConfiguration()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String = unwrap(this).getType()

    override fun workerTypeSpecifications(): Any? = unwrap(this).getWorkerTypeSpecifications()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplicationProps):
        CfnApplicationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.emrserverless.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.emrserverless.CfnApplicationProps
  }
}
