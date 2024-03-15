@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.frauddetector

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Manages an event type.
 *
 * An event is a business activity that is evaluated for fraud risk. With Amazon Fraud Detector, you
 * generate fraud predictions for events. An event type defines the structure for an event sent to
 * Amazon Fraud Detector. This includes the variables sent as part of the event, the entity performing
 * the event (such as a customer), and the labels that classify the event. Example event types include
 * online payment transactions, account registrations, and authentications.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.frauddetector.*;
 * CfnEventType cfnEventType = CfnEventType.Builder.create(this, "MyCfnEventType")
 * .entityTypes(List.of(EntityTypeProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .description("description")
 * .inline(false)
 * .lastUpdatedTime("lastUpdatedTime")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .eventVariables(List.of(EventVariableProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .dataSource("dataSource")
 * .dataType("dataType")
 * .defaultValue("defaultValue")
 * .description("description")
 * .inline(false)
 * .lastUpdatedTime("lastUpdatedTime")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .variableType("variableType")
 * .build()))
 * .labels(List.of(LabelProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .description("description")
 * .inline(false)
 * .lastUpdatedTime("lastUpdatedTime")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html)
 */
public open class CfnEventType internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.frauddetector.CfnEventType,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The event type ARN.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Timestamp of when event type was created.
   */
  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  /**
   * Timestamp of when event type was last updated.
   */
  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  /**
   * The event type description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The event type description.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The event type entity types.
   */
  public open fun entityTypes(): Any = unwrap(this).getEntityTypes()

  /**
   * The event type entity types.
   */
  public open fun entityTypes(`value`: IResolvable) {
    unwrap(this).setEntityTypes(`value`.let(IResolvable::unwrap))
  }

  /**
   * The event type entity types.
   */
  public open fun entityTypes(_idx_ac66f0: List<Any>) {
    unwrap(this).setEntityTypes(_idx_ac66f0)
  }

  /**
   * The event type entity types.
   */
  public open fun entityTypes(vararg _idx_ac66f0: Any): Unit = entityTypes(_idx_ac66f0.toList())

  /**
   * The event type event variables.
   */
  public open fun eventVariables(): Any = unwrap(this).getEventVariables()

  /**
   * The event type event variables.
   */
  public open fun eventVariables(`value`: IResolvable) {
    unwrap(this).setEventVariables(`value`.let(IResolvable::unwrap))
  }

  /**
   * The event type event variables.
   */
  public open fun eventVariables(_idx_ac66f0: List<Any>) {
    unwrap(this).setEventVariables(_idx_ac66f0)
  }

  /**
   * The event type event variables.
   */
  public open fun eventVariables(vararg _idx_ac66f0: Any): Unit =
      eventVariables(_idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The event type labels.
   */
  public open fun labels(): Any = unwrap(this).getLabels()

  /**
   * The event type labels.
   */
  public open fun labels(`value`: IResolvable) {
    unwrap(this).setLabels(`value`.let(IResolvable::unwrap))
  }

  /**
   * The event type labels.
   */
  public open fun labels(_idx_ac66f0: List<Any>) {
    unwrap(this).setLabels(_idx_ac66f0)
  }

  /**
   * The event type labels.
   */
  public open fun labels(vararg _idx_ac66f0: Any): Unit = labels(_idx_ac66f0.toList())

  /**
   * The event type name.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The event type name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.frauddetector.CfnEventType].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The event type description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-description)
     * @param description The event type description. 
     */
    public fun description(description: String)

    /**
     * The event type entity types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-entitytypes)
     * @param entityTypes The event type entity types. 
     */
    public fun entityTypes(entityTypes: IResolvable)

    /**
     * The event type entity types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-entitytypes)
     * @param entityTypes The event type entity types. 
     */
    public fun entityTypes(entityTypes: List<Any>)

    /**
     * The event type entity types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-entitytypes)
     * @param entityTypes The event type entity types. 
     */
    public fun entityTypes(vararg entityTypes: Any)

    /**
     * The event type event variables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-eventvariables)
     * @param eventVariables The event type event variables. 
     */
    public fun eventVariables(eventVariables: IResolvable)

    /**
     * The event type event variables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-eventvariables)
     * @param eventVariables The event type event variables. 
     */
    public fun eventVariables(eventVariables: List<Any>)

    /**
     * The event type event variables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-eventvariables)
     * @param eventVariables The event type event variables. 
     */
    public fun eventVariables(vararg eventVariables: Any)

    /**
     * The event type labels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-labels)
     * @param labels The event type labels. 
     */
    public fun labels(labels: IResolvable)

    /**
     * The event type labels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-labels)
     * @param labels The event type labels. 
     */
    public fun labels(labels: List<Any>)

    /**
     * The event type labels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-labels)
     * @param labels The event type labels. 
     */
    public fun labels(vararg labels: Any)

    /**
     * The event type name.
     *
     * Pattern : `^[0-9a-z_-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-name)
     * @param name The event type name. 
     */
    public fun name(name: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.frauddetector.CfnEventType.Builder =
        software.amazon.awscdk.services.frauddetector.CfnEventType.Builder.create(scope, id)

    /**
     * The event type description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-description)
     * @param description The event type description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The event type entity types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-entitytypes)
     * @param entityTypes The event type entity types. 
     */
    override fun entityTypes(entityTypes: IResolvable) {
      cdkBuilder.entityTypes(entityTypes.let(IResolvable::unwrap))
    }

    /**
     * The event type entity types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-entitytypes)
     * @param entityTypes The event type entity types. 
     */
    override fun entityTypes(entityTypes: List<Any>) {
      cdkBuilder.entityTypes(entityTypes)
    }

    /**
     * The event type entity types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-entitytypes)
     * @param entityTypes The event type entity types. 
     */
    override fun entityTypes(vararg entityTypes: Any): Unit = entityTypes(entityTypes.toList())

    /**
     * The event type event variables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-eventvariables)
     * @param eventVariables The event type event variables. 
     */
    override fun eventVariables(eventVariables: IResolvable) {
      cdkBuilder.eventVariables(eventVariables.let(IResolvable::unwrap))
    }

    /**
     * The event type event variables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-eventvariables)
     * @param eventVariables The event type event variables. 
     */
    override fun eventVariables(eventVariables: List<Any>) {
      cdkBuilder.eventVariables(eventVariables)
    }

    /**
     * The event type event variables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-eventvariables)
     * @param eventVariables The event type event variables. 
     */
    override fun eventVariables(vararg eventVariables: Any): Unit =
        eventVariables(eventVariables.toList())

    /**
     * The event type labels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-labels)
     * @param labels The event type labels. 
     */
    override fun labels(labels: IResolvable) {
      cdkBuilder.labels(labels.let(IResolvable::unwrap))
    }

    /**
     * The event type labels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-labels)
     * @param labels The event type labels. 
     */
    override fun labels(labels: List<Any>) {
      cdkBuilder.labels(labels)
    }

    /**
     * The event type labels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-labels)
     * @param labels The event type labels. 
     */
    override fun labels(vararg labels: Any): Unit = labels(labels.toList())

    /**
     * The event type name.
     *
     * Pattern : `^[0-9a-z_-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-name)
     * @param name The event type name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.frauddetector.CfnEventType =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.frauddetector.CfnEventType.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventType {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventType(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnEventType):
        CfnEventType = CfnEventType(cdkObject)

    internal fun unwrap(wrapped: CfnEventType):
        software.amazon.awscdk.services.frauddetector.CfnEventType = wrapped.cdkObject
  }

  /**
   * The label associated with the event type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.frauddetector.*;
   * LabelProperty labelProperty = LabelProperty.builder()
   * .arn("arn")
   * .createdTime("createdTime")
   * .description("description")
   * .inline(false)
   * .lastUpdatedTime("lastUpdatedTime")
   * .name("name")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-label.html)
   */
  public interface LabelProperty {
    /**
     * The label ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-label.html#cfn-frauddetector-eventtype-label-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * Timestamp of when the event type was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-label.html#cfn-frauddetector-eventtype-label-createdtime)
     */
    public fun createdTime(): String? = unwrap(this).getCreatedTime()

    /**
     * The label description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-label.html#cfn-frauddetector-eventtype-label-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Indicates whether the resource is defined within this CloudFormation template and impacts the
     * create, update, and delete behavior of the stack.
     *
     * If the value is `true` , CloudFormation will create/update/delete the resource when
     * creating/updating/deleting the stack. If the value is `false` , CloudFormation will validate
     * that the object exists and then use it within the resource without making changes to the object.
     *
     * For example, when creating `AWS::FraudDetector::EventType` you must define at least two
     * variables. You can set `Inline=true` for these variables and CloudFormation will
     * create/update/delete the variables as part of stack operations. However, if you set
     * `Inline=false` , CloudFormation will associate the variables to your EventType but not execute
     * any changes to the variables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-label.html#cfn-frauddetector-eventtype-label-inline)
     */
    public fun `inline`(): Any? = unwrap(this).getInline()

    /**
     * Timestamp of when the label was last updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-label.html#cfn-frauddetector-eventtype-label-lastupdatedtime)
     */
    public fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

    /**
     * The label name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-label.html#cfn-frauddetector-eventtype-label-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-label.html#cfn-frauddetector-eventtype-label-tags)
     */
    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A builder for [LabelProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The label ARN.
       */
      public fun arn(arn: String)

      /**
       * @param createdTime Timestamp of when the event type was created.
       */
      public fun createdTime(createdTime: String)

      /**
       * @param description The label description.
       */
      public fun description(description: String)

      /**
       * @param inline Indicates whether the resource is defined within this CloudFormation template
       * and impacts the create, update, and delete behavior of the stack.
       * If the value is `true` , CloudFormation will create/update/delete the resource when
       * creating/updating/deleting the stack. If the value is `false` , CloudFormation will validate
       * that the object exists and then use it within the resource without making changes to the
       * object.
       *
       * For example, when creating `AWS::FraudDetector::EventType` you must define at least two
       * variables. You can set `Inline=true` for these variables and CloudFormation will
       * create/update/delete the variables as part of stack operations. However, if you set
       * `Inline=false` , CloudFormation will associate the variables to your EventType but not execute
       * any changes to the variables.
       */
      public fun `inline`(`inline`: Boolean)

      /**
       * @param inline Indicates whether the resource is defined within this CloudFormation template
       * and impacts the create, update, and delete behavior of the stack.
       * If the value is `true` , CloudFormation will create/update/delete the resource when
       * creating/updating/deleting the stack. If the value is `false` , CloudFormation will validate
       * that the object exists and then use it within the resource without making changes to the
       * object.
       *
       * For example, when creating `AWS::FraudDetector::EventType` you must define at least two
       * variables. You can set `Inline=true` for these variables and CloudFormation will
       * create/update/delete the variables as part of stack operations. However, if you set
       * `Inline=false` , CloudFormation will associate the variables to your EventType but not execute
       * any changes to the variables.
       */
      public fun `inline`(`inline`: IResolvable)

      /**
       * @param lastUpdatedTime Timestamp of when the label was last updated.
       */
      public fun lastUpdatedTime(lastUpdatedTime: String)

      /**
       * @param name The label name.
       */
      public fun name(name: String)

      /**
       * @param tags An array of key-value pairs to apply to this resource.
       * For more information, see
       * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
       * .
       */
      public fun tags(tags: List<CfnTag>)

      /**
       * @param tags An array of key-value pairs to apply to this resource.
       * For more information, see
       * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
       * .
       */
      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.frauddetector.CfnEventType.LabelProperty.Builder =
          software.amazon.awscdk.services.frauddetector.CfnEventType.LabelProperty.builder()

      /**
       * @param arn The label ARN.
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param createdTime Timestamp of when the event type was created.
       */
      override fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
      }

      /**
       * @param description The label description.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param inline Indicates whether the resource is defined within this CloudFormation template
       * and impacts the create, update, and delete behavior of the stack.
       * If the value is `true` , CloudFormation will create/update/delete the resource when
       * creating/updating/deleting the stack. If the value is `false` , CloudFormation will validate
       * that the object exists and then use it within the resource without making changes to the
       * object.
       *
       * For example, when creating `AWS::FraudDetector::EventType` you must define at least two
       * variables. You can set `Inline=true` for these variables and CloudFormation will
       * create/update/delete the variables as part of stack operations. However, if you set
       * `Inline=false` , CloudFormation will associate the variables to your EventType but not execute
       * any changes to the variables.
       */
      override fun `inline`(`inline`: Boolean) {
        cdkBuilder.`inline`(`inline`)
      }

      /**
       * @param inline Indicates whether the resource is defined within this CloudFormation template
       * and impacts the create, update, and delete behavior of the stack.
       * If the value is `true` , CloudFormation will create/update/delete the resource when
       * creating/updating/deleting the stack. If the value is `false` , CloudFormation will validate
       * that the object exists and then use it within the resource without making changes to the
       * object.
       *
       * For example, when creating `AWS::FraudDetector::EventType` you must define at least two
       * variables. You can set `Inline=true` for these variables and CloudFormation will
       * create/update/delete the variables as part of stack operations. However, if you set
       * `Inline=false` , CloudFormation will associate the variables to your EventType but not execute
       * any changes to the variables.
       */
      override fun `inline`(`inline`: IResolvable) {
        cdkBuilder.`inline`(`inline`.let(IResolvable::unwrap))
      }

      /**
       * @param lastUpdatedTime Timestamp of when the label was last updated.
       */
      override fun lastUpdatedTime(lastUpdatedTime: String) {
        cdkBuilder.lastUpdatedTime(lastUpdatedTime)
      }

      /**
       * @param name The label name.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param tags An array of key-value pairs to apply to this resource.
       * For more information, see
       * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
       * .
       */
      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      /**
       * @param tags An array of key-value pairs to apply to this resource.
       * For more information, see
       * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
       * .
       */
      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build(): software.amazon.awscdk.services.frauddetector.CfnEventType.LabelProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.frauddetector.CfnEventType.LabelProperty,
    ) : CdkObject(cdkObject), LabelProperty {
      /**
       * The label ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-label.html#cfn-frauddetector-eventtype-label-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()

      /**
       * Timestamp of when the event type was created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-label.html#cfn-frauddetector-eventtype-label-createdtime)
       */
      override fun createdTime(): String? = unwrap(this).getCreatedTime()

      /**
       * The label description.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-label.html#cfn-frauddetector-eventtype-label-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * Indicates whether the resource is defined within this CloudFormation template and impacts
       * the create, update, and delete behavior of the stack.
       *
       * If the value is `true` , CloudFormation will create/update/delete the resource when
       * creating/updating/deleting the stack. If the value is `false` , CloudFormation will validate
       * that the object exists and then use it within the resource without making changes to the
       * object.
       *
       * For example, when creating `AWS::FraudDetector::EventType` you must define at least two
       * variables. You can set `Inline=true` for these variables and CloudFormation will
       * create/update/delete the variables as part of stack operations. However, if you set
       * `Inline=false` , CloudFormation will associate the variables to your EventType but not execute
       * any changes to the variables.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-label.html#cfn-frauddetector-eventtype-label-inline)
       */
      override fun `inline`(): Any? = unwrap(this).getInline()

      /**
       * Timestamp of when the label was last updated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-label.html#cfn-frauddetector-eventtype-label-lastupdatedtime)
       */
      override fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

      /**
       * The label name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-label.html#cfn-frauddetector-eventtype-label-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * An array of key-value pairs to apply to this resource.
       *
       * For more information, see
       * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-label.html#cfn-frauddetector-eventtype-label-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LabelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnEventType.LabelProperty):
          LabelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LabelProperty):
          software.amazon.awscdk.services.frauddetector.CfnEventType.LabelProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.frauddetector.CfnEventType.LabelProperty
    }
  }

  /**
   * The entity type details.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.frauddetector.*;
   * EntityTypeProperty entityTypeProperty = EntityTypeProperty.builder()
   * .arn("arn")
   * .createdTime("createdTime")
   * .description("description")
   * .inline(false)
   * .lastUpdatedTime("lastUpdatedTime")
   * .name("name")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-entitytype.html)
   */
  public interface EntityTypeProperty {
    /**
     * The entity type ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-entitytype.html#cfn-frauddetector-eventtype-entitytype-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * Timestamp of when the entity type was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-entitytype.html#cfn-frauddetector-eventtype-entitytype-createdtime)
     */
    public fun createdTime(): String? = unwrap(this).getCreatedTime()

    /**
     * The entity type description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-entitytype.html#cfn-frauddetector-eventtype-entitytype-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Indicates whether the resource is defined within this CloudFormation template and impacts the
     * create, update, and delete behavior of the stack.
     *
     * If the value is `true` , CloudFormation will create/update/delete the resource when
     * creating/updating/deleting the stack. If the value is `false` , CloudFormation will validate
     * that the object exists and then use it within the resource without making changes to the object.
     *
     * For example, when creating `AWS::FraudDetector::EventType` you must define at least two
     * variables. You can set `Inline=true` for these variables and CloudFormation will
     * create/update/delete the variables as part of stack operations. However, if you set
     * `Inline=false` , CloudFormation will associate the variables to your event type but not execute
     * any changes to the variables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-entitytype.html#cfn-frauddetector-eventtype-entitytype-inline)
     */
    public fun `inline`(): Any? = unwrap(this).getInline()

    /**
     * Timestamp of when the entity type was last updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-entitytype.html#cfn-frauddetector-eventtype-entitytype-lastupdatedtime)
     */
    public fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

    /**
     * The entity type name.
     *
     * `^[0-9a-z_-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-entitytype.html#cfn-frauddetector-eventtype-entitytype-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-entitytype.html#cfn-frauddetector-eventtype-entitytype-tags)
     */
    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A builder for [EntityTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The entity type ARN.
       */
      public fun arn(arn: String)

      /**
       * @param createdTime Timestamp of when the entity type was created.
       */
      public fun createdTime(createdTime: String)

      /**
       * @param description The entity type description.
       */
      public fun description(description: String)

      /**
       * @param inline Indicates whether the resource is defined within this CloudFormation template
       * and impacts the create, update, and delete behavior of the stack.
       * If the value is `true` , CloudFormation will create/update/delete the resource when
       * creating/updating/deleting the stack. If the value is `false` , CloudFormation will validate
       * that the object exists and then use it within the resource without making changes to the
       * object.
       *
       * For example, when creating `AWS::FraudDetector::EventType` you must define at least two
       * variables. You can set `Inline=true` for these variables and CloudFormation will
       * create/update/delete the variables as part of stack operations. However, if you set
       * `Inline=false` , CloudFormation will associate the variables to your event type but not
       * execute any changes to the variables.
       */
      public fun `inline`(`inline`: Boolean)

      /**
       * @param inline Indicates whether the resource is defined within this CloudFormation template
       * and impacts the create, update, and delete behavior of the stack.
       * If the value is `true` , CloudFormation will create/update/delete the resource when
       * creating/updating/deleting the stack. If the value is `false` , CloudFormation will validate
       * that the object exists and then use it within the resource without making changes to the
       * object.
       *
       * For example, when creating `AWS::FraudDetector::EventType` you must define at least two
       * variables. You can set `Inline=true` for these variables and CloudFormation will
       * create/update/delete the variables as part of stack operations. However, if you set
       * `Inline=false` , CloudFormation will associate the variables to your event type but not
       * execute any changes to the variables.
       */
      public fun `inline`(`inline`: IResolvable)

      /**
       * @param lastUpdatedTime Timestamp of when the entity type was last updated.
       */
      public fun lastUpdatedTime(lastUpdatedTime: String)

      /**
       * @param name The entity type name.
       * `^[0-9a-z_-]+$`
       */
      public fun name(name: String)

      /**
       * @param tags An array of key-value pairs to apply to this resource.
       * For more information, see
       * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
       * .
       */
      public fun tags(tags: List<CfnTag>)

      /**
       * @param tags An array of key-value pairs to apply to this resource.
       * For more information, see
       * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
       * .
       */
      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.frauddetector.CfnEventType.EntityTypeProperty.Builder =
          software.amazon.awscdk.services.frauddetector.CfnEventType.EntityTypeProperty.builder()

      /**
       * @param arn The entity type ARN.
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param createdTime Timestamp of when the entity type was created.
       */
      override fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
      }

      /**
       * @param description The entity type description.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param inline Indicates whether the resource is defined within this CloudFormation template
       * and impacts the create, update, and delete behavior of the stack.
       * If the value is `true` , CloudFormation will create/update/delete the resource when
       * creating/updating/deleting the stack. If the value is `false` , CloudFormation will validate
       * that the object exists and then use it within the resource without making changes to the
       * object.
       *
       * For example, when creating `AWS::FraudDetector::EventType` you must define at least two
       * variables. You can set `Inline=true` for these variables and CloudFormation will
       * create/update/delete the variables as part of stack operations. However, if you set
       * `Inline=false` , CloudFormation will associate the variables to your event type but not
       * execute any changes to the variables.
       */
      override fun `inline`(`inline`: Boolean) {
        cdkBuilder.`inline`(`inline`)
      }

      /**
       * @param inline Indicates whether the resource is defined within this CloudFormation template
       * and impacts the create, update, and delete behavior of the stack.
       * If the value is `true` , CloudFormation will create/update/delete the resource when
       * creating/updating/deleting the stack. If the value is `false` , CloudFormation will validate
       * that the object exists and then use it within the resource without making changes to the
       * object.
       *
       * For example, when creating `AWS::FraudDetector::EventType` you must define at least two
       * variables. You can set `Inline=true` for these variables and CloudFormation will
       * create/update/delete the variables as part of stack operations. However, if you set
       * `Inline=false` , CloudFormation will associate the variables to your event type but not
       * execute any changes to the variables.
       */
      override fun `inline`(`inline`: IResolvable) {
        cdkBuilder.`inline`(`inline`.let(IResolvable::unwrap))
      }

      /**
       * @param lastUpdatedTime Timestamp of when the entity type was last updated.
       */
      override fun lastUpdatedTime(lastUpdatedTime: String) {
        cdkBuilder.lastUpdatedTime(lastUpdatedTime)
      }

      /**
       * @param name The entity type name.
       * `^[0-9a-z_-]+$`
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param tags An array of key-value pairs to apply to this resource.
       * For more information, see
       * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
       * .
       */
      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      /**
       * @param tags An array of key-value pairs to apply to this resource.
       * For more information, see
       * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
       * .
       */
      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build():
          software.amazon.awscdk.services.frauddetector.CfnEventType.EntityTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.frauddetector.CfnEventType.EntityTypeProperty,
    ) : CdkObject(cdkObject), EntityTypeProperty {
      /**
       * The entity type ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-entitytype.html#cfn-frauddetector-eventtype-entitytype-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()

      /**
       * Timestamp of when the entity type was created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-entitytype.html#cfn-frauddetector-eventtype-entitytype-createdtime)
       */
      override fun createdTime(): String? = unwrap(this).getCreatedTime()

      /**
       * The entity type description.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-entitytype.html#cfn-frauddetector-eventtype-entitytype-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * Indicates whether the resource is defined within this CloudFormation template and impacts
       * the create, update, and delete behavior of the stack.
       *
       * If the value is `true` , CloudFormation will create/update/delete the resource when
       * creating/updating/deleting the stack. If the value is `false` , CloudFormation will validate
       * that the object exists and then use it within the resource without making changes to the
       * object.
       *
       * For example, when creating `AWS::FraudDetector::EventType` you must define at least two
       * variables. You can set `Inline=true` for these variables and CloudFormation will
       * create/update/delete the variables as part of stack operations. However, if you set
       * `Inline=false` , CloudFormation will associate the variables to your event type but not
       * execute any changes to the variables.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-entitytype.html#cfn-frauddetector-eventtype-entitytype-inline)
       */
      override fun `inline`(): Any? = unwrap(this).getInline()

      /**
       * Timestamp of when the entity type was last updated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-entitytype.html#cfn-frauddetector-eventtype-entitytype-lastupdatedtime)
       */
      override fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

      /**
       * The entity type name.
       *
       * `^[0-9a-z_-]+$`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-entitytype.html#cfn-frauddetector-eventtype-entitytype-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * An array of key-value pairs to apply to this resource.
       *
       * For more information, see
       * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-entitytype.html#cfn-frauddetector-eventtype-entitytype-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EntityTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnEventType.EntityTypeProperty):
          EntityTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EntityTypeProperty):
          software.amazon.awscdk.services.frauddetector.CfnEventType.EntityTypeProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.frauddetector.CfnEventType.EntityTypeProperty
    }
  }

  /**
   * The variables associated with this event type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.frauddetector.*;
   * EventVariableProperty eventVariableProperty = EventVariableProperty.builder()
   * .arn("arn")
   * .createdTime("createdTime")
   * .dataSource("dataSource")
   * .dataType("dataType")
   * .defaultValue("defaultValue")
   * .description("description")
   * .inline(false)
   * .lastUpdatedTime("lastUpdatedTime")
   * .name("name")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .variableType("variableType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html)
   */
  public interface EventVariableProperty {
    /**
     * The event variable ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * Timestamp for when event variable was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-createdtime)
     */
    public fun createdTime(): String? = unwrap(this).getCreatedTime()

    /**
     * The source of the event variable.
     *
     * Valid values: `EVENT | EXTERNAL_MODEL_SCORE`
     *
     * When defining a variable within a event type, you can only use the `EVENT` value for
     * DataSource when the *Inline* property is set to true. If the *Inline* property is set false, you
     * can use either `EVENT` or `MODEL_SCORE` for DataSource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-datasource)
     */
    public fun dataSource(): String? = unwrap(this).getDataSource()

    /**
     * The data type of the event variable.
     *
     * For more information, see [Data
     * types](https://docs.aws.amazon.com/frauddetector/latest/ug/variables.html#data-types) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-datatype)
     */
    public fun dataType(): String? = unwrap(this).getDataType()

    /**
     * The default value of the event variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-defaultvalue)
     */
    public fun defaultValue(): String? = unwrap(this).getDefaultValue()

    /**
     * The event variable description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Indicates whether the resource is defined within this CloudFormation template and impacts the
     * create, update, and delete behavior of the stack.
     *
     * If the value is `true` , CloudFormation will create/update/delete the resource when
     * creating/updating/deleting the stack. If the value is `false` , CloudFormation will validate
     * that the object exists and then use it within the resource without making changes to the object.
     *
     * For example, when creating `AWS::FraudDetector::EventType` you must define at least two
     * variables. You can set `Inline=true` for these variables and CloudFormation will
     * create/update/delete the Variables as part of stack operations. However, if you set
     * `Inline=false` , CloudFormation will associate the variables to your event type but not execute
     * any changes to the variables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-inline)
     */
    public fun `inline`(): Any? = unwrap(this).getInline()

    /**
     * Timestamp for when the event variable was last updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-lastupdatedtime)
     */
    public fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

    /**
     * The name of the event variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-tags)
     */
    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of event variable.
     *
     * For more information, see [Variable
     * types](https://docs.aws.amazon.com/frauddetector/latest/ug/variables.html#variable-types) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-variabletype)
     */
    public fun variableType(): String? = unwrap(this).getVariableType()

    /**
     * A builder for [EventVariableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The event variable ARN.
       */
      public fun arn(arn: String)

      /**
       * @param createdTime Timestamp for when event variable was created.
       */
      public fun createdTime(createdTime: String)

      /**
       * @param dataSource The source of the event variable.
       * Valid values: `EVENT | EXTERNAL_MODEL_SCORE`
       *
       * When defining a variable within a event type, you can only use the `EVENT` value for
       * DataSource when the *Inline* property is set to true. If the *Inline* property is set false,
       * you can use either `EVENT` or `MODEL_SCORE` for DataSource.
       */
      public fun dataSource(dataSource: String)

      /**
       * @param dataType The data type of the event variable.
       * For more information, see [Data
       * types](https://docs.aws.amazon.com/frauddetector/latest/ug/variables.html#data-types) .
       */
      public fun dataType(dataType: String)

      /**
       * @param defaultValue The default value of the event variable.
       */
      public fun defaultValue(defaultValue: String)

      /**
       * @param description The event variable description.
       */
      public fun description(description: String)

      /**
       * @param inline Indicates whether the resource is defined within this CloudFormation template
       * and impacts the create, update, and delete behavior of the stack.
       * If the value is `true` , CloudFormation will create/update/delete the resource when
       * creating/updating/deleting the stack. If the value is `false` , CloudFormation will validate
       * that the object exists and then use it within the resource without making changes to the
       * object.
       *
       * For example, when creating `AWS::FraudDetector::EventType` you must define at least two
       * variables. You can set `Inline=true` for these variables and CloudFormation will
       * create/update/delete the Variables as part of stack operations. However, if you set
       * `Inline=false` , CloudFormation will associate the variables to your event type but not
       * execute any changes to the variables.
       */
      public fun `inline`(`inline`: Boolean)

      /**
       * @param inline Indicates whether the resource is defined within this CloudFormation template
       * and impacts the create, update, and delete behavior of the stack.
       * If the value is `true` , CloudFormation will create/update/delete the resource when
       * creating/updating/deleting the stack. If the value is `false` , CloudFormation will validate
       * that the object exists and then use it within the resource without making changes to the
       * object.
       *
       * For example, when creating `AWS::FraudDetector::EventType` you must define at least two
       * variables. You can set `Inline=true` for these variables and CloudFormation will
       * create/update/delete the Variables as part of stack operations. However, if you set
       * `Inline=false` , CloudFormation will associate the variables to your event type but not
       * execute any changes to the variables.
       */
      public fun `inline`(`inline`: IResolvable)

      /**
       * @param lastUpdatedTime Timestamp for when the event variable was last updated.
       */
      public fun lastUpdatedTime(lastUpdatedTime: String)

      /**
       * @param name The name of the event variable.
       */
      public fun name(name: String)

      /**
       * @param tags An array of key-value pairs to apply to this resource.
       * For more information, see
       * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
       * .
       */
      public fun tags(tags: List<CfnTag>)

      /**
       * @param tags An array of key-value pairs to apply to this resource.
       * For more information, see
       * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
       * .
       */
      public fun tags(vararg tags: CfnTag)

      /**
       * @param variableType The type of event variable.
       * For more information, see [Variable
       * types](https://docs.aws.amazon.com/frauddetector/latest/ug/variables.html#variable-types) .
       */
      public fun variableType(variableType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.frauddetector.CfnEventType.EventVariableProperty.Builder =
          software.amazon.awscdk.services.frauddetector.CfnEventType.EventVariableProperty.builder()

      /**
       * @param arn The event variable ARN.
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param createdTime Timestamp for when event variable was created.
       */
      override fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
      }

      /**
       * @param dataSource The source of the event variable.
       * Valid values: `EVENT | EXTERNAL_MODEL_SCORE`
       *
       * When defining a variable within a event type, you can only use the `EVENT` value for
       * DataSource when the *Inline* property is set to true. If the *Inline* property is set false,
       * you can use either `EVENT` or `MODEL_SCORE` for DataSource.
       */
      override fun dataSource(dataSource: String) {
        cdkBuilder.dataSource(dataSource)
      }

      /**
       * @param dataType The data type of the event variable.
       * For more information, see [Data
       * types](https://docs.aws.amazon.com/frauddetector/latest/ug/variables.html#data-types) .
       */
      override fun dataType(dataType: String) {
        cdkBuilder.dataType(dataType)
      }

      /**
       * @param defaultValue The default value of the event variable.
       */
      override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      /**
       * @param description The event variable description.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param inline Indicates whether the resource is defined within this CloudFormation template
       * and impacts the create, update, and delete behavior of the stack.
       * If the value is `true` , CloudFormation will create/update/delete the resource when
       * creating/updating/deleting the stack. If the value is `false` , CloudFormation will validate
       * that the object exists and then use it within the resource without making changes to the
       * object.
       *
       * For example, when creating `AWS::FraudDetector::EventType` you must define at least two
       * variables. You can set `Inline=true` for these variables and CloudFormation will
       * create/update/delete the Variables as part of stack operations. However, if you set
       * `Inline=false` , CloudFormation will associate the variables to your event type but not
       * execute any changes to the variables.
       */
      override fun `inline`(`inline`: Boolean) {
        cdkBuilder.`inline`(`inline`)
      }

      /**
       * @param inline Indicates whether the resource is defined within this CloudFormation template
       * and impacts the create, update, and delete behavior of the stack.
       * If the value is `true` , CloudFormation will create/update/delete the resource when
       * creating/updating/deleting the stack. If the value is `false` , CloudFormation will validate
       * that the object exists and then use it within the resource without making changes to the
       * object.
       *
       * For example, when creating `AWS::FraudDetector::EventType` you must define at least two
       * variables. You can set `Inline=true` for these variables and CloudFormation will
       * create/update/delete the Variables as part of stack operations. However, if you set
       * `Inline=false` , CloudFormation will associate the variables to your event type but not
       * execute any changes to the variables.
       */
      override fun `inline`(`inline`: IResolvable) {
        cdkBuilder.`inline`(`inline`.let(IResolvable::unwrap))
      }

      /**
       * @param lastUpdatedTime Timestamp for when the event variable was last updated.
       */
      override fun lastUpdatedTime(lastUpdatedTime: String) {
        cdkBuilder.lastUpdatedTime(lastUpdatedTime)
      }

      /**
       * @param name The name of the event variable.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param tags An array of key-value pairs to apply to this resource.
       * For more information, see
       * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
       * .
       */
      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      /**
       * @param tags An array of key-value pairs to apply to this resource.
       * For more information, see
       * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
       * .
       */
      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      /**
       * @param variableType The type of event variable.
       * For more information, see [Variable
       * types](https://docs.aws.amazon.com/frauddetector/latest/ug/variables.html#variable-types) .
       */
      override fun variableType(variableType: String) {
        cdkBuilder.variableType(variableType)
      }

      public fun build():
          software.amazon.awscdk.services.frauddetector.CfnEventType.EventVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.frauddetector.CfnEventType.EventVariableProperty,
    ) : CdkObject(cdkObject), EventVariableProperty {
      /**
       * The event variable ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()

      /**
       * Timestamp for when event variable was created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-createdtime)
       */
      override fun createdTime(): String? = unwrap(this).getCreatedTime()

      /**
       * The source of the event variable.
       *
       * Valid values: `EVENT | EXTERNAL_MODEL_SCORE`
       *
       * When defining a variable within a event type, you can only use the `EVENT` value for
       * DataSource when the *Inline* property is set to true. If the *Inline* property is set false,
       * you can use either `EVENT` or `MODEL_SCORE` for DataSource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-datasource)
       */
      override fun dataSource(): String? = unwrap(this).getDataSource()

      /**
       * The data type of the event variable.
       *
       * For more information, see [Data
       * types](https://docs.aws.amazon.com/frauddetector/latest/ug/variables.html#data-types) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-datatype)
       */
      override fun dataType(): String? = unwrap(this).getDataType()

      /**
       * The default value of the event variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-defaultvalue)
       */
      override fun defaultValue(): String? = unwrap(this).getDefaultValue()

      /**
       * The event variable description.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * Indicates whether the resource is defined within this CloudFormation template and impacts
       * the create, update, and delete behavior of the stack.
       *
       * If the value is `true` , CloudFormation will create/update/delete the resource when
       * creating/updating/deleting the stack. If the value is `false` , CloudFormation will validate
       * that the object exists and then use it within the resource without making changes to the
       * object.
       *
       * For example, when creating `AWS::FraudDetector::EventType` you must define at least two
       * variables. You can set `Inline=true` for these variables and CloudFormation will
       * create/update/delete the Variables as part of stack operations. However, if you set
       * `Inline=false` , CloudFormation will associate the variables to your event type but not
       * execute any changes to the variables.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-inline)
       */
      override fun `inline`(): Any? = unwrap(this).getInline()

      /**
       * Timestamp for when the event variable was last updated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-lastupdatedtime)
       */
      override fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

      /**
       * The name of the event variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * An array of key-value pairs to apply to this resource.
       *
       * For more information, see
       * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

      /**
       * The type of event variable.
       *
       * For more information, see [Variable
       * types](https://docs.aws.amazon.com/frauddetector/latest/ug/variables.html#variable-types) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html#cfn-frauddetector-eventtype-eventvariable-variabletype)
       */
      override fun variableType(): String? = unwrap(this).getVariableType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnEventType.EventVariableProperty):
          EventVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventVariableProperty):
          software.amazon.awscdk.services.frauddetector.CfnEventType.EventVariableProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.frauddetector.CfnEventType.EventVariableProperty
    }
  }
}
