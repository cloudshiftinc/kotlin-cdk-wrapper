@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String

/**
 * The interface representing the ReportGroup resource - either an existing one, imported using the
 * `ReportGroup.fromReportGroupName` method, or a new one, created with the `ReportGroup` class.
 */
public interface IReportGroup : IResource {
  /**
   * Grants the given entity permissions to write (that is, upload reports to) this report group.
   *
   * @param identity 
   */
  public fun grantWrite(identity: IGrantable): Grant

  /**
   * The ARN of the ReportGroup.
   */
  public fun reportGroupArn(): String

  /**
   * The name of the ReportGroup.
   */
  public fun reportGroupName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.IReportGroup):
        IReportGroup = CdkObjectWrappers.wrap(cdkObject) as IReportGroup

    internal fun unwrap(wrapped: IReportGroup):
        software.amazon.awscdk.services.codebuild.IReportGroup = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codebuild.IReportGroup
  }
}
