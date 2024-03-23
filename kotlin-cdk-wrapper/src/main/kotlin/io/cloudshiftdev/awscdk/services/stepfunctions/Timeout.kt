@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String

/**
 * Timeout for a task or heartbeat.
 *
 * Example:
 *
 * ```
 * GlueStartJobRun.Builder.create(this, "Task")
 * .glueJobName("my-glue-job")
 * .arguments(TaskInput.fromObject(Map.of(
 * "key", "value")))
 * .taskTimeout(Timeout.duration(Duration.minutes(30)))
 * .notifyDelayAfter(Duration.minutes(5))
 * .build();
 * ```
 */
public abstract class Timeout(
  cdkObject: software.amazon.awscdk.services.stepfunctions.Timeout,
) : CdkObject(cdkObject) {
  /**
   * Path for this timeout.
   */
  public open fun path(): String? = unwrap(this).getPath()

  /**
   * Seconds for this timeout.
   */
  public open fun seconds(): Number? = unwrap(this).getSeconds()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.Timeout,
  ) : Timeout(cdkObject)

  public companion object {
    public fun at(path: String): Timeout =
        software.amazon.awscdk.services.stepfunctions.Timeout.at(path).let(Timeout::wrap)

    public fun duration(duration: Duration): Timeout =
        software.amazon.awscdk.services.stepfunctions.Timeout.duration(duration.let(Duration::unwrap)).let(Timeout::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Timeout): Timeout =
        CdkObjectWrappers.wrap(cdkObject) as? Timeout ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Timeout): software.amazon.awscdk.services.stepfunctions.Timeout =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.Timeout
  }
}
