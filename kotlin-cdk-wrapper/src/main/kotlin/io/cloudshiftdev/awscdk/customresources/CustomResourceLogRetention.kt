@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.IAspect
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.constructs.IConstruct

/**
 * Manages log retention for AWS-vended custom resources.
 *
 * This feature is currently experimental.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * import io.cloudshiftdev.awscdk.customresources.*;
 * CustomResourceLogRetention customResourceLogRetention = new
 * CustomResourceLogRetention(RetentionDays.ONE_DAY);
 * ```
 */
public open class CustomResourceLogRetention(
  cdkObject: software.amazon.awscdk.customresources.CustomResourceLogRetention,
) : CdkObject(cdkObject),
    IAspect {
  public constructor(setLogRetention: RetentionDays) :
      this(software.amazon.awscdk.customresources.CustomResourceLogRetention(setLogRetention.let(RetentionDays.Companion::unwrap))
  )

  /**
   * All aspects can visit an IConstruct.
   *
   * @param node 
   */
  public override fun visit(node: IConstruct) {
    unwrap(this).visit(node.let(IConstruct.Companion::unwrap))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.CustomResourceLogRetention):
        CustomResourceLogRetention = CustomResourceLogRetention(cdkObject)

    internal fun unwrap(wrapped: CustomResourceLogRetention):
        software.amazon.awscdk.customresources.CustomResourceLogRetention = wrapped.cdkObject as
        software.amazon.awscdk.customresources.CustomResourceLogRetention
  }
}
