@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties of a discovered key.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cxapi.*;
 * KeyContextResponse keyContextResponse = KeyContextResponse.builder()
 * .keyId("keyId")
 * .build();
 * ```
 */
public interface KeyContextResponse {
  /**
   * Id of the key.
   */
  public fun keyId(): String

  /**
   * A builder for [KeyContextResponse]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param keyId Id of the key. 
     */
    public fun keyId(keyId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.KeyContextResponse.Builder =
        software.amazon.awscdk.cxapi.KeyContextResponse.builder()

    /**
     * @param keyId Id of the key. 
     */
    override fun keyId(keyId: String) {
      cdkBuilder.keyId(keyId)
    }

    public fun build(): software.amazon.awscdk.cxapi.KeyContextResponse = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cxapi.KeyContextResponse,
  ) : CdkObject(cdkObject), KeyContextResponse {
    /**
     * Id of the key.
     */
    override fun keyId(): String = unwrap(this).getKeyId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KeyContextResponse {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.KeyContextResponse):
        KeyContextResponse = CdkObjectWrappers.wrap(cdkObject) as? KeyContextResponse ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: KeyContextResponse):
        software.amazon.awscdk.cxapi.KeyContextResponse = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.cxapi.KeyContextResponse
  }
}
