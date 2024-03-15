@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.forecast

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDatasetGroupProps {
  public fun datasetArns(): List<String> = unwrap(this).getDatasetArns() ?: emptyList()

  public fun datasetGroupName(): String

  public fun domain(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun datasetArns(datasetArns: List<String>)

    public fun datasetArns(vararg datasetArns: String)

    public fun datasetGroupName(datasetGroupName: String)

    public fun domain(domain: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.forecast.CfnDatasetGroupProps.Builder =
        software.amazon.awscdk.services.forecast.CfnDatasetGroupProps.builder()

    override fun datasetArns(datasetArns: List<String>) {
      cdkBuilder.datasetArns(datasetArns)
    }

    override fun datasetArns(vararg datasetArns: String): Unit = datasetArns(datasetArns.toList())

    override fun datasetGroupName(datasetGroupName: String) {
      cdkBuilder.datasetGroupName(datasetGroupName)
    }

    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.forecast.CfnDatasetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.forecast.CfnDatasetGroupProps,
  ) : CdkObject(cdkObject), CfnDatasetGroupProps {
    override fun datasetArns(): List<String> = unwrap(this).getDatasetArns() ?: emptyList()

    override fun datasetGroupName(): String = unwrap(this).getDatasetGroupName()

    override fun domain(): String = unwrap(this).getDomain()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatasetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.forecast.CfnDatasetGroupProps):
        CfnDatasetGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatasetGroupProps):
        software.amazon.awscdk.services.forecast.CfnDatasetGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.forecast.CfnDatasetGroupProps
  }
}
