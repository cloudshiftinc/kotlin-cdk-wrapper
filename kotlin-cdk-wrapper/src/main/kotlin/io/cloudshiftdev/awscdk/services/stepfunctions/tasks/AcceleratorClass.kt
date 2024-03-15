@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class AcceleratorClass internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorClass,
) : CdkObject(cdkObject) {
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
        software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorClass = wrapped.cdkObject
  }
}
