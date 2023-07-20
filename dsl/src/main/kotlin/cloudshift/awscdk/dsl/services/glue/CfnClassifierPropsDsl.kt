@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnClassifier
import software.amazon.awscdk.services.glue.CfnClassifierProps

@CdkDslMarker
public class CfnClassifierPropsDsl {
  private val cdkBuilder: CfnClassifierProps.Builder = CfnClassifierProps.builder()

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

  public fun build(): CfnClassifierProps = cdkBuilder.build()
}
