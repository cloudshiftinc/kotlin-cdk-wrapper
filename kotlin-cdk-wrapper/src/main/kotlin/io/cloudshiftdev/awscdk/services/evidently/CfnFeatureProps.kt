@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.evidently

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnFeature`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.evidently.*;
 * CfnFeatureProps cfnFeatureProps = CfnFeatureProps.builder()
 * .name("name")
 * .project("project")
 * .variations(List.of(VariationObjectProperty.builder()
 * .variationName("variationName")
 * // the properties below are optional
 * .booleanValue(false)
 * .doubleValue(123)
 * .longValue(123)
 * .stringValue("stringValue")
 * .build()))
 * // the properties below are optional
 * .defaultVariation("defaultVariation")
 * .description("description")
 * .entityOverrides(List.of(EntityOverrideProperty.builder()
 * .entityId("entityId")
 * .variation("variation")
 * .build()))
 * .evaluationStrategy("evaluationStrategy")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html)
 */
public interface CfnFeatureProps {
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
   */
  public fun defaultVariation(): String? = unwrap(this).getDefaultVariation()

  /**
   * An optional description of the feature.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Specify users that should always be served a specific variation of a feature.
   *
   * Each user is specified by a key-value pair . For each key, specify a user by entering their
   * user ID, account ID, or some other identifier. For the value, specify the name of the variation
   * that they are to be served.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-entityoverrides)
   */
  public fun entityOverrides(): Any? = unwrap(this).getEntityOverrides()

  /**
   * Specify `ALL_RULES` to activate the traffic allocation specified by any ongoing launches or
   * experiments.
   *
   * Specify `DEFAULT_VARIATION` to serve the default variation to all users instead.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-evaluationstrategy)
   */
  public fun evaluationStrategy(): String? = unwrap(this).getEvaluationStrategy()

  /**
   * The name for the feature.
   *
   * It can include up to 127 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-name)
   */
  public fun name(): String

  /**
   * The name or ARN of the project that is to contain the new feature.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-project)
   */
  public fun project(): String

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
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of structures that contain the configuration of the feature's different variations.
   *
   * Each `VariationObject` in the `Variations` array for a feature must have the same type of value
   * ( `BooleanValue` , `DoubleValue` , `LongValue` or `StringValue` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-variations)
   */
  public fun variations(): Any

  /**
   * A builder for [CfnFeatureProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param defaultVariation The name of the variation to use as the default variation.
     * The default variation is served to users who are not allocated to any ongoing launches or
     * experiments of this feature.
     *
     * This variation must also be listed in the `Variations` structure.
     *
     * If you omit `DefaultVariation` , the first variation listed in the `Variations` structure is
     * used as the default variation.
     */
    public fun defaultVariation(defaultVariation: String)

    /**
     * @param description An optional description of the feature.
     */
    public fun description(description: String)

    /**
     * @param entityOverrides Specify users that should always be served a specific variation of a
     * feature.
     * Each user is specified by a key-value pair . For each key, specify a user by entering their
     * user ID, account ID, or some other identifier. For the value, specify the name of the variation
     * that they are to be served.
     */
    public fun entityOverrides(entityOverrides: IResolvable)

    /**
     * @param entityOverrides Specify users that should always be served a specific variation of a
     * feature.
     * Each user is specified by a key-value pair . For each key, specify a user by entering their
     * user ID, account ID, or some other identifier. For the value, specify the name of the variation
     * that they are to be served.
     */
    public fun entityOverrides(entityOverrides: List<Any>)

    /**
     * @param entityOverrides Specify users that should always be served a specific variation of a
     * feature.
     * Each user is specified by a key-value pair . For each key, specify a user by entering their
     * user ID, account ID, or some other identifier. For the value, specify the name of the variation
     * that they are to be served.
     */
    public fun entityOverrides(vararg entityOverrides: Any)

    /**
     * @param evaluationStrategy Specify `ALL_RULES` to activate the traffic allocation specified by
     * any ongoing launches or experiments.
     * Specify `DEFAULT_VARIATION` to serve the default variation to all users instead.
     */
    public fun evaluationStrategy(evaluationStrategy: String)

    /**
     * @param name The name for the feature. 
     * It can include up to 127 characters.
     */
    public fun name(name: String)

    /**
     * @param project The name or ARN of the project that is to contain the new feature. 
     */
    public fun project(project: String)

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the feature.
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
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the feature.
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
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param variations An array of structures that contain the configuration of the feature's
     * different variations. 
     * Each `VariationObject` in the `Variations` array for a feature must have the same type of
     * value ( `BooleanValue` , `DoubleValue` , `LongValue` or `StringValue` ).
     */
    public fun variations(variations: IResolvable)

    /**
     * @param variations An array of structures that contain the configuration of the feature's
     * different variations. 
     * Each `VariationObject` in the `Variations` array for a feature must have the same type of
     * value ( `BooleanValue` , `DoubleValue` , `LongValue` or `StringValue` ).
     */
    public fun variations(variations: List<Any>)

    /**
     * @param variations An array of structures that contain the configuration of the feature's
     * different variations. 
     * Each `VariationObject` in the `Variations` array for a feature must have the same type of
     * value ( `BooleanValue` , `DoubleValue` , `LongValue` or `StringValue` ).
     */
    public fun variations(vararg variations: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.evidently.CfnFeatureProps.Builder =
        software.amazon.awscdk.services.evidently.CfnFeatureProps.builder()

    /**
     * @param defaultVariation The name of the variation to use as the default variation.
     * The default variation is served to users who are not allocated to any ongoing launches or
     * experiments of this feature.
     *
     * This variation must also be listed in the `Variations` structure.
     *
     * If you omit `DefaultVariation` , the first variation listed in the `Variations` structure is
     * used as the default variation.
     */
    override fun defaultVariation(defaultVariation: String) {
      cdkBuilder.defaultVariation(defaultVariation)
    }

    /**
     * @param description An optional description of the feature.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param entityOverrides Specify users that should always be served a specific variation of a
     * feature.
     * Each user is specified by a key-value pair . For each key, specify a user by entering their
     * user ID, account ID, or some other identifier. For the value, specify the name of the variation
     * that they are to be served.
     */
    override fun entityOverrides(entityOverrides: IResolvable) {
      cdkBuilder.entityOverrides(entityOverrides.let(IResolvable::unwrap))
    }

    /**
     * @param entityOverrides Specify users that should always be served a specific variation of a
     * feature.
     * Each user is specified by a key-value pair . For each key, specify a user by entering their
     * user ID, account ID, or some other identifier. For the value, specify the name of the variation
     * that they are to be served.
     */
    override fun entityOverrides(entityOverrides: List<Any>) {
      cdkBuilder.entityOverrides(entityOverrides.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param entityOverrides Specify users that should always be served a specific variation of a
     * feature.
     * Each user is specified by a key-value pair . For each key, specify a user by entering their
     * user ID, account ID, or some other identifier. For the value, specify the name of the variation
     * that they are to be served.
     */
    override fun entityOverrides(vararg entityOverrides: Any): Unit =
        entityOverrides(entityOverrides.toList())

    /**
     * @param evaluationStrategy Specify `ALL_RULES` to activate the traffic allocation specified by
     * any ongoing launches or experiments.
     * Specify `DEFAULT_VARIATION` to serve the default variation to all users instead.
     */
    override fun evaluationStrategy(evaluationStrategy: String) {
      cdkBuilder.evaluationStrategy(evaluationStrategy)
    }

    /**
     * @param name The name for the feature. 
     * It can include up to 127 characters.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param project The name or ARN of the project that is to contain the new feature. 
     */
    override fun project(project: String) {
      cdkBuilder.project(project)
    }

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the feature.
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
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the feature.
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
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param variations An array of structures that contain the configuration of the feature's
     * different variations. 
     * Each `VariationObject` in the `Variations` array for a feature must have the same type of
     * value ( `BooleanValue` , `DoubleValue` , `LongValue` or `StringValue` ).
     */
    override fun variations(variations: IResolvable) {
      cdkBuilder.variations(variations.let(IResolvable::unwrap))
    }

    /**
     * @param variations An array of structures that contain the configuration of the feature's
     * different variations. 
     * Each `VariationObject` in the `Variations` array for a feature must have the same type of
     * value ( `BooleanValue` , `DoubleValue` , `LongValue` or `StringValue` ).
     */
    override fun variations(variations: List<Any>) {
      cdkBuilder.variations(variations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param variations An array of structures that contain the configuration of the feature's
     * different variations. 
     * Each `VariationObject` in the `Variations` array for a feature must have the same type of
     * value ( `BooleanValue` , `DoubleValue` , `LongValue` or `StringValue` ).
     */
    override fun variations(vararg variations: Any): Unit = variations(variations.toList())

    public fun build(): software.amazon.awscdk.services.evidently.CfnFeatureProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.evidently.CfnFeatureProps,
  ) : CdkObject(cdkObject), CfnFeatureProps {
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
     */
    override fun defaultVariation(): String? = unwrap(this).getDefaultVariation()

    /**
     * An optional description of the feature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Specify users that should always be served a specific variation of a feature.
     *
     * Each user is specified by a key-value pair . For each key, specify a user by entering their
     * user ID, account ID, or some other identifier. For the value, specify the name of the variation
     * that they are to be served.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-entityoverrides)
     */
    override fun entityOverrides(): Any? = unwrap(this).getEntityOverrides()

    /**
     * Specify `ALL_RULES` to activate the traffic allocation specified by any ongoing launches or
     * experiments.
     *
     * Specify `DEFAULT_VARIATION` to serve the default variation to all users instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-evaluationstrategy)
     */
    override fun evaluationStrategy(): String? = unwrap(this).getEvaluationStrategy()

    /**
     * The name for the feature.
     *
     * It can include up to 127 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The name or ARN of the project that is to contain the new feature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-project)
     */
    override fun project(): String = unwrap(this).getProject()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * An array of structures that contain the configuration of the feature's different variations.
     *
     * Each `VariationObject` in the `Variations` array for a feature must have the same type of
     * value ( `BooleanValue` , `DoubleValue` , `LongValue` or `StringValue` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-variations)
     */
    override fun variations(): Any = unwrap(this).getVariations()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFeatureProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnFeatureProps):
        CfnFeatureProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFeatureProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFeatureProps):
        software.amazon.awscdk.services.evidently.CfnFeatureProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.evidently.CfnFeatureProps
  }
}
