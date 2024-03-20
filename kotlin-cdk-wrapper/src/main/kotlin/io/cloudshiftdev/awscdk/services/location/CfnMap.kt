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
 * The `AWS::Location::Map` resource specifies a map resource in your AWS account, which provides
 * map tiles of different styles sourced from global location data providers.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.location.*;
 * CfnMap cfnMap = CfnMap.Builder.create(this, "MyCfnMap")
 * .configuration(MapConfigurationProperty.builder()
 * .style("style")
 * // the properties below are optional
 * .customLayers(List.of("customLayers"))
 * .politicalView("politicalView")
 * .build())
 * .mapName("mapName")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html)
 */
public open class CfnMap internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.location.CfnMap,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMapProps,
  ) :
      this(software.amazon.awscdk.services.location.CfnMap(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnMapProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMapProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMapProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) for the map resource. Used to specify a resource across all AWS
   * .
   *
   * * Format example: `arn:aws:geo:region:account-id:maps/ExampleMap`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The timestamp for when the map resource was created in [ISO
   * 8601](https://docs.aws.amazon.com/https://www.iso.org/iso-8601-date-and-time-format.html) format:
   * `YYYY-MM-DDThh:mm:ss.sssZ` .
   */
  public open fun attrCreateTime(): String = unwrap(this).getAttrCreateTime()

  /**
   *
   */
  public open fun attrDataSource(): String = unwrap(this).getAttrDataSource()

  /**
   * Synonym for `Arn` .
   *
   * The Amazon Resource Name (ARN) for the map resource. Used to specify a resource across all AWS
   * .
   *
   * * Format example: `arn:aws:geo:region:account-id:maps/ExampleMap`
   */
  public open fun attrMapArn(): String = unwrap(this).getAttrMapArn()

  /**
   * The timestamp for when the map resource was last updated in [ISO
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
   * Specifies the `MapConfiguration` , including the map style, for the map resource that you
   * create.
   */
  public open fun configuration(): Any = unwrap(this).getConfiguration()

  /**
   * Specifies the `MapConfiguration` , including the map style, for the map resource that you
   * create.
   */
  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the `MapConfiguration` , including the map style, for the map resource that you
   * create.
   */
  public open fun configuration(`value`: MapConfigurationProperty) {
    unwrap(this).setConfiguration(`value`.let(MapConfigurationProperty::unwrap))
  }

  /**
   * Specifies the `MapConfiguration` , including the map style, for the map resource that you
   * create.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3fb73b3b0c94a0a1b10d0adb4530f553d086a0ad2e915616eb379f5666d696c2")
  public open fun configuration(`value`: MapConfigurationProperty.Builder.() -> Unit): Unit =
      configuration(MapConfigurationProperty(`value`))

  /**
   * An optional description for the map resource.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * An optional description for the map resource.
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
   * The name for the map resource.
   */
  public open fun mapName(): String = unwrap(this).getMapName()

  /**
   * The name for the map resource.
   */
  public open fun mapName(`value`: String) {
    unwrap(this).setMapName(`value`)
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
   * Applies one or more tags to the map resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Applies one or more tags to the map resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * Applies one or more tags to the map resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.location.CfnMap].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the `MapConfiguration` , including the map style, for the map resource that you
     * create.
     *
     * The map style defines the look of maps and the data provider for your map resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-configuration)
     * @param configuration Specifies the `MapConfiguration` , including the map style, for the map
     * resource that you create. 
     */
    public fun configuration(configuration: IResolvable)

    /**
     * Specifies the `MapConfiguration` , including the map style, for the map resource that you
     * create.
     *
     * The map style defines the look of maps and the data provider for your map resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-configuration)
     * @param configuration Specifies the `MapConfiguration` , including the map style, for the map
     * resource that you create. 
     */
    public fun configuration(configuration: MapConfigurationProperty)

    /**
     * Specifies the `MapConfiguration` , including the map style, for the map resource that you
     * create.
     *
     * The map style defines the look of maps and the data provider for your map resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-configuration)
     * @param configuration Specifies the `MapConfiguration` , including the map style, for the map
     * resource that you create. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18e1cd3843bc1dff5c3e6ee70ca7afa1d72f5ecd09d554cc7bc1b6ccb92db904")
    public fun configuration(configuration: MapConfigurationProperty.Builder.() -> Unit)

    /**
     * An optional description for the map resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-description)
     * @param description An optional description for the map resource. 
     */
    public fun description(description: String)

    /**
     * The name for the map resource.
     *
     * Requirements:
     *
     * * Must contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
     * underscores (_).
     * * Must be a unique map resource name.
     * * No spaces allowed. For example, `ExampleMap` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-mapname)
     * @param mapName The name for the map resource. 
     */
    public fun mapName(mapName: String)

    /**
     * No longer used. If included, the only allowed value is `RequestBasedUsage` .
     *
     * *Allowed Values* : `RequestBasedUsage`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-pricingplan)
     * @param pricingPlan No longer used. If included, the only allowed value is `RequestBasedUsage`
     * . 
     */
    public fun pricingPlan(pricingPlan: String)

    /**
     * Applies one or more tags to the map resource.
     *
     * A tag is a key-value pair helps manage, identify, search, and filter your resources by
     * labelling them.
     *
     * Format: `"key" : "value"`
     *
     * Restrictions:
     *
     * * Maximum 50 tags per resource
     * * Each resource tag must be unique with a maximum of one value.
     * * Maximum key length: 128 Unicode characters in UTF-8
     * * Maximum value length: 256 Unicode characters in UTF-8
     * * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ :
     * /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-tags)
     * @param tags Applies one or more tags to the map resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Applies one or more tags to the map resource.
     *
     * A tag is a key-value pair helps manage, identify, search, and filter your resources by
     * labelling them.
     *
     * Format: `"key" : "value"`
     *
     * Restrictions:
     *
     * * Maximum 50 tags per resource
     * * Each resource tag must be unique with a maximum of one value.
     * * Maximum key length: 128 Unicode characters in UTF-8
     * * Maximum value length: 256 Unicode characters in UTF-8
     * * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ :
     * /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-tags)
     * @param tags Applies one or more tags to the map resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnMap.Builder =
        software.amazon.awscdk.services.location.CfnMap.Builder.create(scope, id)

    /**
     * Specifies the `MapConfiguration` , including the map style, for the map resource that you
     * create.
     *
     * The map style defines the look of maps and the data provider for your map resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-configuration)
     * @param configuration Specifies the `MapConfiguration` , including the map style, for the map
     * resource that you create. 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    /**
     * Specifies the `MapConfiguration` , including the map style, for the map resource that you
     * create.
     *
     * The map style defines the look of maps and the data provider for your map resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-configuration)
     * @param configuration Specifies the `MapConfiguration` , including the map style, for the map
     * resource that you create. 
     */
    override fun configuration(configuration: MapConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(MapConfigurationProperty::unwrap))
    }

    /**
     * Specifies the `MapConfiguration` , including the map style, for the map resource that you
     * create.
     *
     * The map style defines the look of maps and the data provider for your map resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-configuration)
     * @param configuration Specifies the `MapConfiguration` , including the map style, for the map
     * resource that you create. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18e1cd3843bc1dff5c3e6ee70ca7afa1d72f5ecd09d554cc7bc1b6ccb92db904")
    override fun configuration(configuration: MapConfigurationProperty.Builder.() -> Unit): Unit =
        configuration(MapConfigurationProperty(configuration))

    /**
     * An optional description for the map resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-description)
     * @param description An optional description for the map resource. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name for the map resource.
     *
     * Requirements:
     *
     * * Must contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
     * underscores (_).
     * * Must be a unique map resource name.
     * * No spaces allowed. For example, `ExampleMap` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-mapname)
     * @param mapName The name for the map resource. 
     */
    override fun mapName(mapName: String) {
      cdkBuilder.mapName(mapName)
    }

    /**
     * No longer used. If included, the only allowed value is `RequestBasedUsage` .
     *
     * *Allowed Values* : `RequestBasedUsage`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-pricingplan)
     * @param pricingPlan No longer used. If included, the only allowed value is `RequestBasedUsage`
     * . 
     */
    override fun pricingPlan(pricingPlan: String) {
      cdkBuilder.pricingPlan(pricingPlan)
    }

    /**
     * Applies one or more tags to the map resource.
     *
     * A tag is a key-value pair helps manage, identify, search, and filter your resources by
     * labelling them.
     *
     * Format: `"key" : "value"`
     *
     * Restrictions:
     *
     * * Maximum 50 tags per resource
     * * Each resource tag must be unique with a maximum of one value.
     * * Maximum key length: 128 Unicode characters in UTF-8
     * * Maximum value length: 256 Unicode characters in UTF-8
     * * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ :
     * /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-tags)
     * @param tags Applies one or more tags to the map resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Applies one or more tags to the map resource.
     *
     * A tag is a key-value pair helps manage, identify, search, and filter your resources by
     * labelling them.
     *
     * Format: `"key" : "value"`
     *
     * Restrictions:
     *
     * * Maximum 50 tags per resource
     * * Each resource tag must be unique with a maximum of one value.
     * * Maximum key length: 128 Unicode characters in UTF-8
     * * Maximum value length: 256 Unicode characters in UTF-8
     * * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ :
     * /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-tags)
     * @param tags Applies one or more tags to the map resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.location.CfnMap = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.location.CfnMap.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMap {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMap(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnMap): CfnMap =
        CfnMap(cdkObject)

    internal fun unwrap(wrapped: CfnMap): software.amazon.awscdk.services.location.CfnMap =
        wrapped.cdkObject
  }

  /**
   * Specifies the map tile style selected from an available provider.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.location.*;
   * MapConfigurationProperty mapConfigurationProperty = MapConfigurationProperty.builder()
   * .style("style")
   * // the properties below are optional
   * .customLayers(List.of("customLayers"))
   * .politicalView("politicalView")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-map-mapconfiguration.html)
   */
  public interface MapConfigurationProperty {
    /**
     * Specifies the custom layers for the style.
     *
     * Leave unset to not enable any custom layer, or, for styles that support custom layers, you
     * can enable layer(s), such as the `POI` layer for the VectorEsriNavigation style.
     *
     *
     * Currenlty only `VectorEsriNavigation` supports CustomLayers. For more information, see
     * [Custom
     * Layers](https://docs.aws.amazon.com//location/latest/developerguide/map-concepts.html#map-custom-layers)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-map-mapconfiguration.html#cfn-location-map-mapconfiguration-customlayers)
     */
    public fun customLayers(): List<String> = unwrap(this).getCustomLayers() ?: emptyList()

    /**
     * Specifies the map political view selected from an available data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-map-mapconfiguration.html#cfn-location-map-mapconfiguration-politicalview)
     */
    public fun politicalView(): String? = unwrap(this).getPoliticalView()

    /**
     * Specifies the map style selected from an available data provider.
     *
     * Valid [Esri map styles](https://docs.aws.amazon.com/location/latest/developerguide/esri.html)
     * :
     *
     * * `VectorEsriNavigation` – The Esri Navigation map style, which provides a detailed basemap
     * for the world symbolized with a custom navigation map style that's designed for use during the
     * day in mobile devices. It also includes a richer set of places, such as shops, services,
     * restaurants, attractions, and other points of interest. Enable the `POI` layer by setting it in
     * CustomLayers to leverage the additional places data.
     * * `RasterEsriImagery` – The Esri Imagery map style. A raster basemap that provides one meter
     * or better satellite and aerial imagery in many parts of the world and lower resolution satellite
     * imagery worldwide.
     * * `VectorEsriLightGrayCanvas` – The Esri Light Gray Canvas map style, which provides a
     * detailed vector basemap with a light gray, neutral background style with minimal colors, labels,
     * and features that's designed to draw attention to your thematic content.
     * * `VectorEsriTopographic` – The Esri Light map style, which provides a detailed vector
     * basemap with a classic Esri map style.
     * * `VectorEsriStreets` – The Esri Street Map style, which provides a detailed vector basemap
     * for the world symbolized with a classic Esri street map style. The vector tile layer is similar
     * in content and style to the World Street Map raster map.
     * * `VectorEsriDarkGrayCanvas` – The Esri Dark Gray Canvas map style. A vector basemap with a
     * dark gray, neutral background with minimal colors, labels, and features that's designed to draw
     * attention to your thematic content.
     *
     * Valid [HERE Technologies map
     * styles](https://docs.aws.amazon.com/location/latest/developerguide/HERE.html) :
     *
     * * `VectorHereExplore` – A default HERE map style containing a neutral, global map and its
     * features including roads, buildings, landmarks, and water features. It also now includes a fully
     * designed map of Japan.
     * * `RasterHereExploreSatellite` – A global map containing high resolution satellite imagery.
     * * `HybridHereExploreSatellite` – A global map displaying the road network, street names, and
     * city labels over satellite imagery. This style will automatically retrieve both raster and
     * vector tiles, and your charges will be based on total tiles retrieved.
     *
     *
     * Hybrid styles use both vector and raster tiles when rendering the map that you see. This
     * means that more tiles are retrieved than when using either vector or raster tiles alone. Your
     * charges will include all tiles retrieved.
     *
     *
     * * `VectorHereContrast` – The HERE Contrast (Berlin) map style is a high contrast detailed
     * base map of the world that blends 3D and 2D rendering.
     *
     *
     * The `VectorHereContrast` style has been renamed from `VectorHereBerlin` . `VectorHereBerlin`
     * has been deprecated, but will continue to work in applications that use it.
     *
     *
     * * `VectorHereExploreTruck` – A global map containing truck restrictions and attributes (e.g.
     * width / height / HAZMAT) symbolized with highlighted segments and icons on top of HERE Explore
     * to support use cases within transport and logistics.
     *
     * Valid [GrabMaps map
     * styles](https://docs.aws.amazon.com/location/latest/developerguide/grab.html) :
     *
     * * `VectorGrabStandardLight` – The Grab Standard Light map style provides a basemap with
     * detailed land use coloring, area names, roads, landmarks, and points of interest covering
     * Southeast Asia.
     * * `VectorGrabStandardDark` – The Grab Standard Dark map style provides a dark variation of
     * the standard basemap covering Southeast Asia.
     *
     *
     * Grab provides maps only for countries in Southeast Asia, and is only available in the Asia
     * Pacific (Singapore) Region ( `ap-southeast-1` ). For more information, see [GrabMaps countries
     * and area
     * covered](https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area)
     * .
     *
     *
     * Valid [Open Data map
     * styles](https://docs.aws.amazon.com/location/latest/developerguide/open-data.html) :
     *
     * * `VectorOpenDataStandardLight` – The Open Data Standard Light map style provides a detailed
     * basemap for the world suitable for website and mobile application use. The map includes highways
     * major roads, minor roads, railways, water features, cities, parks, landmarks, building
     * footprints, and administrative boundaries.
     * * `VectorOpenDataStandardDark` – Open Data Standard Dark is a dark-themed map style that
     * provides a detailed basemap for the world suitable for website and mobile application use. The
     * map includes highways major roads, minor roads, railways, water features, cities, parks,
     * landmarks, building footprints, and administrative boundaries.
     * * `VectorOpenDataVisualizationLight` – The Open Data Visualization Light map style is a
     * light-themed style with muted colors and fewer features that aids in understanding overlaid
     * data.
     * * `VectorOpenDataVisualizationDark` – The Open Data Visualization Dark map style is a
     * dark-themed style with muted colors and fewer features that aids in understanding overlaid data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-map-mapconfiguration.html#cfn-location-map-mapconfiguration-style)
     */
    public fun style(): String

    /**
     * A builder for [MapConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customLayers Specifies the custom layers for the style.
       * Leave unset to not enable any custom layer, or, for styles that support custom layers, you
       * can enable layer(s), such as the `POI` layer for the VectorEsriNavigation style.
       *
       *
       * Currenlty only `VectorEsriNavigation` supports CustomLayers. For more information, see
       * [Custom
       * Layers](https://docs.aws.amazon.com//location/latest/developerguide/map-concepts.html#map-custom-layers)
       * .
       */
      public fun customLayers(customLayers: List<String>)

      /**
       * @param customLayers Specifies the custom layers for the style.
       * Leave unset to not enable any custom layer, or, for styles that support custom layers, you
       * can enable layer(s), such as the `POI` layer for the VectorEsriNavigation style.
       *
       *
       * Currenlty only `VectorEsriNavigation` supports CustomLayers. For more information, see
       * [Custom
       * Layers](https://docs.aws.amazon.com//location/latest/developerguide/map-concepts.html#map-custom-layers)
       * .
       */
      public fun customLayers(vararg customLayers: String)

      /**
       * @param politicalView Specifies the map political view selected from an available data
       * provider.
       */
      public fun politicalView(politicalView: String)

      /**
       * @param style Specifies the map style selected from an available data provider. 
       * Valid [Esri map
       * styles](https://docs.aws.amazon.com/location/latest/developerguide/esri.html) :
       *
       * * `VectorEsriNavigation` – The Esri Navigation map style, which provides a detailed basemap
       * for the world symbolized with a custom navigation map style that's designed for use during the
       * day in mobile devices. It also includes a richer set of places, such as shops, services,
       * restaurants, attractions, and other points of interest. Enable the `POI` layer by setting it
       * in CustomLayers to leverage the additional places data.
       * * `RasterEsriImagery` – The Esri Imagery map style. A raster basemap that provides one
       * meter or better satellite and aerial imagery in many parts of the world and lower resolution
       * satellite imagery worldwide.
       * * `VectorEsriLightGrayCanvas` – The Esri Light Gray Canvas map style, which provides a
       * detailed vector basemap with a light gray, neutral background style with minimal colors,
       * labels, and features that's designed to draw attention to your thematic content.
       * * `VectorEsriTopographic` – The Esri Light map style, which provides a detailed vector
       * basemap with a classic Esri map style.
       * * `VectorEsriStreets` – The Esri Street Map style, which provides a detailed vector basemap
       * for the world symbolized with a classic Esri street map style. The vector tile layer is
       * similar in content and style to the World Street Map raster map.
       * * `VectorEsriDarkGrayCanvas` – The Esri Dark Gray Canvas map style. A vector basemap with a
       * dark gray, neutral background with minimal colors, labels, and features that's designed to
       * draw attention to your thematic content.
       *
       * Valid [HERE Technologies map
       * styles](https://docs.aws.amazon.com/location/latest/developerguide/HERE.html) :
       *
       * * `VectorHereExplore` – A default HERE map style containing a neutral, global map and its
       * features including roads, buildings, landmarks, and water features. It also now includes a
       * fully designed map of Japan.
       * * `RasterHereExploreSatellite` – A global map containing high resolution satellite imagery.
       * * `HybridHereExploreSatellite` – A global map displaying the road network, street names,
       * and city labels over satellite imagery. This style will automatically retrieve both raster and
       * vector tiles, and your charges will be based on total tiles retrieved.
       *
       *
       * Hybrid styles use both vector and raster tiles when rendering the map that you see. This
       * means that more tiles are retrieved than when using either vector or raster tiles alone. Your
       * charges will include all tiles retrieved.
       *
       *
       * * `VectorHereContrast` – The HERE Contrast (Berlin) map style is a high contrast detailed
       * base map of the world that blends 3D and 2D rendering.
       *
       *
       * The `VectorHereContrast` style has been renamed from `VectorHereBerlin` .
       * `VectorHereBerlin` has been deprecated, but will continue to work in applications that use it.
       *
       *
       * * `VectorHereExploreTruck` – A global map containing truck restrictions and attributes
       * (e.g. width / height / HAZMAT) symbolized with highlighted segments and icons on top of HERE
       * Explore to support use cases within transport and logistics.
       *
       * Valid [GrabMaps map
       * styles](https://docs.aws.amazon.com/location/latest/developerguide/grab.html) :
       *
       * * `VectorGrabStandardLight` – The Grab Standard Light map style provides a basemap with
       * detailed land use coloring, area names, roads, landmarks, and points of interest covering
       * Southeast Asia.
       * * `VectorGrabStandardDark` – The Grab Standard Dark map style provides a dark variation of
       * the standard basemap covering Southeast Asia.
       *
       *
       * Grab provides maps only for countries in Southeast Asia, and is only available in the Asia
       * Pacific (Singapore) Region ( `ap-southeast-1` ). For more information, see [GrabMaps countries
       * and area
       * covered](https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area)
       * .
       *
       *
       * Valid [Open Data map
       * styles](https://docs.aws.amazon.com/location/latest/developerguide/open-data.html) :
       *
       * * `VectorOpenDataStandardLight` – The Open Data Standard Light map style provides a
       * detailed basemap for the world suitable for website and mobile application use. The map
       * includes highways major roads, minor roads, railways, water features, cities, parks,
       * landmarks, building footprints, and administrative boundaries.
       * * `VectorOpenDataStandardDark` – Open Data Standard Dark is a dark-themed map style that
       * provides a detailed basemap for the world suitable for website and mobile application use. The
       * map includes highways major roads, minor roads, railways, water features, cities, parks,
       * landmarks, building footprints, and administrative boundaries.
       * * `VectorOpenDataVisualizationLight` – The Open Data Visualization Light map style is a
       * light-themed style with muted colors and fewer features that aids in understanding overlaid
       * data.
       * * `VectorOpenDataVisualizationDark` – The Open Data Visualization Dark map style is a
       * dark-themed style with muted colors and fewer features that aids in understanding overlaid
       * data.
       */
      public fun style(style: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.location.CfnMap.MapConfigurationProperty.Builder =
          software.amazon.awscdk.services.location.CfnMap.MapConfigurationProperty.builder()

      /**
       * @param customLayers Specifies the custom layers for the style.
       * Leave unset to not enable any custom layer, or, for styles that support custom layers, you
       * can enable layer(s), such as the `POI` layer for the VectorEsriNavigation style.
       *
       *
       * Currenlty only `VectorEsriNavigation` supports CustomLayers. For more information, see
       * [Custom
       * Layers](https://docs.aws.amazon.com//location/latest/developerguide/map-concepts.html#map-custom-layers)
       * .
       */
      override fun customLayers(customLayers: List<String>) {
        cdkBuilder.customLayers(customLayers)
      }

      /**
       * @param customLayers Specifies the custom layers for the style.
       * Leave unset to not enable any custom layer, or, for styles that support custom layers, you
       * can enable layer(s), such as the `POI` layer for the VectorEsriNavigation style.
       *
       *
       * Currenlty only `VectorEsriNavigation` supports CustomLayers. For more information, see
       * [Custom
       * Layers](https://docs.aws.amazon.com//location/latest/developerguide/map-concepts.html#map-custom-layers)
       * .
       */
      override fun customLayers(vararg customLayers: String): Unit =
          customLayers(customLayers.toList())

      /**
       * @param politicalView Specifies the map political view selected from an available data
       * provider.
       */
      override fun politicalView(politicalView: String) {
        cdkBuilder.politicalView(politicalView)
      }

      /**
       * @param style Specifies the map style selected from an available data provider. 
       * Valid [Esri map
       * styles](https://docs.aws.amazon.com/location/latest/developerguide/esri.html) :
       *
       * * `VectorEsriNavigation` – The Esri Navigation map style, which provides a detailed basemap
       * for the world symbolized with a custom navigation map style that's designed for use during the
       * day in mobile devices. It also includes a richer set of places, such as shops, services,
       * restaurants, attractions, and other points of interest. Enable the `POI` layer by setting it
       * in CustomLayers to leverage the additional places data.
       * * `RasterEsriImagery` – The Esri Imagery map style. A raster basemap that provides one
       * meter or better satellite and aerial imagery in many parts of the world and lower resolution
       * satellite imagery worldwide.
       * * `VectorEsriLightGrayCanvas` – The Esri Light Gray Canvas map style, which provides a
       * detailed vector basemap with a light gray, neutral background style with minimal colors,
       * labels, and features that's designed to draw attention to your thematic content.
       * * `VectorEsriTopographic` – The Esri Light map style, which provides a detailed vector
       * basemap with a classic Esri map style.
       * * `VectorEsriStreets` – The Esri Street Map style, which provides a detailed vector basemap
       * for the world symbolized with a classic Esri street map style. The vector tile layer is
       * similar in content and style to the World Street Map raster map.
       * * `VectorEsriDarkGrayCanvas` – The Esri Dark Gray Canvas map style. A vector basemap with a
       * dark gray, neutral background with minimal colors, labels, and features that's designed to
       * draw attention to your thematic content.
       *
       * Valid [HERE Technologies map
       * styles](https://docs.aws.amazon.com/location/latest/developerguide/HERE.html) :
       *
       * * `VectorHereExplore` – A default HERE map style containing a neutral, global map and its
       * features including roads, buildings, landmarks, and water features. It also now includes a
       * fully designed map of Japan.
       * * `RasterHereExploreSatellite` – A global map containing high resolution satellite imagery.
       * * `HybridHereExploreSatellite` – A global map displaying the road network, street names,
       * and city labels over satellite imagery. This style will automatically retrieve both raster and
       * vector tiles, and your charges will be based on total tiles retrieved.
       *
       *
       * Hybrid styles use both vector and raster tiles when rendering the map that you see. This
       * means that more tiles are retrieved than when using either vector or raster tiles alone. Your
       * charges will include all tiles retrieved.
       *
       *
       * * `VectorHereContrast` – The HERE Contrast (Berlin) map style is a high contrast detailed
       * base map of the world that blends 3D and 2D rendering.
       *
       *
       * The `VectorHereContrast` style has been renamed from `VectorHereBerlin` .
       * `VectorHereBerlin` has been deprecated, but will continue to work in applications that use it.
       *
       *
       * * `VectorHereExploreTruck` – A global map containing truck restrictions and attributes
       * (e.g. width / height / HAZMAT) symbolized with highlighted segments and icons on top of HERE
       * Explore to support use cases within transport and logistics.
       *
       * Valid [GrabMaps map
       * styles](https://docs.aws.amazon.com/location/latest/developerguide/grab.html) :
       *
       * * `VectorGrabStandardLight` – The Grab Standard Light map style provides a basemap with
       * detailed land use coloring, area names, roads, landmarks, and points of interest covering
       * Southeast Asia.
       * * `VectorGrabStandardDark` – The Grab Standard Dark map style provides a dark variation of
       * the standard basemap covering Southeast Asia.
       *
       *
       * Grab provides maps only for countries in Southeast Asia, and is only available in the Asia
       * Pacific (Singapore) Region ( `ap-southeast-1` ). For more information, see [GrabMaps countries
       * and area
       * covered](https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area)
       * .
       *
       *
       * Valid [Open Data map
       * styles](https://docs.aws.amazon.com/location/latest/developerguide/open-data.html) :
       *
       * * `VectorOpenDataStandardLight` – The Open Data Standard Light map style provides a
       * detailed basemap for the world suitable for website and mobile application use. The map
       * includes highways major roads, minor roads, railways, water features, cities, parks,
       * landmarks, building footprints, and administrative boundaries.
       * * `VectorOpenDataStandardDark` – Open Data Standard Dark is a dark-themed map style that
       * provides a detailed basemap for the world suitable for website and mobile application use. The
       * map includes highways major roads, minor roads, railways, water features, cities, parks,
       * landmarks, building footprints, and administrative boundaries.
       * * `VectorOpenDataVisualizationLight` – The Open Data Visualization Light map style is a
       * light-themed style with muted colors and fewer features that aids in understanding overlaid
       * data.
       * * `VectorOpenDataVisualizationDark` – The Open Data Visualization Dark map style is a
       * dark-themed style with muted colors and fewer features that aids in understanding overlaid
       * data.
       */
      override fun style(style: String) {
        cdkBuilder.style(style)
      }

      public fun build(): software.amazon.awscdk.services.location.CfnMap.MapConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.location.CfnMap.MapConfigurationProperty,
    ) : CdkObject(cdkObject), MapConfigurationProperty {
      /**
       * Specifies the custom layers for the style.
       *
       * Leave unset to not enable any custom layer, or, for styles that support custom layers, you
       * can enable layer(s), such as the `POI` layer for the VectorEsriNavigation style.
       *
       *
       * Currenlty only `VectorEsriNavigation` supports CustomLayers. For more information, see
       * [Custom
       * Layers](https://docs.aws.amazon.com//location/latest/developerguide/map-concepts.html#map-custom-layers)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-map-mapconfiguration.html#cfn-location-map-mapconfiguration-customlayers)
       */
      override fun customLayers(): List<String> = unwrap(this).getCustomLayers() ?: emptyList()

      /**
       * Specifies the map political view selected from an available data provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-map-mapconfiguration.html#cfn-location-map-mapconfiguration-politicalview)
       */
      override fun politicalView(): String? = unwrap(this).getPoliticalView()

      /**
       * Specifies the map style selected from an available data provider.
       *
       * Valid [Esri map
       * styles](https://docs.aws.amazon.com/location/latest/developerguide/esri.html) :
       *
       * * `VectorEsriNavigation` – The Esri Navigation map style, which provides a detailed basemap
       * for the world symbolized with a custom navigation map style that's designed for use during the
       * day in mobile devices. It also includes a richer set of places, such as shops, services,
       * restaurants, attractions, and other points of interest. Enable the `POI` layer by setting it
       * in CustomLayers to leverage the additional places data.
       * * `RasterEsriImagery` – The Esri Imagery map style. A raster basemap that provides one
       * meter or better satellite and aerial imagery in many parts of the world and lower resolution
       * satellite imagery worldwide.
       * * `VectorEsriLightGrayCanvas` – The Esri Light Gray Canvas map style, which provides a
       * detailed vector basemap with a light gray, neutral background style with minimal colors,
       * labels, and features that's designed to draw attention to your thematic content.
       * * `VectorEsriTopographic` – The Esri Light map style, which provides a detailed vector
       * basemap with a classic Esri map style.
       * * `VectorEsriStreets` – The Esri Street Map style, which provides a detailed vector basemap
       * for the world symbolized with a classic Esri street map style. The vector tile layer is
       * similar in content and style to the World Street Map raster map.
       * * `VectorEsriDarkGrayCanvas` – The Esri Dark Gray Canvas map style. A vector basemap with a
       * dark gray, neutral background with minimal colors, labels, and features that's designed to
       * draw attention to your thematic content.
       *
       * Valid [HERE Technologies map
       * styles](https://docs.aws.amazon.com/location/latest/developerguide/HERE.html) :
       *
       * * `VectorHereExplore` – A default HERE map style containing a neutral, global map and its
       * features including roads, buildings, landmarks, and water features. It also now includes a
       * fully designed map of Japan.
       * * `RasterHereExploreSatellite` – A global map containing high resolution satellite imagery.
       * * `HybridHereExploreSatellite` – A global map displaying the road network, street names,
       * and city labels over satellite imagery. This style will automatically retrieve both raster and
       * vector tiles, and your charges will be based on total tiles retrieved.
       *
       *
       * Hybrid styles use both vector and raster tiles when rendering the map that you see. This
       * means that more tiles are retrieved than when using either vector or raster tiles alone. Your
       * charges will include all tiles retrieved.
       *
       *
       * * `VectorHereContrast` – The HERE Contrast (Berlin) map style is a high contrast detailed
       * base map of the world that blends 3D and 2D rendering.
       *
       *
       * The `VectorHereContrast` style has been renamed from `VectorHereBerlin` .
       * `VectorHereBerlin` has been deprecated, but will continue to work in applications that use it.
       *
       *
       * * `VectorHereExploreTruck` – A global map containing truck restrictions and attributes
       * (e.g. width / height / HAZMAT) symbolized with highlighted segments and icons on top of HERE
       * Explore to support use cases within transport and logistics.
       *
       * Valid [GrabMaps map
       * styles](https://docs.aws.amazon.com/location/latest/developerguide/grab.html) :
       *
       * * `VectorGrabStandardLight` – The Grab Standard Light map style provides a basemap with
       * detailed land use coloring, area names, roads, landmarks, and points of interest covering
       * Southeast Asia.
       * * `VectorGrabStandardDark` – The Grab Standard Dark map style provides a dark variation of
       * the standard basemap covering Southeast Asia.
       *
       *
       * Grab provides maps only for countries in Southeast Asia, and is only available in the Asia
       * Pacific (Singapore) Region ( `ap-southeast-1` ). For more information, see [GrabMaps countries
       * and area
       * covered](https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area)
       * .
       *
       *
       * Valid [Open Data map
       * styles](https://docs.aws.amazon.com/location/latest/developerguide/open-data.html) :
       *
       * * `VectorOpenDataStandardLight` – The Open Data Standard Light map style provides a
       * detailed basemap for the world suitable for website and mobile application use. The map
       * includes highways major roads, minor roads, railways, water features, cities, parks,
       * landmarks, building footprints, and administrative boundaries.
       * * `VectorOpenDataStandardDark` – Open Data Standard Dark is a dark-themed map style that
       * provides a detailed basemap for the world suitable for website and mobile application use. The
       * map includes highways major roads, minor roads, railways, water features, cities, parks,
       * landmarks, building footprints, and administrative boundaries.
       * * `VectorOpenDataVisualizationLight` – The Open Data Visualization Light map style is a
       * light-themed style with muted colors and fewer features that aids in understanding overlaid
       * data.
       * * `VectorOpenDataVisualizationDark` – The Open Data Visualization Dark map style is a
       * dark-themed style with muted colors and fewer features that aids in understanding overlaid
       * data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-map-mapconfiguration.html#cfn-location-map-mapconfiguration-style)
       */
      override fun style(): String = unwrap(this).getStyle()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MapConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnMap.MapConfigurationProperty):
          MapConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? MapConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MapConfigurationProperty):
          software.amazon.awscdk.services.location.CfnMap.MapConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.location.CfnMap.MapConfigurationProperty
    }
  }
}
