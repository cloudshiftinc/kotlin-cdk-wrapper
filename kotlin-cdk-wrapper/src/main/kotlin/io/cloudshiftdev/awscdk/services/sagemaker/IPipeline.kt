@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String

/**
 * The interface for a SageMaker Pipeline resource.
 */
public interface IPipeline : IResource {
  /**
   * Permits an IAM principal to start this pipeline execution.
   *
   * @param grantee The principal to grant access to. 
   */
  public fun grantStartPipelineExecution(grantee: IGrantable): Grant

  /**
   * The ARN of the pipeline.
   */
  public fun pipelineArn(): String

  /**
   * The name of the pipeline.
   */
  public fun pipelineName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.IPipeline): IPipeline =
        CdkObjectWrappers.wrap(cdkObject) as IPipeline

    internal fun unwrap(wrapped: IPipeline): software.amazon.awscdk.services.sagemaker.IPipeline =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.IPipeline
  }
}
