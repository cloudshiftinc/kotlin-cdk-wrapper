@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnRouteCalculator`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.location.*;
 * CfnRouteCalculatorProps cfnRouteCalculatorProps = CfnRouteCalculatorProps.builder()
 * .calculatorName("calculatorName")
 * .dataSource("dataSource")
 * // the properties below are optional
 * .description("description")
 * .pricingPlan("pricingPlan")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html)
 */
public interface CfnRouteCalculatorProps {
  /**
   * The name of the route calculator resource.
   *
   * Requirements:
   *
   * * Can use alphanumeric characters (A–Z, a–z, 0–9) , hyphens (-), periods (.), and underscores
   * (_).
   * * Must be a unique Route calculator resource name.
   * * No spaces allowed. For example, `ExampleRouteCalculator` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-calculatorname)
   */
  public fun calculatorName(): String

  /**
   * Specifies the data provider of traffic and road network data.
   *
   *
   * This field is case-sensitive. Enter the valid values as shown. For example, entering `HERE`
   * returns an error.
   *
   *
   * Valid values include:
   *
   * * `Esri` – For additional information about
   * [Esri](https://docs.aws.amazon.com/location/previous/developerguide/esri.html) 's coverage in your
   * region of interest, see [Esri details on street networks and traffic
   * coverage](https://docs.aws.amazon.com/https://doc.arcgis.com/en/arcgis-online/reference/network-coverage.htm)
   * .
   *
   * Route calculators that use Esri as a data source only calculate routes that are shorter than
   * 400 km.
   *
   * * `Grab` – Grab provides routing functionality for Southeast Asia. For additional information
   * about [GrabMaps](https://docs.aws.amazon.com/location/previous/developerguide/grab.html) '
   * coverage, see [GrabMaps countries and areas
   * covered](https://docs.aws.amazon.com/location/previous/developerguide/grab.html#grab-coverage-area)
   * .
   * * `Here` – For additional information about [HERE
   * Technologies](https://docs.aws.amazon.com/location/previous/developerguide/HERE.html) ' coverage
   * in your region of interest, see [HERE car routing
   * coverage](https://docs.aws.amazon.com/https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/car-routing.html)
   * and [HERE truck routing
   * coverage](https://docs.aws.amazon.com/https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/truck-routing.html)
   * .
   *
   * For additional information , see [Data
   * providers](https://docs.aws.amazon.com/location/previous/developerguide/what-is-data-provider.html)
   * on the *Amazon Location Service Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-datasource)
   */
  public fun dataSource(): String

  /**
   * The optional description for the route calculator resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * No longer used. If included, the only allowed value is `RequestBasedUsage` .
   *
   * *Allowed Values* : `RequestBasedUsage`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-pricingplan)
   */
  public fun pricingPlan(): String? = unwrap(this).getPricingPlan()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnRouteCalculatorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param calculatorName The name of the route calculator resource. 
     * Requirements:
     *
     * * Can use alphanumeric characters (A–Z, a–z, 0–9) , hyphens (-), periods (.), and underscores
     * (_).
     * * Must be a unique Route calculator resource name.
     * * No spaces allowed. For example, `ExampleRouteCalculator` .
     */
    public fun calculatorName(calculatorName: String)

    /**
     * @param dataSource Specifies the data provider of traffic and road network data. 
     *
     * This field is case-sensitive. Enter the valid values as shown. For example, entering `HERE`
     * returns an error.
     *
     *
     * Valid values include:
     *
     * * `Esri` – For additional information about
     * [Esri](https://docs.aws.amazon.com/location/previous/developerguide/esri.html) 's coverage in
     * your region of interest, see [Esri details on street networks and traffic
     * coverage](https://docs.aws.amazon.com/https://doc.arcgis.com/en/arcgis-online/reference/network-coverage.htm)
     * .
     *
     * Route calculators that use Esri as a data source only calculate routes that are shorter than
     * 400 km.
     *
     * * `Grab` – Grab provides routing functionality for Southeast Asia. For additional information
     * about [GrabMaps](https://docs.aws.amazon.com/location/previous/developerguide/grab.html) '
     * coverage, see [GrabMaps countries and areas
     * covered](https://docs.aws.amazon.com/location/previous/developerguide/grab.html#grab-coverage-area)
     * .
     * * `Here` – For additional information about [HERE
     * Technologies](https://docs.aws.amazon.com/location/previous/developerguide/HERE.html) ' coverage
     * in your region of interest, see [HERE car routing
     * coverage](https://docs.aws.amazon.com/https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/car-routing.html)
     * and [HERE truck routing
     * coverage](https://docs.aws.amazon.com/https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/truck-routing.html)
     * .
     *
     * For additional information , see [Data
     * providers](https://docs.aws.amazon.com/location/previous/developerguide/what-is-data-provider.html)
     * on the *Amazon Location Service Developer Guide* .
     */
    public fun dataSource(dataSource: String)

    /**
     * @param description The optional description for the route calculator resource.
     */
    public fun description(description: String)

    /**
     * @param pricingPlan No longer used. If included, the only allowed value is `RequestBasedUsage`
     * .
     * *Allowed Values* : `RequestBasedUsage`
     */
    public fun pricingPlan(pricingPlan: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnRouteCalculatorProps.Builder
        = software.amazon.awscdk.services.location.CfnRouteCalculatorProps.builder()

    /**
     * @param calculatorName The name of the route calculator resource. 
     * Requirements:
     *
     * * Can use alphanumeric characters (A–Z, a–z, 0–9) , hyphens (-), periods (.), and underscores
     * (_).
     * * Must be a unique Route calculator resource name.
     * * No spaces allowed. For example, `ExampleRouteCalculator` .
     */
    override fun calculatorName(calculatorName: String) {
      cdkBuilder.calculatorName(calculatorName)
    }

    /**
     * @param dataSource Specifies the data provider of traffic and road network data. 
     *
     * This field is case-sensitive. Enter the valid values as shown. For example, entering `HERE`
     * returns an error.
     *
     *
     * Valid values include:
     *
     * * `Esri` – For additional information about
     * [Esri](https://docs.aws.amazon.com/location/previous/developerguide/esri.html) 's coverage in
     * your region of interest, see [Esri details on street networks and traffic
     * coverage](https://docs.aws.amazon.com/https://doc.arcgis.com/en/arcgis-online/reference/network-coverage.htm)
     * .
     *
     * Route calculators that use Esri as a data source only calculate routes that are shorter than
     * 400 km.
     *
     * * `Grab` – Grab provides routing functionality for Southeast Asia. For additional information
     * about [GrabMaps](https://docs.aws.amazon.com/location/previous/developerguide/grab.html) '
     * coverage, see [GrabMaps countries and areas
     * covered](https://docs.aws.amazon.com/location/previous/developerguide/grab.html#grab-coverage-area)
     * .
     * * `Here` – For additional information about [HERE
     * Technologies](https://docs.aws.amazon.com/location/previous/developerguide/HERE.html) ' coverage
     * in your region of interest, see [HERE car routing
     * coverage](https://docs.aws.amazon.com/https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/car-routing.html)
     * and [HERE truck routing
     * coverage](https://docs.aws.amazon.com/https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/truck-routing.html)
     * .
     *
     * For additional information , see [Data
     * providers](https://docs.aws.amazon.com/location/previous/developerguide/what-is-data-provider.html)
     * on the *Amazon Location Service Developer Guide* .
     */
    override fun dataSource(dataSource: String) {
      cdkBuilder.dataSource(dataSource)
    }

    /**
     * @param description The optional description for the route calculator resource.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param pricingPlan No longer used. If included, the only allowed value is `RequestBasedUsage`
     * .
     * *Allowed Values* : `RequestBasedUsage`
     */
    override fun pricingPlan(pricingPlan: String) {
      cdkBuilder.pricingPlan(pricingPlan)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.location.CfnRouteCalculatorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.location.CfnRouteCalculatorProps,
  ) : CdkObject(cdkObject),
      CfnRouteCalculatorProps {
    /**
     * The name of the route calculator resource.
     *
     * Requirements:
     *
     * * Can use alphanumeric characters (A–Z, a–z, 0–9) , hyphens (-), periods (.), and underscores
     * (_).
     * * Must be a unique Route calculator resource name.
     * * No spaces allowed. For example, `ExampleRouteCalculator` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-calculatorname)
     */
    override fun calculatorName(): String = unwrap(this).getCalculatorName()

    /**
     * Specifies the data provider of traffic and road network data.
     *
     *
     * This field is case-sensitive. Enter the valid values as shown. For example, entering `HERE`
     * returns an error.
     *
     *
     * Valid values include:
     *
     * * `Esri` – For additional information about
     * [Esri](https://docs.aws.amazon.com/location/previous/developerguide/esri.html) 's coverage in
     * your region of interest, see [Esri details on street networks and traffic
     * coverage](https://docs.aws.amazon.com/https://doc.arcgis.com/en/arcgis-online/reference/network-coverage.htm)
     * .
     *
     * Route calculators that use Esri as a data source only calculate routes that are shorter than
     * 400 km.
     *
     * * `Grab` – Grab provides routing functionality for Southeast Asia. For additional information
     * about [GrabMaps](https://docs.aws.amazon.com/location/previous/developerguide/grab.html) '
     * coverage, see [GrabMaps countries and areas
     * covered](https://docs.aws.amazon.com/location/previous/developerguide/grab.html#grab-coverage-area)
     * .
     * * `Here` – For additional information about [HERE
     * Technologies](https://docs.aws.amazon.com/location/previous/developerguide/HERE.html) ' coverage
     * in your region of interest, see [HERE car routing
     * coverage](https://docs.aws.amazon.com/https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/car-routing.html)
     * and [HERE truck routing
     * coverage](https://docs.aws.amazon.com/https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/truck-routing.html)
     * .
     *
     * For additional information , see [Data
     * providers](https://docs.aws.amazon.com/location/previous/developerguide/what-is-data-provider.html)
     * on the *Amazon Location Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-datasource)
     */
    override fun dataSource(): String = unwrap(this).getDataSource()

    /**
     * The optional description for the route calculator resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * No longer used. If included, the only allowed value is `RequestBasedUsage` .
     *
     * *Allowed Values* : `RequestBasedUsage`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-pricingplan)
     */
    override fun pricingPlan(): String? = unwrap(this).getPricingPlan()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRouteCalculatorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnRouteCalculatorProps):
        CfnRouteCalculatorProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRouteCalculatorProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRouteCalculatorProps):
        software.amazon.awscdk.services.location.CfnRouteCalculatorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.location.CfnRouteCalculatorProps
  }
}
