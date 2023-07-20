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

  public fun documentReadAction(documentReadAction: String) {
    cdkBuilder.documentReadAction(documentReadAction)
  }

  public fun documentReadMode(documentReadMode: String) {
    cdkBuilder.documentReadMode(documentReadMode)
  }

  public fun featureTypes(vararg featureTypes: String) {
    _featureTypes.addAll(listOf(*featureTypes))
  }

  public fun featureTypes(featureTypes: Collection<String>) {
    _featureTypes.addAll(featureTypes)
  }

  public fun build(): CfnDocumentClassifier.DocumentReaderConfigProperty {
    if(_featureTypes.isNotEmpty()) cdkBuilder.featureTypes(_featureTypes)
    return cdkBuilder.build()
  }
}
