@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides the configuration information for altering document metadata and content during the
 * document ingestion process.
 *
 * For more information, see [Customizing document metadata during the ingestion
 * process](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * CustomDocumentEnrichmentConfigurationProperty customDocumentEnrichmentConfigurationProperty =
 * CustomDocumentEnrichmentConfigurationProperty.builder()
 * .inlineConfigurations(List.of(InlineCustomDocumentEnrichmentConfigurationProperty.builder()
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
 * .build()))
 * .postExtractionHookConfiguration(HookConfigurationProperty.builder()
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
 * .build())
 * .preExtractionHookConfiguration(HookConfigurationProperty.builder()
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
 * .build())
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-customdocumentenrichmentconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceCustomDocumentEnrichmentConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.CustomDocumentEnrichmentConfigurationProperty.Builder =
      CfnDataSource.CustomDocumentEnrichmentConfigurationProperty.builder()

  private val _inlineConfigurations: MutableList<Any> = mutableListOf()

  /**
   * @param inlineConfigurations Configuration information to alter document attributes or metadata
   * fields and content when ingesting documents into Amazon Kendra.
   */
  public fun inlineConfigurations(vararg inlineConfigurations: Any) {
    _inlineConfigurations.addAll(listOf(*inlineConfigurations))
  }

  /**
   * @param inlineConfigurations Configuration information to alter document attributes or metadata
   * fields and content when ingesting documents into Amazon Kendra.
   */
  public fun inlineConfigurations(inlineConfigurations: Collection<Any>) {
    _inlineConfigurations.addAll(inlineConfigurations)
  }

  /**
   * @param inlineConfigurations Configuration information to alter document attributes or metadata
   * fields and content when ingesting documents into Amazon Kendra.
   */
  public fun inlineConfigurations(inlineConfigurations: IResolvable) {
    cdkBuilder.inlineConfigurations(inlineConfigurations)
  }

  /**
   * @param postExtractionHookConfiguration Configuration information for invoking a Lambda function
   * in AWS Lambda on the structured documents with their metadata and text extracted.
   * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
   * document metadata and content. For more information, see [Advanced data
   * manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation)
   * .
   */
  public fun postExtractionHookConfiguration(postExtractionHookConfiguration: IResolvable) {
    cdkBuilder.postExtractionHookConfiguration(postExtractionHookConfiguration)
  }

  /**
   * @param postExtractionHookConfiguration Configuration information for invoking a Lambda function
   * in AWS Lambda on the structured documents with their metadata and text extracted.
   * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
   * document metadata and content. For more information, see [Advanced data
   * manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation)
   * .
   */
  public
      fun postExtractionHookConfiguration(postExtractionHookConfiguration: CfnDataSource.HookConfigurationProperty) {
    cdkBuilder.postExtractionHookConfiguration(postExtractionHookConfiguration)
  }

  /**
   * @param preExtractionHookConfiguration Configuration information for invoking a Lambda function
   * in AWS Lambda on the original or raw documents before extracting their metadata and text.
   * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
   * document metadata and content. For more information, see [Advanced data
   * manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation)
   * .
   */
  public fun preExtractionHookConfiguration(preExtractionHookConfiguration: IResolvable) {
    cdkBuilder.preExtractionHookConfiguration(preExtractionHookConfiguration)
  }

  /**
   * @param preExtractionHookConfiguration Configuration information for invoking a Lambda function
   * in AWS Lambda on the original or raw documents before extracting their metadata and text.
   * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
   * document metadata and content. For more information, see [Advanced data
   * manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation)
   * .
   */
  public
      fun preExtractionHookConfiguration(preExtractionHookConfiguration: CfnDataSource.HookConfigurationProperty) {
    cdkBuilder.preExtractionHookConfiguration(preExtractionHookConfiguration)
  }

  /**
   * @param roleArn The Amazon Resource Name (ARN) of a role with permission to run
   * `PreExtractionHookConfiguration` and `PostExtractionHookConfiguration` for altering document
   * metadata and content during the document ingestion process.
   * For more information, see [IAM roles for Amazon
   * Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html) .
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnDataSource.CustomDocumentEnrichmentConfigurationProperty {
    if(_inlineConfigurations.isNotEmpty()) cdkBuilder.inlineConfigurations(_inlineConfigurations)
    return cdkBuilder.build()
  }
}
