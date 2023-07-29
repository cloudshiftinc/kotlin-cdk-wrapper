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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * The configuration information for syncing a Salesforce chatter feed.
 *
 * The contents of the object comes from the Salesforce FeedItem table.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * SalesforceChatterFeedConfigurationProperty salesforceChatterFeedConfigurationProperty =
 * SalesforceChatterFeedConfigurationProperty.builder()
 * .documentDataFieldName("documentDataFieldName")
 * // the properties below are optional
 * .documentTitleFieldName("documentTitleFieldName")
 * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
 * .dataSourceFieldName("dataSourceFieldName")
 * .indexFieldName("indexFieldName")
 * // the properties below are optional
 * .dateFieldFormat("dateFieldFormat")
 * .build()))
 * .includeFilterTypes(List.of("includeFilterTypes"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcechatterfeedconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceSalesforceChatterFeedConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.SalesforceChatterFeedConfigurationProperty.Builder =
        CfnDataSource.SalesforceChatterFeedConfigurationProperty.builder()

    private val _fieldMappings: MutableList<Any> = mutableListOf()

    private val _includeFilterTypes: MutableList<String> = mutableListOf()

    /**
     * @param documentDataFieldName The name of the column in the Salesforce FeedItem table that
     *   contains the content to index. Typically this is the `Body` column.
     */
    public fun documentDataFieldName(documentDataFieldName: String) {
        cdkBuilder.documentDataFieldName(documentDataFieldName)
    }

    /**
     * @param documentTitleFieldName The name of the column in the Salesforce FeedItem table that
     *   contains the title of the document. This is typically the `Title` column.
     */
    public fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
    }

    /**
     * @param fieldMappings Maps fields from a Salesforce chatter feed into Amazon Kendra index
     *   fields.
     */
    public fun fieldMappings(vararg fieldMappings: Any) {
        _fieldMappings.addAll(listOf(*fieldMappings))
    }

    /**
     * @param fieldMappings Maps fields from a Salesforce chatter feed into Amazon Kendra index
     *   fields.
     */
    public fun fieldMappings(fieldMappings: Collection<Any>) {
        _fieldMappings.addAll(fieldMappings)
    }

    /**
     * @param fieldMappings Maps fields from a Salesforce chatter feed into Amazon Kendra index
     *   fields.
     */
    public fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings)
    }

    /**
     * @param includeFilterTypes Filters the documents in the feed based on status of the user. When
     *   you specify `ACTIVE_USERS` only documents from users who have an active account are
     *   indexed. When you specify `STANDARD_USER` only documents for Salesforce standard users are
     *   documented. You can specify both.
     */
    public fun includeFilterTypes(vararg includeFilterTypes: String) {
        _includeFilterTypes.addAll(listOf(*includeFilterTypes))
    }

    /**
     * @param includeFilterTypes Filters the documents in the feed based on status of the user. When
     *   you specify `ACTIVE_USERS` only documents from users who have an active account are
     *   indexed. When you specify `STANDARD_USER` only documents for Salesforce standard users are
     *   documented. You can specify both.
     */
    public fun includeFilterTypes(includeFilterTypes: Collection<String>) {
        _includeFilterTypes.addAll(includeFilterTypes)
    }

    public fun build(): CfnDataSource.SalesforceChatterFeedConfigurationProperty {
        if (_fieldMappings.isNotEmpty()) cdkBuilder.fieldMappings(_fieldMappings)
        if (_includeFilterTypes.isNotEmpty()) cdkBuilder.includeFilterTypes(_includeFilterTypes)
        return cdkBuilder.build()
    }
}
