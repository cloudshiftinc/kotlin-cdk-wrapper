package io.cloudshiftdev.awscdk.services.evidently

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLaunch internal constructor(
  private val cdkObject: software.amazon.awscdk.services.evidently.CfnLaunch,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun executionStatus(): Any? = unwrap(this).getExecutionStatus()

  public open fun executionStatus(`value`: IResolvable) {
    unwrap(this).setExecutionStatus(`value`.let(IResolvable::unwrap))
  }

  public open fun executionStatus(`value`: ExecutionStatusObjectProperty) {
    unwrap(this).setExecutionStatus(`value`.let(ExecutionStatusObjectProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("421639b5867705b19607b010be6f3c66cf8250bede6fb9b463f295924e6cdbb6")
  public open fun executionStatus(`value`: ExecutionStatusObjectProperty.Builder.() -> Unit): Unit =
      executionStatus(ExecutionStatusObjectProperty(`value`))

  public open fun groups(): Any = unwrap(this).getGroups()

  public open fun groups(`value`: IResolvable) {
    unwrap(this).setGroups(`value`.let(IResolvable::unwrap))
  }

  public open fun groups(__idx_ac66f0: List<Any>) {
    unwrap(this).setGroups(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun metricMonitors(): Any? = unwrap(this).getMetricMonitors()

  public open fun metricMonitors(`value`: IResolvable) {
    unwrap(this).setMetricMonitors(`value`.let(IResolvable::unwrap))
  }

  public open fun metricMonitors(__idx_ac66f0: List<Any>) {
    unwrap(this).setMetricMonitors(__idx_ac66f0)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun project(): String = unwrap(this).getProject()

  public open fun project(`value`: String) {
    unwrap(this).setProject(`value`)
  }

  public open fun randomizationSalt(): String? = unwrap(this).getRandomizationSalt()

  public open fun randomizationSalt(`value`: String) {
    unwrap(this).setRandomizationSalt(`value`)
  }

  public open fun scheduledSplitsConfig(): Any = unwrap(this).getScheduledSplitsConfig()

  public open fun scheduledSplitsConfig(`value`: IResolvable) {
    unwrap(this).setScheduledSplitsConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun scheduledSplitsConfig(__idx_ac66f0: List<Any>) {
    unwrap(this).setScheduledSplitsConfig(__idx_ac66f0)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun executionStatus(executionStatus: IResolvable) {
    }

    public fun executionStatus(executionStatus: ExecutionStatusObjectProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d344654ec827a3b4bc87d8750cac4d2f48b3f11158d00d01bfd16475e040555")
    public fun executionStatus(executionStatus: ExecutionStatusObjectProperty.Builder.() -> Unit) {
    }

    public fun groups(groups: IResolvable) {
    }

    public fun groups(groups: List<Any>) {
    }

    public fun metricMonitors(metricMonitors: IResolvable) {
    }

    public fun metricMonitors(metricMonitors: List<Any>) {
    }

    public fun name(name: String) {
    }

    public fun project(project: String) {
    }

    public fun randomizationSalt(randomizationSalt: String) {
    }

    public fun scheduledSplitsConfig(scheduledSplitsConfig: IResolvable) {
    }

    public fun scheduledSplitsConfig(scheduledSplitsConfig: List<Any>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.evidently.CfnLaunch.Builder =
        software.amazon.awscdk.services.evidently.CfnLaunch.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun executionStatus(executionStatus: IResolvable) {
      cdkBuilder.executionStatus(executionStatus.let(IResolvable::unwrap))
    }

    public override fun executionStatus(executionStatus: ExecutionStatusObjectProperty) {
      cdkBuilder.executionStatus(executionStatus.let(ExecutionStatusObjectProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d344654ec827a3b4bc87d8750cac4d2f48b3f11158d00d01bfd16475e040555")
    public override
        fun executionStatus(executionStatus: ExecutionStatusObjectProperty.Builder.() -> Unit): Unit
        = executionStatus(ExecutionStatusObjectProperty(executionStatus))

    public override fun groups(groups: IResolvable) {
      cdkBuilder.groups(groups.let(IResolvable::unwrap))
    }

    public override fun groups(groups: List<Any>) {
      cdkBuilder.groups(groups)
    }

    public override fun metricMonitors(metricMonitors: IResolvable) {
      cdkBuilder.metricMonitors(metricMonitors.let(IResolvable::unwrap))
    }

    public override fun metricMonitors(metricMonitors: List<Any>) {
      cdkBuilder.metricMonitors(metricMonitors)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun project(project: String) {
      cdkBuilder.project(project)
    }

    public override fun randomizationSalt(randomizationSalt: String) {
      cdkBuilder.randomizationSalt(randomizationSalt)
    }

    public override fun scheduledSplitsConfig(scheduledSplitsConfig: IResolvable) {
      cdkBuilder.scheduledSplitsConfig(scheduledSplitsConfig.let(IResolvable::unwrap))
    }

    public override fun scheduledSplitsConfig(scheduledSplitsConfig: List<Any>) {
      cdkBuilder.scheduledSplitsConfig(scheduledSplitsConfig)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.evidently.CfnLaunch = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLaunch {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLaunch(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnLaunch): CfnLaunch =
        CfnLaunch(cdkObject)

    internal fun unwrap(wrapped: CfnLaunch): software.amazon.awscdk.services.evidently.CfnLaunch =
        wrapped.cdkObject
  }

  public interface LaunchGroupObjectProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun feature(): String

    public fun groupName(): String

    public fun variation(): String

    public interface Builder {
      public fun description(description: String) {
      }

      public fun feature(feature: String) {
      }

      public fun groupName(groupName: String) {
      }

      public fun variation(variation: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnLaunch.LaunchGroupObjectProperty.Builder =
          software.amazon.awscdk.services.evidently.CfnLaunch.LaunchGroupObjectProperty.builder()

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun feature(feature: String) {
        cdkBuilder.feature(feature)
      }

      public override fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
      }

      public override fun variation(variation: String) {
        cdkBuilder.variation(variation)
      }

      public fun build():
          software.amazon.awscdk.services.evidently.CfnLaunch.LaunchGroupObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.evidently.CfnLaunch.LaunchGroupObjectProperty,
    ) : LaunchGroupObjectProperty {
      public override fun description(): String? = unwrap(this).getDescription()

      public override fun feature(): String = unwrap(this).getFeature()

      public override fun groupName(): String = unwrap(this).getGroupName()

      public override fun variation(): String = unwrap(this).getVariation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LaunchGroupObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnLaunch.LaunchGroupObjectProperty):
          LaunchGroupObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchGroupObjectProperty):
          software.amazon.awscdk.services.evidently.CfnLaunch.LaunchGroupObjectProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ExecutionStatusObjectProperty {
    public fun desiredState(): String? = unwrap(this).getDesiredState()

    public fun reason(): String? = unwrap(this).getReason()

    public fun status(): String

    public interface Builder {
      public fun desiredState(desiredState: String) {
      }

      public fun reason(reason: String) {
      }

      public fun status(status: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnLaunch.ExecutionStatusObjectProperty.Builder
          =
          software.amazon.awscdk.services.evidently.CfnLaunch.ExecutionStatusObjectProperty.builder()

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
          software.amazon.awscdk.services.evidently.CfnLaunch.ExecutionStatusObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.evidently.CfnLaunch.ExecutionStatusObjectProperty,
    ) : ExecutionStatusObjectProperty {
      public override fun desiredState(): String? = unwrap(this).getDesiredState()

      public override fun reason(): String? = unwrap(this).getReason()

      public override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ExecutionStatusObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnLaunch.ExecutionStatusObjectProperty):
          ExecutionStatusObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExecutionStatusObjectProperty):
          software.amazon.awscdk.services.evidently.CfnLaunch.ExecutionStatusObjectProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface GroupToWeightProperty {
    public fun groupName(): String

    public fun splitWeight(): Number

    public interface Builder {
      public fun groupName(groupName: String) {
      }

      public fun splitWeight(splitWeight: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnLaunch.GroupToWeightProperty.Builder =
          software.amazon.awscdk.services.evidently.CfnLaunch.GroupToWeightProperty.builder()

      public override fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
      }

      public override fun splitWeight(splitWeight: Number) {
        cdkBuilder.splitWeight(splitWeight)
      }

      public fun build(): software.amazon.awscdk.services.evidently.CfnLaunch.GroupToWeightProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.evidently.CfnLaunch.GroupToWeightProperty,
    ) : GroupToWeightProperty {
      public override fun groupName(): String = unwrap(this).getGroupName()

      public override fun splitWeight(): Number = unwrap(this).getSplitWeight()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GroupToWeightProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnLaunch.GroupToWeightProperty):
          GroupToWeightProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GroupToWeightProperty):
          software.amazon.awscdk.services.evidently.CfnLaunch.GroupToWeightProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MetricDefinitionObjectProperty {
    public fun entityIdKey(): String

    public fun eventPattern(): String? = unwrap(this).getEventPattern()

    public fun metricName(): String

    public fun unitLabel(): String? = unwrap(this).getUnitLabel()

    public fun valueKey(): String

    public interface Builder {
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
          software.amazon.awscdk.services.evidently.CfnLaunch.MetricDefinitionObjectProperty.Builder
          =
          software.amazon.awscdk.services.evidently.CfnLaunch.MetricDefinitionObjectProperty.builder()

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
          software.amazon.awscdk.services.evidently.CfnLaunch.MetricDefinitionObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.evidently.CfnLaunch.MetricDefinitionObjectProperty,
    ) : MetricDefinitionObjectProperty {
      public override fun entityIdKey(): String = unwrap(this).getEntityIdKey()

      public override fun eventPattern(): String? = unwrap(this).getEventPattern()

      public override fun metricName(): String = unwrap(this).getMetricName()

      public override fun unitLabel(): String? = unwrap(this).getUnitLabel()

      public override fun valueKey(): String = unwrap(this).getValueKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDefinitionObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnLaunch.MetricDefinitionObjectProperty):
          MetricDefinitionObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDefinitionObjectProperty):
          software.amazon.awscdk.services.evidently.CfnLaunch.MetricDefinitionObjectProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SegmentOverrideProperty {
    public fun evaluationOrder(): Number

    public fun segment(): String

    public fun weights(): Any

    public interface Builder {
      public fun evaluationOrder(evaluationOrder: Number) {
      }

      public fun segment(segment: String) {
      }

      public fun weights(weights: IResolvable) {
      }

      public fun weights(weights: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnLaunch.SegmentOverrideProperty.Builder =
          software.amazon.awscdk.services.evidently.CfnLaunch.SegmentOverrideProperty.builder()

      public override fun evaluationOrder(evaluationOrder: Number) {
        cdkBuilder.evaluationOrder(evaluationOrder)
      }

      public override fun segment(segment: String) {
        cdkBuilder.segment(segment)
      }

      public override fun weights(weights: IResolvable) {
        cdkBuilder.weights(weights.let(IResolvable::unwrap))
      }

      public override fun weights(weights: List<Any>) {
        cdkBuilder.weights(weights)
      }

      public fun build():
          software.amazon.awscdk.services.evidently.CfnLaunch.SegmentOverrideProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.evidently.CfnLaunch.SegmentOverrideProperty,
    ) : SegmentOverrideProperty {
      public override fun evaluationOrder(): Number = unwrap(this).getEvaluationOrder()

      public override fun segment(): String = unwrap(this).getSegment()

      public override fun weights(): Any = unwrap(this).getWeights()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SegmentOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnLaunch.SegmentOverrideProperty):
          SegmentOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SegmentOverrideProperty):
          software.amazon.awscdk.services.evidently.CfnLaunch.SegmentOverrideProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface StepConfigProperty {
    public fun groupWeights(): Any

    public fun segmentOverrides(): Any? = unwrap(this).getSegmentOverrides()

    public fun startTime(): String

    public interface Builder {
      public fun groupWeights(groupWeights: IResolvable) {
      }

      public fun groupWeights(groupWeights: List<Any>) {
      }

      public fun segmentOverrides(segmentOverrides: IResolvable) {
      }

      public fun segmentOverrides(segmentOverrides: List<Any>) {
      }

      public fun startTime(startTime: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnLaunch.StepConfigProperty.Builder =
          software.amazon.awscdk.services.evidently.CfnLaunch.StepConfigProperty.builder()

      public override fun groupWeights(groupWeights: IResolvable) {
        cdkBuilder.groupWeights(groupWeights.let(IResolvable::unwrap))
      }

      public override fun groupWeights(groupWeights: List<Any>) {
        cdkBuilder.groupWeights(groupWeights)
      }

      public override fun segmentOverrides(segmentOverrides: IResolvable) {
        cdkBuilder.segmentOverrides(segmentOverrides.let(IResolvable::unwrap))
      }

      public override fun segmentOverrides(segmentOverrides: List<Any>) {
        cdkBuilder.segmentOverrides(segmentOverrides)
      }

      public override fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
      }

      public fun build(): software.amazon.awscdk.services.evidently.CfnLaunch.StepConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.evidently.CfnLaunch.StepConfigProperty,
    ) : StepConfigProperty {
      public override fun groupWeights(): Any = unwrap(this).getGroupWeights()

      public override fun segmentOverrides(): Any? = unwrap(this).getSegmentOverrides()

      public override fun startTime(): String = unwrap(this).getStartTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StepConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnLaunch.StepConfigProperty):
          StepConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StepConfigProperty):
          software.amazon.awscdk.services.evidently.CfnLaunch.StepConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
