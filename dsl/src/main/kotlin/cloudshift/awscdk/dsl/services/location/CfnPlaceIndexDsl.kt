@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.location

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.location.CfnPlaceIndex
import software.constructs.Construct

/**
 * Specifies a place index resource in your AWS account.
 *
 * Use a place index resource to geocode addresses and other text queries by using the
 * `SearchPlaceIndexForText` operation, and reverse geocode coordinates by using the
 * `SearchPlaceIndexForPosition` operation, and enable autosuggestions by using the
 * `SearchPlaceIndexForSuggestions` operation.
 *
 *
 * If your application is tracking or routing assets you use in your business, such as delivery
 * vehicles or employees, you must not use Esri as your geolocation provider. See section 82 of the
 * [AWS service terms](https://docs.aws.amazon.com/service-terms) for more details.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.location.*;
 * CfnPlaceIndex cfnPlaceIndex = CfnPlaceIndex.Builder.create(this, "MyCfnPlaceIndex")
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
public class CfnPlaceIndexDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPlaceIndex.Builder = CfnPlaceIndex.Builder.create(scope, id)

  /**
   * Specifies the geospatial data provider for the new place index.
   *
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
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-datasource)
   * @param dataSource Specifies the geospatial data provider for the new place index. 
   */
  public fun dataSource(dataSource: String) {
    cdkBuilder.dataSource(dataSource)
  }

  /**
   * Specifies the data storage option requesting Places.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-datasourceconfiguration)
   * @param dataSourceConfiguration Specifies the data storage option requesting Places. 
   */
  public fun dataSourceConfiguration(dataSourceConfiguration: IResolvable) {
    cdkBuilder.dataSourceConfiguration(dataSourceConfiguration)
  }

  /**
   * Specifies the data storage option requesting Places.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-datasourceconfiguration)
   * @param dataSourceConfiguration Specifies the data storage option requesting Places. 
   */
  public
      fun dataSourceConfiguration(dataSourceConfiguration: CfnPlaceIndex.DataSourceConfigurationProperty) {
    cdkBuilder.dataSourceConfiguration(dataSourceConfiguration)
  }

  /**
   * The optional description for the place index resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-description)
   * @param description The optional description for the place index resource. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name of the place index resource.
   *
   * Requirements:
   *
   * * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
   * underscores (_).
   * * Must be a unique place index resource name.
   * * No spaces allowed. For example, `ExamplePlaceIndex` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-indexname)
   * @param indexName The name of the place index resource. 
   */
  public fun indexName(indexName: String) {
    cdkBuilder.indexName(indexName)
  }

  /**
   * No longer used. If included, the only allowed value is `RequestBasedUsage` .
   *
   * *Allowed Values* : `RequestBasedUsage`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-pricingplan)
   * @param pricingPlan No longer used. If included, the only allowed value is `RequestBasedUsage` .
   * 
   */
  public fun pricingPlan(pricingPlan: String) {
    cdkBuilder.pricingPlan(pricingPlan)
  }

  public fun build(): CfnPlaceIndex = cdkBuilder.build()
}
