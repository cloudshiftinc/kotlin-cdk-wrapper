@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.entityresolution

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnMatchingWorkflowProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun inputSourceConfig(): Any

  public fun outputSourceConfig(): Any

  public fun resolutionTechniques(): Any

  public fun roleArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun workflowName(): String

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun inputSourceConfig(inputSourceConfig: IResolvable)

    public fun inputSourceConfig(inputSourceConfig: List<Any>)

    public fun inputSourceConfig(vararg inputSourceConfig: Any)

    public fun outputSourceConfig(outputSourceConfig: IResolvable)

    public fun outputSourceConfig(outputSourceConfig: List<Any>)

    public fun outputSourceConfig(vararg outputSourceConfig: Any)

    public fun resolutionTechniques(resolutionTechniques: IResolvable)

    public
        fun resolutionTechniques(resolutionTechniques: CfnMatchingWorkflow.ResolutionTechniquesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e071d33f91722e35f7dc5d6da1e687f2a8d111ae39fd32dbde258193ce07e998")
    public
        fun resolutionTechniques(resolutionTechniques: CfnMatchingWorkflow.ResolutionTechniquesProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun workflowName(workflowName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflowProps.Builder =
        software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflowProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun inputSourceConfig(inputSourceConfig: IResolvable) {
      cdkBuilder.inputSourceConfig(inputSourceConfig.let(IResolvable::unwrap))
    }

    override fun inputSourceConfig(inputSourceConfig: List<Any>) {
      cdkBuilder.inputSourceConfig(inputSourceConfig)
    }

    override fun inputSourceConfig(vararg inputSourceConfig: Any): Unit =
        inputSourceConfig(inputSourceConfig.toList())

    override fun outputSourceConfig(outputSourceConfig: IResolvable) {
      cdkBuilder.outputSourceConfig(outputSourceConfig.let(IResolvable::unwrap))
    }

    override fun outputSourceConfig(outputSourceConfig: List<Any>) {
      cdkBuilder.outputSourceConfig(outputSourceConfig)
    }

    override fun outputSourceConfig(vararg outputSourceConfig: Any): Unit =
        outputSourceConfig(outputSourceConfig.toList())

    override fun resolutionTechniques(resolutionTechniques: IResolvable) {
      cdkBuilder.resolutionTechniques(resolutionTechniques.let(IResolvable::unwrap))
    }

    override
        fun resolutionTechniques(resolutionTechniques: CfnMatchingWorkflow.ResolutionTechniquesProperty) {
      cdkBuilder.resolutionTechniques(resolutionTechniques.let(CfnMatchingWorkflow.ResolutionTechniquesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e071d33f91722e35f7dc5d6da1e687f2a8d111ae39fd32dbde258193ce07e998")
    override
        fun resolutionTechniques(resolutionTechniques: CfnMatchingWorkflow.ResolutionTechniquesProperty.Builder.() -> Unit):
        Unit =
        resolutionTechniques(CfnMatchingWorkflow.ResolutionTechniquesProperty(resolutionTechniques))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun workflowName(workflowName: String) {
      cdkBuilder.workflowName(workflowName)
    }

    public fun build(): software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflowProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflowProps,
  ) : CdkObject(cdkObject), CfnMatchingWorkflowProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun inputSourceConfig(): Any = unwrap(this).getInputSourceConfig()

    override fun outputSourceConfig(): Any = unwrap(this).getOutputSourceConfig()

    override fun resolutionTechniques(): Any = unwrap(this).getResolutionTechniques()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun workflowName(): String = unwrap(this).getWorkflowName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMatchingWorkflowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflowProps):
        CfnMatchingWorkflowProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMatchingWorkflowProps):
        software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflowProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflowProps
  }
}
