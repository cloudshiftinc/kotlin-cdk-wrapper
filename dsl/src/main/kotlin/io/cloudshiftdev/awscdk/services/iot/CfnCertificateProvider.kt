package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCertificateProvider internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnCertificateProvider,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun accountDefaultForOperations(): List<String> =
      unwrap(this).getAccountDefaultForOperations()

  public open fun accountDefaultForOperations(`value`: List<String>) {
    unwrap(this).setAccountDefaultForOperations(`value`)
  }

  public open fun accountDefaultForOperations(vararg `value`: String): Unit =
      accountDefaultForOperations(`value`.toList())

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun certificateProviderName(): String? = unwrap(this).getCertificateProviderName()

  public open fun certificateProviderName(`value`: String) {
    unwrap(this).setCertificateProviderName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun lambdaFunctionArn(): String = unwrap(this).getLambdaFunctionArn()

  public open fun lambdaFunctionArn(`value`: String) {
    unwrap(this).setLambdaFunctionArn(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public interface Builder {
    public fun accountDefaultForOperations(accountDefaultForOperations: List<String>)

    public fun accountDefaultForOperations(vararg accountDefaultForOperations: String)

    public fun certificateProviderName(certificateProviderName: String)

    public fun lambdaFunctionArn(lambdaFunctionArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnCertificateProvider.Builder =
        software.amazon.awscdk.services.iot.CfnCertificateProvider.Builder.create(scope, id)

    override fun accountDefaultForOperations(accountDefaultForOperations: List<String>) {
      cdkBuilder.accountDefaultForOperations(accountDefaultForOperations)
    }

    override fun accountDefaultForOperations(vararg accountDefaultForOperations: String): Unit =
        accountDefaultForOperations(accountDefaultForOperations.toList())

    override fun certificateProviderName(certificateProviderName: String) {
      cdkBuilder.certificateProviderName(certificateProviderName)
    }

    override fun lambdaFunctionArn(lambdaFunctionArn: String) {
      cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnCertificateProvider =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCertificateProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCertificateProvider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCertificateProvider):
        CfnCertificateProvider = CfnCertificateProvider(cdkObject)

    internal fun unwrap(wrapped: CfnCertificateProvider):
        software.amazon.awscdk.services.iot.CfnCertificateProvider = wrapped.cdkObject
  }
}
