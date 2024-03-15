@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * A class that provides convenient access to special version tokens for LaunchTemplate versions.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * LaunchTemplateSpecialVersions launchTemplateSpecialVersions = new
 * LaunchTemplateSpecialVersions();
 * ```
 */
public open class LaunchTemplateSpecialVersions internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.LaunchTemplateSpecialVersions,
) : CdkObject(cdkObject) {
  public companion object {
    public val DEFAULT_VERSION: String =
        software.amazon.awscdk.services.ec2.LaunchTemplateSpecialVersions.DEFAULT_VERSION

    public val LATEST_VERSION: String =
        software.amazon.awscdk.services.ec2.LaunchTemplateSpecialVersions.LATEST_VERSION

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LaunchTemplateSpecialVersions):
        LaunchTemplateSpecialVersions = LaunchTemplateSpecialVersions(cdkObject)

    internal fun unwrap(wrapped: LaunchTemplateSpecialVersions):
        software.amazon.awscdk.services.ec2.LaunchTemplateSpecialVersions = wrapped.cdkObject
  }
}
