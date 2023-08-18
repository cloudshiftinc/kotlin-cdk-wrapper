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
 * Provides the configuration information for invoking a Lambda function in AWS Lambda to alter
 * document metadata and content when ingesting documents into Amazon Kendra.
 *
 * You can configure your Lambda function using
 * [PreExtractionHookConfiguration](https://docs.aws.amazon.com/kendra/latest/dg/API_CustomDocumentEnrichmentConfiguration.html)
 * if you want to apply advanced alterations on the original or raw documents. If you want to apply
 * advanced alterations on the Amazon Kendra structured documents, you must configure your Lambda
 * function using
 * [PostExtractionHookConfiguration](https://docs.aws.amazon.com/kendra/latest/dg/API_CustomDocumentEnrichmentConfiguration.html)
 * . You can only invoke one Lambda function. However, this function can invoke other functions it
 * requires.
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
 * HookConfigurationProperty hookConfigurationProperty = HookConfigurationProperty.builder()
 * .lambdaArn("lambdaArn")
 * .s3Bucket("s3Bucket")
 * // the properties below are optional
 * .invocationCondition(DocumentAttributeConditionProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-hookconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceHookConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.HookConfigurationProperty.Builder =
        CfnDataSource.HookConfigurationProperty.builder()

    /**
     * @param invocationCondition The condition used for when a Lambda function should be invoked.
     *   For example, you can specify a condition that if there are empty date-time values, then
     *   Amazon Kendra should invoke a function that inserts the current date-time.
     */
    public fun invocationCondition(invocationCondition: IResolvable) {
        cdkBuilder.invocationCondition(invocationCondition)
    }

    /**
     * @param invocationCondition The condition used for when a Lambda function should be invoked.
     *   For example, you can specify a condition that if there are empty date-time values, then
     *   Amazon Kendra should invoke a function that inserts the current date-time.
     */
    public fun invocationCondition(
        invocationCondition: CfnDataSource.DocumentAttributeConditionProperty
    ) {
        cdkBuilder.invocationCondition(invocationCondition)
    }

    /**
     * @param lambdaArn The Amazon Resource Name (ARN) of a role with permission to run a Lambda
     *   function during ingestion. For more information, see
     *   [IAM roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html)
     *   .
     */
    public fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
    }

    /**
     * @param s3Bucket Stores the original, raw documents or the structured, parsed documents before
     *   and after altering them. For more information, see
     *   [Data contracts for Lambda functions](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#cde-data-contracts-lambda)
     *   .
     */
    public fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    public fun build(): CfnDataSource.HookConfigurationProperty = cdkBuilder.build()
}
