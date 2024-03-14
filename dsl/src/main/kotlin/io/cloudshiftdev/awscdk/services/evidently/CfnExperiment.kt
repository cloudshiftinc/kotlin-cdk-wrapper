package io.cloudshiftdev.awscdk.services.evidently

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnExperiment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.evidently.CfnExperiment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun metricGoals(): Any = unwrap(this).getMetricGoals()

  public open fun metricGoals(`value`: IResolvable) {
    unwrap(this).setMetricGoals(`value`.let(IResolvable::unwrap))
  }

  public open fun metricGoals(__idx_ac66f0: List<Any>) {
    unwrap(this).setMetricGoals(__idx_ac66f0)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun onlineAbConfig(): Any = unwrap(this).getOnlineAbConfig()

  public open fun onlineAbConfig(`value`: IResolvable) {
    unwrap(this).setOnlineAbConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun onlineAbConfig(`value`: OnlineAbConfigObjectProperty) {
    unwrap(this).setOnlineAbConfig(`value`.let(OnlineAbConfigObjectProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("46111b28f3dd2af8c414d87851d4491190752e75b07b117d2b353035174e1bed")
  public open fun onlineAbConfig(`value`: OnlineAbConfigObjectProperty.Builder.() -> Unit): Unit =
      onlineAbConfig(OnlineAbConfigObjectProperty(`value`))

  public open fun project(): String = unwrap(this).getProject()

  public open fun project(`value`: String) {
    unwrap(this).setProject(`value`)
  }

  public open fun randomizationSalt(): String? = unwrap(this).getRandomizationSalt()

  public open fun randomizationSalt(`value`: String) {
    unwrap(this).setRandomizationSalt(`value`)
  }

  public open fun removeSegment(): Any? = unwrap(this).getRemoveSegment()

  public open fun removeSegment(`value`: Boolean) {
    unwrap(this).setRemoveSegment(`value`)
  }

  public open fun removeSegment(`value`: IResolvable) {
    unwrap(this).setRemoveSegment(`value`.let(IResolvable::unwrap))
  }

  public open fun runningStatus(): Any? = unwrap(this).getRunningStatus()

  public open fun runningStatus(`value`: IResolvable) {
    unwrap(this).setRunningStatus(`value`.let(IResolvable::unwrap))
  }

  public open fun runningStatus(`value`: RunningStatusObjectProperty) {
    unwrap(this).setRunningStatus(`value`.let(RunningStatusObjectProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b51759e60b7ceedf1adde2b6aa775cb2dc9f3049de44c459807109c9fcec66f6")
  public open fun runningStatus(`value`: RunningStatusObjectProperty.Builder.() -> Unit): Unit =
      runningStatus(RunningStatusObjectProperty(`value`))

  public open fun samplingRate(): Number? = unwrap(this).getSamplingRate()

  public open fun samplingRate(`value`: Number) {
    unwrap(this).setSamplingRate(`value`)
  }

  public open fun segment(): String? = unwrap(this).getSegment()

  public open fun segment(`value`: String) {
    unwrap(this).setSegment(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun treatments(): Any = unwrap(this).getTreatments()

  public open fun treatments(`value`: IResolvable) {
    unwrap(this).setTreatments(`value`.let(IResolvable::unwrap))
  }

  public open fun treatments(__idx_ac66f0: List<Any>) {
    unwrap(this).setTreatments(__idx_ac66f0)
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun metricGoals(metricGoals: IResolvable) {
    }

    public fun metricGoals(metricGoals: List<Any>) {
    }

    public fun name(name: String) {
    }

    public fun onlineAbConfig(onlineAbConfig: IResolvable) {
    }

    public fun onlineAbConfig(onlineAbConfig: OnlineAbConfigObjectProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("862d38592f3888a79f5461082228603345d6544d9a808f77a8db7edf6c319354")
    public fun onlineAbConfig(onlineAbConfig: OnlineAbConfigObjectProperty.Builder.() -> Unit) {
    }

    public fun project(project: String) {
    }

    public fun randomizationSalt(randomizationSalt: String) {
    }

    public fun removeSegment(removeSegment: Boolean) {
    }

    public fun removeSegment(removeSegment: IResolvable) {
    }

    public fun runningStatus(runningStatus: IResolvable) {
    }

    public fun runningStatus(runningStatus: RunningStatusObjectProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02995d143134d43c96b097a1a914adef4caefd28099e90f563cf8211181a48c9")
    public fun runningStatus(runningStatus: RunningStatusObjectProperty.Builder.() -> Unit) {
    }

    public fun samplingRate(samplingRate: Number) {
    }

    public fun segment(segment: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun treatments(treatments: IResolvable) {
    }

    public fun treatments(treatments: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.evidently.CfnExperiment.Builder =
        software.amazon.awscdk.services.evidently.CfnExperiment.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun metricGoals(metricGoals: IResolvable) {
      cdkBuilder.metricGoals(metricGoals.let(IResolvable::unwrap))
    }

    public override fun metricGoals(metricGoals: List<Any>) {
      cdkBuilder.metricGoals(metricGoals)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun onlineAbConfig(onlineAbConfig: IResolvable) {
      cdkBuilder.onlineAbConfig(onlineAbConfig.let(IResolvable::unwrap))
    }

    public override fun onlineAbConfig(onlineAbConfig: OnlineAbConfigObjectProperty) {
      cdkBuilder.onlineAbConfig(onlineAbConfig.let(OnlineAbConfigObjectProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("862d38592f3888a79f5461082228603345d6544d9a808f77a8db7edf6c319354")
    public override
        fun onlineAbConfig(onlineAbConfig: OnlineAbConfigObjectProperty.Builder.() -> Unit): Unit =
        onlineAbConfig(OnlineAbConfigObjectProperty(onlineAbConfig))

    public override fun project(project: String) {
      cdkBuilder.project(project)
    }

    public override fun randomizationSalt(randomizationSalt: String) {
      cdkBuilder.randomizationSalt(randomizationSalt)
    }

    public override fun removeSegment(removeSegment: Boolean) {
      cdkBuilder.removeSegment(removeSegment)
    }

    public override fun removeSegment(removeSegment: IResolvable) {
      cdkBuilder.removeSegment(removeSegment.let(IResolvable::unwrap))
    }

    public override fun runningStatus(runningStatus: IResolvable) {
      cdkBuilder.runningStatus(runningStatus.let(IResolvable::unwrap))
    }

    public override fun runningStatus(runningStatus: RunningStatusObjectProperty) {
      cdkBuilder.runningStatus(runningStatus.let(RunningStatusObjectProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02995d143134d43c96b097a1a914adef4caefd28099e90f563cf8211181a48c9")
    public override
        fun runningStatus(runningStatus: RunningStatusObjectProperty.Builder.() -> Unit): Unit =
        runningStatus(RunningStatusObjectProperty(runningStatus))

    public override fun samplingRate(samplingRate: Number) {
      cdkBuilder.samplingRate(samplingRate)
    }

    public override fun segment(segment: String) {
      cdkBuilder.segment(segment)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun treatments(treatments: IResolvable) {
      cdkBuilder.treatments(treatments.let(IResolvable::unwrap))
    }

    public override fun treatments(treatments: List<Any>) {
      cdkBuilder.treatments(treatments)
    }

    public fun build(): software.amazon.awscdk.services.evidently.CfnExperiment = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnExperiment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnExperiment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnExperiment):
        CfnExperiment = CfnExperiment(cdkObject)

    internal fun unwrap(wrapped: CfnExperiment):
        software.amazon.awscdk.services.evidently.CfnExperiment = wrapped.cdkObject
  }

  public interface MetricGoalObjectProperty {
    public fun desiredChange(): String

    public fun entityIdKey(): String

    public fun eventPattern(): String? = unwrap(this).getEventPattern()

    public fun metricName(): String

    public fun unitLabel(): String? = unwrap(this).getUnitLabel()

    public fun valueKey(): String

    public interface Builder {
      public fun desiredChange(desiredChange: String) {
      }

      public fun entityIdKey(entityIdKey: String) {
      }

      public fun eventPattern(eventPattern: String) {
      }

      public fun metricName(metricName: String) {
      }

      public fun unitLabel(unitLabel: String) {
      }

      public fun valueKey(valueKey: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnExperiment.MetricGoalObjectProperty.Builder =
          software.amazon.awscdk.services.evidently.CfnExperiment.MetricGoalObjectProperty.builder()

      public override fun desiredChange(desiredChange: String) {
        cdkBuilder.desiredChange(desiredChange)
      }

      public override fun entityIdKey(entityIdKey: String) {
        cdkBuilder.entityIdKey(entityIdKey)
      }

      public override fun eventPattern(eventPattern: String) {
        cdkBuilder.eventPattern(eventPattern)
      }

      public override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      public override fun unitLabel(unitLabel: String) {
        cdkBuilder.unitLabel(unitLabel)
      }

      public override fun valueKey(valueKey: String) {
        cdkBuilder.valueKey(valueKey)
      }

      public fun build():
          software.amazon.awscdk.services.evidently.CfnExperiment.MetricGoalObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.evidently.CfnExperiment.MetricGoalObjectProperty,
    ) : MetricGoalObjectProperty {
      public override fun desiredChange(): String = unwrap(this).getDesiredChange()

      public override fun entityIdKey(): String = unwrap(this).getEntityIdKey()

      public override fun eventPattern(): String? = unwrap(this).getEventPattern()

      public override fun metricName(): String = unwrap(this).getMetricName()

      public override fun unitLabel(): String? = unwrap(this).getUnitLabel()

      public override fun valueKey(): String = unwrap(this).getValueKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricGoalObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnExperiment.MetricGoalObjectProperty):
          MetricGoalObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricGoalObjectProperty):
          software.amazon.awscdk.services.evidently.CfnExperiment.MetricGoalObjectProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TreatmentToWeightProperty {
    public fun splitWeight(): Number

    public fun treatment(): String

    public interface Builder {
      public fun splitWeight(splitWeight: Number) {
      }

      public fun treatment(treatment: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentToWeightProperty.Builder
          =
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentToWeightProperty.builder()

      public override fun splitWeight(splitWeight: Number) {
        cdkBuilder.splitWeight(splitWeight)
      }

      public override fun treatment(treatment: String) {
        cdkBuilder.treatment(treatment)
      }

      public fun build():
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentToWeightProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentToWeightProperty,
    ) : TreatmentToWeightProperty {
      public override fun splitWeight(): Number = unwrap(this).getSplitWeight()

      public override fun treatment(): String = unwrap(this).getTreatment()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TreatmentToWeightProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentToWeightProperty):
          TreatmentToWeightProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TreatmentToWeightProperty):
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentToWeightProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RunningStatusObjectProperty {
    public fun analysisCompleteTime(): String? = unwrap(this).getAnalysisCompleteTime()

    public fun desiredState(): String? = unwrap(this).getDesiredState()

    public fun reason(): String? = unwrap(this).getReason()

    public fun status(): String

    public interface Builder {
      public fun analysisCompleteTime(analysisCompleteTime: String) {
      }

      public fun desiredState(desiredState: String) {
      }

      public fun reason(reason: String) {
      }

      public fun status(status: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnExperiment.RunningStatusObjectProperty.Builder
          =
          software.amazon.awscdk.services.evidently.CfnExperiment.RunningStatusObjectProperty.builder()

      public override fun analysisCompleteTime(analysisCompleteTime: String) {
        cdkBuilder.analysisCompleteTime(analysisCompleteTime)
      }

      public override fun desiredState(desiredState: String) {
        cdkBuilder.desiredState(desiredState)
      }

      public override fun reason(reason: String) {
        cdkBuilder.reason(reason)
      }

      public override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.evidently.CfnExperiment.RunningStatusObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.evidently.CfnExperiment.RunningStatusObjectProperty,
    ) : RunningStatusObjectProperty {
      public override fun analysisCompleteTime(): String? = unwrap(this).getAnalysisCompleteTime()

      public override fun desiredState(): String? = unwrap(this).getDesiredState()

      public override fun reason(): String? = unwrap(this).getReason()

      public override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RunningStatusObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnExperiment.RunningStatusObjectProperty):
          RunningStatusObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RunningStatusObjectProperty):
          software.amazon.awscdk.services.evidently.CfnExperiment.RunningStatusObjectProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TreatmentObjectProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun feature(): String

    public fun treatmentName(): String

    public fun variation(): String

    public interface Builder {
      public fun description(description: String) {
      }

      public fun feature(feature: String) {
      }

      public fun treatmentName(treatmentName: String) {
      }

      public fun variation(variation: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentObjectProperty.Builder =
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentObjectProperty.builder()

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun feature(feature: String) {
        cdkBuilder.feature(feature)
      }

      public override fun treatmentName(treatmentName: String) {
        cdkBuilder.treatmentName(treatmentName)
      }

      public override fun variation(variation: String) {
        cdkBuilder.variation(variation)
      }

      public fun build():
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentObjectProperty,
    ) : TreatmentObjectProperty {
      public override fun description(): String? = unwrap(this).getDescription()

      public override fun feature(): String = unwrap(this).getFeature()

      public override fun treatmentName(): String = unwrap(this).getTreatmentName()

      public override fun variation(): String = unwrap(this).getVariation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TreatmentObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentObjectProperty):
          TreatmentObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TreatmentObjectProperty):
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentObjectProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface OnlineAbConfigObjectProperty {
    public fun controlTreatmentName(): String? = unwrap(this).getControlTreatmentName()

    public fun treatmentWeights(): Any? = unwrap(this).getTreatmentWeights()

    public interface Builder {
      public fun controlTreatmentName(controlTreatmentName: String) {
      }

      public fun treatmentWeights(treatmentWeights: IResolvable) {
      }

      public fun treatmentWeights(treatmentWeights: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnExperiment.OnlineAbConfigObjectProperty.Builder
          =
          software.amazon.awscdk.services.evidently.CfnExperiment.OnlineAbConfigObjectProperty.builder()

      public override fun controlTreatmentName(controlTreatmentName: String) {
        cdkBuilder.controlTreatmentName(controlTreatmentName)
      }

      public override fun treatmentWeights(treatmentWeights: IResolvable) {
        cdkBuilder.treatmentWeights(treatmentWeights.let(IResolvable::unwrap))
      }

      public override fun treatmentWeights(treatmentWeights: List<Any>) {
        cdkBuilder.treatmentWeights(treatmentWeights)
      }

      public fun build():
          software.amazon.awscdk.services.evidently.CfnExperiment.OnlineAbConfigObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.evidently.CfnExperiment.OnlineAbConfigObjectProperty,
    ) : OnlineAbConfigObjectProperty {
      public override fun controlTreatmentName(): String? = unwrap(this).getControlTreatmentName()

      public override fun treatmentWeights(): Any? = unwrap(this).getTreatmentWeights()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OnlineAbConfigObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnExperiment.OnlineAbConfigObjectProperty):
          OnlineAbConfigObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnlineAbConfigObjectProperty):
          software.amazon.awscdk.services.evidently.CfnExperiment.OnlineAbConfigObjectProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
