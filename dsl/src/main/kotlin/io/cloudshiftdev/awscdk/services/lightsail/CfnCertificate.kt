package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCertificate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lightsail.CfnCertificate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCertificateArn(): String = unwrap(this).getAttrCertificateArn()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun certificateName(): String = unwrap(this).getCertificateName()

  public open fun certificateName(`value`: String) {
    unwrap(this).setCertificateName(`value`)
  }

  public open fun domainName(): String = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun subjectAlternativeNames(): List<String> =
      unwrap(this).getSubjectAlternativeNames() ?: emptyList()

  public open fun subjectAlternativeNames(`value`: List<String>) {
    unwrap(this).setSubjectAlternativeNames(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun certificateName(certificateName: String)

    public fun domainName(domainName: String)

    public fun subjectAlternativeNames(subjectAlternativeNames: List<String>)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnCertificate.Builder =
        software.amazon.awscdk.services.lightsail.CfnCertificate.Builder.create(scope, id)

    override fun certificateName(certificateName: String) {
      cdkBuilder.certificateName(certificateName)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun subjectAlternativeNames(subjectAlternativeNames: List<String>) {
      cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lightsail.CfnCertificate =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCertificate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnCertificate):
        CfnCertificate = CfnCertificate(cdkObject)

    internal fun unwrap(wrapped: CfnCertificate):
        software.amazon.awscdk.services.lightsail.CfnCertificate = wrapped.cdkObject
  }
}
