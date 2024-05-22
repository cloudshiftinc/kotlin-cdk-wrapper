@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The base class for proxy configurations.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * ProxyConfigurations proxyConfigurations = new ProxyConfigurations();
 * ```
 */
public open class ProxyConfigurations(
  cdkObject: software.amazon.awscdk.services.ecs.ProxyConfigurations,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.ecs.ProxyConfigurations()
  )

  public companion object {
    public fun appMeshProxyConfiguration(props: AppMeshProxyConfigurationConfigProps):
        ProxyConfiguration =
        software.amazon.awscdk.services.ecs.ProxyConfigurations.appMeshProxyConfiguration(props.let(AppMeshProxyConfigurationConfigProps.Companion::unwrap)).let(ProxyConfiguration::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55c94b9a637fb38e477eea6e3c1d4bb61f30e855da96780bfa8dd649096c9c6d")
    public
        fun appMeshProxyConfiguration(props: AppMeshProxyConfigurationConfigProps.Builder.() -> Unit):
        ProxyConfiguration = appMeshProxyConfiguration(AppMeshProxyConfigurationConfigProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ProxyConfigurations):
        ProxyConfigurations = ProxyConfigurations(cdkObject)

    internal fun unwrap(wrapped: ProxyConfigurations):
        software.amazon.awscdk.services.ecs.ProxyConfigurations = wrapped.cdkObject as
        software.amazon.awscdk.services.ecs.ProxyConfigurations
  }
}
