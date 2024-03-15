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

public interface CfnIdMappingWorkflowProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun idMappingTechniques(): Any

  public fun inputSourceConfig(): Any

  public fun outputSourceConfig(): Any

  public fun roleArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun workflowName(): String

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun idMappingTechniques(idMappingTechniques: IResolvable)

    public
        fun idMappingTechniques(idMappingTechniques: CfnIdMappingWorkflow.IdMappingTechniquesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9593406f44ebd4be37ba4b85dee9531e9059ac32c4256bb3cfad2cba55d5fb48")
    public
        fun idMappingTechniques(idMappingTechniques: CfnIdMappingWorkflow.IdMappingTechniquesProperty.Builder.() -> Unit)

    public fun inputSourceConfig(inputSourceConfig: IResolvable)

    public fun inputSourceConfig(inputSourceConfig: List<Any>)

    public fun inputSourceConfig(vararg inputSourceConfig: Any)

    public fun outputSourceConfig(outputSourceConfig: IResolvable)

    public fun outputSourceConfig(outputSourceConfig: List<Any>)

    public fun outputSourceConfig(vararg outputSourceConfig: Any)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun workflowName(workflowName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflowProps.Builder =
        software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflowProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun idMappingTechniques(idMappingTechniques: IResolvable) {
      cdkBuilder.idMappingTechniques(idMappingTechniques.let(IResolvable::unwrap))
    }

    override
        fun idMappingTechniques(idMappingTechniques: CfnIdMappingWorkflow.IdMappingTechniquesProperty) {
      cdkBuilder.idMappingTechniques(idMappingTechniques.let(CfnIdMappingWorkflow.IdMappingTechniquesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9593406f44ebd4be37ba4b85dee9531e9059ac32c4256bb3cfad2cba55d5fb48")
    override
        fun idMappingTechniques(idMappingTechniques: CfnIdMappingWorkflow.IdMappingTechniquesProperty.Builder.() -> Unit):
        Unit =
        idMappingTechniques(CfnIdMappingWorkflow.IdMappingTechniquesProperty(idMappingTechniques))

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

    public fun build(): software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflowProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflowProps,
  ) : CdkObject(cdkObject), CfnIdMappingWorkflowProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun idMappingTechniques(): Any = unwrap(this).getIdMappingTechniques()

    override fun inputSourceConfig(): Any = unwrap(this).getInputSourceConfig()

    override fun outputSourceConfig(): Any = unwrap(this).getOutputSourceConfig()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun workflowName(): String = unwrap(this).getWorkflowName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIdMappingWorkflowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflowProps):
        CfnIdMappingWorkflowProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIdMappingWorkflowProps):
        software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflowProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflowProps
  }
}
