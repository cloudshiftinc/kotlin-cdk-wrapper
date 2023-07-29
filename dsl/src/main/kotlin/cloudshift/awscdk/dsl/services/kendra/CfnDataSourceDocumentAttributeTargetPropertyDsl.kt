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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * The target document attribute or metadata field you want to alter when ingesting documents into
 * Amazon Kendra.
 *
 * For example, you can delete customer identification numbers associated with the documents, stored
 * in the document metadata field called 'Customer_ID'. You set the target key as 'Customer_ID' and
 * the deletion flag to `TRUE` . This removes all customer ID values in the field 'Customer_ID'.
 * This would scrub personally identifiable information from each document's metadata.
 *
 * Amazon Kendra cannot create a target field if it has not already been created as an index field.
 * After you create your index field, you can create a document metadata field using
 * `DocumentAttributeTarget` . Amazon Kendra then will map your newly created metadata field to your
 * index field.
 *
 * You can also use this with
 * [DocumentAttributeCondition](https://docs.aws.amazon.com/kendra/latest/dg/API_DocumentAttributeCondition.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * DocumentAttributeTargetProperty documentAttributeTargetProperty =
 * DocumentAttributeTargetProperty.builder()
 * .targetDocumentAttributeKey("targetDocumentAttributeKey")
 * // the properties below are optional
 * .targetDocumentAttributeValue(DocumentAttributeValueProperty.builder()
 * .dateValue("dateValue")
 * .longValue(123)
 * .stringListValue(List.of("stringListValue"))
 * .stringValue("stringValue")
 * .build())
 * .targetDocumentAttributeValueDeletion(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributetarget.html)
 */
@CdkDslMarker
public class CfnDataSourceDocumentAttributeTargetPropertyDsl {
    private val cdkBuilder: CfnDataSource.DocumentAttributeTargetProperty.Builder =
        CfnDataSource.DocumentAttributeTargetProperty.builder()

    /**
     * @param targetDocumentAttributeKey The identifier of the target document attribute or metadata
     *   field. For example, 'Department' could be an identifier for the target attribute or
     *   metadata field that includes the department names associated with the documents.
     */
    public fun targetDocumentAttributeKey(targetDocumentAttributeKey: String) {
        cdkBuilder.targetDocumentAttributeKey(targetDocumentAttributeKey)
    }

    /**
     * @param targetDocumentAttributeValue The target value you want to create for the target
     *   attribute. For example, 'Finance' could be the target value for the target attribute key
     *   'Department'.
     */
    public fun targetDocumentAttributeValue(targetDocumentAttributeValue: IResolvable) {
        cdkBuilder.targetDocumentAttributeValue(targetDocumentAttributeValue)
    }

    /**
     * @param targetDocumentAttributeValue The target value you want to create for the target
     *   attribute. For example, 'Finance' could be the target value for the target attribute key
     *   'Department'.
     */
    public fun targetDocumentAttributeValue(
        targetDocumentAttributeValue: CfnDataSource.DocumentAttributeValueProperty
    ) {
        cdkBuilder.targetDocumentAttributeValue(targetDocumentAttributeValue)
    }

    /**
     * @param targetDocumentAttributeValueDeletion `TRUE` to delete the existing target value for
     *   your specified target attribute key. You cannot create a target value and set this to
     *   `TRUE` . To create a target value ( `TargetDocumentAttributeValue` ), set this to `FALSE` .
     */
    public fun targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion: Boolean) {
        cdkBuilder.targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion)
    }

    /**
     * @param targetDocumentAttributeValueDeletion `TRUE` to delete the existing target value for
     *   your specified target attribute key. You cannot create a target value and set this to
     *   `TRUE` . To create a target value ( `TargetDocumentAttributeValue` ), set this to `FALSE` .
     */
    public fun targetDocumentAttributeValueDeletion(
        targetDocumentAttributeValueDeletion: IResolvable
    ) {
        cdkBuilder.targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion)
    }

    public fun build(): CfnDataSource.DocumentAttributeTargetProperty = cdkBuilder.build()
}
