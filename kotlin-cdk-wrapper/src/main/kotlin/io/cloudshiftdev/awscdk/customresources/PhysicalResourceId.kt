@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class PhysicalResourceId internal constructor(
  internal override val cdkObject: software.amazon.awscdk.customresources.PhysicalResourceId,
) : CdkObject(cdkObject) {
  public open fun id(): String? = unwrap(this).getId()

  public open fun responsePath(): String? = unwrap(this).getResponsePath()

  public companion object {
    public fun fromResponse(responsePath: String): PhysicalResourceId =
        software.amazon.awscdk.customresources.PhysicalResourceId.fromResponse(responsePath).let(PhysicalResourceId::wrap)

    public fun of(id: String): PhysicalResourceId =
        software.amazon.awscdk.customresources.PhysicalResourceId.of(id).let(PhysicalResourceId::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.PhysicalResourceId):
        PhysicalResourceId = PhysicalResourceId(cdkObject)

    internal fun unwrap(wrapped: PhysicalResourceId):
        software.amazon.awscdk.customresources.PhysicalResourceId = wrapped.cdkObject
  }
}
