@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnRefreshScheduleProps {
  public fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  public fun dataSetId(): String? = unwrap(this).getDataSetId()

  public fun schedule(): Any? = unwrap(this).getSchedule()

  @CdkDslMarker
  public interface Builder {
    public fun awsAccountId(awsAccountId: String)

    public fun dataSetId(dataSetId: String)

    public fun schedule(schedule: IResolvable)

    public fun schedule(schedule: CfnRefreshSchedule.RefreshScheduleMapProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e58b84edfdc8bcfc2780e8f7d7abda62226b70bc2232a4fe186f8ac725c8ed5b")
    public fun schedule(schedule: CfnRefreshSchedule.RefreshScheduleMapProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.quicksight.CfnRefreshScheduleProps.Builder =
        software.amazon.awscdk.services.quicksight.CfnRefreshScheduleProps.builder()

    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    override fun dataSetId(dataSetId: String) {
      cdkBuilder.dataSetId(dataSetId)
    }

    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    override fun schedule(schedule: CfnRefreshSchedule.RefreshScheduleMapProperty) {
      cdkBuilder.schedule(schedule.let(CfnRefreshSchedule.RefreshScheduleMapProperty::unwrap))
    }

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
    override fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

    override fun dataSetId(): String? = unwrap(this).getDataSetId()

    override fun schedule(): Any? = unwrap(this).getSchedule()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRefreshScheduleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnRefreshScheduleProps):
        CfnRefreshScheduleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRefreshScheduleProps):
        software.amazon.awscdk.services.quicksight.CfnRefreshScheduleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.quicksight.CfnRefreshScheduleProps
  }
}
