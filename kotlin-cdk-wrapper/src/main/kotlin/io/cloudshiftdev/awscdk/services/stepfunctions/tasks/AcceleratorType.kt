@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.InstanceSize
import kotlin.String

/**
 * The size of the Elastic Inference (EI) instance to use for the production variant.
 *
 * EI instances provide on-demand GPU computing for inference
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * AcceleratorType acceleratorType = new AcceleratorType("instanceTypeIdentifier");
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html)
 */
public open class AcceleratorType(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorType,
) : CdkObject(cdkObject) {
  public constructor(instanceTypeIdentifier: String) :
      this(software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorType(instanceTypeIdentifier)
  )

  public companion object {
    public fun of(acceleratorClass: AcceleratorClass, instanceSize: InstanceSize): AcceleratorType =
        software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorType.of(acceleratorClass.let(AcceleratorClass.Companion::unwrap),
        instanceSize.let(InstanceSize.Companion::unwrap)).let(AcceleratorType::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorType):
        AcceleratorType = AcceleratorType(cdkObject)

    internal fun unwrap(wrapped: AcceleratorType):
        software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorType = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorType
  }
}
