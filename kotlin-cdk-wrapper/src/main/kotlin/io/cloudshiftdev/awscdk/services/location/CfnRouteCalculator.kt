@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a route calculator resource in your AWS account.
 *
 * You can send requests to a route calculator resource to estimate travel time, distance, and get
 * directions. A route calculator sources traffic and road network data from your chosen data provider.
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
 * import io.cloudshiftdev.awscdk.services.location.*;
 * CfnRouteCalculator cfnRouteCalculator = CfnRouteCalculator.Builder.create(this,
 * "MyCfnRouteCalculator")
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
public open class CfnRouteCalculator internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.location.CfnRouteCalculator,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The Amazon Resource Name (ARN) for the route calculator resource.
   *
   * Use the ARN when you specify a resource across all AWS .
   *
   * * Format example: `arn:aws:geo:region:account-id:route-calculator/ExampleCalculator`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Synonym for `Arn` .
   *
   * The Amazon Resource Name (ARN) for the route calculator resource. Use the ARN when you specify
   * a resource across all AWS .
   *
   * * Format example: `arn:aws:geo:region:account-id:route-calculator/ExampleCalculator`
   */
  public open fun attrCalculatorArn(): String = unwrap(this).getAttrCalculatorArn()

  /**
   * The timestamp for when the route calculator resource was created in [ISO
   * 8601](https://docs.aws.amazon.com/https://www.iso.org/iso-8601-date-and-time-format.html) format:
   * `YYYY-MM-DDThh:mm:ss.sssZ` .
   */
  public open fun attrCreateTime(): String = unwrap(this).getAttrCreateTime()

  /**
   * The timestamp for when the route calculator resource was last updated in [ISO
   * 8601](https://docs.aws.amazon.com/https://www.iso.org/iso-8601-date-and-time-format.html) format:
   * `YYYY-MM-DDThh:mm:ss.sssZ` .
   */
  public open fun attrUpdateTime(): String = unwrap(this).getAttrUpdateTime()

  /**
   * The name of the route calculator resource.
   */
  public open fun calculatorName(): String = unwrap(this).getCalculatorName()

  /**
   * The name of the route calculator resource.
   */
  public open fun calculatorName(`value`: String) {
    unwrap(this).setCalculatorName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Specifies the data provider of traffic and road network data.
   */
  public open fun dataSource(): String = unwrap(this).getDataSource()

  /**
   * Specifies the data provider of traffic and road network data.
   */
  public open fun dataSource(`value`: String) {
    unwrap(this).setDataSource(`value`)
  }

  /**
   * The optional description for the route calculator resource.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The optional description for the route calculator resource.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * No longer used.
   *
   * If included, the only allowed value is `RequestBasedUsage` .
   */
  public open fun pricingPlan(): String? = unwrap(this).getPricingPlan()

  /**
   * No longer used.
   *
   * If included, the only allowed value is `RequestBasedUsage` .
   */
  public open fun pricingPlan(`value`: String) {
    unwrap(this).setPricingPlan(`value`)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.location.CfnRouteCalculator].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param calculatorName The name of the route calculator resource. 
     */
    public fun calculatorName(calculatorName: String)

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
     * [Esri](https://docs.aws.amazon.com/location/latest/developerguide/esri.html) 's coverage in your
     * region of interest, see [Esri details on street networks and traffic
     * coverage](https://docs.aws.amazon.com/https://doc.arcgis.com/en/arcgis-online/reference/network-coverage.htm)
     * .
     *
     * Route calculators that use Esri as a data source only calculate routes that are shorter than
     * 400 km.
     *
     * * `Grab` – Grab provides routing functionality for Southeast Asia. For additional information
     * about [GrabMaps](https://docs.aws.amazon.com/location/latest/developerguide/grab.html) '
     * coverage, see [GrabMaps countries and areas
     * covered](https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area)
     * .
     * * `Here` – For additional information about [HERE
     * Technologies](https://docs.aws.amazon.com/location/latest/developerguide/HERE.html) ' coverage
     * in your region of interest, see [HERE car routing
     * coverage](https://docs.aws.amazon.com/https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/car-routing.html)
     * and [HERE truck routing
     * coverage](https://docs.aws.amazon.com/https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/truck-routing.html)
     * .
     *
     * For additional information , see [Data
     * providers](https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html)
     * on the *Amazon Location Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-datasource)
     * @param dataSource Specifies the data provider of traffic and road network data. 
     */
    public fun dataSource(dataSource: String)

    /**
     * The optional description for the route calculator resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-description)
     * @param description The optional description for the route calculator resource. 
     */
    public fun description(description: String)

    /**
     * No longer used. If included, the only allowed value is `RequestBasedUsage` .
     *
     * *Allowed Values* : `RequestBasedUsage`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-pricingplan)
     * @param pricingPlan No longer used. If included, the only allowed value is `RequestBasedUsage`
     * . 
     */
    public fun pricingPlan(pricingPlan: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnRouteCalculator.Builder =
        software.amazon.awscdk.services.location.CfnRouteCalculator.Builder.create(scope, id)

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
     * @param calculatorName The name of the route calculator resource. 
     */
    override fun calculatorName(calculatorName: String) {
      cdkBuilder.calculatorName(calculatorName)
    }

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
     * [Esri](https://docs.aws.amazon.com/location/latest/developerguide/esri.html) 's coverage in your
     * region of interest, see [Esri details on street networks and traffic
     * coverage](https://docs.aws.amazon.com/https://doc.arcgis.com/en/arcgis-online/reference/network-coverage.htm)
     * .
     *
     * Route calculators that use Esri as a data source only calculate routes that are shorter than
     * 400 km.
     *
     * * `Grab` – Grab provides routing functionality for Southeast Asia. For additional information
     * about [GrabMaps](https://docs.aws.amazon.com/location/latest/developerguide/grab.html) '
     * coverage, see [GrabMaps countries and areas
     * covered](https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area)
     * .
     * * `Here` – For additional information about [HERE
     * Technologies](https://docs.aws.amazon.com/location/latest/developerguide/HERE.html) ' coverage
     * in your region of interest, see [HERE car routing
     * coverage](https://docs.aws.amazon.com/https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/car-routing.html)
     * and [HERE truck routing
     * coverage](https://docs.aws.amazon.com/https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/truck-routing.html)
     * .
     *
     * For additional information , see [Data
     * providers](https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html)
     * on the *Amazon Location Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-datasource)
     * @param dataSource Specifies the data provider of traffic and road network data. 
     */
    override fun dataSource(dataSource: String) {
      cdkBuilder.dataSource(dataSource)
    }

    /**
     * The optional description for the route calculator resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-description)
     * @param description The optional description for the route calculator resource. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * No longer used. If included, the only allowed value is `RequestBasedUsage` .
     *
     * *Allowed Values* : `RequestBasedUsage`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-pricingplan)
     * @param pricingPlan No longer used. If included, the only allowed value is `RequestBasedUsage`
     * . 
     */
    override fun pricingPlan(pricingPlan: String) {
      cdkBuilder.pricingPlan(pricingPlan)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html#cfn-location-routecalculator-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.location.CfnRouteCalculator =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.location.CfnRouteCalculator.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRouteCalculator {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRouteCalculator(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnRouteCalculator):
        CfnRouteCalculator = CfnRouteCalculator(cdkObject)

    internal fun unwrap(wrapped: CfnRouteCalculator):
        software.amazon.awscdk.services.location.CfnRouteCalculator = wrapped.cdkObject
  }
}
