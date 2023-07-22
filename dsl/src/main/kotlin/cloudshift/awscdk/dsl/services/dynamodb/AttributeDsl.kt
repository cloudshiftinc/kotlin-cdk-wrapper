@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.dynamodb.Attribute
import software.amazon.awscdk.services.dynamodb.AttributeType

@CdkDslMarker
public class AttributeDsl {
  private val cdkBuilder: Attribute.Builder = Attribute.builder()

  /**
   * @param name The name of an attribute. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param type The data type of an attribute. 
   */
  public fun type(type: AttributeType) {
    cdkBuilder.type(type)
  }

  public fun build(): Attribute = cdkBuilder.build()
}
