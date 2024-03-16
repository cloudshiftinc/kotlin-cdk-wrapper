@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A SAML provider.
 */
public interface ISamlProvider : IResource {
  /**
   * The Amazon Resource Name (ARN) of the provider.
   */
  public fun samlProviderArn(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.ISamlProvider): ISamlProvider =
        CdkObjectWrappers.wrap(cdkObject) as ISamlProvider

    internal fun unwrap(wrapped: ISamlProvider): software.amazon.awscdk.services.iam.ISamlProvider =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.ISamlProvider
  }
}
