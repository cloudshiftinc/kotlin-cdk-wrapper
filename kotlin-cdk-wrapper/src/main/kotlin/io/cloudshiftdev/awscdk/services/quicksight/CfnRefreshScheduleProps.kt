@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnRefreshSchedule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.quicksight.*;
 * CfnRefreshScheduleProps cfnRefreshScheduleProps = CfnRefreshScheduleProps.builder()
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
public interface CfnRefreshScheduleProps {
  /**
   * The AWS account ID of the account that you are creating a schedule in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html#cfn-quicksight-refreshschedule-awsaccountid)
   */
  public fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  /**
   * The ID of the dataset that you are creating a refresh schedule for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html#cfn-quicksight-refreshschedule-datasetid)
   */
  public fun dataSetId(): String? = unwrap(this).getDataSetId()

  /**
   * The refresh schedule of a dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html#cfn-quicksight-refreshschedule-schedule)
   */
  public fun schedule(): Any? = unwrap(this).getSchedule()

  /**
   * A builder for [CfnRefreshScheduleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param awsAccountId The AWS account ID of the account that you are creating a schedule in.
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * @param dataSetId The ID of the dataset that you are creating a refresh schedule for.
     */
    public fun dataSetId(dataSetId: String)

    /**
     * @param schedule The refresh schedule of a dataset.
     */
    public fun schedule(schedule: IResolvable)

    /**
     * @param schedule The refresh schedule of a dataset.
     */
    public fun schedule(schedule: CfnRefreshSchedule.RefreshScheduleMapProperty)

    /**
     * @param schedule The refresh schedule of a dataset.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e58b84edfdc8bcfc2780e8f7d7abda62226b70bc2232a4fe186f8ac725c8ed5b")
    public fun schedule(schedule: CfnRefreshSchedule.RefreshScheduleMapProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.quicksight.CfnRefreshScheduleProps.Builder =
        software.amazon.awscdk.services.quicksight.CfnRefreshScheduleProps.builder()

    /**
     * @param awsAccountId The AWS account ID of the account that you are creating a schedule in.
     */
    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * @param dataSetId The ID of the dataset that you are creating a refresh schedule for.
     */
    override fun dataSetId(dataSetId: String) {
      cdkBuilder.dataSetId(dataSetId)
    }

    /**
     * @param schedule The refresh schedule of a dataset.
     */
    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    /**
     * @param schedule The refresh schedule of a dataset.
     */
    override fun schedule(schedule: CfnRefreshSchedule.RefreshScheduleMapProperty) {
      cdkBuilder.schedule(schedule.let(CfnRefreshSchedule.RefreshScheduleMapProperty::unwrap))
    }

    /**
     * @param schedule The refresh schedule of a dataset.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e58b84edfdc8bcfc2780e8f7d7abda62226b70bc2232a4fe186f8ac725c8ed5b")
    override
        fun schedule(schedule: CfnRefreshSchedule.RefreshScheduleMapProperty.Builder.() -> Unit):
        Unit = schedule(CfnRefreshSchedule.RefreshScheduleMapProperty(schedule))

    public fun build(): software.amazon.awscdk.services.quicksight.CfnRefreshScheduleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.quicksight.CfnRefreshScheduleProps,
  ) : CdkObject(cdkObject), CfnRefreshScheduleProps {
    /**
     * The AWS account ID of the account that you are creating a schedule in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html#cfn-quicksight-refreshschedule-awsaccountid)
     */
    override fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

    /**
     * The ID of the dataset that you are creating a refresh schedule for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html#cfn-quicksight-refreshschedule-datasetid)
     */
    override fun dataSetId(): String? = unwrap(this).getDataSetId()

    /**
     * The refresh schedule of a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html#cfn-quicksight-refreshschedule-schedule)
     */
    override fun schedule(): Any? = unwrap(this).getSchedule()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRefreshScheduleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnRefreshScheduleProps):
        CfnRefreshScheduleProps = CdkObjectWrappers.wrap(cdkObject) as CfnRefreshScheduleProps

    internal fun unwrap(wrapped: CfnRefreshScheduleProps):
        software.amazon.awscdk.services.quicksight.CfnRefreshScheduleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.quicksight.CfnRefreshScheduleProps
  }
}
