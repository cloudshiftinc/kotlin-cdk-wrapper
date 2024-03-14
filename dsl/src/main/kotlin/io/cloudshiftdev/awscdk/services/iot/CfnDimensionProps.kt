package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDimensionProps {
  /**
   * A unique identifier for the dimension.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Specifies the value or list of values for the dimension.
   *
   * For `TOPIC_FILTER` dimensions, this is a pattern used to match the MQTT topic (for example,
   * "admin/#").
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-stringvalues)
   */
  public fun stringValues(): List<String>

  /**
   * Metadata that can be used to manage the dimension.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies the type of dimension.
   *
   * Supported types: `TOPIC_FILTER.`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnDimensionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name A unique identifier for the dimension.
     */
    public fun name(name: String)

    /**
     * @param stringValues Specifies the value or list of values for the dimension. 
     * For `TOPIC_FILTER` dimensions, this is a pattern used to match the MQTT topic (for example,
     * "admin/#").
     */
    public fun stringValues(stringValues: List<String>)

    /**
     * @param stringValues Specifies the value or list of values for the dimension. 
     * For `TOPIC_FILTER` dimensions, this is a pattern used to match the MQTT topic (for example,
     * "admin/#").
     */
    public fun stringValues(vararg stringValues: String)

    /**
     * @param tags Metadata that can be used to manage the dimension.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata that can be used to manage the dimension.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type Specifies the type of dimension. 
     * Supported types: `TOPIC_FILTER.`
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnDimensionProps.Builder =
        software.amazon.awscdk.services.iot.CfnDimensionProps.builder()

    /**
     * @param name A unique identifier for the dimension.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param stringValues Specifies the value or list of values for the dimension. 
     * For `TOPIC_FILTER` dimensions, this is a pattern used to match the MQTT topic (for example,
     * "admin/#").
     */
    override fun stringValues(stringValues: List<String>) {
      cdkBuilder.stringValues(stringValues)
    }

    /**
     * @param stringValues Specifies the value or list of values for the dimension. 
     * For `TOPIC_FILTER` dimensions, this is a pattern used to match the MQTT topic (for example,
     * "admin/#").
     */
    override fun stringValues(vararg stringValues: String): Unit =
        stringValues(stringValues.toList())

    /**
     * @param tags Metadata that can be used to manage the dimension.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata that can be used to manage the dimension.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type Specifies the type of dimension. 
     * Supported types: `TOPIC_FILTER.`
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnDimensionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnDimensionProps,
  ) : CdkObject(cdkObject), CfnDimensionProps {
    /**
     * A unique identifier for the dimension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Specifies the value or list of values for the dimension.
     *
     * For `TOPIC_FILTER` dimensions, this is a pattern used to match the MQTT topic (for example,
     * "admin/#").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-stringvalues)
     */
    override fun stringValues(): List<String> = unwrap(this).getStringValues()

    /**
     * Metadata that can be used to manage the dimension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Specifies the type of dimension.
     *
     * Supported types: `TOPIC_FILTER.`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDimensionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnDimensionProps):
        CfnDimensionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDimensionProps):
        software.amazon.awscdk.services.iot.CfnDimensionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iot.CfnDimensionProps
  }
}
