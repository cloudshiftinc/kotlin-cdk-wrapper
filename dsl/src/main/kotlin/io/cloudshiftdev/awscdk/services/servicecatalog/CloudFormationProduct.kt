package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CloudFormationProduct internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationProduct,
) : Product(cdkObject) {
  public override fun assetBuckets(): List<IBucket> =
      unwrap(this).getAssetBuckets().map(IBucket::wrap)

  public override fun productArn(): String = unwrap(this).getProductArn()

  public override fun productId(): String = unwrap(this).getProductId()

  public interface Builder {
    public fun description(description: String)

    public fun distributor(distributor: String)

    public fun messageLanguage(messageLanguage: MessageLanguage)

    public fun owner(owner: String)

    public fun productName(productName: String)

    public fun productVersions(productVersions: List<CloudFormationProductVersion>)

    public fun replaceProductVersionIds(replaceProductVersionIds: Boolean)

    public fun supportDescription(supportDescription: String)

    public fun supportEmail(supportEmail: String)

    public fun supportUrl(supportUrl: String)

    public fun tagOptions(tagOptions: TagOptions)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CloudFormationProduct.Builder =
        software.amazon.awscdk.services.servicecatalog.CloudFormationProduct.Builder.create(scope,
        id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun distributor(distributor: String) {
      cdkBuilder.distributor(distributor)
    }

    override fun messageLanguage(messageLanguage: MessageLanguage) {
      cdkBuilder.messageLanguage(messageLanguage.let(MessageLanguage::unwrap))
    }

    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    override fun productName(productName: String) {
      cdkBuilder.productName(productName)
    }

    override fun productVersions(productVersions: List<CloudFormationProductVersion>) {
      cdkBuilder.productVersions(productVersions.map(CloudFormationProductVersion::unwrap))
    }

    override fun replaceProductVersionIds(replaceProductVersionIds: Boolean) {
      cdkBuilder.replaceProductVersionIds(replaceProductVersionIds)
    }

    override fun supportDescription(supportDescription: String) {
      cdkBuilder.supportDescription(supportDescription)
    }

    override fun supportEmail(supportEmail: String) {
      cdkBuilder.supportEmail(supportEmail)
    }

    override fun supportUrl(supportUrl: String) {
      cdkBuilder.supportUrl(supportUrl)
    }

    override fun tagOptions(tagOptions: TagOptions) {
      cdkBuilder.tagOptions(tagOptions.let(TagOptions::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CloudFormationProduct =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CloudFormationProduct {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CloudFormationProduct(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationProduct):
        CloudFormationProduct = CloudFormationProduct(cdkObject)

    internal fun unwrap(wrapped: CloudFormationProduct):
        software.amazon.awscdk.services.servicecatalog.CloudFormationProduct = wrapped.cdkObject
  }
}
