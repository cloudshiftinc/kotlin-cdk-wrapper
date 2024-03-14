package io.cloudshiftdev.awscdk.services.pcaconnectorad

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnServicePrincipalName internal constructor(
  private val cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalName,
) : CfnResource(cdkObject), IInspectable {
  public open fun connectorArn(): String? = unwrap(this).getConnectorArn()

  public open fun connectorArn(`value`: String) {
    unwrap(this).setConnectorArn(`value`)
  }

  public open fun directoryRegistrationArn(): String? = unwrap(this).getDirectoryRegistrationArn()

  public open fun directoryRegistrationArn(`value`: String) {
    unwrap(this).setDirectoryRegistrationArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun connectorArn(connectorArn: String) {
    }

    public fun directoryRegistrationArn(directoryRegistrationArn: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalName.Builder =
        software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalName.Builder.create(scope,
        id)

    public override fun connectorArn(connectorArn: String) {
      cdkBuilder.connectorArn(connectorArn)
    }

    public override fun directoryRegistrationArn(directoryRegistrationArn: String) {
      cdkBuilder.directoryRegistrationArn(directoryRegistrationArn)
    }

    public fun build(): software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalName =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServicePrincipalName {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServicePrincipalName(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalName):
        CfnServicePrincipalName = CfnServicePrincipalName(cdkObject)

    internal fun unwrap(wrapped: CfnServicePrincipalName):
        software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalName = wrapped.cdkObject
  }
}
