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

  /**
   * @param attribute Specifies an asset attribute property.
   * An attribute generally contains static information, such as the serial number of an [industrial
   * IoT](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications)
   * wind turbine.
   *
   * This is required if the `TypeName` is `Attribute` and has a `DefaultValue` .
   */
  public fun attribute(attribute: IResolvable) {
    cdkBuilder.attribute(attribute)
  }

  /**
   * @param attribute Specifies an asset attribute property.
   * An attribute generally contains static information, such as the serial number of an [industrial
   * IoT](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications)
   * wind turbine.
   *
   * This is required if the `TypeName` is `Attribute` and has a `DefaultValue` .
   */
  public fun attribute(attribute: CfnAssetModel.AttributeProperty) {
    cdkBuilder.attribute(attribute)
  }

  /**
   * @param metric Specifies an asset metric property.
   * A metric contains a mathematical expression that uses aggregate functions to process all input
   * data points over a time interval and output a single data point, such as to calculate the average
   * hourly temperature.
   *
   * This is required if the `TypeName` is `Metric` .
   */
  public fun metric(metric: IResolvable) {
    cdkBuilder.metric(metric)
  }

  /**
   * @param metric Specifies an asset metric property.
   * A metric contains a mathematical expression that uses aggregate functions to process all input
   * data points over a time interval and output a single data point, such as to calculate the average
   * hourly temperature.
   *
   * This is required if the `TypeName` is `Metric` .
   */
  public fun metric(metric: CfnAssetModel.MetricProperty) {
    cdkBuilder.metric(metric)
  }

  /**
   * @param transform Specifies an asset transform property.
   * A transform contains a mathematical expression that maps a property's data points from one form
   * to another, such as a unit conversion from Celsius to Fahrenheit.
   *
   * This is required if the `TypeName` is `Transform` .
   */
  public fun transform(transform: IResolvable) {
    cdkBuilder.transform(transform)
  }

  /**
   * @param transform Specifies an asset transform property.
   * A transform contains a mathematical expression that maps a property's data points from one form
   * to another, such as a unit conversion from Celsius to Fahrenheit.
   *
   * This is required if the `TypeName` is `Transform` .
   */
  public fun transform(transform: CfnAssetModel.TransformProperty) {
    cdkBuilder.transform(transform)
  }

  /**
   * @param typeName The type of property type, which can be one of `Attribute` , `Measurement` ,
   * `Metric` , or `Transform` . 
   */
  public fun typeName(typeName: String) {
    cdkBuilder.typeName(typeName)
  }

  public fun build(): CfnAssetModel.PropertyTypeProperty = cdkBuilder.build()
}
