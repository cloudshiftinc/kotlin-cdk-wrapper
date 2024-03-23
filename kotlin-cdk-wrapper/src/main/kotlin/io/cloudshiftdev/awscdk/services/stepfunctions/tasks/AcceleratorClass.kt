@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * The generation of Elastic Inference (EI) instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * AcceleratorClass acceleratorClass = AcceleratorClass.of("version");
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html)
 */
public open class AcceleratorClass(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorClass,
) : CdkObject(cdkObject) {
  /**
   * * Elastic Inference accelerator generation.
   */
  public open fun version(): String = unwrap(this).getVersion()

  public companion object {
    public val EIA1: AcceleratorClass =
        AcceleratorClass.wrap(software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorClass.EIA1)

    public val EIA2: AcceleratorClass =
        AcceleratorClass.wrap(software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorClass.EIA2)

    public fun of(version: String): AcceleratorClass =
        software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorClass.of(version).let(AcceleratorClass::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorClass):
        AcceleratorClass = AcceleratorClass(cdkObject)

    internal fun unwrap(wrapped: AcceleratorClass):
        software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorClass = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorClass
  }
}
