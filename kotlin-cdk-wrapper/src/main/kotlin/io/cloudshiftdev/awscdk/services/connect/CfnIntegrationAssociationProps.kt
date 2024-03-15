@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnIntegrationAssociationProps {
  public fun instanceId(): String

  public fun integrationArn(): String

  public fun integrationType(): String

  @CdkDslMarker
  public interface Builder {
    public fun instanceId(instanceId: String)

    public fun integrationArn(integrationArn: String)

    public fun integrationType(integrationType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.connect.CfnIntegrationAssociationProps.Builder =
        software.amazon.awscdk.services.connect.CfnIntegrationAssociationProps.builder()

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    override fun integrationArn(integrationArn: String) {
      cdkBuilder.integrationArn(integrationArn)
    }

    override fun integrationType(integrationType: String) {
      cdkBuilder.integrationType(integrationType)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnIntegrationAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnIntegrationAssociationProps,
  ) : CdkObject(cdkObject), CfnIntegrationAssociationProps {
    override fun instanceId(): String = unwrap(this).getInstanceId()

    override fun integrationArn(): String = unwrap(this).getIntegrationArn()

    override fun integrationType(): String = unwrap(this).getIntegrationType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIntegrationAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnIntegrationAssociationProps):
        CfnIntegrationAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIntegrationAssociationProps):
        software.amazon.awscdk.services.connect.CfnIntegrationAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.connect.CfnIntegrationAssociationProps
  }
}
