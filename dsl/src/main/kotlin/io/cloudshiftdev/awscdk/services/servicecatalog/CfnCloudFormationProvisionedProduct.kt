package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCloudFormationProvisionedProduct internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  public open fun acceptLanguage(`value`: String) {
    unwrap(this).setAcceptLanguage(`value`)
  }

  public open fun attrCloudformationStackArn(): String =
      unwrap(this).getAttrCloudformationStackArn()

  public open fun attrOutputs(): IResolvable = unwrap(this).getAttrOutputs().let(IResolvable::wrap)

  public open fun attrProvisionedProductId(): String = unwrap(this).getAttrProvisionedProductId()

  public open fun attrRecordId(): String = unwrap(this).getAttrRecordId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?:
      emptyList()

  public open fun notificationArns(`value`: List<String>) {
    unwrap(this).setNotificationArns(`value`)
  }

  public open fun pathId(): String? = unwrap(this).getPathId()

  public open fun pathId(`value`: String) {
    unwrap(this).setPathId(`value`)
  }

  public open fun pathName(): String? = unwrap(this).getPathName()

  public open fun pathName(`value`: String) {
    unwrap(this).setPathName(`value`)
  }

  public open fun productId(): String? = unwrap(this).getProductId()

  public open fun productId(`value`: String) {
    unwrap(this).setProductId(`value`)
  }

  public open fun productName(): String? = unwrap(this).getProductName()

  public open fun productName(`value`: String) {
    unwrap(this).setProductName(`value`)
  }

  public open fun provisionedProductName(): String? = unwrap(this).getProvisionedProductName()

  public open fun provisionedProductName(`value`: String) {
    unwrap(this).setProvisionedProductName(`value`)
  }

  public open fun provisioningArtifactId(): String? = unwrap(this).getProvisioningArtifactId()

  public open fun provisioningArtifactId(`value`: String) {
    unwrap(this).setProvisioningArtifactId(`value`)
  }

  public open fun provisioningArtifactName(): String? = unwrap(this).getProvisioningArtifactName()

  public open fun provisioningArtifactName(`value`: String) {
    unwrap(this).setProvisioningArtifactName(`value`)
  }

  public open fun provisioningParameters(): Any? = unwrap(this).getProvisioningParameters()

  public open fun provisioningParameters(`value`: IResolvable) {
    unwrap(this).setProvisioningParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun provisioningParameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setProvisioningParameters(__idx_ac66f0)
  }

  public open fun provisioningPreferences(): Any? = unwrap(this).getProvisioningPreferences()

  public open fun provisioningPreferences(`value`: IResolvable) {
    unwrap(this).setProvisioningPreferences(`value`.let(IResolvable::unwrap))
  }

  public open fun provisioningPreferences(`value`: ProvisioningPreferencesProperty) {
    unwrap(this).setProvisioningPreferences(`value`.let(ProvisioningPreferencesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9acaf27f7db779f54053aec0fb0497cf8a20985d8f50aa021a2787e9423728cb")
  public open
      fun provisioningPreferences(`value`: ProvisioningPreferencesProperty.Builder.() -> Unit): Unit
      = provisioningPreferences(ProvisioningPreferencesProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String)

    public fun notificationArns(notificationArns: List<String>)

    public fun pathId(pathId: String)

    public fun pathName(pathName: String)

    public fun productId(productId: String)

    public fun productName(productName: String)

    public fun provisionedProductName(provisionedProductName: String)

    public fun provisioningArtifactId(provisioningArtifactId: String)

    public fun provisioningArtifactName(provisioningArtifactName: String)

    public fun provisioningParameters(provisioningParameters: IResolvable)

    public fun provisioningParameters(provisioningParameters: List<Any>)

    public fun provisioningPreferences(provisioningPreferences: IResolvable)

    public fun provisioningPreferences(provisioningPreferences: ProvisioningPreferencesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c7bfa0d91a2109413d50bab59d017092f8e0720001bd47f7afae9453e5a190b")
    public
        fun provisioningPreferences(provisioningPreferences: ProvisioningPreferencesProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.Builder.create(scope,
        id)

    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    override fun notificationArns(notificationArns: List<String>) {
      cdkBuilder.notificationArns(notificationArns)
    }

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

    override fun provisioningPreferences(provisioningPreferences: IResolvable) {
      cdkBuilder.provisioningPreferences(provisioningPreferences.let(IResolvable::unwrap))
    }

    override fun provisioningPreferences(provisioningPreferences: ProvisioningPreferencesProperty) {
      cdkBuilder.provisioningPreferences(provisioningPreferences.let(ProvisioningPreferencesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c7bfa0d91a2109413d50bab59d017092f8e0720001bd47f7afae9453e5a190b")
    override
        fun provisioningPreferences(provisioningPreferences: ProvisioningPreferencesProperty.Builder.() -> Unit):
        Unit = provisioningPreferences(ProvisioningPreferencesProperty(provisioningPreferences))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCloudFormationProvisionedProduct {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCloudFormationProvisionedProduct(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct):
        CfnCloudFormationProvisionedProduct = CfnCloudFormationProvisionedProduct(cdkObject)

    internal fun unwrap(wrapped: CfnCloudFormationProvisionedProduct):
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct =
        wrapped.cdkObject
  }

  public interface ProvisioningParameterProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty.Builder
          =
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty,
    ) : ProvisioningParameterProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisioningParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty):
          ProvisioningParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisioningParameterProperty):
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ProvisioningPreferencesProperty {
    public fun stackSetAccounts(): List<String> = unwrap(this).getStackSetAccounts() ?: emptyList()

    public fun stackSetFailureToleranceCount(): Number? =
        unwrap(this).getStackSetFailureToleranceCount()

    public fun stackSetFailureTolerancePercentage(): Number? =
        unwrap(this).getStackSetFailureTolerancePercentage()

    public fun stackSetMaxConcurrencyCount(): Number? =
        unwrap(this).getStackSetMaxConcurrencyCount()

    public fun stackSetMaxConcurrencyPercentage(): Number? =
        unwrap(this).getStackSetMaxConcurrencyPercentage()

    public fun stackSetOperationType(): String? = unwrap(this).getStackSetOperationType()

    public fun stackSetRegions(): List<String> = unwrap(this).getStackSetRegions() ?: emptyList()

    public interface Builder {
      public fun stackSetAccounts(stackSetAccounts: List<String>)

      public fun stackSetFailureToleranceCount(stackSetFailureToleranceCount: Number)

      public fun stackSetFailureTolerancePercentage(stackSetFailureTolerancePercentage: Number)

      public fun stackSetMaxConcurrencyCount(stackSetMaxConcurrencyCount: Number)

      public fun stackSetMaxConcurrencyPercentage(stackSetMaxConcurrencyPercentage: Number)

      public fun stackSetOperationType(stackSetOperationType: String)

      public fun stackSetRegions(stackSetRegions: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty.Builder
          =
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty.builder()

      override fun stackSetAccounts(stackSetAccounts: List<String>) {
        cdkBuilder.stackSetAccounts(stackSetAccounts)
      }

      override fun stackSetFailureToleranceCount(stackSetFailureToleranceCount: Number) {
        cdkBuilder.stackSetFailureToleranceCount(stackSetFailureToleranceCount)
      }

      override fun stackSetFailureTolerancePercentage(stackSetFailureTolerancePercentage: Number) {
        cdkBuilder.stackSetFailureTolerancePercentage(stackSetFailureTolerancePercentage)
      }

      override fun stackSetMaxConcurrencyCount(stackSetMaxConcurrencyCount: Number) {
        cdkBuilder.stackSetMaxConcurrencyCount(stackSetMaxConcurrencyCount)
      }

      override fun stackSetMaxConcurrencyPercentage(stackSetMaxConcurrencyPercentage: Number) {
        cdkBuilder.stackSetMaxConcurrencyPercentage(stackSetMaxConcurrencyPercentage)
      }

      override fun stackSetOperationType(stackSetOperationType: String) {
        cdkBuilder.stackSetOperationType(stackSetOperationType)
      }

      override fun stackSetRegions(stackSetRegions: List<String>) {
        cdkBuilder.stackSetRegions(stackSetRegions)
      }

      public fun build():
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty,
    ) : ProvisioningPreferencesProperty {
      override fun stackSetAccounts(): List<String> = unwrap(this).getStackSetAccounts() ?:
          emptyList()

      override fun stackSetFailureToleranceCount(): Number? =
          unwrap(this).getStackSetFailureToleranceCount()

      override fun stackSetFailureTolerancePercentage(): Number? =
          unwrap(this).getStackSetFailureTolerancePercentage()

      override fun stackSetMaxConcurrencyCount(): Number? =
          unwrap(this).getStackSetMaxConcurrencyCount()

      override fun stackSetMaxConcurrencyPercentage(): Number? =
          unwrap(this).getStackSetMaxConcurrencyPercentage()

      override fun stackSetOperationType(): String? = unwrap(this).getStackSetOperationType()

      override fun stackSetRegions(): List<String> = unwrap(this).getStackSetRegions() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisioningPreferencesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty):
          ProvisioningPreferencesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisioningPreferencesProperty):
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
