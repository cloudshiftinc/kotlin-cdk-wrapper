@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnTaskProps {
  public fun cloudWatchLogGroupArn(): String? = unwrap(this).getCloudWatchLogGroupArn()

  public fun destinationLocationArn(): String

  public fun excludes(): Any? = unwrap(this).getExcludes()

  public fun includes(): Any? = unwrap(this).getIncludes()

  public fun name(): String? = unwrap(this).getName()

  public fun options(): Any? = unwrap(this).getOptions()

  public fun schedule(): Any? = unwrap(this).getSchedule()

  public fun sourceLocationArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun taskReportConfig(): Any? = unwrap(this).getTaskReportConfig()

  @CdkDslMarker
  public interface Builder {
    public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String)

    public fun destinationLocationArn(destinationLocationArn: String)

    public fun excludes(excludes: IResolvable)

    public fun excludes(excludes: List<Any>)

    public fun excludes(vararg excludes: Any)

    public fun includes(includes: IResolvable)

    public fun includes(includes: List<Any>)

    public fun includes(vararg includes: Any)

    public fun name(name: String)

    public fun options(options: IResolvable)

    public fun options(options: CfnTask.OptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1abaf271dd52396527a8a77c9fdad5bc3db1d413aea3a94f2532b919def4e4fc")
    public fun options(options: CfnTask.OptionsProperty.Builder.() -> Unit)

    public fun schedule(schedule: IResolvable)

    public fun schedule(schedule: CfnTask.TaskScheduleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0169cab530a382b35b03f2071af7adf6d987732207f0c711c7d71b861cec8fd")
    public fun schedule(schedule: CfnTask.TaskScheduleProperty.Builder.() -> Unit)

    public fun sourceLocationArn(sourceLocationArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun taskReportConfig(taskReportConfig: IResolvable)

    public fun taskReportConfig(taskReportConfig: CfnTask.TaskReportConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e79cf2a5c9ab4868b668a0c4a6cfc11bdbda75a184e0540286ff4d950747b38")
    public
        fun taskReportConfig(taskReportConfig: CfnTask.TaskReportConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnTaskProps.Builder =
        software.amazon.awscdk.services.datasync.CfnTaskProps.builder()

    override fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
      cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
    }

    override fun destinationLocationArn(destinationLocationArn: String) {
      cdkBuilder.destinationLocationArn(destinationLocationArn)
    }

    override fun excludes(excludes: IResolvable) {
      cdkBuilder.excludes(excludes.let(IResolvable::unwrap))
    }

    override fun excludes(excludes: List<Any>) {
      cdkBuilder.excludes(excludes)
    }

    override fun excludes(vararg excludes: Any): Unit = excludes(excludes.toList())

    override fun includes(includes: IResolvable) {
      cdkBuilder.includes(includes.let(IResolvable::unwrap))
    }

    override fun includes(includes: List<Any>) {
      cdkBuilder.includes(includes)
    }

    override fun includes(vararg includes: Any): Unit = includes(includes.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun options(options: IResolvable) {
      cdkBuilder.options(options.let(IResolvable::unwrap))
    }

    override fun options(options: CfnTask.OptionsProperty) {
      cdkBuilder.options(options.let(CfnTask.OptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1abaf271dd52396527a8a77c9fdad5bc3db1d413aea3a94f2532b919def4e4fc")
    override fun options(options: CfnTask.OptionsProperty.Builder.() -> Unit): Unit =
        options(CfnTask.OptionsProperty(options))

    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    override fun schedule(schedule: CfnTask.TaskScheduleProperty) {
      cdkBuilder.schedule(schedule.let(CfnTask.TaskScheduleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0169cab530a382b35b03f2071af7adf6d987732207f0c711c7d71b861cec8fd")
    override fun schedule(schedule: CfnTask.TaskScheduleProperty.Builder.() -> Unit): Unit =
        schedule(CfnTask.TaskScheduleProperty(schedule))

    override fun sourceLocationArn(sourceLocationArn: String) {
      cdkBuilder.sourceLocationArn(sourceLocationArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun taskReportConfig(taskReportConfig: IResolvable) {
      cdkBuilder.taskReportConfig(taskReportConfig.let(IResolvable::unwrap))
    }

    override fun taskReportConfig(taskReportConfig: CfnTask.TaskReportConfigProperty) {
      cdkBuilder.taskReportConfig(taskReportConfig.let(CfnTask.TaskReportConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e79cf2a5c9ab4868b668a0c4a6cfc11bdbda75a184e0540286ff4d950747b38")
    override
        fun taskReportConfig(taskReportConfig: CfnTask.TaskReportConfigProperty.Builder.() -> Unit):
        Unit = taskReportConfig(CfnTask.TaskReportConfigProperty(taskReportConfig))

    public fun build(): software.amazon.awscdk.services.datasync.CfnTaskProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datasync.CfnTaskProps,
  ) : CdkObject(cdkObject), CfnTaskProps {
    override fun cloudWatchLogGroupArn(): String? = unwrap(this).getCloudWatchLogGroupArn()

    override fun destinationLocationArn(): String = unwrap(this).getDestinationLocationArn()

    override fun excludes(): Any? = unwrap(this).getExcludes()

    override fun includes(): Any? = unwrap(this).getIncludes()

    override fun name(): String? = unwrap(this).getName()

    override fun options(): Any? = unwrap(this).getOptions()

    override fun schedule(): Any? = unwrap(this).getSchedule()

    override fun sourceLocationArn(): String = unwrap(this).getSourceLocationArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun taskReportConfig(): Any? = unwrap(this).getTaskReportConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTaskProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTaskProps):
        CfnTaskProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTaskProps):
        software.amazon.awscdk.services.datasync.CfnTaskProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.datasync.CfnTaskProps
  }
}
