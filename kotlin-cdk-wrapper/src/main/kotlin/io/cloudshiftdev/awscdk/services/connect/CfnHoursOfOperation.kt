@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies hours of operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnHoursOfOperation cfnHoursOfOperation = CfnHoursOfOperation.Builder.create(this,
 * "MyCfnHoursOfOperation")
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
 * .hoursOfOperationOverrides(List.of(HoursOfOperationOverrideProperty.builder()
 * .effectiveFrom("effectiveFrom")
 * .effectiveTill("effectiveTill")
 * .overrideConfig(List.of(HoursOfOperationOverrideConfigProperty.builder()
 * .day("day")
 * .endTime(OverrideTimeSliceProperty.builder()
 * .hours(123)
 * .minutes(123)
 * .build())
 * .startTime(OverrideTimeSliceProperty.builder()
 * .hours(123)
 * .minutes(123)
 * .build())
 * .build()))
 * .overrideName("overrideName")
 * // the properties below are optional
 * .hoursOfOperationOverrideId("hoursOfOperationOverrideId")
 * .overrideDescription("overrideDescription")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html)
 */
public open class CfnHoursOfOperation(
  cdkObject: software.amazon.awscdk.services.connect.CfnHoursOfOperation,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnHoursOfOperationProps,
  ) :
      this(software.amazon.awscdk.services.connect.CfnHoursOfOperation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnHoursOfOperationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnHoursOfOperationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnHoursOfOperationProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the hours of operation.
   */
  public open fun attrHoursOfOperationArn(): String = unwrap(this).getAttrHoursOfOperationArn()

  /**
   * Configuration information for the hours of operation.
   */
  public open fun config(): Any = unwrap(this).getConfig()

  /**
   * Configuration information for the hours of operation.
   */
  public open fun config(`value`: IResolvable) {
    unwrap(this).setConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Configuration information for the hours of operation.
   */
  public open fun config(`value`: List<Any>) {
    unwrap(this).setConfig(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Configuration information for the hours of operation.
   */
  public open fun config(vararg `value`: Any): Unit = config(`value`.toList())

  /**
   * The description for the hours of operation.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description for the hours of operation.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * One or more hours of operation overrides assigned to an hour of operation.
   */
  public open fun hoursOfOperationOverrides(): Any? = unwrap(this).getHoursOfOperationOverrides()

  /**
   * One or more hours of operation overrides assigned to an hour of operation.
   */
  public open fun hoursOfOperationOverrides(`value`: IResolvable) {
    unwrap(this).setHoursOfOperationOverrides(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * One or more hours of operation overrides assigned to an hour of operation.
   */
  public open fun hoursOfOperationOverrides(`value`: List<Any>) {
    unwrap(this).setHoursOfOperationOverrides(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * One or more hours of operation overrides assigned to an hour of operation.
   */
  public open fun hoursOfOperationOverrides(vararg `value`: Any): Unit =
      hoursOfOperationOverrides(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  /**
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  /**
   * The name for the hours of operation.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name for the hours of operation.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The time zone for the hours of operation.
   */
  public open fun timeZone(): String = unwrap(this).getTimeZone()

  /**
   * The time zone for the hours of operation.
   */
  public open fun timeZone(`value`: String) {
    unwrap(this).setTimeZone(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnHoursOfOperation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Configuration information for the hours of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-config)
     * @param config Configuration information for the hours of operation. 
     */
    public fun config(config: IResolvable)

    /**
     * Configuration information for the hours of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-config)
     * @param config Configuration information for the hours of operation. 
     */
    public fun config(config: List<Any>)

    /**
     * Configuration information for the hours of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-config)
     * @param config Configuration information for the hours of operation. 
     */
    public fun config(vararg config: Any)

    /**
     * The description for the hours of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-description)
     * @param description The description for the hours of operation. 
     */
    public fun description(description: String)

    /**
     * One or more hours of operation overrides assigned to an hour of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-hoursofoperationoverrides)
     * @param hoursOfOperationOverrides One or more hours of operation overrides assigned to an hour
     * of operation. 
     */
    public fun hoursOfOperationOverrides(hoursOfOperationOverrides: IResolvable)

    /**
     * One or more hours of operation overrides assigned to an hour of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-hoursofoperationoverrides)
     * @param hoursOfOperationOverrides One or more hours of operation overrides assigned to an hour
     * of operation. 
     */
    public fun hoursOfOperationOverrides(hoursOfOperationOverrides: List<Any>)

    /**
     * One or more hours of operation overrides assigned to an hour of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-hoursofoperationoverrides)
     * @param hoursOfOperationOverrides One or more hours of operation overrides assigned to an hour
     * of operation. 
     */
    public fun hoursOfOperationOverrides(vararg hoursOfOperationOverrides: Any)

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * The name for the hours of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-name)
     * @param name The name for the hours of operation. 
     */
    public fun name(name: String)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The time zone for the hours of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-timezone)
     * @param timeZone The time zone for the hours of operation. 
     */
    public fun timeZone(timeZone: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnHoursOfOperation.Builder =
        software.amazon.awscdk.services.connect.CfnHoursOfOperation.Builder.create(scope, id)

    /**
     * Configuration information for the hours of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-config)
     * @param config Configuration information for the hours of operation. 
     */
    override fun config(config: IResolvable) {
      cdkBuilder.config(config.let(IResolvable.Companion::unwrap))
    }

    /**
     * Configuration information for the hours of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-config)
     * @param config Configuration information for the hours of operation. 
     */
    override fun config(config: List<Any>) {
      cdkBuilder.config(config.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Configuration information for the hours of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-config)
     * @param config Configuration information for the hours of operation. 
     */
    override fun config(vararg config: Any): Unit = config(config.toList())

    /**
     * The description for the hours of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-description)
     * @param description The description for the hours of operation. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * One or more hours of operation overrides assigned to an hour of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-hoursofoperationoverrides)
     * @param hoursOfOperationOverrides One or more hours of operation overrides assigned to an hour
     * of operation. 
     */
    override fun hoursOfOperationOverrides(hoursOfOperationOverrides: IResolvable) {
      cdkBuilder.hoursOfOperationOverrides(hoursOfOperationOverrides.let(IResolvable.Companion::unwrap))
    }

    /**
     * One or more hours of operation overrides assigned to an hour of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-hoursofoperationoverrides)
     * @param hoursOfOperationOverrides One or more hours of operation overrides assigned to an hour
     * of operation. 
     */
    override fun hoursOfOperationOverrides(hoursOfOperationOverrides: List<Any>) {
      cdkBuilder.hoursOfOperationOverrides(hoursOfOperationOverrides.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * One or more hours of operation overrides assigned to an hour of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-hoursofoperationoverrides)
     * @param hoursOfOperationOverrides One or more hours of operation overrides assigned to an hour
     * of operation. 
     */
    override fun hoursOfOperationOverrides(vararg hoursOfOperationOverrides: Any): Unit =
        hoursOfOperationOverrides(hoursOfOperationOverrides.toList())

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The name for the hours of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-name)
     * @param name The name for the hours of operation. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The time zone for the hours of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-timezone)
     * @param timeZone The time zone for the hours of operation. 
     */
    override fun timeZone(timeZone: String) {
      cdkBuilder.timeZone(timeZone)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnHoursOfOperation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnHoursOfOperation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHoursOfOperation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHoursOfOperation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnHoursOfOperation):
        CfnHoursOfOperation = CfnHoursOfOperation(cdkObject)

    internal fun unwrap(wrapped: CfnHoursOfOperation):
        software.amazon.awscdk.services.connect.CfnHoursOfOperation = wrapped.cdkObject as
        software.amazon.awscdk.services.connect.CfnHoursOfOperation
  }

  /**
   * Contains information about the hours of operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * HoursOfOperationConfigProperty hoursOfOperationConfigProperty =
   * HoursOfOperationConfigProperty.builder()
   * .day("day")
   * .endTime(HoursOfOperationTimeSliceProperty.builder()
   * .hours(123)
   * .minutes(123)
   * .build())
   * .startTime(HoursOfOperationTimeSliceProperty.builder()
   * .hours(123)
   * .minutes(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationconfig.html)
   */
  public interface HoursOfOperationConfigProperty {
    /**
     * The day that the hours of operation applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationconfig.html#cfn-connect-hoursofoperation-hoursofoperationconfig-day)
     */
    public fun day(): String

    /**
     * The end time that your contact center closes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationconfig.html#cfn-connect-hoursofoperation-hoursofoperationconfig-endtime)
     */
    public fun endTime(): Any

    /**
     * The start time that your contact center opens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationconfig.html#cfn-connect-hoursofoperation-hoursofoperationconfig-starttime)
     */
    public fun startTime(): Any

    /**
     * A builder for [HoursOfOperationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param day The day that the hours of operation applies to. 
       */
      public fun day(day: String)

      /**
       * @param endTime The end time that your contact center closes. 
       */
      public fun endTime(endTime: IResolvable)

      /**
       * @param endTime The end time that your contact center closes. 
       */
      public fun endTime(endTime: HoursOfOperationTimeSliceProperty)

      /**
       * @param endTime The end time that your contact center closes. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b50e3243710ac7cd6e8858424d416e55fc4756b443deec1dccadd3c93e4e2ab3")
      public fun endTime(endTime: HoursOfOperationTimeSliceProperty.Builder.() -> Unit)

      /**
       * @param startTime The start time that your contact center opens. 
       */
      public fun startTime(startTime: IResolvable)

      /**
       * @param startTime The start time that your contact center opens. 
       */
      public fun startTime(startTime: HoursOfOperationTimeSliceProperty)

      /**
       * @param startTime The start time that your contact center opens. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a29920f575c0d8cfb256bcf19483713c3a030a2684921b9da9e57c536e25fb6")
      public fun startTime(startTime: HoursOfOperationTimeSliceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationConfigProperty.builder()

      /**
       * @param day The day that the hours of operation applies to. 
       */
      override fun day(day: String) {
        cdkBuilder.day(day)
      }

      /**
       * @param endTime The end time that your contact center closes. 
       */
      override fun endTime(endTime: IResolvable) {
        cdkBuilder.endTime(endTime.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param endTime The end time that your contact center closes. 
       */
      override fun endTime(endTime: HoursOfOperationTimeSliceProperty) {
        cdkBuilder.endTime(endTime.let(HoursOfOperationTimeSliceProperty.Companion::unwrap))
      }

      /**
       * @param endTime The end time that your contact center closes. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b50e3243710ac7cd6e8858424d416e55fc4756b443deec1dccadd3c93e4e2ab3")
      override fun endTime(endTime: HoursOfOperationTimeSliceProperty.Builder.() -> Unit): Unit =
          endTime(HoursOfOperationTimeSliceProperty(endTime))

      /**
       * @param startTime The start time that your contact center opens. 
       */
      override fun startTime(startTime: IResolvable) {
        cdkBuilder.startTime(startTime.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param startTime The start time that your contact center opens. 
       */
      override fun startTime(startTime: HoursOfOperationTimeSliceProperty) {
        cdkBuilder.startTime(startTime.let(HoursOfOperationTimeSliceProperty.Companion::unwrap))
      }

      /**
       * @param startTime The start time that your contact center opens. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a29920f575c0d8cfb256bcf19483713c3a030a2684921b9da9e57c536e25fb6")
      override fun startTime(startTime: HoursOfOperationTimeSliceProperty.Builder.() -> Unit): Unit
          = startTime(HoursOfOperationTimeSliceProperty(startTime))

      public fun build():
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationConfigProperty,
    ) : CdkObject(cdkObject),
        HoursOfOperationConfigProperty {
      /**
       * The day that the hours of operation applies to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationconfig.html#cfn-connect-hoursofoperation-hoursofoperationconfig-day)
       */
      override fun day(): String = unwrap(this).getDay()

      /**
       * The end time that your contact center closes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationconfig.html#cfn-connect-hoursofoperation-hoursofoperationconfig-endtime)
       */
      override fun endTime(): Any = unwrap(this).getEndTime()

      /**
       * The start time that your contact center opens.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationconfig.html#cfn-connect-hoursofoperation-hoursofoperationconfig-starttime)
       */
      override fun startTime(): Any = unwrap(this).getStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HoursOfOperationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationConfigProperty):
          HoursOfOperationConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HoursOfOperationConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HoursOfOperationConfigProperty):
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationConfigProperty
    }
  }

  /**
   * Information about the hours of operation override config: day, start time, and end time.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * HoursOfOperationOverrideConfigProperty hoursOfOperationOverrideConfigProperty =
   * HoursOfOperationOverrideConfigProperty.builder()
   * .day("day")
   * .endTime(OverrideTimeSliceProperty.builder()
   * .hours(123)
   * .minutes(123)
   * .build())
   * .startTime(OverrideTimeSliceProperty.builder()
   * .hours(123)
   * .minutes(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationoverrideconfig.html)
   */
  public interface HoursOfOperationOverrideConfigProperty {
    /**
     * The day that the hours of operation override applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationoverrideconfig.html#cfn-connect-hoursofoperation-hoursofoperationoverrideconfig-day)
     */
    public fun day(): String

    /**
     * The end time that your contact center closes if overrides are applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationoverrideconfig.html#cfn-connect-hoursofoperation-hoursofoperationoverrideconfig-endtime)
     */
    public fun endTime(): Any

    /**
     * The start time when your contact center opens if overrides are applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationoverrideconfig.html#cfn-connect-hoursofoperation-hoursofoperationoverrideconfig-starttime)
     */
    public fun startTime(): Any

    /**
     * A builder for [HoursOfOperationOverrideConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param day The day that the hours of operation override applies to. 
       */
      public fun day(day: String)

      /**
       * @param endTime The end time that your contact center closes if overrides are applied. 
       */
      public fun endTime(endTime: IResolvable)

      /**
       * @param endTime The end time that your contact center closes if overrides are applied. 
       */
      public fun endTime(endTime: OverrideTimeSliceProperty)

      /**
       * @param endTime The end time that your contact center closes if overrides are applied. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24090d47896334564f65e788bd5db72825a46e8438cbbced4de30203a73db964")
      public fun endTime(endTime: OverrideTimeSliceProperty.Builder.() -> Unit)

      /**
       * @param startTime The start time when your contact center opens if overrides are applied. 
       */
      public fun startTime(startTime: IResolvable)

      /**
       * @param startTime The start time when your contact center opens if overrides are applied. 
       */
      public fun startTime(startTime: OverrideTimeSliceProperty)

      /**
       * @param startTime The start time when your contact center opens if overrides are applied. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a53be39462dabc179e9e25f7570e7c6c9c0c44be2fec0f7229fbf6e15122b17")
      public fun startTime(startTime: OverrideTimeSliceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationOverrideConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationOverrideConfigProperty.builder()

      /**
       * @param day The day that the hours of operation override applies to. 
       */
      override fun day(day: String) {
        cdkBuilder.day(day)
      }

      /**
       * @param endTime The end time that your contact center closes if overrides are applied. 
       */
      override fun endTime(endTime: IResolvable) {
        cdkBuilder.endTime(endTime.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param endTime The end time that your contact center closes if overrides are applied. 
       */
      override fun endTime(endTime: OverrideTimeSliceProperty) {
        cdkBuilder.endTime(endTime.let(OverrideTimeSliceProperty.Companion::unwrap))
      }

      /**
       * @param endTime The end time that your contact center closes if overrides are applied. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24090d47896334564f65e788bd5db72825a46e8438cbbced4de30203a73db964")
      override fun endTime(endTime: OverrideTimeSliceProperty.Builder.() -> Unit): Unit =
          endTime(OverrideTimeSliceProperty(endTime))

      /**
       * @param startTime The start time when your contact center opens if overrides are applied. 
       */
      override fun startTime(startTime: IResolvable) {
        cdkBuilder.startTime(startTime.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param startTime The start time when your contact center opens if overrides are applied. 
       */
      override fun startTime(startTime: OverrideTimeSliceProperty) {
        cdkBuilder.startTime(startTime.let(OverrideTimeSliceProperty.Companion::unwrap))
      }

      /**
       * @param startTime The start time when your contact center opens if overrides are applied. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a53be39462dabc179e9e25f7570e7c6c9c0c44be2fec0f7229fbf6e15122b17")
      override fun startTime(startTime: OverrideTimeSliceProperty.Builder.() -> Unit): Unit =
          startTime(OverrideTimeSliceProperty(startTime))

      public fun build():
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationOverrideConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationOverrideConfigProperty,
    ) : CdkObject(cdkObject),
        HoursOfOperationOverrideConfigProperty {
      /**
       * The day that the hours of operation override applies to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationoverrideconfig.html#cfn-connect-hoursofoperation-hoursofoperationoverrideconfig-day)
       */
      override fun day(): String = unwrap(this).getDay()

      /**
       * The end time that your contact center closes if overrides are applied.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationoverrideconfig.html#cfn-connect-hoursofoperation-hoursofoperationoverrideconfig-endtime)
       */
      override fun endTime(): Any = unwrap(this).getEndTime()

      /**
       * The start time when your contact center opens if overrides are applied.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationoverrideconfig.html#cfn-connect-hoursofoperation-hoursofoperationoverrideconfig-starttime)
       */
      override fun startTime(): Any = unwrap(this).getStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          HoursOfOperationOverrideConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationOverrideConfigProperty):
          HoursOfOperationOverrideConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HoursOfOperationOverrideConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HoursOfOperationOverrideConfigProperty):
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationOverrideConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationOverrideConfigProperty
    }
  }

  /**
   * Information about the hours of operations override.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * HoursOfOperationOverrideProperty hoursOfOperationOverrideProperty =
   * HoursOfOperationOverrideProperty.builder()
   * .effectiveFrom("effectiveFrom")
   * .effectiveTill("effectiveTill")
   * .overrideConfig(List.of(HoursOfOperationOverrideConfigProperty.builder()
   * .day("day")
   * .endTime(OverrideTimeSliceProperty.builder()
   * .hours(123)
   * .minutes(123)
   * .build())
   * .startTime(OverrideTimeSliceProperty.builder()
   * .hours(123)
   * .minutes(123)
   * .build())
   * .build()))
   * .overrideName("overrideName")
   * // the properties below are optional
   * .hoursOfOperationOverrideId("hoursOfOperationOverrideId")
   * .overrideDescription("overrideDescription")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationoverride.html)
   */
  public interface HoursOfOperationOverrideProperty {
    /**
     * The date from which the hours of operation override would be effective.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationoverride.html#cfn-connect-hoursofoperation-hoursofoperationoverride-effectivefrom)
     */
    public fun effectiveFrom(): String

    /**
     * The date till which the hours of operation override would be effective.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationoverride.html#cfn-connect-hoursofoperation-hoursofoperationoverride-effectivetill)
     */
    public fun effectiveTill(): String

    /**
     * The identifier for the hours of operation override.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationoverride.html#cfn-connect-hoursofoperation-hoursofoperationoverride-hoursofoperationoverrideid)
     */
    public fun hoursOfOperationOverrideId(): String? = unwrap(this).getHoursOfOperationOverrideId()

    /**
     * Configuration information for the hours of operation override: day, start time, and end time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationoverride.html#cfn-connect-hoursofoperation-hoursofoperationoverride-overrideconfig)
     */
    public fun overrideConfig(): Any

    /**
     * The description of the hours of operation override.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationoverride.html#cfn-connect-hoursofoperation-hoursofoperationoverride-overridedescription)
     */
    public fun overrideDescription(): String? = unwrap(this).getOverrideDescription()

    /**
     * The name of the hours of operation override.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationoverride.html#cfn-connect-hoursofoperation-hoursofoperationoverride-overridename)
     */
    public fun overrideName(): String

    /**
     * A builder for [HoursOfOperationOverrideProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param effectiveFrom The date from which the hours of operation override would be
       * effective. 
       */
      public fun effectiveFrom(effectiveFrom: String)

      /**
       * @param effectiveTill The date till which the hours of operation override would be
       * effective. 
       */
      public fun effectiveTill(effectiveTill: String)

      /**
       * @param hoursOfOperationOverrideId The identifier for the hours of operation override.
       */
      public fun hoursOfOperationOverrideId(hoursOfOperationOverrideId: String)

      /**
       * @param overrideConfig Configuration information for the hours of operation override: day,
       * start time, and end time. 
       */
      public fun overrideConfig(overrideConfig: IResolvable)

      /**
       * @param overrideConfig Configuration information for the hours of operation override: day,
       * start time, and end time. 
       */
      public fun overrideConfig(overrideConfig: List<Any>)

      /**
       * @param overrideConfig Configuration information for the hours of operation override: day,
       * start time, and end time. 
       */
      public fun overrideConfig(vararg overrideConfig: Any)

      /**
       * @param overrideDescription The description of the hours of operation override.
       */
      public fun overrideDescription(overrideDescription: String)

      /**
       * @param overrideName The name of the hours of operation override. 
       */
      public fun overrideName(overrideName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationOverrideProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationOverrideProperty.builder()

      /**
       * @param effectiveFrom The date from which the hours of operation override would be
       * effective. 
       */
      override fun effectiveFrom(effectiveFrom: String) {
        cdkBuilder.effectiveFrom(effectiveFrom)
      }

      /**
       * @param effectiveTill The date till which the hours of operation override would be
       * effective. 
       */
      override fun effectiveTill(effectiveTill: String) {
        cdkBuilder.effectiveTill(effectiveTill)
      }

      /**
       * @param hoursOfOperationOverrideId The identifier for the hours of operation override.
       */
      override fun hoursOfOperationOverrideId(hoursOfOperationOverrideId: String) {
        cdkBuilder.hoursOfOperationOverrideId(hoursOfOperationOverrideId)
      }

      /**
       * @param overrideConfig Configuration information for the hours of operation override: day,
       * start time, and end time. 
       */
      override fun overrideConfig(overrideConfig: IResolvable) {
        cdkBuilder.overrideConfig(overrideConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param overrideConfig Configuration information for the hours of operation override: day,
       * start time, and end time. 
       */
      override fun overrideConfig(overrideConfig: List<Any>) {
        cdkBuilder.overrideConfig(overrideConfig.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param overrideConfig Configuration information for the hours of operation override: day,
       * start time, and end time. 
       */
      override fun overrideConfig(vararg overrideConfig: Any): Unit =
          overrideConfig(overrideConfig.toList())

      /**
       * @param overrideDescription The description of the hours of operation override.
       */
      override fun overrideDescription(overrideDescription: String) {
        cdkBuilder.overrideDescription(overrideDescription)
      }

      /**
       * @param overrideName The name of the hours of operation override. 
       */
      override fun overrideName(overrideName: String) {
        cdkBuilder.overrideName(overrideName)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationOverrideProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationOverrideProperty,
    ) : CdkObject(cdkObject),
        HoursOfOperationOverrideProperty {
      /**
       * The date from which the hours of operation override would be effective.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationoverride.html#cfn-connect-hoursofoperation-hoursofoperationoverride-effectivefrom)
       */
      override fun effectiveFrom(): String = unwrap(this).getEffectiveFrom()

      /**
       * The date till which the hours of operation override would be effective.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationoverride.html#cfn-connect-hoursofoperation-hoursofoperationoverride-effectivetill)
       */
      override fun effectiveTill(): String = unwrap(this).getEffectiveTill()

      /**
       * The identifier for the hours of operation override.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationoverride.html#cfn-connect-hoursofoperation-hoursofoperationoverride-hoursofoperationoverrideid)
       */
      override fun hoursOfOperationOverrideId(): String? =
          unwrap(this).getHoursOfOperationOverrideId()

      /**
       * Configuration information for the hours of operation override: day, start time, and end
       * time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationoverride.html#cfn-connect-hoursofoperation-hoursofoperationoverride-overrideconfig)
       */
      override fun overrideConfig(): Any = unwrap(this).getOverrideConfig()

      /**
       * The description of the hours of operation override.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationoverride.html#cfn-connect-hoursofoperation-hoursofoperationoverride-overridedescription)
       */
      override fun overrideDescription(): String? = unwrap(this).getOverrideDescription()

      /**
       * The name of the hours of operation override.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationoverride.html#cfn-connect-hoursofoperation-hoursofoperationoverride-overridename)
       */
      override fun overrideName(): String = unwrap(this).getOverrideName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HoursOfOperationOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationOverrideProperty):
          HoursOfOperationOverrideProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HoursOfOperationOverrideProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HoursOfOperationOverrideProperty):
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationOverrideProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationOverrideProperty
    }
  }

  /**
   * The start time or end time for an hours of operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * HoursOfOperationTimeSliceProperty hoursOfOperationTimeSliceProperty =
   * HoursOfOperationTimeSliceProperty.builder()
   * .hours(123)
   * .minutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationtimeslice.html)
   */
  public interface HoursOfOperationTimeSliceProperty {
    /**
     * The hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationtimeslice.html#cfn-connect-hoursofoperation-hoursofoperationtimeslice-hours)
     */
    public fun hours(): Number

    /**
     * The minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationtimeslice.html#cfn-connect-hoursofoperation-hoursofoperationtimeslice-minutes)
     */
    public fun minutes(): Number

    /**
     * A builder for [HoursOfOperationTimeSliceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hours The hours. 
       */
      public fun hours(hours: Number)

      /**
       * @param minutes The minutes. 
       */
      public fun minutes(minutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty.builder()

      /**
       * @param hours The hours. 
       */
      override fun hours(hours: Number) {
        cdkBuilder.hours(hours)
      }

      /**
       * @param minutes The minutes. 
       */
      override fun minutes(minutes: Number) {
        cdkBuilder.minutes(minutes)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty,
    ) : CdkObject(cdkObject),
        HoursOfOperationTimeSliceProperty {
      /**
       * The hours.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationtimeslice.html#cfn-connect-hoursofoperation-hoursofoperationtimeslice-hours)
       */
      override fun hours(): Number = unwrap(this).getHours()

      /**
       * The minutes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationtimeslice.html#cfn-connect-hoursofoperation-hoursofoperationtimeslice-minutes)
       */
      override fun minutes(): Number = unwrap(this).getMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          HoursOfOperationTimeSliceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty):
          HoursOfOperationTimeSliceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HoursOfOperationTimeSliceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HoursOfOperationTimeSliceProperty):
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty
    }
  }

  /**
   * The start time or end time for an hours of operation override.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * OverrideTimeSliceProperty overrideTimeSliceProperty = OverrideTimeSliceProperty.builder()
   * .hours(123)
   * .minutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-overridetimeslice.html)
   */
  public interface OverrideTimeSliceProperty {
    /**
     * The hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-overridetimeslice.html#cfn-connect-hoursofoperation-overridetimeslice-hours)
     */
    public fun hours(): Number

    /**
     * The minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-overridetimeslice.html#cfn-connect-hoursofoperation-overridetimeslice-minutes)
     */
    public fun minutes(): Number

    /**
     * A builder for [OverrideTimeSliceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hours The hours. 
       */
      public fun hours(hours: Number)

      /**
       * @param minutes The minutes. 
       */
      public fun minutes(minutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.OverrideTimeSliceProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.OverrideTimeSliceProperty.builder()

      /**
       * @param hours The hours. 
       */
      override fun hours(hours: Number) {
        cdkBuilder.hours(hours)
      }

      /**
       * @param minutes The minutes. 
       */
      override fun minutes(minutes: Number) {
        cdkBuilder.minutes(minutes)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.OverrideTimeSliceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnHoursOfOperation.OverrideTimeSliceProperty,
    ) : CdkObject(cdkObject),
        OverrideTimeSliceProperty {
      /**
       * The hours.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-overridetimeslice.html#cfn-connect-hoursofoperation-overridetimeslice-hours)
       */
      override fun hours(): Number = unwrap(this).getHours()

      /**
       * The minutes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-overridetimeslice.html#cfn-connect-hoursofoperation-overridetimeslice-minutes)
       */
      override fun minutes(): Number = unwrap(this).getMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OverrideTimeSliceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnHoursOfOperation.OverrideTimeSliceProperty):
          OverrideTimeSliceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OverrideTimeSliceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OverrideTimeSliceProperty):
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.OverrideTimeSliceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.OverrideTimeSliceProperty
    }
  }
}
