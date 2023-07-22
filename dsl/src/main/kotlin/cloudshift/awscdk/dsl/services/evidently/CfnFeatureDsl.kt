@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.evidently.CfnFeature
import software.constructs.Construct

@CdkDslMarker
public class CfnFeatureDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFeature.Builder = CfnFeature.Builder.create(scope, id)

  private val _entityOverrides: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _variations: MutableList<Any> = mutableListOf()

  /**
   * The name of the variation to use as the default variation.
   *
   * The default variation is served to users who are not allocated to any ongoing launches or
   * experiments of this feature.
   *
   * This variation must also be listed in the `Variations` structure.
   *
   * If you omit `DefaultVariation` , the first variation listed in the `Variations` structure is
   * used as the default variation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-defaultvariation)
   * @param defaultVariation The name of the variation to use as the default variation. 
   */
  public fun defaultVariation(defaultVariation: String) {
    cdkBuilder.defaultVariation(defaultVariation)
  }

  /**
   * An optional description of the feature.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-description)
   * @param description An optional description of the feature. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Specify users that should always be served a specific variation of a feature.
   *
   * Each user is specified by a key-value pair . For each key, specify a user by entering their
   * user ID, account ID, or some other identifier. For the value, specify the name of the variation
   * that they are to be served.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-entityoverrides)
   * @param entityOverrides Specify users that should always be served a specific variation of a
   * feature. 
   */
  public fun entityOverrides(vararg entityOverrides: Any) {
    _entityOverrides.addAll(listOf(*entityOverrides))
  }

  /**
   * Specify users that should always be served a specific variation of a feature.
   *
   * Each user is specified by a key-value pair . For each key, specify a user by entering their
   * user ID, account ID, or some other identifier. For the value, specify the name of the variation
   * that they are to be served.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-entityoverrides)
   * @param entityOverrides Specify users that should always be served a specific variation of a
   * feature. 
   */
  public fun entityOverrides(entityOverrides: Collection<Any>) {
    _entityOverrides.addAll(entityOverrides)
  }

  /**
   * Specify users that should always be served a specific variation of a feature.
   *
   * Each user is specified by a key-value pair . For each key, specify a user by entering their
   * user ID, account ID, or some other identifier. For the value, specify the name of the variation
   * that they are to be served.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-entityoverrides)
   * @param entityOverrides Specify users that should always be served a specific variation of a
   * feature. 
   */
  public fun entityOverrides(entityOverrides: IResolvable) {
    cdkBuilder.entityOverrides(entityOverrides)
  }

  /**
   * Specify `ALL_RULES` to activate the traffic allocation specified by any ongoing launches or
   * experiments.
   *
   * Specify `DEFAULT_VARIATION` to serve the default variation to all users instead.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-evaluationstrategy)
   * @param evaluationStrategy Specify `ALL_RULES` to activate the traffic allocation specified by
   * any ongoing launches or experiments. 
   */
  public fun evaluationStrategy(evaluationStrategy: String) {
    cdkBuilder.evaluationStrategy(evaluationStrategy)
  }

  /**
   * The name for the feature.
   *
   * It can include up to 127 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-name)
   * @param name The name for the feature. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The name or ARN of the project that is to contain the new feature.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-project)
   * @param project The name or ARN of the project that is to contain the new feature. 
   */
  public fun project(project: String) {
    cdkBuilder.project(project)
  }

  /**
   * Assigns one or more tags (key-value pairs) to the feature.
   *
   * Tags can help you organize and categorize your resources. You can also use them to scope user
   * permissions by granting a user permission to access or change only resources with certain tag
   * values.
   *
   * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
   * characters.
   *
   * You can associate as many as 50 tags with a feature.
   *
   * For more information, see [Tagging AWS
   * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-tags)
   * @param tags Assigns one or more tags (key-value pairs) to the feature. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Assigns one or more tags (key-value pairs) to the feature.
   *
   * Tags can help you organize and categorize your resources. You can also use them to scope user
   * permissions by granting a user permission to access or change only resources with certain tag
   * values.
   *
   * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
   * characters.
   *
   * You can associate as many as 50 tags with a feature.
   *
   * For more information, see [Tagging AWS
   * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-tags)
   * @param tags Assigns one or more tags (key-value pairs) to the feature. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * An array of structures that contain the configuration of the feature's different variations.
   *
   * Each `VariationObject` in the `Variations` array for a feature must have the same type of value
   * ( `BooleanValue` , `DoubleValue` , `LongValue` or `StringValue` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-variations)
   * @param variations An array of structures that contain the configuration of the feature's
   * different variations. 
   */
  public fun variations(vararg variations: Any) {
    _variations.addAll(listOf(*variations))
  }

  /**
   * An array of structures that contain the configuration of the feature's different variations.
   *
   * Each `VariationObject` in the `Variations` array for a feature must have the same type of value
   * ( `BooleanValue` , `DoubleValue` , `LongValue` or `StringValue` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-variations)
   * @param variations An array of structures that contain the configuration of the feature's
   * different variations. 
   */
  public fun variations(variations: Collection<Any>) {
    _variations.addAll(variations)
  }

  /**
   * An array of structures that contain the configuration of the feature's different variations.
   *
   * Each `VariationObject` in the `Variations` array for a feature must have the same type of value
   * ( `BooleanValue` , `DoubleValue` , `LongValue` or `StringValue` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-variations)
   * @param variations An array of structures that contain the configuration of the feature's
   * different variations. 
   */
  public fun variations(variations: IResolvable) {
    cdkBuilder.variations(variations)
  }

  public fun build(): CfnFeature {
    if(_entityOverrides.isNotEmpty()) cdkBuilder.entityOverrides(_entityOverrides)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_variations.isNotEmpty()) cdkBuilder.variations(_variations)
    return cdkBuilder.build()
  }
}
