@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnClassifier
import software.constructs.Construct

@CdkDslMarker
public class CfnClassifierDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnClassifier.Builder = CfnClassifier.Builder.create(scope, id)

  public fun csvClassifier(csvClassifier: IResolvable) {
    cdkBuilder.csvClassifier(csvClassifier)
  }

  public fun csvClassifier(csvClassifier: CfnClassifier.CsvClassifierProperty) {
    cdkBuilder.csvClassifier(csvClassifier)
  }

  public fun grokClassifier(grokClassifier: IResolvable) {
    cdkBuilder.grokClassifier(grokClassifier)
  }

  public fun grokClassifier(grokClassifier: CfnClassifier.GrokClassifierProperty) {
    cdkBuilder.grokClassifier(grokClassifier)
  }

  public fun jsonClassifier(jsonClassifier: IResolvable) {
    cdkBuilder.jsonClassifier(jsonClassifier)
  }

  public fun jsonClassifier(jsonClassifier: CfnClassifier.JsonClassifierProperty) {
    cdkBuilder.jsonClassifier(jsonClassifier)
  }

  public fun xmlClassifier(xmlClassifier: IResolvable) {
    cdkBuilder.xmlClassifier(xmlClassifier)
  }

  public fun xmlClassifier(xmlClassifier: CfnClassifier.XMLClassifierProperty) {
    cdkBuilder.xmlClassifier(xmlClassifier)
  }

  public fun build(): CfnClassifier = cdkBuilder.build()
}
