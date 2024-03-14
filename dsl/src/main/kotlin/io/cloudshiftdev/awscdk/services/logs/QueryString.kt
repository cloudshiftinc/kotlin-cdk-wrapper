package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class QueryString internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.QueryString,
) : CdkObject(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.QueryString].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies which fields to display in the query results.
     *
     * Default: - no display in QueryString
     *
     * @param display Specifies which fields to display in the query results. 
     */
    public fun display(display: String)

    /**
     * Retrieves the specified fields from log events for display.
     *
     * Default: - no fields in QueryString
     *
     * @param fields Retrieves the specified fields from log events for display. 
     */
    public fun fields(fields: List<String>)

    /**
     * Retrieves the specified fields from log events for display.
     *
     * Default: - no fields in QueryString
     *
     * @param fields Retrieves the specified fields from log events for display. 
     */
    public fun fields(vararg fields: String)

    /**
     * (deprecated) A single statement for filtering the results of a query based on a boolean
     * expression.
     *
     * Default: - no filter in QueryString
     *
     * @deprecated Use `filterStatements` instead
     * @param filter A single statement for filtering the results of a query based on a boolean
     * expression. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun filter(filter: String)

    /**
     * An array of one or more statements for filtering the results of a query based on a boolean
     * expression.
     *
     * Each provided statement generates a separate filter line in the query string.
     *
     * Note: If provided, this property overrides any value provided for the `filter` property.
     *
     * Default: - no filter in QueryString
     *
     * @param filterStatements An array of one or more statements for filtering the results of a
     * query based on a boolean expression. 
     */
    public fun filterStatements(filterStatements: List<String>)

    /**
     * An array of one or more statements for filtering the results of a query based on a boolean
     * expression.
     *
     * Each provided statement generates a separate filter line in the query string.
     *
     * Note: If provided, this property overrides any value provided for the `filter` property.
     *
     * Default: - no filter in QueryString
     *
     * @param filterStatements An array of one or more statements for filtering the results of a
     * query based on a boolean expression. 
     */
    public fun filterStatements(vararg filterStatements: String)

    /**
     * Specifies the number of log events returned by the query.
     *
     * Default: - no limit in QueryString
     *
     * @param limit Specifies the number of log events returned by the query. 
     */
    public fun limit(limit: Number)

    /**
     * (deprecated) A single statement for parsing data from a log field and creating ephemeral
     * fields that can be processed further in the query.
     *
     * Default: - no parse in QueryString
     *
     * @deprecated Use `parseStatements` instead
     * @param parse A single statement for parsing data from a log field and creating ephemeral
     * fields that can be processed further in the query. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun parse(parse: String)

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
     *
     * @param parseStatements An array of one or more statements for parsing data from a log field
     * and creating ephemeral fields that can be processed further in the query. 
     */
    public fun parseStatements(parseStatements: List<String>)

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
     *
     * @param parseStatements An array of one or more statements for parsing data from a log field
     * and creating ephemeral fields that can be processed further in the query. 
     */
    public fun parseStatements(vararg parseStatements: String)

    /**
     * Sorts the retrieved log events.
     *
     * Default: - no sort in QueryString
     *
     * @param sort Sorts the retrieved log events. 
     */
    public fun sort(sort: String)

    /**
     * Uses log field values to calculate aggregate statistics.
     *
     * Default: - no stats in QueryString
     *
     * @param stats Uses log field values to calculate aggregate statistics. 
     */
    public fun stats(stats: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.QueryString.Builder =
        software.amazon.awscdk.services.logs.QueryString.Builder.create()

    /**
     * Specifies which fields to display in the query results.
     *
     * Default: - no display in QueryString
     *
     * @param display Specifies which fields to display in the query results. 
     */
    override fun display(display: String) {
      cdkBuilder.display(display)
    }

    /**
     * Retrieves the specified fields from log events for display.
     *
     * Default: - no fields in QueryString
     *
     * @param fields Retrieves the specified fields from log events for display. 
     */
    override fun fields(fields: List<String>) {
      cdkBuilder.fields(fields)
    }

    /**
     * Retrieves the specified fields from log events for display.
     *
     * Default: - no fields in QueryString
     *
     * @param fields Retrieves the specified fields from log events for display. 
     */
    override fun fields(vararg fields: String): Unit = fields(fields.toList())

    /**
     * (deprecated) A single statement for filtering the results of a query based on a boolean
     * expression.
     *
     * Default: - no filter in QueryString
     *
     * @deprecated Use `filterStatements` instead
     * @param filter A single statement for filtering the results of a query based on a boolean
     * expression. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun filter(filter: String) {
      cdkBuilder.filter(filter)
    }

    /**
     * An array of one or more statements for filtering the results of a query based on a boolean
     * expression.
     *
     * Each provided statement generates a separate filter line in the query string.
     *
     * Note: If provided, this property overrides any value provided for the `filter` property.
     *
     * Default: - no filter in QueryString
     *
     * @param filterStatements An array of one or more statements for filtering the results of a
     * query based on a boolean expression. 
     */
    override fun filterStatements(filterStatements: List<String>) {
      cdkBuilder.filterStatements(filterStatements)
    }

    /**
     * An array of one or more statements for filtering the results of a query based on a boolean
     * expression.
     *
     * Each provided statement generates a separate filter line in the query string.
     *
     * Note: If provided, this property overrides any value provided for the `filter` property.
     *
     * Default: - no filter in QueryString
     *
     * @param filterStatements An array of one or more statements for filtering the results of a
     * query based on a boolean expression. 
     */
    override fun filterStatements(vararg filterStatements: String): Unit =
        filterStatements(filterStatements.toList())

    /**
     * Specifies the number of log events returned by the query.
     *
     * Default: - no limit in QueryString
     *
     * @param limit Specifies the number of log events returned by the query. 
     */
    override fun limit(limit: Number) {
      cdkBuilder.limit(limit)
    }

    /**
     * (deprecated) A single statement for parsing data from a log field and creating ephemeral
     * fields that can be processed further in the query.
     *
     * Default: - no parse in QueryString
     *
     * @deprecated Use `parseStatements` instead
     * @param parse A single statement for parsing data from a log field and creating ephemeral
     * fields that can be processed further in the query. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun parse(parse: String) {
      cdkBuilder.parse(parse)
    }

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
     *
     * @param parseStatements An array of one or more statements for parsing data from a log field
     * and creating ephemeral fields that can be processed further in the query. 
     */
    override fun parseStatements(parseStatements: List<String>) {
      cdkBuilder.parseStatements(parseStatements)
    }

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
     *
     * @param parseStatements An array of one or more statements for parsing data from a log field
     * and creating ephemeral fields that can be processed further in the query. 
     */
    override fun parseStatements(vararg parseStatements: String): Unit =
        parseStatements(parseStatements.toList())

    /**
     * Sorts the retrieved log events.
     *
     * Default: - no sort in QueryString
     *
     * @param sort Sorts the retrieved log events. 
     */
    override fun sort(sort: String) {
      cdkBuilder.sort(sort)
    }

    /**
     * Uses log field values to calculate aggregate statistics.
     *
     * Default: - no stats in QueryString
     *
     * @param stats Uses log field values to calculate aggregate statistics. 
     */
    override fun stats(stats: String) {
      cdkBuilder.stats(stats)
    }

    public fun build(): software.amazon.awscdk.services.logs.QueryString = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): QueryString {
      val builderImpl = BuilderImpl()
      return QueryString(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.QueryString): QueryString =
        QueryString(cdkObject)

    internal fun unwrap(wrapped: QueryString): software.amazon.awscdk.services.logs.QueryString =
        wrapped.cdkObject
  }
}
