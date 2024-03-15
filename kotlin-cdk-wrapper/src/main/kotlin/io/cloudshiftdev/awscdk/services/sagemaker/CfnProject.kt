@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProject internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnProject,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrProjectArn(): String = unwrap(this).getAttrProjectArn()

  public open fun attrProjectId(): String = unwrap(this).getAttrProjectId()

  public open fun attrProjectStatus(): String = unwrap(this).getAttrProjectStatus()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun projectDescription(): String? = unwrap(this).getProjectDescription()

  public open fun projectDescription(`value`: String) {
    unwrap(this).setProjectDescription(`value`)
  }

  public open fun projectName(): String = unwrap(this).getProjectName()

  public open fun projectName(`value`: String) {
    unwrap(this).setProjectName(`value`)
  }

  public open fun serviceCatalogProvisionedProductDetails(): Any? =
      unwrap(this).getServiceCatalogProvisionedProductDetails()

  public open fun serviceCatalogProvisionedProductDetails(`value`: IResolvable) {
    unwrap(this).setServiceCatalogProvisionedProductDetails(`value`.let(IResolvable::unwrap))
  }

  public open
      fun serviceCatalogProvisionedProductDetails(`value`: ServiceCatalogProvisionedProductDetailsProperty) {
    unwrap(this).setServiceCatalogProvisionedProductDetails(`value`.let(ServiceCatalogProvisionedProductDetailsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("47d59c327c239c205abe906ffd0689edb9e0e62da9c55219c467d85b98ed1af4")
  public open
      fun serviceCatalogProvisionedProductDetails(`value`: ServiceCatalogProvisionedProductDetailsProperty.Builder.() -> Unit):
      Unit =
      serviceCatalogProvisionedProductDetails(ServiceCatalogProvisionedProductDetailsProperty(`value`))

  public open fun serviceCatalogProvisioningDetails(): Any =
      unwrap(this).getServiceCatalogProvisioningDetails()

  public open fun serviceCatalogProvisioningDetails(`value`: Any) {
    unwrap(this).setServiceCatalogProvisioningDetails(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun projectDescription(projectDescription: String)

    public fun projectName(projectName: String)

    public
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: IResolvable)

    public
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: ServiceCatalogProvisionedProductDetailsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40b490351078a78befe44c205e665063d2437f322bd6907d96cdab41adbcf267")
    public
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: ServiceCatalogProvisionedProductDetailsProperty.Builder.() -> Unit)

    public fun serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnProject.Builder =
        software.amazon.awscdk.services.sagemaker.CfnProject.Builder.create(scope, id)

    override fun projectDescription(projectDescription: String) {
      cdkBuilder.projectDescription(projectDescription)
    }

    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    override
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: IResolvable) {
      cdkBuilder.serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails.let(IResolvable::unwrap))
    }

    override
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: ServiceCatalogProvisionedProductDetailsProperty) {
      cdkBuilder.serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails.let(ServiceCatalogProvisionedProductDetailsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40b490351078a78befe44c205e665063d2437f322bd6907d96cdab41adbcf267")
    override
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: ServiceCatalogProvisionedProductDetailsProperty.Builder.() -> Unit):
        Unit =
        serviceCatalogProvisionedProductDetails(ServiceCatalogProvisionedProductDetailsProperty(serviceCatalogProvisionedProductDetails))

    override fun serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails: Any) {
      cdkBuilder.serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnProject = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnProject.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnProject): CfnProject =
        CfnProject(cdkObject)

    internal fun unwrap(wrapped: CfnProject): software.amazon.awscdk.services.sagemaker.CfnProject =
        wrapped.cdkObject
  }

  public interface ServiceCatalogProvisioningDetailsProperty {
    public fun pathId(): String? = unwrap(this).getPathId()

    public fun productId(): String

    public fun provisioningArtifactId(): String? = unwrap(this).getProvisioningArtifactId()

    public fun provisioningParameters(): Any? = unwrap(this).getProvisioningParameters()

    @CdkDslMarker
    public interface Builder {
      public fun pathId(pathId: String)

      public fun productId(productId: String)

      public fun provisioningArtifactId(provisioningArtifactId: String)

      public fun provisioningParameters(provisioningParameters: IResolvable)

      public fun provisioningParameters(provisioningParameters: List<Any>)

      public fun provisioningParameters(vararg provisioningParameters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisioningDetailsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisioningDetailsProperty.builder()

      override fun pathId(pathId: String) {
        cdkBuilder.pathId(pathId)
      }

      override fun productId(productId: String) {
        cdkBuilder.productId(productId)
      }

      override fun provisioningArtifactId(provisioningArtifactId: String) {
        cdkBuilder.provisioningArtifactId(provisioningArtifactId)
      }

      override fun provisioningParameters(provisioningParameters: IResolvable) {
        cdkBuilder.provisioningParameters(provisioningParameters.let(IResolvable::unwrap))
      }

      override fun provisioningParameters(provisioningParameters: List<Any>) {
        cdkBuilder.provisioningParameters(provisioningParameters)
      }

      override fun provisioningParameters(vararg provisioningParameters: Any): Unit =
          provisioningParameters(provisioningParameters.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisioningDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisioningDetailsProperty,
    ) : CdkObject(cdkObject), ServiceCatalogProvisioningDetailsProperty {
      override fun pathId(): String? = unwrap(this).getPathId()

      override fun productId(): String = unwrap(this).getProductId()

      override fun provisioningArtifactId(): String? = unwrap(this).getProvisioningArtifactId()

      override fun provisioningParameters(): Any? = unwrap(this).getProvisioningParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceCatalogProvisioningDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisioningDetailsProperty):
          ServiceCatalogProvisioningDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceCatalogProvisioningDetailsProperty):
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisioningDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisioningDetailsProperty
    }
  }

  public interface ProvisioningParameterProperty {
    public fun key(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnProject.ProvisioningParameterProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnProject.ProvisioningParameterProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnProject.ProvisioningParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnProject.ProvisioningParameterProperty,
    ) : CdkObject(cdkObject), ProvisioningParameterProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisioningParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnProject.ProvisioningParameterProperty):
          ProvisioningParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisioningParameterProperty):
          software.amazon.awscdk.services.sagemaker.CfnProject.ProvisioningParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnProject.ProvisioningParameterProperty
    }
  }

  public interface ServiceCatalogProvisionedProductDetailsProperty {
    public fun provisionedProductId(): String? = unwrap(this).getProvisionedProductId()

    public fun provisionedProductStatusMessage(): String? =
        unwrap(this).getProvisionedProductStatusMessage()

    @CdkDslMarker
    public interface Builder {
      public fun provisionedProductId(provisionedProductId: String)

      public fun provisionedProductStatusMessage(provisionedProductStatusMessage: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisionedProductDetailsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisionedProductDetailsProperty.builder()

      override fun provisionedProductId(provisionedProductId: String) {
        cdkBuilder.provisionedProductId(provisionedProductId)
      }

      override fun provisionedProductStatusMessage(provisionedProductStatusMessage: String) {
        cdkBuilder.provisionedProductStatusMessage(provisionedProductStatusMessage)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisionedProductDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisionedProductDetailsProperty,
    ) : CdkObject(cdkObject), ServiceCatalogProvisionedProductDetailsProperty {
      override fun provisionedProductId(): String? = unwrap(this).getProvisionedProductId()

      override fun provisionedProductStatusMessage(): String? =
          unwrap(this).getProvisionedProductStatusMessage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceCatalogProvisionedProductDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisionedProductDetailsProperty):
          ServiceCatalogProvisionedProductDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceCatalogProvisionedProductDetailsProperty):
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisionedProductDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisionedProductDetailsProperty
    }
  }
}
