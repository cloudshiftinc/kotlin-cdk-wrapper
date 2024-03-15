@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCloudFormationProductProps {
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  public fun description(): String? = unwrap(this).getDescription()

  public fun distributor(): String? = unwrap(this).getDistributor()

  public fun name(): String

  public fun owner(): String

  public fun productType(): String? = unwrap(this).getProductType()

  public fun provisioningArtifactParameters(): Any? =
      unwrap(this).getProvisioningArtifactParameters()

  public fun replaceProvisioningArtifacts(): Any? = unwrap(this).getReplaceProvisioningArtifacts()

  public fun sourceConnection(): Any? = unwrap(this).getSourceConnection()

  public fun supportDescription(): String? = unwrap(this).getSupportDescription()

  public fun supportEmail(): String? = unwrap(this).getSupportEmail()

  public fun supportUrl(): String? = unwrap(this).getSupportUrl()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String)

    public fun description(description: String)

    public fun distributor(distributor: String)

    public fun name(name: String)

    public fun owner(owner: String)

    public fun productType(productType: String)

    public fun provisioningArtifactParameters(provisioningArtifactParameters: IResolvable)

    public fun provisioningArtifactParameters(provisioningArtifactParameters: List<Any>)

    public fun provisioningArtifactParameters(vararg provisioningArtifactParameters: Any)

    public fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: Boolean)

    public fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: IResolvable)

    public fun sourceConnection(sourceConnection: IResolvable)

    public fun sourceConnection(sourceConnection: CfnCloudFormationProduct.SourceConnectionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("37f02c9cab79199518acbcc04ae6db80e32e3447c5b6ed80783c8f4edcb1c9d6")
    public
        fun sourceConnection(sourceConnection: CfnCloudFormationProduct.SourceConnectionProperty.Builder.() -> Unit)

    public fun supportDescription(supportDescription: String)

    public fun supportEmail(supportEmail: String)

    public fun supportUrl(supportUrl: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps.builder()

    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun distributor(distributor: String) {
      cdkBuilder.distributor(distributor)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    override fun productType(productType: String) {
      cdkBuilder.productType(productType)
    }

    override fun provisioningArtifactParameters(provisioningArtifactParameters: IResolvable) {
      cdkBuilder.provisioningArtifactParameters(provisioningArtifactParameters.let(IResolvable::unwrap))
    }

    override fun provisioningArtifactParameters(provisioningArtifactParameters: List<Any>) {
      cdkBuilder.provisioningArtifactParameters(provisioningArtifactParameters)
    }

    override fun provisioningArtifactParameters(vararg provisioningArtifactParameters: Any): Unit =
        provisioningArtifactParameters(provisioningArtifactParameters.toList())

    override fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: Boolean) {
      cdkBuilder.replaceProvisioningArtifacts(replaceProvisioningArtifacts)
    }

    override fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: IResolvable) {
      cdkBuilder.replaceProvisioningArtifacts(replaceProvisioningArtifacts.let(IResolvable::unwrap))
    }

    override fun sourceConnection(sourceConnection: IResolvable) {
      cdkBuilder.sourceConnection(sourceConnection.let(IResolvable::unwrap))
    }

    override
        fun sourceConnection(sourceConnection: CfnCloudFormationProduct.SourceConnectionProperty) {
      cdkBuilder.sourceConnection(sourceConnection.let(CfnCloudFormationProduct.SourceConnectionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("37f02c9cab79199518acbcc04ae6db80e32e3447c5b6ed80783c8f4edcb1c9d6")
    override
        fun sourceConnection(sourceConnection: CfnCloudFormationProduct.SourceConnectionProperty.Builder.() -> Unit):
        Unit = sourceConnection(CfnCloudFormationProduct.SourceConnectionProperty(sourceConnection))

    override fun supportDescription(supportDescription: String) {
      cdkBuilder.supportDescription(supportDescription)
    }

    override fun supportEmail(supportEmail: String) {
      cdkBuilder.supportEmail(supportEmail)
    }

    override fun supportUrl(supportUrl: String) {
      cdkBuilder.supportUrl(supportUrl)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps,
  ) : CdkObject(cdkObject), CfnCloudFormationProductProps {
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    override fun description(): String? = unwrap(this).getDescription()

    override fun distributor(): String? = unwrap(this).getDistributor()

    override fun name(): String = unwrap(this).getName()

    override fun owner(): String = unwrap(this).getOwner()

    override fun productType(): String? = unwrap(this).getProductType()

    override fun provisioningArtifactParameters(): Any? =
        unwrap(this).getProvisioningArtifactParameters()

    override fun replaceProvisioningArtifacts(): Any? =
        unwrap(this).getReplaceProvisioningArtifacts()

    override fun sourceConnection(): Any? = unwrap(this).getSourceConnection()

    override fun supportDescription(): String? = unwrap(this).getSupportDescription()

    override fun supportEmail(): String? = unwrap(this).getSupportEmail()

    override fun supportUrl(): String? = unwrap(this).getSupportUrl()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCloudFormationProductProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps):
        CfnCloudFormationProductProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCloudFormationProductProps):
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps
  }
}
