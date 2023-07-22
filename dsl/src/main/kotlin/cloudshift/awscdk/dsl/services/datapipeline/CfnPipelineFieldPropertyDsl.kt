@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datapipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datapipeline.CfnPipeline

@CdkDslMarker
public class CfnPipelineFieldPropertyDsl {
  private val cdkBuilder: CfnPipeline.FieldProperty.Builder = CfnPipeline.FieldProperty.builder()

  /**
   * @param key Specifies the name of a field for a particular object. 
   * To view valid values for a particular field, see [Pipeline Object
   * Reference](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-pipeline-objects.html)
   * in the *AWS Data Pipeline Developer Guide* .
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param refValue A field value that you specify as an identifier of another object in the same
   * pipeline definition.
   *
   * You can specify the field value as either a string value ( `StringValue` ) or a reference to
   * another object ( `RefValue` ), but not both.
   *
   *
   * Required if the key that you are using requires it.
   */
  public fun refValue(refValue: String) {
    cdkBuilder.refValue(refValue)
  }

  /**
   * @param stringValue A field value that you specify as a string.
   * To view valid values for a particular field, see [Pipeline Object
   * Reference](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-pipeline-objects.html)
   * in the *AWS Data Pipeline Developer Guide* .
   *
   *
   * You can specify the field value as either a string value ( `StringValue` ) or a reference to
   * another object ( `RefValue` ), but not both.
   *
   *
   * Required if the key that you are using requires it.
   */
  public fun stringValue(stringValue: String) {
    cdkBuilder.stringValue(stringValue)
  }

  public fun build(): CfnPipeline.FieldProperty = cdkBuilder.build()
}
