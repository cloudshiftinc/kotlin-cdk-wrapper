package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnThingGroupProps {
  /**
   * The parent thing group name.
   *
   * A Dynamic Thing Group does not have `parentGroupName` defined.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-parentgroupname)
   */
  public fun parentGroupName(): String? = unwrap(this).getParentGroupName()

  /**
   * The dynamic thing group search query string.
   *
   * The `queryString` attribute *is* required for `CreateDynamicThingGroup` . The `queryString`
   * attribute *is not* required for `CreateThingGroup` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-querystring)
   */
  public fun queryString(): String? = unwrap(this).getQueryString()

  /**
   * Metadata which can be used to manage the thing group or dynamic thing group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The thing group name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-thinggroupname)
   */
  public fun thingGroupName(): String? = unwrap(this).getThingGroupName()

  /**
   * Thing group properties.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-thinggroupproperties)
   */
  public fun thingGroupProperties(): Any? = unwrap(this).getThingGroupProperties()

  /**
   * A builder for [CfnThingGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param parentGroupName The parent thing group name.
     * A Dynamic Thing Group does not have `parentGroupName` defined.
     */
    public fun parentGroupName(parentGroupName: String)

    /**
     * @param queryString The dynamic thing group search query string.
     * The `queryString` attribute *is* required for `CreateDynamicThingGroup` . The `queryString`
     * attribute *is not* required for `CreateThingGroup` .
     */
    public fun queryString(queryString: String)

    /**
     * @param tags Metadata which can be used to manage the thing group or dynamic thing group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata which can be used to manage the thing group or dynamic thing group.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param thingGroupName The thing group name.
     */
    public fun thingGroupName(thingGroupName: String)

    /**
     * @param thingGroupProperties Thing group properties.
     */
    public fun thingGroupProperties(thingGroupProperties: IResolvable)

    /**
     * @param thingGroupProperties Thing group properties.
     */
    public
        fun thingGroupProperties(thingGroupProperties: CfnThingGroup.ThingGroupPropertiesProperty)

    /**
     * @param thingGroupProperties Thing group properties.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d506a3d8a97afb1cd5d22aab923f73c77809e9406cd060c2a9ff4a4b79cfeadf")
    public
        fun thingGroupProperties(thingGroupProperties: CfnThingGroup.ThingGroupPropertiesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnThingGroupProps.Builder =
        software.amazon.awscdk.services.iot.CfnThingGroupProps.builder()

    /**
     * @param parentGroupName The parent thing group name.
     * A Dynamic Thing Group does not have `parentGroupName` defined.
     */
    override fun parentGroupName(parentGroupName: String) {
      cdkBuilder.parentGroupName(parentGroupName)
    }

    /**
     * @param queryString The dynamic thing group search query string.
     * The `queryString` attribute *is* required for `CreateDynamicThingGroup` . The `queryString`
     * attribute *is not* required for `CreateThingGroup` .
     */
    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    /**
     * @param tags Metadata which can be used to manage the thing group or dynamic thing group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata which can be used to manage the thing group or dynamic thing group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param thingGroupName The thing group name.
     */
    override fun thingGroupName(thingGroupName: String) {
      cdkBuilder.thingGroupName(thingGroupName)
    }

    /**
     * @param thingGroupProperties Thing group properties.
     */
    override fun thingGroupProperties(thingGroupProperties: IResolvable) {
      cdkBuilder.thingGroupProperties(thingGroupProperties.let(IResolvable::unwrap))
    }

    /**
     * @param thingGroupProperties Thing group properties.
     */
    override
        fun thingGroupProperties(thingGroupProperties: CfnThingGroup.ThingGroupPropertiesProperty) {
      cdkBuilder.thingGroupProperties(thingGroupProperties.let(CfnThingGroup.ThingGroupPropertiesProperty::unwrap))
    }

    /**
     * @param thingGroupProperties Thing group properties.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d506a3d8a97afb1cd5d22aab923f73c77809e9406cd060c2a9ff4a4b79cfeadf")
    override
        fun thingGroupProperties(thingGroupProperties: CfnThingGroup.ThingGroupPropertiesProperty.Builder.() -> Unit):
        Unit =
        thingGroupProperties(CfnThingGroup.ThingGroupPropertiesProperty(thingGroupProperties))

    public fun build(): software.amazon.awscdk.services.iot.CfnThingGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnThingGroupProps,
  ) : CdkObject(cdkObject), CfnThingGroupProps {
    /**
     * The parent thing group name.
     *
     * A Dynamic Thing Group does not have `parentGroupName` defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-parentgroupname)
     */
    override fun parentGroupName(): String? = unwrap(this).getParentGroupName()

    /**
     * The dynamic thing group search query string.
     *
     * The `queryString` attribute *is* required for `CreateDynamicThingGroup` . The `queryString`
     * attribute *is not* required for `CreateThingGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-querystring)
     */
    override fun queryString(): String? = unwrap(this).getQueryString()

    /**
     * Metadata which can be used to manage the thing group or dynamic thing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The thing group name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-thinggroupname)
     */
    override fun thingGroupName(): String? = unwrap(this).getThingGroupName()

    /**
     * Thing group properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-thinggroupproperties)
     */
    override fun thingGroupProperties(): Any? = unwrap(this).getThingGroupProperties()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnThingGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingGroupProps):
        CfnThingGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnThingGroupProps):
        software.amazon.awscdk.services.iot.CfnThingGroupProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iot.CfnThingGroupProps
  }
}
