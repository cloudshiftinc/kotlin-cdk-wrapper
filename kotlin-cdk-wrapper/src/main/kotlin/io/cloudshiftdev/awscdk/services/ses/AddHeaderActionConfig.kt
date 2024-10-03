@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * AddHeaderAction configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * AddHeaderActionConfig addHeaderActionConfig = AddHeaderActionConfig.builder()
 * .headerName("headerName")
 * .headerValue("headerValue")
 * .build();
 * ```
 */
public interface AddHeaderActionConfig {
  /**
   * The name of the header that you want to add to the incoming message.
   */
  public fun headerName(): String

  /**
   * The content that you want to include in the header.
   */
  public fun headerValue(): String

  /**
   * A builder for [AddHeaderActionConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param headerName The name of the header that you want to add to the incoming message. 
     */
    public fun headerName(headerName: String)

    /**
     * @param headerValue The content that you want to include in the header. 
     */
    public fun headerValue(headerValue: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.AddHeaderActionConfig.Builder =
        software.amazon.awscdk.services.ses.AddHeaderActionConfig.builder()

    /**
     * @param headerName The name of the header that you want to add to the incoming message. 
     */
    override fun headerName(headerName: String) {
      cdkBuilder.headerName(headerName)
    }

    /**
     * @param headerValue The content that you want to include in the header. 
     */
    override fun headerValue(headerValue: String) {
      cdkBuilder.headerValue(headerValue)
    }

    public fun build(): software.amazon.awscdk.services.ses.AddHeaderActionConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.AddHeaderActionConfig,
  ) : CdkObject(cdkObject),
      AddHeaderActionConfig {
    /**
     * The name of the header that you want to add to the incoming message.
     */
    override fun headerName(): String = unwrap(this).getHeaderName()

    /**
     * The content that you want to include in the header.
     */
    override fun headerValue(): String = unwrap(this).getHeaderValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddHeaderActionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.AddHeaderActionConfig):
        AddHeaderActionConfig = CdkObjectWrappers.wrap(cdkObject) as? AddHeaderActionConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddHeaderActionConfig):
        software.amazon.awscdk.services.ses.AddHeaderActionConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.AddHeaderActionConfig
  }
}
