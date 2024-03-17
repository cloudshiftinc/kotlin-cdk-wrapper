@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Base class for referencable CloudFormation constructs which are not Resources.
 *
 * These constructs are things like Conditions and Parameters, can be
 * referenced by taking the `.ref` attribute.
 *
 * Resource constructs do not inherit from CfnRefElement because they have their
 * own, more specific types returned from the .ref attribute. Also, some
 * resources aren't referencable at all (such as BucketPolicies or GatewayAttachments).
 */
public abstract class CfnRefElement internal constructor(
  internal override val cdkObject: software.amazon.awscdk.CfnRefElement,
) : CfnElement(cdkObject) {
  /**
   * Return a string that will be resolved to a CloudFormation `{ Ref }` for this element.
   *
   * If, by any chance, the intrinsic reference of a resource is not a string, you could
   * coerce it to an IResolvable through `Lazy.any({ produce: resource.ref })`.
   */
  public open fun ref(): String = unwrap(this).getRef()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnRefElement,
  ) : CfnRefElement(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.CfnRefElement): CfnRefElement =
        CdkObjectWrappers.wrap(cdkObject) as? CfnRefElement ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRefElement): software.amazon.awscdk.CfnRefElement = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CfnRefElement
  }
}
