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
 * Properties for defining a `CfnMap`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.location.*;
 * CfnMapProps cfnMapProps = CfnMapProps.builder()
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
public interface CfnMapProps {
  /**
   * Specifies the `MapConfiguration` , including the map style, for the map resource that you
   * create.
   *
   * The map style defines the look of maps and the data provider for your map resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-configuration)
   */
  public fun configuration(): Any

  /**
   * An optional description for the map resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

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
   */
  public fun mapName(): String

  /**
   * No longer used. If included, the only allowed value is `RequestBasedUsage` .
   *
   * *Allowed Values* : `RequestBasedUsage`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-pricingplan)
   */
  public fun pricingPlan(): String? = unwrap(this).getPricingPlan()

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
   * * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : /
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnMapProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configuration Specifies the `MapConfiguration` , including the map style, for the map
     * resource that you create. 
     * The map style defines the look of maps and the data provider for your map resource.
     */
    public fun configuration(configuration: IResolvable)

    /**
     * @param configuration Specifies the `MapConfiguration` , including the map style, for the map
     * resource that you create. 
     * The map style defines the look of maps and the data provider for your map resource.
     */
    public fun configuration(configuration: CfnMap.MapConfigurationProperty)

    /**
     * @param configuration Specifies the `MapConfiguration` , including the map style, for the map
     * resource that you create. 
     * The map style defines the look of maps and the data provider for your map resource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("afdd544c6a3d1f2315e21a5d2e3d6af304d7d1f110a39479a7e8f5c96d186267")
    public fun configuration(configuration: CfnMap.MapConfigurationProperty.Builder.() -> Unit)

    /**
     * @param description An optional description for the map resource.
     */
    public fun description(description: String)

    /**
     * @param mapName The name for the map resource. 
     * Requirements:
     *
     * * Must contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
     * underscores (_).
     * * Must be a unique map resource name.
     * * No spaces allowed. For example, `ExampleMap` .
     */
    public fun mapName(mapName: String)

    /**
     * @param pricingPlan No longer used. If included, the only allowed value is `RequestBasedUsage`
     * .
     * *Allowed Values* : `RequestBasedUsage`
     */
    public fun pricingPlan(pricingPlan: String)

    /**
     * @param tags Applies one or more tags to the map resource.
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
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Applies one or more tags to the map resource.
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
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnMapProps.Builder =
        software.amazon.awscdk.services.location.CfnMapProps.builder()

    /**
     * @param configuration Specifies the `MapConfiguration` , including the map style, for the map
     * resource that you create. 
     * The map style defines the look of maps and the data provider for your map resource.
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    /**
     * @param configuration Specifies the `MapConfiguration` , including the map style, for the map
     * resource that you create. 
     * The map style defines the look of maps and the data provider for your map resource.
     */
    override fun configuration(configuration: CfnMap.MapConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(CfnMap.MapConfigurationProperty::unwrap))
    }

    /**
     * @param configuration Specifies the `MapConfiguration` , including the map style, for the map
     * resource that you create. 
     * The map style defines the look of maps and the data provider for your map resource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("afdd544c6a3d1f2315e21a5d2e3d6af304d7d1f110a39479a7e8f5c96d186267")
    override fun configuration(configuration: CfnMap.MapConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(CfnMap.MapConfigurationProperty(configuration))

    /**
     * @param description An optional description for the map resource.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param mapName The name for the map resource. 
     * Requirements:
     *
     * * Must contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
     * underscores (_).
     * * Must be a unique map resource name.
     * * No spaces allowed. For example, `ExampleMap` .
     */
    override fun mapName(mapName: String) {
      cdkBuilder.mapName(mapName)
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
     * @param tags Applies one or more tags to the map resource.
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
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Applies one or more tags to the map resource.
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
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.location.CfnMapProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.location.CfnMapProps,
  ) : CdkObject(cdkObject), CfnMapProps {
    /**
     * Specifies the `MapConfiguration` , including the map style, for the map resource that you
     * create.
     *
     * The map style defines the look of maps and the data provider for your map resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-configuration)
     */
    override fun configuration(): Any = unwrap(this).getConfiguration()

    /**
     * An optional description for the map resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

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
     */
    override fun mapName(): String = unwrap(this).getMapName()

    /**
     * No longer used. If included, the only allowed value is `RequestBasedUsage` .
     *
     * *Allowed Values* : `RequestBasedUsage`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-pricingplan)
     */
    override fun pricingPlan(): String? = unwrap(this).getPricingPlan()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMapProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnMapProps): CfnMapProps
        = CdkObjectWrappers.wrap(cdkObject) as CfnMapProps

    internal fun unwrap(wrapped: CfnMapProps): software.amazon.awscdk.services.location.CfnMapProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.location.CfnMapProps
  }
}
