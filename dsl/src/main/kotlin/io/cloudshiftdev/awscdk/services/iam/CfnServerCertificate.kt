package io.cloudshiftdev.awscdk.services.iam

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

public open class CfnServerCertificate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.CfnServerCertificate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun certificateBody(): String? = unwrap(this).getCertificateBody()

  public open fun certificateBody(`value`: String) {
    unwrap(this).setCertificateBody(`value`)
  }

  public open fun certificateChain(): String? = unwrap(this).getCertificateChain()

  public open fun certificateChain(`value`: String) {
    unwrap(this).setCertificateChain(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun path(): String? = unwrap(this).getPath()

  public open fun path(`value`: String) {
    unwrap(this).setPath(`value`)
  }

  public open fun privateKey(): String? = unwrap(this).getPrivateKey()

  public open fun privateKey(`value`: String) {
    unwrap(this).setPrivateKey(`value`)
  }

  public open fun serverCertificateName(): String? = unwrap(this).getServerCertificateName()

  public open fun serverCertificateName(`value`: String) {
    unwrap(this).setServerCertificateName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun certificateBody(certificateBody: String)

    public fun certificateChain(certificateChain: String)

    public fun path(path: String)

    public fun privateKey(privateKey: String)

    public fun serverCertificateName(serverCertificateName: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnServerCertificate.Builder =
        software.amazon.awscdk.services.iam.CfnServerCertificate.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.iam.CfnServerCertificate =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServerCertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServerCertificate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnServerCertificate):
        CfnServerCertificate = CfnServerCertificate(cdkObject)

    internal fun unwrap(wrapped: CfnServerCertificate):
        software.amazon.awscdk.services.iam.CfnServerCertificate = wrapped.cdkObject
  }
}
