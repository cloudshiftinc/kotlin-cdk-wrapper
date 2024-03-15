@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.forecast

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDatasetProps {
  public fun dataFrequency(): String? = unwrap(this).getDataFrequency()

  public fun datasetName(): String

  public fun datasetType(): String

  public fun domain(): String

  public fun encryptionConfig(): Any? = unwrap(this).getEncryptionConfig()

  public fun schema(): Any

  public fun tags(): List<CfnDataset.TagsItemsProperty> =
      unwrap(this).getTags()?.map(CfnDataset.TagsItemsProperty::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun dataFrequency(dataFrequency: String)

    public fun datasetName(datasetName: String)

    public fun datasetType(datasetType: String)

    public fun domain(domain: String)

    public fun encryptionConfig(encryptionConfig: Any)

    public fun schema(schema: Any)

    public fun tags(tags: List<CfnDataset.TagsItemsProperty>)

    public fun tags(vararg tags: CfnDataset.TagsItemsProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.forecast.CfnDatasetProps.Builder =
        software.amazon.awscdk.services.forecast.CfnDatasetProps.builder()

    override fun dataFrequency(dataFrequency: String) {
      cdkBuilder.dataFrequency(dataFrequency)
    }

    override fun datasetName(datasetName: String) {
      cdkBuilder.datasetName(datasetName)
    }

    override fun datasetType(datasetType: String) {
      cdkBuilder.datasetType(datasetType)
    }

    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    override fun encryptionConfig(encryptionConfig: Any) {
      cdkBuilder.encryptionConfig(encryptionConfig)
    }

    override fun schema(schema: Any) {
      cdkBuilder.schema(schema)
    }

    override fun tags(tags: List<CfnDataset.TagsItemsProperty>) {
      cdkBuilder.tags(tags.map(CfnDataset.TagsItemsProperty::unwrap))
    }

    override fun tags(vararg tags: CfnDataset.TagsItemsProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.forecast.CfnDatasetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.forecast.CfnDatasetProps,
  ) : CdkObject(cdkObject), CfnDatasetProps {
    override fun dataFrequency(): String? = unwrap(this).getDataFrequency()

    override fun datasetName(): String = unwrap(this).getDatasetName()

    override fun datasetType(): String = unwrap(this).getDatasetType()

    override fun domain(): String = unwrap(this).getDomain()

    override fun encryptionConfig(): Any? = unwrap(this).getEncryptionConfig()

    override fun schema(): Any = unwrap(this).getSchema()

    override fun tags(): List<CfnDataset.TagsItemsProperty> =
        unwrap(this).getTags()?.map(CfnDataset.TagsItemsProperty::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatasetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.forecast.CfnDatasetProps):
        CfnDatasetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatasetProps):
        software.amazon.awscdk.services.forecast.CfnDatasetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.forecast.CfnDatasetProps
  }
}
