@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnThing`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnThingProps cfnThingProps = CfnThingProps.builder()
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
public interface CfnThingProps {
  /**
   * A string that contains up to three key value pairs.
   *
   * Maximum length of 800. Duplicates not allowed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-attributepayload)
   */
  public fun attributePayload(): Any? = unwrap(this).getAttributePayload()

  /**
   * The name of the thing to update.
   *
   * You can't change a thing's name. To change a thing's name, you must create a new thing, give it
   * the new name, and then delete the old thing.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-thingname)
   */
  public fun thingName(): String? = unwrap(this).getThingName()

  /**
   * A builder for [CfnThingProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param attributePayload A string that contains up to three key value pairs.
     * Maximum length of 800. Duplicates not allowed.
     */
    public fun attributePayload(attributePayload: IResolvable)

    /**
     * @param attributePayload A string that contains up to three key value pairs.
     * Maximum length of 800. Duplicates not allowed.
     */
    public fun attributePayload(attributePayload: CfnThing.AttributePayloadProperty)

    /**
     * @param attributePayload A string that contains up to three key value pairs.
     * Maximum length of 800. Duplicates not allowed.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed08aee2458b41995a9e3dd81db5bf0fcfcc267802bdde4d9e1686e6bd7ff619")
    public
        fun attributePayload(attributePayload: CfnThing.AttributePayloadProperty.Builder.() -> Unit)

    /**
     * @param thingName The name of the thing to update.
     * You can't change a thing's name. To change a thing's name, you must create a new thing, give
     * it the new name, and then delete the old thing.
     */
    public fun thingName(thingName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnThingProps.Builder =
        software.amazon.awscdk.services.iot.CfnThingProps.builder()

    /**
     * @param attributePayload A string that contains up to three key value pairs.
     * Maximum length of 800. Duplicates not allowed.
     */
    override fun attributePayload(attributePayload: IResolvable) {
      cdkBuilder.attributePayload(attributePayload.let(IResolvable::unwrap))
    }

    /**
     * @param attributePayload A string that contains up to three key value pairs.
     * Maximum length of 800. Duplicates not allowed.
     */
    override fun attributePayload(attributePayload: CfnThing.AttributePayloadProperty) {
      cdkBuilder.attributePayload(attributePayload.let(CfnThing.AttributePayloadProperty::unwrap))
    }

    /**
     * @param attributePayload A string that contains up to three key value pairs.
     * Maximum length of 800. Duplicates not allowed.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed08aee2458b41995a9e3dd81db5bf0fcfcc267802bdde4d9e1686e6bd7ff619")
    override
        fun attributePayload(attributePayload: CfnThing.AttributePayloadProperty.Builder.() -> Unit):
        Unit = attributePayload(CfnThing.AttributePayloadProperty(attributePayload))

    /**
     * @param thingName The name of the thing to update.
     * You can't change a thing's name. To change a thing's name, you must create a new thing, give
     * it the new name, and then delete the old thing.
     */
    override fun thingName(thingName: String) {
      cdkBuilder.thingName(thingName)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnThingProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iot.CfnThingProps,
  ) : CdkObject(cdkObject), CfnThingProps {
    /**
     * A string that contains up to three key value pairs.
     *
     * Maximum length of 800. Duplicates not allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-attributepayload)
     */
    override fun attributePayload(): Any? = unwrap(this).getAttributePayload()

    /**
     * The name of the thing to update.
     *
     * You can't change a thing's name. To change a thing's name, you must create a new thing, give
     * it the new name, and then delete the old thing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-thingname)
     */
    override fun thingName(): String? = unwrap(this).getThingName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnThingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingProps): CfnThingProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnThingProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnThingProps): software.amazon.awscdk.services.iot.CfnThingProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnThingProps
  }
}
