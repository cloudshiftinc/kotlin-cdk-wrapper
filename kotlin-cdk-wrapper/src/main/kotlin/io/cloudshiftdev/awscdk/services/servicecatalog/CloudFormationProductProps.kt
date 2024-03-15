@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CloudFormationProductProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun distributor(): String? = unwrap(this).getDistributor()

  public fun messageLanguage(): MessageLanguage? =
      unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)

  public fun owner(): String

  public fun productName(): String

  public fun productVersions(): List<CloudFormationProductVersion>

  public fun replaceProductVersionIds(): Boolean? = unwrap(this).getReplaceProductVersionIds()

  public fun supportDescription(): String? = unwrap(this).getSupportDescription()

  public fun supportEmail(): String? = unwrap(this).getSupportEmail()

  public fun supportUrl(): String? = unwrap(this).getSupportUrl()

  public fun tagOptions(): TagOptions? = unwrap(this).getTagOptions()?.let(TagOptions::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun distributor(distributor: String)

    public fun messageLanguage(messageLanguage: MessageLanguage)

    public fun owner(owner: String)

    public fun productName(productName: String)

    public fun productVersions(productVersions: List<CloudFormationProductVersion>)

    public fun productVersions(vararg productVersions: CloudFormationProductVersion)

    public fun replaceProductVersionIds(replaceProductVersionIds: Boolean)

    public fun supportDescription(supportDescription: String)

    public fun supportEmail(supportEmail: String)

    public fun supportUrl(supportUrl: String)

    public fun tagOptions(tagOptions: TagOptions)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductProps.builder()

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

    override fun productVersions(vararg productVersions: CloudFormationProductVersion): Unit =
        productVersions(productVersions.toList())

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

    public fun build(): software.amazon.awscdk.services.servicecatalog.CloudFormationProductProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductProps,
  ) : CdkObject(cdkObject), CloudFormationProductProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun distributor(): String? = unwrap(this).getDistributor()

    override fun messageLanguage(): MessageLanguage? =
        unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)

    override fun owner(): String = unwrap(this).getOwner()

    override fun productName(): String = unwrap(this).getProductName()

    override fun productVersions(): List<CloudFormationProductVersion> =
        unwrap(this).getProductVersions().map(CloudFormationProductVersion::wrap)

    override fun replaceProductVersionIds(): Boolean? = unwrap(this).getReplaceProductVersionIds()

    override fun supportDescription(): String? = unwrap(this).getSupportDescription()

    override fun supportEmail(): String? = unwrap(this).getSupportEmail()

    override fun supportUrl(): String? = unwrap(this).getSupportUrl()

    override fun tagOptions(): TagOptions? = unwrap(this).getTagOptions()?.let(TagOptions::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CloudFormationProductProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationProductProps):
        CloudFormationProductProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFormationProductProps):
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductProps
  }
}
