@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCertificate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.transfer.CfnCertificate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun activeDate(): String? = unwrap(this).getActiveDate()

  public open fun activeDate(`value`: String) {
    unwrap(this).setActiveDate(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCertificateId(): String = unwrap(this).getAttrCertificateId()

  public open fun attrNotAfterDate(): String = unwrap(this).getAttrNotAfterDate()

  public open fun attrNotBeforeDate(): String = unwrap(this).getAttrNotBeforeDate()

  public open fun attrSerial(): String = unwrap(this).getAttrSerial()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrType(): String = unwrap(this).getAttrType()

  public open fun certificate(): String = unwrap(this).getCertificate()

  public open fun certificate(`value`: String) {
    unwrap(this).setCertificate(`value`)
  }

  public open fun certificateChain(): String? = unwrap(this).getCertificateChain()

  public open fun certificateChain(`value`: String) {
    unwrap(this).setCertificateChain(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun inactiveDate(): String? = unwrap(this).getInactiveDate()

  public open fun inactiveDate(`value`: String) {
    unwrap(this).setInactiveDate(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun privateKey(): String? = unwrap(this).getPrivateKey()

  public open fun privateKey(`value`: String) {
    unwrap(this).setPrivateKey(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun usage(): String = unwrap(this).getUsage()

  public open fun usage(`value`: String) {
    unwrap(this).setUsage(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnCertificate.Builder =
        software.amazon.awscdk.services.transfer.CfnCertificate.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.transfer.CfnCertificate = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.transfer.CfnCertificate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCertificate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnCertificate):
        CfnCertificate = CfnCertificate(cdkObject)

    internal fun unwrap(wrapped: CfnCertificate):
        software.amazon.awscdk.services.transfer.CfnCertificate = wrapped.cdkObject
  }
}
