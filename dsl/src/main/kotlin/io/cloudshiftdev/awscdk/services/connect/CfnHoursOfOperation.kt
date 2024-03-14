package io.cloudshiftdev.awscdk.services.connect

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
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnHoursOfOperation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.connect.CfnHoursOfOperation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
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
    unwrap(this).setConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration information for the hours of operation.
   */
  public open fun config(__idx_ac66f0: List<Any>) {
    unwrap(this).setConfig(__idx_ac66f0)
  }

  /**
   * Configuration information for the hours of operation.
   */
  public open fun config(vararg __idx_ac66f0: Any): Unit = config(__idx_ac66f0.toList())

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
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
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
      cdkBuilder.config(config.let(IResolvable::unwrap))
    }

    /**
     * Configuration information for the hours of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html#cfn-connect-hoursofoperation-config)
     * @param config Configuration information for the hours of operation. 
     */
    override fun config(config: List<Any>) {
      cdkBuilder.config(config)
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
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
        software.amazon.awscdk.services.connect.CfnHoursOfOperation = wrapped.cdkObject
  }

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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
        cdkBuilder.endTime(endTime.let(IResolvable::unwrap))
      }

      /**
       * @param endTime The end time that your contact center closes. 
       */
      override fun endTime(endTime: HoursOfOperationTimeSliceProperty) {
        cdkBuilder.endTime(endTime.let(HoursOfOperationTimeSliceProperty::unwrap))
      }

      /**
       * @param endTime The end time that your contact center closes. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b50e3243710ac7cd6e8858424d416e55fc4756b443deec1dccadd3c93e4e2ab3")
      override fun endTime(endTime: HoursOfOperationTimeSliceProperty.Builder.() -> Unit): Unit =
          endTime(HoursOfOperationTimeSliceProperty(endTime))

      /**
       * @param startTime The start time that your contact center opens. 
       */
      override fun startTime(startTime: IResolvable) {
        cdkBuilder.startTime(startTime.let(IResolvable::unwrap))
      }

      /**
       * @param startTime The start time that your contact center opens. 
       */
      override fun startTime(startTime: HoursOfOperationTimeSliceProperty) {
        cdkBuilder.startTime(startTime.let(HoursOfOperationTimeSliceProperty::unwrap))
      }

      /**
       * @param startTime The start time that your contact center opens. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a29920f575c0d8cfb256bcf19483713c3a030a2684921b9da9e57c536e25fb6")
      override fun startTime(startTime: HoursOfOperationTimeSliceProperty.Builder.() -> Unit): Unit
          = startTime(HoursOfOperationTimeSliceProperty(startTime))

      public fun build():
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationConfigProperty,
    ) : CdkObject(cdkObject), HoursOfOperationConfigProperty {
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
          HoursOfOperationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HoursOfOperationConfigProperty):
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationConfigProperty
    }
  }

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
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty,
    ) : CdkObject(cdkObject), HoursOfOperationTimeSliceProperty {
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
          HoursOfOperationTimeSliceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HoursOfOperationTimeSliceProperty):
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty
    }
  }
}
