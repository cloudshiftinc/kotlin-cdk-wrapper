@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnServerCertificateProps {
  public fun certificateBody(): String? = unwrap(this).getCertificateBody()

  public fun certificateChain(): String? = unwrap(this).getCertificateChain()

  public fun path(): String? = unwrap(this).getPath()

  public fun privateKey(): String? = unwrap(this).getPrivateKey()

  public fun serverCertificateName(): String? = unwrap(this).getServerCertificateName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun certificateBody(certificateBody: String)

    public fun certificateChain(certificateChain: String)

    public fun path(path: String)

    public fun privateKey(privateKey: String)

    public fun serverCertificateName(serverCertificateName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnServerCertificateProps.Builder =
        software.amazon.awscdk.services.iam.CfnServerCertificateProps.builder()

    override fun certificateBody(certificateBody: String) {
      cdkBuilder.certificateBody(certificateBody)
    }

    override fun certificateChain(certificateChain: String) {
      cdkBuilder.certificateChain(certificateChain)
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun privateKey(privateKey: String) {
      cdkBuilder.privateKey(privateKey)
    }

    override fun serverCertificateName(serverCertificateName: String) {
      cdkBuilder.serverCertificateName(serverCertificateName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnServerCertificateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnServerCertificateProps,
  ) : CdkObject(cdkObject), CfnServerCertificateProps {
    override fun certificateBody(): String? = unwrap(this).getCertificateBody()

    override fun certificateChain(): String? = unwrap(this).getCertificateChain()

    override fun path(): String? = unwrap(this).getPath()

    override fun privateKey(): String? = unwrap(this).getPrivateKey()

    override fun serverCertificateName(): String? = unwrap(this).getServerCertificateName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServerCertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnServerCertificateProps):
        CfnServerCertificateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServerCertificateProps):
        software.amazon.awscdk.services.iam.CfnServerCertificateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnServerCertificateProps
  }
}
