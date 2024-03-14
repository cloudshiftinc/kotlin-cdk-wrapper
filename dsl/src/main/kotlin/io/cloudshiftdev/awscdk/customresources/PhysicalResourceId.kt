package io.cloudshiftdev.awscdk.customresources

import kotlin.String

public open class PhysicalResourceId internal constructor(
  private val cdkObject: software.amazon.awscdk.customresources.PhysicalResourceId,
) {
  public open fun id(): String? = unwrap(this).getId()

  public open fun responsePath(): String? = unwrap(this).getResponsePath()

  public companion object {
    public open fun fromResponse(responsePath: String): PhysicalResourceId =
        software.amazon.awscdk.customresources.PhysicalResourceId.fromResponse(responsePath).let(PhysicalResourceId::wrap)

    public open fun of(id: String): PhysicalResourceId =
        software.amazon.awscdk.customresources.PhysicalResourceId.of(id).let(PhysicalResourceId::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.PhysicalResourceId):
        PhysicalResourceId = PhysicalResourceId(cdkObject)

    internal fun unwrap(wrapped: PhysicalResourceId):
        software.amazon.awscdk.customresources.PhysicalResourceId = wrapped.cdkObject
  }
}
