@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface KeyContextResponse {
  public fun keyId(): String

  @CdkDslMarker
  public interface Builder {
    public fun keyId(keyId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.KeyContextResponse.Builder =
        software.amazon.awscdk.cxapi.KeyContextResponse.builder()

    override fun keyId(keyId: String) {
      cdkBuilder.keyId(keyId)
    }

    public fun build(): software.amazon.awscdk.cxapi.KeyContextResponse = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cxapi.KeyContextResponse,
  ) : CdkObject(cdkObject), KeyContextResponse {
    override fun keyId(): String = unwrap(this).getKeyId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KeyContextResponse {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.KeyContextResponse):
        KeyContextResponse = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KeyContextResponse):
        software.amazon.awscdk.cxapi.KeyContextResponse = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.cxapi.KeyContextResponse
  }
}
