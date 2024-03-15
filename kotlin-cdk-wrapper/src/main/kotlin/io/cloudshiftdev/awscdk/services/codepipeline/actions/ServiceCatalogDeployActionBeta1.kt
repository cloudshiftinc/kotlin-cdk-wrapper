@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.ArtifactPath
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

public open class ServiceCatalogDeployActionBeta1 internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1,
) : Action(cdkObject) {
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
        software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1.Builder.create()

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
        software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1 =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServiceCatalogDeployActionBeta1 {
      val builderImpl = BuilderImpl()
      return ServiceCatalogDeployActionBeta1(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1):
        ServiceCatalogDeployActionBeta1 = ServiceCatalogDeployActionBeta1(cdkObject)

    internal fun unwrap(wrapped: ServiceCatalogDeployActionBeta1):
        software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1 =
        wrapped.cdkObject
  }
}
