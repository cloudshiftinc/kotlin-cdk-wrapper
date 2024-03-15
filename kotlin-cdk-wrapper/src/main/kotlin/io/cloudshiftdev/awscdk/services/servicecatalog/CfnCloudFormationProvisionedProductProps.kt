@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCloudFormationProvisionedProductProps {
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  public fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?: emptyList()

  public fun pathId(): String? = unwrap(this).getPathId()

  public fun pathName(): String? = unwrap(this).getPathName()

  public fun productId(): String? = unwrap(this).getProductId()

  public fun productName(): String? = unwrap(this).getProductName()

  public fun provisionedProductName(): String? = unwrap(this).getProvisionedProductName()

  public fun provisioningArtifactId(): String? = unwrap(this).getProvisioningArtifactId()

  public fun provisioningArtifactName(): String? = unwrap(this).getProvisioningArtifactName()

  public fun provisioningParameters(): Any? = unwrap(this).getProvisioningParameters()

  public fun provisioningPreferences(): Any? = unwrap(this).getProvisioningPreferences()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String)

    public fun notificationArns(notificationArns: List<String>)

    public fun notificationArns(vararg notificationArns: String)

    public fun pathId(pathId: String)

    public fun pathName(pathName: String)

    public fun productId(productId: String)

    public fun productName(productName: String)

    public fun provisionedProductName(provisionedProductName: String)

    public fun provisioningArtifactId(provisioningArtifactId: String)

    public fun provisioningArtifactName(provisioningArtifactName: String)

    public fun provisioningParameters(provisioningParameters: IResolvable)

    public fun provisioningParameters(provisioningParameters: List<Any>)

    public fun provisioningParameters(vararg provisioningParameters: Any)

    public fun provisioningPreferences(provisioningPreferences: IResolvable)

    public
        fun provisioningPreferences(provisioningPreferences: CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("49d4cf67454648625c4764d68cee0d703ff27506e9016a0242ed7a6feef53fea")
    public
        fun provisioningPreferences(provisioningPreferences: CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps.Builder
        =
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps.builder()

    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    override fun notificationArns(notificationArns: List<String>) {
      cdkBuilder.notificationArns(notificationArns)
    }

    override fun notificationArns(vararg notificationArns: String): Unit =
        notificationArns(notificationArns.toList())

    override fun pathId(pathId: String) {
      cdkBuilder.pathId(pathId)
    }

    override fun pathName(pathName: String) {
      cdkBuilder.pathName(pathName)
    }

    override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    override fun productName(productName: String) {
      cdkBuilder.productName(productName)
    }

    override fun provisionedProductName(provisionedProductName: String) {
      cdkBuilder.provisionedProductName(provisionedProductName)
    }

    override fun provisioningArtifactId(provisioningArtifactId: String) {
      cdkBuilder.provisioningArtifactId(provisioningArtifactId)
    }

    override fun provisioningArtifactName(provisioningArtifactName: String) {
      cdkBuilder.provisioningArtifactName(provisioningArtifactName)
    }

    override fun provisioningParameters(provisioningParameters: IResolvable) {
      cdkBuilder.provisioningParameters(provisioningParameters.let(IResolvable::unwrap))
    }

    override fun provisioningParameters(provisioningParameters: List<Any>) {
      cdkBuilder.provisioningParameters(provisioningParameters)
    }

    override fun provisioningParameters(vararg provisioningParameters: Any): Unit =
        provisioningParameters(provisioningParameters.toList())

    override fun provisioningPreferences(provisioningPreferences: IResolvable) {
      cdkBuilder.provisioningPreferences(provisioningPreferences.let(IResolvable::unwrap))
    }

    override
        fun provisioningPreferences(provisioningPreferences: CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty) {
      cdkBuilder.provisioningPreferences(provisioningPreferences.let(CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("49d4cf67454648625c4764d68cee0d703ff27506e9016a0242ed7a6feef53fea")
    override
        fun provisioningPreferences(provisioningPreferences: CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty.Builder.() -> Unit):
        Unit =
        provisioningPreferences(CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty(provisioningPreferences))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps,
  ) : CdkObject(cdkObject), CfnCloudFormationProvisionedProductProps {
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    override fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?:
        emptyList()

    override fun pathId(): String? = unwrap(this).getPathId()

    override fun pathName(): String? = unwrap(this).getPathName()

    override fun productId(): String? = unwrap(this).getProductId()

    override fun productName(): String? = unwrap(this).getProductName()

    override fun provisionedProductName(): String? = unwrap(this).getProvisionedProductName()

    override fun provisioningArtifactId(): String? = unwrap(this).getProvisioningArtifactId()

    override fun provisioningArtifactName(): String? = unwrap(this).getProvisioningArtifactName()

    override fun provisioningParameters(): Any? = unwrap(this).getProvisioningParameters()

    override fun provisioningPreferences(): Any? = unwrap(this).getProvisioningPreferences()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnCloudFormationProvisionedProductProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps):
        CfnCloudFormationProvisionedProductProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCloudFormationProvisionedProductProps):
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps
  }
}
