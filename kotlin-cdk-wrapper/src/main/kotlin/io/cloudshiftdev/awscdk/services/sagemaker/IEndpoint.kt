@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String

/**
 * The interface for a SageMaker Endpoint resource.
 */
public interface IEndpoint : IResource {
  /**
   * The ARN of the endpoint.
   */
  public fun endpointArn(): String

  /**
   * The name of the endpoint.
   */
  public fun endpointName(): String

  /**
   * Permits an IAM principal to invoke this endpoint.
   *
   * @param grantee The principal to grant access to. 
   */
  public fun grantInvoke(grantee: IGrantable): Grant

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.IEndpoint): IEndpoint =
        CdkObjectWrappers.wrap(cdkObject) as IEndpoint

    internal fun unwrap(wrapped: IEndpoint): software.amazon.awscdk.services.sagemaker.IEndpoint =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.IEndpoint
  }
}
