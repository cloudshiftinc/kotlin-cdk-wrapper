@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface AppMeshProxyConfigurationConfigProps {
  public fun containerName(): String

  public fun properties(): AppMeshProxyConfigurationProps

  @CdkDslMarker
  public interface Builder {
    public fun containerName(containerName: String)

    public fun properties(properties: AppMeshProxyConfigurationProps)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f21c01f599162e00279ddb43e8d5e8eba47ad702fba49198a00977d52594df05")
    public fun properties(properties: AppMeshProxyConfigurationProps.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationConfigProps.Builder =
        software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationConfigProps.builder()

    override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    override fun properties(properties: AppMeshProxyConfigurationProps) {
      cdkBuilder.properties(properties.let(AppMeshProxyConfigurationProps::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    override fun containerName(): String = unwrap(this).getContainerName()

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
