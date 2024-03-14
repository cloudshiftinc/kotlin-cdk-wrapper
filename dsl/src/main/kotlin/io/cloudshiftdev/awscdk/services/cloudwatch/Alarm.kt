package io.cloudshiftdev.awscdk.services.cloudwatch

import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Alarm internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.Alarm,
) : AlarmBase(cdkObject) {
  public override fun addAlarmAction(actions: IAlarmAction) {
    unwrap(this).addAlarmAction(actions.let(IAlarmAction::unwrap))
  }

  public override fun alarmArn(): String = unwrap(this).getAlarmArn()

  public override fun alarmName(): String = unwrap(this).getAlarmName()

  public open fun metric(): IMetric = unwrap(this).getMetric().let(IMetric::wrap)

  public open fun toAnnotation(): HorizontalAnnotation =
      unwrap(this).toAnnotation().let(HorizontalAnnotation::wrap)

  public interface Builder {
    public fun actionsEnabled(actionsEnabled: Boolean)

    public fun alarmDescription(alarmDescription: String)

    public fun alarmName(alarmName: String)

    public fun comparisonOperator(comparisonOperator: ComparisonOperator)

    public fun datapointsToAlarm(datapointsToAlarm: Number)

    public fun evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile: String)

    public fun evaluationPeriods(evaluationPeriods: Number)

    public fun metric(metric: IMetric)

    public fun threshold(threshold: Number)

    public fun treatMissingData(treatMissingData: TreatMissingData)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.Alarm.Builder =
        software.amazon.awscdk.services.cloudwatch.Alarm.Builder.create(scope, id)

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

    override fun metric(metric: IMetric) {
      cdkBuilder.metric(metric.let(IMetric::unwrap))
    }

    override fun threshold(threshold: Number) {
      cdkBuilder.threshold(threshold)
    }

    override fun treatMissingData(treatMissingData: TreatMissingData) {
      cdkBuilder.treatMissingData(treatMissingData.let(TreatMissingData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.Alarm = cdkBuilder.build()
  }

  public companion object {
    public open fun fromAlarmArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      alarmArn: String,
    ): IAlarm =
        software.amazon.awscdk.services.cloudwatch.Alarm.fromAlarmArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, alarmArn).let(IAlarm::wrap)

    public open fun fromAlarmName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      alarmName: String,
    ): IAlarm =
        software.amazon.awscdk.services.cloudwatch.Alarm.fromAlarmName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, alarmName).let(IAlarm::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Alarm {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Alarm(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.Alarm): Alarm =
        Alarm(cdkObject)

    internal fun unwrap(wrapped: Alarm): software.amazon.awscdk.services.cloudwatch.Alarm =
        wrapped.cdkObject
  }
}
