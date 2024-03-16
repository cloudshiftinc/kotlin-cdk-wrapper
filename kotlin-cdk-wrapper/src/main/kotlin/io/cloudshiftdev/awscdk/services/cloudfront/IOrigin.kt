@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents the concept of a CloudFront Origin.
 *
 * You provide one or more origins when creating a Distribution.
 */
public interface IOrigin {
  /**
   * The method called when a given Origin is added (for the first time) to a Distribution.
   *
   * @param scope 
   * @param options 
   */
  public fun bind(scope: Construct, options: OriginBindOptions): OriginBindConfig

  /**
   * The method called when a given Origin is added (for the first time) to a Distribution.
   *
   * @param scope 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a4d8f445ceb4e4ebb177be4645de7fd3d72f0f5d66bcf420280cc1b7bc73b342")
  public fun bind(scope: Construct, options: OriginBindOptions.Builder.() -> Unit): OriginBindConfig

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IOrigin): IOrigin =
        CdkObjectWrappers.wrap(cdkObject) as IOrigin

    internal fun unwrap(wrapped: IOrigin): software.amazon.awscdk.services.cloudfront.IOrigin =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.IOrigin
  }
}
