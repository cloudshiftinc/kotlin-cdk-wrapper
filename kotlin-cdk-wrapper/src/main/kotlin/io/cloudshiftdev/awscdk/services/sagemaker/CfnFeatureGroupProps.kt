@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

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
 * Properties for defining a `CfnFeatureGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * Object offlineStoreConfig;
 * Object onlineStoreConfig;
 * CfnFeatureGroupProps cfnFeatureGroupProps = CfnFeatureGroupProps.builder()
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
public interface CfnFeatureGroupProps {
  /**
   * A free form description of a `FeatureGroup` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the feature that stores the `EventTime` of a Record in a `FeatureGroup` .
   *
   * A `EventTime` is point in time when a new event occurs that corresponds to the creation or
   * update of a `Record` in `FeatureGroup` . All `Records` in the `FeatureGroup` must have a
   * corresponding `EventTime` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-eventtimefeaturename)
   */
  public fun eventTimeFeatureName(): String

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
   */
  public fun featureDefinitions(): Any

  /**
   * The name of the `FeatureGroup` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-featuregroupname)
   */
  public fun featureGroupName(): String

  /**
   * The configuration of an `OfflineStore` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-offlinestoreconfig)
   */
  public fun offlineStoreConfig(): Any? = unwrap(this).getOfflineStoreConfig()

  /**
   * The configuration of an `OnlineStore` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-onlinestoreconfig)
   */
  public fun onlineStoreConfig(): Any? = unwrap(this).getOnlineStoreConfig()

  /**
   * The name of the `Feature` whose value uniquely identifies a `Record` defined in the
   * `FeatureGroup` `FeatureDefinitions` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-recordidentifierfeaturename)
   */
  public fun recordIdentifierFeatureName(): String

  /**
   * The Amazon Resource Name (ARN) of the IAM execution role used to create the feature group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * Tags used to define a `FeatureGroup` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-throughputconfig)
   */
  public fun throughputConfig(): Any? = unwrap(this).getThroughputConfig()

  /**
   * A builder for [CfnFeatureGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A free form description of a `FeatureGroup` .
     */
    public fun description(description: String)

    /**
     * @param eventTimeFeatureName The name of the feature that stores the `EventTime` of a Record
     * in a `FeatureGroup` . 
     * A `EventTime` is point in time when a new event occurs that corresponds to the creation or
     * update of a `Record` in `FeatureGroup` . All `Records` in the `FeatureGroup` must have a
     * corresponding `EventTime` .
     */
    public fun eventTimeFeatureName(eventTimeFeatureName: String)

    /**
     * @param featureDefinitions A list of `Feature` s. Each `Feature` must include a `FeatureName`
     * and a `FeatureType` . 
     * Valid `FeatureType` s are `Integral` , `Fractional` and `String` .
     *
     * `FeatureName` s cannot be any of the following: `is_deleted` , `write_time` ,
     * `api_invocation_time` .
     *
     * You can create up to 2,500 `FeatureDefinition` s per `FeatureGroup` .
     */
    public fun featureDefinitions(featureDefinitions: IResolvable)

    /**
     * @param featureDefinitions A list of `Feature` s. Each `Feature` must include a `FeatureName`
     * and a `FeatureType` . 
     * Valid `FeatureType` s are `Integral` , `Fractional` and `String` .
     *
     * `FeatureName` s cannot be any of the following: `is_deleted` , `write_time` ,
     * `api_invocation_time` .
     *
     * You can create up to 2,500 `FeatureDefinition` s per `FeatureGroup` .
     */
    public fun featureDefinitions(featureDefinitions: List<Any>)

    /**
     * @param featureDefinitions A list of `Feature` s. Each `Feature` must include a `FeatureName`
     * and a `FeatureType` . 
     * Valid `FeatureType` s are `Integral` , `Fractional` and `String` .
     *
     * `FeatureName` s cannot be any of the following: `is_deleted` , `write_time` ,
     * `api_invocation_time` .
     *
     * You can create up to 2,500 `FeatureDefinition` s per `FeatureGroup` .
     */
    public fun featureDefinitions(vararg featureDefinitions: Any)

    /**
     * @param featureGroupName The name of the `FeatureGroup` . 
     */
    public fun featureGroupName(featureGroupName: String)

    /**
     * @param offlineStoreConfig The configuration of an `OfflineStore` .
     */
    public fun offlineStoreConfig(offlineStoreConfig: Any)

    /**
     * @param onlineStoreConfig The configuration of an `OnlineStore` .
     */
    public fun onlineStoreConfig(onlineStoreConfig: Any)

    /**
     * @param recordIdentifierFeatureName The name of the `Feature` whose value uniquely identifies
     * a `Record` defined in the `FeatureGroup` `FeatureDefinitions` . 
     */
    public fun recordIdentifierFeatureName(recordIdentifierFeatureName: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM execution role used to create the
     * feature group.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags Tags used to define a `FeatureGroup` .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags used to define a `FeatureGroup` .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param throughputConfig Used to set feature group throughput configuration.
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
     */
    public fun throughputConfig(throughputConfig: IResolvable)

    /**
     * @param throughputConfig Used to set feature group throughput configuration.
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
     */
    public fun throughputConfig(throughputConfig: CfnFeatureGroup.ThroughputConfigProperty)

    /**
     * @param throughputConfig Used to set feature group throughput configuration.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("357de001ed16b380820ab06022cbd2748a0b0a00b4eb8a37aefec7bf5c7b3336")
    public
        fun throughputConfig(throughputConfig: CfnFeatureGroup.ThroughputConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps.builder()

    /**
     * @param description A free form description of a `FeatureGroup` .
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param eventTimeFeatureName The name of the feature that stores the `EventTime` of a Record
     * in a `FeatureGroup` . 
     * A `EventTime` is point in time when a new event occurs that corresponds to the creation or
     * update of a `Record` in `FeatureGroup` . All `Records` in the `FeatureGroup` must have a
     * corresponding `EventTime` .
     */
    override fun eventTimeFeatureName(eventTimeFeatureName: String) {
      cdkBuilder.eventTimeFeatureName(eventTimeFeatureName)
    }

    /**
     * @param featureDefinitions A list of `Feature` s. Each `Feature` must include a `FeatureName`
     * and a `FeatureType` . 
     * Valid `FeatureType` s are `Integral` , `Fractional` and `String` .
     *
     * `FeatureName` s cannot be any of the following: `is_deleted` , `write_time` ,
     * `api_invocation_time` .
     *
     * You can create up to 2,500 `FeatureDefinition` s per `FeatureGroup` .
     */
    override fun featureDefinitions(featureDefinitions: IResolvable) {
      cdkBuilder.featureDefinitions(featureDefinitions.let(IResolvable::unwrap))
    }

    /**
     * @param featureDefinitions A list of `Feature` s. Each `Feature` must include a `FeatureName`
     * and a `FeatureType` . 
     * Valid `FeatureType` s are `Integral` , `Fractional` and `String` .
     *
     * `FeatureName` s cannot be any of the following: `is_deleted` , `write_time` ,
     * `api_invocation_time` .
     *
     * You can create up to 2,500 `FeatureDefinition` s per `FeatureGroup` .
     */
    override fun featureDefinitions(featureDefinitions: List<Any>) {
      cdkBuilder.featureDefinitions(featureDefinitions)
    }

    /**
     * @param featureDefinitions A list of `Feature` s. Each `Feature` must include a `FeatureName`
     * and a `FeatureType` . 
     * Valid `FeatureType` s are `Integral` , `Fractional` and `String` .
     *
     * `FeatureName` s cannot be any of the following: `is_deleted` , `write_time` ,
     * `api_invocation_time` .
     *
     * You can create up to 2,500 `FeatureDefinition` s per `FeatureGroup` .
     */
    override fun featureDefinitions(vararg featureDefinitions: Any): Unit =
        featureDefinitions(featureDefinitions.toList())

    /**
     * @param featureGroupName The name of the `FeatureGroup` . 
     */
    override fun featureGroupName(featureGroupName: String) {
      cdkBuilder.featureGroupName(featureGroupName)
    }

    /**
     * @param offlineStoreConfig The configuration of an `OfflineStore` .
     */
    override fun offlineStoreConfig(offlineStoreConfig: Any) {
      cdkBuilder.offlineStoreConfig(offlineStoreConfig)
    }

    /**
     * @param onlineStoreConfig The configuration of an `OnlineStore` .
     */
    override fun onlineStoreConfig(onlineStoreConfig: Any) {
      cdkBuilder.onlineStoreConfig(onlineStoreConfig)
    }

    /**
     * @param recordIdentifierFeatureName The name of the `Feature` whose value uniquely identifies
     * a `Record` defined in the `FeatureGroup` `FeatureDefinitions` . 
     */
    override fun recordIdentifierFeatureName(recordIdentifierFeatureName: String) {
      cdkBuilder.recordIdentifierFeatureName(recordIdentifierFeatureName)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM execution role used to create the
     * feature group.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags Tags used to define a `FeatureGroup` .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Tags used to define a `FeatureGroup` .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param throughputConfig Used to set feature group throughput configuration.
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
     */
    override fun throughputConfig(throughputConfig: IResolvable) {
      cdkBuilder.throughputConfig(throughputConfig.let(IResolvable::unwrap))
    }

    /**
     * @param throughputConfig Used to set feature group throughput configuration.
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
     */
    override fun throughputConfig(throughputConfig: CfnFeatureGroup.ThroughputConfigProperty) {
      cdkBuilder.throughputConfig(throughputConfig.let(CfnFeatureGroup.ThroughputConfigProperty::unwrap))
    }

    /**
     * @param throughputConfig Used to set feature group throughput configuration.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("357de001ed16b380820ab06022cbd2748a0b0a00b4eb8a37aefec7bf5c7b3336")
    override
        fun throughputConfig(throughputConfig: CfnFeatureGroup.ThroughputConfigProperty.Builder.() -> Unit):
        Unit = throughputConfig(CfnFeatureGroup.ThroughputConfigProperty(throughputConfig))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps,
  ) : CdkObject(cdkObject), CfnFeatureGroupProps {
    /**
     * A free form description of a `FeatureGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the feature that stores the `EventTime` of a Record in a `FeatureGroup` .
     *
     * A `EventTime` is point in time when a new event occurs that corresponds to the creation or
     * update of a `Record` in `FeatureGroup` . All `Records` in the `FeatureGroup` must have a
     * corresponding `EventTime` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-eventtimefeaturename)
     */
    override fun eventTimeFeatureName(): String = unwrap(this).getEventTimeFeatureName()

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
     */
    override fun featureDefinitions(): Any = unwrap(this).getFeatureDefinitions()

    /**
     * The name of the `FeatureGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-featuregroupname)
     */
    override fun featureGroupName(): String = unwrap(this).getFeatureGroupName()

    /**
     * The configuration of an `OfflineStore` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-offlinestoreconfig)
     */
    override fun offlineStoreConfig(): Any? = unwrap(this).getOfflineStoreConfig()

    /**
     * The configuration of an `OnlineStore` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-onlinestoreconfig)
     */
    override fun onlineStoreConfig(): Any? = unwrap(this).getOnlineStoreConfig()

    /**
     * The name of the `Feature` whose value uniquely identifies a `Record` defined in the
     * `FeatureGroup` `FeatureDefinitions` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-recordidentifierfeaturename)
     */
    override fun recordIdentifierFeatureName(): String =
        unwrap(this).getRecordIdentifierFeatureName()

    /**
     * The Amazon Resource Name (ARN) of the IAM execution role used to create the feature group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * Tags used to define a `FeatureGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
     */
    override fun throughputConfig(): Any? = unwrap(this).getThroughputConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFeatureGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps):
        CfnFeatureGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFeatureGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFeatureGroupProps):
        software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps
  }
}
