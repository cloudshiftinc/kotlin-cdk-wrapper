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

package io.cloudshiftdev.awscdkdsl.services.kendra

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Maps attributes or field names of Confluence attachments to Amazon Kendra index field names.
 *
 * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For more
 * information, see
 * [Mapping data source fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) .
 * The Confuence data source field names must exist in your Confluence custom metadata.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * ConfluenceAttachmentToIndexFieldMappingProperty confluenceAttachmentToIndexFieldMappingProperty =
 * ConfluenceAttachmentToIndexFieldMappingProperty.builder()
 * .dataSourceFieldName("dataSourceFieldName")
 * .indexFieldName("indexFieldName")
 * // the properties below are optional
 * .dateFieldFormat("dateFieldFormat")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceattachmenttoindexfieldmapping.html)
 */
@CdkDslMarker
public class CfnDataSourceConfluenceAttachmentToIndexFieldMappingPropertyDsl {
    private val cdkBuilder: CfnDataSource.ConfluenceAttachmentToIndexFieldMappingProperty.Builder =
        CfnDataSource.ConfluenceAttachmentToIndexFieldMappingProperty.builder()

    /**
     * @param dataSourceFieldName The name of the field in the data source. You must first create
     *   the index field using the `UpdateIndex` API.
     */
    public fun dataSourceFieldName(dataSourceFieldName: String) {
        cdkBuilder.dataSourceFieldName(dataSourceFieldName)
    }

    /**
     * @param dateFieldFormat The format for date fields in the data source. If the field specified
     *   in `DataSourceFieldName` is a date field you must specify the date format. If the field is
     *   not a date field, an exception is thrown.
     */
    public fun dateFieldFormat(dateFieldFormat: String) {
        cdkBuilder.dateFieldFormat(dateFieldFormat)
    }

    /**
     * @param indexFieldName The name of the index field to map to the Confluence data source field.
     *   The index field type must match the Confluence field type.
     */
    public fun indexFieldName(indexFieldName: String) {
        cdkBuilder.indexFieldName(indexFieldName)
    }

    public fun build(): CfnDataSource.ConfluenceAttachmentToIndexFieldMappingProperty =
        cdkBuilder.build()
}
