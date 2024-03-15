@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appflow

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnFlowProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun destinationFlowConfigList(): Any

  public fun flowName(): String

  public fun flowStatus(): String? = unwrap(this).getFlowStatus()

  public fun kmsArn(): String? = unwrap(this).getKmsArn()

  public fun metadataCatalogConfig(): Any? = unwrap(this).getMetadataCatalogConfig()

  public fun sourceFlowConfig(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun tasks(): Any

  public fun triggerConfig(): Any

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun destinationFlowConfigList(destinationFlowConfigList: IResolvable)

    public fun destinationFlowConfigList(destinationFlowConfigList: List<Any>)

    public fun destinationFlowConfigList(vararg destinationFlowConfigList: Any)

    public fun flowName(flowName: String)

    public fun flowStatus(flowStatus: String)

    public fun kmsArn(kmsArn: String)

    public fun metadataCatalogConfig(metadataCatalogConfig: IResolvable)

    public fun metadataCatalogConfig(metadataCatalogConfig: CfnFlow.MetadataCatalogConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b73fcfdcd7a024c30a67ebb7555d5657b3b22e689ab0a794d78e09061cfed923")
    public
        fun metadataCatalogConfig(metadataCatalogConfig: CfnFlow.MetadataCatalogConfigProperty.Builder.() -> Unit)

    public fun sourceFlowConfig(sourceFlowConfig: IResolvable)

    public fun sourceFlowConfig(sourceFlowConfig: CfnFlow.SourceFlowConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da5ac7fda3f9ee0d02b4fd08480b1ef093c9a5893fbb784a09a24ccc61354bba")
    public
        fun sourceFlowConfig(sourceFlowConfig: CfnFlow.SourceFlowConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun tasks(tasks: IResolvable)

    public fun tasks(tasks: List<Any>)

    public fun tasks(vararg tasks: Any)

    public fun triggerConfig(triggerConfig: IResolvable)

    public fun triggerConfig(triggerConfig: CfnFlow.TriggerConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a6f7b25b6dc6f9cb11463694b3f50397b41edd91e4387201caaf4d3f7563f69")
    public fun triggerConfig(triggerConfig: CfnFlow.TriggerConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appflow.CfnFlowProps.Builder =
        software.amazon.awscdk.services.appflow.CfnFlowProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun destinationFlowConfigList(destinationFlowConfigList: IResolvable) {
      cdkBuilder.destinationFlowConfigList(destinationFlowConfigList.let(IResolvable::unwrap))
    }

    override fun destinationFlowConfigList(destinationFlowConfigList: List<Any>) {
      cdkBuilder.destinationFlowConfigList(destinationFlowConfigList)
    }

    override fun destinationFlowConfigList(vararg destinationFlowConfigList: Any): Unit =
        destinationFlowConfigList(destinationFlowConfigList.toList())

    override fun flowName(flowName: String) {
      cdkBuilder.flowName(flowName)
    }

    override fun flowStatus(flowStatus: String) {
      cdkBuilder.flowStatus(flowStatus)
    }

    override fun kmsArn(kmsArn: String) {
      cdkBuilder.kmsArn(kmsArn)
    }

    override fun metadataCatalogConfig(metadataCatalogConfig: IResolvable) {
      cdkBuilder.metadataCatalogConfig(metadataCatalogConfig.let(IResolvable::unwrap))
    }

    override
        fun metadataCatalogConfig(metadataCatalogConfig: CfnFlow.MetadataCatalogConfigProperty) {
      cdkBuilder.metadataCatalogConfig(metadataCatalogConfig.let(CfnFlow.MetadataCatalogConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b73fcfdcd7a024c30a67ebb7555d5657b3b22e689ab0a794d78e09061cfed923")
    override
        fun metadataCatalogConfig(metadataCatalogConfig: CfnFlow.MetadataCatalogConfigProperty.Builder.() -> Unit):
        Unit = metadataCatalogConfig(CfnFlow.MetadataCatalogConfigProperty(metadataCatalogConfig))

    override fun sourceFlowConfig(sourceFlowConfig: IResolvable) {
      cdkBuilder.sourceFlowConfig(sourceFlowConfig.let(IResolvable::unwrap))
    }

    override fun sourceFlowConfig(sourceFlowConfig: CfnFlow.SourceFlowConfigProperty) {
      cdkBuilder.sourceFlowConfig(sourceFlowConfig.let(CfnFlow.SourceFlowConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da5ac7fda3f9ee0d02b4fd08480b1ef093c9a5893fbb784a09a24ccc61354bba")
    override
        fun sourceFlowConfig(sourceFlowConfig: CfnFlow.SourceFlowConfigProperty.Builder.() -> Unit):
        Unit = sourceFlowConfig(CfnFlow.SourceFlowConfigProperty(sourceFlowConfig))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun tasks(tasks: IResolvable) {
      cdkBuilder.tasks(tasks.let(IResolvable::unwrap))
    }

    override fun tasks(tasks: List<Any>) {
      cdkBuilder.tasks(tasks)
    }

    override fun tasks(vararg tasks: Any): Unit = tasks(tasks.toList())

    override fun triggerConfig(triggerConfig: IResolvable) {
      cdkBuilder.triggerConfig(triggerConfig.let(IResolvable::unwrap))
    }

    override fun triggerConfig(triggerConfig: CfnFlow.TriggerConfigProperty) {
      cdkBuilder.triggerConfig(triggerConfig.let(CfnFlow.TriggerConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a6f7b25b6dc6f9cb11463694b3f50397b41edd91e4387201caaf4d3f7563f69")
    override fun triggerConfig(triggerConfig: CfnFlow.TriggerConfigProperty.Builder.() -> Unit):
        Unit = triggerConfig(CfnFlow.TriggerConfigProperty(triggerConfig))

    public fun build(): software.amazon.awscdk.services.appflow.CfnFlowProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appflow.CfnFlowProps,
  ) : CdkObject(cdkObject), CfnFlowProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun destinationFlowConfigList(): Any = unwrap(this).getDestinationFlowConfigList()

    override fun flowName(): String = unwrap(this).getFlowName()

    override fun flowStatus(): String? = unwrap(this).getFlowStatus()

    override fun kmsArn(): String? = unwrap(this).getKmsArn()

    override fun metadataCatalogConfig(): Any? = unwrap(this).getMetadataCatalogConfig()

    override fun sourceFlowConfig(): Any = unwrap(this).getSourceFlowConfig()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun tasks(): Any = unwrap(this).getTasks()

    override fun triggerConfig(): Any = unwrap(this).getTriggerConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlowProps): CfnFlowProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFlowProps): software.amazon.awscdk.services.appflow.CfnFlowProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appflow.CfnFlowProps
  }
}
