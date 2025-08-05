@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * The CSV processor parses comma-separated values (CSV) from the log events into columns.
 *
 * For more information about this processor including examples, see csv in the CloudWatch Logs User
 * Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CsvProperty csvProperty = CsvProperty.builder()
 * .columns(List.of("columns"))
 * .delimiter(DelimiterCharacter.COMMA)
 * .quoteCharacter(QuoteCharacter.DOUBLE_QUOTE)
 * .source("source")
 * .build();
 * ```
 */
public interface CsvProperty {
  /**
   * An array of names to use for the columns in the transformed log event.
   *
   * Default: - Column names ([column_1, column_2 ...]) are used
   */
  public fun columns(): List<String> = unwrap(this).getColumns() ?: emptyList()

  /**
   * Character used to separate each column in the original comma-separated value log event.
   *
   * Default: DelimiterCharacter.COMMA
   */
  public fun delimiter(): DelimiterCharacter? =
      unwrap(this).getDelimiter()?.let(DelimiterCharacter::wrap)

  /**
   * Character used as a text qualifier for a single column of data.
   *
   * Default: QuoteCharacter.DOUBLE_QUOTE
   */
  public fun quoteCharacter(): QuoteCharacter? =
      unwrap(this).getQuoteCharacter()?.let(QuoteCharacter::wrap)

  /**
   * The path to the field in the log event that has the comma separated values to be parsed.
   *
   * Default: '@message'
   */
  public fun source(): String? = unwrap(this).getSource()

  /**
   * A builder for [CsvProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param columns An array of names to use for the columns in the transformed log event.
     */
    public fun columns(columns: List<String>)

    /**
     * @param columns An array of names to use for the columns in the transformed log event.
     */
    public fun columns(vararg columns: String)

    /**
     * @param delimiter Character used to separate each column in the original comma-separated value
     * log event.
     */
    public fun delimiter(delimiter: DelimiterCharacter)

    /**
     * @param quoteCharacter Character used as a text qualifier for a single column of data.
     */
    public fun quoteCharacter(quoteCharacter: QuoteCharacter)

    /**
     * @param source The path to the field in the log event that has the comma separated values to
     * be parsed.
     */
    public fun source(source: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CsvProperty.Builder =
        software.amazon.awscdk.services.logs.CsvProperty.builder()

    /**
     * @param columns An array of names to use for the columns in the transformed log event.
     */
    override fun columns(columns: List<String>) {
      cdkBuilder.columns(columns)
    }

    /**
     * @param columns An array of names to use for the columns in the transformed log event.
     */
    override fun columns(vararg columns: String): Unit = columns(columns.toList())

    /**
     * @param delimiter Character used to separate each column in the original comma-separated value
     * log event.
     */
    override fun delimiter(delimiter: DelimiterCharacter) {
      cdkBuilder.delimiter(delimiter.let(DelimiterCharacter.Companion::unwrap))
    }

    /**
     * @param quoteCharacter Character used as a text qualifier for a single column of data.
     */
    override fun quoteCharacter(quoteCharacter: QuoteCharacter) {
      cdkBuilder.quoteCharacter(quoteCharacter.let(QuoteCharacter.Companion::unwrap))
    }

    /**
     * @param source The path to the field in the log event that has the comma separated values to
     * be parsed.
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    public fun build(): software.amazon.awscdk.services.logs.CsvProperty = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.CsvProperty,
  ) : CdkObject(cdkObject),
      CsvProperty {
    /**
     * An array of names to use for the columns in the transformed log event.
     *
     * Default: - Column names ([column_1, column_2 ...]) are used
     */
    override fun columns(): List<String> = unwrap(this).getColumns() ?: emptyList()

    /**
     * Character used to separate each column in the original comma-separated value log event.
     *
     * Default: DelimiterCharacter.COMMA
     */
    override fun delimiter(): DelimiterCharacter? =
        unwrap(this).getDelimiter()?.let(DelimiterCharacter::wrap)

    /**
     * Character used as a text qualifier for a single column of data.
     *
     * Default: QuoteCharacter.DOUBLE_QUOTE
     */
    override fun quoteCharacter(): QuoteCharacter? =
        unwrap(this).getQuoteCharacter()?.let(QuoteCharacter::wrap)

    /**
     * The path to the field in the log event that has the comma separated values to be parsed.
     *
     * Default: '@message'
     */
    override fun source(): String? = unwrap(this).getSource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CsvProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CsvProperty): CsvProperty =
        CdkObjectWrappers.wrap(cdkObject) as? CsvProperty ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CsvProperty): software.amazon.awscdk.services.logs.CsvProperty =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.logs.CsvProperty
  }
}
