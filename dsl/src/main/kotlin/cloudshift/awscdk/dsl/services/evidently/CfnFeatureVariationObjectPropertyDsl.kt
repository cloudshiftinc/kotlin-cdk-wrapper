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

  public fun booleanValue(booleanValue: Boolean) {
    cdkBuilder.booleanValue(booleanValue)
  }

  public fun booleanValue(booleanValue: IResolvable) {
    cdkBuilder.booleanValue(booleanValue)
  }

  public fun doubleValue(doubleValue: Number) {
    cdkBuilder.doubleValue(doubleValue)
  }

  public fun longValue(longValue: Number) {
    cdkBuilder.longValue(longValue)
  }

  public fun stringValue(stringValue: String) {
    cdkBuilder.stringValue(stringValue)
  }

  public fun variationName(variationName: String) {
    cdkBuilder.variationName(variationName)
  }

  public fun build(): CfnFeature.VariationObjectProperty = cdkBuilder.build()
}
