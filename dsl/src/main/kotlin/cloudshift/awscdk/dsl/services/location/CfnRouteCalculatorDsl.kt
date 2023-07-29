@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.location

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.location.CfnRouteCalculator
import software.constructs.Construct

/**
 * Specifies a route calculator resource in your AWS account.
 *
 * You can send requests to a route calculator resource to estimate travel time, distance, and get
 * directions. A route calculator sources traffic and road network data from your chosen data
 * provider.
 *
 * If your application is tracking or routing assets you use in your business, such as delivery
 * vehicles or employees, you must not use Esri as your geolocation provider. See section 82 of the
 * [AWS service terms](https://docs.aws.amazon.com/service-terms) for more details.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.location.*;
 * CfnRouteCalculator cfnRouteCalculator = CfnRouteCalculator.Builder.create(this,
 * "MyCfnRouteCalculator")
 * .calculatorName("calculatorName")
 * .dataSource("dataSource")
 * // the properties below are optional
 * .description("description")
 * .pricingPlan("pricingPlan")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html)
 */
@CdkDslMarker
public class CfnRouteCalculatorDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRouteCalculator.Builder =
        CfnRouteCalculator.Builder.create(scope, id)

    /**
     * The name of the route calculator resource.
     *
     * Requirements:
     * * Can use alphanumeric characters (A–Z, a–z, 0–9) , hyphens (-), periods (.), and underscores
     *   (_).
     * * Must be a unique Route calculator resource name.
     * * No spaces allowed. For example, `ExampleRouteCalculator` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-calculatorname)
     *
     * @param calculatorName The name of the route calculator resource.
     */
    public fun calculatorName(calculatorName: String) {
        cdkBuilder.calculatorName(calculatorName)
    }

    /**
     * Specifies the data provider of traffic and road network data.
     *
     * This field is case-sensitive. Enter the valid values as shown. For example, entering `HERE`
     * returns an error.
     *
     * Valid values include:
     * * `Esri` – For additional information about
     *   [Esri](https://docs.aws.amazon.com/location/latest/developerguide/esri.html) 's coverage in
     *   your region of interest, see
     *   [Esri details on street networks and traffic coverage](https://docs.aws.amazon.com/https://doc.arcgis.com/en/arcgis-online/reference/network-coverage.htm)
     *   .
     *
     * Route calculators that use Esri as a data source only calculate routes that are shorter than
     * 400 km.
     * * `Grab` – Grab provides routing functionality for Southeast Asia. For additional information
     *   about [GrabMaps](https://docs.aws.amazon.com/location/latest/developerguide/grab.html) '
     *   coverage, see
     *   [GrabMaps countries and areas covered](https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area)
     *   .
     * * `Here` – For additional information about
     *   [HERE Technologies](https://docs.aws.amazon.com/location/latest/developerguide/HERE.html) '
     *   coverage in your region of interest, see
     *   [HERE car routing coverage](https://docs.aws.amazon.com/https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/car-routing.html)
     *   and
     *   [HERE truck routing coverage](https://docs.aws.amazon.com/https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/truck-routing.html)
     *   .
     *
     * For additional information , see
     * [Data providers](https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html)
     * on the *Amazon Location Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-datasource)
     *
     * @param dataSource Specifies the data provider of traffic and road network data.
     */
    public fun dataSource(dataSource: String) {
        cdkBuilder.dataSource(dataSource)
    }

    /**
     * The optional description for the route calculator resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-description)
     *
     * @param description The optional description for the route calculator resource.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * No longer used. If included, the only allowed value is `RequestBasedUsage` .
     *
     * *Allowed Values* : `RequestBasedUsage`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-pricingplan)
     *
     * @param pricingPlan No longer used. If included, the only allowed value is `RequestBasedUsage`
     *   .
     */
    public fun pricingPlan(pricingPlan: String) {
        cdkBuilder.pricingPlan(pricingPlan)
    }

    public fun build(): CfnRouteCalculator = cdkBuilder.build()
}
