@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * This processor converts a datetime string into a format that you specify.
 *
 * For more information about this processor including examples, see datetimeConverter in the
 * CloudWatch Logs User Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * DateTimeConverterProperty dateTimeConverterProperty = DateTimeConverterProperty.builder()
 * .locale("locale")
 * .matchPatterns(List.of("matchPatterns"))
 * .source("source")
 * .target("target")
 * // the properties below are optional
 * .sourceTimezone("sourceTimezone")
 * .targetFormat("targetFormat")
 * .targetTimezone("targetTimezone")
 * .build();
 * ```
 */
public interface DateTimeConverterProperty {
  /**
   * The locale of the source field.
   */
  public fun locale(): String

  /**
   * A list of patterns to match against the source field.
   */
  public fun matchPatterns(): List<String>

  /**
   * The key to apply the date conversion to.
   */
  public fun source(): String

  /**
   * The time zone of the source field.
   *
   * Default: UTC
   */
  public fun sourceTimezone(): String? = unwrap(this).getSourceTimezone()

  /**
   * The JSON field to store the result in.
   */
  public fun target(): String

  /**
   * The datetime format to use for the converted data in the target field.
   *
   * Default: "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
   */
  public fun targetFormat(): String? = unwrap(this).getTargetFormat()

  /**
   * The time zone of the target field.
   *
   * Default: UTC
   */
  public fun targetTimezone(): String? = unwrap(this).getTargetTimezone()

  /**
   * A builder for [DateTimeConverterProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param locale The locale of the source field. 
     */
    public fun locale(locale: String)

    /**
     * @param matchPatterns A list of patterns to match against the source field. 
     */
    public fun matchPatterns(matchPatterns: List<String>)

    /**
     * @param matchPatterns A list of patterns to match against the source field. 
     */
    public fun matchPatterns(vararg matchPatterns: String)

    /**
     * @param source The key to apply the date conversion to. 
     */
    public fun source(source: String)

    /**
     * @param sourceTimezone The time zone of the source field.
     */
    public fun sourceTimezone(sourceTimezone: String)

    /**
     * @param target The JSON field to store the result in. 
     */
    public fun target(target: String)

    /**
     * @param targetFormat The datetime format to use for the converted data in the target field.
     */
    public fun targetFormat(targetFormat: String)

    /**
     * @param targetTimezone The time zone of the target field.
     */
    public fun targetTimezone(targetTimezone: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.DateTimeConverterProperty.Builder =
        software.amazon.awscdk.services.logs.DateTimeConverterProperty.builder()

    /**
     * @param locale The locale of the source field. 
     */
    override fun locale(locale: String) {
      cdkBuilder.locale(locale)
    }

    /**
     * @param matchPatterns A list of patterns to match against the source field. 
     */
    override fun matchPatterns(matchPatterns: List<String>) {
      cdkBuilder.matchPatterns(matchPatterns)
    }

    /**
     * @param matchPatterns A list of patterns to match against the source field. 
     */
    override fun matchPatterns(vararg matchPatterns: String): Unit =
        matchPatterns(matchPatterns.toList())

    /**
     * @param source The key to apply the date conversion to. 
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    /**
     * @param sourceTimezone The time zone of the source field.
     */
    override fun sourceTimezone(sourceTimezone: String) {
      cdkBuilder.sourceTimezone(sourceTimezone)
    }

    /**
     * @param target The JSON field to store the result in. 
     */
    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    /**
     * @param targetFormat The datetime format to use for the converted data in the target field.
     */
    override fun targetFormat(targetFormat: String) {
      cdkBuilder.targetFormat(targetFormat)
    }

    /**
     * @param targetTimezone The time zone of the target field.
     */
    override fun targetTimezone(targetTimezone: String) {
      cdkBuilder.targetTimezone(targetTimezone)
    }

    public fun build(): software.amazon.awscdk.services.logs.DateTimeConverterProperty =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.DateTimeConverterProperty,
  ) : CdkObject(cdkObject),
      DateTimeConverterProperty {
    /**
     * The locale of the source field.
     */
    override fun locale(): String = unwrap(this).getLocale()

    /**
     * A list of patterns to match against the source field.
     */
    override fun matchPatterns(): List<String> = unwrap(this).getMatchPatterns()

    /**
     * The key to apply the date conversion to.
     */
    override fun source(): String = unwrap(this).getSource()

    /**
     * The time zone of the source field.
     *
     * Default: UTC
     */
    override fun sourceTimezone(): String? = unwrap(this).getSourceTimezone()

    /**
     * The JSON field to store the result in.
     */
    override fun target(): String = unwrap(this).getTarget()

    /**
     * The datetime format to use for the converted data in the target field.
     *
     * Default: "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
     */
    override fun targetFormat(): String? = unwrap(this).getTargetFormat()

    /**
     * The time zone of the target field.
     *
     * Default: UTC
     */
    override fun targetTimezone(): String? = unwrap(this).getTargetTimezone()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DateTimeConverterProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.DateTimeConverterProperty):
        DateTimeConverterProperty = CdkObjectWrappers.wrap(cdkObject) as? DateTimeConverterProperty
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DateTimeConverterProperty):
        software.amazon.awscdk.services.logs.DateTimeConverterProperty = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.DateTimeConverterProperty
  }
}
