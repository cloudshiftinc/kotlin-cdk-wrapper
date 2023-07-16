@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnClassifier

@CdkDslMarker
public class CfnClassifierXMLClassifierPropertyDsl {
  private val cdkBuilder: CfnClassifier.XMLClassifierProperty.Builder =
      CfnClassifier.XMLClassifierProperty.builder()

  public fun classification(classification: String) {
    cdkBuilder.classification(classification)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun rowTag(rowTag: String) {
    cdkBuilder.rowTag(rowTag)
  }

  public fun build(): CfnClassifier.XMLClassifierProperty = cdkBuilder.build()
}
