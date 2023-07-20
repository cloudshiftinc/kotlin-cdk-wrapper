@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.comprehend

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifier

@CdkDslMarker
public class CfnDocumentClassifierAugmentedManifestsListItemPropertyDsl {
  private val cdkBuilder: CfnDocumentClassifier.AugmentedManifestsListItemProperty.Builder =
      CfnDocumentClassifier.AugmentedManifestsListItemProperty.builder()

  private val _attributeNames: MutableList<String> = mutableListOf()

  public fun attributeNames(vararg attributeNames: String) {
    _attributeNames.addAll(listOf(*attributeNames))
  }

  public fun attributeNames(attributeNames: Collection<String>) {
    _attributeNames.addAll(attributeNames)
  }

  public fun s3Uri(s3Uri: String) {
    cdkBuilder.s3Uri(s3Uri)
  }

  public fun split(split: String) {
    cdkBuilder.split(split)
  }

  public fun build(): CfnDocumentClassifier.AugmentedManifestsListItemProperty {
    if(_attributeNames.isNotEmpty()) cdkBuilder.attributeNames(_attributeNames)
    return cdkBuilder.build()
  }
}
