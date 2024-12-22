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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new thing type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnThingType cfnThingType = CfnThingType.Builder.create(this, "MyCfnThingType")
 * .deprecateThingType(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .thingTypeName("thingTypeName")
 * .thingTypeProperties(ThingTypePropertiesProperty.builder()
 * .mqtt5Configuration(Mqtt5ConfigurationProperty.builder()
 * .propagatingAttributes(List.of(PropagatingAttributeProperty.builder()
 * .userPropertyKey("userPropertyKey")
 * // the properties below are optional
 * .connectionAttribute("connectionAttribute")
 * .thingAttribute("thingAttribute")
 * .build()))
 * .build())
 * .searchableAttributes(List.of("searchableAttributes"))
 * .thingTypeDescription("thingTypeDescription")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html)
 */
public open class CfnThingType(
  cdkObject: software.amazon.awscdk.services.iot.CfnThingType,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.iot.CfnThingType(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnThingTypeProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnThingType(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnThingTypeProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnThingTypeProps.Builder.() -> Unit,
  ) : this(scope, id, CfnThingTypeProps(props)
  )

  /**
   * The thing type arn.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The thing type id.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Deprecates a thing type.
   */
  public open fun deprecateThingType(): Any? = unwrap(this).getDeprecateThingType()

  /**
   * Deprecates a thing type.
   */
  public open fun deprecateThingType(`value`: Boolean) {
    unwrap(this).setDeprecateThingType(`value`)
  }

  /**
   * Deprecates a thing type.
   */
  public open fun deprecateThingType(`value`: IResolvable) {
    unwrap(this).setDeprecateThingType(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata which can be used to manage the thing type.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata which can be used to manage the thing type.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Metadata which can be used to manage the thing type.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The name of the thing type.
   */
  public open fun thingTypeName(): String? = unwrap(this).getThingTypeName()

  /**
   * The name of the thing type.
   */
  public open fun thingTypeName(`value`: String) {
    unwrap(this).setThingTypeName(`value`)
  }

  /**
   * The thing type properties for the thing type to create.
   */
  public open fun thingTypeProperties(): Any? = unwrap(this).getThingTypeProperties()

  /**
   * The thing type properties for the thing type to create.
   */
  public open fun thingTypeProperties(`value`: IResolvable) {
    unwrap(this).setThingTypeProperties(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The thing type properties for the thing type to create.
   */
  public open fun thingTypeProperties(`value`: ThingTypePropertiesProperty) {
    unwrap(this).setThingTypeProperties(`value`.let(ThingTypePropertiesProperty.Companion::unwrap))
  }

  /**
   * The thing type properties for the thing type to create.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("adbd823a5ba27f17aba347e598d0eef6b0a8051543c7ed625f1c1efad2fcb533")
  public open fun thingTypeProperties(`value`: ThingTypePropertiesProperty.Builder.() -> Unit): Unit
      = thingTypeProperties(ThingTypePropertiesProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnThingType].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Deprecates a thing type.
     *
     * You can not associate new things with deprecated thing type. You cannot update
     * `ThingTypeProperties` if the thing type is deprecated.
     *
     * Requires permission to access the
     * [DeprecateThingType](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
     * action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-deprecatethingtype)
     * @param deprecateThingType Deprecates a thing type. 
     */
    public fun deprecateThingType(deprecateThingType: Boolean)

    /**
     * Deprecates a thing type.
     *
     * You can not associate new things with deprecated thing type. You cannot update
     * `ThingTypeProperties` if the thing type is deprecated.
     *
     * Requires permission to access the
     * [DeprecateThingType](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
     * action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-deprecatethingtype)
     * @param deprecateThingType Deprecates a thing type. 
     */
    public fun deprecateThingType(deprecateThingType: IResolvable)

    /**
     * Metadata which can be used to manage the thing type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-tags)
     * @param tags Metadata which can be used to manage the thing type. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata which can be used to manage the thing type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-tags)
     * @param tags Metadata which can be used to manage the thing type. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The name of the thing type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-thingtypename)
     * @param thingTypeName The name of the thing type. 
     */
    public fun thingTypeName(thingTypeName: String)

    /**
     * The thing type properties for the thing type to create.
     *
     * It contains information about the new thing type including a description, a list of
     * searchable thing attribute names, and a list of propagating attributes. After a thing type is
     * created, you can only update `Mqtt5Configuration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-thingtypeproperties)
     * @param thingTypeProperties The thing type properties for the thing type to create. 
     */
    public fun thingTypeProperties(thingTypeProperties: IResolvable)

    /**
     * The thing type properties for the thing type to create.
     *
     * It contains information about the new thing type including a description, a list of
     * searchable thing attribute names, and a list of propagating attributes. After a thing type is
     * created, you can only update `Mqtt5Configuration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-thingtypeproperties)
     * @param thingTypeProperties The thing type properties for the thing type to create. 
     */
    public fun thingTypeProperties(thingTypeProperties: ThingTypePropertiesProperty)

    /**
     * The thing type properties for the thing type to create.
     *
     * It contains information about the new thing type including a description, a list of
     * searchable thing attribute names, and a list of propagating attributes. After a thing type is
     * created, you can only update `Mqtt5Configuration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-thingtypeproperties)
     * @param thingTypeProperties The thing type properties for the thing type to create. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7aeaad2d462d2485cf682674aca0c5c899bf8351fd37f923fabf37f643588bce")
    public
        fun thingTypeProperties(thingTypeProperties: ThingTypePropertiesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnThingType.Builder =
        software.amazon.awscdk.services.iot.CfnThingType.Builder.create(scope, id)

    /**
     * Deprecates a thing type.
     *
     * You can not associate new things with deprecated thing type. You cannot update
     * `ThingTypeProperties` if the thing type is deprecated.
     *
     * Requires permission to access the
     * [DeprecateThingType](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
     * action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-deprecatethingtype)
     * @param deprecateThingType Deprecates a thing type. 
     */
    override fun deprecateThingType(deprecateThingType: Boolean) {
      cdkBuilder.deprecateThingType(deprecateThingType)
    }

    /**
     * Deprecates a thing type.
     *
     * You can not associate new things with deprecated thing type. You cannot update
     * `ThingTypeProperties` if the thing type is deprecated.
     *
     * Requires permission to access the
     * [DeprecateThingType](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
     * action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-deprecatethingtype)
     * @param deprecateThingType Deprecates a thing type. 
     */
    override fun deprecateThingType(deprecateThingType: IResolvable) {
      cdkBuilder.deprecateThingType(deprecateThingType.let(IResolvable.Companion::unwrap))
    }

    /**
     * Metadata which can be used to manage the thing type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-tags)
     * @param tags Metadata which can be used to manage the thing type. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Metadata which can be used to manage the thing type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-tags)
     * @param tags Metadata which can be used to manage the thing type. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The name of the thing type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-thingtypename)
     * @param thingTypeName The name of the thing type. 
     */
    override fun thingTypeName(thingTypeName: String) {
      cdkBuilder.thingTypeName(thingTypeName)
    }

    /**
     * The thing type properties for the thing type to create.
     *
     * It contains information about the new thing type including a description, a list of
     * searchable thing attribute names, and a list of propagating attributes. After a thing type is
     * created, you can only update `Mqtt5Configuration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-thingtypeproperties)
     * @param thingTypeProperties The thing type properties for the thing type to create. 
     */
    override fun thingTypeProperties(thingTypeProperties: IResolvable) {
      cdkBuilder.thingTypeProperties(thingTypeProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * The thing type properties for the thing type to create.
     *
     * It contains information about the new thing type including a description, a list of
     * searchable thing attribute names, and a list of propagating attributes. After a thing type is
     * created, you can only update `Mqtt5Configuration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-thingtypeproperties)
     * @param thingTypeProperties The thing type properties for the thing type to create. 
     */
    override fun thingTypeProperties(thingTypeProperties: ThingTypePropertiesProperty) {
      cdkBuilder.thingTypeProperties(thingTypeProperties.let(ThingTypePropertiesProperty.Companion::unwrap))
    }

    /**
     * The thing type properties for the thing type to create.
     *
     * It contains information about the new thing type including a description, a list of
     * searchable thing attribute names, and a list of propagating attributes. After a thing type is
     * created, you can only update `Mqtt5Configuration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-thingtypeproperties)
     * @param thingTypeProperties The thing type properties for the thing type to create. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7aeaad2d462d2485cf682674aca0c5c899bf8351fd37f923fabf37f643588bce")
    override
        fun thingTypeProperties(thingTypeProperties: ThingTypePropertiesProperty.Builder.() -> Unit):
        Unit = thingTypeProperties(ThingTypePropertiesProperty(thingTypeProperties))

    public fun build(): software.amazon.awscdk.services.iot.CfnThingType = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnThingType.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnThingType {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnThingType(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingType): CfnThingType =
        CfnThingType(cdkObject)

    internal fun unwrap(wrapped: CfnThingType): software.amazon.awscdk.services.iot.CfnThingType =
        wrapped.cdkObject as software.amazon.awscdk.services.iot.CfnThingType
  }

  /**
   * The configuration to add user-defined properties to enrich MQTT 5 messages.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * Mqtt5ConfigurationProperty mqtt5ConfigurationProperty = Mqtt5ConfigurationProperty.builder()
   * .propagatingAttributes(List.of(PropagatingAttributeProperty.builder()
   * .userPropertyKey("userPropertyKey")
   * // the properties below are optional
   * .connectionAttribute("connectionAttribute")
   * .thingAttribute("thingAttribute")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thingtype-mqtt5configuration.html)
   */
  public interface Mqtt5ConfigurationProperty {
    /**
     * An object that represents the connection attribute, the thing attribute, and the MQTT 5 user
     * property key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thingtype-mqtt5configuration.html#cfn-iot-thingtype-mqtt5configuration-propagatingattributes)
     */
    public fun propagatingAttributes(): Any? = unwrap(this).getPropagatingAttributes()

    /**
     * A builder for [Mqtt5ConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param propagatingAttributes An object that represents the connection attribute, the thing
       * attribute, and the MQTT 5 user property key.
       */
      public fun propagatingAttributes(propagatingAttributes: IResolvable)

      /**
       * @param propagatingAttributes An object that represents the connection attribute, the thing
       * attribute, and the MQTT 5 user property key.
       */
      public fun propagatingAttributes(propagatingAttributes: List<Any>)

      /**
       * @param propagatingAttributes An object that represents the connection attribute, the thing
       * attribute, and the MQTT 5 user property key.
       */
      public fun propagatingAttributes(vararg propagatingAttributes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnThingType.Mqtt5ConfigurationProperty.Builder =
          software.amazon.awscdk.services.iot.CfnThingType.Mqtt5ConfigurationProperty.builder()

      /**
       * @param propagatingAttributes An object that represents the connection attribute, the thing
       * attribute, and the MQTT 5 user property key.
       */
      override fun propagatingAttributes(propagatingAttributes: IResolvable) {
        cdkBuilder.propagatingAttributes(propagatingAttributes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param propagatingAttributes An object that represents the connection attribute, the thing
       * attribute, and the MQTT 5 user property key.
       */
      override fun propagatingAttributes(propagatingAttributes: List<Any>) {
        cdkBuilder.propagatingAttributes(propagatingAttributes.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param propagatingAttributes An object that represents the connection attribute, the thing
       * attribute, and the MQTT 5 user property key.
       */
      override fun propagatingAttributes(vararg propagatingAttributes: Any): Unit =
          propagatingAttributes(propagatingAttributes.toList())

      public fun build():
          software.amazon.awscdk.services.iot.CfnThingType.Mqtt5ConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnThingType.Mqtt5ConfigurationProperty,
    ) : CdkObject(cdkObject),
        Mqtt5ConfigurationProperty {
      /**
       * An object that represents the connection attribute, the thing attribute, and the MQTT 5
       * user property key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thingtype-mqtt5configuration.html#cfn-iot-thingtype-mqtt5configuration-propagatingattributes)
       */
      override fun propagatingAttributes(): Any? = unwrap(this).getPropagatingAttributes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Mqtt5ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingType.Mqtt5ConfigurationProperty):
          Mqtt5ConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          Mqtt5ConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: Mqtt5ConfigurationProperty):
          software.amazon.awscdk.services.iot.CfnThingType.Mqtt5ConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnThingType.Mqtt5ConfigurationProperty
    }
  }

  /**
   * An object that represents the connection attribute, the thing attribute, and the MQTT 5 user
   * property key.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * PropagatingAttributeProperty propagatingAttributeProperty =
   * PropagatingAttributeProperty.builder()
   * .userPropertyKey("userPropertyKey")
   * // the properties below are optional
   * .connectionAttribute("connectionAttribute")
   * .thingAttribute("thingAttribute")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thingtype-propagatingattribute.html)
   */
  public interface PropagatingAttributeProperty {
    /**
     * The attribute associated with the connection details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thingtype-propagatingattribute.html#cfn-iot-thingtype-propagatingattribute-connectionattribute)
     */
    public fun connectionAttribute(): String? = unwrap(this).getConnectionAttribute()

    /**
     * The thing attribute that is propagating for MQTT 5 message enrichment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thingtype-propagatingattribute.html#cfn-iot-thingtype-propagatingattribute-thingattribute)
     */
    public fun thingAttribute(): String? = unwrap(this).getThingAttribute()

    /**
     * The key of the MQTT 5 user property, which is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thingtype-propagatingattribute.html#cfn-iot-thingtype-propagatingattribute-userpropertykey)
     */
    public fun userPropertyKey(): String

    /**
     * A builder for [PropagatingAttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectionAttribute The attribute associated with the connection details.
       */
      public fun connectionAttribute(connectionAttribute: String)

      /**
       * @param thingAttribute The thing attribute that is propagating for MQTT 5 message
       * enrichment.
       */
      public fun thingAttribute(thingAttribute: String)

      /**
       * @param userPropertyKey The key of the MQTT 5 user property, which is a key-value pair. 
       */
      public fun userPropertyKey(userPropertyKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnThingType.PropagatingAttributeProperty.Builder =
          software.amazon.awscdk.services.iot.CfnThingType.PropagatingAttributeProperty.builder()

      /**
       * @param connectionAttribute The attribute associated with the connection details.
       */
      override fun connectionAttribute(connectionAttribute: String) {
        cdkBuilder.connectionAttribute(connectionAttribute)
      }

      /**
       * @param thingAttribute The thing attribute that is propagating for MQTT 5 message
       * enrichment.
       */
      override fun thingAttribute(thingAttribute: String) {
        cdkBuilder.thingAttribute(thingAttribute)
      }

      /**
       * @param userPropertyKey The key of the MQTT 5 user property, which is a key-value pair. 
       */
      override fun userPropertyKey(userPropertyKey: String) {
        cdkBuilder.userPropertyKey(userPropertyKey)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnThingType.PropagatingAttributeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnThingType.PropagatingAttributeProperty,
    ) : CdkObject(cdkObject),
        PropagatingAttributeProperty {
      /**
       * The attribute associated with the connection details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thingtype-propagatingattribute.html#cfn-iot-thingtype-propagatingattribute-connectionattribute)
       */
      override fun connectionAttribute(): String? = unwrap(this).getConnectionAttribute()

      /**
       * The thing attribute that is propagating for MQTT 5 message enrichment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thingtype-propagatingattribute.html#cfn-iot-thingtype-propagatingattribute-thingattribute)
       */
      override fun thingAttribute(): String? = unwrap(this).getThingAttribute()

      /**
       * The key of the MQTT 5 user property, which is a key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thingtype-propagatingattribute.html#cfn-iot-thingtype-propagatingattribute-userpropertykey)
       */
      override fun userPropertyKey(): String = unwrap(this).getUserPropertyKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PropagatingAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingType.PropagatingAttributeProperty):
          PropagatingAttributeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PropagatingAttributeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PropagatingAttributeProperty):
          software.amazon.awscdk.services.iot.CfnThingType.PropagatingAttributeProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnThingType.PropagatingAttributeProperty
    }
  }

  /**
   * The ThingTypeProperties contains information about the thing type including: a thing type
   * description, and a list of searchable thing attribute names.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * ThingTypePropertiesProperty thingTypePropertiesProperty = ThingTypePropertiesProperty.builder()
   * .mqtt5Configuration(Mqtt5ConfigurationProperty.builder()
   * .propagatingAttributes(List.of(PropagatingAttributeProperty.builder()
   * .userPropertyKey("userPropertyKey")
   * // the properties below are optional
   * .connectionAttribute("connectionAttribute")
   * .thingAttribute("thingAttribute")
   * .build()))
   * .build())
   * .searchableAttributes(List.of("searchableAttributes"))
   * .thingTypeDescription("thingTypeDescription")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thingtype-thingtypeproperties.html)
   */
  public interface ThingTypePropertiesProperty {
    /**
     * The configuration to add user-defined properties to enrich MQTT 5 messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thingtype-thingtypeproperties.html#cfn-iot-thingtype-thingtypeproperties-mqtt5configuration)
     */
    public fun mqtt5Configuration(): Any? = unwrap(this).getMqtt5Configuration()

    /**
     * A list of searchable thing attribute names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thingtype-thingtypeproperties.html#cfn-iot-thingtype-thingtypeproperties-searchableattributes)
     */
    public fun searchableAttributes(): List<String> = unwrap(this).getSearchableAttributes() ?:
        emptyList()

    /**
     * The description of the thing type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thingtype-thingtypeproperties.html#cfn-iot-thingtype-thingtypeproperties-thingtypedescription)
     */
    public fun thingTypeDescription(): String? = unwrap(this).getThingTypeDescription()

    /**
     * A builder for [ThingTypePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mqtt5Configuration The configuration to add user-defined properties to enrich MQTT 5
       * messages.
       */
      public fun mqtt5Configuration(mqtt5Configuration: IResolvable)

      /**
       * @param mqtt5Configuration The configuration to add user-defined properties to enrich MQTT 5
       * messages.
       */
      public fun mqtt5Configuration(mqtt5Configuration: Mqtt5ConfigurationProperty)

      /**
       * @param mqtt5Configuration The configuration to add user-defined properties to enrich MQTT 5
       * messages.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b7887519e31f8521db68522766bf6eb05e90159ae62b63aa03fd6255ab6b8b10")
      public
          fun mqtt5Configuration(mqtt5Configuration: Mqtt5ConfigurationProperty.Builder.() -> Unit)

      /**
       * @param searchableAttributes A list of searchable thing attribute names.
       */
      public fun searchableAttributes(searchableAttributes: List<String>)

      /**
       * @param searchableAttributes A list of searchable thing attribute names.
       */
      public fun searchableAttributes(vararg searchableAttributes: String)

      /**
       * @param thingTypeDescription The description of the thing type.
       */
      public fun thingTypeDescription(thingTypeDescription: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnThingType.ThingTypePropertiesProperty.Builder =
          software.amazon.awscdk.services.iot.CfnThingType.ThingTypePropertiesProperty.builder()

      /**
       * @param mqtt5Configuration The configuration to add user-defined properties to enrich MQTT 5
       * messages.
       */
      override fun mqtt5Configuration(mqtt5Configuration: IResolvable) {
        cdkBuilder.mqtt5Configuration(mqtt5Configuration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param mqtt5Configuration The configuration to add user-defined properties to enrich MQTT 5
       * messages.
       */
      override fun mqtt5Configuration(mqtt5Configuration: Mqtt5ConfigurationProperty) {
        cdkBuilder.mqtt5Configuration(mqtt5Configuration.let(Mqtt5ConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param mqtt5Configuration The configuration to add user-defined properties to enrich MQTT 5
       * messages.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b7887519e31f8521db68522766bf6eb05e90159ae62b63aa03fd6255ab6b8b10")
      override
          fun mqtt5Configuration(mqtt5Configuration: Mqtt5ConfigurationProperty.Builder.() -> Unit):
          Unit = mqtt5Configuration(Mqtt5ConfigurationProperty(mqtt5Configuration))

      /**
       * @param searchableAttributes A list of searchable thing attribute names.
       */
      override fun searchableAttributes(searchableAttributes: List<String>) {
        cdkBuilder.searchableAttributes(searchableAttributes)
      }

      /**
       * @param searchableAttributes A list of searchable thing attribute names.
       */
      override fun searchableAttributes(vararg searchableAttributes: String): Unit =
          searchableAttributes(searchableAttributes.toList())

      /**
       * @param thingTypeDescription The description of the thing type.
       */
      override fun thingTypeDescription(thingTypeDescription: String) {
        cdkBuilder.thingTypeDescription(thingTypeDescription)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnThingType.ThingTypePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnThingType.ThingTypePropertiesProperty,
    ) : CdkObject(cdkObject),
        ThingTypePropertiesProperty {
      /**
       * The configuration to add user-defined properties to enrich MQTT 5 messages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thingtype-thingtypeproperties.html#cfn-iot-thingtype-thingtypeproperties-mqtt5configuration)
       */
      override fun mqtt5Configuration(): Any? = unwrap(this).getMqtt5Configuration()

      /**
       * A list of searchable thing attribute names.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thingtype-thingtypeproperties.html#cfn-iot-thingtype-thingtypeproperties-searchableattributes)
       */
      override fun searchableAttributes(): List<String> = unwrap(this).getSearchableAttributes() ?:
          emptyList()

      /**
       * The description of the thing type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thingtype-thingtypeproperties.html#cfn-iot-thingtype-thingtypeproperties-thingtypedescription)
       */
      override fun thingTypeDescription(): String? = unwrap(this).getThingTypeDescription()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ThingTypePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingType.ThingTypePropertiesProperty):
          ThingTypePropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ThingTypePropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThingTypePropertiesProperty):
          software.amazon.awscdk.services.iot.CfnThingType.ThingTypePropertiesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnThingType.ThingTypePropertiesProperty
    }
  }
}
