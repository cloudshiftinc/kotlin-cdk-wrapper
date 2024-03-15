@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnProjectProps {
  public fun projectDescription(): String? = unwrap(this).getProjectDescription()

  public fun projectName(): String

  public fun serviceCatalogProvisionedProductDetails(): Any? =
      unwrap(this).getServiceCatalogProvisionedProductDetails()

  public fun serviceCatalogProvisioningDetails(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun projectDescription(projectDescription: String)

    public fun projectName(projectName: String)

    public
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: IResolvable)

    public
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: CfnProject.ServiceCatalogProvisionedProductDetailsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("624c627b17da2c99bdd42645d860291508bc1e9d9f5ab29799000cfbd963acb4")
    public
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: CfnProject.ServiceCatalogProvisionedProductDetailsProperty.Builder.() -> Unit)

    public fun serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnProjectProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnProjectProps.builder()

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
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: CfnProject.ServiceCatalogProvisionedProductDetailsProperty) {
      cdkBuilder.serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails.let(CfnProject.ServiceCatalogProvisionedProductDetailsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("624c627b17da2c99bdd42645d860291508bc1e9d9f5ab29799000cfbd963acb4")
    override
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: CfnProject.ServiceCatalogProvisionedProductDetailsProperty.Builder.() -> Unit):
        Unit =
        serviceCatalogProvisionedProductDetails(CfnProject.ServiceCatalogProvisionedProductDetailsProperty(serviceCatalogProvisionedProductDetails))

    override fun serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails: Any) {
      cdkBuilder.serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnProjectProps,
  ) : CdkObject(cdkObject), CfnProjectProps {
    override fun projectDescription(): String? = unwrap(this).getProjectDescription()

    override fun projectName(): String = unwrap(this).getProjectName()

    override fun serviceCatalogProvisionedProductDetails(): Any? =
        unwrap(this).getServiceCatalogProvisionedProductDetails()

    override fun serviceCatalogProvisioningDetails(): Any =
        unwrap(this).getServiceCatalogProvisioningDetails()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnProjectProps):
        CfnProjectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProjectProps):
        software.amazon.awscdk.services.sagemaker.CfnProjectProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sagemaker.CfnProjectProps
  }
}
