@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents a Step Functions Activity
 * https://docs.aws.amazon.com/step-functions/latest/dg/concepts-activities.html.
 */
public interface IActivity : IResource {
  /**
   * The ARN of the activity.
   */
  public fun activityArn(): String

  /**
   * The name of the activity.
   */
  public fun activityName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.IActivity): IActivity
        = CdkObjectWrappers.wrap(cdkObject) as IActivity

    internal fun unwrap(wrapped: IActivity): software.amazon.awscdk.services.stepfunctions.IActivity
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.IActivity
  }
}
