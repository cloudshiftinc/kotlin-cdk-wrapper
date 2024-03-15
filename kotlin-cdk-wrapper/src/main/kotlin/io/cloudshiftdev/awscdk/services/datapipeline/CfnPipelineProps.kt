@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datapipeline

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPipelineProps {
  public fun activate(): Any? = unwrap(this).getActivate()

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun parameterObjects(): Any? = unwrap(this).getParameterObjects()

  public fun parameterValues(): Any? = unwrap(this).getParameterValues()

  public fun pipelineObjects(): Any? = unwrap(this).getPipelineObjects()

  public fun pipelineTags(): List<CfnPipeline.PipelineTagProperty> =
      unwrap(this).getPipelineTags()?.map(CfnPipeline.PipelineTagProperty::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun activate(activate: Boolean)

    public fun activate(activate: IResolvable)

    public fun description(description: String)

    public fun name(name: String)

    public fun parameterObjects(parameterObjects: IResolvable)

    public fun parameterObjects(parameterObjects: List<Any>)

    public fun parameterObjects(vararg parameterObjects: Any)

    public fun parameterValues(parameterValues: IResolvable)

    public fun parameterValues(parameterValues: List<Any>)

    public fun parameterValues(vararg parameterValues: Any)

    public fun pipelineObjects(pipelineObjects: IResolvable)

    public fun pipelineObjects(pipelineObjects: List<Any>)

    public fun pipelineObjects(vararg pipelineObjects: Any)

    public fun pipelineTags(pipelineTags: List<CfnPipeline.PipelineTagProperty>)

    public fun pipelineTags(vararg pipelineTags: CfnPipeline.PipelineTagProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datapipeline.CfnPipelineProps.Builder =
        software.amazon.awscdk.services.datapipeline.CfnPipelineProps.builder()

    override fun activate(activate: Boolean) {
      cdkBuilder.activate(activate)
    }

    override fun activate(activate: IResolvable) {
      cdkBuilder.activate(activate.let(IResolvable::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun parameterObjects(parameterObjects: IResolvable) {
      cdkBuilder.parameterObjects(parameterObjects.let(IResolvable::unwrap))
    }

    override fun parameterObjects(parameterObjects: List<Any>) {
      cdkBuilder.parameterObjects(parameterObjects)
    }

    override fun parameterObjects(vararg parameterObjects: Any): Unit =
        parameterObjects(parameterObjects.toList())

    override fun parameterValues(parameterValues: IResolvable) {
      cdkBuilder.parameterValues(parameterValues.let(IResolvable::unwrap))
    }

    override fun parameterValues(parameterValues: List<Any>) {
      cdkBuilder.parameterValues(parameterValues)
    }

    override fun parameterValues(vararg parameterValues: Any): Unit =
        parameterValues(parameterValues.toList())

    override fun pipelineObjects(pipelineObjects: IResolvable) {
      cdkBuilder.pipelineObjects(pipelineObjects.let(IResolvable::unwrap))
    }

    override fun pipelineObjects(pipelineObjects: List<Any>) {
      cdkBuilder.pipelineObjects(pipelineObjects)
    }

    override fun pipelineObjects(vararg pipelineObjects: Any): Unit =
        pipelineObjects(pipelineObjects.toList())

    override fun pipelineTags(pipelineTags: List<CfnPipeline.PipelineTagProperty>) {
      cdkBuilder.pipelineTags(pipelineTags.map(CfnPipeline.PipelineTagProperty::unwrap))
    }

    override fun pipelineTags(vararg pipelineTags: CfnPipeline.PipelineTagProperty): Unit =
        pipelineTags(pipelineTags.toList())

    public fun build(): software.amazon.awscdk.services.datapipeline.CfnPipelineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datapipeline.CfnPipelineProps,
  ) : CdkObject(cdkObject), CfnPipelineProps {
    override fun activate(): Any? = unwrap(this).getActivate()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun parameterObjects(): Any? = unwrap(this).getParameterObjects()

    override fun parameterValues(): Any? = unwrap(this).getParameterValues()

    override fun pipelineObjects(): Any? = unwrap(this).getPipelineObjects()

    override fun pipelineTags(): List<CfnPipeline.PipelineTagProperty> =
        unwrap(this).getPipelineTags()?.map(CfnPipeline.PipelineTagProperty::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPipelineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datapipeline.CfnPipelineProps):
        CfnPipelineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPipelineProps):
        software.amazon.awscdk.services.datapipeline.CfnPipelineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datapipeline.CfnPipelineProps
  }
}
