@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.ArtifactPath
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface ServiceCatalogDeployActionBeta1Props : CommonAwsActionProps {
  public fun productId(): String

  public fun productVersionDescription(): String? = unwrap(this).getProductVersionDescription()

  public fun productVersionName(): String

  public fun templatePath(): ArtifactPath

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun productId(productId: String)

    public fun productVersionDescription(productVersionDescription: String)

    public fun productVersionName(productVersionName: String)

    public fun role(role: IRole)

    public fun runOrder(runOrder: Number)

    public fun templatePath(templatePath: ArtifactPath)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1Props.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1Props.builder()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    override fun productVersionDescription(productVersionDescription: String) {
      cdkBuilder.productVersionDescription(productVersionDescription)
    }

    override fun productVersionName(productVersionName: String) {
      cdkBuilder.productVersionName(productVersionName)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    override fun templatePath(templatePath: ArtifactPath) {
      cdkBuilder.templatePath(templatePath.let(ArtifactPath::unwrap))
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1Props =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1Props,
  ) : CdkObject(cdkObject), ServiceCatalogDeployActionBeta1Props {
    override fun actionName(): String = unwrap(this).getActionName()

    override fun productId(): String = unwrap(this).getProductId()

    override fun productVersionDescription(): String? = unwrap(this).getProductVersionDescription()

    override fun productVersionName(): String = unwrap(this).getProductVersionName()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun templatePath(): ArtifactPath =
        unwrap(this).getTemplatePath().let(ArtifactPath::wrap)

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        ServiceCatalogDeployActionBeta1Props {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1Props):
        ServiceCatalogDeployActionBeta1Props = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServiceCatalogDeployActionBeta1Props):
        software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1Props =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1Props
  }
}
