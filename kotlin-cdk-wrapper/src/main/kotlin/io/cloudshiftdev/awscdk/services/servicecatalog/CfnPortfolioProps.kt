@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPortfolioProps {
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  public fun description(): String? = unwrap(this).getDescription()

  public fun displayName(): String

  public fun providerName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String)

    public fun description(description: String)

    public fun displayName(displayName: String)

    public fun providerName(providerName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.CfnPortfolioProps.Builder
        = software.amazon.awscdk.services.servicecatalog.CfnPortfolioProps.builder()

    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun providerName(providerName: String) {
      cdkBuilder.providerName(providerName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnPortfolioProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.CfnPortfolioProps,
  ) : CdkObject(cdkObject), CfnPortfolioProps {
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    override fun description(): String? = unwrap(this).getDescription()

    override fun displayName(): String = unwrap(this).getDisplayName()

    override fun providerName(): String = unwrap(this).getProviderName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPortfolioProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnPortfolioProps):
        CfnPortfolioProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPortfolioProps):
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicecatalog.CfnPortfolioProps
  }
}
