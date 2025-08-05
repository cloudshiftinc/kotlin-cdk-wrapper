@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for creating AWS vended log parsers.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * VendedLogParserProps vendedLogParserProps = VendedLogParserProps.builder()
 * .logType(VendedLogType.CLOUDFRONT)
 * // the properties below are optional
 * .source("source")
 * .build();
 * ```
 */
public interface VendedLogParserProps : BaseProcessorProps {
  /**
   * The type of AWS vended log to parse.
   */
  public fun logType(): VendedLogType

  /**
   * Source field to parse.
   */
  public fun source(): String? = unwrap(this).getSource()

  /**
   * A builder for [VendedLogParserProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param logType The type of AWS vended log to parse. 
     */
    public fun logType(logType: VendedLogType)

    /**
     * @param source Source field to parse.
     */
    public fun source(source: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.VendedLogParserProps.Builder =
        software.amazon.awscdk.services.logs.VendedLogParserProps.builder()

    /**
     * @param logType The type of AWS vended log to parse. 
     */
    override fun logType(logType: VendedLogType) {
      cdkBuilder.logType(logType.let(VendedLogType.Companion::unwrap))
    }

    /**
     * @param source Source field to parse.
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    public fun build(): software.amazon.awscdk.services.logs.VendedLogParserProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.VendedLogParserProps,
  ) : CdkObject(cdkObject),
      VendedLogParserProps {
    /**
     * The type of AWS vended log to parse.
     */
    override fun logType(): VendedLogType = unwrap(this).getLogType().let(VendedLogType::wrap)

    /**
     * Source field to parse.
     */
    override fun source(): String? = unwrap(this).getSource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VendedLogParserProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.VendedLogParserProps):
        VendedLogParserProps = CdkObjectWrappers.wrap(cdkObject) as? VendedLogParserProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VendedLogParserProps):
        software.amazon.awscdk.services.logs.VendedLogParserProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.VendedLogParserProps
  }
}
