@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup
import software.constructs.Construct

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
 * import software.amazon.awscdk.services.sagemaker.*;
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html)
 */
@CdkDslMarker
public class CfnFeatureGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFeatureGroup.Builder = CfnFeatureGroup.Builder.create(scope, id)

  private val _featureDefinitions: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * A free form description of a `FeatureGroup` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-description)
   * @param description A free form description of a `FeatureGroup` . 
   */
  public fun description(description: String) {
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
   * @param eventTimeFeatureName The name of the feature that stores the `EventTime` of a Record in
   * a `FeatureGroup` . 
   */
  public fun eventTimeFeatureName(eventTimeFeatureName: String) {
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
  public fun featureDefinitions(vararg featureDefinitions: Any) {
    _featureDefinitions.addAll(listOf(*featureDefinitions))
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
  public fun featureDefinitions(featureDefinitions: Collection<Any>) {
    _featureDefinitions.addAll(featureDefinitions)
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
  public fun featureDefinitions(featureDefinitions: IResolvable) {
    cdkBuilder.featureDefinitions(featureDefinitions)
  }

  /**
   * The name of the `FeatureGroup` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-featuregroupname)
   * @param featureGroupName The name of the `FeatureGroup` . 
   */
  public fun featureGroupName(featureGroupName: String) {
    cdkBuilder.featureGroupName(featureGroupName)
  }

  /**
   * The configuration of an `OfflineStore` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-offlinestoreconfig)
   * @param offlineStoreConfig The configuration of an `OfflineStore` . 
   */
  public fun offlineStoreConfig(offlineStoreConfig: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(offlineStoreConfig)
    cdkBuilder.offlineStoreConfig(builder.map)
  }

  /**
   * The configuration of an `OfflineStore` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-offlinestoreconfig)
   * @param offlineStoreConfig The configuration of an `OfflineStore` . 
   */
  public fun offlineStoreConfig(offlineStoreConfig: Any) {
    cdkBuilder.offlineStoreConfig(offlineStoreConfig)
  }

  /**
   * The configuration of an `OnlineStore` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-onlinestoreconfig)
   * @param onlineStoreConfig The configuration of an `OnlineStore` . 
   */
  public fun onlineStoreConfig(onlineStoreConfig: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(onlineStoreConfig)
    cdkBuilder.onlineStoreConfig(builder.map)
  }

  /**
   * The configuration of an `OnlineStore` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-onlinestoreconfig)
   * @param onlineStoreConfig The configuration of an `OnlineStore` . 
   */
  public fun onlineStoreConfig(onlineStoreConfig: Any) {
    cdkBuilder.onlineStoreConfig(onlineStoreConfig)
  }

  /**
   * The name of the `Feature` whose value uniquely identifies a `Record` defined in the
   * `FeatureGroup` `FeatureDefinitions` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-recordidentifierfeaturename)
   * @param recordIdentifierFeatureName The name of the `Feature` whose value uniquely identifies a
   * `Record` defined in the `FeatureGroup` `FeatureDefinitions` . 
   */
  public fun recordIdentifierFeatureName(recordIdentifierFeatureName: String) {
    cdkBuilder.recordIdentifierFeatureName(recordIdentifierFeatureName)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM execution role used to create the feature group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-rolearn)
   * @param roleArn The Amazon Resource Name (ARN) of the IAM execution role used to create the
   * feature group. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * Tags used to define a `FeatureGroup` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-tags)
   * @param tags Tags used to define a `FeatureGroup` . 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Tags used to define a `FeatureGroup` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html#cfn-sagemaker-featuregroup-tags)
   * @param tags Tags used to define a `FeatureGroup` . 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnFeatureGroup {
    if(_featureDefinitions.isNotEmpty()) cdkBuilder.featureDefinitions(_featureDefinitions)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
