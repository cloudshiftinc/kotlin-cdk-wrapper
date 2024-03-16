@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents a reference to a CodeDeploy Application deploying to Amazon ECS.
 *
 * If you're managing the Application alongside the rest of your CDK resources,
 * use the `EcsApplication` class.
 *
 * If you want to reference an already existing Application,
 * or one defined in a different CDK Stack,
 * use the `EcsApplication#fromEcsApplicationName` method.
 */
public interface IEcsApplication : IResource {
  /**
   *
   */
  public fun applicationArn(): String

  /**
   *
   */
  public fun applicationName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.IEcsApplication):
        IEcsApplication = CdkObjectWrappers.wrap(cdkObject) as IEcsApplication

    internal fun unwrap(wrapped: IEcsApplication):
        software.amazon.awscdk.services.codedeploy.IEcsApplication = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.IEcsApplication
  }
}
