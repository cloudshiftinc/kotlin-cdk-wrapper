@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 *
 */
public interface IValidator {
  /**
   * The content of the validator.
   */
  public fun content(): String

  /**
   * The type of validator.
   */
  public fun type(): ValidatorType

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.IValidator): IValidator =
        CdkObjectWrappers.wrap(cdkObject) as IValidator

    internal fun unwrap(wrapped: IValidator): software.amazon.awscdk.services.appconfig.IValidator =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.IValidator
  }
}
