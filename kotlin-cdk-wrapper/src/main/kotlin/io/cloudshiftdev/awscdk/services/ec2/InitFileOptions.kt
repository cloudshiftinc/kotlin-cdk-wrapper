@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface InitFileOptions {
  public fun base64Encoded(): Boolean? = unwrap(this).getBase64Encoded()

  public fun group(): String? = unwrap(this).getGroup()

  public fun mode(): String? = unwrap(this).getMode()

  public fun owner(): String? = unwrap(this).getOwner()

  public fun serviceRestartHandles(): List<InitServiceRestartHandle> =
      unwrap(this).getServiceRestartHandles()?.map(InitServiceRestartHandle::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun base64Encoded(base64Encoded: Boolean)

    public fun group(group: String)

    public fun mode(mode: String)

    public fun owner(owner: String)

    public fun serviceRestartHandles(serviceRestartHandles: List<InitServiceRestartHandle>)

    public fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.InitFileOptions.Builder =
        software.amazon.awscdk.services.ec2.InitFileOptions.builder()

    override fun base64Encoded(base64Encoded: Boolean) {
      cdkBuilder.base64Encoded(base64Encoded)
    }

    override fun group(group: String) {
      cdkBuilder.group(group)
    }

    override fun mode(mode: String) {
      cdkBuilder.mode(mode)
    }

    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    override fun serviceRestartHandles(serviceRestartHandles: List<InitServiceRestartHandle>) {
      cdkBuilder.serviceRestartHandles(serviceRestartHandles.map(InitServiceRestartHandle::unwrap))
    }

    override fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle): Unit
        = serviceRestartHandles(serviceRestartHandles.toList())

    public fun build(): software.amazon.awscdk.services.ec2.InitFileOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.InitFileOptions,
  ) : CdkObject(cdkObject), InitFileOptions {
    override fun base64Encoded(): Boolean? = unwrap(this).getBase64Encoded()

    override fun group(): String? = unwrap(this).getGroup()

    override fun mode(): String? = unwrap(this).getMode()

    override fun owner(): String? = unwrap(this).getOwner()

    override fun serviceRestartHandles(): List<InitServiceRestartHandle> =
        unwrap(this).getServiceRestartHandles()?.map(InitServiceRestartHandle::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InitFileOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitFileOptions):
        InitFileOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InitFileOptions):
        software.amazon.awscdk.services.ec2.InitFileOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.InitFileOptions
  }
}
