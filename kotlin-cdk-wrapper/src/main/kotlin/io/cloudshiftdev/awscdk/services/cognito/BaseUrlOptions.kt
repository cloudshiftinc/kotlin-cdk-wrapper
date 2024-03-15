@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface BaseUrlOptions {
  public fun fips(): Boolean? = unwrap(this).getFips()

  @CdkDslMarker
  public interface Builder {
    public fun fips(fips: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.BaseUrlOptions.Builder =
        software.amazon.awscdk.services.cognito.BaseUrlOptions.builder()

    override fun fips(fips: Boolean) {
      cdkBuilder.fips(fips)
    }

    public fun build(): software.amazon.awscdk.services.cognito.BaseUrlOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.BaseUrlOptions,
  ) : CdkObject(cdkObject), BaseUrlOptions {
    override fun fips(): Boolean? = unwrap(this).getFips()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseUrlOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.BaseUrlOptions):
        BaseUrlOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseUrlOptions):
        software.amazon.awscdk.services.cognito.BaseUrlOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.BaseUrlOptions
  }
}
