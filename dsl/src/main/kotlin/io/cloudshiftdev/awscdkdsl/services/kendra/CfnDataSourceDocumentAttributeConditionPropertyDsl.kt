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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * The condition used for the target document attribute or metadata field when ingesting documents
 * into Amazon Kendra.
 *
 * You use this with
 * [DocumentAttributeTarget to apply the condition](https://docs.aws.amazon.com/kendra/latest/dg/API_DocumentAttributeTarget.html)
 * .
 *
 * For example, you can create the 'Department' target field and have it prefill department names
 * associated with the documents based on information in the 'Source_URI' field. Set the condition
 * that if the 'Source_URI' field contains 'financial' in its URI value, then prefill the target
 * field 'Department' with the target value 'Finance' for the document.
 *
 * Amazon Kendra cannot create a target field if it has not already been created as an index field.
 * After you create your index field, you can create a document metadata field using
 * `DocumentAttributeTarget` . Amazon Kendra then will map your newly created metadata field to your
 * index field.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * DocumentAttributeConditionProperty documentAttributeConditionProperty =
 * DocumentAttributeConditionProperty.builder()
 * .conditionDocumentAttributeKey("conditionDocumentAttributeKey")
 * .operator("operator")
 * // the properties below are optional
 * .conditionOnValue(DocumentAttributeValueProperty.builder()
 * .dateValue("dateValue")
 * .longValue(123)
 * .stringListValue(List.of("stringListValue"))
 * .stringValue("stringValue")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributecondition.html)
 */
@CdkDslMarker
public class CfnDataSourceDocumentAttributeConditionPropertyDsl {
    private val cdkBuilder: CfnDataSource.DocumentAttributeConditionProperty.Builder =
        CfnDataSource.DocumentAttributeConditionProperty.builder()

    /**
     * @param conditionDocumentAttributeKey The identifier of the document attribute used for the
     *   condition. For example, 'Source_URI' could be an identifier for the attribute or metadata
     *   field that contains source URIs associated with the documents.
     *
     * Amazon Kendra currently does not support `_document_body` as an attribute key used for the
     * condition.
     */
    public fun conditionDocumentAttributeKey(conditionDocumentAttributeKey: String) {
        cdkBuilder.conditionDocumentAttributeKey(conditionDocumentAttributeKey)
    }

    /**
     * @param conditionOnValue The value used by the operator. For example, you can specify the
     *   value 'financial' for strings in the 'Source_URI' field that partially match or contain
     *   this value.
     */
    public fun conditionOnValue(conditionOnValue: IResolvable) {
        cdkBuilder.conditionOnValue(conditionOnValue)
    }

    /**
     * @param conditionOnValue The value used by the operator. For example, you can specify the
     *   value 'financial' for strings in the 'Source_URI' field that partially match or contain
     *   this value.
     */
    public fun conditionOnValue(conditionOnValue: CfnDataSource.DocumentAttributeValueProperty) {
        cdkBuilder.conditionOnValue(conditionOnValue)
    }

    /**
     * @param operator The condition operator. For example, you can use 'Contains' to partially
     *   match a string.
     */
    public fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
    }

    public fun build(): CfnDataSource.DocumentAttributeConditionProperty = cdkBuilder.build()
}
