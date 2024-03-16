@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.signer

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A Signer Profile.
 */
public interface ISigningProfile : IResource {
  /**
   * The ARN of the signing profile.
   */
  public fun signingProfileArn(): String

  /**
   * The name of signing profile.
   */
  public fun signingProfileName(): String

  /**
   * The version of signing profile.
   */
  public fun signingProfileVersion(): String

  /**
   * The ARN of signing profile version.
   */
  public fun signingProfileVersionArn(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.signer.ISigningProfile):
        ISigningProfile = CdkObjectWrappers.wrap(cdkObject) as ISigningProfile

    internal fun unwrap(wrapped: ISigningProfile):
        software.amazon.awscdk.services.signer.ISigningProfile = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.signer.ISigningProfile
  }
}
