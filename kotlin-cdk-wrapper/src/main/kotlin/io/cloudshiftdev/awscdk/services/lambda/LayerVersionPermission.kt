@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface LayerVersionPermission {
  public fun accountId(): String

  public fun organizationId(): String? = unwrap(this).getOrganizationId()

  @CdkDslMarker
  public interface Builder {
    public fun accountId(accountId: String)

    public fun organizationId(organizationId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.LayerVersionPermission.Builder =
        software.amazon.awscdk.services.lambda.LayerVersionPermission.builder()

    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    override fun organizationId(organizationId: String) {
      cdkBuilder.organizationId(organizationId)
    }

    public fun build(): software.amazon.awscdk.services.lambda.LayerVersionPermission =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.LayerVersionPermission,
  ) : CdkObject(cdkObject), LayerVersionPermission {
    override fun accountId(): String = unwrap(this).getAccountId()

    override fun organizationId(): String? = unwrap(this).getOrganizationId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LayerVersionPermission {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.LayerVersionPermission):
        LayerVersionPermission = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LayerVersionPermission):
        software.amazon.awscdk.services.lambda.LayerVersionPermission = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.LayerVersionPermission
  }
}
