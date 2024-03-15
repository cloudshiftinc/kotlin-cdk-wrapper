@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcaconnectorad

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnConnectorProps {
  public fun certificateAuthorityArn(): String

  public fun directoryId(): String

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun vpcInformation(): Any

  @CdkDslMarker
  public interface Builder {
    public fun certificateAuthorityArn(certificateAuthorityArn: String)

    public fun directoryId(directoryId: String)

    public fun tags(tags: Map<String, String>)

    public fun vpcInformation(vpcInformation: IResolvable)

    public fun vpcInformation(vpcInformation: CfnConnector.VpcInformationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b72708b75267a7a0a997759e0947d4727eb2c94c952424cf35e01c8ca2a3a77d")
    public
        fun vpcInformation(vpcInformation: CfnConnector.VpcInformationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pcaconnectorad.CfnConnectorProps.Builder
        = software.amazon.awscdk.services.pcaconnectorad.CfnConnectorProps.builder()

    override fun certificateAuthorityArn(certificateAuthorityArn: String) {
      cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    override fun directoryId(directoryId: String) {
      cdkBuilder.directoryId(directoryId)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun vpcInformation(vpcInformation: IResolvable) {
      cdkBuilder.vpcInformation(vpcInformation.let(IResolvable::unwrap))
    }

    override fun vpcInformation(vpcInformation: CfnConnector.VpcInformationProperty) {
      cdkBuilder.vpcInformation(vpcInformation.let(CfnConnector.VpcInformationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b72708b75267a7a0a997759e0947d4727eb2c94c952424cf35e01c8ca2a3a77d")
    override
        fun vpcInformation(vpcInformation: CfnConnector.VpcInformationProperty.Builder.() -> Unit):
        Unit = vpcInformation(CfnConnector.VpcInformationProperty(vpcInformation))

    public fun build(): software.amazon.awscdk.services.pcaconnectorad.CfnConnectorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnConnectorProps,
  ) : CdkObject(cdkObject), CfnConnectorProps {
    override fun certificateAuthorityArn(): String = unwrap(this).getCertificateAuthorityArn()

    override fun directoryId(): String = unwrap(this).getDirectoryId()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun vpcInformation(): Any = unwrap(this).getVpcInformation()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnConnectorProps):
        CfnConnectorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectorProps):
        software.amazon.awscdk.services.pcaconnectorad.CfnConnectorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pcaconnectorad.CfnConnectorProps
  }
}
