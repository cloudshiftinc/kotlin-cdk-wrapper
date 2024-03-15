@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface SdkCallsPolicyOptions {
  public fun resources(): List<String>

  @CdkDslMarker
  public interface Builder {
    public fun resources(resources: List<String>)

    public fun resources(vararg resources: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.customresources.SdkCallsPolicyOptions.Builder =
        software.amazon.awscdk.customresources.SdkCallsPolicyOptions.builder()

    override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

    override fun resources(vararg resources: String): Unit = resources(resources.toList())

    public fun build(): software.amazon.awscdk.customresources.SdkCallsPolicyOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.customresources.SdkCallsPolicyOptions,
  ) : CdkObject(cdkObject), SdkCallsPolicyOptions {
    override fun resources(): List<String> = unwrap(this).getResources()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SdkCallsPolicyOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.SdkCallsPolicyOptions):
        SdkCallsPolicyOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SdkCallsPolicyOptions):
        software.amazon.awscdk.customresources.SdkCallsPolicyOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.customresources.SdkCallsPolicyOptions
  }
}
