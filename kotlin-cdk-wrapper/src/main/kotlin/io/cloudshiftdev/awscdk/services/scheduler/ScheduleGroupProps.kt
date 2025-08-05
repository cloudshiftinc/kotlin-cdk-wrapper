@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for a Schedule Group.
 *
 * Example:
 *
 * ```
 * LambdaInvoke target;
 * ScheduleGroup scheduleGroup = ScheduleGroup.Builder.create(this, "ScheduleGroup")
 * .scheduleGroupName("MyScheduleGroup")
 * .build();
 * Schedule.Builder.create(this, "Schedule")
 * .schedule(ScheduleExpression.rate(Duration.minutes(10)))
 * .target(target)
 * .scheduleGroup(scheduleGroup)
 * .build();
 * ```
 */
public interface ScheduleGroupProps {
  /**
   * The removal policy for the group.
   *
   * If the group is removed also all schedules are removed.
   *
   * Default: RemovalPolicy.RETAIN
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * The name of the schedule group.
   *
   * Up to 64 letters (uppercase and lowercase), numbers, hyphens, underscores and dots are allowed.
   *
   * Default: - A unique name will be generated
   */
  public fun scheduleGroupName(): String? = unwrap(this).getScheduleGroupName()

  /**
   * A builder for [ScheduleGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param removalPolicy The removal policy for the group.
     * If the group is removed also all schedules are removed.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param scheduleGroupName The name of the schedule group.
     * Up to 64 letters (uppercase and lowercase), numbers, hyphens, underscores and dots are
     * allowed.
     */
    public fun scheduleGroupName(scheduleGroupName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.scheduler.ScheduleGroupProps.Builder =
        software.amazon.awscdk.services.scheduler.ScheduleGroupProps.builder()

    /**
     * @param removalPolicy The removal policy for the group.
     * If the group is removed also all schedules are removed.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * @param scheduleGroupName The name of the schedule group.
     * Up to 64 letters (uppercase and lowercase), numbers, hyphens, underscores and dots are
     * allowed.
     */
    override fun scheduleGroupName(scheduleGroupName: String) {
      cdkBuilder.scheduleGroupName(scheduleGroupName)
    }

    public fun build(): software.amazon.awscdk.services.scheduler.ScheduleGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.scheduler.ScheduleGroupProps,
  ) : CdkObject(cdkObject),
      ScheduleGroupProps {
    /**
     * The removal policy for the group.
     *
     * If the group is removed also all schedules are removed.
     *
     * Default: RemovalPolicy.RETAIN
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * The name of the schedule group.
     *
     * Up to 64 letters (uppercase and lowercase), numbers, hyphens, underscores and dots are
     * allowed.
     *
     * Default: - A unique name will be generated
     */
    override fun scheduleGroupName(): String? = unwrap(this).getScheduleGroupName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.ScheduleGroupProps):
        ScheduleGroupProps = CdkObjectWrappers.wrap(cdkObject) as? ScheduleGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScheduleGroupProps):
        software.amazon.awscdk.services.scheduler.ScheduleGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.scheduler.ScheduleGroupProps
  }
}
