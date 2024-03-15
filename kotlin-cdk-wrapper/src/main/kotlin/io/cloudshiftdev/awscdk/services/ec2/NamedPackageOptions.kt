@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface NamedPackageOptions {
  public fun serviceRestartHandles(): List<InitServiceRestartHandle> =
      unwrap(this).getServiceRestartHandles()?.map(InitServiceRestartHandle::wrap) ?: emptyList()

  public fun version(): List<String> = unwrap(this).getVersion() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun serviceRestartHandles(serviceRestartHandles: List<InitServiceRestartHandle>)

    public fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle)

    public fun version(version: List<String>)

    public fun version(vararg version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.NamedPackageOptions.Builder =
        software.amazon.awscdk.services.ec2.NamedPackageOptions.builder()

    override fun serviceRestartHandles(serviceRestartHandles: List<InitServiceRestartHandle>) {
      cdkBuilder.serviceRestartHandles(serviceRestartHandles.map(InitServiceRestartHandle::unwrap))
    }

    override fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle): Unit
        = serviceRestartHandles(serviceRestartHandles.toList())

    override fun version(version: List<String>) {
      cdkBuilder.version(version)
    }

    override fun version(vararg version: String): Unit = version(version.toList())

    public fun build(): software.amazon.awscdk.services.ec2.NamedPackageOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.NamedPackageOptions,
  ) : CdkObject(cdkObject), NamedPackageOptions {
    override fun serviceRestartHandles(): List<InitServiceRestartHandle> =
        unwrap(this).getServiceRestartHandles()?.map(InitServiceRestartHandle::wrap) ?: emptyList()

    override fun version(): List<String> = unwrap(this).getVersion() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NamedPackageOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.NamedPackageOptions):
        NamedPackageOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NamedPackageOptions):
        software.amazon.awscdk.services.ec2.NamedPackageOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.NamedPackageOptions
  }
}
