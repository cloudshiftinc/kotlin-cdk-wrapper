package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CdkObject
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
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnThingType internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iot.CfnThingType,
) : CfnResource(cdkObject), IInspectable, ITaggable {
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
   *
   * You can not associate new things with deprecated thing type.
   */
  public open fun deprecateThingType(): Any? = unwrap(this).getDeprecateThingType()

  /**
   * Deprecates a thing type.
   *
   * You can not associate new things with deprecated thing type.
   */
  public open fun deprecateThingType(`value`: Boolean) {
    unwrap(this).setDeprecateThingType(`value`)
  }

  /**
   * Deprecates a thing type.
   *
   * You can not associate new things with deprecated thing type.
   */
  public open fun deprecateThingType(`value`: IResolvable) {
    unwrap(this).setDeprecateThingType(`value`.let(IResolvable::unwrap))
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
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
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
    unwrap(this).setThingTypeProperties(`value`.let(IResolvable::unwrap))
  }

  /**
   * The thing type properties for the thing type to create.
   */
  public open fun thingTypeProperties(`value`: ThingTypePropertiesProperty) {
    unwrap(this).setThingTypeProperties(`value`.let(ThingTypePropertiesProperty::unwrap))
  }

  /**
   * The thing type properties for the thing type to create.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("adbd823a5ba27f17aba347e598d0eef6b0a8051543c7ed625f1c1efad2fcb533")
  public open fun thingTypeProperties(`value`: ThingTypePropertiesProperty.Builder.() -> Unit): Unit
      = thingTypeProperties(ThingTypePropertiesProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnThingType].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Deprecates a thing type. You can not associate new things with deprecated thing type.
     *
     * Requires permission to access the
     * [DeprecateThingType](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
     * action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-deprecatethingtype)
     * @param deprecateThingType Deprecates a thing type. You can not associate new things with
     * deprecated thing type. 
     */
    public fun deprecateThingType(deprecateThingType: Boolean)

    /**
     * Deprecates a thing type. You can not associate new things with deprecated thing type.
     *
     * Requires permission to access the
     * [DeprecateThingType](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
     * action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-deprecatethingtype)
     * @param deprecateThingType Deprecates a thing type. You can not associate new things with
     * deprecated thing type. 
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
     * It contains information about the new thing type including a description, and a list of
     * searchable thing attribute names. `ThingTypeProperties` can't be updated after the initial
     * creation of the `ThingType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-thingtypeproperties)
     * @param thingTypeProperties The thing type properties for the thing type to create. 
     */
    public fun thingTypeProperties(thingTypeProperties: IResolvable)

    /**
     * The thing type properties for the thing type to create.
     *
     * It contains information about the new thing type including a description, and a list of
     * searchable thing attribute names. `ThingTypeProperties` can't be updated after the initial
     * creation of the `ThingType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-thingtypeproperties)
     * @param thingTypeProperties The thing type properties for the thing type to create. 
     */
    public fun thingTypeProperties(thingTypeProperties: ThingTypePropertiesProperty)

    /**
     * The thing type properties for the thing type to create.
     *
     * It contains information about the new thing type including a description, and a list of
     * searchable thing attribute names. `ThingTypeProperties` can't be updated after the initial
     * creation of the `ThingType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-thingtypeproperties)
     * @param thingTypeProperties The thing type properties for the thing type to create. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
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
     * Deprecates a thing type. You can not associate new things with deprecated thing type.
     *
     * Requires permission to access the
     * [DeprecateThingType](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
     * action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-deprecatethingtype)
     * @param deprecateThingType Deprecates a thing type. You can not associate new things with
     * deprecated thing type. 
     */
    override fun deprecateThingType(deprecateThingType: Boolean) {
      cdkBuilder.deprecateThingType(deprecateThingType)
    }

    /**
     * Deprecates a thing type. You can not associate new things with deprecated thing type.
     *
     * Requires permission to access the
     * [DeprecateThingType](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
     * action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-deprecatethingtype)
     * @param deprecateThingType Deprecates a thing type. You can not associate new things with
     * deprecated thing type. 
     */
    override fun deprecateThingType(deprecateThingType: IResolvable) {
      cdkBuilder.deprecateThingType(deprecateThingType.let(IResolvable::unwrap))
    }

    /**
     * Metadata which can be used to manage the thing type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-tags)
     * @param tags Metadata which can be used to manage the thing type. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
     * It contains information about the new thing type including a description, and a list of
     * searchable thing attribute names. `ThingTypeProperties` can't be updated after the initial
     * creation of the `ThingType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-thingtypeproperties)
     * @param thingTypeProperties The thing type properties for the thing type to create. 
     */
    override fun thingTypeProperties(thingTypeProperties: IResolvable) {
      cdkBuilder.thingTypeProperties(thingTypeProperties.let(IResolvable::unwrap))
    }

    /**
     * The thing type properties for the thing type to create.
     *
     * It contains information about the new thing type including a description, and a list of
     * searchable thing attribute names. `ThingTypeProperties` can't be updated after the initial
     * creation of the `ThingType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-thingtypeproperties)
     * @param thingTypeProperties The thing type properties for the thing type to create. 
     */
    override fun thingTypeProperties(thingTypeProperties: ThingTypePropertiesProperty) {
      cdkBuilder.thingTypeProperties(thingTypeProperties.let(ThingTypePropertiesProperty::unwrap))
    }

    /**
     * The thing type properties for the thing type to create.
     *
     * It contains information about the new thing type including a description, and a list of
     * searchable thing attribute names. `ThingTypeProperties` can't be updated after the initial
     * creation of the `ThingType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-thingtypeproperties)
     * @param thingTypeProperties The thing type properties for the thing type to create. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7aeaad2d462d2485cf682674aca0c5c899bf8351fd37f923fabf37f643588bce")
    override
        fun thingTypeProperties(thingTypeProperties: ThingTypePropertiesProperty.Builder.() -> Unit):
        Unit = thingTypeProperties(ThingTypePropertiesProperty(thingTypeProperties))

    public fun build(): software.amazon.awscdk.services.iot.CfnThingType = cdkBuilder.build()
  }

  public companion object {
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
        wrapped.cdkObject
  }

  public interface ThingTypePropertiesProperty {
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
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnThingType.ThingTypePropertiesProperty,
    ) : CdkObject(cdkObject), ThingTypePropertiesProperty {
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
          ThingTypePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThingTypePropertiesProperty):
          software.amazon.awscdk.services.iot.CfnThingType.ThingTypePropertiesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnThingType.ThingTypePropertiesProperty
    }
  }
}
