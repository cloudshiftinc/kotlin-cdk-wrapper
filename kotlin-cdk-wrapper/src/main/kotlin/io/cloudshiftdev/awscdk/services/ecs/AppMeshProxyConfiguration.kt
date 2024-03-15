@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The class for App Mesh proxy configurations.
 *
 * For tasks using the EC2 launch type, the container instances require at least version 1.26.0 of
 * the container agent and at least version
 * 1.26.0-1 of the ecs-init package to enable a proxy configuration. If your container instances are
 * launched from the Amazon ECS-optimized
 * AMI version 20190301 or later, then they contain the required versions of the container agent and
 * ecs-init.
 * For more information, see [Amazon ECS-optimized
 * AMIs](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html).
 *
 * For tasks using the Fargate launch type, the task or service requires platform version 1.3.0 or
 * later.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * AppMeshProxyConfiguration appMeshProxyConfiguration = AppMeshProxyConfiguration.Builder.create()
 * .containerName("containerName")
 * .properties(AppMeshProxyConfigurationProps.builder()
 * .appPorts(List.of(123))
 * .proxyEgressPort(123)
 * .proxyIngressPort(123)
 * // the properties below are optional
 * .egressIgnoredIPs(List.of("egressIgnoredIPs"))
 * .egressIgnoredPorts(List.of(123))
 * .ignoredGID(123)
 * .ignoredUID(123)
 * .build())
 * .build();
 * ```
 */
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
