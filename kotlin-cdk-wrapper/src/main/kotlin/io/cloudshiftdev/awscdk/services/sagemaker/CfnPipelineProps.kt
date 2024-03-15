@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPipelineProps {
  public fun parallelismConfiguration(): Any? = unwrap(this).getParallelismConfiguration()

  public fun pipelineDefinition(): Any

  public fun pipelineDescription(): String? = unwrap(this).getPipelineDescription()

  public fun pipelineDisplayName(): String? = unwrap(this).getPipelineDisplayName()

  public fun pipelineName(): String

  public fun roleArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun parallelismConfiguration(parallelismConfiguration: Any)

    public fun pipelineDefinition(pipelineDefinition: Any)

    public fun pipelineDescription(pipelineDescription: String)

    public fun pipelineDisplayName(pipelineDisplayName: String)

    public fun pipelineName(pipelineName: String)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnPipelineProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnPipelineProps.builder()

    override fun parallelismConfiguration(parallelismConfiguration: Any) {
      cdkBuilder.parallelismConfiguration(parallelismConfiguration)
    }

    override fun pipelineDefinition(pipelineDefinition: Any) {
      cdkBuilder.pipelineDefinition(pipelineDefinition)
    }

    override fun pipelineDescription(pipelineDescription: String) {
      cdkBuilder.pipelineDescription(pipelineDescription)
    }

    override fun pipelineDisplayName(pipelineDisplayName: String) {
      cdkBuilder.pipelineDisplayName(pipelineDisplayName)
    }

    override fun pipelineName(pipelineName: String) {
      cdkBuilder.pipelineName(pipelineName)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnPipelineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnPipelineProps,
  ) : CdkObject(cdkObject), CfnPipelineProps {
    override fun parallelismConfiguration(): Any? = unwrap(this).getParallelismConfiguration()

    override fun pipelineDefinition(): Any = unwrap(this).getPipelineDefinition()

    override fun pipelineDescription(): String? = unwrap(this).getPipelineDescription()

    override fun pipelineDisplayName(): String? = unwrap(this).getPipelineDisplayName()

    override fun pipelineName(): String = unwrap(this).getPipelineName()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPipelineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnPipelineProps):
        CfnPipelineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPipelineProps):
        software.amazon.awscdk.services.sagemaker.CfnPipelineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnPipelineProps
  }
}
