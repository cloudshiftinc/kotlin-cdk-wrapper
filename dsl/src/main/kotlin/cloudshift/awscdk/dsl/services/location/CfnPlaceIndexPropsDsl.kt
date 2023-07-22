@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.location

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.location.CfnPlaceIndex
import software.amazon.awscdk.services.location.CfnPlaceIndexProps

/**
 * Properties for defining a `CfnPlaceIndex`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.location.*;
 * CfnPlaceIndexProps cfnPlaceIndexProps = CfnPlaceIndexProps.builder()
 * .dataSource("dataSource")
 * .indexName("indexName")
 * // the properties below are optional
 * .dataSourceConfiguration(DataSourceConfigurationProperty.builder()
 * .intendedUse("intendedUse")
 * .build())
 * .description("description")
 * .pricingPlan("pricingPlan")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html)
 */
@CdkDslMarker
public class CfnPlaceIndexPropsDsl {
  private val cdkBuilder: CfnPlaceIndexProps.Builder = CfnPlaceIndexProps.builder()

  /**
   * @param dataSource Specifies the geospatial data provider for the new place index. 
   *
   * This field is case-sensitive. Enter the valid values as shown. For example, entering `HERE`
   * returns an error.
   *
   *
   * Valid values include:
   *
   * * `Esri` – For additional information about
   * [Esri](https://docs.aws.amazon.com/location/latest/developerguide/esri.html) 's coverage in your
   * region of interest, see [Esri details on geocoding
   * coverage](https://docs.aws.amazon.com/https://developers.arcgis.com/rest/geocode/api-reference/geocode-coverage.htm)
   * .
   * * `Grab` – Grab provides place index functionality for Southeast Asia. For additional
   * information about [GrabMaps](https://docs.aws.amazon.com/location/latest/developerguide/grab.html)
   * ' coverage, see [GrabMaps countries and areas
   * covered](https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area)
   * .
   * * `Here` – For additional information about [HERE
   * Technologies](https://docs.aws.amazon.com/location/latest/developerguide/HERE.html) ' coverage in
   * your region of interest, see [HERE details on goecoding
   * coverage](https://docs.aws.amazon.com/https://developer.here.com/documentation/geocoder/dev_guide/topics/coverage-geocoder.html)
   * .
   *
   *
   * If you specify HERE Technologies ( `Here` ) as the data provider, you may not [store
   * results](https://docs.aws.amazon.com//location-places/latest/APIReference/API_DataSourceConfiguration.html)
   * for locations in Japan. For more information, see the [AWS Service
   * Terms](https://docs.aws.amazon.com/service-terms/) for Amazon Location Service.
   *
   *
   * For additional information , see [Data
   * providers](https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html)
   * on the *Amazon Location Service Developer Guide* .
   */
  public fun dataSource(dataSource: String) {
    cdkBuilder.dataSource(dataSource)
  }

  /**
   * @param dataSourceConfiguration Specifies the data storage option requesting Places.
   */
  public fun dataSourceConfiguration(dataSourceConfiguration: IResolvable) {
    cdkBuilder.dataSourceConfiguration(dataSourceConfiguration)
  }

  /**
   * @param dataSourceConfiguration Specifies the data storage option requesting Places.
   */
  public
      fun dataSourceConfiguration(dataSourceConfiguration: CfnPlaceIndex.DataSourceConfigurationProperty) {
    cdkBuilder.dataSourceConfiguration(dataSourceConfiguration)
  }

  /**
   * @param description The optional description for the place index resource.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param indexName The name of the place index resource. 
   * Requirements:
   *
   * * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
   * underscores (_).
   * * Must be a unique place index resource name.
   * * No spaces allowed. For example, `ExamplePlaceIndex` .
   */
  public fun indexName(indexName: String) {
    cdkBuilder.indexName(indexName)
  }

  /**
   * @param pricingPlan No longer used. If included, the only allowed value is `RequestBasedUsage` .
   * *Allowed Values* : `RequestBasedUsage`
   */
  public fun pricingPlan(pricingPlan: String) {
    cdkBuilder.pricingPlan(pricingPlan)
  }

  public fun build(): CfnPlaceIndexProps = cdkBuilder.build()
}
