@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A KMS Key alias.
 *
 * An alias can be used in all places that expect a key.
 */
public interface IAlias : IKey {
  /**
   * The name of the alias.
   */
  public fun aliasName(): String

  /**
   * The Key to which the Alias refers.
   */
  public fun aliasTargetKey(): IKey

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.IAlias): IAlias =
        CdkObjectWrappers.wrap(cdkObject) as IAlias

    internal fun unwrap(wrapped: IAlias): software.amazon.awscdk.services.kms.IAlias = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kms.IAlias
  }
}
