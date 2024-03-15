@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnJobDefinitionProps {
  public fun containerProperties(): Any? = unwrap(this).getContainerProperties()

  public fun eksProperties(): Any? = unwrap(this).getEksProperties()

  public fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

  public fun nodeProperties(): Any? = unwrap(this).getNodeProperties()

  public fun parameters(): Any? = unwrap(this).getParameters()

  public fun platformCapabilities(): List<String> = unwrap(this).getPlatformCapabilities() ?:
      emptyList()

  public fun propagateTags(): Any? = unwrap(this).getPropagateTags()

  public fun retryStrategy(): Any? = unwrap(this).getRetryStrategy()

  public fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

  public fun tags(): Any? = unwrap(this).getTags()

  public fun timeout(): Any? = unwrap(this).getTimeout()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun containerProperties(containerProperties: IResolvable)

    public
        fun containerProperties(containerProperties: CfnJobDefinition.ContainerPropertiesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("053386f06704f2f46eb669e0aacea0f9c806d04bf5eceb27797cbf2ded5df3fe")
    public
        fun containerProperties(containerProperties: CfnJobDefinition.ContainerPropertiesProperty.Builder.() -> Unit)

    public fun eksProperties(eksProperties: IResolvable)

    public fun eksProperties(eksProperties: CfnJobDefinition.EksPropertiesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d5504f1b6c302985814b54fb3bf51be7430fcbcd0c5140672e8f5dfa6c867c0")
    public
        fun eksProperties(eksProperties: CfnJobDefinition.EksPropertiesProperty.Builder.() -> Unit)

    public fun jobDefinitionName(jobDefinitionName: String)

    public fun nodeProperties(nodeProperties: IResolvable)

    public fun nodeProperties(nodeProperties: CfnJobDefinition.NodePropertiesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45483dfc3eb6d7ded183c158eff360fa9a8f583569d9fec74d0c1dffaca06120")
    public
        fun nodeProperties(nodeProperties: CfnJobDefinition.NodePropertiesProperty.Builder.() -> Unit)

    public fun parameters(parameters: Any)

    public fun platformCapabilities(platformCapabilities: List<String>)

    public fun platformCapabilities(vararg platformCapabilities: String)

    public fun propagateTags(propagateTags: Boolean)

    public fun propagateTags(propagateTags: IResolvable)

    public fun retryStrategy(retryStrategy: IResolvable)

    public fun retryStrategy(retryStrategy: CfnJobDefinition.RetryStrategyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c959b37bd00124009c37511a4cc3819aa64e818c3d341547f85161f16885fd2")
    public
        fun retryStrategy(retryStrategy: CfnJobDefinition.RetryStrategyProperty.Builder.() -> Unit)

    public fun schedulingPriority(schedulingPriority: Number)

    public fun tags(tags: Any)

    public fun timeout(timeout: IResolvable)

    public fun timeout(timeout: CfnJobDefinition.TimeoutProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41dff2b2074ae01458c7ae2c5c53cbd279dc53338b5bd4c02dc1ec4a8e6416a1")
    public fun timeout(timeout: CfnJobDefinition.TimeoutProperty.Builder.() -> Unit)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.CfnJobDefinitionProps.Builder =
        software.amazon.awscdk.services.batch.CfnJobDefinitionProps.builder()

    override fun containerProperties(containerProperties: IResolvable) {
      cdkBuilder.containerProperties(containerProperties.let(IResolvable::unwrap))
    }

    override
        fun containerProperties(containerProperties: CfnJobDefinition.ContainerPropertiesProperty) {
      cdkBuilder.containerProperties(containerProperties.let(CfnJobDefinition.ContainerPropertiesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("053386f06704f2f46eb669e0aacea0f9c806d04bf5eceb27797cbf2ded5df3fe")
    override
        fun containerProperties(containerProperties: CfnJobDefinition.ContainerPropertiesProperty.Builder.() -> Unit):
        Unit =
        containerProperties(CfnJobDefinition.ContainerPropertiesProperty(containerProperties))

    override fun eksProperties(eksProperties: IResolvable) {
      cdkBuilder.eksProperties(eksProperties.let(IResolvable::unwrap))
    }

    override fun eksProperties(eksProperties: CfnJobDefinition.EksPropertiesProperty) {
      cdkBuilder.eksProperties(eksProperties.let(CfnJobDefinition.EksPropertiesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d5504f1b6c302985814b54fb3bf51be7430fcbcd0c5140672e8f5dfa6c867c0")
    override
        fun eksProperties(eksProperties: CfnJobDefinition.EksPropertiesProperty.Builder.() -> Unit):
        Unit = eksProperties(CfnJobDefinition.EksPropertiesProperty(eksProperties))

    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    override fun nodeProperties(nodeProperties: IResolvable) {
      cdkBuilder.nodeProperties(nodeProperties.let(IResolvable::unwrap))
    }

    override fun nodeProperties(nodeProperties: CfnJobDefinition.NodePropertiesProperty) {
      cdkBuilder.nodeProperties(nodeProperties.let(CfnJobDefinition.NodePropertiesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45483dfc3eb6d7ded183c158eff360fa9a8f583569d9fec74d0c1dffaca06120")
    override
        fun nodeProperties(nodeProperties: CfnJobDefinition.NodePropertiesProperty.Builder.() -> Unit):
        Unit = nodeProperties(CfnJobDefinition.NodePropertiesProperty(nodeProperties))

    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    override fun platformCapabilities(platformCapabilities: List<String>) {
      cdkBuilder.platformCapabilities(platformCapabilities)
    }

    override fun platformCapabilities(vararg platformCapabilities: String): Unit =
        platformCapabilities(platformCapabilities.toList())

    override fun propagateTags(propagateTags: Boolean) {
      cdkBuilder.propagateTags(propagateTags)
    }

    override fun propagateTags(propagateTags: IResolvable) {
      cdkBuilder.propagateTags(propagateTags.let(IResolvable::unwrap))
    }

    override fun retryStrategy(retryStrategy: IResolvable) {
      cdkBuilder.retryStrategy(retryStrategy.let(IResolvable::unwrap))
    }

    override fun retryStrategy(retryStrategy: CfnJobDefinition.RetryStrategyProperty) {
      cdkBuilder.retryStrategy(retryStrategy.let(CfnJobDefinition.RetryStrategyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c959b37bd00124009c37511a4cc3819aa64e818c3d341547f85161f16885fd2")
    override
        fun retryStrategy(retryStrategy: CfnJobDefinition.RetryStrategyProperty.Builder.() -> Unit):
        Unit = retryStrategy(CfnJobDefinition.RetryStrategyProperty(retryStrategy))

    override fun schedulingPriority(schedulingPriority: Number) {
      cdkBuilder.schedulingPriority(schedulingPriority)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun timeout(timeout: IResolvable) {
      cdkBuilder.timeout(timeout.let(IResolvable::unwrap))
    }

    override fun timeout(timeout: CfnJobDefinition.TimeoutProperty) {
      cdkBuilder.timeout(timeout.let(CfnJobDefinition.TimeoutProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41dff2b2074ae01458c7ae2c5c53cbd279dc53338b5bd4c02dc1ec4a8e6416a1")
    override fun timeout(timeout: CfnJobDefinition.TimeoutProperty.Builder.() -> Unit): Unit =
        timeout(CfnJobDefinition.TimeoutProperty(timeout))

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinitionProps,
  ) : CdkObject(cdkObject), CfnJobDefinitionProps {
    override fun containerProperties(): Any? = unwrap(this).getContainerProperties()

    override fun eksProperties(): Any? = unwrap(this).getEksProperties()

    override fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

    override fun nodeProperties(): Any? = unwrap(this).getNodeProperties()

    override fun parameters(): Any? = unwrap(this).getParameters()

    override fun platformCapabilities(): List<String> = unwrap(this).getPlatformCapabilities() ?:
        emptyList()

    override fun propagateTags(): Any? = unwrap(this).getPropagateTags()

    override fun retryStrategy(): Any? = unwrap(this).getRetryStrategy()

    override fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

    override fun tags(): Any? = unwrap(this).getTags()

    override fun timeout(): Any? = unwrap(this).getTimeout()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnJobDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinitionProps):
        CfnJobDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnJobDefinitionProps):
        software.amazon.awscdk.services.batch.CfnJobDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.CfnJobDefinitionProps
  }
}
