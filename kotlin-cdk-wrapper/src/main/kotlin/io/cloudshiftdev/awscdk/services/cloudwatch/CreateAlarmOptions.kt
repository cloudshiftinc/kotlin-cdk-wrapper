@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CreateAlarmOptions {
  public fun actionsEnabled(): Boolean? = unwrap(this).getActionsEnabled()

  public fun alarmDescription(): String? = unwrap(this).getAlarmDescription()

  public fun alarmName(): String? = unwrap(this).getAlarmName()

  public fun comparisonOperator(): ComparisonOperator? =
      unwrap(this).getComparisonOperator()?.let(ComparisonOperator::wrap)

  public fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

  public fun evaluateLowSampleCountPercentile(): String? =
      unwrap(this).getEvaluateLowSampleCountPercentile()

  public fun evaluationPeriods(): Number

  public fun threshold(): Number

  public fun treatMissingData(): TreatMissingData? =
      unwrap(this).getTreatMissingData()?.let(TreatMissingData::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun actionsEnabled(actionsEnabled: Boolean)

    public fun alarmDescription(alarmDescription: String)

    public fun alarmName(alarmName: String)

    public fun comparisonOperator(comparisonOperator: ComparisonOperator)

    public fun datapointsToAlarm(datapointsToAlarm: Number)

    public fun evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile: String)

    public fun evaluationPeriods(evaluationPeriods: Number)

    public fun threshold(threshold: Number)

    public fun treatMissingData(treatMissingData: TreatMissingData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CreateAlarmOptions.Builder =
        software.amazon.awscdk.services.cloudwatch.CreateAlarmOptions.builder()

    override fun actionsEnabled(actionsEnabled: Boolean) {
      cdkBuilder.actionsEnabled(actionsEnabled)
    }

    override fun alarmDescription(alarmDescription: String) {
      cdkBuilder.alarmDescription(alarmDescription)
    }

    override fun alarmName(alarmName: String) {
      cdkBuilder.alarmName(alarmName)
    }

    override fun comparisonOperator(comparisonOperator: ComparisonOperator) {
      cdkBuilder.comparisonOperator(comparisonOperator.let(ComparisonOperator::unwrap))
    }

    override fun datapointsToAlarm(datapointsToAlarm: Number) {
      cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    override fun evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile: String) {
      cdkBuilder.evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile)
    }

    override fun evaluationPeriods(evaluationPeriods: Number) {
      cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    override fun threshold(threshold: Number) {
      cdkBuilder.threshold(threshold)
    }

    override fun treatMissingData(treatMissingData: TreatMissingData) {
      cdkBuilder.treatMissingData(treatMissingData.let(TreatMissingData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.CreateAlarmOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.CreateAlarmOptions,
  ) : CdkObject(cdkObject), CreateAlarmOptions {
    override fun actionsEnabled(): Boolean? = unwrap(this).getActionsEnabled()

    override fun alarmDescription(): String? = unwrap(this).getAlarmDescription()

    override fun alarmName(): String? = unwrap(this).getAlarmName()

    override fun comparisonOperator(): ComparisonOperator? =
        unwrap(this).getComparisonOperator()?.let(ComparisonOperator::wrap)

    override fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

    override fun evaluateLowSampleCountPercentile(): String? =
        unwrap(this).getEvaluateLowSampleCountPercentile()

    override fun evaluationPeriods(): Number = unwrap(this).getEvaluationPeriods()

    override fun threshold(): Number = unwrap(this).getThreshold()

    override fun treatMissingData(): TreatMissingData? =
        unwrap(this).getTreatMissingData()?.let(TreatMissingData::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CreateAlarmOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CreateAlarmOptions):
        CreateAlarmOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CreateAlarmOptions):
        software.amazon.awscdk.services.cloudwatch.CreateAlarmOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.CreateAlarmOptions
  }
}
