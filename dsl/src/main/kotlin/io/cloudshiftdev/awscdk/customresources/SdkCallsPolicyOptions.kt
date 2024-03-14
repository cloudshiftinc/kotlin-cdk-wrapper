package io.cloudshiftdev.awscdk.customresources

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface SdkCallsPolicyOptions {
  public fun resources(): List<String>

  public interface Builder {
    public fun resources(resources: List<String>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.customresources.SdkCallsPolicyOptions.Builder =
        software.amazon.awscdk.customresources.SdkCallsPolicyOptions.builder()

    public override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

    public fun build(): software.amazon.awscdk.customresources.SdkCallsPolicyOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.customresources.SdkCallsPolicyOptions,
  ) : SdkCallsPolicyOptions {
    public override fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SdkCallsPolicyOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.SdkCallsPolicyOptions):
        SdkCallsPolicyOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SdkCallsPolicyOptions):
        software.amazon.awscdk.customresources.SdkCallsPolicyOptions = (wrapped as
        Wrapper).cdkObject
  }
}
