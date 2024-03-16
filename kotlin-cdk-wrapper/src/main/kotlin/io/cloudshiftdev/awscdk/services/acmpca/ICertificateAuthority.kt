@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.acmpca

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Interface which all CertificateAuthority based class must implement.
 */
public interface ICertificateAuthority : IResource {
  /**
   * The Amazon Resource Name of the Certificate.
   */
  public fun certificateAuthorityArn(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.ICertificateAuthority):
        ICertificateAuthority = CdkObjectWrappers.wrap(cdkObject) as ICertificateAuthority

    internal fun unwrap(wrapped: ICertificateAuthority):
        software.amazon.awscdk.services.acmpca.ICertificateAuthority = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.acmpca.ICertificateAuthority
  }
}
