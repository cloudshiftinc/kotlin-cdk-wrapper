@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataSourceServiceNowServiceCatalogConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.ServiceNowServiceCatalogConfigurationProperty.Builder =
        CfnDataSource.ServiceNowServiceCatalogConfigurationProperty.builder()

    private val _excludeAttachmentFilePatterns: MutableList<String> = mutableListOf()

    private val _fieldMappings: MutableList<Any> = mutableListOf()

    private val _includeAttachmentFilePatterns: MutableList<String> = mutableListOf()

    public fun crawlAttachments(crawlAttachments: Boolean) {
        cdkBuilder.crawlAttachments(crawlAttachments)
    }

    public fun crawlAttachments(crawlAttachments: IResolvable) {
        cdkBuilder.crawlAttachments(crawlAttachments)
    }

    public fun documentDataFieldName(documentDataFieldName: String) {
        cdkBuilder.documentDataFieldName(documentDataFieldName)
    }

    public fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
    }

    public fun excludeAttachmentFilePatterns(vararg excludeAttachmentFilePatterns: String) {
        _excludeAttachmentFilePatterns.addAll(listOf(*excludeAttachmentFilePatterns))
    }

    public fun excludeAttachmentFilePatterns(excludeAttachmentFilePatterns: Collection<String>) {
        _excludeAttachmentFilePatterns.addAll(excludeAttachmentFilePatterns)
    }

    public fun fieldMappings(vararg fieldMappings: Any) {
        _fieldMappings.addAll(listOf(*fieldMappings))
    }

    public fun fieldMappings(fieldMappings: Collection<Any>) {
        _fieldMappings.addAll(fieldMappings)
    }

    public fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings)
    }

    public fun includeAttachmentFilePatterns(vararg includeAttachmentFilePatterns: String) {
        _includeAttachmentFilePatterns.addAll(listOf(*includeAttachmentFilePatterns))
    }

    public fun includeAttachmentFilePatterns(includeAttachmentFilePatterns: Collection<String>) {
        _includeAttachmentFilePatterns.addAll(includeAttachmentFilePatterns)
    }

    public fun build(): CfnDataSource.ServiceNowServiceCatalogConfigurationProperty {
        if (_excludeAttachmentFilePatterns.isNotEmpty()) {
            cdkBuilder.excludeAttachmentFilePatterns(_excludeAttachmentFilePatterns)
        }
        if (_fieldMappings.isNotEmpty()) cdkBuilder.fieldMappings(_fieldMappings)
        if (_includeAttachmentFilePatterns.isNotEmpty()) {
            cdkBuilder.includeAttachmentFilePatterns(_includeAttachmentFilePatterns)
        }
        return cdkBuilder.build()
    }
}
