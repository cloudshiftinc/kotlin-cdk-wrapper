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

  /**
   * A classifier for comma-separated values (CSV).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-csvclassifier)
   * @param csvClassifier A classifier for comma-separated values (CSV). 
   */
  public fun csvClassifier(csvClassifier: IResolvable) {
    cdkBuilder.csvClassifier(csvClassifier)
  }

  /**
   * A classifier for comma-separated values (CSV).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-csvclassifier)
   * @param csvClassifier A classifier for comma-separated values (CSV). 
   */
  public fun csvClassifier(csvClassifier: CfnClassifier.CsvClassifierProperty) {
    cdkBuilder.csvClassifier(csvClassifier)
  }

  /**
   * A classifier that uses `grok` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-grokclassifier)
   * @param grokClassifier A classifier that uses `grok` . 
   */
  public fun grokClassifier(grokClassifier: IResolvable) {
    cdkBuilder.grokClassifier(grokClassifier)
  }

  /**
   * A classifier that uses `grok` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-grokclassifier)
   * @param grokClassifier A classifier that uses `grok` . 
   */
  public fun grokClassifier(grokClassifier: CfnClassifier.GrokClassifierProperty) {
    cdkBuilder.grokClassifier(grokClassifier)
  }

  /**
   * A classifier for JSON content.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-jsonclassifier)
   * @param jsonClassifier A classifier for JSON content. 
   */
  public fun jsonClassifier(jsonClassifier: IResolvable) {
    cdkBuilder.jsonClassifier(jsonClassifier)
  }

  /**
   * A classifier for JSON content.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-jsonclassifier)
   * @param jsonClassifier A classifier for JSON content. 
   */
  public fun jsonClassifier(jsonClassifier: CfnClassifier.JsonClassifierProperty) {
    cdkBuilder.jsonClassifier(jsonClassifier)
  }

  /**
   * A classifier for XML content.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-xmlclassifier)
   * @param xmlClassifier A classifier for XML content. 
   */
  public fun xmlClassifier(xmlClassifier: IResolvable) {
    cdkBuilder.xmlClassifier(xmlClassifier)
  }

  /**
   * A classifier for XML content.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-xmlclassifier)
   * @param xmlClassifier A classifier for XML content. 
   */
  public fun xmlClassifier(xmlClassifier: CfnClassifier.XMLClassifierProperty) {
    cdkBuilder.xmlClassifier(xmlClassifier)
  }

  public fun build(): CfnClassifier = cdkBuilder.build()
}
