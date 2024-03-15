@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnCertificateProps {
  public fun activeDate(): String? = unwrap(this).getActiveDate()

  public fun certificate(): String

  public fun certificateChain(): String? = unwrap(this).getCertificateChain()

  public fun description(): String? = unwrap(this).getDescription()

  public fun inactiveDate(): String? = unwrap(this).getInactiveDate()

  public fun privateKey(): String? = unwrap(this).getPrivateKey()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun usage(): String

  @CdkDslMarker
  public interface Builder {
    public fun activeDate(activeDate: String)

    public fun certificate(certificate: String)

    public fun certificateChain(certificateChain: String)

    public fun description(description: String)

    public fun inactiveDate(inactiveDate: String)

    public fun privateKey(privateKey: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun usage(usage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnCertificateProps.Builder =
        software.amazon.awscdk.services.transfer.CfnCertificateProps.builder()

    override fun activeDate(activeDate: String) {
      cdkBuilder.activeDate(activeDate)
    }

    override fun certificate(certificate: String) {
      cdkBuilder.certificate(certificate)
    }

    override fun certificateChain(certificateChain: String) {
      cdkBuilder.certificateChain(certificateChain)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun inactiveDate(inactiveDate: String) {
      cdkBuilder.inactiveDate(inactiveDate)
    }

    override fun privateKey(privateKey: String) {
      cdkBuilder.privateKey(privateKey)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun usage(usage: String) {
      cdkBuilder.usage(usage)
    }

    public fun build(): software.amazon.awscdk.services.transfer.CfnCertificateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.transfer.CfnCertificateProps,
  ) : CdkObject(cdkObject), CfnCertificateProps {
    override fun activeDate(): String? = unwrap(this).getActiveDate()

    override fun certificate(): String = unwrap(this).getCertificate()

    override fun certificateChain(): String? = unwrap(this).getCertificateChain()

    override fun description(): String? = unwrap(this).getDescription()

    override fun inactiveDate(): String? = unwrap(this).getInactiveDate()

    override fun privateKey(): String? = unwrap(this).getPrivateKey()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun usage(): String = unwrap(this).getUsage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnCertificateProps):
        CfnCertificateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCertificateProps):
        software.amazon.awscdk.services.transfer.CfnCertificateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.transfer.CfnCertificateProps
  }
}
