@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a refresh schedule for a dataset in Amazon QuickSight .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.quicksight.*;
 * CfnRefreshSchedule cfnRefreshSchedule = CfnRefreshSchedule.Builder.create(this,
 * "MyCfnRefreshSchedule")
 * .awsAccountId("awsAccountId")
 * .dataSetId("dataSetId")
 * .schedule(RefreshScheduleMapProperty.builder()
 * .refreshType("refreshType")
 * .scheduleFrequency(ScheduleFrequencyProperty.builder()
 * .interval("interval")
 * .refreshOnDay(RefreshOnDayProperty.builder()
 * .dayOfMonth("dayOfMonth")
 * .dayOfWeek("dayOfWeek")
 * .build())
 * .timeOfTheDay("timeOfTheDay")
 * .timeZone("timeZone")
 * .build())
 * .scheduleId("scheduleId")
 * .startAfterDateTime("startAfterDateTime")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html)
 */
public open class CfnRefreshSchedule(
  cdkObject: software.amazon.awscdk.services.quicksight.CfnRefreshSchedule,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.quicksight.CfnRefreshSchedule(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRefreshScheduleProps,
  ) :
      this(software.amazon.awscdk.services.quicksight.CfnRefreshSchedule(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnRefreshScheduleProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRefreshScheduleProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRefreshScheduleProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) for the refresh schedule.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The AWS account ID of the account that you are creating a schedule in.
   */
  public open fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  /**
   * The AWS account ID of the account that you are creating a schedule in.
   */
  public open fun awsAccountId(`value`: String) {
    unwrap(this).setAwsAccountId(`value`)
  }

  /**
   * The ID of the dataset that you are creating a refresh schedule for.
   */
  public open fun dataSetId(): String? = unwrap(this).getDataSetId()

  /**
   * The ID of the dataset that you are creating a refresh schedule for.
   */
  public open fun dataSetId(`value`: String) {
    unwrap(this).setDataSetId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The refresh schedule of a dataset.
   */
  public open fun schedule(): Any? = unwrap(this).getSchedule()

  /**
   * The refresh schedule of a dataset.
   */
  public open fun schedule(`value`: IResolvable) {
    unwrap(this).setSchedule(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The refresh schedule of a dataset.
   */
  public open fun schedule(`value`: RefreshScheduleMapProperty) {
    unwrap(this).setSchedule(`value`.let(RefreshScheduleMapProperty.Companion::unwrap))
  }

  /**
   * The refresh schedule of a dataset.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f0893aa94db9f987bd05ebf9223c4225ddc9d57ff94c462efa5a31ae8ae88d70")
  public open fun schedule(`value`: RefreshScheduleMapProperty.Builder.() -> Unit): Unit =
      schedule(RefreshScheduleMapProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.quicksight.CfnRefreshSchedule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS account ID of the account that you are creating a schedule in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html#cfn-quicksight-refreshschedule-awsaccountid)
     * @param awsAccountId The AWS account ID of the account that you are creating a schedule in. 
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * The ID of the dataset that you are creating a refresh schedule for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html#cfn-quicksight-refreshschedule-datasetid)
     * @param dataSetId The ID of the dataset that you are creating a refresh schedule for. 
     */
    public fun dataSetId(dataSetId: String)

    /**
     * The refresh schedule of a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html#cfn-quicksight-refreshschedule-schedule)
     * @param schedule The refresh schedule of a dataset. 
     */
    public fun schedule(schedule: IResolvable)

    /**
     * The refresh schedule of a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html#cfn-quicksight-refreshschedule-schedule)
     * @param schedule The refresh schedule of a dataset. 
     */
    public fun schedule(schedule: RefreshScheduleMapProperty)

    /**
     * The refresh schedule of a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html#cfn-quicksight-refreshschedule-schedule)
     * @param schedule The refresh schedule of a dataset. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52e693c9de60b1b324b06a83450970e99c0a671b7ca88308bc21570e1c0e3734")
    public fun schedule(schedule: RefreshScheduleMapProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.Builder =
        software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.Builder.create(scope, id)

    /**
     * The AWS account ID of the account that you are creating a schedule in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html#cfn-quicksight-refreshschedule-awsaccountid)
     * @param awsAccountId The AWS account ID of the account that you are creating a schedule in. 
     */
    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * The ID of the dataset that you are creating a refresh schedule for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html#cfn-quicksight-refreshschedule-datasetid)
     * @param dataSetId The ID of the dataset that you are creating a refresh schedule for. 
     */
    override fun dataSetId(dataSetId: String) {
      cdkBuilder.dataSetId(dataSetId)
    }

    /**
     * The refresh schedule of a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html#cfn-quicksight-refreshschedule-schedule)
     * @param schedule The refresh schedule of a dataset. 
     */
    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable.Companion::unwrap))
    }

    /**
     * The refresh schedule of a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html#cfn-quicksight-refreshschedule-schedule)
     * @param schedule The refresh schedule of a dataset. 
     */
    override fun schedule(schedule: RefreshScheduleMapProperty) {
      cdkBuilder.schedule(schedule.let(RefreshScheduleMapProperty.Companion::unwrap))
    }

    /**
     * The refresh schedule of a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html#cfn-quicksight-refreshschedule-schedule)
     * @param schedule The refresh schedule of a dataset. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52e693c9de60b1b324b06a83450970e99c0a671b7ca88308bc21570e1c0e3734")
    override fun schedule(schedule: RefreshScheduleMapProperty.Builder.() -> Unit): Unit =
        schedule(RefreshScheduleMapProperty(schedule))

    public fun build(): software.amazon.awscdk.services.quicksight.CfnRefreshSchedule =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRefreshSchedule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRefreshSchedule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnRefreshSchedule):
        CfnRefreshSchedule = CfnRefreshSchedule(cdkObject)

    internal fun unwrap(wrapped: CfnRefreshSchedule):
        software.amazon.awscdk.services.quicksight.CfnRefreshSchedule = wrapped.cdkObject as
        software.amazon.awscdk.services.quicksight.CfnRefreshSchedule
  }

  /**
   * The day that you want yout dataset to refresh.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * RefreshOnDayProperty refreshOnDayProperty = RefreshOnDayProperty.builder()
   * .dayOfMonth("dayOfMonth")
   * .dayOfWeek("dayOfWeek")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-refreshonday.html)
   */
  public interface RefreshOnDayProperty {
    /**
     * The day of the month that you want your dataset to refresh.
     *
     * This value is required for monthly refresh intervals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-refreshonday.html#cfn-quicksight-refreshschedule-refreshonday-dayofmonth)
     */
    public fun dayOfMonth(): String? = unwrap(this).getDayOfMonth()

    /**
     * The day of the week that you want to schedule the refresh on.
     *
     * This value is required for weekly and monthly refresh intervals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-refreshonday.html#cfn-quicksight-refreshschedule-refreshonday-dayofweek)
     */
    public fun dayOfWeek(): String? = unwrap(this).getDayOfWeek()

    /**
     * A builder for [RefreshOnDayProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dayOfMonth The day of the month that you want your dataset to refresh.
       * This value is required for monthly refresh intervals.
       */
      public fun dayOfMonth(dayOfMonth: String)

      /**
       * @param dayOfWeek The day of the week that you want to schedule the refresh on.
       * This value is required for weekly and monthly refresh intervals.
       */
      public fun dayOfWeek(dayOfWeek: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshOnDayProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshOnDayProperty.builder()

      /**
       * @param dayOfMonth The day of the month that you want your dataset to refresh.
       * This value is required for monthly refresh intervals.
       */
      override fun dayOfMonth(dayOfMonth: String) {
        cdkBuilder.dayOfMonth(dayOfMonth)
      }

      /**
       * @param dayOfWeek The day of the week that you want to schedule the refresh on.
       * This value is required for weekly and monthly refresh intervals.
       */
      override fun dayOfWeek(dayOfWeek: String) {
        cdkBuilder.dayOfWeek(dayOfWeek)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshOnDayProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshOnDayProperty,
    ) : CdkObject(cdkObject),
        RefreshOnDayProperty {
      /**
       * The day of the month that you want your dataset to refresh.
       *
       * This value is required for monthly refresh intervals.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-refreshonday.html#cfn-quicksight-refreshschedule-refreshonday-dayofmonth)
       */
      override fun dayOfMonth(): String? = unwrap(this).getDayOfMonth()

      /**
       * The day of the week that you want to schedule the refresh on.
       *
       * This value is required for weekly and monthly refresh intervals.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-refreshonday.html#cfn-quicksight-refreshschedule-refreshonday-dayofweek)
       */
      override fun dayOfWeek(): String? = unwrap(this).getDayOfWeek()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RefreshOnDayProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshOnDayProperty):
          RefreshOnDayProperty = CdkObjectWrappers.wrap(cdkObject) as? RefreshOnDayProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RefreshOnDayProperty):
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshOnDayProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshOnDayProperty
    }
  }

  /**
   * A summary of a configured refresh schedule for a dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * RefreshScheduleMapProperty refreshScheduleMapProperty = RefreshScheduleMapProperty.builder()
   * .refreshType("refreshType")
   * .scheduleFrequency(ScheduleFrequencyProperty.builder()
   * .interval("interval")
   * .refreshOnDay(RefreshOnDayProperty.builder()
   * .dayOfMonth("dayOfMonth")
   * .dayOfWeek("dayOfWeek")
   * .build())
   * .timeOfTheDay("timeOfTheDay")
   * .timeZone("timeZone")
   * .build())
   * .scheduleId("scheduleId")
   * .startAfterDateTime("startAfterDateTime")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-refreshschedulemap.html)
   */
  public interface RefreshScheduleMapProperty {
    /**
     * The type of refresh that a dataset undergoes. Valid values are as follows:.
     *
     * * `FULL_REFRESH` : A complete refresh of a dataset.
     * * `INCREMENTAL_REFRESH` : A partial refresh of some rows of a dataset, based on the time
     * window specified.
     *
     * For more information on full and incremental refreshes, see [Refreshing SPICE
     * data](https://docs.aws.amazon.com/quicksight/latest/user/refreshing-imported-data.html) in the
     * *Amazon QuickSight User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-refreshschedulemap.html#cfn-quicksight-refreshschedule-refreshschedulemap-refreshtype)
     */
    public fun refreshType(): String? = unwrap(this).getRefreshType()

    /**
     * The frequency for the refresh schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-refreshschedulemap.html#cfn-quicksight-refreshschedule-refreshschedulemap-schedulefrequency)
     */
    public fun scheduleFrequency(): Any? = unwrap(this).getScheduleFrequency()

    /**
     * An identifier for the refresh schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-refreshschedulemap.html#cfn-quicksight-refreshschedule-refreshschedulemap-scheduleid)
     */
    public fun scheduleId(): String? = unwrap(this).getScheduleId()

    /**
     * Time after which the refresh schedule can be started, expressed in `YYYY-MM-DDTHH:MM:SS`
     * format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-refreshschedulemap.html#cfn-quicksight-refreshschedule-refreshschedulemap-startafterdatetime)
     */
    public fun startAfterDateTime(): String? = unwrap(this).getStartAfterDateTime()

    /**
     * A builder for [RefreshScheduleMapProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param refreshType The type of refresh that a dataset undergoes. Valid values are as
       * follows:.
       * * `FULL_REFRESH` : A complete refresh of a dataset.
       * * `INCREMENTAL_REFRESH` : A partial refresh of some rows of a dataset, based on the time
       * window specified.
       *
       * For more information on full and incremental refreshes, see [Refreshing SPICE
       * data](https://docs.aws.amazon.com/quicksight/latest/user/refreshing-imported-data.html) in the
       * *Amazon QuickSight User Guide* .
       */
      public fun refreshType(refreshType: String)

      /**
       * @param scheduleFrequency The frequency for the refresh schedule.
       */
      public fun scheduleFrequency(scheduleFrequency: IResolvable)

      /**
       * @param scheduleFrequency The frequency for the refresh schedule.
       */
      public fun scheduleFrequency(scheduleFrequency: ScheduleFrequencyProperty)

      /**
       * @param scheduleFrequency The frequency for the refresh schedule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd298fed8f8ced1e9e3f632ed02bbb645481d7e8f484bb4a92d79efaf1a1e651")
      public fun scheduleFrequency(scheduleFrequency: ScheduleFrequencyProperty.Builder.() -> Unit)

      /**
       * @param scheduleId An identifier for the refresh schedule.
       */
      public fun scheduleId(scheduleId: String)

      /**
       * @param startAfterDateTime Time after which the refresh schedule can be started, expressed
       * in `YYYY-MM-DDTHH:MM:SS` format.
       */
      public fun startAfterDateTime(startAfterDateTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshScheduleMapProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshScheduleMapProperty.builder()

      /**
       * @param refreshType The type of refresh that a dataset undergoes. Valid values are as
       * follows:.
       * * `FULL_REFRESH` : A complete refresh of a dataset.
       * * `INCREMENTAL_REFRESH` : A partial refresh of some rows of a dataset, based on the time
       * window specified.
       *
       * For more information on full and incremental refreshes, see [Refreshing SPICE
       * data](https://docs.aws.amazon.com/quicksight/latest/user/refreshing-imported-data.html) in the
       * *Amazon QuickSight User Guide* .
       */
      override fun refreshType(refreshType: String) {
        cdkBuilder.refreshType(refreshType)
      }

      /**
       * @param scheduleFrequency The frequency for the refresh schedule.
       */
      override fun scheduleFrequency(scheduleFrequency: IResolvable) {
        cdkBuilder.scheduleFrequency(scheduleFrequency.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param scheduleFrequency The frequency for the refresh schedule.
       */
      override fun scheduleFrequency(scheduleFrequency: ScheduleFrequencyProperty) {
        cdkBuilder.scheduleFrequency(scheduleFrequency.let(ScheduleFrequencyProperty.Companion::unwrap))
      }

      /**
       * @param scheduleFrequency The frequency for the refresh schedule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd298fed8f8ced1e9e3f632ed02bbb645481d7e8f484bb4a92d79efaf1a1e651")
      override
          fun scheduleFrequency(scheduleFrequency: ScheduleFrequencyProperty.Builder.() -> Unit):
          Unit = scheduleFrequency(ScheduleFrequencyProperty(scheduleFrequency))

      /**
       * @param scheduleId An identifier for the refresh schedule.
       */
      override fun scheduleId(scheduleId: String) {
        cdkBuilder.scheduleId(scheduleId)
      }

      /**
       * @param startAfterDateTime Time after which the refresh schedule can be started, expressed
       * in `YYYY-MM-DDTHH:MM:SS` format.
       */
      override fun startAfterDateTime(startAfterDateTime: String) {
        cdkBuilder.startAfterDateTime(startAfterDateTime)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshScheduleMapProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshScheduleMapProperty,
    ) : CdkObject(cdkObject),
        RefreshScheduleMapProperty {
      /**
       * The type of refresh that a dataset undergoes. Valid values are as follows:.
       *
       * * `FULL_REFRESH` : A complete refresh of a dataset.
       * * `INCREMENTAL_REFRESH` : A partial refresh of some rows of a dataset, based on the time
       * window specified.
       *
       * For more information on full and incremental refreshes, see [Refreshing SPICE
       * data](https://docs.aws.amazon.com/quicksight/latest/user/refreshing-imported-data.html) in the
       * *Amazon QuickSight User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-refreshschedulemap.html#cfn-quicksight-refreshschedule-refreshschedulemap-refreshtype)
       */
      override fun refreshType(): String? = unwrap(this).getRefreshType()

      /**
       * The frequency for the refresh schedule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-refreshschedulemap.html#cfn-quicksight-refreshschedule-refreshschedulemap-schedulefrequency)
       */
      override fun scheduleFrequency(): Any? = unwrap(this).getScheduleFrequency()

      /**
       * An identifier for the refresh schedule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-refreshschedulemap.html#cfn-quicksight-refreshschedule-refreshschedulemap-scheduleid)
       */
      override fun scheduleId(): String? = unwrap(this).getScheduleId()

      /**
       * Time after which the refresh schedule can be started, expressed in `YYYY-MM-DDTHH:MM:SS`
       * format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-refreshschedulemap.html#cfn-quicksight-refreshschedule-refreshschedulemap-startafterdatetime)
       */
      override fun startAfterDateTime(): String? = unwrap(this).getStartAfterDateTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RefreshScheduleMapProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshScheduleMapProperty):
          RefreshScheduleMapProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RefreshScheduleMapProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RefreshScheduleMapProperty):
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshScheduleMapProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshScheduleMapProperty
    }
  }

  /**
   * The frequency for the refresh schedule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * ScheduleFrequencyProperty scheduleFrequencyProperty = ScheduleFrequencyProperty.builder()
   * .interval("interval")
   * .refreshOnDay(RefreshOnDayProperty.builder()
   * .dayOfMonth("dayOfMonth")
   * .dayOfWeek("dayOfWeek")
   * .build())
   * .timeOfTheDay("timeOfTheDay")
   * .timeZone("timeZone")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-schedulefrequency.html)
   */
  public interface ScheduleFrequencyProperty {
    /**
     * The interval between scheduled refreshes. Valid values are as follows:.
     *
     * * `MINUTE15` : The dataset refreshes every 15 minutes. This value is only supported for
     * incremental refreshes. This interval can only be used for one schedule per dataset.
     * * `MINUTE30` : The dataset refreshes every 30 minutes. This value is only supported for
     * incremental refreshes. This interval can only be used for one schedule per dataset.
     * * `HOURLY` : The dataset refreshes every hour. This interval can only be used for one
     * schedule per dataset.
     * * `DAILY` : The dataset refreshes every day.
     * * `WEEKLY` : The dataset refreshes every week.
     * * `MONTHLY` : The dataset refreshes every month.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-schedulefrequency.html#cfn-quicksight-refreshschedule-schedulefrequency-interval)
     */
    public fun interval(): String? = unwrap(this).getInterval()

    /**
     * The day of the week that you want to schedule the refresh on.
     *
     * This value is required for weekly and monthly refresh intervals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-schedulefrequency.html#cfn-quicksight-refreshschedule-schedulefrequency-refreshonday)
     */
    public fun refreshOnDay(): Any? = unwrap(this).getRefreshOnDay()

    /**
     * The time of day that you want the dataset to refresh.
     *
     * This value is expressed in HH:MM format. This field is not required for schedules that
     * refresh hourly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-schedulefrequency.html#cfn-quicksight-refreshschedule-schedulefrequency-timeoftheday)
     */
    public fun timeOfTheDay(): String? = unwrap(this).getTimeOfTheDay()

    /**
     * The timezone that you want the refresh schedule to use.
     *
     * The timezone ID must match a corresponding ID found on `java.util.time.getAvailableIDs()` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-schedulefrequency.html#cfn-quicksight-refreshschedule-schedulefrequency-timezone)
     */
    public fun timeZone(): String? = unwrap(this).getTimeZone()

    /**
     * A builder for [ScheduleFrequencyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param interval The interval between scheduled refreshes. Valid values are as follows:.
       * * `MINUTE15` : The dataset refreshes every 15 minutes. This value is only supported for
       * incremental refreshes. This interval can only be used for one schedule per dataset.
       * * `MINUTE30` : The dataset refreshes every 30 minutes. This value is only supported for
       * incremental refreshes. This interval can only be used for one schedule per dataset.
       * * `HOURLY` : The dataset refreshes every hour. This interval can only be used for one
       * schedule per dataset.
       * * `DAILY` : The dataset refreshes every day.
       * * `WEEKLY` : The dataset refreshes every week.
       * * `MONTHLY` : The dataset refreshes every month.
       */
      public fun interval(interval: String)

      /**
       * @param refreshOnDay The day of the week that you want to schedule the refresh on.
       * This value is required for weekly and monthly refresh intervals.
       */
      public fun refreshOnDay(refreshOnDay: IResolvable)

      /**
       * @param refreshOnDay The day of the week that you want to schedule the refresh on.
       * This value is required for weekly and monthly refresh intervals.
       */
      public fun refreshOnDay(refreshOnDay: RefreshOnDayProperty)

      /**
       * @param refreshOnDay The day of the week that you want to schedule the refresh on.
       * This value is required for weekly and monthly refresh intervals.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2aabefabd2b49635906ee287c73e7cab744c88a7bdfcfa93bfe65dda8f54d64e")
      public fun refreshOnDay(refreshOnDay: RefreshOnDayProperty.Builder.() -> Unit)

      /**
       * @param timeOfTheDay The time of day that you want the dataset to refresh.
       * This value is expressed in HH:MM format. This field is not required for schedules that
       * refresh hourly.
       */
      public fun timeOfTheDay(timeOfTheDay: String)

      /**
       * @param timeZone The timezone that you want the refresh schedule to use.
       * The timezone ID must match a corresponding ID found on `java.util.time.getAvailableIDs()` .
       */
      public fun timeZone(timeZone: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.ScheduleFrequencyProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.ScheduleFrequencyProperty.builder()

      /**
       * @param interval The interval between scheduled refreshes. Valid values are as follows:.
       * * `MINUTE15` : The dataset refreshes every 15 minutes. This value is only supported for
       * incremental refreshes. This interval can only be used for one schedule per dataset.
       * * `MINUTE30` : The dataset refreshes every 30 minutes. This value is only supported for
       * incremental refreshes. This interval can only be used for one schedule per dataset.
       * * `HOURLY` : The dataset refreshes every hour. This interval can only be used for one
       * schedule per dataset.
       * * `DAILY` : The dataset refreshes every day.
       * * `WEEKLY` : The dataset refreshes every week.
       * * `MONTHLY` : The dataset refreshes every month.
       */
      override fun interval(interval: String) {
        cdkBuilder.interval(interval)
      }

      /**
       * @param refreshOnDay The day of the week that you want to schedule the refresh on.
       * This value is required for weekly and monthly refresh intervals.
       */
      override fun refreshOnDay(refreshOnDay: IResolvable) {
        cdkBuilder.refreshOnDay(refreshOnDay.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param refreshOnDay The day of the week that you want to schedule the refresh on.
       * This value is required for weekly and monthly refresh intervals.
       */
      override fun refreshOnDay(refreshOnDay: RefreshOnDayProperty) {
        cdkBuilder.refreshOnDay(refreshOnDay.let(RefreshOnDayProperty.Companion::unwrap))
      }

      /**
       * @param refreshOnDay The day of the week that you want to schedule the refresh on.
       * This value is required for weekly and monthly refresh intervals.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2aabefabd2b49635906ee287c73e7cab744c88a7bdfcfa93bfe65dda8f54d64e")
      override fun refreshOnDay(refreshOnDay: RefreshOnDayProperty.Builder.() -> Unit): Unit =
          refreshOnDay(RefreshOnDayProperty(refreshOnDay))

      /**
       * @param timeOfTheDay The time of day that you want the dataset to refresh.
       * This value is expressed in HH:MM format. This field is not required for schedules that
       * refresh hourly.
       */
      override fun timeOfTheDay(timeOfTheDay: String) {
        cdkBuilder.timeOfTheDay(timeOfTheDay)
      }

      /**
       * @param timeZone The timezone that you want the refresh schedule to use.
       * The timezone ID must match a corresponding ID found on `java.util.time.getAvailableIDs()` .
       */
      override fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.ScheduleFrequencyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.ScheduleFrequencyProperty,
    ) : CdkObject(cdkObject),
        ScheduleFrequencyProperty {
      /**
       * The interval between scheduled refreshes. Valid values are as follows:.
       *
       * * `MINUTE15` : The dataset refreshes every 15 minutes. This value is only supported for
       * incremental refreshes. This interval can only be used for one schedule per dataset.
       * * `MINUTE30` : The dataset refreshes every 30 minutes. This value is only supported for
       * incremental refreshes. This interval can only be used for one schedule per dataset.
       * * `HOURLY` : The dataset refreshes every hour. This interval can only be used for one
       * schedule per dataset.
       * * `DAILY` : The dataset refreshes every day.
       * * `WEEKLY` : The dataset refreshes every week.
       * * `MONTHLY` : The dataset refreshes every month.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-schedulefrequency.html#cfn-quicksight-refreshschedule-schedulefrequency-interval)
       */
      override fun interval(): String? = unwrap(this).getInterval()

      /**
       * The day of the week that you want to schedule the refresh on.
       *
       * This value is required for weekly and monthly refresh intervals.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-schedulefrequency.html#cfn-quicksight-refreshschedule-schedulefrequency-refreshonday)
       */
      override fun refreshOnDay(): Any? = unwrap(this).getRefreshOnDay()

      /**
       * The time of day that you want the dataset to refresh.
       *
       * This value is expressed in HH:MM format. This field is not required for schedules that
       * refresh hourly.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-schedulefrequency.html#cfn-quicksight-refreshschedule-schedulefrequency-timeoftheday)
       */
      override fun timeOfTheDay(): String? = unwrap(this).getTimeOfTheDay()

      /**
       * The timezone that you want the refresh schedule to use.
       *
       * The timezone ID must match a corresponding ID found on `java.util.time.getAvailableIDs()` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-schedulefrequency.html#cfn-quicksight-refreshschedule-schedulefrequency-timezone)
       */
      override fun timeZone(): String? = unwrap(this).getTimeZone()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleFrequencyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.ScheduleFrequencyProperty):
          ScheduleFrequencyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ScheduleFrequencyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleFrequencyProperty):
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.ScheduleFrequencyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.ScheduleFrequencyProperty
    }
  }
}
