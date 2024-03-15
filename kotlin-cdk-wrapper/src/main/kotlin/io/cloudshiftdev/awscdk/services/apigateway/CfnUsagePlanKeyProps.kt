@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnUsagePlanKeyProps {
  public fun keyId(): String

  public fun keyType(): String

  public fun usagePlanId(): String

  @CdkDslMarker
  public interface Builder {
    public fun keyId(keyId: String)

    public fun keyType(keyType: String)

    public fun usagePlanId(usagePlanId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps.Builder
        = software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps.builder()

    override fun keyId(keyId: String) {
      cdkBuilder.keyId(keyId)
    }

    override fun keyType(keyType: String) {
      cdkBuilder.keyType(keyType)
    }

    override fun usagePlanId(usagePlanId: String) {
      cdkBuilder.usagePlanId(usagePlanId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps,
  ) : CdkObject(cdkObject), CfnUsagePlanKeyProps {
    override fun keyId(): String = unwrap(this).getKeyId()

    override fun keyType(): String = unwrap(this).getKeyType()

    override fun usagePlanId(): String = unwrap(this).getUsagePlanId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUsagePlanKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps):
        CfnUsagePlanKeyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUsagePlanKeyProps):
        software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps
  }
}
