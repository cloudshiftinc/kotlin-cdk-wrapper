package io.cloudshiftdev.awscdk.services.evidently

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFeature internal constructor(
  private val cdkObject: software.amazon.awscdk.services.evidently.CfnFeature,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the feature.
   *
   * For example, `arn:aws:evidently:us-west-2:0123455678912:project/myProject/feature/myFeature` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The name of the variation to use as the default variation.
   */
  public open fun defaultVariation(): String? = unwrap(this).getDefaultVariation()

  /**
   * The name of the variation to use as the default variation.
   */
  public open fun defaultVariation(`value`: String) {
    unwrap(this).setDefaultVariation(`value`)
  }

  /**
   * An optional description of the feature.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * An optional description of the feature.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Specify users that should always be served a specific variation of a feature.
   */
  public open fun entityOverrides(): Any? = unwrap(this).getEntityOverrides()

  /**
   * Specify users that should always be served a specific variation of a feature.
   */
  public open fun entityOverrides(`value`: IResolvable) {
    unwrap(this).setEntityOverrides(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specify users that should always be served a specific variation of a feature.
   */
  public open fun entityOverrides(__idx_ac66f0: List<Any>) {
    unwrap(this).setEntityOverrides(__idx_ac66f0)
  }

  /**
   * Specify users that should always be served a specific variation of a feature.
   */
  public open fun entityOverrides(vararg __idx_ac66f0: Any): Unit =
      entityOverrides(__idx_ac66f0.toList())

  /**
   * Specify `ALL_RULES` to activate the traffic allocation specified by any ongoing launches or
   * experiments.
   */
  public open fun evaluationStrategy(): String? = unwrap(this).getEvaluationStrategy()

  /**
   * Specify `ALL_RULES` to activate the traffic allocation specified by any ongoing launches or
   * experiments.
   */
  public open fun evaluationStrategy(`value`: String) {
    unwrap(this).setEvaluationStrategy(`value`)
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
   * The name for the feature.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name for the feature.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The name or ARN of the project that is to contain the new feature.
   */
  public open fun project(): String = unwrap(this).getProject()

  /**
   * The name or ARN of the project that is to contain the new feature.
   */
  public open fun project(`value`: String) {
    unwrap(this).setProject(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Assigns one or more tags (key-value pairs) to the feature.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Assigns one or more tags (key-value pairs) to the feature.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Assigns one or more tags (key-value pairs) to the feature.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * An array of structures that contain the configuration of the feature's different variations.
   */
  public open fun variations(): Any = unwrap(this).getVariations()

  /**
   * An array of structures that contain the configuration of the feature's different variations.
   */
  public open fun variations(`value`: IResolvable) {
    unwrap(this).setVariations(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of structures that contain the configuration of the feature's different variations.
   */
  public open fun variations(__idx_ac66f0: List<Any>) {
    unwrap(this).setVariations(__idx_ac66f0)
  }

  /**
   * An array of structures that contain the configuration of the feature's different variations.
   */
  public open fun variations(vararg __idx_ac66f0: Any): Unit = variations(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.evidently.CfnFeature].
   */
  @CdkDslMarker
  public interface Builder {
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
    public fun defaultVariation(defaultVariation: String)

    /**
     * An optional description of the feature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-description)
     * @param description An optional description of the feature. 
     */
    public fun description(description: String)

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
    public fun entityOverrides(entityOverrides: IResolvable)

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
    public fun entityOverrides(entityOverrides: List<Any>)

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
    public fun entityOverrides(vararg entityOverrides: Any)

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
    public fun evaluationStrategy(evaluationStrategy: String)

    /**
     * The name for the feature.
     *
     * It can include up to 127 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-name)
     * @param name The name for the feature. 
     */
    public fun name(name: String)

    /**
     * The name or ARN of the project that is to contain the new feature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-project)
     * @param project The name or ARN of the project that is to contain the new feature. 
     */
    public fun project(project: String)

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
    public fun tags(tags: List<CfnTag>)

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
    public fun tags(vararg tags: CfnTag)

    /**
     * An array of structures that contain the configuration of the feature's different variations.
     *
     * Each `VariationObject` in the `Variations` array for a feature must have the same type of
     * value ( `BooleanValue` , `DoubleValue` , `LongValue` or `StringValue` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-variations)
     * @param variations An array of structures that contain the configuration of the feature's
     * different variations. 
     */
    public fun variations(variations: IResolvable)

    /**
     * An array of structures that contain the configuration of the feature's different variations.
     *
     * Each `VariationObject` in the `Variations` array for a feature must have the same type of
     * value ( `BooleanValue` , `DoubleValue` , `LongValue` or `StringValue` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-variations)
     * @param variations An array of structures that contain the configuration of the feature's
     * different variations. 
     */
    public fun variations(variations: List<Any>)

    /**
     * An array of structures that contain the configuration of the feature's different variations.
     *
     * Each `VariationObject` in the `Variations` array for a feature must have the same type of
     * value ( `BooleanValue` , `DoubleValue` , `LongValue` or `StringValue` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-variations)
     * @param variations An array of structures that contain the configuration of the feature's
     * different variations. 
     */
    public fun variations(vararg variations: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.evidently.CfnFeature.Builder =
        software.amazon.awscdk.services.evidently.CfnFeature.Builder.create(scope, id)

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
    override fun defaultVariation(defaultVariation: String) {
      cdkBuilder.defaultVariation(defaultVariation)
    }

    /**
     * An optional description of the feature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-description)
     * @param description An optional description of the feature. 
     */
    override fun description(description: String) {
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
    override fun entityOverrides(entityOverrides: IResolvable) {
      cdkBuilder.entityOverrides(entityOverrides.let(IResolvable::unwrap))
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
    override fun entityOverrides(entityOverrides: List<Any>) {
      cdkBuilder.entityOverrides(entityOverrides)
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
    override fun entityOverrides(vararg entityOverrides: Any): Unit =
        entityOverrides(entityOverrides.toList())

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
    override fun evaluationStrategy(evaluationStrategy: String) {
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
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The name or ARN of the project that is to contain the new feature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-project)
     * @param project The name or ARN of the project that is to contain the new feature. 
     */
    override fun project(project: String) {
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
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * An array of structures that contain the configuration of the feature's different variations.
     *
     * Each `VariationObject` in the `Variations` array for a feature must have the same type of
     * value ( `BooleanValue` , `DoubleValue` , `LongValue` or `StringValue` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-variations)
     * @param variations An array of structures that contain the configuration of the feature's
     * different variations. 
     */
    override fun variations(variations: IResolvable) {
      cdkBuilder.variations(variations.let(IResolvable::unwrap))
    }

    /**
     * An array of structures that contain the configuration of the feature's different variations.
     *
     * Each `VariationObject` in the `Variations` array for a feature must have the same type of
     * value ( `BooleanValue` , `DoubleValue` , `LongValue` or `StringValue` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-variations)
     * @param variations An array of structures that contain the configuration of the feature's
     * different variations. 
     */
    override fun variations(variations: List<Any>) {
      cdkBuilder.variations(variations)
    }

    /**
     * An array of structures that contain the configuration of the feature's different variations.
     *
     * Each `VariationObject` in the `Variations` array for a feature must have the same type of
     * value ( `BooleanValue` , `DoubleValue` , `LongValue` or `StringValue` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html#cfn-evidently-feature-variations)
     * @param variations An array of structures that contain the configuration of the feature's
     * different variations. 
     */
    override fun variations(vararg variations: Any): Unit = variations(variations.toList())

    public fun build(): software.amazon.awscdk.services.evidently.CfnFeature = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFeature {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFeature(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnFeature): CfnFeature =
        CfnFeature(cdkObject)

    internal fun unwrap(wrapped: CfnFeature): software.amazon.awscdk.services.evidently.CfnFeature =
        wrapped.cdkObject
  }

  public interface EntityOverrideProperty {
    /**
     * The entity ID to be served the variation specified in `Variation` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-feature-entityoverride.html#cfn-evidently-feature-entityoverride-entityid)
     */
    public fun entityId(): String? = unwrap(this).getEntityId()

    /**
     * The name of the variation to serve to the user session that matches the `EntityId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-feature-entityoverride.html#cfn-evidently-feature-entityoverride-variation)
     */
    public fun variation(): String? = unwrap(this).getVariation()

    /**
     * A builder for [EntityOverrideProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param entityId The entity ID to be served the variation specified in `Variation` .
       */
      public fun entityId(entityId: String)

      /**
       * @param variation The name of the variation to serve to the user session that matches the
       * `EntityId` .
       */
      public fun variation(variation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnFeature.EntityOverrideProperty.Builder =
          software.amazon.awscdk.services.evidently.CfnFeature.EntityOverrideProperty.builder()

      /**
       * @param entityId The entity ID to be served the variation specified in `Variation` .
       */
      override fun entityId(entityId: String) {
        cdkBuilder.entityId(entityId)
      }

      /**
       * @param variation The name of the variation to serve to the user session that matches the
       * `EntityId` .
       */
      override fun variation(variation: String) {
        cdkBuilder.variation(variation)
      }

      public fun build():
          software.amazon.awscdk.services.evidently.CfnFeature.EntityOverrideProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.evidently.CfnFeature.EntityOverrideProperty,
    ) : EntityOverrideProperty {
      /**
       * The entity ID to be served the variation specified in `Variation` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-feature-entityoverride.html#cfn-evidently-feature-entityoverride-entityid)
       */
      override fun entityId(): String? = unwrap(this).getEntityId()

      /**
       * The name of the variation to serve to the user session that matches the `EntityId` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-feature-entityoverride.html#cfn-evidently-feature-entityoverride-variation)
       */
      override fun variation(): String? = unwrap(this).getVariation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EntityOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnFeature.EntityOverrideProperty):
          EntityOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EntityOverrideProperty):
          software.amazon.awscdk.services.evidently.CfnFeature.EntityOverrideProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VariationObjectProperty {
    /**
     * The value assigned to this variation, if the variation type is boolean.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-feature-variationobject.html#cfn-evidently-feature-variationobject-booleanvalue)
     */
    public fun booleanValue(): Any? = unwrap(this).getBooleanValue()

    /**
     * The value assigned to this variation, if the variation type is a double.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-feature-variationobject.html#cfn-evidently-feature-variationobject-doublevalue)
     */
    public fun doubleValue(): Number? = unwrap(this).getDoubleValue()

    /**
     * The value assigned to this variation, if the variation type is a long.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-feature-variationobject.html#cfn-evidently-feature-variationobject-longvalue)
     */
    public fun longValue(): Number? = unwrap(this).getLongValue()

    /**
     * The value assigned to this variation, if the variation type is a string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-feature-variationobject.html#cfn-evidently-feature-variationobject-stringvalue)
     */
    public fun stringValue(): String? = unwrap(this).getStringValue()

    /**
     * A name for the variation.
     *
     * It can include up to 127 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-feature-variationobject.html#cfn-evidently-feature-variationobject-variationname)
     */
    public fun variationName(): String

    /**
     * A builder for [VariationObjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param booleanValue The value assigned to this variation, if the variation type is boolean.
       */
      public fun booleanValue(booleanValue: Boolean)

      /**
       * @param booleanValue The value assigned to this variation, if the variation type is boolean.
       */
      public fun booleanValue(booleanValue: IResolvable)

      /**
       * @param doubleValue The value assigned to this variation, if the variation type is a double.
       */
      public fun doubleValue(doubleValue: Number)

      /**
       * @param longValue The value assigned to this variation, if the variation type is a long.
       */
      public fun longValue(longValue: Number)

      /**
       * @param stringValue The value assigned to this variation, if the variation type is a string.
       */
      public fun stringValue(stringValue: String)

      /**
       * @param variationName A name for the variation. 
       * It can include up to 127 characters.
       */
      public fun variationName(variationName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnFeature.VariationObjectProperty.Builder =
          software.amazon.awscdk.services.evidently.CfnFeature.VariationObjectProperty.builder()

      /**
       * @param booleanValue The value assigned to this variation, if the variation type is boolean.
       */
      override fun booleanValue(booleanValue: Boolean) {
        cdkBuilder.booleanValue(booleanValue)
      }

      /**
       * @param booleanValue The value assigned to this variation, if the variation type is boolean.
       */
      override fun booleanValue(booleanValue: IResolvable) {
        cdkBuilder.booleanValue(booleanValue.let(IResolvable::unwrap))
      }

      /**
       * @param doubleValue The value assigned to this variation, if the variation type is a double.
       */
      override fun doubleValue(doubleValue: Number) {
        cdkBuilder.doubleValue(doubleValue)
      }

      /**
       * @param longValue The value assigned to this variation, if the variation type is a long.
       */
      override fun longValue(longValue: Number) {
        cdkBuilder.longValue(longValue)
      }

      /**
       * @param stringValue The value assigned to this variation, if the variation type is a string.
       */
      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      /**
       * @param variationName A name for the variation. 
       * It can include up to 127 characters.
       */
      override fun variationName(variationName: String) {
        cdkBuilder.variationName(variationName)
      }

      public fun build():
          software.amazon.awscdk.services.evidently.CfnFeature.VariationObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.evidently.CfnFeature.VariationObjectProperty,
    ) : VariationObjectProperty {
      /**
       * The value assigned to this variation, if the variation type is boolean.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-feature-variationobject.html#cfn-evidently-feature-variationobject-booleanvalue)
       */
      override fun booleanValue(): Any? = unwrap(this).getBooleanValue()

      /**
       * The value assigned to this variation, if the variation type is a double.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-feature-variationobject.html#cfn-evidently-feature-variationobject-doublevalue)
       */
      override fun doubleValue(): Number? = unwrap(this).getDoubleValue()

      /**
       * The value assigned to this variation, if the variation type is a long.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-feature-variationobject.html#cfn-evidently-feature-variationobject-longvalue)
       */
      override fun longValue(): Number? = unwrap(this).getLongValue()

      /**
       * The value assigned to this variation, if the variation type is a string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-feature-variationobject.html#cfn-evidently-feature-variationobject-stringvalue)
       */
      override fun stringValue(): String? = unwrap(this).getStringValue()

      /**
       * A name for the variation.
       *
       * It can include up to 127 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-feature-variationobject.html#cfn-evidently-feature-variationobject-variationname)
       */
      override fun variationName(): String = unwrap(this).getVariationName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VariationObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnFeature.VariationObjectProperty):
          VariationObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VariationObjectProperty):
          software.amazon.awscdk.services.evidently.CfnFeature.VariationObjectProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
