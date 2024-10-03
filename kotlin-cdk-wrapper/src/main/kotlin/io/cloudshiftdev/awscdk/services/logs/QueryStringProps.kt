@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for a QueryString.
 *
 * Example:
 *
 * ```
 * QueryDefinition.Builder.create(this, "QueryDefinition")
 * .queryDefinitionName("MyQuery")
 * .queryString(QueryString.Builder.create()
 * .fields(List.of("&#64;timestamp", "&#64;message"))
 * .parseStatements(List.of("&#64;message \"[*] *\" as loggingType, loggingMessage", "&#64;message
 * \"&lt;*&gt;: *\" as differentLoggingType, differentLoggingMessage"))
 * .filterStatements(List.of("loggingType = \"ERROR\"", "loggingMessage = \"A very strange error
 * occurred!\""))
 * .sort("&#64;timestamp desc")
 * .limit(20)
 * .build())
 * .build();
 * ```
 */
public interface QueryStringProps {
  /**
   * Specifies which fields to display in the query results.
   *
   * Default: - no display in QueryString
   */
  public fun display(): String? = unwrap(this).getDisplay()

  /**
   * Retrieves the specified fields from log events for display.
   *
   * Default: - no fields in QueryString
   */
  public fun fields(): List<String> = unwrap(this).getFields() ?: emptyList()

  /**
   * (deprecated) A single statement for filtering the results of a query based on a boolean
   * expression.
   *
   * Default: - no filter in QueryString
   *
   * @deprecated Use `filterStatements` instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun filter(): String? = unwrap(this).getFilter()

  /**
   * An array of one or more statements for filtering the results of a query based on a boolean
   * expression.
   *
   * Each provided statement generates a separate filter line in the query string.
   *
   * Note: If provided, this property overrides any value provided for the `filter` property.
   *
   * Default: - no filter in QueryString
   */
  public fun filterStatements(): List<String> = unwrap(this).getFilterStatements() ?: emptyList()

  /**
   * Specifies the number of log events returned by the query.
   *
   * Default: - no limit in QueryString
   */
  public fun limit(): Number? = unwrap(this).getLimit()

  /**
   * (deprecated) A single statement for parsing data from a log field and creating ephemeral fields
   * that can be processed further in the query.
   *
   * Default: - no parse in QueryString
   *
   * @deprecated Use `parseStatements` instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun parse(): String? = unwrap(this).getParse()

  /**
   * An array of one or more statements for parsing data from a log field and creating ephemeral
   * fields that can be processed further in the query.
   *
   * Each provided statement generates a separate
   * parse line in the query string.
   *
   * Note: If provided, this property overrides any value provided for the `parse` property.
   *
   * Default: - no parse in QueryString
   */
  public fun parseStatements(): List<String> = unwrap(this).getParseStatements() ?: emptyList()

  /**
   * Sorts the retrieved log events.
   *
   * Default: - no sort in QueryString
   */
  public fun sort(): String? = unwrap(this).getSort()

  /**
   * Uses log field values to calculate aggregate statistics.
   *
   * Default: - no stats in QueryString
   */
  public fun stats(): String? = unwrap(this).getStats()

  /**
   * A builder for [QueryStringProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param display Specifies which fields to display in the query results.
     */
    public fun display(display: String)

    /**
     * @param fields Retrieves the specified fields from log events for display.
     */
    public fun fields(fields: List<String>)

    /**
     * @param fields Retrieves the specified fields from log events for display.
     */
    public fun fields(vararg fields: String)

    /**
     * @param filter A single statement for filtering the results of a query based on a boolean
     * expression.
     * @deprecated Use `filterStatements` instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun filter(filter: String)

    /**
     * @param filterStatements An array of one or more statements for filtering the results of a
     * query based on a boolean expression.
     * Each provided statement generates a separate filter line in the query string.
     *
     * Note: If provided, this property overrides any value provided for the `filter` property.
     */
    public fun filterStatements(filterStatements: List<String>)

    /**
     * @param filterStatements An array of one or more statements for filtering the results of a
     * query based on a boolean expression.
     * Each provided statement generates a separate filter line in the query string.
     *
     * Note: If provided, this property overrides any value provided for the `filter` property.
     */
    public fun filterStatements(vararg filterStatements: String)

    /**
     * @param limit Specifies the number of log events returned by the query.
     */
    public fun limit(limit: Number)

    /**
     * @param parse A single statement for parsing data from a log field and creating ephemeral
     * fields that can be processed further in the query.
     * @deprecated Use `parseStatements` instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun parse(parse: String)

    /**
     * @param parseStatements An array of one or more statements for parsing data from a log field
     * and creating ephemeral fields that can be processed further in the query.
     * Each provided statement generates a separate
     * parse line in the query string.
     *
     * Note: If provided, this property overrides any value provided for the `parse` property.
     */
    public fun parseStatements(parseStatements: List<String>)

    /**
     * @param parseStatements An array of one or more statements for parsing data from a log field
     * and creating ephemeral fields that can be processed further in the query.
     * Each provided statement generates a separate
     * parse line in the query string.
     *
     * Note: If provided, this property overrides any value provided for the `parse` property.
     */
    public fun parseStatements(vararg parseStatements: String)

    /**
     * @param sort Sorts the retrieved log events.
     */
    public fun sort(sort: String)

