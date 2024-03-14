package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface AppMeshProxyConfigurationConfigProps {
  /**
   * The name of the container that will serve as the App Mesh proxy.
   */
  public fun containerName(): String

  /**
   * The set of network configuration parameters to provide the Container Network Interface (CNI)
   * plugin.
   */
  public fun properties(): AppMeshProxyConfigurationProps

  /**
   * A builder for [AppMeshProxyConfigurationConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containerName The name of the container that will serve as the App Mesh proxy. 
     */
    public fun containerName(containerName: String)

    /**
     * @param properties The set of network configuration parameters to provide the Container
     * Network Interface (CNI) plugin. 
     */
    public fun properties(properties: AppMeshProxyConfigurationProps)

    /**
     * @param properties The set of network configuration parameters to provide the Container
     * Network Interface (CNI) plugin. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f21c01f599162e00279ddb43e8d5e8eba47ad702fba49198a00977d52594df05")
    public fun properties(properties: AppMeshProxyConfigurationProps.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationConfigProps.Builder =
        software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationConfigProps.builder()

    /**
     * @param containerName The name of the container that will serve as the App Mesh proxy. 
     */
    override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    /**
     * @param properties The set of network configuration parameters to provide the Container
     * Network Interface (CNI) plugin. 
     */
    override fun properties(properties: AppMeshProxyConfigurationProps) {
      cdkBuilder.properties(properties.let(AppMeshProxyConfigurationProps::unwrap))
    }

    /**
     * @param properties The set of network configuration parameters to provide the Container
     * Network Interface (CNI) plugin. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f21c01f599162e00279ddb43e8d5e8eba47ad702fba49198a00977d52594df05")
    override fun properties(properties: AppMeshProxyConfigurationProps.Builder.() -> Unit): Unit =
        properties(AppMeshProxyConfigurationProps(properties))

    public fun build(): software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationConfigProps,
  ) : CdkObject(cdkObject), AppMeshProxyConfigurationConfigProps {
    /**
     * The name of the container that will serve as the App Mesh proxy.
     */
    override fun containerName(): String = unwrap(this).getContainerName()

    /**
     * The set of network configuration parameters to provide the Container Network Interface (CNI)
     * plugin.
     */
    override fun properties(): AppMeshProxyConfigurationProps =
        unwrap(this).getProperties().let(AppMeshProxyConfigurationProps::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        AppMeshProxyConfigurationConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationConfigProps):
        AppMeshProxyConfigurationConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AppMeshProxyConfigurationConfigProps):
        software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationConfigProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationConfigProps
  }
}
