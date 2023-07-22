@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.comprehend

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifier

@CdkDslMarker
public class CfnDocumentClassifierDocumentReaderConfigPropertyDsl {
  private val cdkBuilder: CfnDocumentClassifier.DocumentReaderConfigProperty.Builder =
      CfnDocumentClassifier.DocumentReaderConfigProperty.builder()

  private val _featureTypes: MutableList<String> = mutableListOf()

  /**
   * @param documentReadAction This field defines the Amazon Textract API operation that Amazon
   * Comprehend uses to extract text from PDF files and image files. 
   * Enter one of the following values:
   *
   * * `TEXTRACT_DETECT_DOCUMENT_TEXT` - The Amazon Comprehend service uses the `DetectDocumentText`
   * API operation.
   * * `TEXTRACT_ANALYZE_DOCUMENT` - The Amazon Comprehend service uses the `AnalyzeDocument` API
   * operation.
   */
  public fun documentReadAction(documentReadAction: String) {
    cdkBuilder.documentReadAction(documentReadAction)
  }

  /**
   * @param documentReadMode Determines the text extraction actions for PDF files. Enter one of the
   * following values:.
   * * `SERVICE_DEFAULT` - use the Amazon Comprehend service defaults for PDF files.
   * * `FORCE_DOCUMENT_READ_ACTION` - Amazon Comprehend uses the Textract API specified by
   * DocumentReadAction for all PDF files, including digital PDF files.
   */
  public fun documentReadMode(documentReadMode: String) {
    cdkBuilder.documentReadMode(documentReadMode)
  }

  /**
   * @param featureTypes Specifies the type of Amazon Textract features to apply.
   * If you chose `TEXTRACT_ANALYZE_DOCUMENT` as the read action, you must specify one or both of
   * the following values:
   *
   * * `TABLES` - Returns information about any tables that are detected in the input document.
   * * `FORMS` - Returns information and the data from any forms that are detected in the input
   * document.
   */
  public fun featureTypes(vararg featureTypes: String) {
    _featureTypes.addAll(listOf(*featureTypes))
  }

  /**
   * @param featureTypes Specifies the type of Amazon Textract features to apply.
   * If you chose `TEXTRACT_ANALYZE_DOCUMENT` as the read action, you must specify one or both of
   * the following values:
   *
   * * `TABLES` - Returns information about any tables that are detected in the input document.
   * * `FORMS` - Returns information and the data from any forms that are detected in the input
   * document.
   */
  public fun featureTypes(featureTypes: Collection<String>) {
    _featureTypes.addAll(featureTypes)
  }

  public fun build(): CfnDocumentClassifier.DocumentReaderConfigProperty {
    if(_featureTypes.isNotEmpty()) cdkBuilder.featureTypes(_featureTypes)
    return cdkBuilder.build()
  }
}
