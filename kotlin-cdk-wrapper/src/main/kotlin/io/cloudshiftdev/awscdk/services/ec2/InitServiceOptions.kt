@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface InitServiceOptions {
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun ensureRunning(): Boolean? = unwrap(this).getEnsureRunning()

  public fun serviceManager(): ServiceManager? =
      unwrap(this).getServiceManager()?.let(ServiceManager::wrap)

  public fun serviceRestartHandle(): InitServiceRestartHandle? =
      unwrap(this).getServiceRestartHandle()?.let(InitServiceRestartHandle::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun enabled(enabled: Boolean)

    public fun ensureRunning(ensureRunning: Boolean)

    public fun serviceManager(serviceManager: ServiceManager)

    public fun serviceRestartHandle(serviceRestartHandle: InitServiceRestartHandle)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.InitServiceOptions.Builder =
        software.amazon.awscdk.services.ec2.InitServiceOptions.builder()

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun ensureRunning(ensureRunning: Boolean) {
      cdkBuilder.ensureRunning(ensureRunning)
    }

    override fun serviceManager(serviceManager: ServiceManager) {
      cdkBuilder.serviceManager(serviceManager.let(ServiceManager::unwrap))
    }

    override fun serviceRestartHandle(serviceRestartHandle: InitServiceRestartHandle) {
      cdkBuilder.serviceRestartHandle(serviceRestartHandle.let(InitServiceRestartHandle::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.InitServiceOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.InitServiceOptions,
  ) : CdkObject(cdkObject), InitServiceOptions {
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun ensureRunning(): Boolean? = unwrap(this).getEnsureRunning()

    override fun serviceManager(): ServiceManager? =
        unwrap(this).getServiceManager()?.let(ServiceManager::wrap)

    override fun serviceRestartHandle(): InitServiceRestartHandle? =
        unwrap(this).getServiceRestartHandle()?.let(InitServiceRestartHandle::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InitServiceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitServiceOptions):
        InitServiceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InitServiceOptions):
        software.amazon.awscdk.services.ec2.InitServiceOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.InitServiceOptions
  }
}
