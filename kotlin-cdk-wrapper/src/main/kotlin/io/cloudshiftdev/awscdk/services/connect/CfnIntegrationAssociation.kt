@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIntegrationAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.connect.CfnIntegrationAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrIntegrationAssociationId(): String =
      unwrap(this).getAttrIntegrationAssociationId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceId(): String = unwrap(this).getInstanceId()

  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  public open fun integrationArn(): String = unwrap(this).getIntegrationArn()

  public open fun integrationArn(`value`: String) {
    unwrap(this).setIntegrationArn(`value`)
  }

  public open fun integrationType(): String = unwrap(this).getIntegrationType()

  public open fun integrationType(`value`: String) {
    unwrap(this).setIntegrationType(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun instanceId(instanceId: String)

    public fun integrationArn(integrationArn: String)

    public fun integrationType(integrationType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.connect.CfnIntegrationAssociation.Builder =
        software.amazon.awscdk.services.connect.CfnIntegrationAssociation.Builder.create(scope, id)

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    override fun integrationArn(integrationArn: String) {
      cdkBuilder.integrationArn(integrationArn)
    }

    override fun integrationType(integrationType: String) {
      cdkBuilder.integrationType(integrationType)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnIntegrationAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnIntegrationAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIntegrationAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIntegrationAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnIntegrationAssociation):
        CfnIntegrationAssociation = CfnIntegrationAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnIntegrationAssociation):
        software.amazon.awscdk.services.connect.CfnIntegrationAssociation = wrapped.cdkObject
  }
}
