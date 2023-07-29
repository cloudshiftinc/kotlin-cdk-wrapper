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

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Configuration information for indexing Confluence spaces.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * ConfluenceSpaceConfigurationProperty confluenceSpaceConfigurationProperty =
 * ConfluenceSpaceConfigurationProperty.builder()
 * .crawlArchivedSpaces(false)
 * .crawlPersonalSpaces(false)
 * .excludeSpaces(List.of("excludeSpaces"))
 * .includeSpaces(List.of("includeSpaces"))
 * .spaceFieldMappings(List.of(ConfluenceSpaceToIndexFieldMappingProperty.builder()
 * .dataSourceFieldName("dataSourceFieldName")
 * .indexFieldName("indexFieldName")
 * // the properties below are optional
 * .dateFieldFormat("dateFieldFormat")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencespaceconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceConfluenceSpaceConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.ConfluenceSpaceConfigurationProperty.Builder =
        CfnDataSource.ConfluenceSpaceConfigurationProperty.builder()

    private val _excludeSpaces: MutableList<String> = mutableListOf()

    private val _includeSpaces: MutableList<String> = mutableListOf()

    private val _spaceFieldMappings: MutableList<Any> = mutableListOf()

    /** @param crawlArchivedSpaces `TRUE` to index archived spaces. */
    public fun crawlArchivedSpaces(crawlArchivedSpaces: Boolean) {
        cdkBuilder.crawlArchivedSpaces(crawlArchivedSpaces)
    }

    /** @param crawlArchivedSpaces `TRUE` to index archived spaces. */
    public fun crawlArchivedSpaces(crawlArchivedSpaces: IResolvable) {
        cdkBuilder.crawlArchivedSpaces(crawlArchivedSpaces)
    }

    /**
     * @param crawlPersonalSpaces `TRUE` to index personal spaces. You can add restrictions to items
     *   in personal spaces. If personal spaces are indexed, queries without user context
     *   information may return restricted items from a personal space in their results. For more
     *   information, see
     *   [Filtering on user context](https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html)
     *   .
     */
    public fun crawlPersonalSpaces(crawlPersonalSpaces: Boolean) {
        cdkBuilder.crawlPersonalSpaces(crawlPersonalSpaces)
    }

    /**
     * @param crawlPersonalSpaces `TRUE` to index personal spaces. You can add restrictions to items
     *   in personal spaces. If personal spaces are indexed, queries without user context
     *   information may return restricted items from a personal space in their results. For more
     *   information, see
     *   [Filtering on user context](https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html)
     *   .
     */
    public fun crawlPersonalSpaces(crawlPersonalSpaces: IResolvable) {
        cdkBuilder.crawlPersonalSpaces(crawlPersonalSpaces)
    }

    /**
     * @param excludeSpaces A list of space keys of Confluence spaces. If you include a key, the
     *   blogs, documents, and attachments in the space are not indexed. If a space is in both the
     *   `ExcludeSpaces` and the `IncludeSpaces` list, the space is excluded.
     */
    public fun excludeSpaces(vararg excludeSpaces: String) {
        _excludeSpaces.addAll(listOf(*excludeSpaces))
    }

    /**
     * @param excludeSpaces A list of space keys of Confluence spaces. If you include a key, the
     *   blogs, documents, and attachments in the space are not indexed. If a space is in both the
     *   `ExcludeSpaces` and the `IncludeSpaces` list, the space is excluded.
     */
    public fun excludeSpaces(excludeSpaces: Collection<String>) {
        _excludeSpaces.addAll(excludeSpaces)
    }

    /**
     * @param includeSpaces A list of space keys for Confluence spaces. If you include a key, the
     *   blogs, documents, and attachments in the space are indexed. Spaces that aren't in the list
     *   aren't indexed. A space in the list must exist. Otherwise, Amazon Kendra logs an error when
     *   the data source is synchronized. If a space is in both the `IncludeSpaces` and the
     *   `ExcludeSpaces` list, the space is excluded.
     */
    public fun includeSpaces(vararg includeSpaces: String) {
        _includeSpaces.addAll(listOf(*includeSpaces))
    }

    /**
     * @param includeSpaces A list of space keys for Confluence spaces. If you include a key, the
     *   blogs, documents, and attachments in the space are indexed. Spaces that aren't in the list
     *   aren't indexed. A space in the list must exist. Otherwise, Amazon Kendra logs an error when
     *   the data source is synchronized. If a space is in both the `IncludeSpaces` and the
     *   `ExcludeSpaces` list, the space is excluded.
     */
    public fun includeSpaces(includeSpaces: Collection<String>) {
        _includeSpaces.addAll(includeSpaces)
    }

    /**
     * @param spaceFieldMappings Maps attributes or field names of Confluence spaces to Amazon
     *   Kendra index field names. To create custom fields, use the `UpdateIndex` API before you map
     *   to Confluence fields. For more information, see
     *   [Mapping data source fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     *   . The Confluence data source field names must exist in your Confluence custom metadata.
     *
     * If you specify the `SpaceFieldMappings` parameter, you must specify at least one field
     * mapping.
     */
    public fun spaceFieldMappings(vararg spaceFieldMappings: Any) {
        _spaceFieldMappings.addAll(listOf(*spaceFieldMappings))
    }

    /**
     * @param spaceFieldMappings Maps attributes or field names of Confluence spaces to Amazon
     *   Kendra index field names. To create custom fields, use the `UpdateIndex` API before you map
     *   to Confluence fields. For more information, see
     *   [Mapping data source fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     *   . The Confluence data source field names must exist in your Confluence custom metadata.
     *
     * If you specify the `SpaceFieldMappings` parameter, you must specify at least one field
     * mapping.
     */
    public fun spaceFieldMappings(spaceFieldMappings: Collection<Any>) {
        _spaceFieldMappings.addAll(spaceFieldMappings)
    }

    /**
     * @param spaceFieldMappings Maps attributes or field names of Confluence spaces to Amazon
     *   Kendra index field names. To create custom fields, use the `UpdateIndex` API before you map
     *   to Confluence fields. For more information, see
     *   [Mapping data source fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     *   . The Confluence data source field names must exist in your Confluence custom metadata.
     *
     * If you specify the `SpaceFieldMappings` parameter, you must specify at least one field
     * mapping.
     */
    public fun spaceFieldMappings(spaceFieldMappings: IResolvable) {
        cdkBuilder.spaceFieldMappings(spaceFieldMappings)
    }

    public fun build(): CfnDataSource.ConfluenceSpaceConfigurationProperty {
        if (_excludeSpaces.isNotEmpty()) cdkBuilder.excludeSpaces(_excludeSpaces)
        if (_includeSpaces.isNotEmpty()) cdkBuilder.includeSpaces(_includeSpaces)
        if (_spaceFieldMappings.isNotEmpty()) cdkBuilder.spaceFieldMappings(_spaceFieldMappings)
        return cdkBuilder.build()
    }
}
