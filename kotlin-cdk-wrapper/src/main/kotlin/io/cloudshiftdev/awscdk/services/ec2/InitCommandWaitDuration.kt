@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Represents a duration to wait after a command has finished, in case of a reboot (Windows only).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * InitCommandWaitDuration initCommandWaitDuration = InitCommandWaitDuration.forever();
 * ```
 */
public abstract class InitCommandWaitDuration(
  cdkObject: software.amazon.awscdk.services.ec2.InitCommandWaitDuration,
) : CdkObject(cdkObject) {
  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.InitCommandWaitDuration,
  ) : InitCommandWaitDuration(cdkObject)

  public companion object {
    public fun forever(): InitCommandWaitDuration =
        software.amazon.awscdk.services.ec2.InitCommandWaitDuration.forever().let(InitCommandWaitDuration::wrap)

    public fun none(): InitCommandWaitDuration =
        software.amazon.awscdk.services.ec2.InitCommandWaitDuration.none().let(InitCommandWaitDuration::wrap)

    public fun of(duration: Duration): InitCommandWaitDuration =
        software.amazon.awscdk.services.ec2.InitCommandWaitDuration.of(duration.let(Duration::unwrap)).let(InitCommandWaitDuration::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitCommandWaitDuration):
        InitCommandWaitDuration = CdkObjectWrappers.wrap(cdkObject) as? InitCommandWaitDuration ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: InitCommandWaitDuration):
        software.amazon.awscdk.services.ec2.InitCommandWaitDuration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.InitCommandWaitDuration
  }
}
