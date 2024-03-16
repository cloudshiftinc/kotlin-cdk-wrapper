@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents an IAM Access Key.
 *
 * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_access-keys.html)
 */
public interface IAccessKey : IResource {
  /**
   * The Access Key ID.
   */
  public fun accessKeyId(): String

  /**
   * The Secret Access Key.
   */
  public fun secretAccessKey(): SecretValue

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IAccessKey): IAccessKey =
        CdkObjectWrappers.wrap(cdkObject) as IAccessKey

    internal fun unwrap(wrapped: IAccessKey): software.amazon.awscdk.services.iam.IAccessKey =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.IAccessKey
  }
}
