@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcaconnectorad

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnServicePrincipalNameProps {
  public fun connectorArn(): String? = unwrap(this).getConnectorArn()

  public fun directoryRegistrationArn(): String? = unwrap(this).getDirectoryRegistrationArn()

  @CdkDslMarker
  public interface Builder {
    public fun connectorArn(connectorArn: String)

    public fun directoryRegistrationArn(directoryRegistrationArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalNameProps.Builder =
        software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalNameProps.builder()

    override fun connectorArn(connectorArn: String) {
      cdkBuilder.connectorArn(connectorArn)
    }

    override fun directoryRegistrationArn(directoryRegistrationArn: String) {
      cdkBuilder.directoryRegistrationArn(directoryRegistrationArn)
    }

    public fun build(): software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalNameProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalNameProps,
  ) : CdkObject(cdkObject), CfnServicePrincipalNameProps {
    override fun connectorArn(): String? = unwrap(this).getConnectorArn()

    override fun directoryRegistrationArn(): String? = unwrap(this).getDirectoryRegistrationArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServicePrincipalNameProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalNameProps):
        CfnServicePrincipalNameProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServicePrincipalNameProps):
        software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalNameProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalNameProps
  }
}
