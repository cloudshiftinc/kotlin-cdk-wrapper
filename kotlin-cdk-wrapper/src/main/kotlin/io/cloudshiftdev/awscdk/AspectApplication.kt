@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Number

/**
 * Object respresenting an Aspect application.
 *
 * Stores the Aspect, the pointer to the construct it was applied
 * to, and the priority value of that Aspect.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import software.constructs.*;
 * IAspect aspect;
 * Construct construct;
 * AspectApplication aspectApplication = new AspectApplication(construct, aspect, 123);
 * ```
 */
public open class AspectApplication(
  cdkObject: software.amazon.awscdk.AspectApplication,
) : CdkObject(cdkObject) {
  public constructor(
    construct: IConstruct,
    aspect: IAspect,
    priority: Number,
  ) : this(software.amazon.awscdk.AspectApplication(construct.let(IConstruct.Companion::unwrap),
      aspect.let(IAspect.Companion::unwrap), priority)
  )

  /**
   * The Aspect that was applied.
   */
  public open fun aspect(): IAspect = unwrap(this).getAspect().let(IAspect::wrap)

  /**
   * The construct that the Aspect was applied to.
   */
  public open fun construct(): IConstruct = unwrap(this).getConstruct().let(IConstruct::wrap)

  /**
   * Gets the priority value.
   *
   * Sets the priority value.
   */
  public open fun priority(): Number = unwrap(this).getPriority()

  /**
   * Gets the priority value.
   *
   * Sets the priority value.
   */
  public open fun priority(`value`: Number) {
    unwrap(this).setPriority(`value`)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.AspectApplication): AspectApplication =
        AspectApplication(cdkObject)

    internal fun unwrap(wrapped: AspectApplication): software.amazon.awscdk.AspectApplication =
        wrapped.cdkObject as software.amazon.awscdk.AspectApplication
  }
}
