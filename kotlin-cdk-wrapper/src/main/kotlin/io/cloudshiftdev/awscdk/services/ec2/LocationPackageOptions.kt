@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface LocationPackageOptions {
  public fun key(): String? = unwrap(this).getKey()

  public fun serviceRestartHandles(): List<InitServiceRestartHandle> =
      unwrap(this).getServiceRestartHandles()?.map(InitServiceRestartHandle::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun key(key: String)

    public fun serviceRestartHandles(serviceRestartHandles: List<InitServiceRestartHandle>)

    public fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.LocationPackageOptions.Builder =
        software.amazon.awscdk.services.ec2.LocationPackageOptions.builder()

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    override fun serviceRestartHandles(serviceRestartHandles: List<InitServiceRestartHandle>) {
      cdkBuilder.serviceRestartHandles(serviceRestartHandles.map(InitServiceRestartHandle::unwrap))
    }

    override fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle): Unit
        = serviceRestartHandles(serviceRestartHandles.toList())

    public fun build(): software.amazon.awscdk.services.ec2.LocationPackageOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.LocationPackageOptions,
  ) : CdkObject(cdkObject), LocationPackageOptions {
    override fun key(): String? = unwrap(this).getKey()

    override fun serviceRestartHandles(): List<InitServiceRestartHandle> =
        unwrap(this).getServiceRestartHandles()?.map(InitServiceRestartHandle::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LocationPackageOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LocationPackageOptions):
        LocationPackageOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LocationPackageOptions):
        software.amazon.awscdk.services.ec2.LocationPackageOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.LocationPackageOptions
  }
}
