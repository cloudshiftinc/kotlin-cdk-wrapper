package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class AppMeshProxyConfiguration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.AppMeshProxyConfiguration,
) : ProxyConfiguration(cdkObject) {
  /**
   * Called when the proxy configuration is configured on a task definition.
   *
   * @param _scope 
   * @param _taskDefinition 
   */
  public override fun bind(_scope: Construct, _taskDefinition: TaskDefinition):
      CfnTaskDefinition.ProxyConfigurationProperty =
      unwrap(this).bind(_scope.let(Construct::unwrap),
      _taskDefinition.let(TaskDefinition::unwrap)).let(CfnTaskDefinition.ProxyConfigurationProperty::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.AppMeshProxyConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the container that will serve as the App Mesh proxy.
     *
     * @param containerName The name of the container that will serve as the App Mesh proxy. 
     */
    public fun containerName(containerName: String)

    /**
     * The set of network configuration parameters to provide the Container Network Interface (CNI)
     * plugin.
     *
     * @param properties The set of network configuration parameters to provide the Container
     * Network Interface (CNI) plugin. 
     */
    public fun properties(properties: AppMeshProxyConfigurationProps)

    /**
     * The set of network configuration parameters to provide the Container Network Interface (CNI)
     * plugin.
     *
     * @param properties The set of network configuration parameters to provide the Container
     * Network Interface (CNI) plugin. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3fabf42bd12d125f3e97687606bedacc6540fe9b0dc83ad0c6f7bf812cdf0f3")
    public fun properties(properties: AppMeshProxyConfigurationProps.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.AppMeshProxyConfiguration.Builder =
        software.amazon.awscdk.services.ecs.AppMeshProxyConfiguration.Builder.create()

    /**
     * The name of the container that will serve as the App Mesh proxy.
     *
     * @param containerName The name of the container that will serve as the App Mesh proxy. 
     */
    override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    /**
     * The set of network configuration parameters to provide the Container Network Interface (CNI)
     * plugin.
     *
     * @param properties The set of network configuration parameters to provide the Container
     * Network Interface (CNI) plugin. 
     */
    override fun properties(properties: AppMeshProxyConfigurationProps) {
      cdkBuilder.properties(properties.let(AppMeshProxyConfigurationProps::unwrap))
    }

    /**
     * The set of network configuration parameters to provide the Container Network Interface (CNI)
     * plugin.
     *
     * @param properties The set of network configuration parameters to provide the Container
     * Network Interface (CNI) plugin. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3fabf42bd12d125f3e97687606bedacc6540fe9b0dc83ad0c6f7bf812cdf0f3")
    override fun properties(properties: AppMeshProxyConfigurationProps.Builder.() -> Unit): Unit =
        properties(AppMeshProxyConfigurationProps(properties))

    public fun build(): software.amazon.awscdk.services.ecs.AppMeshProxyConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AppMeshProxyConfiguration {
      val builderImpl = BuilderImpl()
      return AppMeshProxyConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AppMeshProxyConfiguration):
        AppMeshProxyConfiguration = AppMeshProxyConfiguration(cdkObject)

    internal fun unwrap(wrapped: AppMeshProxyConfiguration):
        software.amazon.awscdk.services.ecs.AppMeshProxyConfiguration = wrapped.cdkObject
  }
}
