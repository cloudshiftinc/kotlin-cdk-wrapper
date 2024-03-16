@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents a reference to a CodeDeploy Application deploying to AWS Lambda.
 *
 * If you're managing the Application alongside the rest of your CDK resources,
 * use the `LambdaApplication` class.
 *
 * If you want to reference an already existing Application,
 * or one defined in a different CDK Stack,
 * use the `LambdaApplication#fromLambdaApplicationName` method.
 */
public interface ILambdaApplication : IResource {
  /**
   *
   */
  public fun applicationArn(): String

  /**
   *
   */
  public fun applicationName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.ILambdaApplication):
        ILambdaApplication = CdkObjectWrappers.wrap(cdkObject) as ILambdaApplication

    internal fun unwrap(wrapped: ILambdaApplication):
        software.amazon.awscdk.services.codedeploy.ILambdaApplication = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.ILambdaApplication
  }
}
