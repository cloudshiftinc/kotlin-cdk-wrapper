@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ProductStackHistory internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.servicecatalog.ProductStackHistory,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun currentVersion(): CloudFormationProductVersion =
      unwrap(this).currentVersion().let(CloudFormationProductVersion::wrap)

  public open fun versionFromSnapshot(productVersionName: String): CloudFormationProductVersion =
      unwrap(this).versionFromSnapshot(productVersionName).let(CloudFormationProductVersion::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun currentVersionLocked(currentVersionLocked: Boolean)

    public fun currentVersionName(currentVersionName: String)

    public fun description(description: String)

    public fun directory(directory: String)

    public fun productStack(productStack: ProductStack)

    public fun validateTemplate(validateTemplate: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.ProductStackHistory.Builder =
        software.amazon.awscdk.services.servicecatalog.ProductStackHistory.Builder.create(scope, id)

    override fun currentVersionLocked(currentVersionLocked: Boolean) {
      cdkBuilder.currentVersionLocked(currentVersionLocked)
    }

    override fun currentVersionName(currentVersionName: String) {
      cdkBuilder.currentVersionName(currentVersionName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun directory(directory: String) {
      cdkBuilder.directory(directory)
    }

    override fun productStack(productStack: ProductStack) {
      cdkBuilder.productStack(productStack.let(ProductStack::unwrap))
    }

    override fun validateTemplate(validateTemplate: Boolean) {
      cdkBuilder.validateTemplate(validateTemplate)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.ProductStackHistory =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ProductStackHistory {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ProductStackHistory(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.ProductStackHistory):
        ProductStackHistory = ProductStackHistory(cdkObject)

    internal fun unwrap(wrapped: ProductStackHistory):
        software.amazon.awscdk.services.servicecatalog.ProductStackHistory = wrapped.cdkObject
  }
}