    /**
     * @param stats Uses log field values to calculate aggregate statistics.
     */
    public fun stats(stats: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.QueryStringProps.Builder =
        software.amazon.awscdk.services.logs.QueryStringProps.builder()

    /**
     * @param display Specifies which fields to display in the query results.
     */
    override fun display(display: String) {
      cdkBuilder.display(display)
    }

    /**
     * @param fields Retrieves the specified fields from log events for display.
     */
    override fun fields(fields: List<String>) {
      cdkBuilder.fields(fields)
    }

    /**
     * @param fields Retrieves the specified fields from log events for display.
     */
    override fun fields(vararg fields: String): Unit = fields(fields.toList())

    /**
     * @param filter A single statement for filtering the results of a query based on a boolean
     * expression.
     * @deprecated Use `filterStatements` instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun filter(filter: String) {
      cdkBuilder.filter(filter)
    }

    /**
     * @param filterStatements An array of one or more statements for filtering the results of a
     * query based on a boolean expression.
     * Each provided statement generates a separate filter line in the query string.
     *
     * Note: If provided, this property overrides any value provided for the `filter` property.
     */
    override fun filterStatements(filterStatements: List<String>) {
      cdkBuilder.filterStatements(filterStatements)
    }

    /**
     * @param filterStatements An array of one or more statements for filtering the results of a
     * query based on a boolean expression.
     * Each provided statement generates a separate filter line in the query string.
     *
     * Note: If provided, this property overrides any value provided for the `filter` property.
     */
    override fun filterStatements(vararg filterStatements: String): Unit =
        filterStatements(filterStatements.toList())

    /**
     * @param limit Specifies the number of log events returned by the query.
     */
    override fun limit(limit: Number) {
      cdkBuilder.limit(limit)
    }

    /**
     * @param parse A single statement for parsing data from a log field and creating ephemeral
     * fields that can be processed further in the query.
     * @deprecated Use `parseStatements` instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun parse(parse: String) {
      cdkBuilder.parse(parse)
    }

    /**
     * @param parseStatements An array of one or more statements for parsing data from a log field
     * and creating ephemeral fields that can be processed further in the query.
     * Each provided statement generates a separate
     * parse line in the query string.
     *
     * Note: If provided, this property overrides any value provided for the `parse` property.
     */
    override fun parseStatements(parseStatements: List<String>) {
      cdkBuilder.parseStatements(parseStatements)
    }

    /**
     * @param parseStatements An array of one or more statements for parsing data from a log field
     * and creating ephemeral fields that can be processed further in the query.
     * Each provided statement generates a separate
     * parse line in the query string.
     *
     * Note: If provided, this property overrides any value provided for the `parse` property.
     */
    override fun parseStatements(vararg parseStatements: String): Unit =
        parseStatements(parseStatements.toList())

    /**
     * @param sort Sorts the retrieved log events.
     */
    override fun sort(sort: String) {
      cdkBuilder.sort(sort)
    }

    /**
     * @param stats Uses log field values to calculate aggregate statistics.
     */
    override fun stats(stats: String) {
      cdkBuilder.stats(stats)
    }

    public fun build(): software.amazon.awscdk.services.logs.QueryStringProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.QueryStringProps,
  ) : CdkObject(cdkObject),
      QueryStringProps {
    /**
     * Specifies which fields to display in the query results.
     *
     * Default: - no display in QueryString
     */
    override fun display(): String? = unwrap(this).getDisplay()

    /**
     * Retrieves the specified fields from log events for display.
     *
     * Default: - no fields in QueryString
     */
    override fun fields(): List<String> = unwrap(this).getFields() ?: emptyList()

    /**
     * (deprecated) A single statement for filtering the results of a query based on a boolean
     * expression.
     *
     * Default: - no filter in QueryString
     *
     * @deprecated Use `filterStatements` instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun filter(): String? = unwrap(this).getFilter()

    /**
     * An array of one or more statements for filtering the results of a query based on a boolean
     * expression.
     *
     * Each provided statement generates a separate filter line in the query string.
     *
     * Note: If provided, this property overrides any value provided for the `filter` property.
     *
     * Default: - no filter in QueryString
     */
    override fun filterStatements(): List<String> = unwrap(this).getFilterStatements() ?:
        emptyList()

    /**
     * Specifies the number of log events returned by the query.
     *
     * Default: - no limit in QueryString
     */
    override fun limit(): Number? = unwrap(this).getLimit()

    /**
     * (deprecated) A single statement for parsing data from a log field and creating ephemeral
     * fields that can be processed further in the query.
     *
     * Default: - no parse in QueryString
     *
     * @deprecated Use `parseStatements` instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun parse(): String? = unwrap(this).getParse()

    /**
     * An array of one or more statements for parsing data from a log field and creating ephemeral
     * fields that can be processed further in the query.
     *
     * Each provided statement generates a separate
     * parse line in the query string.
     *
     * Note: If provided, this property overrides any value provided for the `parse` property.
     *
     * Default: - no parse in QueryString
     */
    override fun parseStatements(): List<String> = unwrap(this).getParseStatements() ?: emptyList()

    /**
     * Sorts the retrieved log events.
     *
     * Default: - no sort in QueryString
     */
    override fun sort(): String? = unwrap(this).getSort()

    /**
     * Uses log field values to calculate aggregate statistics.
     *
     * Default: - no stats in QueryString
     */
    override fun stats(): String? = unwrap(this).getStats()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): QueryStringProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.QueryStringProps):
        QueryStringProps = CdkObjectWrappers.wrap(cdkObject) as? QueryStringProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueryStringProps):
        software.amazon.awscdk.services.logs.QueryStringProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.QueryStringProps
  }
}
