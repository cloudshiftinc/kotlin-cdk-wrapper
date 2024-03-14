package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class ProxyConfigurations internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.ProxyConfigurations,
) : CdkObject(cdkObject) {
  public companion object {
    public fun appMeshProxyConfiguration(props: AppMeshProxyConfigurationConfigProps):
        ProxyConfiguration =
        software.amazon.awscdk.services.ecs.ProxyConfigurations.appMeshProxyConfiguration(props.let(AppMeshProxyConfigurationConfigProps::unwrap)).let(ProxyConfiguration::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55c94b9a637fb38e477eea6e3c1d4bb61f30e855da96780bfa8dd649096c9c6d")
    public
        fun appMeshProxyConfiguration(props: AppMeshProxyConfigurationConfigProps.Builder.() -> Unit):
        ProxyConfiguration = appMeshProxyConfiguration(AppMeshProxyConfigurationConfigProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ProxyConfigurations):
        ProxyConfigurations = ProxyConfigurations(cdkObject)

    internal fun unwrap(wrapped: ProxyConfigurations):
        software.amazon.awscdk.services.ecs.ProxyConfigurations = wrapped.cdkObject
  }
}
