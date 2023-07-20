@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel

@CdkDslMarker
public class CfnAssetModelPropertyTypePropertyDsl {
  private val cdkBuilder: CfnAssetModel.PropertyTypeProperty.Builder =
      CfnAssetModel.PropertyTypeProperty.builder()

  public fun attribute(attribute: IResolvable) {
    cdkBuilder.attribute(attribute)
  }

  public fun attribute(attribute: CfnAssetModel.AttributeProperty) {
    cdkBuilder.attribute(attribute)
  }

  public fun metric(metric: IResolvable) {
    cdkBuilder.metric(metric)
  }

  public fun metric(metric: CfnAssetModel.MetricProperty) {
    cdkBuilder.metric(metric)
  }

  public fun transform(transform: IResolvable) {
    cdkBuilder.transform(transform)
  }

  public fun transform(transform: CfnAssetModel.TransformProperty) {
    cdkBuilder.transform(transform)
  }

  public fun typeName(typeName: String) {
    cdkBuilder.typeName(typeName)
  }

  public fun build(): CfnAssetModel.PropertyTypeProperty = cdkBuilder.build()
}
