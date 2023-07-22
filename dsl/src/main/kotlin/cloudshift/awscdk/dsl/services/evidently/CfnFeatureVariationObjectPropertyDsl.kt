@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.evidently.CfnFeature

@CdkDslMarker
public class CfnFeatureVariationObjectPropertyDsl {
  private val cdkBuilder: CfnFeature.VariationObjectProperty.Builder =
      CfnFeature.VariationObjectProperty.builder()

  /**
   * @param booleanValue The value assigned to this variation, if the variation type is boolean.
   */
  public fun booleanValue(booleanValue: Boolean) {
    cdkBuilder.booleanValue(booleanValue)
  }

  /**
   * @param booleanValue The value assigned to this variation, if the variation type is boolean.
   */
  public fun booleanValue(booleanValue: IResolvable) {
    cdkBuilder.booleanValue(booleanValue)
  }

  /**
   * @param doubleValue The value assigned to this variation, if the variation type is a double.
   */
  public fun doubleValue(doubleValue: Number) {
    cdkBuilder.doubleValue(doubleValue)
  }

  /**
   * @param longValue The value assigned to this variation, if the variation type is a long.
   */
  public fun longValue(longValue: Number) {
    cdkBuilder.longValue(longValue)
  }

  /**
   * @param stringValue The value assigned to this variation, if the variation type is a string.
   */
  public fun stringValue(stringValue: String) {
    cdkBuilder.stringValue(stringValue)
  }

  /**
   * @param variationName A name for the variation. 
   * It can include up to 127 characters.
   */
  public fun variationName(variationName: String) {
    cdkBuilder.variationName(variationName)
  }

  public fun build(): CfnFeature.VariationObjectProperty = cdkBuilder.build()
}
