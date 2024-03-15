@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.evidently

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnLaunchProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun executionStatus(): Any? = unwrap(this).getExecutionStatus()

  public fun groups(): Any

  public fun metricMonitors(): Any? = unwrap(this).getMetricMonitors()

  public fun name(): String

  public fun project(): String

  public fun randomizationSalt(): String? = unwrap(this).getRandomizationSalt()

  public fun scheduledSplitsConfig(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun executionStatus(executionStatus: IResolvable)

    public fun executionStatus(executionStatus: CfnLaunch.ExecutionStatusObjectProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36eeb8846682a7d1705b35c29c63ee12d2c016160fc4d80d810b27869d96a6ee")
    public
        fun executionStatus(executionStatus: CfnLaunch.ExecutionStatusObjectProperty.Builder.() -> Unit)

    public fun groups(groups: IResolvable)

    public fun groups(groups: List<Any>)

    public fun groups(vararg groups: Any)

    public fun metricMonitors(metricMonitors: IResolvable)

    public fun metricMonitors(metricMonitors: List<Any>)

    public fun metricMonitors(vararg metricMonitors: Any)

    public fun name(name: String)

    public fun project(project: String)

    public fun randomizationSalt(randomizationSalt: String)

    public fun scheduledSplitsConfig(scheduledSplitsConfig: IResolvable)

    public fun scheduledSplitsConfig(scheduledSplitsConfig: List<Any>)

    public fun scheduledSplitsConfig(vararg scheduledSplitsConfig: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.evidently.CfnLaunchProps.Builder =
        software.amazon.awscdk.services.evidently.CfnLaunchProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun executionStatus(executionStatus: IResolvable) {
      cdkBuilder.executionStatus(executionStatus.let(IResolvable::unwrap))
    }

    override fun executionStatus(executionStatus: CfnLaunch.ExecutionStatusObjectProperty) {
      cdkBuilder.executionStatus(executionStatus.let(CfnLaunch.ExecutionStatusObjectProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36eeb8846682a7d1705b35c29c63ee12d2c016160fc4d80d810b27869d96a6ee")
    override
        fun executionStatus(executionStatus: CfnLaunch.ExecutionStatusObjectProperty.Builder.() -> Unit):
        Unit = executionStatus(CfnLaunch.ExecutionStatusObjectProperty(executionStatus))

    override fun groups(groups: IResolvable) {
      cdkBuilder.groups(groups.let(IResolvable::unwrap))
    }

    override fun groups(groups: List<Any>) {
      cdkBuilder.groups(groups)
    }

    override fun groups(vararg groups: Any): Unit = groups(groups.toList())

    override fun metricMonitors(metricMonitors: IResolvable) {
      cdkBuilder.metricMonitors(metricMonitors.let(IResolvable::unwrap))
    }

    override fun metricMonitors(metricMonitors: List<Any>) {
      cdkBuilder.metricMonitors(metricMonitors)
    }

    override fun metricMonitors(vararg metricMonitors: Any): Unit =
        metricMonitors(metricMonitors.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun project(project: String) {
      cdkBuilder.project(project)
    }

    override fun randomizationSalt(randomizationSalt: String) {
      cdkBuilder.randomizationSalt(randomizationSalt)
    }

    override fun scheduledSplitsConfig(scheduledSplitsConfig: IResolvable) {
      cdkBuilder.scheduledSplitsConfig(scheduledSplitsConfig.let(IResolvable::unwrap))
    }

    override fun scheduledSplitsConfig(scheduledSplitsConfig: List<Any>) {
      cdkBuilder.scheduledSplitsConfig(scheduledSplitsConfig)
    }

    override fun scheduledSplitsConfig(vararg scheduledSplitsConfig: Any): Unit =
        scheduledSplitsConfig(scheduledSplitsConfig.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.evidently.CfnLaunchProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.evidently.CfnLaunchProps,
  ) : CdkObject(cdkObject), CfnLaunchProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun executionStatus(): Any? = unwrap(this).getExecutionStatus()

    override fun groups(): Any = unwrap(this).getGroups()

    override fun metricMonitors(): Any? = unwrap(this).getMetricMonitors()

    override fun name(): String = unwrap(this).getName()

    override fun project(): String = unwrap(this).getProject()

    override fun randomizationSalt(): String? = unwrap(this).getRandomizationSalt()

    override fun scheduledSplitsConfig(): Any = unwrap(this).getScheduledSplitsConfig()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLaunchProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnLaunchProps):
        CfnLaunchProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchProps):
        software.amazon.awscdk.services.evidently.CfnLaunchProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.evidently.CfnLaunchProps
  }
}
