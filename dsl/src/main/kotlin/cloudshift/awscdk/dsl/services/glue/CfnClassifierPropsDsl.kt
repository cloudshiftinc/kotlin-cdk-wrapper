@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnClassifier
import software.amazon.awscdk.services.glue.CfnClassifierProps

@CdkDslMarker
public class CfnClassifierPropsDsl {
  private val cdkBuilder: CfnClassifierProps.Builder = CfnClassifierProps.builder()

  /**
   * @param csvClassifier A classifier for comma-separated values (CSV).
   */
  public fun csvClassifier(csvClassifier: IResolvable) {
    cdkBuilder.csvClassifier(csvClassifier)
  }

  /**
   * @param csvClassifier A classifier for comma-separated values (CSV).
   */
  public fun csvClassifier(csvClassifier: CfnClassifier.CsvClassifierProperty) {
    cdkBuilder.csvClassifier(csvClassifier)
  }

  /**
   * @param grokClassifier A classifier that uses `grok` .
   */
  public fun grokClassifier(grokClassifier: IResolvable) {
    cdkBuilder.grokClassifier(grokClassifier)
  }

  /**
   * @param grokClassifier A classifier that uses `grok` .
   */
  public fun grokClassifier(grokClassifier: CfnClassifier.GrokClassifierProperty) {
    cdkBuilder.grokClassifier(grokClassifier)
  }

  /**
   * @param jsonClassifier A classifier for JSON content.
   */
  public fun jsonClassifier(jsonClassifier: IResolvable) {
    cdkBuilder.jsonClassifier(jsonClassifier)
  }

  /**
   * @param jsonClassifier A classifier for JSON content.
   */
  public fun jsonClassifier(jsonClassifier: CfnClassifier.JsonClassifierProperty) {
    cdkBuilder.jsonClassifier(jsonClassifier)
  }

  /**
   * @param xmlClassifier A classifier for XML content.
   */
  public fun xmlClassifier(xmlClassifier: IResolvable) {
    cdkBuilder.xmlClassifier(xmlClassifier)
  }

  /**
   * @param xmlClassifier A classifier for XML content.
   */
  public fun xmlClassifier(xmlClassifier: CfnClassifier.XMLClassifierProperty) {
    cdkBuilder.xmlClassifier(xmlClassifier)
  }

  public fun build(): CfnClassifierProps = cdkBuilder.build()
}
