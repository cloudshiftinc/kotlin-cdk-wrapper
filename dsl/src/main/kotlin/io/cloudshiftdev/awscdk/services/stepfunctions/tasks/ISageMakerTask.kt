package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal

public interface ISageMakerTask : IGrantable {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ISageMakerTask,
  ) : CdkObject(cdkObject), ISageMakerTask {
    /**
     * The principal to grant permissions to.
     */
    override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ISageMakerTask):
        ISageMakerTask = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISageMakerTask):
        software.amazon.awscdk.services.stepfunctions.tasks.ISageMakerTask = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.ISageMakerTask
  }
}
