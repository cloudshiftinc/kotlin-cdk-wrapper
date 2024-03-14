package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnServiceActionAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation,
) : CfnResource(cdkObject), IInspectable {
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun productId(): String = unwrap(this).getProductId()

  public open fun productId(`value`: String) {
    unwrap(this).setProductId(`value`)
  }

  public open fun provisioningArtifactId(): String = unwrap(this).getProvisioningArtifactId()

  public open fun provisioningArtifactId(`value`: String) {
    unwrap(this).setProvisioningArtifactId(`value`)
  }

  public open fun serviceActionId(): String = unwrap(this).getServiceActionId()

  public open fun serviceActionId(`value`: String) {
    unwrap(this).setServiceActionId(`value`)
  }

  public interface Builder {
    public fun productId(productId: String) {
    }

    public fun provisioningArtifactId(provisioningArtifactId: String) {
    }

    public fun serviceActionId(serviceActionId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation.Builder.create(scope,
        id)

    public override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    public override fun provisioningArtifactId(provisioningArtifactId: String) {
      cdkBuilder.provisioningArtifactId(provisioningArtifactId)
    }

    public override fun serviceActionId(serviceActionId: String) {
      cdkBuilder.serviceActionId(serviceActionId)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServiceActionAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServiceActionAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation):
        CfnServiceActionAssociation = CfnServiceActionAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnServiceActionAssociation):
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation =
        wrapped.cdkObject
  }
}
