@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the `AWS::IoT::Dimension` to limit the scope of a metric used in a security profile for AWS
 * IoT Device Defender .
 *
 * For example, using a `TOPIC_FILTER` dimension, you can narrow down the scope of the metric to
 * only MQTT topics where the name matches the pattern specified in the dimension. For API reference,
 * see [CreateDimension](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateDimension.html)
 * and for general information, see [Scoping metrics in security profiles using
 * dimensions](https://docs.aws.amazon.com/iot/latest/developerguide/scoping-security-behavior.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnDimension cfnDimension = CfnDimension.Builder.create(this, "MyCfnDimension")
 * .stringValues(List.of("stringValues"))
 * .type("type")
 * // the properties below are optional
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html)
 */
public open class CfnDimension internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iot.CfnDimension,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDimensionProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnDimension(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDimensionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDimensionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDimensionProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the dimension.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A unique identifier for the dimension.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * A unique identifier for the dimension.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Specifies the value or list of values for the dimension.
   */
  public open fun stringValues(): List<String> = unwrap(this).getStringValues()

  /**
   * Specifies the value or list of values for the dimension.
   */
  public open fun stringValues(`value`: List<String>) {
    unwrap(this).setStringValues(`value`)
  }

  /**
   * Specifies the value or list of values for the dimension.
   */
  public open fun stringValues(vararg `value`: String): Unit = stringValues(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata that can be used to manage the dimension.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata that can be used to manage the dimension.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata that can be used to manage the dimension.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Specifies the type of dimension.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * Specifies the type of dimension.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnDimension].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A unique identifier for the dimension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-name)
     * @param name A unique identifier for the dimension. 
     */
    public fun name(name: String)

    /**
     * Specifies the value or list of values for the dimension.
     *
     * For `TOPIC_FILTER` dimensions, this is a pattern used to match the MQTT topic (for example,
     * "admin/#").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-stringvalues)
     * @param stringValues Specifies the value or list of values for the dimension. 
     */
    public fun stringValues(stringValues: List<String>)

    /**
     * Specifies the value or list of values for the dimension.
     *
     * For `TOPIC_FILTER` dimensions, this is a pattern used to match the MQTT topic (for example,
     * "admin/#").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-stringvalues)
     * @param stringValues Specifies the value or list of values for the dimension. 
     */
    public fun stringValues(vararg stringValues: String)

    /**
     * Metadata that can be used to manage the dimension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-tags)
     * @param tags Metadata that can be used to manage the dimension. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata that can be used to manage the dimension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-tags)
     * @param tags Metadata that can be used to manage the dimension. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Specifies the type of dimension.
     *
     * Supported types: `TOPIC_FILTER.`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-type)
     * @param type Specifies the type of dimension. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnDimension.Builder =
        software.amazon.awscdk.services.iot.CfnDimension.Builder.create(scope, id)

    /**
     * A unique identifier for the dimension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-name)
     * @param name A unique identifier for the dimension. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Specifies the value or list of values for the dimension.
     *
     * For `TOPIC_FILTER` dimensions, this is a pattern used to match the MQTT topic (for example,
     * "admin/#").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-stringvalues)
     * @param stringValues Specifies the value or list of values for the dimension. 
     */
    override fun stringValues(stringValues: List<String>) {
      cdkBuilder.stringValues(stringValues)
    }

    /**
     * Specifies the value or list of values for the dimension.
     *
     * For `TOPIC_FILTER` dimensions, this is a pattern used to match the MQTT topic (for example,
     * "admin/#").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-stringvalues)
     * @param stringValues Specifies the value or list of values for the dimension. 
     */
    override fun stringValues(vararg stringValues: String): Unit =
        stringValues(stringValues.toList())

    /**
     * Metadata that can be used to manage the dimension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-tags)
     * @param tags Metadata that can be used to manage the dimension. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata that can be used to manage the dimension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-tags)
     * @param tags Metadata that can be used to manage the dimension. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Specifies the type of dimension.
     *
     * Supported types: `TOPIC_FILTER.`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-type)
     * @param type Specifies the type of dimension. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnDimension = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnDimension.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDimension {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDimension(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnDimension): CfnDimension =
        CfnDimension(cdkObject)

    internal fun unwrap(wrapped: CfnDimension): software.amazon.awscdk.services.iot.CfnDimension =
        wrapped.cdkObject
  }
}
