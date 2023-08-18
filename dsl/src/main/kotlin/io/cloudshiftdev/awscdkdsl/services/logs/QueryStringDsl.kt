@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.logs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.logs.QueryString

/**
 * Define a QueryString.
 *
 * Example:
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
@CdkDslMarker
public class QueryStringDsl {
    private val cdkBuilder: QueryString.Builder = QueryString.Builder.create()

    private val _fields: MutableList<String> = mutableListOf()

    private val _filterStatements: MutableList<String> = mutableListOf()

    private val _parseStatements: MutableList<String> = mutableListOf()

    /**
     * Specifies which fields to display in the query results.
     *
     * Default: - no display in QueryString
     *
     * @param display Specifies which fields to display in the query results.
     */
    public fun display(display: String) {
        cdkBuilder.display(display)
    }

    /**
     * Retrieves the specified fields from log events for display.
     *
     * Default: - no fields in QueryString
     *
     * @param fields Retrieves the specified fields from log events for display.
     */
    public fun fields(vararg fields: String) {
        _fields.addAll(listOf(*fields))
    }

    /**
     * Retrieves the specified fields from log events for display.
     *
     * Default: - no fields in QueryString
     *
     * @param fields Retrieves the specified fields from log events for display.
     */
    public fun fields(fields: Collection<String>) {
        _fields.addAll(fields)
    }

    /**
     * (deprecated) A single statement for filtering the results of a query based on a boolean
     * expression.
     *
     * Default: - no filter in QueryString
     *
     * @param filter A single statement for filtering the results of a query based on a boolean
     *   expression.
     * @deprecated Use `filterStatements` instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun filter(filter: String) {
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
     *   query based on a boolean expression.
     */
    public fun filterStatements(vararg filterStatements: String) {
        _filterStatements.addAll(listOf(*filterStatements))
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
     *   query based on a boolean expression.
     */
    public fun filterStatements(filterStatements: Collection<String>) {
        _filterStatements.addAll(filterStatements)
    }

    /**
     * Specifies the number of log events returned by the query.
     *
     * Default: - no limit in QueryString
     *
     * @param limit Specifies the number of log events returned by the query.
     */
    public fun limit(limit: Number) {
        cdkBuilder.limit(limit)
    }

    /**
     * (deprecated) A single statement for parsing data from a log field and creating ephemeral
     * fields that can be processed further in the query.
     *
     * Default: - no parse in QueryString
     *
     * @param parse A single statement for parsing data from a log field and creating ephemeral
     *   fields that can be processed further in the query.
     * @deprecated Use `parseStatements` instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun parse(parse: String) {
        cdkBuilder.parse(parse)
    }

    /**
     * An array of one or more statements for parsing data from a log field and creating ephemeral
     * fields that can be processed further in the query.
     *
     * Each provided statement generates a separate parse line in the query string.
     *
     * Note: If provided, this property overrides any value provided for the `parse` property.
     *
     * Default: - no parse in QueryString
     *
     * @param parseStatements An array of one or more statements for parsing data from a log field
     *   and creating ephemeral fields that can be processed further in the query.
     */
    public fun parseStatements(vararg parseStatements: String) {
        _parseStatements.addAll(listOf(*parseStatements))
    }

    /**
     * An array of one or more statements for parsing data from a log field and creating ephemeral
     * fields that can be processed further in the query.
     *
     * Each provided statement generates a separate parse line in the query string.
     *
     * Note: If provided, this property overrides any value provided for the `parse` property.
     *
     * Default: - no parse in QueryString
     *
     * @param parseStatements An array of one or more statements for parsing data from a log field
     *   and creating ephemeral fields that can be processed further in the query.
     */
    public fun parseStatements(parseStatements: Collection<String>) {
        _parseStatements.addAll(parseStatements)
    }

    /**
     * Sorts the retrieved log events.
     *
     * Default: - no sort in QueryString
     *
     * @param sort Sorts the retrieved log events.
     */
    public fun sort(sort: String) {
        cdkBuilder.sort(sort)
    }

    /**
     * Uses log field values to calculate aggregate statistics.
     *
     * Default: - no stats in QueryString
     *
     * @param stats Uses log field values to calculate aggregate statistics.
     */
    public fun stats(stats: String) {
        cdkBuilder.stats(stats)
    }

    public fun build(): QueryString {
        if (_fields.isNotEmpty()) cdkBuilder.fields(_fields)
        if (_filterStatements.isNotEmpty()) cdkBuilder.filterStatements(_filterStatements)
        if (_parseStatements.isNotEmpty()) cdkBuilder.parseStatements(_parseStatements)
        return cdkBuilder.build()
    }
}
