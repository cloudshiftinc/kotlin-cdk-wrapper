@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class AttributeValuesStep internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.AttributeValuesStep,
) : CdkObject(cdkObject) {
  public open fun `is`(`val`: String): AttributeValues =
      unwrap(this).`is`(`val`).let(AttributeValues::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AttributeValuesStep):
        AttributeValuesStep = AttributeValuesStep(cdkObject)

    internal fun unwrap(wrapped: AttributeValuesStep):
        software.amazon.awscdk.services.appsync.AttributeValuesStep = wrapped.cdkObject
  }
}
