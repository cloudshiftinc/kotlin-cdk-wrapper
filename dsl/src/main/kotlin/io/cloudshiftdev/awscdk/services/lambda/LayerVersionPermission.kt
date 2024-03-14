package io.cloudshiftdev.awscdk.services.lambda

import kotlin.String
import kotlin.Unit

public interface LayerVersionPermission {
  public fun accountId(): String

  public fun organizationId(): String? = unwrap(this).getOrganizationId()

  public interface Builder {
    public fun accountId(accountId: String) {
    }

    public fun organizationId(organizationId: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.LayerVersionPermission.Builder =
        software.amazon.awscdk.services.lambda.LayerVersionPermission.builder()

    public override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    public override fun organizationId(organizationId: String) {
      cdkBuilder.organizationId(organizationId)
    }

    public fun build(): software.amazon.awscdk.services.lambda.LayerVersionPermission =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.LayerVersionPermission,
  ) : LayerVersionPermission {
    public override fun accountId(): String = unwrap(this).getAccountId()

    public override fun organizationId(): String? = unwrap(this).getOrganizationId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LayerVersionPermission {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.LayerVersionPermission):
        LayerVersionPermission = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LayerVersionPermission):
        software.amazon.awscdk.services.lambda.LayerVersionPermission = (wrapped as
        Wrapper).cdkObject
  }
}
