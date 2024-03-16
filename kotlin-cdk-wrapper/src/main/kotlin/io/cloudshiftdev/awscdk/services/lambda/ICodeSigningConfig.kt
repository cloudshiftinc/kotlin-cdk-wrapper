@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A Code Signing Config.
 */
public interface ICodeSigningConfig : IResource {
  /**
   * The ARN of Code Signing Config.
   */
  public fun codeSigningConfigArn(): String

  /**
   * The id of Code Signing Config.
   */
  public fun codeSigningConfigId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.ICodeSigningConfig):
        ICodeSigningConfig = CdkObjectWrappers.wrap(cdkObject) as ICodeSigningConfig

    internal fun unwrap(wrapped: ICodeSigningConfig):
        software.amazon.awscdk.services.lambda.ICodeSigningConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.ICodeSigningConfig
  }
}
