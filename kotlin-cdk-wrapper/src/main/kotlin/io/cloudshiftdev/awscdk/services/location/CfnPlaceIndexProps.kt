@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnPlaceIndex`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.location.*;
 * CfnPlaceIndexProps cfnPlaceIndexProps = CfnPlaceIndexProps.builder()
 * .dataSource("dataSource")
 * .indexName("indexName")
 * // the properties below are optional
 * .dataSourceConfiguration(DataSourceConfigurationProperty.builder()
 * .intendedUse("intendedUse")
 * .build())
 * .description("description")
 * .pricingPlan("pricingPlan")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html)
 */
public interface CfnPlaceIndexProps {
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
   * [Esri](https://docs.aws.amazon.com/location/previous/developerguide/esri.html) 's coverage in your
   * region of interest, see [Esri details on geocoding
   * coverage](https://docs.aws.amazon.com/https://developers.arcgis.com/rest/geocode/api-reference/geocode-coverage.htm)
   * .
   * * `Grab` – Grab provides place index functionality for Southeast Asia. For additional
   * information about
   * [GrabMaps](https://docs.aws.amazon.com/location/previous/developerguide/grab.html) ' coverage, see
   * [GrabMaps countries and areas
   * covered](https://docs.aws.amazon.com/location/previous/developerguide/grab.html#grab-coverage-area)
   * .
   * * `Here` – For additional information about [HERE
   * Technologies](https://docs.aws.amazon.com/location/previous/developerguide/HERE.html) ' coverage
   * in your region of interest, see [HERE details on goecoding
   * coverage](https://docs.aws.amazon.com/https://developer.here.com/documentation/geocoder/dev_guide/topics/coverage-geocoder.html)
   * .
   *
   *
   * If you specify HERE Technologies ( `Here` ) as the data provider, you may not [store
   * results](https://docs.aws.amazon.com//location-places/latest/APIReference/API_DataSourceConfiguration.html)
   * for locations in Japan. For more information, see the [AWS service
   * terms](https://docs.aws.amazon.com/service-terms/) for Amazon Location Service.
   *
   *
   * For additional information , see [Data
   * providers](https://docs.aws.amazon.com/location/previous/developerguide/what-is-data-provider.html)
   * on the *Amazon Location Service developer guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-datasource)
   */
  public fun dataSource(): String

  /**
   * Specifies the data storage option requesting Places.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-datasourceconfiguration)
   */
  public fun dataSourceConfiguration(): Any? = unwrap(this).getDataSourceConfiguration()

  /**
   * The optional description for the place index resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

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
   */
  public fun indexName(): String

  /**
   * No longer used. If included, the only allowed value is `RequestBasedUsage` .
   *
   * *Allowed Values* : `RequestBasedUsage`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-pricingplan)
   */
  public fun pricingPlan(): String? = unwrap(this).getPricingPlan()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPlaceIndexProps]
   */
  @CdkDslMarker
  public interface Builder {
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
     * [Esri](https://docs.aws.amazon.com/location/previous/developerguide/esri.html) 's coverage in
     * your region of interest, see [Esri details on geocoding
     * coverage](https://docs.aws.amazon.com/https://developers.arcgis.com/rest/geocode/api-reference/geocode-coverage.htm)
     * .
     * * `Grab` – Grab provides place index functionality for Southeast Asia. For additional
     * information about
     * [GrabMaps](https://docs.aws.amazon.com/location/previous/developerguide/grab.html) ' coverage,
     * see [GrabMaps countries and areas
     * covered](https://docs.aws.amazon.com/location/previous/developerguide/grab.html#grab-coverage-area)
     * .
     * * `Here` – For additional information about [HERE
     * Technologies](https://docs.aws.amazon.com/location/previous/developerguide/HERE.html) ' coverage
     * in your region of interest, see [HERE details on goecoding
     * coverage](https://docs.aws.amazon.com/https://developer.here.com/documentation/geocoder/dev_guide/topics/coverage-geocoder.html)
     * .
     *
     *
     * If you specify HERE Technologies ( `Here` ) as the data provider, you may not [store
     * results](https://docs.aws.amazon.com//location-places/latest/APIReference/API_DataSourceConfiguration.html)
     * for locations in Japan. For more information, see the [AWS service
     * terms](https://docs.aws.amazon.com/service-terms/) for Amazon Location Service.
     *
     *
     * For additional information , see [Data
     * providers](https://docs.aws.amazon.com/location/previous/developerguide/what-is-data-provider.html)
     * on the *Amazon Location Service developer guide* .
     */
    public fun dataSource(dataSource: String)

    /**
     * @param dataSourceConfiguration Specifies the data storage option requesting Places.
     */
    public fun dataSourceConfiguration(dataSourceConfiguration: IResolvable)

    /**
     * @param dataSourceConfiguration Specifies the data storage option requesting Places.
     */
    public
        fun dataSourceConfiguration(dataSourceConfiguration: CfnPlaceIndex.DataSourceConfigurationProperty)

    /**
     * @param dataSourceConfiguration Specifies the data storage option requesting Places.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd1472f42113b3548b0b4141ecc1547e890bf0c79767481109caaba7abca7a42")
    public
        fun dataSourceConfiguration(dataSourceConfiguration: CfnPlaceIndex.DataSourceConfigurationProperty.Builder.() -> Unit)

    /**
     * @param description The optional description for the place index resource.
     */
    public fun description(description: String)

    /**
     * @param indexName The name of the place index resource. 
     * Requirements:
     *
     * * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
     * underscores (_).
     * * Must be a unique place index resource name.
     * * No spaces allowed. For example, `ExamplePlaceIndex` .
     */
    public fun indexName(indexName: String)

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
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnPlaceIndexProps.Builder =
        software.amazon.awscdk.services.location.CfnPlaceIndexProps.builder()

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
     * [Esri](https://docs.aws.amazon.com/location/previous/developerguide/esri.html) 's coverage in
     * your region of interest, see [Esri details on geocoding
     * coverage](https://docs.aws.amazon.com/https://developers.arcgis.com/rest/geocode/api-reference/geocode-coverage.htm)
     * .
     * * `Grab` – Grab provides place index functionality for Southeast Asia. For additional
     * information about
     * [GrabMaps](https://docs.aws.amazon.com/location/previous/developerguide/grab.html) ' coverage,
     * see [GrabMaps countries and areas
     * covered](https://docs.aws.amazon.com/location/previous/developerguide/grab.html#grab-coverage-area)
     * .
     * * `Here` – For additional information about [HERE
     * Technologies](https://docs.aws.amazon.com/location/previous/developerguide/HERE.html) ' coverage
     * in your region of interest, see [HERE details on goecoding
     * coverage](https://docs.aws.amazon.com/https://developer.here.com/documentation/geocoder/dev_guide/topics/coverage-geocoder.html)
     * .
     *
     *
     * If you specify HERE Technologies ( `Here` ) as the data provider, you may not [store
     * results](https://docs.aws.amazon.com//location-places/latest/APIReference/API_DataSourceConfiguration.html)
     * for locations in Japan. For more information, see the [AWS service
     * terms](https://docs.aws.amazon.com/service-terms/) for Amazon Location Service.
     *
     *
     * For additional information , see [Data
     * providers](https://docs.aws.amazon.com/location/previous/developerguide/what-is-data-provider.html)
     * on the *Amazon Location Service developer guide* .
     */
    override fun dataSource(dataSource: String) {
      cdkBuilder.dataSource(dataSource)
    }

    /**
     * @param dataSourceConfiguration Specifies the data storage option requesting Places.
     */
    override fun dataSourceConfiguration(dataSourceConfiguration: IResolvable) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dataSourceConfiguration Specifies the data storage option requesting Places.
     */
    override
        fun dataSourceConfiguration(dataSourceConfiguration: CfnPlaceIndex.DataSourceConfigurationProperty) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(CfnPlaceIndex.DataSourceConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param dataSourceConfiguration Specifies the data storage option requesting Places.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd1472f42113b3548b0b4141ecc1547e890bf0c79767481109caaba7abca7a42")
    override
        fun dataSourceConfiguration(dataSourceConfiguration: CfnPlaceIndex.DataSourceConfigurationProperty.Builder.() -> Unit):
        Unit =
        dataSourceConfiguration(CfnPlaceIndex.DataSourceConfigurationProperty(dataSourceConfiguration))

    /**
     * @param description The optional description for the place index resource.
     */
    override fun description(description: String) {
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
    override fun indexName(indexName: String) {
      cdkBuilder.indexName(indexName)
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

    public fun build(): software.amazon.awscdk.services.location.CfnPlaceIndexProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.location.CfnPlaceIndexProps,
  ) : CdkObject(cdkObject),
      CfnPlaceIndexProps {
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
     * [Esri](https://docs.aws.amazon.com/location/previous/developerguide/esri.html) 's coverage in
     * your region of interest, see [Esri details on geocoding
     * coverage](https://docs.aws.amazon.com/https://developers.arcgis.com/rest/geocode/api-reference/geocode-coverage.htm)
     * .
     * * `Grab` – Grab provides place index functionality for Southeast Asia. For additional
     * information about
     * [GrabMaps](https://docs.aws.amazon.com/location/previous/developerguide/grab.html) ' coverage,
     * see [GrabMaps countries and areas
     * covered](https://docs.aws.amazon.com/location/previous/developerguide/grab.html#grab-coverage-area)
     * .
     * * `Here` – For additional information about [HERE
     * Technologies](https://docs.aws.amazon.com/location/previous/developerguide/HERE.html) ' coverage
     * in your region of interest, see [HERE details on goecoding
     * coverage](https://docs.aws.amazon.com/https://developer.here.com/documentation/geocoder/dev_guide/topics/coverage-geocoder.html)
     * .
     *
     *
     * If you specify HERE Technologies ( `Here` ) as the data provider, you may not [store
     * results](https://docs.aws.amazon.com//location-places/latest/APIReference/API_DataSourceConfiguration.html)
     * for locations in Japan. For more information, see the [AWS service
     * terms](https://docs.aws.amazon.com/service-terms/) for Amazon Location Service.
     *
     *
     * For additional information , see [Data
     * providers](https://docs.aws.amazon.com/location/previous/developerguide/what-is-data-provider.html)
     * on the *Amazon Location Service developer guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-datasource)
     */
    override fun dataSource(): String = unwrap(this).getDataSource()

    /**
     * Specifies the data storage option requesting Places.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-datasourceconfiguration)
     */
    override fun dataSourceConfiguration(): Any? = unwrap(this).getDataSourceConfiguration()

    /**
     * The optional description for the place index resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

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
     */
    override fun indexName(): String = unwrap(this).getIndexName()

    /**
     * No longer used. If included, the only allowed value is `RequestBasedUsage` .
     *
     * *Allowed Values* : `RequestBasedUsage`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-pricingplan)
     */
    override fun pricingPlan(): String? = unwrap(this).getPricingPlan()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPlaceIndexProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnPlaceIndexProps):
        CfnPlaceIndexProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPlaceIndexProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPlaceIndexProps):
        software.amazon.awscdk.services.location.CfnPlaceIndexProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.location.CfnPlaceIndexProps
  }
}
