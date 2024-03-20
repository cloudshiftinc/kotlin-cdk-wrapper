@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.customerprofiles

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A calculated attribute definition for Customer Profiles.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
 * CfnCalculatedAttributeDefinition cfnCalculatedAttributeDefinition =
 * CfnCalculatedAttributeDefinition.Builder.create(this, "MyCfnCalculatedAttributeDefinition")
 * .attributeDetails(AttributeDetailsProperty.builder()
 * .attributes(List.of(AttributeItemProperty.builder()
 * .name("name")
 * .build()))
 * .expression("expression")
 * .build())
 * .calculatedAttributeName("calculatedAttributeName")
 * .domainName("domainName")
 * .statistic("statistic")
 * // the properties below are optional
 * .conditions(ConditionsProperty.builder()
 * .objectCount(123)
 * .range(RangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .threshold(ThresholdProperty.builder()
 * .operator("operator")
 * .value("value")
 * .build())
 * .build())
 * .description("description")
 * .displayName("displayName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html)
 */
public open class CfnCalculatedAttributeDefinition internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCalculatedAttributeDefinitionProps,
  ) :
      this(software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnCalculatedAttributeDefinitionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCalculatedAttributeDefinitionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCalculatedAttributeDefinitionProps(props)
  )

  /**
   * The timestamp of when the calculated attribute definition was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The timestamp of when the calculated attribute definition was most recently edited.
   */
  public open fun attrLastUpdatedAt(): String = unwrap(this).getAttrLastUpdatedAt()

  /**
   * Mathematical expression and a list of attribute items specified in that expression.
   */
  public open fun attributeDetails(): Any = unwrap(this).getAttributeDetails()

  /**
   * Mathematical expression and a list of attribute items specified in that expression.
   */
  public open fun attributeDetails(`value`: IResolvable) {
    unwrap(this).setAttributeDetails(`value`.let(IResolvable::unwrap))
  }

  /**
   * Mathematical expression and a list of attribute items specified in that expression.
   */
  public open fun attributeDetails(`value`: AttributeDetailsProperty) {
    unwrap(this).setAttributeDetails(`value`.let(AttributeDetailsProperty::unwrap))
  }

  /**
   * Mathematical expression and a list of attribute items specified in that expression.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bbeea23a756d12a9e5f4da473d384c1fb47bc48a0c25eeaa5e91ba1470b5fea3")
  public open fun attributeDetails(`value`: AttributeDetailsProperty.Builder.() -> Unit): Unit =
      attributeDetails(AttributeDetailsProperty(`value`))

  /**
   * The name of an attribute defined in a profile object type.
   */
  public open fun calculatedAttributeName(): String = unwrap(this).getCalculatedAttributeName()

  /**
   * The name of an attribute defined in a profile object type.
   */
  public open fun calculatedAttributeName(`value`: String) {
    unwrap(this).setCalculatedAttributeName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The conditions including range, object count, and threshold for the calculated attribute.
   */
  public open fun conditions(): Any? = unwrap(this).getConditions()

  /**
   * The conditions including range, object count, and threshold for the calculated attribute.
   */
  public open fun conditions(`value`: IResolvable) {
    unwrap(this).setConditions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The conditions including range, object count, and threshold for the calculated attribute.
   */
  public open fun conditions(`value`: ConditionsProperty) {
    unwrap(this).setConditions(`value`.let(ConditionsProperty::unwrap))
  }

  /**
   * The conditions including range, object count, and threshold for the calculated attribute.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f171d0da38a61a4d883bc3a88ee1e720c34e50bfa77ced87795b6b13154ee3f3")
  public open fun conditions(`value`: ConditionsProperty.Builder.() -> Unit): Unit =
      conditions(ConditionsProperty(`value`))

  /**
   * The description of the calculated attribute.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the calculated attribute.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The display name of the calculated attribute.
   */
  public open fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The display name of the calculated attribute.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * The unique name of the domain.
   */
  public open fun domainName(): String = unwrap(this).getDomainName()

  /**
   * The unique name of the domain.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
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
   * The aggregation operation to perform for the calculated attribute.
   */
  public open fun statistic(): String = unwrap(this).getStatistic()

  /**
   * The aggregation operation to perform for the calculated attribute.
   */
  public open fun statistic(`value`: String) {
    unwrap(this).setStatistic(`value`)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Mathematical expression and a list of attribute items specified in that expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-attributedetails)
     * @param attributeDetails Mathematical expression and a list of attribute items specified in
     * that expression. 
     */
    public fun attributeDetails(attributeDetails: IResolvable)

    /**
     * Mathematical expression and a list of attribute items specified in that expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-attributedetails)
     * @param attributeDetails Mathematical expression and a list of attribute items specified in
     * that expression. 
     */
    public fun attributeDetails(attributeDetails: AttributeDetailsProperty)

    /**
     * Mathematical expression and a list of attribute items specified in that expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-attributedetails)
     * @param attributeDetails Mathematical expression and a list of attribute items specified in
     * that expression. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3881dc042b395f90daa320a565b09de633274397edc76dc644a9b702387a2365")
    public fun attributeDetails(attributeDetails: AttributeDetailsProperty.Builder.() -> Unit)

    /**
     * The name of an attribute defined in a profile object type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-calculatedattributename)
     * @param calculatedAttributeName The name of an attribute defined in a profile object type. 
     */
    public fun calculatedAttributeName(calculatedAttributeName: String)

    /**
     * The conditions including range, object count, and threshold for the calculated attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-conditions)
     * @param conditions The conditions including range, object count, and threshold for the
     * calculated attribute. 
     */
    public fun conditions(conditions: IResolvable)

    /**
     * The conditions including range, object count, and threshold for the calculated attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-conditions)
     * @param conditions The conditions including range, object count, and threshold for the
     * calculated attribute. 
     */
    public fun conditions(conditions: ConditionsProperty)

    /**
     * The conditions including range, object count, and threshold for the calculated attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-conditions)
     * @param conditions The conditions including range, object count, and threshold for the
     * calculated attribute. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1da2b4b405c95db816b62c6348222ef8731f68daed8a2e7f42b9d0246d9ed16b")
    public fun conditions(conditions: ConditionsProperty.Builder.() -> Unit)

    /**
     * The description of the calculated attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-description)
     * @param description The description of the calculated attribute. 
     */
    public fun description(description: String)

    /**
     * The display name of the calculated attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-displayname)
     * @param displayName The display name of the calculated attribute. 
     */
    public fun displayName(displayName: String)

    /**
     * The unique name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-domainname)
     * @param domainName The unique name of the domain. 
     */
    public fun domainName(domainName: String)

    /**
     * The aggregation operation to perform for the calculated attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-statistic)
     * @param statistic The aggregation operation to perform for the calculated attribute. 
     */
    public fun statistic(statistic: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.Builder =
        software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.Builder.create(scope,
        id)

    /**
     * Mathematical expression and a list of attribute items specified in that expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-attributedetails)
     * @param attributeDetails Mathematical expression and a list of attribute items specified in
     * that expression. 
     */
    override fun attributeDetails(attributeDetails: IResolvable) {
      cdkBuilder.attributeDetails(attributeDetails.let(IResolvable::unwrap))
    }

    /**
     * Mathematical expression and a list of attribute items specified in that expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-attributedetails)
     * @param attributeDetails Mathematical expression and a list of attribute items specified in
     * that expression. 
     */
    override fun attributeDetails(attributeDetails: AttributeDetailsProperty) {
      cdkBuilder.attributeDetails(attributeDetails.let(AttributeDetailsProperty::unwrap))
    }

    /**
     * Mathematical expression and a list of attribute items specified in that expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-attributedetails)
     * @param attributeDetails Mathematical expression and a list of attribute items specified in
     * that expression. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3881dc042b395f90daa320a565b09de633274397edc76dc644a9b702387a2365")
    override fun attributeDetails(attributeDetails: AttributeDetailsProperty.Builder.() -> Unit):
        Unit = attributeDetails(AttributeDetailsProperty(attributeDetails))

    /**
     * The name of an attribute defined in a profile object type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-calculatedattributename)
     * @param calculatedAttributeName The name of an attribute defined in a profile object type. 
     */
    override fun calculatedAttributeName(calculatedAttributeName: String) {
      cdkBuilder.calculatedAttributeName(calculatedAttributeName)
    }

    /**
     * The conditions including range, object count, and threshold for the calculated attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-conditions)
     * @param conditions The conditions including range, object count, and threshold for the
     * calculated attribute. 
     */
    override fun conditions(conditions: IResolvable) {
      cdkBuilder.conditions(conditions.let(IResolvable::unwrap))
    }

    /**
     * The conditions including range, object count, and threshold for the calculated attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-conditions)
     * @param conditions The conditions including range, object count, and threshold for the
     * calculated attribute. 
     */
    override fun conditions(conditions: ConditionsProperty) {
      cdkBuilder.conditions(conditions.let(ConditionsProperty::unwrap))
    }

    /**
     * The conditions including range, object count, and threshold for the calculated attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-conditions)
     * @param conditions The conditions including range, object count, and threshold for the
     * calculated attribute. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1da2b4b405c95db816b62c6348222ef8731f68daed8a2e7f42b9d0246d9ed16b")
    override fun conditions(conditions: ConditionsProperty.Builder.() -> Unit): Unit =
        conditions(ConditionsProperty(conditions))

    /**
     * The description of the calculated attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-description)
     * @param description The description of the calculated attribute. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The display name of the calculated attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-displayname)
     * @param displayName The display name of the calculated attribute. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The unique name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-domainname)
     * @param domainName The unique name of the domain. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The aggregation operation to perform for the calculated attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-statistic)
     * @param statistic The aggregation operation to perform for the calculated attribute. 
     */
    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCalculatedAttributeDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCalculatedAttributeDefinition(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition):
        CfnCalculatedAttributeDefinition = CfnCalculatedAttributeDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnCalculatedAttributeDefinition):
        software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition =
        wrapped.cdkObject
  }

  /**
   * The details of a single attribute item specified in the mathematical expression.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * AttributeItemProperty attributeItemProperty = AttributeItemProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-attributeitem.html)
   */
  public interface AttributeItemProperty {
    /**
     * The unique name of the calculated attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-attributeitem.html#cfn-customerprofiles-calculatedattributedefinition-attributeitem-name)
     */
    public fun name(): String

    /**
     * A builder for [AttributeItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The unique name of the calculated attribute. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeItemProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeItemProperty.builder()

      /**
       * @param name The unique name of the calculated attribute. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeItemProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeItemProperty,
    ) : CdkObject(cdkObject), AttributeItemProperty {
      /**
       * The unique name of the calculated attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-attributeitem.html#cfn-customerprofiles-calculatedattributedefinition-attributeitem-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeItemProperty):
          AttributeItemProperty = CdkObjectWrappers.wrap(cdkObject) as? AttributeItemProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeItemProperty):
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeItemProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeItemProperty
    }
  }

  /**
   * Mathematical expression and a list of attribute items specified in that expression.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * AttributeDetailsProperty attributeDetailsProperty = AttributeDetailsProperty.builder()
   * .attributes(List.of(AttributeItemProperty.builder()
   * .name("name")
   * .build()))
   * .expression("expression")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-attributedetails.html)
   */
  public interface AttributeDetailsProperty {
    /**
     * Mathematical expression and a list of attribute items specified in that expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-attributedetails.html#cfn-customerprofiles-calculatedattributedefinition-attributedetails-attributes)
     */
    public fun attributes(): Any

    /**
     * Mathematical expression that is performed on attribute items provided in the attribute list.
     *
     * Each element in the expression should follow the structure of
     * "{ObjectTypeName.AttributeName}".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-attributedetails.html#cfn-customerprofiles-calculatedattributedefinition-attributedetails-expression)
     */
    public fun expression(): String

    /**
     * A builder for [AttributeDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributes Mathematical expression and a list of attribute items specified in that
       * expression. 
       */
      public fun attributes(attributes: IResolvable)

      /**
       * @param attributes Mathematical expression and a list of attribute items specified in that
       * expression. 
       */
      public fun attributes(attributes: List<Any>)

      /**
       * @param attributes Mathematical expression and a list of attribute items specified in that
       * expression. 
       */
      public fun attributes(vararg attributes: Any)

      /**
       * @param expression Mathematical expression that is performed on attribute items provided in
       * the attribute list. 
       * Each element in the expression should follow the structure of
       * "{ObjectTypeName.AttributeName}".
       */
      public fun expression(expression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeDetailsProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeDetailsProperty.builder()

      /**
       * @param attributes Mathematical expression and a list of attribute items specified in that
       * expression. 
       */
      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
      }

      /**
       * @param attributes Mathematical expression and a list of attribute items specified in that
       * expression. 
       */
      override fun attributes(attributes: List<Any>) {
        cdkBuilder.attributes(attributes)
      }

      /**
       * @param attributes Mathematical expression and a list of attribute items specified in that
       * expression. 
       */
      override fun attributes(vararg attributes: Any): Unit = attributes(attributes.toList())

      /**
       * @param expression Mathematical expression that is performed on attribute items provided in
       * the attribute list. 
       * Each element in the expression should follow the structure of
       * "{ObjectTypeName.AttributeName}".
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeDetailsProperty,
    ) : CdkObject(cdkObject), AttributeDetailsProperty {
      /**
       * Mathematical expression and a list of attribute items specified in that expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-attributedetails.html#cfn-customerprofiles-calculatedattributedefinition-attributedetails-attributes)
       */
      override fun attributes(): Any = unwrap(this).getAttributes()

      /**
       * Mathematical expression that is performed on attribute items provided in the attribute
       * list.
       *
       * Each element in the expression should follow the structure of
       * "{ObjectTypeName.AttributeName}".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-attributedetails.html#cfn-customerprofiles-calculatedattributedefinition-attributedetails-expression)
       */
      override fun expression(): String = unwrap(this).getExpression()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeDetailsProperty):
          AttributeDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as? AttributeDetailsProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeDetailsProperty):
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeDetailsProperty
    }
  }

  /**
   * The threshold for the calculated attribute.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * ThresholdProperty thresholdProperty = ThresholdProperty.builder()
   * .operator("operator")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-threshold.html)
   */
  public interface ThresholdProperty {
    /**
     * The operator of the threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-threshold.html#cfn-customerprofiles-calculatedattributedefinition-threshold-operator)
     */
    public fun `operator`(): String

    /**
     * The value of the threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-threshold.html#cfn-customerprofiles-calculatedattributedefinition-threshold-value)
     */
    public fun `value`(): String

    /**
     * A builder for [ThresholdProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param operator The operator of the threshold. 
       */
      public fun `operator`(`operator`: String)

      /**
       * @param value The value of the threshold. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ThresholdProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ThresholdProperty.builder()

      /**
       * @param operator The operator of the threshold. 
       */
      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      /**
       * @param value The value of the threshold. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ThresholdProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ThresholdProperty,
    ) : CdkObject(cdkObject), ThresholdProperty {
      /**
       * The operator of the threshold.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-threshold.html#cfn-customerprofiles-calculatedattributedefinition-threshold-operator)
       */
      override fun `operator`(): String = unwrap(this).getOperator()

      /**
       * The value of the threshold.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-threshold.html#cfn-customerprofiles-calculatedattributedefinition-threshold-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ThresholdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ThresholdProperty):
          ThresholdProperty = CdkObjectWrappers.wrap(cdkObject) as? ThresholdProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThresholdProperty):
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ThresholdProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ThresholdProperty
    }
  }

  /**
   * The relative time period over which data is included in the aggregation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * RangeProperty rangeProperty = RangeProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-range.html)
   */
  public interface RangeProperty {
    /**
     * The unit of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-range.html#cfn-customerprofiles-calculatedattributedefinition-range-unit)
     */
    public fun unit(): String

    /**
     * The amount of time of the specified unit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-range.html#cfn-customerprofiles-calculatedattributedefinition-range-value)
     */
    public fun `value`(): Number

    /**
     * A builder for [RangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param unit The unit of time. 
       */
      public fun unit(unit: String)

      /**
       * @param value The amount of time of the specified unit. 
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.RangeProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.RangeProperty.builder()

      /**
       * @param unit The unit of time. 
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      /**
       * @param value The amount of time of the specified unit. 
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.RangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.RangeProperty,
    ) : CdkObject(cdkObject), RangeProperty {
      /**
       * The unit of time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-range.html#cfn-customerprofiles-calculatedattributedefinition-range-unit)
       */
      override fun unit(): String = unwrap(this).getUnit()

      /**
       * The amount of time of the specified unit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-range.html#cfn-customerprofiles-calculatedattributedefinition-range-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.RangeProperty):
          RangeProperty = CdkObjectWrappers.wrap(cdkObject) as? RangeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RangeProperty):
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.RangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.RangeProperty
    }
  }

  /**
   * The conditions including range, object count, and threshold for the calculated attribute.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * ConditionsProperty conditionsProperty = ConditionsProperty.builder()
   * .objectCount(123)
   * .range(RangeProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .threshold(ThresholdProperty.builder()
   * .operator("operator")
   * .value("value")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-conditions.html)
   */
  public interface ConditionsProperty {
    /**
     * The number of profile objects used for the calculated attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-conditions.html#cfn-customerprofiles-calculatedattributedefinition-conditions-objectcount)
     */
    public fun objectCount(): Number? = unwrap(this).getObjectCount()

    /**
     * The relative time period over which data is included in the aggregation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-conditions.html#cfn-customerprofiles-calculatedattributedefinition-conditions-range)
     */
    public fun range(): Any? = unwrap(this).getRange()

    /**
     * The threshold for the calculated attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-conditions.html#cfn-customerprofiles-calculatedattributedefinition-conditions-threshold)
     */
    public fun threshold(): Any? = unwrap(this).getThreshold()

    /**
     * A builder for [ConditionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param objectCount The number of profile objects used for the calculated attribute.
       */
      public fun objectCount(objectCount: Number)

      /**
       * @param range The relative time period over which data is included in the aggregation.
       */
      public fun range(range: IResolvable)

      /**
       * @param range The relative time period over which data is included in the aggregation.
       */
      public fun range(range: RangeProperty)

      /**
       * @param range The relative time period over which data is included in the aggregation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55433c8f447ab8b0e9916c26120b3417412b55218e46749e7beedf62954673d1")
      public fun range(range: RangeProperty.Builder.() -> Unit)

      /**
       * @param threshold The threshold for the calculated attribute.
       */
      public fun threshold(threshold: IResolvable)

      /**
       * @param threshold The threshold for the calculated attribute.
       */
      public fun threshold(threshold: ThresholdProperty)

      /**
       * @param threshold The threshold for the calculated attribute.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e1bfbdeaf682a3af64a7f2a45474eb98c3958538da1667abe412e099856ce96")
      public fun threshold(threshold: ThresholdProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ConditionsProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ConditionsProperty.builder()

      /**
       * @param objectCount The number of profile objects used for the calculated attribute.
       */
      override fun objectCount(objectCount: Number) {
        cdkBuilder.objectCount(objectCount)
      }

      /**
       * @param range The relative time period over which data is included in the aggregation.
       */
      override fun range(range: IResolvable) {
        cdkBuilder.range(range.let(IResolvable::unwrap))
      }

      /**
       * @param range The relative time period over which data is included in the aggregation.
       */
      override fun range(range: RangeProperty) {
        cdkBuilder.range(range.let(RangeProperty::unwrap))
      }

      /**
       * @param range The relative time period over which data is included in the aggregation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55433c8f447ab8b0e9916c26120b3417412b55218e46749e7beedf62954673d1")
      override fun range(range: RangeProperty.Builder.() -> Unit): Unit =
          range(RangeProperty(range))

      /**
       * @param threshold The threshold for the calculated attribute.
       */
      override fun threshold(threshold: IResolvable) {
        cdkBuilder.threshold(threshold.let(IResolvable::unwrap))
      }

      /**
       * @param threshold The threshold for the calculated attribute.
       */
      override fun threshold(threshold: ThresholdProperty) {
        cdkBuilder.threshold(threshold.let(ThresholdProperty::unwrap))
      }

      /**
       * @param threshold The threshold for the calculated attribute.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e1bfbdeaf682a3af64a7f2a45474eb98c3958538da1667abe412e099856ce96")
      override fun threshold(threshold: ThresholdProperty.Builder.() -> Unit): Unit =
          threshold(ThresholdProperty(threshold))

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ConditionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ConditionsProperty,
    ) : CdkObject(cdkObject), ConditionsProperty {
      /**
       * The number of profile objects used for the calculated attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-conditions.html#cfn-customerprofiles-calculatedattributedefinition-conditions-objectcount)
       */
      override fun objectCount(): Number? = unwrap(this).getObjectCount()

      /**
       * The relative time period over which data is included in the aggregation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-conditions.html#cfn-customerprofiles-calculatedattributedefinition-conditions-range)
       */
      override fun range(): Any? = unwrap(this).getRange()

      /**
       * The threshold for the calculated attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-conditions.html#cfn-customerprofiles-calculatedattributedefinition-conditions-threshold)
       */
      override fun threshold(): Any? = unwrap(this).getThreshold()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ConditionsProperty):
          ConditionsProperty = CdkObjectWrappers.wrap(cdkObject) as? ConditionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionsProperty):
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ConditionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ConditionsProperty
    }
  }
}
