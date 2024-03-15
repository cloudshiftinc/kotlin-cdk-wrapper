@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kendra

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDataSourceProps {
  public fun customDocumentEnrichmentConfiguration(): Any? =
      unwrap(this).getCustomDocumentEnrichmentConfiguration()

  public fun dataSourceConfiguration(): Any? = unwrap(this).getDataSourceConfiguration()

  public fun description(): String? = unwrap(this).getDescription()

  public fun indexId(): String

  public fun languageCode(): String? = unwrap(this).getLanguageCode()

  public fun name(): String

  public fun roleArn(): String? = unwrap(this).getRoleArn()

  public fun schedule(): String? = unwrap(this).getSchedule()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: IResolvable)

    public
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CfnDataSource.CustomDocumentEnrichmentConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9eda522c9f39dac439b0a9f4f1e2aadb01ae59be55d8b470f9ca4563b44c90ce")
    public
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CfnDataSource.CustomDocumentEnrichmentConfigurationProperty.Builder.() -> Unit)

    public fun dataSourceConfiguration(dataSourceConfiguration: IResolvable)

    public
        fun dataSourceConfiguration(dataSourceConfiguration: CfnDataSource.DataSourceConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec157f003c905715a686cc1bdfdfb78d9e147be840e23eb7b6b3cd78b8bb88e6")
    public
        fun dataSourceConfiguration(dataSourceConfiguration: CfnDataSource.DataSourceConfigurationProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun indexId(indexId: String)

    public fun languageCode(languageCode: String)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun schedule(schedule: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kendra.CfnDataSourceProps.Builder =
        software.amazon.awscdk.services.kendra.CfnDataSourceProps.builder()

    override
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: IResolvable) {
      cdkBuilder.customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration.let(IResolvable::unwrap))
    }

    override
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CfnDataSource.CustomDocumentEnrichmentConfigurationProperty) {
      cdkBuilder.customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration.let(CfnDataSource.CustomDocumentEnrichmentConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9eda522c9f39dac439b0a9f4f1e2aadb01ae59be55d8b470f9ca4563b44c90ce")
    override
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CfnDataSource.CustomDocumentEnrichmentConfigurationProperty.Builder.() -> Unit):
        Unit =
        customDocumentEnrichmentConfiguration(CfnDataSource.CustomDocumentEnrichmentConfigurationProperty(customDocumentEnrichmentConfiguration))

    override fun dataSourceConfiguration(dataSourceConfiguration: IResolvable) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(IResolvable::unwrap))
    }

    override
        fun dataSourceConfiguration(dataSourceConfiguration: CfnDataSource.DataSourceConfigurationProperty) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(CfnDataSource.DataSourceConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec157f003c905715a686cc1bdfdfb78d9e147be840e23eb7b6b3cd78b8bb88e6")
    override
        fun dataSourceConfiguration(dataSourceConfiguration: CfnDataSource.DataSourceConfigurationProperty.Builder.() -> Unit):
        Unit =
        dataSourceConfiguration(CfnDataSource.DataSourceConfigurationProperty(dataSourceConfiguration))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun indexId(indexId: String) {
      cdkBuilder.indexId(indexId)
    }

    override fun languageCode(languageCode: String) {
      cdkBuilder.languageCode(languageCode)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun schedule(schedule: String) {
      cdkBuilder.schedule(schedule)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.kendra.CfnDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kendra.CfnDataSourceProps,
  ) : CdkObject(cdkObject), CfnDataSourceProps {
    override fun customDocumentEnrichmentConfiguration(): Any? =
        unwrap(this).getCustomDocumentEnrichmentConfiguration()

    override fun dataSourceConfiguration(): Any? = unwrap(this).getDataSourceConfiguration()

    override fun description(): String? = unwrap(this).getDescription()

    override fun indexId(): String = unwrap(this).getIndexId()

    override fun languageCode(): String? = unwrap(this).getLanguageCode()

    override fun name(): String = unwrap(this).getName()

    override fun roleArn(): String? = unwrap(this).getRoleArn()

    override fun schedule(): String? = unwrap(this).getSchedule()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSourceProps):
        CfnDataSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataSourceProps):
        software.amazon.awscdk.services.kendra.CfnDataSourceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.kendra.CfnDataSourceProps
  }
}
