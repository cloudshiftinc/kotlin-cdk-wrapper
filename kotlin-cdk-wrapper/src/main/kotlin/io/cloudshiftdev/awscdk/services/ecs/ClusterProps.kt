@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ClusterProps {
  public fun capacity(): AddCapacityOptions? =
      unwrap(this).getCapacity()?.let(AddCapacityOptions::wrap)

  public fun clusterName(): String? = unwrap(this).getClusterName()

  public fun containerInsights(): Boolean? = unwrap(this).getContainerInsights()

  public fun defaultCloudMapNamespace(): CloudMapNamespaceOptions? =
      unwrap(this).getDefaultCloudMapNamespace()?.let(CloudMapNamespaceOptions::wrap)

  public fun enableFargateCapacityProviders(): Boolean? =
      unwrap(this).getEnableFargateCapacityProviders()

  public fun executeCommandConfiguration(): ExecuteCommandConfiguration? =
      unwrap(this).getExecuteCommandConfiguration()?.let(ExecuteCommandConfiguration::wrap)

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun capacity(capacity: AddCapacityOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e051d48f3e89d80105be7002b335624e9e9f3b64eab963d8e54a67e555234f2f")
    public fun capacity(capacity: AddCapacityOptions.Builder.() -> Unit)

    public fun clusterName(clusterName: String)

    public fun containerInsights(containerInsights: Boolean)

    public fun defaultCloudMapNamespace(defaultCloudMapNamespace: CloudMapNamespaceOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("817e6e3d8baef1343d89633646695d178af990df11e3f918d69afb0fe94ee717")
    public
        fun defaultCloudMapNamespace(defaultCloudMapNamespace: CloudMapNamespaceOptions.Builder.() -> Unit)

    public fun enableFargateCapacityProviders(enableFargateCapacityProviders: Boolean)

    public fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a84c57c81ae5d4feff639ad2768bf3ee1d0413198a625692cd77e859750443c")
    public
        fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration.Builder.() -> Unit)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ClusterProps.Builder =
        software.amazon.awscdk.services.ecs.ClusterProps.builder()

    override fun capacity(capacity: AddCapacityOptions) {
      cdkBuilder.capacity(capacity.let(AddCapacityOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e051d48f3e89d80105be7002b335624e9e9f3b64eab963d8e54a67e555234f2f")
    override fun capacity(capacity: AddCapacityOptions.Builder.() -> Unit): Unit =
        capacity(AddCapacityOptions(capacity))

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun containerInsights(containerInsights: Boolean) {
      cdkBuilder.containerInsights(containerInsights)
    }

    override fun defaultCloudMapNamespace(defaultCloudMapNamespace: CloudMapNamespaceOptions) {
      cdkBuilder.defaultCloudMapNamespace(defaultCloudMapNamespace.let(CloudMapNamespaceOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("817e6e3d8baef1343d89633646695d178af990df11e3f918d69afb0fe94ee717")
    override
        fun defaultCloudMapNamespace(defaultCloudMapNamespace: CloudMapNamespaceOptions.Builder.() -> Unit):
        Unit = defaultCloudMapNamespace(CloudMapNamespaceOptions(defaultCloudMapNamespace))

    override fun enableFargateCapacityProviders(enableFargateCapacityProviders: Boolean) {
      cdkBuilder.enableFargateCapacityProviders(enableFargateCapacityProviders)
    }

    override
        fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration) {
      cdkBuilder.executeCommandConfiguration(executeCommandConfiguration.let(ExecuteCommandConfiguration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a84c57c81ae5d4feff639ad2768bf3ee1d0413198a625692cd77e859750443c")
    override
        fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration.Builder.() -> Unit):
        Unit = executeCommandConfiguration(ExecuteCommandConfiguration(executeCommandConfiguration))

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.ClusterProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.ClusterProps,
  ) : CdkObject(cdkObject), ClusterProps {
    override fun capacity(): AddCapacityOptions? =
        unwrap(this).getCapacity()?.let(AddCapacityOptions::wrap)

    override fun clusterName(): String? = unwrap(this).getClusterName()

    override fun containerInsights(): Boolean? = unwrap(this).getContainerInsights()

    override fun defaultCloudMapNamespace(): CloudMapNamespaceOptions? =
        unwrap(this).getDefaultCloudMapNamespace()?.let(CloudMapNamespaceOptions::wrap)

    override fun enableFargateCapacityProviders(): Boolean? =
        unwrap(this).getEnableFargateCapacityProviders()

    override fun executeCommandConfiguration(): ExecuteCommandConfiguration? =
        unwrap(this).getExecuteCommandConfiguration()?.let(ExecuteCommandConfiguration::wrap)

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ClusterProps): ClusterProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClusterProps): software.amazon.awscdk.services.ecs.ClusterProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.ClusterProps
  }
}
