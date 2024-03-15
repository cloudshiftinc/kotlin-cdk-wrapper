@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String

public abstract class Timeout internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.Timeout,
) : CdkObject(cdkObject) {
  public open fun path(): String? = unwrap(this).getPath()

  public open fun seconds(): Number? = unwrap(this).getSeconds()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.Timeout,
  ) : Timeout(cdkObject)

  public companion object {
    public fun at(path: String): Timeout =
        software.amazon.awscdk.services.stepfunctions.Timeout.at(path).let(Timeout::wrap)

    public fun duration(duration: Duration): Timeout =
        software.amazon.awscdk.services.stepfunctions.Timeout.duration(duration.let(Duration::unwrap)).let(Timeout::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Timeout): Timeout =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Timeout): software.amazon.awscdk.services.stepfunctions.Timeout =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.Timeout
  }
}
