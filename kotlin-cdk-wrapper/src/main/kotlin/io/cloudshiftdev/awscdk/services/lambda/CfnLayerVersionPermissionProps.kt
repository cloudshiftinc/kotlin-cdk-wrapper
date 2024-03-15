@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnLayerVersionPermissionProps {
  public fun action(): String

  public fun layerVersionArn(): String

  public fun organizationId(): String? = unwrap(this).getOrganizationId()

  public fun principal(): String

  @CdkDslMarker
  public interface Builder {
    public fun action(action: String)

    public fun layerVersionArn(layerVersionArn: String)

    public fun organizationId(organizationId: String)

    public fun principal(principal: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps.Builder =
        software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps.builder()

    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    override fun layerVersionArn(layerVersionArn: String) {
      cdkBuilder.layerVersionArn(layerVersionArn)
    }

    override fun organizationId(organizationId: String) {
      cdkBuilder.organizationId(organizationId)
    }

    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps,
  ) : CdkObject(cdkObject), CfnLayerVersionPermissionProps {
    override fun action(): String = unwrap(this).getAction()

    override fun layerVersionArn(): String = unwrap(this).getLayerVersionArn()

    override fun organizationId(): String? = unwrap(this).getOrganizationId()

    override fun principal(): String = unwrap(this).getPrincipal()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLayerVersionPermissionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps):
        CfnLayerVersionPermissionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLayerVersionPermissionProps):
        software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps
  }
}
