package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

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
