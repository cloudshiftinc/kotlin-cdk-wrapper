@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnThingType`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnThingTypeProps cfnThingTypeProps = CfnThingTypeProps.builder()
 * .deprecateThingType(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .thingTypeName("thingTypeName")
 * .thingTypeProperties(ThingTypePropertiesProperty.builder()
 * .searchableAttributes(List.of("searchableAttributes"))
 * .thingTypeDescription("thingTypeDescription")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html)
 */
public interface CfnThingTypeProps {
  /**
   * Deprecates a thing type. You can not associate new things with deprecated thing type.
   *
   * Requires permission to access the
   * [DeprecateThingType](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
   * action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-deprecatethingtype)
   */
  public fun deprecateThingType(): Any? = unwrap(this).getDeprecateThingType()

  /**
   * Metadata which can be used to manage the thing type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name of the thing type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-thingtypename)
   */
  public fun thingTypeName(): String? = unwrap(this).getThingTypeName()

  /**
   * The thing type properties for the thing type to create.
   *
   * It contains information about the new thing type including a description, and a list of
   * searchable thing attribute names. `ThingTypeProperties` can't be updated after the initial
   * creation of the `ThingType` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-thingtypeproperties)
   */
  public fun thingTypeProperties(): Any? = unwrap(this).getThingTypeProperties()

  /**
   * A builder for [CfnThingTypeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deprecateThingType Deprecates a thing type. You can not associate new things with
     * deprecated thing type.
     * Requires permission to access the
     * [DeprecateThingType](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
     * action.
     */
    public fun deprecateThingType(deprecateThingType: Boolean)

    /**
     * @param deprecateThingType Deprecates a thing type. You can not associate new things with
     * deprecated thing type.
     * Requires permission to access the
     * [DeprecateThingType](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
     * action.
     */
    public fun deprecateThingType(deprecateThingType: IResolvable)

    /**
     * @param tags Metadata which can be used to manage the thing type.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata which can be used to manage the thing type.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param thingTypeName The name of the thing type.
     */
    public fun thingTypeName(thingTypeName: String)

    /**
     * @param thingTypeProperties The thing type properties for the thing type to create.
     * It contains information about the new thing type including a description, and a list of
     * searchable thing attribute names. `ThingTypeProperties` can't be updated after the initial
     * creation of the `ThingType` .
     */
    public fun thingTypeProperties(thingTypeProperties: IResolvable)

    /**
     * @param thingTypeProperties The thing type properties for the thing type to create.
     * It contains information about the new thing type including a description, and a list of
     * searchable thing attribute names. `ThingTypeProperties` can't be updated after the initial
     * creation of the `ThingType` .
     */
    public fun thingTypeProperties(thingTypeProperties: CfnThingType.ThingTypePropertiesProperty)

    /**
     * @param thingTypeProperties The thing type properties for the thing type to create.
     * It contains information about the new thing type including a description, and a list of
     * searchable thing attribute names. `ThingTypeProperties` can't be updated after the initial
     * creation of the `ThingType` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96150f95bb0eda1f7dc38218b6cf02c2b0a973ea8a4001907c7e72a7e500f940")
    public
        fun thingTypeProperties(thingTypeProperties: CfnThingType.ThingTypePropertiesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnThingTypeProps.Builder =
        software.amazon.awscdk.services.iot.CfnThingTypeProps.builder()

    /**
     * @param deprecateThingType Deprecates a thing type. You can not associate new things with
     * deprecated thing type.
     * Requires permission to access the
     * [DeprecateThingType](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
     * action.
     */
    override fun deprecateThingType(deprecateThingType: Boolean) {
      cdkBuilder.deprecateThingType(deprecateThingType)
    }

    /**
     * @param deprecateThingType Deprecates a thing type. You can not associate new things with
     * deprecated thing type.
     * Requires permission to access the
     * [DeprecateThingType](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
     * action.
     */
    override fun deprecateThingType(deprecateThingType: IResolvable) {
      cdkBuilder.deprecateThingType(deprecateThingType.let(IResolvable::unwrap))
    }

    /**
     * @param tags Metadata which can be used to manage the thing type.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata which can be used to manage the thing type.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param thingTypeName The name of the thing type.
     */
    override fun thingTypeName(thingTypeName: String) {
      cdkBuilder.thingTypeName(thingTypeName)
    }

    /**
     * @param thingTypeProperties The thing type properties for the thing type to create.
     * It contains information about the new thing type including a description, and a list of
     * searchable thing attribute names. `ThingTypeProperties` can't be updated after the initial
     * creation of the `ThingType` .
     */
    override fun thingTypeProperties(thingTypeProperties: IResolvable) {
      cdkBuilder.thingTypeProperties(thingTypeProperties.let(IResolvable::unwrap))
    }

    /**
     * @param thingTypeProperties The thing type properties for the thing type to create.
     * It contains information about the new thing type including a description, and a list of
     * searchable thing attribute names. `ThingTypeProperties` can't be updated after the initial
     * creation of the `ThingType` .
     */
    override
        fun thingTypeProperties(thingTypeProperties: CfnThingType.ThingTypePropertiesProperty) {
      cdkBuilder.thingTypeProperties(thingTypeProperties.let(CfnThingType.ThingTypePropertiesProperty::unwrap))
    }

    /**
     * @param thingTypeProperties The thing type properties for the thing type to create.
     * It contains information about the new thing type including a description, and a list of
     * searchable thing attribute names. `ThingTypeProperties` can't be updated after the initial
     * creation of the `ThingType` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96150f95bb0eda1f7dc38218b6cf02c2b0a973ea8a4001907c7e72a7e500f940")
    override
        fun thingTypeProperties(thingTypeProperties: CfnThingType.ThingTypePropertiesProperty.Builder.() -> Unit):
        Unit = thingTypeProperties(CfnThingType.ThingTypePropertiesProperty(thingTypeProperties))

    public fun build(): software.amazon.awscdk.services.iot.CfnThingTypeProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnThingTypeProps,
  ) : CdkObject(cdkObject), CfnThingTypeProps {
    /**
     * Deprecates a thing type. You can not associate new things with deprecated thing type.
     *
     * Requires permission to access the
     * [DeprecateThingType](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
     * action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-deprecatethingtype)
     */
    override fun deprecateThingType(): Any? = unwrap(this).getDeprecateThingType()

    /**
     * Metadata which can be used to manage the thing type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The name of the thing type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-thingtypename)
     */
    override fun thingTypeName(): String? = unwrap(this).getThingTypeName()

    /**
     * The thing type properties for the thing type to create.
     *
     * It contains information about the new thing type including a description, and a list of
     * searchable thing attribute names. `ThingTypeProperties` can't be updated after the initial
     * creation of the `ThingType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-thingtypeproperties)
     */
    override fun thingTypeProperties(): Any? = unwrap(this).getThingTypeProperties()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnThingTypeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingTypeProps):
        CfnThingTypeProps = CdkObjectWrappers.wrap(cdkObject) as CfnThingTypeProps

    internal fun unwrap(wrapped: CfnThingTypeProps):
        software.amazon.awscdk.services.iot.CfnThingTypeProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iot.CfnThingTypeProps
  }
}
