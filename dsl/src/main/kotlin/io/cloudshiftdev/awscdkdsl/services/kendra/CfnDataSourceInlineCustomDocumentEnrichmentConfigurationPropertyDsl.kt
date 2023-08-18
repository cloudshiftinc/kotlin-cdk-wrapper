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
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides the configuration information for applying basic logic to alter document metadata and
 * content when ingesting documents into Amazon Kendra.
 *
 * To apply advanced logic, to go beyond what you can do with basic logic, see
 * [HookConfiguration](https://docs.aws.amazon.com/kendra/latest/dg/API_HookConfiguration.html) .
 *
 * For more information, see
 * [Customizing document metadata during the ingestion process](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * InlineCustomDocumentEnrichmentConfigurationProperty
 * inlineCustomDocumentEnrichmentConfigurationProperty =
 * InlineCustomDocumentEnrichmentConfigurationProperty.builder()
 * .condition(DocumentAttributeConditionProperty.builder()
 * .conditionDocumentAttributeKey("conditionDocumentAttributeKey")
 * .operator("operator")
 * // the properties below are optional
 * .conditionOnValue(DocumentAttributeValueProperty.builder()
 * .dateValue("dateValue")
 * .longValue(123)
 * .stringListValue(List.of("stringListValue"))
 * .stringValue("stringValue")
 * .build())
 * .build())
 * .documentContentDeletion(false)
 * .target(DocumentAttributeTargetProperty.builder()
 * .targetDocumentAttributeKey("targetDocumentAttributeKey")
 * // the properties below are optional
 * .targetDocumentAttributeValue(DocumentAttributeValueProperty.builder()
 * .dateValue("dateValue")
 * .longValue(123)
 * .stringListValue(List.of("stringListValue"))
 * .stringValue("stringValue")
 * .build())
 * .targetDocumentAttributeValueDeletion(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-inlinecustomdocumentenrichmentconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceInlineCustomDocumentEnrichmentConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty.Builder =
        CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty.builder()

    /**
     * @param condition Configuration of the condition used for the target document attribute or
     *   metadata field when ingesting documents into Amazon Kendra.
     */
    public fun condition(condition: IResolvable) {
        cdkBuilder.condition(condition)
    }

    /**
     * @param condition Configuration of the condition used for the target document attribute or
     *   metadata field when ingesting documents into Amazon Kendra.
     */
    public fun condition(condition: CfnDataSource.DocumentAttributeConditionProperty) {
        cdkBuilder.condition(condition)
    }

    /**
     * @param documentContentDeletion `TRUE` to delete content if the condition used for the target
     *   attribute is met.
     */
    public fun documentContentDeletion(documentContentDeletion: Boolean) {
        cdkBuilder.documentContentDeletion(documentContentDeletion)
    }

    /**
     * @param documentContentDeletion `TRUE` to delete content if the condition used for the target
     *   attribute is met.
     */
    public fun documentContentDeletion(documentContentDeletion: IResolvable) {
        cdkBuilder.documentContentDeletion(documentContentDeletion)
    }

    /**
     * @param target Configuration of the target document attribute or metadata field when ingesting
     *   documents into Amazon Kendra. You can also include a value.
     */
    public fun target(target: IResolvable) {
        cdkBuilder.target(target)
    }

    /**
     * @param target Configuration of the target document attribute or metadata field when ingesting
     *   documents into Amazon Kendra. You can also include a value.
     */
    public fun target(target: CfnDataSource.DocumentAttributeTargetProperty) {
        cdkBuilder.target(target)
    }

    public fun build(): CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty =
        cdkBuilder.build()
}
