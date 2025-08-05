@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Parser processor for AWS vended logs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * VendedLogParser vendedLogParser = VendedLogParser.Builder.create()
 * .logType(VendedLogType.CLOUDFRONT)
 * // the properties below are optional
 * .source("source")
 * .build();
 * ```
 */
public open class VendedLogParser(
  cdkObject: software.amazon.awscdk.services.logs.VendedLogParser,
) : CdkObject(cdkObject),
    IProcessor {
  public constructor(props: VendedLogParserProps) :
      this(software.amazon.awscdk.services.logs.VendedLogParser(props.let(VendedLogParserProps.Companion::unwrap))
  )

  public constructor(props: VendedLogParserProps.Builder.() -> Unit) :
      this(VendedLogParserProps(props)
  )

  /**
   * The type of AWS vended log.
   */
  public open fun logType(): VendedLogType = unwrap(this).getLogType().let(VendedLogType::wrap)

  /**
   * The type of AWS vended log.
   */
  public open fun logType(`value`: VendedLogType) {
    unwrap(this).setLogType(`value`.let(VendedLogType.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.VendedLogParser].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The type of AWS vended log to parse.
     *
     * @param logType The type of AWS vended log to parse. 
     */
    public fun logType(logType: VendedLogType)

    /**
     * Source field to parse.
     *
     * @param source Source field to parse. 
     */
    public fun source(source: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.VendedLogParser.Builder =
        software.amazon.awscdk.services.logs.VendedLogParser.Builder.create()

    /**
     * The type of AWS vended log to parse.
     *
     * @param logType The type of AWS vended log to parse. 
     */
    override fun logType(logType: VendedLogType) {
      cdkBuilder.logType(logType.let(VendedLogType.Companion::unwrap))
    }

    /**
     * Source field to parse.
     *
     * @param source Source field to parse. 
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    public fun build(): software.amazon.awscdk.services.logs.VendedLogParser = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VendedLogParser {
      val builderImpl = BuilderImpl()
      return VendedLogParser(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.VendedLogParser):
        VendedLogParser = VendedLogParser(cdkObject)

    internal fun unwrap(wrapped: VendedLogParser):
        software.amazon.awscdk.services.logs.VendedLogParser = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.VendedLogParser
  }
}
