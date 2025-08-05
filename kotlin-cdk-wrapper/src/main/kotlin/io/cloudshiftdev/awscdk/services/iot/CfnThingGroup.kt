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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new thing group.
 *
 * A dynamic thing group is created if the resource template contains the `QueryString` attribute. A
 * dynamic thing group will not contain the `ParentGroupName` attribute. A static thing group and
 * dynamic thing group can't be converted to each other via the addition or removal of the
 * `QueryString` attribute.
 *
 *
 * This is a control plane operation. See
 * [Authorization](https://docs.aws.amazon.com/iot/latest/developerguide/iot-authorization.html) for
 * information about authorizing control plane actions.
 *
 *
 * Requires permission to access the
 * [CreateThingGroup](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
 * action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnThingGroup cfnThingGroup = CfnThingGroup.Builder.create(this, "MyCfnThingGroup")
 * .parentGroupName("parentGroupName")
 * .queryString("queryString")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .thingGroupName("thingGroupName")
 * .thingGroupProperties(ThingGroupPropertiesProperty.builder()
 * .attributePayload(AttributePayloadProperty.builder()
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .build())
 * .thingGroupDescription("thingGroupDescription")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html)
 */
public open class CfnThingGroup(
  cdkObject: software.amazon.awscdk.services.iot.CfnThingGroup,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.iot.CfnThingGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnThingGroupProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnThingGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnThingGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnThingGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnThingGroupProps(props)
  )

  /**
   * The thing group ARN.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The thing group ID.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The parent thing group name.
   */
  public open fun parentGroupName(): String? = unwrap(this).getParentGroupName()

  /**
   * The parent thing group name.
   */
  public open fun parentGroupName(`value`: String) {
    unwrap(this).setParentGroupName(`value`)
  }

  /**
   * The dynamic thing group search query string.
   */
  public open fun queryString(): String? = unwrap(this).getQueryString()

  /**
   * The dynamic thing group search query string.
   */
  public open fun queryString(`value`: String) {
    unwrap(this).setQueryString(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata which can be used to manage the thing group or dynamic thing group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata which can be used to manage the thing group or dynamic thing group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Metadata which can be used to manage the thing group or dynamic thing group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The thing group name.
   */
  public open fun thingGroupName(): String? = unwrap(this).getThingGroupName()

  /**
   * The thing group name.
   */
  public open fun thingGroupName(`value`: String) {
    unwrap(this).setThingGroupName(`value`)
  }

  /**
   * Thing group properties.
   */
  public open fun thingGroupProperties(): Any? = unwrap(this).getThingGroupProperties()

  /**
   * Thing group properties.
   */
  public open fun thingGroupProperties(`value`: IResolvable) {
    unwrap(this).setThingGroupProperties(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Thing group properties.
   */
  public open fun thingGroupProperties(`value`: ThingGroupPropertiesProperty) {
    unwrap(this).setThingGroupProperties(`value`.let(ThingGroupPropertiesProperty.Companion::unwrap))
  }

  /**
   * Thing group properties.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5e4f87fffceaf563a5bb83877db375d5d8d9a123e6da765c75f850c3974a19dd")
  public open fun thingGroupProperties(`value`: ThingGroupPropertiesProperty.Builder.() -> Unit):
      Unit = thingGroupProperties(ThingGroupPropertiesProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnThingGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The parent thing group name.
     *
     * A Dynamic Thing Group does not have `parentGroupName` defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-parentgroupname)
     * @param parentGroupName The parent thing group name. 
     */
    public fun parentGroupName(parentGroupName: String)

    /**
     * The dynamic thing group search query string.
     *
     * The `queryString` attribute *is* required for `CreateDynamicThingGroup` . The `queryString`
     * attribute *is not* required for `CreateThingGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-querystring)
     * @param queryString The dynamic thing group search query string. 
     */
    public fun queryString(queryString: String)

    /**
     * Metadata which can be used to manage the thing group or dynamic thing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-tags)
     * @param tags Metadata which can be used to manage the thing group or dynamic thing group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata which can be used to manage the thing group or dynamic thing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-tags)
     * @param tags Metadata which can be used to manage the thing group or dynamic thing group. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The thing group name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-thinggroupname)
     * @param thingGroupName The thing group name. 
     */
    public fun thingGroupName(thingGroupName: String)

    /**
     * Thing group properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-thinggroupproperties)
     * @param thingGroupProperties Thing group properties. 
     */
    public fun thingGroupProperties(thingGroupProperties: IResolvable)

    /**
     * Thing group properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-thinggroupproperties)
     * @param thingGroupProperties Thing group properties. 
     */
    public fun thingGroupProperties(thingGroupProperties: ThingGroupPropertiesProperty)

    /**
     * Thing group properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-thinggroupproperties)
     * @param thingGroupProperties Thing group properties. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e32515e9f7939b92fbc09f334077a7c5cb6e042e9bed7abc63b3308772223433")
    public
        fun thingGroupProperties(thingGroupProperties: ThingGroupPropertiesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnThingGroup.Builder =
        software.amazon.awscdk.services.iot.CfnThingGroup.Builder.create(scope, id)

    /**
     * The parent thing group name.
     *
     * A Dynamic Thing Group does not have `parentGroupName` defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-parentgroupname)
     * @param parentGroupName The parent thing group name. 
     */
    override fun parentGroupName(parentGroupName: String) {
      cdkBuilder.parentGroupName(parentGroupName)
    }

    /**
     * The dynamic thing group search query string.
     *
     * The `queryString` attribute *is* required for `CreateDynamicThingGroup` . The `queryString`
     * attribute *is not* required for `CreateThingGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-querystring)
     * @param queryString The dynamic thing group search query string. 
     */
    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    /**
     * Metadata which can be used to manage the thing group or dynamic thing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-tags)
     * @param tags Metadata which can be used to manage the thing group or dynamic thing group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Metadata which can be used to manage the thing group or dynamic thing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-tags)
     * @param tags Metadata which can be used to manage the thing group or dynamic thing group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The thing group name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-thinggroupname)
     * @param thingGroupName The thing group name. 
     */
    override fun thingGroupName(thingGroupName: String) {
      cdkBuilder.thingGroupName(thingGroupName)
    }

    /**
     * Thing group properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-thinggroupproperties)
     * @param thingGroupProperties Thing group properties. 
     */
    override fun thingGroupProperties(thingGroupProperties: IResolvable) {
      cdkBuilder.thingGroupProperties(thingGroupProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * Thing group properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-thinggroupproperties)
     * @param thingGroupProperties Thing group properties. 
     */
    override fun thingGroupProperties(thingGroupProperties: ThingGroupPropertiesProperty) {
      cdkBuilder.thingGroupProperties(thingGroupProperties.let(ThingGroupPropertiesProperty.Companion::unwrap))
    }

    /**
     * Thing group properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-thinggroupproperties)
     * @param thingGroupProperties Thing group properties. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e32515e9f7939b92fbc09f334077a7c5cb6e042e9bed7abc63b3308772223433")
    override
        fun thingGroupProperties(thingGroupProperties: ThingGroupPropertiesProperty.Builder.() -> Unit):
        Unit = thingGroupProperties(ThingGroupPropertiesProperty(thingGroupProperties))

    public fun build(): software.amazon.awscdk.services.iot.CfnThingGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnThingGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnThingGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnThingGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingGroup): CfnThingGroup =
        CfnThingGroup(cdkObject)

    internal fun unwrap(wrapped: CfnThingGroup): software.amazon.awscdk.services.iot.CfnThingGroup =
        wrapped.cdkObject as software.amazon.awscdk.services.iot.CfnThingGroup
  }

  /**
   * The attribute payload.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * AttributePayloadProperty attributePayloadProperty = AttributePayloadProperty.builder()
   * .attributes(Map.of(
   * "attributesKey", "attributes"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thinggroup-attributepayload.html)
   */
  public interface AttributePayloadProperty {
    /**
     * A JSON string containing up to three key-value pair in JSON format. For example:.
     *
     * `{\"attributes\":{\"string1\":\"string2\"}}`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thinggroup-attributepayload.html#cfn-iot-thinggroup-attributepayload-attributes)
     */
    public fun attributes(): Any? = unwrap(this).getAttributes()

    /**
     * A builder for [AttributePayloadProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributes A JSON string containing up to three key-value pair in JSON format. For
       * example:.
       * `{\"attributes\":{\"string1\":\"string2\"}}`
       */
      public fun attributes(attributes: Map<String, String>)

      /**
       * @param attributes A JSON string containing up to three key-value pair in JSON format. For
       * example:.
       * `{\"attributes\":{\"string1\":\"string2\"}}`
       */
      public fun attributes(attributes: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnThingGroup.AttributePayloadProperty.Builder =
          software.amazon.awscdk.services.iot.CfnThingGroup.AttributePayloadProperty.builder()

      /**
       * @param attributes A JSON string containing up to three key-value pair in JSON format. For
       * example:.
       * `{\"attributes\":{\"string1\":\"string2\"}}`
       */
      override fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
      }

      /**
       * @param attributes A JSON string containing up to three key-value pair in JSON format. For
       * example:.
       * `{\"attributes\":{\"string1\":\"string2\"}}`
       */
      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnThingGroup.AttributePayloadProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnThingGroup.AttributePayloadProperty,
    ) : CdkObject(cdkObject),
        AttributePayloadProperty {
      /**
       * A JSON string containing up to three key-value pair in JSON format. For example:.
       *
       * `{\"attributes\":{\"string1\":\"string2\"}}`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thinggroup-attributepayload.html#cfn-iot-thinggroup-attributepayload-attributes)
       */
      override fun attributes(): Any? = unwrap(this).getAttributes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AttributePayloadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingGroup.AttributePayloadProperty):
          AttributePayloadProperty = CdkObjectWrappers.wrap(cdkObject) as? AttributePayloadProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributePayloadProperty):
          software.amazon.awscdk.services.iot.CfnThingGroup.AttributePayloadProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnThingGroup.AttributePayloadProperty
    }
  }

  /**
   * Thing group properties.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * ThingGroupPropertiesProperty thingGroupPropertiesProperty =
   * ThingGroupPropertiesProperty.builder()
   * .attributePayload(AttributePayloadProperty.builder()
   * .attributes(Map.of(
   * "attributesKey", "attributes"))
   * .build())
   * .thingGroupDescription("thingGroupDescription")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thinggroup-thinggroupproperties.html)
   */
  public interface ThingGroupPropertiesProperty {
    /**
     * The thing group attributes in JSON format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thinggroup-thinggroupproperties.html#cfn-iot-thinggroup-thinggroupproperties-attributepayload)
     */
    public fun attributePayload(): Any? = unwrap(this).getAttributePayload()

    /**
     * The thing group description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thinggroup-thinggroupproperties.html#cfn-iot-thinggroup-thinggroupproperties-thinggroupdescription)
     */
    public fun thingGroupDescription(): String? = unwrap(this).getThingGroupDescription()

    /**
     * A builder for [ThingGroupPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributePayload The thing group attributes in JSON format.
       */
      public fun attributePayload(attributePayload: IResolvable)

      /**
       * @param attributePayload The thing group attributes in JSON format.
       */
      public fun attributePayload(attributePayload: AttributePayloadProperty)

      /**
       * @param attributePayload The thing group attributes in JSON format.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4fd1cdfbf0332bdbd7edf5ca85729520fc70da7127260b89c3f1c470af0bac58")
      public fun attributePayload(attributePayload: AttributePayloadProperty.Builder.() -> Unit)

      /**
       * @param thingGroupDescription The thing group description.
       */
      public fun thingGroupDescription(thingGroupDescription: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnThingGroup.ThingGroupPropertiesProperty.Builder =
          software.amazon.awscdk.services.iot.CfnThingGroup.ThingGroupPropertiesProperty.builder()

      /**
       * @param attributePayload The thing group attributes in JSON format.
       */
      override fun attributePayload(attributePayload: IResolvable) {
        cdkBuilder.attributePayload(attributePayload.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param attributePayload The thing group attributes in JSON format.
       */
      override fun attributePayload(attributePayload: AttributePayloadProperty) {
        cdkBuilder.attributePayload(attributePayload.let(AttributePayloadProperty.Companion::unwrap))
      }

      /**
       * @param attributePayload The thing group attributes in JSON format.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4fd1cdfbf0332bdbd7edf5ca85729520fc70da7127260b89c3f1c470af0bac58")
      override fun attributePayload(attributePayload: AttributePayloadProperty.Builder.() -> Unit):
          Unit = attributePayload(AttributePayloadProperty(attributePayload))

      /**
       * @param thingGroupDescription The thing group description.
       */
      override fun thingGroupDescription(thingGroupDescription: String) {
        cdkBuilder.thingGroupDescription(thingGroupDescription)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnThingGroup.ThingGroupPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnThingGroup.ThingGroupPropertiesProperty,
    ) : CdkObject(cdkObject),
        ThingGroupPropertiesProperty {
      /**
       * The thing group attributes in JSON format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thinggroup-thinggroupproperties.html#cfn-iot-thinggroup-thinggroupproperties-attributepayload)
       */
      override fun attributePayload(): Any? = unwrap(this).getAttributePayload()

      /**
       * The thing group description.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thinggroup-thinggroupproperties.html#cfn-iot-thinggroup-thinggroupproperties-thinggroupdescription)
       */
      override fun thingGroupDescription(): String? = unwrap(this).getThingGroupDescription()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ThingGroupPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingGroup.ThingGroupPropertiesProperty):
          ThingGroupPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ThingGroupPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThingGroupPropertiesProperty):
          software.amazon.awscdk.services.iot.CfnThingGroup.ThingGroupPropertiesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnThingGroup.ThingGroupPropertiesProperty
    }
  }
}
