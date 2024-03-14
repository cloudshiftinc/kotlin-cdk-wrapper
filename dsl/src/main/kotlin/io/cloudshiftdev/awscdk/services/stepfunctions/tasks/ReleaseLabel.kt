package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class ReleaseLabel internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel,
) : CdkObject(cdkObject) {
  /**
   * A literal string that contains the release-version ex.
   *
   * 'emr-x.x.x-latest'
   */
  public open fun label(): String = unwrap(this).getLabel()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel):
        ReleaseLabel = ReleaseLabel(cdkObject)

    internal fun unwrap(wrapped: ReleaseLabel):
        software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel = wrapped.cdkObject
  }
}
