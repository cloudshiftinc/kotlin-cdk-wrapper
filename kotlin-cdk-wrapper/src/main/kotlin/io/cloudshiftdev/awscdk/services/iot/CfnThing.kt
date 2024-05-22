@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the `AWS::IoT::Thing` resource to declare an AWS IoT thing.
 *
 * For information about working with things, see [How AWS IoT
 * Works](https://docs.aws.amazon.com/iot/latest/developerguide/aws-iot-how-it-works.html) and [Device
 * Registry for AWS IoT](https://docs.aws.amazon.com/iot/latest/developerguide/thing-registry.html) in
 * the *AWS IoT Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnThing cfnThing = CfnThing.Builder.create(this, "MyCfnThing")
 * .attributePayload(AttributePayloadProperty.builder()
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .build())
 * .thingName("thingName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html)
 */
public open class CfnThing(
  cdkObject: software.amazon.awscdk.services.iot.CfnThing,
) : CfnResource(cdkObject), IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.iot.CfnThing(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnThingProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnThing(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnThingProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnThingProps.Builder.() -> Unit,
  ) : this(scope, id, CfnThingProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the AWS IoT thing, such as
   * `arn:aws:iot:us-east-2:123456789012:thing/MyThing` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The Id of this thing.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A string that contains up to three key value pairs.
   */
  public open fun attributePayload(): Any? = unwrap(this).getAttributePayload()

  /**
   * A string that contains up to three key value pairs.
   */
  public open fun attributePayload(`value`: IResolvable) {
    unwrap(this).setAttributePayload(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A string that contains up to three key value pairs.
   */
  public open fun attributePayload(`value`: AttributePayloadProperty) {
    unwrap(this).setAttributePayload(`value`.let(AttributePayloadProperty.Companion::unwrap))
  }

  /**
   * A string that contains up to three key value pairs.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eae62ff6726904de9c0d99628001469c83d31f94baf15f761365ae616138a366")
  public open fun attributePayload(`value`: AttributePayloadProperty.Builder.() -> Unit): Unit =
      attributePayload(AttributePayloadProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the thing to update.
   */
  public open fun thingName(): String? = unwrap(this).getThingName()

  /**
   * The name of the thing to update.
   */
  public open fun thingName(`value`: String) {
    unwrap(this).setThingName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnThing].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A string that contains up to three key value pairs.
     *
     * Maximum length of 800. Duplicates not allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-attributepayload)
     * @param attributePayload A string that contains up to three key value pairs. 
     */
    public fun attributePayload(attributePayload: IResolvable)

    /**
     * A string that contains up to three key value pairs.
     *
     * Maximum length of 800. Duplicates not allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-attributepayload)
     * @param attributePayload A string that contains up to three key value pairs. 
     */
    public fun attributePayload(attributePayload: AttributePayloadProperty)

    /**
     * A string that contains up to three key value pairs.
     *
     * Maximum length of 800. Duplicates not allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-attributepayload)
     * @param attributePayload A string that contains up to three key value pairs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5aaa61e1661e96b9c29f7c3abde7336cb5bc324ecc60d4ceb73c8ea86316459c")
    public fun attributePayload(attributePayload: AttributePayloadProperty.Builder.() -> Unit)

    /**
     * The name of the thing to update.
     *
     * You can't change a thing's name. To change a thing's name, you must create a new thing, give
     * it the new name, and then delete the old thing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-thingname)
     * @param thingName The name of the thing to update. 
     */
    public fun thingName(thingName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnThing.Builder =
        software.amazon.awscdk.services.iot.CfnThing.Builder.create(scope, id)

    /**
     * A string that contains up to three key value pairs.
     *
     * Maximum length of 800. Duplicates not allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-attributepayload)
     * @param attributePayload A string that contains up to three key value pairs. 
     */
    override fun attributePayload(attributePayload: IResolvable) {
      cdkBuilder.attributePayload(attributePayload.let(IResolvable.Companion::unwrap))
    }

    /**
     * A string that contains up to three key value pairs.
     *
     * Maximum length of 800. Duplicates not allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-attributepayload)
     * @param attributePayload A string that contains up to three key value pairs. 
     */
    override fun attributePayload(attributePayload: AttributePayloadProperty) {
      cdkBuilder.attributePayload(attributePayload.let(AttributePayloadProperty.Companion::unwrap))
    }

    /**
     * A string that contains up to three key value pairs.
     *
     * Maximum length of 800. Duplicates not allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-attributepayload)
     * @param attributePayload A string that contains up to three key value pairs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5aaa61e1661e96b9c29f7c3abde7336cb5bc324ecc60d4ceb73c8ea86316459c")
    override fun attributePayload(attributePayload: AttributePayloadProperty.Builder.() -> Unit):
        Unit = attributePayload(AttributePayloadProperty(attributePayload))

    /**
     * The name of the thing to update.
     *
     * You can't change a thing's name. To change a thing's name, you must create a new thing, give
     * it the new name, and then delete the old thing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-thingname)
     * @param thingName The name of the thing to update. 
     */
    override fun thingName(thingName: String) {
      cdkBuilder.thingName(thingName)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnThing = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnThing.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnThing {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnThing(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThing): CfnThing =
        CfnThing(cdkObject)

    internal fun unwrap(wrapped: CfnThing): software.amazon.awscdk.services.iot.CfnThing =
        wrapped.cdkObject as software.amazon.awscdk.services.iot.CfnThing
  }

  /**
   * The AttributePayload property specifies up to three attributes for an AWS IoT as key-value
   * pairs.
   *
   * AttributePayload is a property of the
   * [AWS::IoT::Thing](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html)
   * resource.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thing-attributepayload.html)
   */
  public interface AttributePayloadProperty {
    /**
     * A JSON string containing up to three key-value pair in JSON format. For example:.
     *
     * `{\"attributes\":{\"string1\":\"string2\"}}`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thing-attributepayload.html#cfn-iot-thing-attributepayload-attributes)
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
      public fun attributes(attributes: IResolvable)

      /**
       * @param attributes A JSON string containing up to three key-value pair in JSON format. For
       * example:.
       * `{\"attributes\":{\"string1\":\"string2\"}}`
       */
      public fun attributes(attributes: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty.Builder =
          software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty.builder()

      /**
       * @param attributes A JSON string containing up to three key-value pair in JSON format. For
       * example:.
       * `{\"attributes\":{\"string1\":\"string2\"}}`
       */
      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param attributes A JSON string containing up to three key-value pair in JSON format. For
       * example:.
       * `{\"attributes\":{\"string1\":\"string2\"}}`
       */
      override fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty,
    ) : CdkObject(cdkObject), AttributePayloadProperty {
      /**
       * A JSON string containing up to three key-value pair in JSON format. For example:.
       *
       * `{\"attributes\":{\"string1\":\"string2\"}}`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thing-attributepayload.html#cfn-iot-thing-attributepayload-attributes)
       */
      override fun attributes(): Any? = unwrap(this).getAttributes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AttributePayloadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty):
          AttributePayloadProperty = CdkObjectWrappers.wrap(cdkObject) as? AttributePayloadProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributePayloadProperty):
          software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty
    }
  }
}
