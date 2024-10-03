@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * import io.cloudshiftdev.awscdk.services.location.*;
 * CfnPlaceIndex cfnPlaceIndex = CfnPlaceIndex.Builder.create(this, "MyCfnPlaceIndex")
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
public open class CfnPlaceIndex(
  cdkObject: software.amazon.awscdk.services.location.CfnPlaceIndex,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPlaceIndexProps,
  ) :
      this(software.amazon.awscdk.services.location.CfnPlaceIndex(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPlaceIndexProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPlaceIndexProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPlaceIndexProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) for the place index resource. Used to specify a resource across
   * AWS .
   *
   * * Format example: `arn:aws:geo:region:account-id:place-index/ExamplePlaceIndex`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The timestamp for when the place index resource was created in [ISO
   * 8601](https://docs.aws.amazon.com/https://www.iso.org/iso-8601-date-and-time-format.html) format:
   * `YYYY-MM-DDThh:mm:ss.sssZ` .
   */
  public open fun attrCreateTime(): String = unwrap(this).getAttrCreateTime()

  /**
   * Synonym for `Arn` .
   *
   * The Amazon Resource Name (ARN) for the place index resource. Used to specify a resource across
   * AWS .
   *
   * * Format example: `arn:aws:geo:region:account-id:place-index/ExamplePlaceIndex`
   */
  public open fun attrIndexArn(): String = unwrap(this).getAttrIndexArn()

  /**
   * The timestamp for when the place index resource was last updated in [ISO
   * 8601](https://docs.aws.amazon.com/https://www.iso.org/iso-8601-date-and-time-format.html) format:
   * `YYYY-MM-DDThh:mm:ss.sssZ` .
   */
  public open fun attrUpdateTime(): String = unwrap(this).getAttrUpdateTime()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Specifies the geospatial data provider for the new place index.
   */
  public open fun dataSource(): String = unwrap(this).getDataSource()

  /**
   * Specifies the geospatial data provider for the new place index.
   */
  public open fun dataSource(`value`: String) {
    unwrap(this).setDataSource(`value`)
  }

  /**
   * Specifies the data storage option requesting Places.
   */
  public open fun dataSourceConfiguration(): Any? = unwrap(this).getDataSourceConfiguration()

  /**
   * Specifies the data storage option requesting Places.
   */
  public open fun dataSourceConfiguration(`value`: IResolvable) {
    unwrap(this).setDataSourceConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies the data storage option requesting Places.
   */
  public open fun dataSourceConfiguration(`value`: DataSourceConfigurationProperty) {
    unwrap(this).setDataSourceConfiguration(`value`.let(DataSourceConfigurationProperty.Companion::unwrap))
  }

  /**
   * Specifies the data storage option requesting Places.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e87fc945104e3c8f90cfb926a34812a24d368dc18d104b6e6eb6721a801a183b")
  public open
      fun dataSourceConfiguration(`value`: DataSourceConfigurationProperty.Builder.() -> Unit): Unit
      = dataSourceConfiguration(DataSourceConfigurationProperty(`value`))

  /**
   * The optional description for the place index resource.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The optional description for the place index resource.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The name of the place index resource.
   */
  public open fun indexName(): String = unwrap(this).getIndexName()

  /**
   * The name of the place index resource.
   */
  public open fun indexName(`value`: String) {
    unwrap(this).setIndexName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.location.CfnPlaceIndex].
   */
  @CdkDslMarker
  public interface Builder {
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
     * information about
     * [GrabMaps](https://docs.aws.amazon.com/location/latest/developerguide/grab.html) ' coverage, see
     * [GrabMaps countries and areas
     * covered](https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area)
     * .
     * * `Here` – For additional information about [HERE
     * Technologies](https://docs.aws.amazon.com/location/latest/developerguide/HERE.html) ' coverage
     * in your region of interest, see [HERE details on goecoding
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
    public fun dataSource(dataSource: String)

    /**
     * Specifies the data storage option requesting Places.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-datasourceconfiguration)
     * @param dataSourceConfiguration Specifies the data storage option requesting Places. 
     */
    public fun dataSourceConfiguration(dataSourceConfiguration: IResolvable)

    /**
     * Specifies the data storage option requesting Places.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-datasourceconfiguration)
     * @param dataSourceConfiguration Specifies the data storage option requesting Places. 
     */
    public fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty)

    /**
     * Specifies the data storage option requesting Places.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-datasourceconfiguration)
     * @param dataSourceConfiguration Specifies the data storage option requesting Places. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57149601d9fc24ae78bce5d24217bbda8def65f5af894dade12f21080b171d51")
    public
        fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty.Builder.() -> Unit)

    /**
     * The optional description for the place index resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-description)
     * @param description The optional description for the place index resource. 
     */
    public fun description(description: String)

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
    public fun indexName(indexName: String)

    /**
     * No longer used. If included, the only allowed value is `RequestBasedUsage` .
     *
     * *Allowed Values* : `RequestBasedUsage`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-pricingplan)
     * @param pricingPlan No longer used. If included, the only allowed value is `RequestBasedUsage`
     * . 
     */
    public fun pricingPlan(pricingPlan: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnPlaceIndex.Builder =
        software.amazon.awscdk.services.location.CfnPlaceIndex.Builder.create(scope, id)

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
     * information about
     * [GrabMaps](https://docs.aws.amazon.com/location/latest/developerguide/grab.html) ' coverage, see
     * [GrabMaps countries and areas
     * covered](https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area)
     * .
     * * `Here` – For additional information about [HERE
     * Technologies](https://docs.aws.amazon.com/location/latest/developerguide/HERE.html) ' coverage
     * in your region of interest, see [HERE details on goecoding
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
    override fun dataSource(dataSource: String) {
      cdkBuilder.dataSource(dataSource)
    }

    /**
     * Specifies the data storage option requesting Places.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-datasourceconfiguration)
     * @param dataSourceConfiguration Specifies the data storage option requesting Places. 
     */
    override fun dataSourceConfiguration(dataSourceConfiguration: IResolvable) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies the data storage option requesting Places.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-datasourceconfiguration)
     * @param dataSourceConfiguration Specifies the data storage option requesting Places. 
     */
    override fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(DataSourceConfigurationProperty.Companion::unwrap))
    }

    /**
     * Specifies the data storage option requesting Places.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-datasourceconfiguration)
     * @param dataSourceConfiguration Specifies the data storage option requesting Places. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57149601d9fc24ae78bce5d24217bbda8def65f5af894dade12f21080b171d51")
    override
        fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty.Builder.() -> Unit):
        Unit = dataSourceConfiguration(DataSourceConfigurationProperty(dataSourceConfiguration))

    /**
     * The optional description for the place index resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-description)
     * @param description The optional description for the place index resource. 
     */
    override fun description(description: String) {
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
    override fun indexName(indexName: String) {
      cdkBuilder.indexName(indexName)
    }

    /**
     * No longer used. If included, the only allowed value is `RequestBasedUsage` .
     *
     * *Allowed Values* : `RequestBasedUsage`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-pricingplan)
     * @param pricingPlan No longer used. If included, the only allowed value is `RequestBasedUsage`
     * . 
     */
    override fun pricingPlan(pricingPlan: String) {
      cdkBuilder.pricingPlan(pricingPlan)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html#cfn-location-placeindex-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.location.CfnPlaceIndex = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.location.CfnPlaceIndex.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPlaceIndex {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPlaceIndex(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnPlaceIndex):
        CfnPlaceIndex = CfnPlaceIndex(cdkObject)

    internal fun unwrap(wrapped: CfnPlaceIndex):
        software.amazon.awscdk.services.location.CfnPlaceIndex = wrapped.cdkObject as
        software.amazon.awscdk.services.location.CfnPlaceIndex
  }

  /**
   * Specifies the data storage option requesting Places.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.location.*;
   * DataSourceConfigurationProperty dataSourceConfigurationProperty =
   * DataSourceConfigurationProperty.builder()
   * .intendedUse("intendedUse")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-placeindex-datasourceconfiguration.html)
   */
  public interface DataSourceConfigurationProperty {
    /**
     * Specifies how the results of an operation will be stored by the caller.
     *
     * Valid values include:
     *
     * * `SingleUse` specifies that the results won't be stored.
     * * `Storage` specifies that the result can be cached or stored in a database.
     *
     * Default value: `SingleUse`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-placeindex-datasourceconfiguration.html#cfn-location-placeindex-datasourceconfiguration-intendeduse)
     */
    public fun intendedUse(): String? = unwrap(this).getIntendedUse()

    /**
     * A builder for [DataSourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param intendedUse Specifies how the results of an operation will be stored by the caller.
       * Valid values include:
       *
       * * `SingleUse` specifies that the results won't be stored.
       * * `Storage` specifies that the result can be cached or stored in a database.
       *
       * Default value: `SingleUse`
       */
      public fun intendedUse(intendedUse: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty.builder()

      /**
       * @param intendedUse Specifies how the results of an operation will be stored by the caller.
       * Valid values include:
       *
       * * `SingleUse` specifies that the results won't be stored.
       * * `Storage` specifies that the result can be cached or stored in a database.
       *
       * Default value: `SingleUse`
       */
      override fun intendedUse(intendedUse: String) {
        cdkBuilder.intendedUse(intendedUse)
      }

      public fun build():
          software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty,
    ) : CdkObject(cdkObject),
        DataSourceConfigurationProperty {
      /**
       * Specifies how the results of an operation will be stored by the caller.
       *
       * Valid values include:
       *
       * * `SingleUse` specifies that the results won't be stored.
       * * `Storage` specifies that the result can be cached or stored in a database.
       *
       * Default value: `SingleUse`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-placeindex-datasourceconfiguration.html#cfn-location-placeindex-datasourceconfiguration-intendeduse)
       */
      override fun intendedUse(): String? = unwrap(this).getIntendedUse()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty):
          DataSourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataSourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceConfigurationProperty):
          software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty
    }
  }
}
