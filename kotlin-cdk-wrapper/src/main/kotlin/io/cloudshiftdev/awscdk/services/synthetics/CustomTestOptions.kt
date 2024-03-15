@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CustomTestOptions {
  public fun code(): Code

  public fun handler(): String

  @CdkDslMarker
  public interface Builder {
    public fun code(code: Code)

    public fun handler(handler: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.synthetics.CustomTestOptions.Builder =
        software.amazon.awscdk.services.synthetics.CustomTestOptions.builder()

    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    override fun handler(handler: String) {
      cdkBuilder.handler(handler)
    }

    public fun build(): software.amazon.awscdk.services.synthetics.CustomTestOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.synthetics.CustomTestOptions,
  ) : CdkObject(cdkObject), CustomTestOptions {
    override fun code(): Code = unwrap(this).getCode().let(Code::wrap)

    override fun handler(): String = unwrap(this).getHandler()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomTestOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CustomTestOptions):
        CustomTestOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomTestOptions):
        software.amazon.awscdk.services.synthetics.CustomTestOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.synthetics.CustomTestOptions
  }
}
