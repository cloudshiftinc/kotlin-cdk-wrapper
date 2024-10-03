@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.IAspect
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct

/**
 * Manages removal policy for AWS-vended custom resources.
 *
 * This feature is currently experimental.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.customresources.*;
 * CustomResourceRemovalPolicy customResourceRemovalPolicy = new
 * CustomResourceRemovalPolicy(RemovalPolicy.DESTROY);
 * ```
 */
public open class CustomResourceRemovalPolicy(
  cdkObject: software.amazon.awscdk.customresources.CustomResourceRemovalPolicy,
) : CdkObject(cdkObject),
    IAspect {
  public constructor(removalPolicy: RemovalPolicy) :
      this(software.amazon.awscdk.customresources.CustomResourceRemovalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
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
    internal
        fun wrap(cdkObject: software.amazon.awscdk.customresources.CustomResourceRemovalPolicy):
        CustomResourceRemovalPolicy = CustomResourceRemovalPolicy(cdkObject)

    internal fun unwrap(wrapped: CustomResourceRemovalPolicy):
        software.amazon.awscdk.customresources.CustomResourceRemovalPolicy = wrapped.cdkObject as
        software.amazon.awscdk.customresources.CustomResourceRemovalPolicy
  }
}
