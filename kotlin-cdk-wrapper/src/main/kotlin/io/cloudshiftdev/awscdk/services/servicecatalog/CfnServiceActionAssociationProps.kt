@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnServiceActionAssociationProps {
  public fun productId(): String

  public fun provisioningArtifactId(): String

  public fun serviceActionId(): String

  @CdkDslMarker
  public interface Builder {
    public fun productId(productId: String)

    public fun provisioningArtifactId(provisioningArtifactId: String)

    public fun serviceActionId(serviceActionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps.builder()

    override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    override fun provisioningArtifactId(provisioningArtifactId: String) {
      cdkBuilder.provisioningArtifactId(provisioningArtifactId)
    }

    override fun serviceActionId(serviceActionId: String) {
      cdkBuilder.serviceActionId(serviceActionId)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps,
  ) : CdkObject(cdkObject), CfnServiceActionAssociationProps {
    override fun productId(): String = unwrap(this).getProductId()

    override fun provisioningArtifactId(): String = unwrap(this).getProvisioningArtifactId()

    override fun serviceActionId(): String = unwrap(this).getServiceActionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceActionAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps):
        CfnServiceActionAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceActionAssociationProps):
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps
  }
}
