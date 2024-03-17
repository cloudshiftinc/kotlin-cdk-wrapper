@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnHoursOfOperation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnHoursOfOperationProps cfnHoursOfOperationProps = CfnHoursOfOperationProps.builder()
 * .config(List.of(HoursOfOperationConfigProperty.builder()
 * .day("day")
 * .endTime(HoursOfOperationTimeSliceProperty.builder()
 * .hours(123)
 * .minutes(123)
 * .build())
 * .startTime(HoursOfOperationTimeSliceProperty.builder()
 * .hours(123)
 * .minutes(123)
 * .build())
 * .build()))
 * .instanceArn("instanceArn")
 * .name("name")
 * .timeZone("timeZone")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html)
 */
public interface CfnHoursOfOperationProps {
  /**
   * Configuration information for the hours of operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-config)
   */
  public fun config(): Any

  /**
   * The description for the hours of operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon Resource Name (ARN) of the instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-instancearn)
   */
  public fun instanceArn(): String

  /**
   * The name for the hours of operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-name)
   */
  public fun name(): String

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The time zone for the hours of operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-timezone)
   */
  public fun timeZone(): String

  /**
   * A builder for [CfnHoursOfOperationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param config Configuration information for the hours of operation. 
     */
    public fun config(config: IResolvable)

    /**
     * @param config Configuration information for the hours of operation. 
     */
    public fun config(config: List<Any>)

    /**
     * @param config Configuration information for the hours of operation. 
     */
    public fun config(vararg config: Any)

    /**
     * @param description The description for the hours of operation.
     */
    public fun description(description: String)

    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * @param name The name for the hours of operation. 
     */
    public fun name(name: String)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param timeZone The time zone for the hours of operation. 
     */
    public fun timeZone(timeZone: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnHoursOfOperationProps.Builder
        = software.amazon.awscdk.services.connect.CfnHoursOfOperationProps.builder()

    /**
     * @param config Configuration information for the hours of operation. 
     */
    override fun config(config: IResolvable) {
      cdkBuilder.config(config.let(IResolvable::unwrap))
    }

    /**
     * @param config Configuration information for the hours of operation. 
     */
    override fun config(config: List<Any>) {
      cdkBuilder.config(config)
    }

    /**
     * @param config Configuration information for the hours of operation. 
     */
    override fun config(vararg config: Any): Unit = config(config.toList())

    /**
     * @param description The description for the hours of operation.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param name The name for the hours of operation. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param timeZone The time zone for the hours of operation. 
     */
    override fun timeZone(timeZone: String) {
      cdkBuilder.timeZone(timeZone)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnHoursOfOperationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnHoursOfOperationProps,
  ) : CdkObject(cdkObject), CfnHoursOfOperationProps {
    /**
     * Configuration information for the hours of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-config)
     */
    override fun config(): Any = unwrap(this).getConfig()

    /**
     * The description for the hours of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-instancearn)
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /**
     * The name for the hours of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The time zone for the hours of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-timezone)
     */
    override fun timeZone(): String = unwrap(this).getTimeZone()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHoursOfOperationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnHoursOfOperationProps):
        CfnHoursOfOperationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnHoursOfOperationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHoursOfOperationProps):
        software.amazon.awscdk.services.connect.CfnHoursOfOperationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnHoursOfOperationProps
  }
}
