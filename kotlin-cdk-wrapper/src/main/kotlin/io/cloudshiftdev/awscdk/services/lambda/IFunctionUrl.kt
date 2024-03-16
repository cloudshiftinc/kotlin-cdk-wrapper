@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String

/**
 * A Lambda function Url.
 */
public interface IFunctionUrl : IResource {
  /**
   * The ARN of the function this URL refers to.
   */
  public fun functionArn(): String

  /**
   * Grant the given identity permissions to invoke this Lambda Function URL.
   *
   * @param identity 
   */
  public fun grantInvokeUrl(identity: IGrantable): Grant

  /**
   * The url of the Lambda function.
   */
  public fun url(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IFunctionUrl): IFunctionUrl
        = CdkObjectWrappers.wrap(cdkObject) as IFunctionUrl

    internal fun unwrap(wrapped: IFunctionUrl): software.amazon.awscdk.services.lambda.IFunctionUrl
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.IFunctionUrl
  }
}
