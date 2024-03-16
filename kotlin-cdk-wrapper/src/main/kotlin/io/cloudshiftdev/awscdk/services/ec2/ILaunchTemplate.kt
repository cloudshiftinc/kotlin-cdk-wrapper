@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Interface for LaunchTemplate-like objects.
 */
public interface ILaunchTemplate : IResource {
  /**
   * The identifier of the Launch Template.
   *
   * Exactly one of `launchTemplateId` and `launchTemplateName` will be set.
   */
  public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

  /**
   * The name of the Launch Template.
   *
   * Exactly one of `launchTemplateId` and `launchTemplateName` will be set.
   */
  public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

  /**
   * The version number of this launch template to use.
   */
  public fun versionNumber(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ILaunchTemplate):
        ILaunchTemplate = CdkObjectWrappers.wrap(cdkObject) as ILaunchTemplate

    internal fun unwrap(wrapped: ILaunchTemplate):
        software.amazon.awscdk.services.ec2.ILaunchTemplate = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.ILaunchTemplate
  }
}
