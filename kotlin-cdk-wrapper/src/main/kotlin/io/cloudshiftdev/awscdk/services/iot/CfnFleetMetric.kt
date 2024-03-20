@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the `AWS::IoT::FleetMetric` resource to declare a fleet metric.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnFleetMetric cfnFleetMetric = CfnFleetMetric.Builder.create(this, "MyCfnFleetMetric")
 * .metricName("metricName")
 * // the properties below are optional
 * .aggregationField("aggregationField")
 * .aggregationType(AggregationTypeProperty.builder()
 * .name("name")
 * .values(List.of("values"))
 * .build())
 * .description("description")
 * .indexName("indexName")
 * .period(123)
 * .queryString("queryString")
 * .queryVersion("queryVersion")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .unit("unit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html)
 */
public open class CfnFleetMetric internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iot.CfnFleetMetric,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFleetMetricProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnFleetMetric(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnFleetMetricProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFleetMetricProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFleetMetricProps(props)
  )

  /**
   * The field to aggregate.
   */
  public open fun aggregationField(): String? = unwrap(this).getAggregationField()

  /**
   * The field to aggregate.
   */
  public open fun aggregationField(`value`: String) {
    unwrap(this).setAggregationField(`value`)
  }

  /**
   * The type of the aggregation query.
   */
  public open fun aggregationType(): Any? = unwrap(this).getAggregationType()

  /**
   * The type of the aggregation query.
   */
  public open fun aggregationType(`value`: IResolvable) {
    unwrap(this).setAggregationType(`value`.let(IResolvable::unwrap))
  }

  /**
   * The type of the aggregation query.
   */
  public open fun aggregationType(`value`: AggregationTypeProperty) {
    unwrap(this).setAggregationType(`value`.let(AggregationTypeProperty::unwrap))
  }

  /**
   * The type of the aggregation query.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6153f3fbaea4aaaae1db7b7a7481cd0f6d5400f9d1bbd4a9654f4f4fa5b3b8e4")
  public open fun aggregationType(`value`: AggregationTypeProperty.Builder.() -> Unit): Unit =
      aggregationType(AggregationTypeProperty(`value`))

  /**
   * The time the fleet metric was created.
   */
  public open fun attrCreationDate(): IResolvable =
      unwrap(this).getAttrCreationDate().let(IResolvable::wrap)

  /**
   * The time the fleet metric was last modified.
   */
  public open fun attrLastModifiedDate(): IResolvable =
      unwrap(this).getAttrLastModifiedDate().let(IResolvable::wrap)

  /**
   * The Amazon Resource Name (ARN) of the fleet metric.
   */
  public open fun attrMetricArn(): String = unwrap(this).getAttrMetricArn()

  /**
   * The fleet metric version.
   */
  public open fun attrVersion(): IResolvable = unwrap(this).getAttrVersion().let(IResolvable::wrap)

  /**
   * The fleet metric description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The fleet metric description.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The name of the index to search.
   */
  public open fun indexName(): String? = unwrap(this).getIndexName()

  /**
   * The name of the index to search.
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the fleet metric to create.
   */
  public open fun metricName(): String = unwrap(this).getMetricName()

  /**
   * The name of the fleet metric to create.
   */
  public open fun metricName(`value`: String) {
    unwrap(this).setMetricName(`value`)
  }

  /**
   * The time in seconds between fleet metric emissions.
   */
  public open fun period(): Number? = unwrap(this).getPeriod()

  /**
   * The time in seconds between fleet metric emissions.
   */
  public open fun period(`value`: Number) {
    unwrap(this).setPeriod(`value`)
  }

  /**
   * The search query string.
   */
  public open fun queryString(): String? = unwrap(this).getQueryString()

  /**
   * The search query string.
   */
  public open fun queryString(`value`: String) {
    unwrap(this).setQueryString(`value`)
  }

  /**
   * The query version.
   */
  public open fun queryVersion(): String? = unwrap(this).getQueryVersion()

  /**
   * The query version.
   */
  public open fun queryVersion(`value`: String) {
    unwrap(this).setQueryVersion(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata which can be used to manage the fleet metric.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata which can be used to manage the fleet metric.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata which can be used to manage the fleet metric.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Used to support unit transformation such as milliseconds to seconds.
   */
  public open fun unit(): String? = unwrap(this).getUnit()

  /**
   * Used to support unit transformation such as milliseconds to seconds.
   */
  public open fun unit(`value`: String) {
    unwrap(this).setUnit(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnFleetMetric].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The field to aggregate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-aggregationfield)
     * @param aggregationField The field to aggregate. 
     */
    public fun aggregationField(aggregationField: String)

    /**
     * The type of the aggregation query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-aggregationtype)
     * @param aggregationType The type of the aggregation query. 
     */
    public fun aggregationType(aggregationType: IResolvable)

    /**
     * The type of the aggregation query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-aggregationtype)
     * @param aggregationType The type of the aggregation query. 
     */
    public fun aggregationType(aggregationType: AggregationTypeProperty)

    /**
     * The type of the aggregation query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-aggregationtype)
     * @param aggregationType The type of the aggregation query. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f51ec62b9adb29ec5d37216a170c5a16418a243c8980b64bc4f237fdf705d3b")
    public fun aggregationType(aggregationType: AggregationTypeProperty.Builder.() -> Unit)

    /**
     * The fleet metric description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-description)
     * @param description The fleet metric description. 
     */
    public fun description(description: String)

    /**
     * The name of the index to search.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-indexname)
     * @param indexName The name of the index to search. 
     */
    public fun indexName(indexName: String)

    /**
     * The name of the fleet metric to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-metricname)
     * @param metricName The name of the fleet metric to create. 
     */
    public fun metricName(metricName: String)

    /**
     * The time in seconds between fleet metric emissions.
     *
     * Range [60(1 min), 86400(1 day)] and must be multiple of 60.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-period)
     * @param period The time in seconds between fleet metric emissions. 
     */
    public fun period(period: Number)

    /**
     * The search query string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-querystring)
     * @param queryString The search query string. 
     */
    public fun queryString(queryString: String)

    /**
     * The query version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-queryversion)
     * @param queryVersion The query version. 
     */
    public fun queryVersion(queryVersion: String)

    /**
     * Metadata which can be used to manage the fleet metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-tags)
     * @param tags Metadata which can be used to manage the fleet metric. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata which can be used to manage the fleet metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-tags)
     * @param tags Metadata which can be used to manage the fleet metric. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Used to support unit transformation such as milliseconds to seconds.
     *
     * Must be a unit supported by CW metric. Default to null.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-unit)
     * @param unit Used to support unit transformation such as milliseconds to seconds. 
     */
    public fun unit(unit: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnFleetMetric.Builder =
        software.amazon.awscdk.services.iot.CfnFleetMetric.Builder.create(scope, id)

    /**
     * The field to aggregate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-aggregationfield)
     * @param aggregationField The field to aggregate. 
     */
    override fun aggregationField(aggregationField: String) {
      cdkBuilder.aggregationField(aggregationField)
    }

    /**
     * The type of the aggregation query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-aggregationtype)
     * @param aggregationType The type of the aggregation query. 
     */
    override fun aggregationType(aggregationType: IResolvable) {
      cdkBuilder.aggregationType(aggregationType.let(IResolvable::unwrap))
    }

    /**
     * The type of the aggregation query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-aggregationtype)
     * @param aggregationType The type of the aggregation query. 
     */
    override fun aggregationType(aggregationType: AggregationTypeProperty) {
      cdkBuilder.aggregationType(aggregationType.let(AggregationTypeProperty::unwrap))
    }

    /**
     * The type of the aggregation query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-aggregationtype)
     * @param aggregationType The type of the aggregation query. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f51ec62b9adb29ec5d37216a170c5a16418a243c8980b64bc4f237fdf705d3b")
    override fun aggregationType(aggregationType: AggregationTypeProperty.Builder.() -> Unit): Unit
        = aggregationType(AggregationTypeProperty(aggregationType))

    /**
     * The fleet metric description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-description)
     * @param description The fleet metric description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the index to search.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-indexname)
     * @param indexName The name of the index to search. 
     */
    override fun indexName(indexName: String) {
      cdkBuilder.indexName(indexName)
    }

    /**
     * The name of the fleet metric to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-metricname)
     * @param metricName The name of the fleet metric to create. 
     */
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    /**
     * The time in seconds between fleet metric emissions.
     *
     * Range [60(1 min), 86400(1 day)] and must be multiple of 60.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-period)
     * @param period The time in seconds between fleet metric emissions. 
     */
    override fun period(period: Number) {
      cdkBuilder.period(period)
    }

    /**
     * The search query string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-querystring)
     * @param queryString The search query string. 
     */
    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    /**
     * The query version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-queryversion)
     * @param queryVersion The query version. 
     */
    override fun queryVersion(queryVersion: String) {
      cdkBuilder.queryVersion(queryVersion)
    }

    /**
     * Metadata which can be used to manage the fleet metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-tags)
     * @param tags Metadata which can be used to manage the fleet metric. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata which can be used to manage the fleet metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-tags)
     * @param tags Metadata which can be used to manage the fleet metric. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Used to support unit transformation such as milliseconds to seconds.
     *
     * Must be a unit supported by CW metric. Default to null.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-unit)
     * @param unit Used to support unit transformation such as milliseconds to seconds. 
     */
    override fun unit(unit: String) {
      cdkBuilder.unit(unit)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnFleetMetric = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnFleetMetric.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFleetMetric {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFleetMetric(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnFleetMetric): CfnFleetMetric
        = CfnFleetMetric(cdkObject)

    internal fun unwrap(wrapped: CfnFleetMetric): software.amazon.awscdk.services.iot.CfnFleetMetric
        = wrapped.cdkObject
  }

  /**
   * The type of aggregation queries.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * AggregationTypeProperty aggregationTypeProperty = AggregationTypeProperty.builder()
   * .name("name")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-fleetmetric-aggregationtype.html)
   */
  public interface AggregationTypeProperty {
    /**
     * The name of the aggregation type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-fleetmetric-aggregationtype.html#cfn-iot-fleetmetric-aggregationtype-name)
     */
    public fun name(): String

    /**
     * A list of the values of aggregation types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-fleetmetric-aggregationtype.html#cfn-iot-fleetmetric-aggregationtype-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [AggregationTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the aggregation type. 
       */
      public fun name(name: String)

      /**
       * @param values A list of the values of aggregation types. 
       */
      public fun values(values: List<String>)

      /**
       * @param values A list of the values of aggregation types. 
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnFleetMetric.AggregationTypeProperty.Builder =
          software.amazon.awscdk.services.iot.CfnFleetMetric.AggregationTypeProperty.builder()

      /**
       * @param name The name of the aggregation type. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param values A list of the values of aggregation types. 
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values A list of the values of aggregation types. 
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build(): software.amazon.awscdk.services.iot.CfnFleetMetric.AggregationTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnFleetMetric.AggregationTypeProperty,
    ) : CdkObject(cdkObject), AggregationTypeProperty {
      /**
       * The name of the aggregation type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-fleetmetric-aggregationtype.html#cfn-iot-fleetmetric-aggregationtype-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * A list of the values of aggregation types.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-fleetmetric-aggregationtype.html#cfn-iot-fleetmetric-aggregationtype-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AggregationTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnFleetMetric.AggregationTypeProperty):
          AggregationTypeProperty = CdkObjectWrappers.wrap(cdkObject) as? AggregationTypeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AggregationTypeProperty):
          software.amazon.awscdk.services.iot.CfnFleetMetric.AggregationTypeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnFleetMetric.AggregationTypeProperty
    }
  }
}
