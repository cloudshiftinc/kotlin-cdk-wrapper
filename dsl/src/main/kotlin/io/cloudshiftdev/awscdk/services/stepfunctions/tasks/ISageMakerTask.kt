package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal

public interface ISageMakerTask : IGrantable {
  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ISageMakerTask,
  ) : ISageMakerTask {
    public override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ISageMakerTask):
        ISageMakerTask = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISageMakerTask):
        software.amazon.awscdk.services.stepfunctions.tasks.ISageMakerTask = (wrapped as
        Wrapper).cdkObject
  }
}
