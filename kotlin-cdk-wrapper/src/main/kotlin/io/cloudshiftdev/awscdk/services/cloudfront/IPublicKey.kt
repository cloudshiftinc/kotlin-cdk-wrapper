@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents a Public Key.
 */
public interface IPublicKey : IResource {
  /**
   * The ID of the key group.
   */
  public fun publicKeyId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IPublicKey): IPublicKey
        = CdkObjectWrappers.wrap(cdkObject) as IPublicKey

    internal fun unwrap(wrapped: IPublicKey): software.amazon.awscdk.services.cloudfront.IPublicKey
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.IPublicKey
  }
}
