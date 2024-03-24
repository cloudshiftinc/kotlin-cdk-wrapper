@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Create a new `FeatureGroup` .
 *
 * A `FeatureGroup` is a group of `Features` defined in the `FeatureStore` to describe a `Record` .
 *
 * The `FeatureGroup` defines the schema and features contained in the FeatureGroup. A
 * `FeatureGroup` definition is composed of a list of `Features` , a `RecordIdentifierFeatureName` , an
 * `EventTimeFeatureName` and configurations for its `OnlineStore` and `OfflineStore` . Check [AWS
 * service quotas](https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html) to see the
 * `FeatureGroup` s quota for your AWS account.
 *
 *
 * You must include at least one of `OnlineStoreConfig` and `OfflineStoreConfig` to create a
 * `FeatureGroup` .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * Object offlineStoreConfig;
 * Object onlineStoreConfig;
 * CfnFeatureGroup cfnFeatureGroup = CfnFeatureGroup.Builder.create(this, "MyCfnFeatureGroup")
 * .eventTimeFeatureName("eventTimeFeatureName")
 * .featureDefinitions(List.of(FeatureDefinitionProperty.builder()
 * .featureName("featureName")
 * .featureType("featureType")
 * .build()))
 * .featureGroupName("featureGroupName")
 * .recordIdentifierFeatureName("recordIdentifierFeatureName")
 * // the properties below are optional
 * .description("description")
 * .offlineStoreConfig(offlineStoreConfig)
 * .onlineStoreConfig(onlineStoreConfig)
 * .roleArn("roleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .throughputConfig(ThroughputConfigProperty.builder()
 * .throughputMode("throughputMode")
 * // the properties below are optional
 * .provisionedReadCapacityUnits(123)
 * .provisionedWriteCapacityUnits(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html)
 */
public open class CfnFeatureGroup(
  cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFeatureGroupProps,
  ) :
      this(software.amazon.awscdk.services.sagemaker.CfnFeatureGroup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnFeatureGroupProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFeatureGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFeatureGroupProps(props)
  )

  /**
   * The time a `FeatureGroup` was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * A `FeatureGroup` status.
   */
  public open fun attrFeatureGroupStatus(): String = unwrap(this).getAttrFeatureGroupStatus()

  /**
   * A free form description of a `FeatureGroup` .
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A free form description of a `FeatureGroup` .
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The name of the feature that stores the `EventTime` of a Record in a `FeatureGroup` .
   */
  public open fun eventTimeFeatureName(): String = unwrap(this).getEventTimeFeatureName()

  /**
   * The name of the feature that stores the `EventTime` of a Record in a `FeatureGroup` .
   */
  public open fun eventTimeFeatureName(`value`: String) {
    unwrap(this).setEventTimeFeatureName(`value`)
  }

  /**
   * A list of `Feature` s.
   *
   * Each `Feature` must include a `FeatureName` and a `FeatureType` .
   */
  public open fun featureDefinitions(): Any = unwrap(this).getFeatureDefinitions()

  /**
   * A list of `Feature` s.
   *
   * Each `Feature` must include a `FeatureName` and a `FeatureType` .
   */
  public open fun featureDefinitions(`value`: IResolvable) {
    unwrap(this).setFeatureDefinitions(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of `Feature` s.
   *
   * Each `Feature` must include a `FeatureName` and a `FeatureType` .
   */
  public open fun featureDefinitions(`value`: List<Any>) {
    unwrap(this).setFeatureDefinitions(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of `Feature` s.
   *
   * Each `Feature` must include a `FeatureName` and a `FeatureType` .
   */
  public open fun featureDefinitions(vararg `value`: Any): Unit =
      featureDefinitions(`value`.toList())

  /**
   * The name of the `FeatureGroup` .
   */
  public open fun featureGroupName(): String = unwrap(this).getFeatureGroupName()

  /**
   * The name of the `FeatureGroup` .
   */
  public open fun featureGroupName(`value`: String) {
    unwrap(this).setFeatureGroupName(`value`)
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
   * The configuration of an `OfflineStore` .
   */
  public open fun offlineStoreConfig(): Any? = unwrap(this).getOfflineStoreConfig()

  /**
   * The configuration of an `OfflineStore` .
   */
  public open fun offlineStoreConfig(`value`: Any) {
    unwrap(this).setOfflineStoreConfig(`value`)
  }

  /**
   * The configuration of an `OnlineStore` .
   */
  public open fun onlineStoreConfig(): Any? = unwrap(this).getOnlineStoreConfig()

  /**
   * The configuration of an `OnlineStore` .
   */
  public open fun onlineStoreConfig(`value`: Any) {
    unwrap(this).setOnlineStoreConfig(`value`)
  }

  /**
   * The name of the `Feature` whose value uniquely identifies a `Record` defined in the
   * `FeatureGroup` `FeatureDefinitions` .
   */
  public open fun recordIdentifierFeatureName(): String =
      unwrap(this).getRecordIdentifierFeatureName()

  /**
   * The name of the `Feature` whose value uniquely identifies a `Record` defined in the
   * `FeatureGroup` `FeatureDefinitions` .
   */
  public open fun recordIdentifierFeatureName(`value`: String) {
    unwrap(this).setRecordIdentifierFeatureName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM execution role used to create the feature group.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM execution role used to create the feature group.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Tags used to define a `FeatureGroup` .
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Tags used to define a `FeatureGroup` .
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Tags used to define a `FeatureGroup` .
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Used to set feature group throughput configuration.
   */
  public open fun throughputConfig(): Any? = unwrap(this).getThroughputConfig()

  /**
   * Used to set feature group throughput configuration.
   */
  public open fun throughputConfig(`value`: IResolvable) {
    unwrap(this).setThroughputConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Used to set feature group throughput configuration.
   */
  public open fun throughputConfig(`value`: ThroughputConfigProperty) {
    unwrap(this).setThroughputConfig(`value`.let(ThroughputConfigProperty::unwrap))
  }

  /**
   * Used to set feature group throughput configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("64edcb02ed5518c1af88b15c8d7b65a4d3e4fe2f9493d258b3a597a665d0aafa")
  public open fun throughputConfig(`value`: ThroughputConfigProperty.Builder.() -> Unit): Unit =
      throughputConfig(ThroughputConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnFeatureGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A free form description of a `FeatureGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-description)
     * @param description A free form description of a `FeatureGroup` . 
     */
    public fun description(description: String)

    /**
     * The name of the feature that stores the `EventTime` of a Record in a `FeatureGroup` .
     *
     * A `EventTime` is point in time when a new event occurs that corresponds to the creation or
     * update of a `Record` in `FeatureGroup` . All `Records` in the `FeatureGroup` must have a
     * corresponding `EventTime` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-eventtimefeaturename)
     * @param eventTimeFeatureName The name of the feature that stores the `EventTime` of a Record
     * in a `FeatureGroup` . 
     */
    public fun eventTimeFeatureName(eventTimeFeatureName: String)

    /**
     * A list of `Feature` s. Each `Feature` must include a `FeatureName` and a `FeatureType` .
     *
     * Valid `FeatureType` s are `Integral` , `Fractional` and `String` .
     *
     * `FeatureName` s cannot be any of the following: `is_deleted` , `write_time` ,
     * `api_invocation_time` .
     *
     * You can create up to 2,500 `FeatureDefinition` s per `FeatureGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-featuredefinitions)
     * @param featureDefinitions A list of `Feature` s. Each `Feature` must include a `FeatureName`
     * and a `FeatureType` . 
     */
    public fun featureDefinitions(featureDefinitions: IResolvable)

    /**
     * A list of `Feature` s. Each `Feature` must include a `FeatureName` and a `FeatureType` .
     *
     * Valid `FeatureType` s are `Integral` , `Fractional` and `String` .
     *
     * `FeatureName` s cannot be any of the following: `is_deleted` , `write_time` ,
     * `api_invocation_time` .
     *
     * You can create up to 2,500 `FeatureDefinition` s per `FeatureGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-featuredefinitions)
     * @param featureDefinitions A list of `Feature` s. Each `Feature` must include a `FeatureName`
     * and a `FeatureType` . 
     */
    public fun featureDefinitions(featureDefinitions: List<Any>)

    /**
     * A list of `Feature` s. Each `Feature` must include a `FeatureName` and a `FeatureType` .
     *
     * Valid `FeatureType` s are `Integral` , `Fractional` and `String` .
     *
     * `FeatureName` s cannot be any of the following: `is_deleted` , `write_time` ,
     * `api_invocation_time` .
     *
     * You can create up to 2,500 `FeatureDefinition` s per `FeatureGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-featuredefinitions)
     * @param featureDefinitions A list of `Feature` s. Each `Feature` must include a `FeatureName`
     * and a `FeatureType` . 
     */
    public fun featureDefinitions(vararg featureDefinitions: Any)

    /**
     * The name of the `FeatureGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-featuregroupname)
     * @param featureGroupName The name of the `FeatureGroup` . 
     */
    public fun featureGroupName(featureGroupName: String)

    /**
     * The configuration of an `OfflineStore` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-offlinestoreconfig)
     * @param offlineStoreConfig The configuration of an `OfflineStore` . 
     */
    public fun offlineStoreConfig(offlineStoreConfig: Any)

    /**
     * The configuration of an `OnlineStore` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-onlinestoreconfig)
     * @param onlineStoreConfig The configuration of an `OnlineStore` . 
     */
    public fun onlineStoreConfig(onlineStoreConfig: Any)

    /**
     * The name of the `Feature` whose value uniquely identifies a `Record` defined in the
     * `FeatureGroup` `FeatureDefinitions` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-recordidentifierfeaturename)
     * @param recordIdentifierFeatureName The name of the `Feature` whose value uniquely identifies
     * a `Record` defined in the `FeatureGroup` `FeatureDefinitions` . 
     */
    public fun recordIdentifierFeatureName(recordIdentifierFeatureName: String)

    /**
     * The Amazon Resource Name (ARN) of the IAM execution role used to create the feature group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM execution role used to create the
     * feature group. 
     */
    public fun roleArn(roleArn: String)

    /**
     * Tags used to define a `FeatureGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-tags)
     * @param tags Tags used to define a `FeatureGroup` . 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags used to define a `FeatureGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-tags)
     * @param tags Tags used to define a `FeatureGroup` . 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Used to set feature group throughput configuration.
     *
     * There are two modes: `ON_DEMAND` and `PROVISIONED` . With on-demand mode, you are charged for
     * data reads and writes that your application performs on your feature group. You do not need to
     * specify read and write throughput because Feature Store accommodates your workloads as they ramp
     * up and down. You can switch a feature group to on-demand only once in a 24 hour period. With
     * provisioned throughput mode, you specify the read and write capacity per second that you expect
     * your application to require, and you are billed based on those limits. Exceeding provisioned
     * throughput will result in your requests being throttled.
     *
     * Note: `PROVISIONED` throughput mode is supported only for feature groups that are
     * offline-only, or use the
     * [`Standard`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OnlineStoreConfig.html#sagemaker-Type-OnlineStoreConfig-StorageType)
     * tier online store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-throughputconfig)
     * @param throughputConfig Used to set feature group throughput configuration. 
     */
    public fun throughputConfig(throughputConfig: IResolvable)

    /**
     * Used to set feature group throughput configuration.
     *
     * There are two modes: `ON_DEMAND` and `PROVISIONED` . With on-demand mode, you are charged for
     * data reads and writes that your application performs on your feature group. You do not need to
     * specify read and write throughput because Feature Store accommodates your workloads as they ramp
     * up and down. You can switch a feature group to on-demand only once in a 24 hour period. With
     * provisioned throughput mode, you specify the read and write capacity per second that you expect
     * your application to require, and you are billed based on those limits. Exceeding provisioned
     * throughput will result in your requests being throttled.
     *
     * Note: `PROVISIONED` throughput mode is supported only for feature groups that are
     * offline-only, or use the
     * [`Standard`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OnlineStoreConfig.html#sagemaker-Type-OnlineStoreConfig-StorageType)
     * tier online store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-throughputconfig)
     * @param throughputConfig Used to set feature group throughput configuration. 
     */
    public fun throughputConfig(throughputConfig: ThroughputConfigProperty)

    /**
     * Used to set feature group throughput configuration.
     *
     * There are two modes: `ON_DEMAND` and `PROVISIONED` . With on-demand mode, you are charged for
     * data reads and writes that your application performs on your feature group. You do not need to
     * specify read and write throughput because Feature Store accommodates your workloads as they ramp
     * up and down. You can switch a feature group to on-demand only once in a 24 hour period. With
     * provisioned throughput mode, you specify the read and write capacity per second that you expect
     * your application to require, and you are billed based on those limits. Exceeding provisioned
     * throughput will result in your requests being throttled.
     *
     * Note: `PROVISIONED` throughput mode is supported only for feature groups that are
     * offline-only, or use the
     * [`Standard`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OnlineStoreConfig.html#sagemaker-Type-OnlineStoreConfig-StorageType)
     * tier online store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-throughputconfig)
     * @param throughputConfig Used to set feature group throughput configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("feeb221954c6f330aee919a38c50d43bdb2806eba422525d9ff849dd44995890")
    public fun throughputConfig(throughputConfig: ThroughputConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.Builder =
        software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.Builder.create(scope, id)

    /**
     * A free form description of a `FeatureGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-description)
     * @param description A free form description of a `FeatureGroup` . 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the feature that stores the `EventTime` of a Record in a `FeatureGroup` .
     *
     * A `EventTime` is point in time when a new event occurs that corresponds to the creation or
     * update of a `Record` in `FeatureGroup` . All `Records` in the `FeatureGroup` must have a
     * corresponding `EventTime` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-eventtimefeaturename)
     * @param eventTimeFeatureName The name of the feature that stores the `EventTime` of a Record
     * in a `FeatureGroup` . 
     */
    override fun eventTimeFeatureName(eventTimeFeatureName: String) {
      cdkBuilder.eventTimeFeatureName(eventTimeFeatureName)
    }

    /**
     * A list of `Feature` s. Each `Feature` must include a `FeatureName` and a `FeatureType` .
     *
     * Valid `FeatureType` s are `Integral` , `Fractional` and `String` .
     *
     * `FeatureName` s cannot be any of the following: `is_deleted` , `write_time` ,
     * `api_invocation_time` .
     *
     * You can create up to 2,500 `FeatureDefinition` s per `FeatureGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-featuredefinitions)
     * @param featureDefinitions A list of `Feature` s. Each `Feature` must include a `FeatureName`
     * and a `FeatureType` . 
     */
    override fun featureDefinitions(featureDefinitions: IResolvable) {
      cdkBuilder.featureDefinitions(featureDefinitions.let(IResolvable::unwrap))
    }

    /**
     * A list of `Feature` s. Each `Feature` must include a `FeatureName` and a `FeatureType` .
     *
     * Valid `FeatureType` s are `Integral` , `Fractional` and `String` .
     *
     * `FeatureName` s cannot be any of the following: `is_deleted` , `write_time` ,
     * `api_invocation_time` .
     *
     * You can create up to 2,500 `FeatureDefinition` s per `FeatureGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-featuredefinitions)
     * @param featureDefinitions A list of `Feature` s. Each `Feature` must include a `FeatureName`
     * and a `FeatureType` . 
     */
    override fun featureDefinitions(featureDefinitions: List<Any>) {
      cdkBuilder.featureDefinitions(featureDefinitions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of `Feature` s. Each `Feature` must include a `FeatureName` and a `FeatureType` .
     *
     * Valid `FeatureType` s are `Integral` , `Fractional` and `String` .
     *
     * `FeatureName` s cannot be any of the following: `is_deleted` , `write_time` ,
     * `api_invocation_time` .
     *
     * You can create up to 2,500 `FeatureDefinition` s per `FeatureGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-featuredefinitions)
     * @param featureDefinitions A list of `Feature` s. Each `Feature` must include a `FeatureName`
     * and a `FeatureType` . 
     */
    override fun featureDefinitions(vararg featureDefinitions: Any): Unit =
        featureDefinitions(featureDefinitions.toList())

    /**
     * The name of the `FeatureGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-featuregroupname)
     * @param featureGroupName The name of the `FeatureGroup` . 
     */
    override fun featureGroupName(featureGroupName: String) {
      cdkBuilder.featureGroupName(featureGroupName)
    }

    /**
     * The configuration of an `OfflineStore` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-offlinestoreconfig)
     * @param offlineStoreConfig The configuration of an `OfflineStore` . 
     */
    override fun offlineStoreConfig(offlineStoreConfig: Any) {
      cdkBuilder.offlineStoreConfig(offlineStoreConfig)
    }

    /**
     * The configuration of an `OnlineStore` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-onlinestoreconfig)
     * @param onlineStoreConfig The configuration of an `OnlineStore` . 
     */
    override fun onlineStoreConfig(onlineStoreConfig: Any) {
      cdkBuilder.onlineStoreConfig(onlineStoreConfig)
    }

    /**
     * The name of the `Feature` whose value uniquely identifies a `Record` defined in the
     * `FeatureGroup` `FeatureDefinitions` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-recordidentifierfeaturename)
     * @param recordIdentifierFeatureName The name of the `Feature` whose value uniquely identifies
     * a `Record` defined in the `FeatureGroup` `FeatureDefinitions` . 
     */
    override fun recordIdentifierFeatureName(recordIdentifierFeatureName: String) {
      cdkBuilder.recordIdentifierFeatureName(recordIdentifierFeatureName)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM execution role used to create the feature group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM execution role used to create the
     * feature group. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * Tags used to define a `FeatureGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-tags)
     * @param tags Tags used to define a `FeatureGroup` . 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Tags used to define a `FeatureGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-tags)
     * @param tags Tags used to define a `FeatureGroup` . 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Used to set feature group throughput configuration.
     *
     * There are two modes: `ON_DEMAND` and `PROVISIONED` . With on-demand mode, you are charged for
     * data reads and writes that your application performs on your feature group. You do not need to
     * specify read and write throughput because Feature Store accommodates your workloads as they ramp
     * up and down. You can switch a feature group to on-demand only once in a 24 hour period. With
     * provisioned throughput mode, you specify the read and write capacity per second that you expect
     * your application to require, and you are billed based on those limits. Exceeding provisioned
     * throughput will result in your requests being throttled.
     *
     * Note: `PROVISIONED` throughput mode is supported only for feature groups that are
     * offline-only, or use the
     * [`Standard`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OnlineStoreConfig.html#sagemaker-Type-OnlineStoreConfig-StorageType)
     * tier online store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-throughputconfig)
     * @param throughputConfig Used to set feature group throughput configuration. 
     */
    override fun throughputConfig(throughputConfig: IResolvable) {
      cdkBuilder.throughputConfig(throughputConfig.let(IResolvable::unwrap))
    }

    /**
     * Used to set feature group throughput configuration.
     *
     * There are two modes: `ON_DEMAND` and `PROVISIONED` . With on-demand mode, you are charged for
     * data reads and writes that your application performs on your feature group. You do not need to
     * specify read and write throughput because Feature Store accommodates your workloads as they ramp
     * up and down. You can switch a feature group to on-demand only once in a 24 hour period. With
     * provisioned throughput mode, you specify the read and write capacity per second that you expect
     * your application to require, and you are billed based on those limits. Exceeding provisioned
     * throughput will result in your requests being throttled.
     *
     * Note: `PROVISIONED` throughput mode is supported only for feature groups that are
     * offline-only, or use the
     * [`Standard`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OnlineStoreConfig.html#sagemaker-Type-OnlineStoreConfig-StorageType)
     * tier online store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-throughputconfig)
     * @param throughputConfig Used to set feature group throughput configuration. 
     */
    override fun throughputConfig(throughputConfig: ThroughputConfigProperty) {
      cdkBuilder.throughputConfig(throughputConfig.let(ThroughputConfigProperty::unwrap))
    }

    /**
     * Used to set feature group throughput configuration.
     *
     * There are two modes: `ON_DEMAND` and `PROVISIONED` . With on-demand mode, you are charged for
     * data reads and writes that your application performs on your feature group. You do not need to
     * specify read and write throughput because Feature Store accommodates your workloads as they ramp
     * up and down. You can switch a feature group to on-demand only once in a 24 hour period. With
     * provisioned throughput mode, you specify the read and write capacity per second that you expect
     * your application to require, and you are billed based on those limits. Exceeding provisioned
     * throughput will result in your requests being throttled.
     *
     * Note: `PROVISIONED` throughput mode is supported only for feature groups that are
     * offline-only, or use the
     * [`Standard`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OnlineStoreConfig.html#sagemaker-Type-OnlineStoreConfig-StorageType)
     * tier online store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-throughputconfig)
     * @param throughputConfig Used to set feature group throughput configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("feeb221954c6f330aee919a38c50d43bdb2806eba422525d9ff849dd44995890")
    override fun throughputConfig(throughputConfig: ThroughputConfigProperty.Builder.() -> Unit):
        Unit = throughputConfig(ThroughputConfigProperty(throughputConfig))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnFeatureGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFeatureGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFeatureGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup):
        CfnFeatureGroup = CfnFeatureGroup(cdkObject)

    internal fun unwrap(wrapped: CfnFeatureGroup):
        software.amazon.awscdk.services.sagemaker.CfnFeatureGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnFeatureGroup
  }

  /**
   * The meta data of the Glue table which serves as data catalog for the `OfflineStore` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * DataCatalogConfigProperty dataCatalogConfigProperty = DataCatalogConfigProperty.builder()
   * .catalog("catalog")
   * .database("database")
   * .tableName("tableName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-datacatalogconfig.html)
   */
  public interface DataCatalogConfigProperty {
    /**
     * The name of the Glue table catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-datacatalogconfig.html#cfn-sagemaker-featuregroup-datacatalogconfig-catalog)
     */
    public fun catalog(): String

    /**
     * The name of the Glue table database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-datacatalogconfig.html#cfn-sagemaker-featuregroup-datacatalogconfig-database)
     */
    public fun database(): String

    /**
     * The name of the Glue table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-datacatalogconfig.html#cfn-sagemaker-featuregroup-datacatalogconfig-tablename)
     */
    public fun tableName(): String

    /**
     * A builder for [DataCatalogConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalog The name of the Glue table catalog. 
       */
      public fun catalog(catalog: String)

      /**
       * @param database The name of the Glue table database. 
       */
      public fun database(database: String)

      /**
       * @param tableName The name of the Glue table. 
       */
      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.DataCatalogConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.DataCatalogConfigProperty.builder()

      /**
       * @param catalog The name of the Glue table catalog. 
       */
      override fun catalog(catalog: String) {
        cdkBuilder.catalog(catalog)
      }

      /**
       * @param database The name of the Glue table database. 
       */
      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      /**
       * @param tableName The name of the Glue table. 
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.DataCatalogConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.DataCatalogConfigProperty,
    ) : CdkObject(cdkObject), DataCatalogConfigProperty {
      /**
       * The name of the Glue table catalog.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-datacatalogconfig.html#cfn-sagemaker-featuregroup-datacatalogconfig-catalog)
       */
      override fun catalog(): String = unwrap(this).getCatalog()

      /**
       * The name of the Glue table database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-datacatalogconfig.html#cfn-sagemaker-featuregroup-datacatalogconfig-database)
       */
      override fun database(): String = unwrap(this).getDatabase()

      /**
       * The name of the Glue table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-datacatalogconfig.html#cfn-sagemaker-featuregroup-datacatalogconfig-tablename)
       */
      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataCatalogConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.DataCatalogConfigProperty):
          DataCatalogConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataCatalogConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataCatalogConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.DataCatalogConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.DataCatalogConfigProperty
    }
  }

  /**
   * A list of features.
   *
   * You must include `FeatureName` and `FeatureType` . Valid feature `FeatureType` s are `Integral`
   * , `Fractional` and `String` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * FeatureDefinitionProperty featureDefinitionProperty = FeatureDefinitionProperty.builder()
   * .featureName("featureName")
   * .featureType("featureType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-featuredefinition.html)
   */
  public interface FeatureDefinitionProperty {
    /**
     * The name of a feature.
     *
     * The type must be a string. `FeatureName` cannot be any of the following: `is_deleted` ,
     * `write_time` , `api_invocation_time` .
     *
     * The name:
     *
     * * Must start and end with an alphanumeric character.
     * * Can only include alphanumeric characters, underscores, and hyphens. Spaces are not allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-featuredefinition.html#cfn-sagemaker-featuregroup-featuredefinition-featurename)
     */
    public fun featureName(): String

    /**
     * The value type of a feature.
     *
     * Valid values are Integral, Fractional, or String.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-featuredefinition.html#cfn-sagemaker-featuregroup-featuredefinition-featuretype)
     */
    public fun featureType(): String

    /**
     * A builder for [FeatureDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param featureName The name of a feature. 
       * The type must be a string. `FeatureName` cannot be any of the following: `is_deleted` ,
       * `write_time` , `api_invocation_time` .
       *
       * The name:
       *
       * * Must start and end with an alphanumeric character.
       * * Can only include alphanumeric characters, underscores, and hyphens. Spaces are not
       * allowed.
       */
      public fun featureName(featureName: String)

      /**
       * @param featureType The value type of a feature. 
       * Valid values are Integral, Fractional, or String.
       */
      public fun featureType(featureType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.FeatureDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.FeatureDefinitionProperty.builder()

      /**
       * @param featureName The name of a feature. 
       * The type must be a string. `FeatureName` cannot be any of the following: `is_deleted` ,
       * `write_time` , `api_invocation_time` .
       *
       * The name:
       *
       * * Must start and end with an alphanumeric character.
       * * Can only include alphanumeric characters, underscores, and hyphens. Spaces are not
       * allowed.
       */
      override fun featureName(featureName: String) {
        cdkBuilder.featureName(featureName)
      }

      /**
       * @param featureType The value type of a feature. 
       * Valid values are Integral, Fractional, or String.
       */
      override fun featureType(featureType: String) {
        cdkBuilder.featureType(featureType)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.FeatureDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.FeatureDefinitionProperty,
    ) : CdkObject(cdkObject), FeatureDefinitionProperty {
      /**
       * The name of a feature.
       *
       * The type must be a string. `FeatureName` cannot be any of the following: `is_deleted` ,
       * `write_time` , `api_invocation_time` .
       *
       * The name:
       *
       * * Must start and end with an alphanumeric character.
       * * Can only include alphanumeric characters, underscores, and hyphens. Spaces are not
       * allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-featuredefinition.html#cfn-sagemaker-featuregroup-featuredefinition-featurename)
       */
      override fun featureName(): String = unwrap(this).getFeatureName()

      /**
       * The value type of a feature.
       *
       * Valid values are Integral, Fractional, or String.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-featuredefinition.html#cfn-sagemaker-featuregroup-featuredefinition-featuretype)
       */
      override fun featureType(): String = unwrap(this).getFeatureType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FeatureDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.FeatureDefinitionProperty):
          FeatureDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FeatureDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FeatureDefinitionProperty):
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.FeatureDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.FeatureDefinitionProperty
    }
  }

  /**
   * The configuration of an `OfflineStore` .
   *
   * Provide an `OfflineStoreConfig` in a request to `CreateFeatureGroup` to create an
   * `OfflineStore` .
   *
   * To encrypt an `OfflineStore` using at rest data encryption, specify AWS Key Management Service
   * (KMS) key ID, or `KMSKeyId` , in `S3StorageConfig` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * OfflineStoreConfigProperty offlineStoreConfigProperty = OfflineStoreConfigProperty.builder()
   * .s3StorageConfig(S3StorageConfigProperty.builder()
   * .s3Uri("s3Uri")
   * // the properties below are optional
   * .kmsKeyId("kmsKeyId")
   * .build())
   * // the properties below are optional
   * .dataCatalogConfig(DataCatalogConfigProperty.builder()
   * .catalog("catalog")
   * .database("database")
   * .tableName("tableName")
   * .build())
   * .disableGlueTableCreation(false)
   * .tableFormat("tableFormat")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-offlinestoreconfig.html)
   */
  public interface OfflineStoreConfigProperty {
    /**
     * The meta data of the Glue table that is autogenerated when an `OfflineStore` is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-offlinestoreconfig.html#cfn-sagemaker-featuregroup-offlinestoreconfig-datacatalogconfig)
     */
    public fun dataCatalogConfig(): Any? = unwrap(this).getDataCatalogConfig()

    /**
     * Set to `True` to disable the automatic creation of an AWS Glue table when configuring an
     * `OfflineStore` .
     *
     * If set to `False` , Feature Store will name the `OfflineStore` Glue table following [Athena's
     * naming
     * recommendations](https://docs.aws.amazon.com/athena/latest/ug/tables-databases-columns-names.html)
     * .
     *
     * The default value is `False` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-offlinestoreconfig.html#cfn-sagemaker-featuregroup-offlinestoreconfig-disablegluetablecreation)
     */
    public fun disableGlueTableCreation(): Any? = unwrap(this).getDisableGlueTableCreation()

    /**
     * The Amazon Simple Storage (Amazon S3) location of `OfflineStore` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-offlinestoreconfig.html#cfn-sagemaker-featuregroup-offlinestoreconfig-s3storageconfig)
     */
    public fun s3StorageConfig(): Any

    /**
     * Format for the offline store table.
     *
     * Supported formats are Glue (Default) and [Apache
     * Iceberg](https://docs.aws.amazon.com/https://iceberg.apache.org/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-offlinestoreconfig.html#cfn-sagemaker-featuregroup-offlinestoreconfig-tableformat)
     */
    public fun tableFormat(): String? = unwrap(this).getTableFormat()

    /**
     * A builder for [OfflineStoreConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataCatalogConfig The meta data of the Glue table that is autogenerated when an
       * `OfflineStore` is created.
       */
      public fun dataCatalogConfig(dataCatalogConfig: IResolvable)

      /**
       * @param dataCatalogConfig The meta data of the Glue table that is autogenerated when an
       * `OfflineStore` is created.
       */
      public fun dataCatalogConfig(dataCatalogConfig: DataCatalogConfigProperty)

      /**
       * @param dataCatalogConfig The meta data of the Glue table that is autogenerated when an
       * `OfflineStore` is created.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e047b0fe9e5caed0af2f193bd89b57a611aa498fc2d1fb1eae59793dc052a66")
      public fun dataCatalogConfig(dataCatalogConfig: DataCatalogConfigProperty.Builder.() -> Unit)

      /**
       * @param disableGlueTableCreation Set to `True` to disable the automatic creation of an AWS
       * Glue table when configuring an `OfflineStore` .
       * If set to `False` , Feature Store will name the `OfflineStore` Glue table following
       * [Athena's naming
       * recommendations](https://docs.aws.amazon.com/athena/latest/ug/tables-databases-columns-names.html)
       * .
       *
       * The default value is `False` .
       */
      public fun disableGlueTableCreation(disableGlueTableCreation: Boolean)

      /**
       * @param disableGlueTableCreation Set to `True` to disable the automatic creation of an AWS
       * Glue table when configuring an `OfflineStore` .
       * If set to `False` , Feature Store will name the `OfflineStore` Glue table following
       * [Athena's naming
       * recommendations](https://docs.aws.amazon.com/athena/latest/ug/tables-databases-columns-names.html)
       * .
       *
       * The default value is `False` .
       */
      public fun disableGlueTableCreation(disableGlueTableCreation: IResolvable)

      /**
       * @param s3StorageConfig The Amazon Simple Storage (Amazon S3) location of `OfflineStore` . 
       */
      public fun s3StorageConfig(s3StorageConfig: IResolvable)

      /**
       * @param s3StorageConfig The Amazon Simple Storage (Amazon S3) location of `OfflineStore` . 
       */
      public fun s3StorageConfig(s3StorageConfig: S3StorageConfigProperty)

      /**
       * @param s3StorageConfig The Amazon Simple Storage (Amazon S3) location of `OfflineStore` . 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b930ec4e1b421a35978668af54bfe7fe10be792f7c06729aaead85ddd0ee8bab")
      public fun s3StorageConfig(s3StorageConfig: S3StorageConfigProperty.Builder.() -> Unit)

      /**
       * @param tableFormat Format for the offline store table.
       * Supported formats are Glue (Default) and [Apache
       * Iceberg](https://docs.aws.amazon.com/https://iceberg.apache.org/) .
       */
      public fun tableFormat(tableFormat: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OfflineStoreConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OfflineStoreConfigProperty.builder()

      /**
       * @param dataCatalogConfig The meta data of the Glue table that is autogenerated when an
       * `OfflineStore` is created.
       */
      override fun dataCatalogConfig(dataCatalogConfig: IResolvable) {
        cdkBuilder.dataCatalogConfig(dataCatalogConfig.let(IResolvable::unwrap))
      }

      /**
       * @param dataCatalogConfig The meta data of the Glue table that is autogenerated when an
       * `OfflineStore` is created.
       */
      override fun dataCatalogConfig(dataCatalogConfig: DataCatalogConfigProperty) {
        cdkBuilder.dataCatalogConfig(dataCatalogConfig.let(DataCatalogConfigProperty::unwrap))
      }

      /**
       * @param dataCatalogConfig The meta data of the Glue table that is autogenerated when an
       * `OfflineStore` is created.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e047b0fe9e5caed0af2f193bd89b57a611aa498fc2d1fb1eae59793dc052a66")
      override
          fun dataCatalogConfig(dataCatalogConfig: DataCatalogConfigProperty.Builder.() -> Unit):
          Unit = dataCatalogConfig(DataCatalogConfigProperty(dataCatalogConfig))

      /**
       * @param disableGlueTableCreation Set to `True` to disable the automatic creation of an AWS
       * Glue table when configuring an `OfflineStore` .
       * If set to `False` , Feature Store will name the `OfflineStore` Glue table following
       * [Athena's naming
       * recommendations](https://docs.aws.amazon.com/athena/latest/ug/tables-databases-columns-names.html)
       * .
       *
       * The default value is `False` .
       */
      override fun disableGlueTableCreation(disableGlueTableCreation: Boolean) {
        cdkBuilder.disableGlueTableCreation(disableGlueTableCreation)
      }

      /**
       * @param disableGlueTableCreation Set to `True` to disable the automatic creation of an AWS
       * Glue table when configuring an `OfflineStore` .
       * If set to `False` , Feature Store will name the `OfflineStore` Glue table following
       * [Athena's naming
       * recommendations](https://docs.aws.amazon.com/athena/latest/ug/tables-databases-columns-names.html)
       * .
       *
       * The default value is `False` .
       */
      override fun disableGlueTableCreation(disableGlueTableCreation: IResolvable) {
        cdkBuilder.disableGlueTableCreation(disableGlueTableCreation.let(IResolvable::unwrap))
      }

      /**
       * @param s3StorageConfig The Amazon Simple Storage (Amazon S3) location of `OfflineStore` . 
       */
      override fun s3StorageConfig(s3StorageConfig: IResolvable) {
        cdkBuilder.s3StorageConfig(s3StorageConfig.let(IResolvable::unwrap))
      }

      /**
       * @param s3StorageConfig The Amazon Simple Storage (Amazon S3) location of `OfflineStore` . 
       */
      override fun s3StorageConfig(s3StorageConfig: S3StorageConfigProperty) {
        cdkBuilder.s3StorageConfig(s3StorageConfig.let(S3StorageConfigProperty::unwrap))
      }

      /**
       * @param s3StorageConfig The Amazon Simple Storage (Amazon S3) location of `OfflineStore` . 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b930ec4e1b421a35978668af54bfe7fe10be792f7c06729aaead85ddd0ee8bab")
      override fun s3StorageConfig(s3StorageConfig: S3StorageConfigProperty.Builder.() -> Unit):
          Unit = s3StorageConfig(S3StorageConfigProperty(s3StorageConfig))

      /**
       * @param tableFormat Format for the offline store table.
       * Supported formats are Glue (Default) and [Apache
       * Iceberg](https://docs.aws.amazon.com/https://iceberg.apache.org/) .
       */
      override fun tableFormat(tableFormat: String) {
        cdkBuilder.tableFormat(tableFormat)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OfflineStoreConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OfflineStoreConfigProperty,
    ) : CdkObject(cdkObject), OfflineStoreConfigProperty {
      /**
       * The meta data of the Glue table that is autogenerated when an `OfflineStore` is created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-offlinestoreconfig.html#cfn-sagemaker-featuregroup-offlinestoreconfig-datacatalogconfig)
       */
      override fun dataCatalogConfig(): Any? = unwrap(this).getDataCatalogConfig()

      /**
       * Set to `True` to disable the automatic creation of an AWS Glue table when configuring an
       * `OfflineStore` .
       *
       * If set to `False` , Feature Store will name the `OfflineStore` Glue table following
       * [Athena's naming
       * recommendations](https://docs.aws.amazon.com/athena/latest/ug/tables-databases-columns-names.html)
       * .
       *
       * The default value is `False` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-offlinestoreconfig.html#cfn-sagemaker-featuregroup-offlinestoreconfig-disablegluetablecreation)
       */
      override fun disableGlueTableCreation(): Any? = unwrap(this).getDisableGlueTableCreation()

      /**
       * The Amazon Simple Storage (Amazon S3) location of `OfflineStore` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-offlinestoreconfig.html#cfn-sagemaker-featuregroup-offlinestoreconfig-s3storageconfig)
       */
      override fun s3StorageConfig(): Any = unwrap(this).getS3StorageConfig()

      /**
       * Format for the offline store table.
       *
       * Supported formats are Glue (Default) and [Apache
       * Iceberg](https://docs.aws.amazon.com/https://iceberg.apache.org/) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-offlinestoreconfig.html#cfn-sagemaker-featuregroup-offlinestoreconfig-tableformat)
       */
      override fun tableFormat(): String? = unwrap(this).getTableFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OfflineStoreConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OfflineStoreConfigProperty):
          OfflineStoreConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OfflineStoreConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OfflineStoreConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OfflineStoreConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OfflineStoreConfigProperty
    }
  }

  /**
   * Use this to specify the AWS Key Management Service (KMS) Key ID, or `KMSKeyId` , for at rest
   * data encryption.
   *
   * You can turn `OnlineStore` on or off by specifying the `EnableOnlineStore` flag at General
   * Assembly.
   *
   * The default value is `False` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * OnlineStoreConfigProperty onlineStoreConfigProperty = OnlineStoreConfigProperty.builder()
   * .enableOnlineStore(false)
   * .securityConfig(OnlineStoreSecurityConfigProperty.builder()
   * .kmsKeyId("kmsKeyId")
   * .build())
   * .storageType("storageType")
   * .ttlDuration(TtlDurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-onlinestoreconfig.html)
   */
  public interface OnlineStoreConfigProperty {
    /**
     * Turn `OnlineStore` off by specifying `False` for the `EnableOnlineStore` flag.
     *
     * Turn `OnlineStore` on by specifying `True` for the `EnableOnlineStore` flag.
     *
     * The default value is `False` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-onlinestoreconfig.html#cfn-sagemaker-featuregroup-onlinestoreconfig-enableonlinestore)
     */
    public fun enableOnlineStore(): Any? = unwrap(this).getEnableOnlineStore()

    /**
     * Use to specify KMS Key ID ( `KMSKeyId` ) for at-rest encryption of your `OnlineStore` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-onlinestoreconfig.html#cfn-sagemaker-featuregroup-onlinestoreconfig-securityconfig)
     */
    public fun securityConfig(): Any? = unwrap(this).getSecurityConfig()

    /**
     * Option for different tiers of low latency storage for real-time data retrieval.
     *
     * * `Standard` : A managed low latency data store for feature groups.
     * * `InMemory` : A managed data store for feature groups that supports very low latency
     * retrieval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-onlinestoreconfig.html#cfn-sagemaker-featuregroup-onlinestoreconfig-storagetype)
     */
    public fun storageType(): String? = unwrap(this).getStorageType()

    /**
     * Time to live duration, where the record is hard deleted after the expiration time is reached;
     *
     * `ExpiresAt` = `EventTime` + `TtlDuration` . For information on HardDelete, see the
     * [DeleteRecord](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_DeleteRecord.html)
     * API in the Amazon SageMaker API Reference guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-onlinestoreconfig.html#cfn-sagemaker-featuregroup-onlinestoreconfig-ttlduration)
     */
    public fun ttlDuration(): Any? = unwrap(this).getTtlDuration()

    /**
     * A builder for [OnlineStoreConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableOnlineStore Turn `OnlineStore` off by specifying `False` for the
       * `EnableOnlineStore` flag.
       * Turn `OnlineStore` on by specifying `True` for the `EnableOnlineStore` flag.
       *
       * The default value is `False` .
       */
      public fun enableOnlineStore(enableOnlineStore: Boolean)

      /**
       * @param enableOnlineStore Turn `OnlineStore` off by specifying `False` for the
       * `EnableOnlineStore` flag.
       * Turn `OnlineStore` on by specifying `True` for the `EnableOnlineStore` flag.
       *
       * The default value is `False` .
       */
      public fun enableOnlineStore(enableOnlineStore: IResolvable)

      /**
       * @param securityConfig Use to specify KMS Key ID ( `KMSKeyId` ) for at-rest encryption of
       * your `OnlineStore` .
       */
      public fun securityConfig(securityConfig: IResolvable)

      /**
       * @param securityConfig Use to specify KMS Key ID ( `KMSKeyId` ) for at-rest encryption of
       * your `OnlineStore` .
       */
      public fun securityConfig(securityConfig: OnlineStoreSecurityConfigProperty)

      /**
       * @param securityConfig Use to specify KMS Key ID ( `KMSKeyId` ) for at-rest encryption of
       * your `OnlineStore` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73f873d31d41619f0d72a0f13cfd0f2e7d0de00346b39a50ebd5118695396812")
      public
          fun securityConfig(securityConfig: OnlineStoreSecurityConfigProperty.Builder.() -> Unit)

      /**
       * @param storageType Option for different tiers of low latency storage for real-time data
       * retrieval.
       * * `Standard` : A managed low latency data store for feature groups.
       * * `InMemory` : A managed data store for feature groups that supports very low latency
       * retrieval.
       */
      public fun storageType(storageType: String)

      /**
       * @param ttlDuration Time to live duration, where the record is hard deleted after the
       * expiration time is reached;.
       * `ExpiresAt` = `EventTime` + `TtlDuration` . For information on HardDelete, see the
       * [DeleteRecord](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_DeleteRecord.html)
       * API in the Amazon SageMaker API Reference guide.
       */
      public fun ttlDuration(ttlDuration: IResolvable)

      /**
       * @param ttlDuration Time to live duration, where the record is hard deleted after the
       * expiration time is reached;.
       * `ExpiresAt` = `EventTime` + `TtlDuration` . For information on HardDelete, see the
       * [DeleteRecord](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_DeleteRecord.html)
       * API in the Amazon SageMaker API Reference guide.
       */
      public fun ttlDuration(ttlDuration: TtlDurationProperty)

      /**
       * @param ttlDuration Time to live duration, where the record is hard deleted after the
       * expiration time is reached;.
       * `ExpiresAt` = `EventTime` + `TtlDuration` . For information on HardDelete, see the
       * [DeleteRecord](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_DeleteRecord.html)
       * API in the Amazon SageMaker API Reference guide.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb1b501373f2a46a285536f1241140627190292598e965d8a4636541a81400e7")
      public fun ttlDuration(ttlDuration: TtlDurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreConfigProperty.builder()

      /**
       * @param enableOnlineStore Turn `OnlineStore` off by specifying `False` for the
       * `EnableOnlineStore` flag.
       * Turn `OnlineStore` on by specifying `True` for the `EnableOnlineStore` flag.
       *
       * The default value is `False` .
       */
      override fun enableOnlineStore(enableOnlineStore: Boolean) {
        cdkBuilder.enableOnlineStore(enableOnlineStore)
      }

      /**
       * @param enableOnlineStore Turn `OnlineStore` off by specifying `False` for the
       * `EnableOnlineStore` flag.
       * Turn `OnlineStore` on by specifying `True` for the `EnableOnlineStore` flag.
       *
       * The default value is `False` .
       */
      override fun enableOnlineStore(enableOnlineStore: IResolvable) {
        cdkBuilder.enableOnlineStore(enableOnlineStore.let(IResolvable::unwrap))
      }

      /**
       * @param securityConfig Use to specify KMS Key ID ( `KMSKeyId` ) for at-rest encryption of
       * your `OnlineStore` .
       */
      override fun securityConfig(securityConfig: IResolvable) {
        cdkBuilder.securityConfig(securityConfig.let(IResolvable::unwrap))
      }

      /**
       * @param securityConfig Use to specify KMS Key ID ( `KMSKeyId` ) for at-rest encryption of
       * your `OnlineStore` .
       */
      override fun securityConfig(securityConfig: OnlineStoreSecurityConfigProperty) {
        cdkBuilder.securityConfig(securityConfig.let(OnlineStoreSecurityConfigProperty::unwrap))
      }

      /**
       * @param securityConfig Use to specify KMS Key ID ( `KMSKeyId` ) for at-rest encryption of
       * your `OnlineStore` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73f873d31d41619f0d72a0f13cfd0f2e7d0de00346b39a50ebd5118695396812")
      override
          fun securityConfig(securityConfig: OnlineStoreSecurityConfigProperty.Builder.() -> Unit):
          Unit = securityConfig(OnlineStoreSecurityConfigProperty(securityConfig))

      /**
       * @param storageType Option for different tiers of low latency storage for real-time data
       * retrieval.
       * * `Standard` : A managed low latency data store for feature groups.
       * * `InMemory` : A managed data store for feature groups that supports very low latency
       * retrieval.
       */
      override fun storageType(storageType: String) {
        cdkBuilder.storageType(storageType)
      }

      /**
       * @param ttlDuration Time to live duration, where the record is hard deleted after the
       * expiration time is reached;.
       * `ExpiresAt` = `EventTime` + `TtlDuration` . For information on HardDelete, see the
       * [DeleteRecord](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_DeleteRecord.html)
       * API in the Amazon SageMaker API Reference guide.
       */
      override fun ttlDuration(ttlDuration: IResolvable) {
        cdkBuilder.ttlDuration(ttlDuration.let(IResolvable::unwrap))
      }

      /**
       * @param ttlDuration Time to live duration, where the record is hard deleted after the
       * expiration time is reached;.
       * `ExpiresAt` = `EventTime` + `TtlDuration` . For information on HardDelete, see the
       * [DeleteRecord](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_DeleteRecord.html)
       * API in the Amazon SageMaker API Reference guide.
       */
      override fun ttlDuration(ttlDuration: TtlDurationProperty) {
        cdkBuilder.ttlDuration(ttlDuration.let(TtlDurationProperty::unwrap))
      }

      /**
       * @param ttlDuration Time to live duration, where the record is hard deleted after the
       * expiration time is reached;.
       * `ExpiresAt` = `EventTime` + `TtlDuration` . For information on HardDelete, see the
       * [DeleteRecord](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_DeleteRecord.html)
       * API in the Amazon SageMaker API Reference guide.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb1b501373f2a46a285536f1241140627190292598e965d8a4636541a81400e7")
      override fun ttlDuration(ttlDuration: TtlDurationProperty.Builder.() -> Unit): Unit =
          ttlDuration(TtlDurationProperty(ttlDuration))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreConfigProperty,
    ) : CdkObject(cdkObject), OnlineStoreConfigProperty {
      /**
       * Turn `OnlineStore` off by specifying `False` for the `EnableOnlineStore` flag.
       *
       * Turn `OnlineStore` on by specifying `True` for the `EnableOnlineStore` flag.
       *
       * The default value is `False` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-onlinestoreconfig.html#cfn-sagemaker-featuregroup-onlinestoreconfig-enableonlinestore)
       */
      override fun enableOnlineStore(): Any? = unwrap(this).getEnableOnlineStore()

      /**
       * Use to specify KMS Key ID ( `KMSKeyId` ) for at-rest encryption of your `OnlineStore` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-onlinestoreconfig.html#cfn-sagemaker-featuregroup-onlinestoreconfig-securityconfig)
       */
      override fun securityConfig(): Any? = unwrap(this).getSecurityConfig()

      /**
       * Option for different tiers of low latency storage for real-time data retrieval.
       *
       * * `Standard` : A managed low latency data store for feature groups.
       * * `InMemory` : A managed data store for feature groups that supports very low latency
       * retrieval.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-onlinestoreconfig.html#cfn-sagemaker-featuregroup-onlinestoreconfig-storagetype)
       */
      override fun storageType(): String? = unwrap(this).getStorageType()

      /**
       * Time to live duration, where the record is hard deleted after the expiration time is
       * reached;
       *
       * `ExpiresAt` = `EventTime` + `TtlDuration` . For information on HardDelete, see the
       * [DeleteRecord](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_DeleteRecord.html)
       * API in the Amazon SageMaker API Reference guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-onlinestoreconfig.html#cfn-sagemaker-featuregroup-onlinestoreconfig-ttlduration)
       */
      override fun ttlDuration(): Any? = unwrap(this).getTtlDuration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OnlineStoreConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreConfigProperty):
          OnlineStoreConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OnlineStoreConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnlineStoreConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreConfigProperty
    }
  }

  /**
   * The security configuration for `OnlineStore` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * OnlineStoreSecurityConfigProperty onlineStoreSecurityConfigProperty =
   * OnlineStoreSecurityConfigProperty.builder()
   * .kmsKeyId("kmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-onlinestoresecurityconfig.html)
   */
  public interface OnlineStoreSecurityConfigProperty {
    /**
     * The AWS Key Management Service (KMS) key ARN that SageMaker Feature Store uses to encrypt the
     * Amazon S3 objects at rest using Amazon S3 server-side encryption.
     *
     * The caller (either user or IAM role) of `CreateFeatureGroup` must have below permissions to
     * the `OnlineStore` `KmsKeyId` :
     *
     * * `"kms:Encrypt"`
     * * `"kms:Decrypt"`
     * * `"kms:DescribeKey"`
     * * `"kms:CreateGrant"`
     * * `"kms:RetireGrant"`
     * * `"kms:ReEncryptFrom"`
     * * `"kms:ReEncryptTo"`
     * * `"kms:GenerateDataKey"`
     * * `"kms:ListAliases"`
     * * `"kms:ListGrants"`
     * * `"kms:RevokeGrant"`
     *
     * The caller (either user or IAM role) to all DataPlane operations ( `PutRecord` , `GetRecord`
     * , `DeleteRecord` ) must have the following permissions to the `KmsKeyId` :
     *
     * * `"kms:Decrypt"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-onlinestoresecurityconfig.html#cfn-sagemaker-featuregroup-onlinestoresecurityconfig-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * A builder for [OnlineStoreSecurityConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId The AWS Key Management Service (KMS) key ARN that SageMaker Feature Store
       * uses to encrypt the Amazon S3 objects at rest using Amazon S3 server-side encryption.
       * The caller (either user or IAM role) of `CreateFeatureGroup` must have below permissions to
       * the `OnlineStore` `KmsKeyId` :
       *
       * * `"kms:Encrypt"`
       * * `"kms:Decrypt"`
       * * `"kms:DescribeKey"`
       * * `"kms:CreateGrant"`
       * * `"kms:RetireGrant"`
       * * `"kms:ReEncryptFrom"`
       * * `"kms:ReEncryptTo"`
       * * `"kms:GenerateDataKey"`
       * * `"kms:ListAliases"`
       * * `"kms:ListGrants"`
       * * `"kms:RevokeGrant"`
       *
       * The caller (either user or IAM role) to all DataPlane operations ( `PutRecord` ,
       * `GetRecord` , `DeleteRecord` ) must have the following permissions to the `KmsKeyId` :
       *
       * * `"kms:Decrypt"`
       */
      public fun kmsKeyId(kmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreSecurityConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreSecurityConfigProperty.builder()

      /**
       * @param kmsKeyId The AWS Key Management Service (KMS) key ARN that SageMaker Feature Store
       * uses to encrypt the Amazon S3 objects at rest using Amazon S3 server-side encryption.
       * The caller (either user or IAM role) of `CreateFeatureGroup` must have below permissions to
       * the `OnlineStore` `KmsKeyId` :
       *
       * * `"kms:Encrypt"`
       * * `"kms:Decrypt"`
       * * `"kms:DescribeKey"`
       * * `"kms:CreateGrant"`
       * * `"kms:RetireGrant"`
       * * `"kms:ReEncryptFrom"`
       * * `"kms:ReEncryptTo"`
       * * `"kms:GenerateDataKey"`
       * * `"kms:ListAliases"`
       * * `"kms:ListGrants"`
       * * `"kms:RevokeGrant"`
       *
       * The caller (either user or IAM role) to all DataPlane operations ( `PutRecord` ,
       * `GetRecord` , `DeleteRecord` ) must have the following permissions to the `KmsKeyId` :
       *
       * * `"kms:Decrypt"`
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreSecurityConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreSecurityConfigProperty,
    ) : CdkObject(cdkObject), OnlineStoreSecurityConfigProperty {
      /**
       * The AWS Key Management Service (KMS) key ARN that SageMaker Feature Store uses to encrypt
       * the Amazon S3 objects at rest using Amazon S3 server-side encryption.
       *
       * The caller (either user or IAM role) of `CreateFeatureGroup` must have below permissions to
       * the `OnlineStore` `KmsKeyId` :
       *
       * * `"kms:Encrypt"`
       * * `"kms:Decrypt"`
       * * `"kms:DescribeKey"`
       * * `"kms:CreateGrant"`
       * * `"kms:RetireGrant"`
       * * `"kms:ReEncryptFrom"`
       * * `"kms:ReEncryptTo"`
       * * `"kms:GenerateDataKey"`
       * * `"kms:ListAliases"`
       * * `"kms:ListGrants"`
       * * `"kms:RevokeGrant"`
       *
       * The caller (either user or IAM role) to all DataPlane operations ( `PutRecord` ,
       * `GetRecord` , `DeleteRecord` ) must have the following permissions to the `KmsKeyId` :
       *
       * * `"kms:Decrypt"`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-onlinestoresecurityconfig.html#cfn-sagemaker-featuregroup-onlinestoresecurityconfig-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OnlineStoreSecurityConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreSecurityConfigProperty):
          OnlineStoreSecurityConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OnlineStoreSecurityConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnlineStoreSecurityConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreSecurityConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreSecurityConfigProperty
    }
  }

  /**
   * The Amazon Simple Storage (Amazon S3) location and security configuration for `OfflineStore` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * S3StorageConfigProperty s3StorageConfigProperty = S3StorageConfigProperty.builder()
   * .s3Uri("s3Uri")
   * // the properties below are optional
   * .kmsKeyId("kmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-s3storageconfig.html)
   */
  public interface S3StorageConfigProperty {
    /**
     * The AWS Key Management Service (KMS) key ARN of the key used to encrypt any objects written
     * into the `OfflineStore` S3 location.
     *
     * The IAM `roleARN` that is passed as a parameter to `CreateFeatureGroup` must have below
     * permissions to the `KmsKeyId` :
     *
     * * `"kms:GenerateDataKey"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-s3storageconfig.html#cfn-sagemaker-featuregroup-s3storageconfig-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The S3 URI, or location in Amazon S3, of `OfflineStore` .
     *
     * S3 URIs have a format similar to the following: `s3://example-bucket/prefix/` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-s3storageconfig.html#cfn-sagemaker-featuregroup-s3storageconfig-s3uri)
     */
    public fun s3Uri(): String

    /**
     * A builder for [S3StorageConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId The AWS Key Management Service (KMS) key ARN of the key used to encrypt any
       * objects written into the `OfflineStore` S3 location.
       * The IAM `roleARN` that is passed as a parameter to `CreateFeatureGroup` must have below
       * permissions to the `KmsKeyId` :
       *
       * * `"kms:GenerateDataKey"`
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param s3Uri The S3 URI, or location in Amazon S3, of `OfflineStore` . 
       * S3 URIs have a format similar to the following: `s3://example-bucket/prefix/` .
       */
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.S3StorageConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.S3StorageConfigProperty.builder()

      /**
       * @param kmsKeyId The AWS Key Management Service (KMS) key ARN of the key used to encrypt any
       * objects written into the `OfflineStore` S3 location.
       * The IAM `roleARN` that is passed as a parameter to `CreateFeatureGroup` must have below
       * permissions to the `KmsKeyId` :
       *
       * * `"kms:GenerateDataKey"`
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param s3Uri The S3 URI, or location in Amazon S3, of `OfflineStore` . 
       * S3 URIs have a format similar to the following: `s3://example-bucket/prefix/` .
       */
      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.S3StorageConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.S3StorageConfigProperty,
    ) : CdkObject(cdkObject), S3StorageConfigProperty {
      /**
       * The AWS Key Management Service (KMS) key ARN of the key used to encrypt any objects written
       * into the `OfflineStore` S3 location.
       *
       * The IAM `roleARN` that is passed as a parameter to `CreateFeatureGroup` must have below
       * permissions to the `KmsKeyId` :
       *
       * * `"kms:GenerateDataKey"`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-s3storageconfig.html#cfn-sagemaker-featuregroup-s3storageconfig-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * The S3 URI, or location in Amazon S3, of `OfflineStore` .
       *
       * S3 URIs have a format similar to the following: `s3://example-bucket/prefix/` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-s3storageconfig.html#cfn-sagemaker-featuregroup-s3storageconfig-s3uri)
       */
      override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3StorageConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.S3StorageConfigProperty):
          S3StorageConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? S3StorageConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3StorageConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.S3StorageConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.S3StorageConfigProperty
    }
  }

  /**
   * Used to set feature group throughput configuration.
   *
   * There are two modes: `ON_DEMAND` and `PROVISIONED` . With on-demand mode, you are charged for
   * data reads and writes that your application performs on your feature group. You do not need to
   * specify read and write throughput because Feature Store accommodates your workloads as they ramp
   * up and down. You can switch a feature group to on-demand only once in a 24 hour period. With
   * provisioned throughput mode, you specify the read and write capacity per second that you expect
   * your application to require, and you are billed based on those limits. Exceeding provisioned
   * throughput will result in your requests being throttled.
   *
   * Note: `PROVISIONED` throughput mode is supported only for feature groups that are offline-only,
   * or use the
   * [`Standard`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OnlineStoreConfig.html#sagemaker-Type-OnlineStoreConfig-StorageType)
   * tier online store.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ThroughputConfigProperty throughputConfigProperty = ThroughputConfigProperty.builder()
   * .throughputMode("throughputMode")
   * // the properties below are optional
   * .provisionedReadCapacityUnits(123)
   * .provisionedWriteCapacityUnits(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-throughputconfig.html)
   */
  public interface ThroughputConfigProperty {
    /**
     * For provisioned feature groups with online store enabled, this indicates the read throughput
     * you are billed for and can consume without throttling.
     *
     * This field is not applicable for on-demand feature groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-throughputconfig.html#cfn-sagemaker-featuregroup-throughputconfig-provisionedreadcapacityunits)
     */
    public fun provisionedReadCapacityUnits(): Number? =
        unwrap(this).getProvisionedReadCapacityUnits()

    /**
     * For provisioned feature groups, this indicates the write throughput you are billed for and
     * can consume without throttling.
     *
     * This field is not applicable for on-demand feature groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-throughputconfig.html#cfn-sagemaker-featuregroup-throughputconfig-provisionedwritecapacityunits)
     */
    public fun provisionedWriteCapacityUnits(): Number? =
        unwrap(this).getProvisionedWriteCapacityUnits()

    /**
     * The mode used for your feature group throughput: `ON_DEMAND` or `PROVISIONED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-throughputconfig.html#cfn-sagemaker-featuregroup-throughputconfig-throughputmode)
     */
    public fun throughputMode(): String

    /**
     * A builder for [ThroughputConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param provisionedReadCapacityUnits For provisioned feature groups with online store
       * enabled, this indicates the read throughput you are billed for and can consume without
       * throttling.
       * This field is not applicable for on-demand feature groups.
       */
      public fun provisionedReadCapacityUnits(provisionedReadCapacityUnits: Number)

      /**
       * @param provisionedWriteCapacityUnits For provisioned feature groups, this indicates the
       * write throughput you are billed for and can consume without throttling.
       * This field is not applicable for on-demand feature groups.
       */
      public fun provisionedWriteCapacityUnits(provisionedWriteCapacityUnits: Number)

      /**
       * @param throughputMode The mode used for your feature group throughput: `ON_DEMAND` or
       * `PROVISIONED` . 
       */
      public fun throughputMode(throughputMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.ThroughputConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.ThroughputConfigProperty.builder()

      /**
       * @param provisionedReadCapacityUnits For provisioned feature groups with online store
       * enabled, this indicates the read throughput you are billed for and can consume without
       * throttling.
       * This field is not applicable for on-demand feature groups.
       */
      override fun provisionedReadCapacityUnits(provisionedReadCapacityUnits: Number) {
        cdkBuilder.provisionedReadCapacityUnits(provisionedReadCapacityUnits)
      }

      /**
       * @param provisionedWriteCapacityUnits For provisioned feature groups, this indicates the
       * write throughput you are billed for and can consume without throttling.
       * This field is not applicable for on-demand feature groups.
       */
      override fun provisionedWriteCapacityUnits(provisionedWriteCapacityUnits: Number) {
        cdkBuilder.provisionedWriteCapacityUnits(provisionedWriteCapacityUnits)
      }

      /**
       * @param throughputMode The mode used for your feature group throughput: `ON_DEMAND` or
       * `PROVISIONED` . 
       */
      override fun throughputMode(throughputMode: String) {
        cdkBuilder.throughputMode(throughputMode)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.ThroughputConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.ThroughputConfigProperty,
    ) : CdkObject(cdkObject), ThroughputConfigProperty {
      /**
       * For provisioned feature groups with online store enabled, this indicates the read
       * throughput you are billed for and can consume without throttling.
       *
       * This field is not applicable for on-demand feature groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-throughputconfig.html#cfn-sagemaker-featuregroup-throughputconfig-provisionedreadcapacityunits)
       */
      override fun provisionedReadCapacityUnits(): Number? =
          unwrap(this).getProvisionedReadCapacityUnits()

      /**
       * For provisioned feature groups, this indicates the write throughput you are billed for and
       * can consume without throttling.
       *
       * This field is not applicable for on-demand feature groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-throughputconfig.html#cfn-sagemaker-featuregroup-throughputconfig-provisionedwritecapacityunits)
       */
      override fun provisionedWriteCapacityUnits(): Number? =
          unwrap(this).getProvisionedWriteCapacityUnits()

      /**
       * The mode used for your feature group throughput: `ON_DEMAND` or `PROVISIONED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-throughputconfig.html#cfn-sagemaker-featuregroup-throughputconfig-throughputmode)
       */
      override fun throughputMode(): String = unwrap(this).getThroughputMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ThroughputConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.ThroughputConfigProperty):
          ThroughputConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? ThroughputConfigProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThroughputConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.ThroughputConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.ThroughputConfigProperty
    }
  }

  /**
   * Time to live duration, where the record is hard deleted after the expiration time is reached;
   *
   * `ExpiresAt` = `EventTime` + `TtlDuration` . For information on HardDelete, see the
   * [DeleteRecord](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_DeleteRecord.html)
   * API in the Amazon SageMaker API Reference guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * TtlDurationProperty ttlDurationProperty = TtlDurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-ttlduration.html)
   */
  public interface TtlDurationProperty {
    /**
     * `TtlDuration` time unit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-ttlduration.html#cfn-sagemaker-featuregroup-ttlduration-unit)
     */
    public fun unit(): String? = unwrap(this).getUnit()

    /**
     * `TtlDuration` time value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-ttlduration.html#cfn-sagemaker-featuregroup-ttlduration-value)
     */
    public fun `value`(): Number? = unwrap(this).getValue()

    /**
     * A builder for [TtlDurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param unit `TtlDuration` time unit.
       */
      public fun unit(unit: String)

      /**
       * @param value `TtlDuration` time value.
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.TtlDurationProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.TtlDurationProperty.builder()

      /**
       * @param unit `TtlDuration` time unit.
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      /**
       * @param value `TtlDuration` time value.
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.TtlDurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.TtlDurationProperty,
    ) : CdkObject(cdkObject), TtlDurationProperty {
      /**
       * `TtlDuration` time unit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-ttlduration.html#cfn-sagemaker-featuregroup-ttlduration-unit)
       */
      override fun unit(): String? = unwrap(this).getUnit()

      /**
       * `TtlDuration` time value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-ttlduration.html#cfn-sagemaker-featuregroup-ttlduration-value)
       */
      override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TtlDurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.TtlDurationProperty):
          TtlDurationProperty = CdkObjectWrappers.wrap(cdkObject) as? TtlDurationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TtlDurationProperty):
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.TtlDurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.TtlDurationProperty
    }
  }
}
