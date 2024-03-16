@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IGrantable

/**
 * Task to train a machine learning model using Amazon SageMaker.
 */
public interface ISageMakerTask : IGrantable {
  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ISageMakerTask):
        ISageMakerTask = CdkObjectWrappers.wrap(cdkObject) as ISageMakerTask

    internal fun unwrap(wrapped: ISageMakerTask):
        software.amazon.awscdk.services.stepfunctions.tasks.ISageMakerTask = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.ISageMakerTask
  }
}
