@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.evidently

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnExperimentProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun metricGoals(): Any

  public fun name(): String

  public fun onlineAbConfig(): Any

  public fun project(): String

  public fun randomizationSalt(): String? = unwrap(this).getRandomizationSalt()

  public fun removeSegment(): Any? = unwrap(this).getRemoveSegment()

  public fun runningStatus(): Any? = unwrap(this).getRunningStatus()

  public fun samplingRate(): Number? = unwrap(this).getSamplingRate()

  public fun segment(): String? = unwrap(this).getSegment()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun treatments(): Any

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun metricGoals(metricGoals: IResolvable)

    public fun metricGoals(metricGoals: List<Any>)

    public fun metricGoals(vararg metricGoals: Any)

    public fun name(name: String)

    public fun onlineAbConfig(onlineAbConfig: IResolvable)

    public fun onlineAbConfig(onlineAbConfig: CfnExperiment.OnlineAbConfigObjectProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("015a13849e9bfcbfc1dd35610162c7fdcc377de451a0e0ed70b2e7cd1b6f3877")
    public
        fun onlineAbConfig(onlineAbConfig: CfnExperiment.OnlineAbConfigObjectProperty.Builder.() -> Unit)

    public fun project(project: String)

    public fun randomizationSalt(randomizationSalt: String)

    public fun removeSegment(removeSegment: Boolean)

    public fun removeSegment(removeSegment: IResolvable)

    public fun runningStatus(runningStatus: IResolvable)

    public fun runningStatus(runningStatus: CfnExperiment.RunningStatusObjectProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4013e92ad46a88640dfd1a6d963a00423de70ce9869df03f2e4309e2171161fa")
    public
        fun runningStatus(runningStatus: CfnExperiment.RunningStatusObjectProperty.Builder.() -> Unit)

    public fun samplingRate(samplingRate: Number)

    public fun segment(segment: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun treatments(treatments: IResolvable)

    public fun treatments(treatments: List<Any>)

    public fun treatments(vararg treatments: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.evidently.CfnExperimentProps.Builder =
        software.amazon.awscdk.services.evidently.CfnExperimentProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun metricGoals(metricGoals: IResolvable) {
      cdkBuilder.metricGoals(metricGoals.let(IResolvable::unwrap))
    }

    override fun metricGoals(metricGoals: List<Any>) {
      cdkBuilder.metricGoals(metricGoals)
    }

    override fun metricGoals(vararg metricGoals: Any): Unit = metricGoals(metricGoals.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun onlineAbConfig(onlineAbConfig: IResolvable) {
      cdkBuilder.onlineAbConfig(onlineAbConfig.let(IResolvable::unwrap))
    }

    override fun onlineAbConfig(onlineAbConfig: CfnExperiment.OnlineAbConfigObjectProperty) {
      cdkBuilder.onlineAbConfig(onlineAbConfig.let(CfnExperiment.OnlineAbConfigObjectProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("015a13849e9bfcbfc1dd35610162c7fdcc377de451a0e0ed70b2e7cd1b6f3877")
    override
        fun onlineAbConfig(onlineAbConfig: CfnExperiment.OnlineAbConfigObjectProperty.Builder.() -> Unit):
        Unit = onlineAbConfig(CfnExperiment.OnlineAbConfigObjectProperty(onlineAbConfig))

    override fun project(project: String) {
      cdkBuilder.project(project)
    }

    override fun randomizationSalt(randomizationSalt: String) {
      cdkBuilder.randomizationSalt(randomizationSalt)
    }

    override fun removeSegment(removeSegment: Boolean) {
      cdkBuilder.removeSegment(removeSegment)
    }

    override fun removeSegment(removeSegment: IResolvable) {
      cdkBuilder.removeSegment(removeSegment.let(IResolvable::unwrap))
    }

    override fun runningStatus(runningStatus: IResolvable) {
      cdkBuilder.runningStatus(runningStatus.let(IResolvable::unwrap))
    }

    override fun runningStatus(runningStatus: CfnExperiment.RunningStatusObjectProperty) {
      cdkBuilder.runningStatus(runningStatus.let(CfnExperiment.RunningStatusObjectProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4013e92ad46a88640dfd1a6d963a00423de70ce9869df03f2e4309e2171161fa")
    override
        fun runningStatus(runningStatus: CfnExperiment.RunningStatusObjectProperty.Builder.() -> Unit):
        Unit = runningStatus(CfnExperiment.RunningStatusObjectProperty(runningStatus))

    override fun samplingRate(samplingRate: Number) {
      cdkBuilder.samplingRate(samplingRate)
    }

    override fun segment(segment: String) {
      cdkBuilder.segment(segment)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun treatments(treatments: IResolvable) {
      cdkBuilder.treatments(treatments.let(IResolvable::unwrap))
    }

    override fun treatments(treatments: List<Any>) {
      cdkBuilder.treatments(treatments)
    }

    override fun treatments(vararg treatments: Any): Unit = treatments(treatments.toList())

    public fun build(): software.amazon.awscdk.services.evidently.CfnExperimentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.evidently.CfnExperimentProps,
  ) : CdkObject(cdkObject), CfnExperimentProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun metricGoals(): Any = unwrap(this).getMetricGoals()

    override fun name(): String = unwrap(this).getName()

    override fun onlineAbConfig(): Any = unwrap(this).getOnlineAbConfig()

    override fun project(): String = unwrap(this).getProject()

    override fun randomizationSalt(): String? = unwrap(this).getRandomizationSalt()

    override fun removeSegment(): Any? = unwrap(this).getRemoveSegment()

    override fun runningStatus(): Any? = unwrap(this).getRunningStatus()

    override fun samplingRate(): Number? = unwrap(this).getSamplingRate()

    override fun segment(): String? = unwrap(this).getSegment()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun treatments(): Any = unwrap(this).getTreatments()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnExperimentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnExperimentProps):
        CfnExperimentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnExperimentProps):
        software.amazon.awscdk.services.evidently.CfnExperimentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.evidently.CfnExperimentProps
  }
}
