@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Interface for lazy string producers.
 */
public interface IStringProducer {
  /**
   * Produce the string value.
   *
   * @param context 
   */
  public fun produce(context: IResolveContext): String?

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IStringProducer): IStringProducer =
        CdkObjectWrappers.wrap(cdkObject) as IStringProducer

    internal fun unwrap(wrapped: IStringProducer): software.amazon.awscdk.IStringProducer = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.IStringProducer
  }
}
