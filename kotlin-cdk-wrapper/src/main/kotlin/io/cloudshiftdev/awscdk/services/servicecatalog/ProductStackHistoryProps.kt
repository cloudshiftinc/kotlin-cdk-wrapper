@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface ProductStackHistoryProps {
  public fun currentVersionLocked(): Boolean

  public fun currentVersionName(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun directory(): String? = unwrap(this).getDirectory()

  public fun productStack(): ProductStack

  public fun validateTemplate(): Boolean? = unwrap(this).getValidateTemplate()

  @CdkDslMarker
  public interface Builder {
    public fun currentVersionLocked(currentVersionLocked: Boolean)

    public fun currentVersionName(currentVersionName: String)

    public fun description(description: String)

    public fun directory(directory: String)

    public fun productStack(productStack: ProductStack)

    public fun validateTemplate(validateTemplate: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.ProductStackHistoryProps.Builder =
        software.amazon.awscdk.services.servicecatalog.ProductStackHistoryProps.builder()

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

    public fun build(): software.amazon.awscdk.services.servicecatalog.ProductStackHistoryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.ProductStackHistoryProps,
  ) : CdkObject(cdkObject), ProductStackHistoryProps {
    override fun currentVersionLocked(): Boolean = unwrap(this).getCurrentVersionLocked()

    override fun currentVersionName(): String = unwrap(this).getCurrentVersionName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun directory(): String? = unwrap(this).getDirectory()

    override fun productStack(): ProductStack =
        unwrap(this).getProductStack().let(ProductStack::wrap)

    override fun validateTemplate(): Boolean? = unwrap(this).getValidateTemplate()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ProductStackHistoryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.ProductStackHistoryProps):
        ProductStackHistoryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProductStackHistoryProps):
        software.amazon.awscdk.services.servicecatalog.ProductStackHistoryProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.ProductStackHistoryProps
  }
}
