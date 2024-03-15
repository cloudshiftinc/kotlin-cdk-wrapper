@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnServiceProps {
  public fun authType(): String? = unwrap(this).getAuthType()

  public fun certificateArn(): String? = unwrap(this).getCertificateArn()

  public fun customDomainName(): String? = unwrap(this).getCustomDomainName()

  public fun dnsEntry(): Any? = unwrap(this).getDnsEntry()

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun authType(authType: String)

    public fun certificateArn(certificateArn: String)

    public fun customDomainName(customDomainName: String)

    public fun dnsEntry(dnsEntry: IResolvable)

    public fun dnsEntry(dnsEntry: CfnService.DnsEntryProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3efe9b948caff662dde3459e0c0997e86b85201c4c333d14d68fcc0d3a5e07fa")
    public fun dnsEntry(dnsEntry: CfnService.DnsEntryProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnServiceProps.Builder =
        software.amazon.awscdk.services.vpclattice.CfnServiceProps.builder()

    override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    override fun customDomainName(customDomainName: String) {
      cdkBuilder.customDomainName(customDomainName)
    }

    override fun dnsEntry(dnsEntry: IResolvable) {
      cdkBuilder.dnsEntry(dnsEntry.let(IResolvable::unwrap))
    }

    override fun dnsEntry(dnsEntry: CfnService.DnsEntryProperty) {
      cdkBuilder.dnsEntry(dnsEntry.let(CfnService.DnsEntryProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3efe9b948caff662dde3459e0c0997e86b85201c4c333d14d68fcc0d3a5e07fa")
    override fun dnsEntry(dnsEntry: CfnService.DnsEntryProperty.Builder.() -> Unit): Unit =
        dnsEntry(CfnService.DnsEntryProperty(dnsEntry))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceProps,
  ) : CdkObject(cdkObject), CfnServiceProps {
    override fun authType(): String? = unwrap(this).getAuthType()

    override fun certificateArn(): String? = unwrap(this).getCertificateArn()

    override fun customDomainName(): String? = unwrap(this).getCustomDomainName()

    override fun dnsEntry(): Any? = unwrap(this).getDnsEntry()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceProps):
        CfnServiceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceProps):
        software.amazon.awscdk.services.vpclattice.CfnServiceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.vpclattice.CfnServiceProps
  }
}
