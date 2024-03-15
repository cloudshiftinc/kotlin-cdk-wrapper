@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pipes

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPipe internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.pipes.CfnPipe,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrCurrentState(): String = unwrap(this).getAttrCurrentState()

  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  public open fun attrStateReason(): String = unwrap(this).getAttrStateReason()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun desiredState(): String? = unwrap(this).getDesiredState()

  public open fun desiredState(`value`: String) {
    unwrap(this).setDesiredState(`value`)
  }

  public open fun enrichment(): String? = unwrap(this).getEnrichment()

  public open fun enrichment(`value`: String) {
    unwrap(this).setEnrichment(`value`)
  }

  public open fun enrichmentParameters(): Any? = unwrap(this).getEnrichmentParameters()

  public open fun enrichmentParameters(`value`: IResolvable) {
    unwrap(this).setEnrichmentParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun enrichmentParameters(`value`: PipeEnrichmentParametersProperty) {
    unwrap(this).setEnrichmentParameters(`value`.let(PipeEnrichmentParametersProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("734f2d779d00918203f2c55a79edee77318ed044d7396502fe53959af0029d5a")
  public open
      fun enrichmentParameters(`value`: PipeEnrichmentParametersProperty.Builder.() -> Unit): Unit =
      enrichmentParameters(PipeEnrichmentParametersProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

  public open fun logConfiguration(`value`: IResolvable) {
    unwrap(this).setLogConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun logConfiguration(`value`: PipeLogConfigurationProperty) {
    unwrap(this).setLogConfiguration(`value`.let(PipeLogConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1917a1cb44ecb163b5d615a1a88558970ecee80240cfde3ef73fe7582bf07b5f")
  public open fun logConfiguration(`value`: PipeLogConfigurationProperty.Builder.() -> Unit): Unit =
      logConfiguration(PipeLogConfigurationProperty(`value`))

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun source(): String = unwrap(this).getSource()

  public open fun source(`value`: String) {
    unwrap(this).setSource(`value`)
  }

  public open fun sourceParameters(): Any? = unwrap(this).getSourceParameters()

  public open fun sourceParameters(`value`: IResolvable) {
    unwrap(this).setSourceParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun sourceParameters(`value`: PipeSourceParametersProperty) {
    unwrap(this).setSourceParameters(`value`.let(PipeSourceParametersProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4c64beee58f4a4b4598a6e838d69e46a3b019cf579766f5736c8a98ad4a88007")
  public open fun sourceParameters(`value`: PipeSourceParametersProperty.Builder.() -> Unit): Unit =
      sourceParameters(PipeSourceParametersProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun target(): String = unwrap(this).getTarget()

  public open fun target(`value`: String) {
    unwrap(this).setTarget(`value`)
  }

  public open fun targetParameters(): Any? = unwrap(this).getTargetParameters()

  public open fun targetParameters(`value`: IResolvable) {
    unwrap(this).setTargetParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun targetParameters(`value`: PipeTargetParametersProperty) {
    unwrap(this).setTargetParameters(`value`.let(PipeTargetParametersProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bd31aaec916ec2a451df6cf82781920abdbca84fbce71ac90881d8e4f203a070")
  public open fun targetParameters(`value`: PipeTargetParametersProperty.Builder.() -> Unit): Unit =
      targetParameters(PipeTargetParametersProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun desiredState(desiredState: String)

    public fun enrichment(enrichment: String)

    public fun enrichmentParameters(enrichmentParameters: IResolvable)

    public fun enrichmentParameters(enrichmentParameters: PipeEnrichmentParametersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("546dbe1fb8a400361d0f6133bfb986f88c805c8430e31adaea92a36edaf521b5")
    public
        fun enrichmentParameters(enrichmentParameters: PipeEnrichmentParametersProperty.Builder.() -> Unit)

    public fun logConfiguration(logConfiguration: IResolvable)

    public fun logConfiguration(logConfiguration: PipeLogConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("590ad1af47372201c74eb48366b821269e5557cfc4568fc97080194ec64a18b1")
    public fun logConfiguration(logConfiguration: PipeLogConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun source(source: String)

    public fun sourceParameters(sourceParameters: IResolvable)

    public fun sourceParameters(sourceParameters: PipeSourceParametersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a633e6cccf93692744ba1c51540c9986d1b346863598da59ac6c6466aab48e67")
    public fun sourceParameters(sourceParameters: PipeSourceParametersProperty.Builder.() -> Unit)

    public fun tags(tags: Map<String, String>)

    public fun target(target: String)

    public fun targetParameters(targetParameters: IResolvable)

    public fun targetParameters(targetParameters: PipeTargetParametersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("253a95462466d0fa986923ebda44eb7148c210e5f2c08fa64fb41c53501e0f5b")
    public fun targetParameters(targetParameters: PipeTargetParametersProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pipes.CfnPipe.Builder =
        software.amazon.awscdk.services.pipes.CfnPipe.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun desiredState(desiredState: String) {
      cdkBuilder.desiredState(desiredState)
    }

    override fun enrichment(enrichment: String) {
      cdkBuilder.enrichment(enrichment)
    }

    override fun enrichmentParameters(enrichmentParameters: IResolvable) {
      cdkBuilder.enrichmentParameters(enrichmentParameters.let(IResolvable::unwrap))
    }

    override fun enrichmentParameters(enrichmentParameters: PipeEnrichmentParametersProperty) {
      cdkBuilder.enrichmentParameters(enrichmentParameters.let(PipeEnrichmentParametersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("546dbe1fb8a400361d0f6133bfb986f88c805c8430e31adaea92a36edaf521b5")
    override
        fun enrichmentParameters(enrichmentParameters: PipeEnrichmentParametersProperty.Builder.() -> Unit):
        Unit = enrichmentParameters(PipeEnrichmentParametersProperty(enrichmentParameters))

    override fun logConfiguration(logConfiguration: IResolvable) {
      cdkBuilder.logConfiguration(logConfiguration.let(IResolvable::unwrap))
    }

    override fun logConfiguration(logConfiguration: PipeLogConfigurationProperty) {
      cdkBuilder.logConfiguration(logConfiguration.let(PipeLogConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("590ad1af47372201c74eb48366b821269e5557cfc4568fc97080194ec64a18b1")
    override
        fun logConfiguration(logConfiguration: PipeLogConfigurationProperty.Builder.() -> Unit):
        Unit = logConfiguration(PipeLogConfigurationProperty(logConfiguration))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    override fun sourceParameters(sourceParameters: IResolvable) {
      cdkBuilder.sourceParameters(sourceParameters.let(IResolvable::unwrap))
    }

    override fun sourceParameters(sourceParameters: PipeSourceParametersProperty) {
      cdkBuilder.sourceParameters(sourceParameters.let(PipeSourceParametersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a633e6cccf93692744ba1c51540c9986d1b346863598da59ac6c6466aab48e67")
    override
        fun sourceParameters(sourceParameters: PipeSourceParametersProperty.Builder.() -> Unit):
        Unit = sourceParameters(PipeSourceParametersProperty(sourceParameters))

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    override fun targetParameters(targetParameters: IResolvable) {
      cdkBuilder.targetParameters(targetParameters.let(IResolvable::unwrap))
    }

    override fun targetParameters(targetParameters: PipeTargetParametersProperty) {
      cdkBuilder.targetParameters(targetParameters.let(PipeTargetParametersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("253a95462466d0fa986923ebda44eb7148c210e5f2c08fa64fb41c53501e0f5b")
    override
        fun targetParameters(targetParameters: PipeTargetParametersProperty.Builder.() -> Unit):
        Unit = targetParameters(PipeTargetParametersProperty(targetParameters))

    public fun build(): software.amazon.awscdk.services.pipes.CfnPipe = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pipes.CfnPipe.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPipe {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPipe(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe): CfnPipe =
        CfnPipe(cdkObject)

    internal fun unwrap(wrapped: CfnPipe): software.amazon.awscdk.services.pipes.CfnPipe =
        wrapped.cdkObject
  }

  public interface PipeSourceRabbitMQBrokerParametersProperty {
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    public fun credentials(): Any

    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    public fun queueName(): String

    public fun virtualHost(): String? = unwrap(this).getVirtualHost()

    @CdkDslMarker
    public interface Builder {
      public fun batchSize(batchSize: Number)

      public fun credentials(credentials: IResolvable)

      public fun credentials(credentials: MQBrokerAccessCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb5e829a47a553ec3c8f5dd7a09804d3df855ba545cf7cf8720327f22314cea4")
      public fun credentials(credentials: MQBrokerAccessCredentialsProperty.Builder.() -> Unit)

      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number)

      public fun queueName(queueName: String)

      public fun virtualHost(virtualHost: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceRabbitMQBrokerParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceRabbitMQBrokerParametersProperty.builder()

      override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      override fun credentials(credentials: IResolvable) {
        cdkBuilder.credentials(credentials.let(IResolvable::unwrap))
      }

      override fun credentials(credentials: MQBrokerAccessCredentialsProperty) {
        cdkBuilder.credentials(credentials.let(MQBrokerAccessCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb5e829a47a553ec3c8f5dd7a09804d3df855ba545cf7cf8720327f22314cea4")
      override fun credentials(credentials: MQBrokerAccessCredentialsProperty.Builder.() -> Unit):
          Unit = credentials(MQBrokerAccessCredentialsProperty(credentials))

      override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      override fun queueName(queueName: String) {
        cdkBuilder.queueName(queueName)
      }

      override fun virtualHost(virtualHost: String) {
        cdkBuilder.virtualHost(virtualHost)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceRabbitMQBrokerParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceRabbitMQBrokerParametersProperty,
    ) : CdkObject(cdkObject), PipeSourceRabbitMQBrokerParametersProperty {
      override fun batchSize(): Number? = unwrap(this).getBatchSize()

      override fun credentials(): Any = unwrap(this).getCredentials()

      override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()

      override fun queueName(): String = unwrap(this).getQueueName()

      override fun virtualHost(): String? = unwrap(this).getVirtualHost()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeSourceRabbitMQBrokerParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceRabbitMQBrokerParametersProperty):
          PipeSourceRabbitMQBrokerParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceRabbitMQBrokerParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceRabbitMQBrokerParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceRabbitMQBrokerParametersProperty
    }
  }

  public interface PipeTargetSageMakerPipelineParametersProperty {
    public fun pipelineParameterList(): Any? = unwrap(this).getPipelineParameterList()

    @CdkDslMarker
    public interface Builder {
      public fun pipelineParameterList(pipelineParameterList: IResolvable)

      public fun pipelineParameterList(pipelineParameterList: List<Any>)

      public fun pipelineParameterList(vararg pipelineParameterList: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSageMakerPipelineParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSageMakerPipelineParametersProperty.builder()

      override fun pipelineParameterList(pipelineParameterList: IResolvable) {
        cdkBuilder.pipelineParameterList(pipelineParameterList.let(IResolvable::unwrap))
      }

      override fun pipelineParameterList(pipelineParameterList: List<Any>) {
        cdkBuilder.pipelineParameterList(pipelineParameterList)
      }

      override fun pipelineParameterList(vararg pipelineParameterList: Any): Unit =
          pipelineParameterList(pipelineParameterList.toList())

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSageMakerPipelineParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSageMakerPipelineParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetSageMakerPipelineParametersProperty {
      override fun pipelineParameterList(): Any? = unwrap(this).getPipelineParameterList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetSageMakerPipelineParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSageMakerPipelineParametersProperty):
          PipeTargetSageMakerPipelineParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetSageMakerPipelineParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSageMakerPipelineParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSageMakerPipelineParametersProperty
    }
  }

  public interface AwsVpcConfigurationProperty {
    public fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    public fun subnets(): List<String>

    @CdkDslMarker
    public interface Builder {
      public fun assignPublicIp(assignPublicIp: String)

      public fun securityGroups(securityGroups: List<String>)

      public fun securityGroups(vararg securityGroups: String)

      public fun subnets(subnets: List<String>)

      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.AwsVpcConfigurationProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.AwsVpcConfigurationProperty.builder()

      override fun assignPublicIp(assignPublicIp: String) {
        cdkBuilder.assignPublicIp(assignPublicIp)
      }

      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      override fun securityGroups(vararg securityGroups: String): Unit =
          securityGroups(securityGroups.toList())

      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.AwsVpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.AwsVpcConfigurationProperty,
    ) : CdkObject(cdkObject), AwsVpcConfigurationProperty {
      override fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

      override fun subnets(): List<String> = unwrap(this).getSubnets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AwsVpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.AwsVpcConfigurationProperty):
          AwsVpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsVpcConfigurationProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.AwsVpcConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.AwsVpcConfigurationProperty
    }
  }

  public interface PipeSourceSqsQueueParametersProperty {
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    @CdkDslMarker
    public interface Builder {
      public fun batchSize(batchSize: Number)

      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSqsQueueParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSqsQueueParametersProperty.builder()

      override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSqsQueueParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSqsQueueParametersProperty,
    ) : CdkObject(cdkObject), PipeSourceSqsQueueParametersProperty {
      override fun batchSize(): Number? = unwrap(this).getBatchSize()

      override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeSourceSqsQueueParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSqsQueueParametersProperty):
          PipeSourceSqsQueueParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceSqsQueueParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSqsQueueParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSqsQueueParametersProperty
    }
  }

  public interface PipeTargetSqsQueueParametersProperty {
    public fun messageDeduplicationId(): String? = unwrap(this).getMessageDeduplicationId()

    public fun messageGroupId(): String? = unwrap(this).getMessageGroupId()

    @CdkDslMarker
    public interface Builder {
      public fun messageDeduplicationId(messageDeduplicationId: String)

      public fun messageGroupId(messageGroupId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSqsQueueParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSqsQueueParametersProperty.builder()

      override fun messageDeduplicationId(messageDeduplicationId: String) {
        cdkBuilder.messageDeduplicationId(messageDeduplicationId)
      }

      override fun messageGroupId(messageGroupId: String) {
        cdkBuilder.messageGroupId(messageGroupId)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSqsQueueParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSqsQueueParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetSqsQueueParametersProperty {
      override fun messageDeduplicationId(): String? = unwrap(this).getMessageDeduplicationId()

      override fun messageGroupId(): String? = unwrap(this).getMessageGroupId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetSqsQueueParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSqsQueueParametersProperty):
          PipeTargetSqsQueueParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetSqsQueueParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSqsQueueParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSqsQueueParametersProperty
    }
  }

  public interface EcsEnvironmentFileProperty {
    public fun type(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun type(type: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentFileProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentFileProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentFileProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentFileProperty,
    ) : CdkObject(cdkObject), EcsEnvironmentFileProperty {
      override fun type(): String = unwrap(this).getType()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EcsEnvironmentFileProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentFileProperty):
          EcsEnvironmentFileProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsEnvironmentFileProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentFileProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentFileProperty
    }
  }

  public interface SelfManagedKafkaAccessConfigurationCredentialsProperty {
    public fun basicAuth(): String? = unwrap(this).getBasicAuth()

    public fun clientCertificateTlsAuth(): String? = unwrap(this).getClientCertificateTlsAuth()

    public fun saslScram256Auth(): String? = unwrap(this).getSaslScram256Auth()

    public fun saslScram512Auth(): String? = unwrap(this).getSaslScram512Auth()

    @CdkDslMarker
    public interface Builder {
      public fun basicAuth(basicAuth: String)

      public fun clientCertificateTlsAuth(clientCertificateTlsAuth: String)

      public fun saslScram256Auth(saslScram256Auth: String)

      public fun saslScram512Auth(saslScram512Auth: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty.builder()

      override fun basicAuth(basicAuth: String) {
        cdkBuilder.basicAuth(basicAuth)
      }

      override fun clientCertificateTlsAuth(clientCertificateTlsAuth: String) {
        cdkBuilder.clientCertificateTlsAuth(clientCertificateTlsAuth)
      }

      override fun saslScram256Auth(saslScram256Auth: String) {
        cdkBuilder.saslScram256Auth(saslScram256Auth)
      }

      override fun saslScram512Auth(saslScram512Auth: String) {
        cdkBuilder.saslScram512Auth(saslScram512Auth)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty,
    ) : CdkObject(cdkObject), SelfManagedKafkaAccessConfigurationCredentialsProperty {
      override fun basicAuth(): String? = unwrap(this).getBasicAuth()

      override fun clientCertificateTlsAuth(): String? = unwrap(this).getClientCertificateTlsAuth()

      override fun saslScram256Auth(): String? = unwrap(this).getSaslScram256Auth()

      override fun saslScram512Auth(): String? = unwrap(this).getSaslScram512Auth()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SelfManagedKafkaAccessConfigurationCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty):
          SelfManagedKafkaAccessConfigurationCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SelfManagedKafkaAccessConfigurationCredentialsProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty
    }
  }

  public interface S3LogDestinationProperty {
    public fun bucketName(): String? = unwrap(this).getBucketName()

    public fun bucketOwner(): String? = unwrap(this).getBucketOwner()

    public fun outputFormat(): String? = unwrap(this).getOutputFormat()

    public fun prefix(): String? = unwrap(this).getPrefix()

    @CdkDslMarker
    public interface Builder {
      public fun bucketName(bucketName: String)

      public fun bucketOwner(bucketOwner: String)

      public fun outputFormat(outputFormat: String)

      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.S3LogDestinationProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.S3LogDestinationProperty.builder()

      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      override fun bucketOwner(bucketOwner: String) {
        cdkBuilder.bucketOwner(bucketOwner)
      }

      override fun outputFormat(outputFormat: String) {
        cdkBuilder.outputFormat(outputFormat)
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.S3LogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.S3LogDestinationProperty,
    ) : CdkObject(cdkObject), S3LogDestinationProperty {
      override fun bucketName(): String? = unwrap(this).getBucketName()

      override fun bucketOwner(): String? = unwrap(this).getBucketOwner()

      override fun outputFormat(): String? = unwrap(this).getOutputFormat()

      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.S3LogDestinationProperty):
          S3LogDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LogDestinationProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.S3LogDestinationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.S3LogDestinationProperty
    }
  }

  public interface EcsInferenceAcceleratorOverrideProperty {
    public fun deviceName(): String? = unwrap(this).getDeviceName()

    public fun deviceType(): String? = unwrap(this).getDeviceType()

    @CdkDslMarker
    public interface Builder {
      public fun deviceName(deviceName: String)

      public fun deviceType(deviceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsInferenceAcceleratorOverrideProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.EcsInferenceAcceleratorOverrideProperty.builder()

      override fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
      }

      override fun deviceType(deviceType: String) {
        cdkBuilder.deviceType(deviceType)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.EcsInferenceAcceleratorOverrideProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsInferenceAcceleratorOverrideProperty,
    ) : CdkObject(cdkObject), EcsInferenceAcceleratorOverrideProperty {
      override fun deviceName(): String? = unwrap(this).getDeviceName()

      override fun deviceType(): String? = unwrap(this).getDeviceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EcsInferenceAcceleratorOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsInferenceAcceleratorOverrideProperty):
          EcsInferenceAcceleratorOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsInferenceAcceleratorOverrideProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.EcsInferenceAcceleratorOverrideProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.EcsInferenceAcceleratorOverrideProperty
    }
  }

  public interface BatchEnvironmentVariableProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun `value`(): String? = unwrap(this).getValue()

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchEnvironmentVariableProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.BatchEnvironmentVariableProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.BatchEnvironmentVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchEnvironmentVariableProperty,
    ) : CdkObject(cdkObject), BatchEnvironmentVariableProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchEnvironmentVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.BatchEnvironmentVariableProperty):
          BatchEnvironmentVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchEnvironmentVariableProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.BatchEnvironmentVariableProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.BatchEnvironmentVariableProperty
    }
  }

  public interface FilterCriteriaProperty {
    public fun filters(): Any? = unwrap(this).getFilters()

    @CdkDslMarker
    public interface Builder {
      public fun filters(filters: IResolvable)

      public fun filters(filters: List<Any>)

      public fun filters(vararg filters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.FilterCriteriaProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.FilterCriteriaProperty.builder()

      override fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters.let(IResolvable::unwrap))
      }

      override fun filters(filters: List<Any>) {
        cdkBuilder.filters(filters)
      }

      override fun filters(vararg filters: Any): Unit = filters(filters.toList())

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.FilterCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.FilterCriteriaProperty,
    ) : CdkObject(cdkObject), FilterCriteriaProperty {
      override fun filters(): Any? = unwrap(this).getFilters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.FilterCriteriaProperty):
          FilterCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterCriteriaProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.FilterCriteriaProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.FilterCriteriaProperty
    }
  }

  public interface PlacementConstraintProperty {
    public fun expression(): String? = unwrap(this).getExpression()

    public fun type(): String? = unwrap(this).getType()

    @CdkDslMarker
    public interface Builder {
      public fun expression(expression: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementConstraintProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementConstraintProperty.builder()

      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.PlacementConstraintProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementConstraintProperty,
    ) : CdkObject(cdkObject), PlacementConstraintProperty {
      override fun expression(): String? = unwrap(this).getExpression()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementConstraintProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PlacementConstraintProperty):
          PlacementConstraintProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementConstraintProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementConstraintProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementConstraintProperty
    }
  }

  public interface CapacityProviderStrategyItemProperty {
    public fun base(): Number? = unwrap(this).getBase()

    public fun capacityProvider(): String

    public fun weight(): Number? = unwrap(this).getWeight()

    @CdkDslMarker
    public interface Builder {
      public fun base(base: Number)

      public fun capacityProvider(capacityProvider: String)

      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.CapacityProviderStrategyItemProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.CapacityProviderStrategyItemProperty.builder()

      override fun base(base: Number) {
        cdkBuilder.base(base)
      }

      override fun capacityProvider(capacityProvider: String) {
        cdkBuilder.capacityProvider(capacityProvider)
      }

      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.CapacityProviderStrategyItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.CapacityProviderStrategyItemProperty,
    ) : CdkObject(cdkObject), CapacityProviderStrategyItemProperty {
      override fun base(): Number? = unwrap(this).getBase()

      override fun capacityProvider(): String = unwrap(this).getCapacityProvider()

      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityProviderStrategyItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.CapacityProviderStrategyItemProperty):
          CapacityProviderStrategyItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityProviderStrategyItemProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.CapacityProviderStrategyItemProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.CapacityProviderStrategyItemProperty
    }
  }

  public interface PipeSourceManagedStreamingKafkaParametersProperty {
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    public fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

    public fun credentials(): Any? = unwrap(this).getCredentials()

    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    public fun startingPosition(): String? = unwrap(this).getStartingPosition()

    public fun topicName(): String

    @CdkDslMarker
    public interface Builder {
      public fun batchSize(batchSize: Number)

      public fun consumerGroupId(consumerGroupId: String)

      public fun credentials(credentials: IResolvable)

      public fun credentials(credentials: MSKAccessCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9869d90c906b4a00a9be57c1d1dba3bdfa996a43c7c7bfcae332cf976b6543ce")
      public fun credentials(credentials: MSKAccessCredentialsProperty.Builder.() -> Unit)

      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number)

      public fun startingPosition(startingPosition: String)

      public fun topicName(topicName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty.builder()

      override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      override fun consumerGroupId(consumerGroupId: String) {
        cdkBuilder.consumerGroupId(consumerGroupId)
      }

      override fun credentials(credentials: IResolvable) {
        cdkBuilder.credentials(credentials.let(IResolvable::unwrap))
      }

      override fun credentials(credentials: MSKAccessCredentialsProperty) {
        cdkBuilder.credentials(credentials.let(MSKAccessCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9869d90c906b4a00a9be57c1d1dba3bdfa996a43c7c7bfcae332cf976b6543ce")
      override fun credentials(credentials: MSKAccessCredentialsProperty.Builder.() -> Unit): Unit =
          credentials(MSKAccessCredentialsProperty(credentials))

      override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      override fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
      }

      override fun topicName(topicName: String) {
        cdkBuilder.topicName(topicName)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty,
    ) : CdkObject(cdkObject), PipeSourceManagedStreamingKafkaParametersProperty {
      override fun batchSize(): Number? = unwrap(this).getBatchSize()

      override fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

      override fun credentials(): Any? = unwrap(this).getCredentials()

      override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()

      override fun startingPosition(): String? = unwrap(this).getStartingPosition()

      override fun topicName(): String = unwrap(this).getTopicName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeSourceManagedStreamingKafkaParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty):
          PipeSourceManagedStreamingKafkaParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceManagedStreamingKafkaParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty
    }
  }

  public interface PipeSourceActiveMQBrokerParametersProperty {
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    public fun credentials(): Any

    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    public fun queueName(): String

    @CdkDslMarker
    public interface Builder {
      public fun batchSize(batchSize: Number)

      public fun credentials(credentials: IResolvable)

      public fun credentials(credentials: MQBrokerAccessCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ed7192250dd5f48c54611a1f27265b98db44c6219ef349b3c746e7f64c51307")
      public fun credentials(credentials: MQBrokerAccessCredentialsProperty.Builder.() -> Unit)

      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number)

      public fun queueName(queueName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceActiveMQBrokerParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceActiveMQBrokerParametersProperty.builder()

      override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      override fun credentials(credentials: IResolvable) {
        cdkBuilder.credentials(credentials.let(IResolvable::unwrap))
      }

      override fun credentials(credentials: MQBrokerAccessCredentialsProperty) {
        cdkBuilder.credentials(credentials.let(MQBrokerAccessCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ed7192250dd5f48c54611a1f27265b98db44c6219ef349b3c746e7f64c51307")
      override fun credentials(credentials: MQBrokerAccessCredentialsProperty.Builder.() -> Unit):
          Unit = credentials(MQBrokerAccessCredentialsProperty(credentials))

      override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      override fun queueName(queueName: String) {
        cdkBuilder.queueName(queueName)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceActiveMQBrokerParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceActiveMQBrokerParametersProperty,
    ) : CdkObject(cdkObject), PipeSourceActiveMQBrokerParametersProperty {
      override fun batchSize(): Number? = unwrap(this).getBatchSize()

      override fun credentials(): Any = unwrap(this).getCredentials()

      override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()

      override fun queueName(): String = unwrap(this).getQueueName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeSourceActiveMQBrokerParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceActiveMQBrokerParametersProperty):
          PipeSourceActiveMQBrokerParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceActiveMQBrokerParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceActiveMQBrokerParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceActiveMQBrokerParametersProperty
    }
  }

  public interface PipeEnrichmentParametersProperty {
    public fun httpParameters(): Any? = unwrap(this).getHttpParameters()

    public fun inputTemplate(): String? = unwrap(this).getInputTemplate()

    @CdkDslMarker
    public interface Builder {
      public fun httpParameters(httpParameters: IResolvable)

      public fun httpParameters(httpParameters: PipeEnrichmentHttpParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3858678e5145b0aae91d534a55e459c2de77b8b2b05104433d661e992776db25")
      public
          fun httpParameters(httpParameters: PipeEnrichmentHttpParametersProperty.Builder.() -> Unit)

      public fun inputTemplate(inputTemplate: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentParametersProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentParametersProperty.builder()

      override fun httpParameters(httpParameters: IResolvable) {
        cdkBuilder.httpParameters(httpParameters.let(IResolvable::unwrap))
      }

      override fun httpParameters(httpParameters: PipeEnrichmentHttpParametersProperty) {
        cdkBuilder.httpParameters(httpParameters.let(PipeEnrichmentHttpParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3858678e5145b0aae91d534a55e459c2de77b8b2b05104433d661e992776db25")
      override
          fun httpParameters(httpParameters: PipeEnrichmentHttpParametersProperty.Builder.() -> Unit):
          Unit = httpParameters(PipeEnrichmentHttpParametersProperty(httpParameters))

      override fun inputTemplate(inputTemplate: String) {
        cdkBuilder.inputTemplate(inputTemplate)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentParametersProperty,
    ) : CdkObject(cdkObject), PipeEnrichmentParametersProperty {
      override fun httpParameters(): Any? = unwrap(this).getHttpParameters()

      override fun inputTemplate(): String? = unwrap(this).getInputTemplate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PipeEnrichmentParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentParametersProperty):
          PipeEnrichmentParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeEnrichmentParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentParametersProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentParametersProperty
    }
  }

  public interface EcsContainerOverrideProperty {
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    public fun cpu(): Number? = unwrap(this).getCpu()

    public fun environment(): Any? = unwrap(this).getEnvironment()

    public fun environmentFiles(): Any? = unwrap(this).getEnvironmentFiles()

    public fun memory(): Number? = unwrap(this).getMemory()

    public fun memoryReservation(): Number? = unwrap(this).getMemoryReservation()

    public fun name(): String? = unwrap(this).getName()

    public fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()

    @CdkDslMarker
    public interface Builder {
      public fun command(command: List<String>)

      public fun command(vararg command: String)

      public fun cpu(cpu: Number)

      public fun environment(environment: IResolvable)

      public fun environment(environment: List<Any>)

      public fun environment(vararg environment: Any)

      public fun environmentFiles(environmentFiles: IResolvable)

      public fun environmentFiles(environmentFiles: List<Any>)

      public fun environmentFiles(vararg environmentFiles: Any)

      public fun memory(memory: Number)

      public fun memoryReservation(memoryReservation: Number)

      public fun name(name: String)

      public fun resourceRequirements(resourceRequirements: IResolvable)

      public fun resourceRequirements(resourceRequirements: List<Any>)

      public fun resourceRequirements(vararg resourceRequirements: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsContainerOverrideProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.EcsContainerOverrideProperty.builder()

      override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      override fun command(vararg command: String): Unit = command(command.toList())

      override fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
      }

      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      override fun environment(environment: List<Any>) {
        cdkBuilder.environment(environment)
      }

      override fun environment(vararg environment: Any): Unit = environment(environment.toList())

      override fun environmentFiles(environmentFiles: IResolvable) {
        cdkBuilder.environmentFiles(environmentFiles.let(IResolvable::unwrap))
      }

      override fun environmentFiles(environmentFiles: List<Any>) {
        cdkBuilder.environmentFiles(environmentFiles)
      }

      override fun environmentFiles(vararg environmentFiles: Any): Unit =
          environmentFiles(environmentFiles.toList())

      override fun memory(memory: Number) {
        cdkBuilder.memory(memory)
      }

      override fun memoryReservation(memoryReservation: Number) {
        cdkBuilder.memoryReservation(memoryReservation)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun resourceRequirements(resourceRequirements: IResolvable) {
        cdkBuilder.resourceRequirements(resourceRequirements.let(IResolvable::unwrap))
      }

      override fun resourceRequirements(resourceRequirements: List<Any>) {
        cdkBuilder.resourceRequirements(resourceRequirements)
      }

      override fun resourceRequirements(vararg resourceRequirements: Any): Unit =
          resourceRequirements(resourceRequirements.toList())

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.EcsContainerOverrideProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsContainerOverrideProperty,
    ) : CdkObject(cdkObject), EcsContainerOverrideProperty {
      override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      override fun cpu(): Number? = unwrap(this).getCpu()

      override fun environment(): Any? = unwrap(this).getEnvironment()

      override fun environmentFiles(): Any? = unwrap(this).getEnvironmentFiles()

      override fun memory(): Number? = unwrap(this).getMemory()

      override fun memoryReservation(): Number? = unwrap(this).getMemoryReservation()

      override fun name(): String? = unwrap(this).getName()

      override fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EcsContainerOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsContainerOverrideProperty):
          EcsContainerOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsContainerOverrideProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.EcsContainerOverrideProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.EcsContainerOverrideProperty
    }
  }

  public interface BatchRetryStrategyProperty {
    public fun attempts(): Number? = unwrap(this).getAttempts()

    @CdkDslMarker
    public interface Builder {
      public fun attempts(attempts: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchRetryStrategyProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.BatchRetryStrategyProperty.builder()

      override fun attempts(attempts: Number) {
        cdkBuilder.attempts(attempts)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.BatchRetryStrategyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchRetryStrategyProperty,
    ) : CdkObject(cdkObject), BatchRetryStrategyProperty {
      override fun attempts(): Number? = unwrap(this).getAttempts()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchRetryStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.BatchRetryStrategyProperty):
          BatchRetryStrategyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchRetryStrategyProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.BatchRetryStrategyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.BatchRetryStrategyProperty
    }
  }

  public interface PipeTargetKinesisStreamParametersProperty {
    public fun partitionKey(): String

    @CdkDslMarker
    public interface Builder {
      public fun partitionKey(partitionKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetKinesisStreamParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetKinesisStreamParametersProperty.builder()

      override fun partitionKey(partitionKey: String) {
        cdkBuilder.partitionKey(partitionKey)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetKinesisStreamParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetKinesisStreamParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetKinesisStreamParametersProperty {
      override fun partitionKey(): String = unwrap(this).getPartitionKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetKinesisStreamParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetKinesisStreamParametersProperty):
          PipeTargetKinesisStreamParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetKinesisStreamParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetKinesisStreamParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetKinesisStreamParametersProperty
    }
  }

  public interface EcsEphemeralStorageProperty {
    public fun sizeInGiB(): Number

    @CdkDslMarker
    public interface Builder {
      public fun sizeInGiB(sizeInGiB: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEphemeralStorageProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEphemeralStorageProperty.builder()

      override fun sizeInGiB(sizeInGiB: Number) {
        cdkBuilder.sizeInGiB(sizeInGiB)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.EcsEphemeralStorageProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEphemeralStorageProperty,
    ) : CdkObject(cdkObject), EcsEphemeralStorageProperty {
      override fun sizeInGiB(): Number = unwrap(this).getSizeInGiB()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EcsEphemeralStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsEphemeralStorageProperty):
          EcsEphemeralStorageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsEphemeralStorageProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEphemeralStorageProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEphemeralStorageProperty
    }
  }

  public interface PipeTargetEventBridgeEventBusParametersProperty {
    public fun detailType(): String? = unwrap(this).getDetailType()

    public fun endpointId(): String? = unwrap(this).getEndpointId()

    public fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

    public fun source(): String? = unwrap(this).getSource()

    public fun time(): String? = unwrap(this).getTime()

    @CdkDslMarker
    public interface Builder {
      public fun detailType(detailType: String)

      public fun endpointId(endpointId: String)

      public fun resources(resources: List<String>)

      public fun resources(vararg resources: String)

      public fun source(source: String)

      public fun time(time: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEventBridgeEventBusParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEventBridgeEventBusParametersProperty.builder()

      override fun detailType(detailType: String) {
        cdkBuilder.detailType(detailType)
      }

      override fun endpointId(endpointId: String) {
        cdkBuilder.endpointId(endpointId)
      }

      override fun resources(resources: List<String>) {
        cdkBuilder.resources(resources)
      }

      override fun resources(vararg resources: String): Unit = resources(resources.toList())

      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      override fun time(time: String) {
        cdkBuilder.time(time)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEventBridgeEventBusParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEventBridgeEventBusParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetEventBridgeEventBusParametersProperty {
      override fun detailType(): String? = unwrap(this).getDetailType()

      override fun endpointId(): String? = unwrap(this).getEndpointId()

      override fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

      override fun source(): String? = unwrap(this).getSource()

      override fun time(): String? = unwrap(this).getTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetEventBridgeEventBusParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEventBridgeEventBusParametersProperty):
          PipeTargetEventBridgeEventBusParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetEventBridgeEventBusParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEventBridgeEventBusParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEventBridgeEventBusParametersProperty
    }
  }

  public interface PipeTargetLambdaFunctionParametersProperty {
    public fun invocationType(): String? = unwrap(this).getInvocationType()

    @CdkDslMarker
    public interface Builder {
      public fun invocationType(invocationType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetLambdaFunctionParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetLambdaFunctionParametersProperty.builder()

      override fun invocationType(invocationType: String) {
        cdkBuilder.invocationType(invocationType)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetLambdaFunctionParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetLambdaFunctionParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetLambdaFunctionParametersProperty {
      override fun invocationType(): String? = unwrap(this).getInvocationType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetLambdaFunctionParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetLambdaFunctionParametersProperty):
          PipeTargetLambdaFunctionParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetLambdaFunctionParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetLambdaFunctionParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetLambdaFunctionParametersProperty
    }
  }

  public interface BatchContainerOverridesProperty {
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    public fun environment(): Any? = unwrap(this).getEnvironment()

    public fun instanceType(): String? = unwrap(this).getInstanceType()

    public fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()

    @CdkDslMarker
    public interface Builder {
      public fun command(command: List<String>)

      public fun command(vararg command: String)

      public fun environment(environment: IResolvable)

      public fun environment(environment: List<Any>)

      public fun environment(vararg environment: Any)

      public fun instanceType(instanceType: String)

      public fun resourceRequirements(resourceRequirements: IResolvable)

      public fun resourceRequirements(resourceRequirements: List<Any>)

      public fun resourceRequirements(vararg resourceRequirements: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchContainerOverridesProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.BatchContainerOverridesProperty.builder()

      override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      override fun command(vararg command: String): Unit = command(command.toList())

      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      override fun environment(environment: List<Any>) {
        cdkBuilder.environment(environment)
      }

      override fun environment(vararg environment: Any): Unit = environment(environment.toList())

      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      override fun resourceRequirements(resourceRequirements: IResolvable) {
        cdkBuilder.resourceRequirements(resourceRequirements.let(IResolvable::unwrap))
      }

      override fun resourceRequirements(resourceRequirements: List<Any>) {
        cdkBuilder.resourceRequirements(resourceRequirements)
      }

      override fun resourceRequirements(vararg resourceRequirements: Any): Unit =
          resourceRequirements(resourceRequirements.toList())

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.BatchContainerOverridesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchContainerOverridesProperty,
    ) : CdkObject(cdkObject), BatchContainerOverridesProperty {
      override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      override fun environment(): Any? = unwrap(this).getEnvironment()

      override fun instanceType(): String? = unwrap(this).getInstanceType()

      override fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchContainerOverridesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.BatchContainerOverridesProperty):
          BatchContainerOverridesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchContainerOverridesProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.BatchContainerOverridesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.BatchContainerOverridesProperty
    }
  }

  public interface MQBrokerAccessCredentialsProperty {
    public fun basicAuth(): String

    @CdkDslMarker
    public interface Builder {
      public fun basicAuth(basicAuth: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.MQBrokerAccessCredentialsProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.MQBrokerAccessCredentialsProperty.builder()

      override fun basicAuth(basicAuth: String) {
        cdkBuilder.basicAuth(basicAuth)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.MQBrokerAccessCredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.MQBrokerAccessCredentialsProperty,
    ) : CdkObject(cdkObject), MQBrokerAccessCredentialsProperty {
      override fun basicAuth(): String = unwrap(this).getBasicAuth()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MQBrokerAccessCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.MQBrokerAccessCredentialsProperty):
          MQBrokerAccessCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MQBrokerAccessCredentialsProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.MQBrokerAccessCredentialsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.MQBrokerAccessCredentialsProperty
    }
  }

  public interface EcsEnvironmentVariableProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun `value`(): String? = unwrap(this).getValue()

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentVariableProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentVariableProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentVariableProperty,
    ) : CdkObject(cdkObject), EcsEnvironmentVariableProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EcsEnvironmentVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentVariableProperty):
          EcsEnvironmentVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsEnvironmentVariableProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentVariableProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentVariableProperty
    }
  }

  public interface DeadLetterConfigProperty {
    public fun arn(): String? = unwrap(this).getArn()

    @CdkDslMarker
    public interface Builder {
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.DeadLetterConfigProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.DeadLetterConfigProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.DeadLetterConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.DeadLetterConfigProperty,
    ) : CdkObject(cdkObject), DeadLetterConfigProperty {
      override fun arn(): String? = unwrap(this).getArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeadLetterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.DeadLetterConfigProperty):
          DeadLetterConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeadLetterConfigProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.DeadLetterConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.DeadLetterConfigProperty
    }
  }

  public interface BatchResourceRequirementProperty {
    public fun type(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun type(type: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchResourceRequirementProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.BatchResourceRequirementProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.BatchResourceRequirementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchResourceRequirementProperty,
    ) : CdkObject(cdkObject), BatchResourceRequirementProperty {
      override fun type(): String = unwrap(this).getType()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchResourceRequirementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.BatchResourceRequirementProperty):
          BatchResourceRequirementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchResourceRequirementProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.BatchResourceRequirementProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.BatchResourceRequirementProperty
    }
  }

  public interface PipeSourceParametersProperty {
    public fun activeMqBrokerParameters(): Any? = unwrap(this).getActiveMqBrokerParameters()

    public fun dynamoDbStreamParameters(): Any? = unwrap(this).getDynamoDbStreamParameters()

    public fun filterCriteria(): Any? = unwrap(this).getFilterCriteria()

    public fun kinesisStreamParameters(): Any? = unwrap(this).getKinesisStreamParameters()

    public fun managedStreamingKafkaParameters(): Any? =
        unwrap(this).getManagedStreamingKafkaParameters()

    public fun rabbitMqBrokerParameters(): Any? = unwrap(this).getRabbitMqBrokerParameters()

    public fun selfManagedKafkaParameters(): Any? = unwrap(this).getSelfManagedKafkaParameters()

    public fun sqsQueueParameters(): Any? = unwrap(this).getSqsQueueParameters()

    @CdkDslMarker
    public interface Builder {
      public fun activeMqBrokerParameters(activeMqBrokerParameters: IResolvable)

      public
          fun activeMqBrokerParameters(activeMqBrokerParameters: PipeSourceActiveMQBrokerParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8287546ecb6620e76ceb93abb8a4ea23122e522c333d115ea3bbffc26c64d85")
      public
          fun activeMqBrokerParameters(activeMqBrokerParameters: PipeSourceActiveMQBrokerParametersProperty.Builder.() -> Unit)

      public fun dynamoDbStreamParameters(dynamoDbStreamParameters: IResolvable)

      public
          fun dynamoDbStreamParameters(dynamoDbStreamParameters: PipeSourceDynamoDBStreamParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97099f3124232ec6d7f1787f80bd6720daf9805f529c6b1339e187c01206f326")
      public
          fun dynamoDbStreamParameters(dynamoDbStreamParameters: PipeSourceDynamoDBStreamParametersProperty.Builder.() -> Unit)

      public fun filterCriteria(filterCriteria: IResolvable)

      public fun filterCriteria(filterCriteria: FilterCriteriaProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("088445f312dece32ace69952411dd034cb1bf64c579ebde89c4d02363c742852")
      public fun filterCriteria(filterCriteria: FilterCriteriaProperty.Builder.() -> Unit)

      public fun kinesisStreamParameters(kinesisStreamParameters: IResolvable)

      public
          fun kinesisStreamParameters(kinesisStreamParameters: PipeSourceKinesisStreamParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dfd4620d80d86ac5b93462071d780d967286984fada2a1d258c3e2fe91399bd9")
      public
          fun kinesisStreamParameters(kinesisStreamParameters: PipeSourceKinesisStreamParametersProperty.Builder.() -> Unit)

      public fun managedStreamingKafkaParameters(managedStreamingKafkaParameters: IResolvable)

      public
          fun managedStreamingKafkaParameters(managedStreamingKafkaParameters: PipeSourceManagedStreamingKafkaParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d039ae200df9f5fc50d6fe42b14ed33f45dc091ba4903b72758bd3789964dfe")
      public
          fun managedStreamingKafkaParameters(managedStreamingKafkaParameters: PipeSourceManagedStreamingKafkaParametersProperty.Builder.() -> Unit)

      public fun rabbitMqBrokerParameters(rabbitMqBrokerParameters: IResolvable)

      public
          fun rabbitMqBrokerParameters(rabbitMqBrokerParameters: PipeSourceRabbitMQBrokerParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59665e351317af0417d24881a7683600b5ea7d08d8efaaf705e55ef7e8d62139")
      public
          fun rabbitMqBrokerParameters(rabbitMqBrokerParameters: PipeSourceRabbitMQBrokerParametersProperty.Builder.() -> Unit)

      public fun selfManagedKafkaParameters(selfManagedKafkaParameters: IResolvable)

      public
          fun selfManagedKafkaParameters(selfManagedKafkaParameters: PipeSourceSelfManagedKafkaParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc7c2eb898cf64ad061c5d11e2ae61bf1e56548d691fa7599e2d78c81aa8bdf6")
      public
          fun selfManagedKafkaParameters(selfManagedKafkaParameters: PipeSourceSelfManagedKafkaParametersProperty.Builder.() -> Unit)

      public fun sqsQueueParameters(sqsQueueParameters: IResolvable)

      public fun sqsQueueParameters(sqsQueueParameters: PipeSourceSqsQueueParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("362cd4d1875965ad5a3b782fb1bc7e3cece0fefbac02273cb81d124996eb25e5")
      public
          fun sqsQueueParameters(sqsQueueParameters: PipeSourceSqsQueueParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceParametersProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceParametersProperty.builder()

      override fun activeMqBrokerParameters(activeMqBrokerParameters: IResolvable) {
        cdkBuilder.activeMqBrokerParameters(activeMqBrokerParameters.let(IResolvable::unwrap))
      }

      override
          fun activeMqBrokerParameters(activeMqBrokerParameters: PipeSourceActiveMQBrokerParametersProperty) {
        cdkBuilder.activeMqBrokerParameters(activeMqBrokerParameters.let(PipeSourceActiveMQBrokerParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8287546ecb6620e76ceb93abb8a4ea23122e522c333d115ea3bbffc26c64d85")
      override
          fun activeMqBrokerParameters(activeMqBrokerParameters: PipeSourceActiveMQBrokerParametersProperty.Builder.() -> Unit):
          Unit =
          activeMqBrokerParameters(PipeSourceActiveMQBrokerParametersProperty(activeMqBrokerParameters))

      override fun dynamoDbStreamParameters(dynamoDbStreamParameters: IResolvable) {
        cdkBuilder.dynamoDbStreamParameters(dynamoDbStreamParameters.let(IResolvable::unwrap))
      }

      override
          fun dynamoDbStreamParameters(dynamoDbStreamParameters: PipeSourceDynamoDBStreamParametersProperty) {
        cdkBuilder.dynamoDbStreamParameters(dynamoDbStreamParameters.let(PipeSourceDynamoDBStreamParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97099f3124232ec6d7f1787f80bd6720daf9805f529c6b1339e187c01206f326")
      override
          fun dynamoDbStreamParameters(dynamoDbStreamParameters: PipeSourceDynamoDBStreamParametersProperty.Builder.() -> Unit):
          Unit =
          dynamoDbStreamParameters(PipeSourceDynamoDBStreamParametersProperty(dynamoDbStreamParameters))

      override fun filterCriteria(filterCriteria: IResolvable) {
        cdkBuilder.filterCriteria(filterCriteria.let(IResolvable::unwrap))
      }

      override fun filterCriteria(filterCriteria: FilterCriteriaProperty) {
        cdkBuilder.filterCriteria(filterCriteria.let(FilterCriteriaProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("088445f312dece32ace69952411dd034cb1bf64c579ebde89c4d02363c742852")
      override fun filterCriteria(filterCriteria: FilterCriteriaProperty.Builder.() -> Unit): Unit =
          filterCriteria(FilterCriteriaProperty(filterCriteria))

      override fun kinesisStreamParameters(kinesisStreamParameters: IResolvable) {
        cdkBuilder.kinesisStreamParameters(kinesisStreamParameters.let(IResolvable::unwrap))
      }

      override
          fun kinesisStreamParameters(kinesisStreamParameters: PipeSourceKinesisStreamParametersProperty) {
        cdkBuilder.kinesisStreamParameters(kinesisStreamParameters.let(PipeSourceKinesisStreamParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dfd4620d80d86ac5b93462071d780d967286984fada2a1d258c3e2fe91399bd9")
      override
          fun kinesisStreamParameters(kinesisStreamParameters: PipeSourceKinesisStreamParametersProperty.Builder.() -> Unit):
          Unit =
          kinesisStreamParameters(PipeSourceKinesisStreamParametersProperty(kinesisStreamParameters))

      override fun managedStreamingKafkaParameters(managedStreamingKafkaParameters: IResolvable) {
        cdkBuilder.managedStreamingKafkaParameters(managedStreamingKafkaParameters.let(IResolvable::unwrap))
      }

      override
          fun managedStreamingKafkaParameters(managedStreamingKafkaParameters: PipeSourceManagedStreamingKafkaParametersProperty) {
        cdkBuilder.managedStreamingKafkaParameters(managedStreamingKafkaParameters.let(PipeSourceManagedStreamingKafkaParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d039ae200df9f5fc50d6fe42b14ed33f45dc091ba4903b72758bd3789964dfe")
      override
          fun managedStreamingKafkaParameters(managedStreamingKafkaParameters: PipeSourceManagedStreamingKafkaParametersProperty.Builder.() -> Unit):
          Unit =
          managedStreamingKafkaParameters(PipeSourceManagedStreamingKafkaParametersProperty(managedStreamingKafkaParameters))

      override fun rabbitMqBrokerParameters(rabbitMqBrokerParameters: IResolvable) {
        cdkBuilder.rabbitMqBrokerParameters(rabbitMqBrokerParameters.let(IResolvable::unwrap))
      }

      override
          fun rabbitMqBrokerParameters(rabbitMqBrokerParameters: PipeSourceRabbitMQBrokerParametersProperty) {
        cdkBuilder.rabbitMqBrokerParameters(rabbitMqBrokerParameters.let(PipeSourceRabbitMQBrokerParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59665e351317af0417d24881a7683600b5ea7d08d8efaaf705e55ef7e8d62139")
      override
          fun rabbitMqBrokerParameters(rabbitMqBrokerParameters: PipeSourceRabbitMQBrokerParametersProperty.Builder.() -> Unit):
          Unit =
          rabbitMqBrokerParameters(PipeSourceRabbitMQBrokerParametersProperty(rabbitMqBrokerParameters))

      override fun selfManagedKafkaParameters(selfManagedKafkaParameters: IResolvable) {
        cdkBuilder.selfManagedKafkaParameters(selfManagedKafkaParameters.let(IResolvable::unwrap))
      }

      override
          fun selfManagedKafkaParameters(selfManagedKafkaParameters: PipeSourceSelfManagedKafkaParametersProperty) {
        cdkBuilder.selfManagedKafkaParameters(selfManagedKafkaParameters.let(PipeSourceSelfManagedKafkaParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc7c2eb898cf64ad061c5d11e2ae61bf1e56548d691fa7599e2d78c81aa8bdf6")
      override
          fun selfManagedKafkaParameters(selfManagedKafkaParameters: PipeSourceSelfManagedKafkaParametersProperty.Builder.() -> Unit):
          Unit =
          selfManagedKafkaParameters(PipeSourceSelfManagedKafkaParametersProperty(selfManagedKafkaParameters))

      override fun sqsQueueParameters(sqsQueueParameters: IResolvable) {
        cdkBuilder.sqsQueueParameters(sqsQueueParameters.let(IResolvable::unwrap))
      }

      override fun sqsQueueParameters(sqsQueueParameters: PipeSourceSqsQueueParametersProperty) {
        cdkBuilder.sqsQueueParameters(sqsQueueParameters.let(PipeSourceSqsQueueParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("362cd4d1875965ad5a3b782fb1bc7e3cece0fefbac02273cb81d124996eb25e5")
      override
          fun sqsQueueParameters(sqsQueueParameters: PipeSourceSqsQueueParametersProperty.Builder.() -> Unit):
          Unit = sqsQueueParameters(PipeSourceSqsQueueParametersProperty(sqsQueueParameters))

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceParametersProperty,
    ) : CdkObject(cdkObject), PipeSourceParametersProperty {
      override fun activeMqBrokerParameters(): Any? = unwrap(this).getActiveMqBrokerParameters()

      override fun dynamoDbStreamParameters(): Any? = unwrap(this).getDynamoDbStreamParameters()

      override fun filterCriteria(): Any? = unwrap(this).getFilterCriteria()

      override fun kinesisStreamParameters(): Any? = unwrap(this).getKinesisStreamParameters()

      override fun managedStreamingKafkaParameters(): Any? =
          unwrap(this).getManagedStreamingKafkaParameters()

      override fun rabbitMqBrokerParameters(): Any? = unwrap(this).getRabbitMqBrokerParameters()

      override fun selfManagedKafkaParameters(): Any? = unwrap(this).getSelfManagedKafkaParameters()

      override fun sqsQueueParameters(): Any? = unwrap(this).getSqsQueueParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PipeSourceParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceParametersProperty):
          PipeSourceParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceParametersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceParametersProperty
    }
  }

  public interface SageMakerPipelineParameterProperty {
    public fun name(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.SageMakerPipelineParameterProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.SageMakerPipelineParameterProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.SageMakerPipelineParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.SageMakerPipelineParameterProperty,
    ) : CdkObject(cdkObject), SageMakerPipelineParameterProperty {
      override fun name(): String = unwrap(this).getName()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SageMakerPipelineParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.SageMakerPipelineParameterProperty):
          SageMakerPipelineParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SageMakerPipelineParameterProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.SageMakerPipelineParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.SageMakerPipelineParameterProperty
    }
  }

  public interface SelfManagedKafkaAccessConfigurationVpcProperty {
    public fun securityGroup(): List<String> = unwrap(this).getSecurityGroup() ?: emptyList()

    public fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun securityGroup(securityGroup: List<String>)

      public fun securityGroup(vararg securityGroup: String)

      public fun subnets(subnets: List<String>)

      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty.builder()

      override fun securityGroup(securityGroup: List<String>) {
        cdkBuilder.securityGroup(securityGroup)
      }

      override fun securityGroup(vararg securityGroup: String): Unit =
          securityGroup(securityGroup.toList())

      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty,
    ) : CdkObject(cdkObject), SelfManagedKafkaAccessConfigurationVpcProperty {
      override fun securityGroup(): List<String> = unwrap(this).getSecurityGroup() ?: emptyList()

      override fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SelfManagedKafkaAccessConfigurationVpcProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty):
          SelfManagedKafkaAccessConfigurationVpcProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SelfManagedKafkaAccessConfigurationVpcProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty
    }
  }

  public interface PipeTargetBatchJobParametersProperty {
    public fun arrayProperties(): Any? = unwrap(this).getArrayProperties()

    public fun containerOverrides(): Any? = unwrap(this).getContainerOverrides()

    public fun dependsOn(): Any? = unwrap(this).getDependsOn()

    public fun jobDefinition(): String

    public fun jobName(): String

    public fun parameters(): Any? = unwrap(this).getParameters()

    public fun retryStrategy(): Any? = unwrap(this).getRetryStrategy()

    @CdkDslMarker
    public interface Builder {
      public fun arrayProperties(arrayProperties: IResolvable)

      public fun arrayProperties(arrayProperties: BatchArrayPropertiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ee017bbeaa5a9ef21edffcbce56ca39aa77f6306f049c4bb9842786a7480d718")
      public fun arrayProperties(arrayProperties: BatchArrayPropertiesProperty.Builder.() -> Unit)

      public fun containerOverrides(containerOverrides: IResolvable)

      public fun containerOverrides(containerOverrides: BatchContainerOverridesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33706522c31b6d00099ad806ab4ea4c3a0b2372b2b46f3f1782c1b59d78492d9")
      public
          fun containerOverrides(containerOverrides: BatchContainerOverridesProperty.Builder.() -> Unit)

      public fun dependsOn(dependsOn: IResolvable)

      public fun dependsOn(dependsOn: List<Any>)

      public fun dependsOn(vararg dependsOn: Any)

      public fun jobDefinition(jobDefinition: String)

      public fun jobName(jobName: String)

      public fun parameters(parameters: IResolvable)

      public fun parameters(parameters: Map<String, String>)

      public fun retryStrategy(retryStrategy: IResolvable)

      public fun retryStrategy(retryStrategy: BatchRetryStrategyProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e98fc3a4d7335ae32d18386b6d01abb467445b94a9dfa4182e352180dde8135b")
      public fun retryStrategy(retryStrategy: BatchRetryStrategyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetBatchJobParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetBatchJobParametersProperty.builder()

      override fun arrayProperties(arrayProperties: IResolvable) {
        cdkBuilder.arrayProperties(arrayProperties.let(IResolvable::unwrap))
      }

      override fun arrayProperties(arrayProperties: BatchArrayPropertiesProperty) {
        cdkBuilder.arrayProperties(arrayProperties.let(BatchArrayPropertiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ee017bbeaa5a9ef21edffcbce56ca39aa77f6306f049c4bb9842786a7480d718")
      override
          fun arrayProperties(arrayProperties: BatchArrayPropertiesProperty.Builder.() -> Unit):
          Unit = arrayProperties(BatchArrayPropertiesProperty(arrayProperties))

      override fun containerOverrides(containerOverrides: IResolvable) {
        cdkBuilder.containerOverrides(containerOverrides.let(IResolvable::unwrap))
      }

      override fun containerOverrides(containerOverrides: BatchContainerOverridesProperty) {
        cdkBuilder.containerOverrides(containerOverrides.let(BatchContainerOverridesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33706522c31b6d00099ad806ab4ea4c3a0b2372b2b46f3f1782c1b59d78492d9")
      override
          fun containerOverrides(containerOverrides: BatchContainerOverridesProperty.Builder.() -> Unit):
          Unit = containerOverrides(BatchContainerOverridesProperty(containerOverrides))

      override fun dependsOn(dependsOn: IResolvable) {
        cdkBuilder.dependsOn(dependsOn.let(IResolvable::unwrap))
      }

      override fun dependsOn(dependsOn: List<Any>) {
        cdkBuilder.dependsOn(dependsOn)
      }

      override fun dependsOn(vararg dependsOn: Any): Unit = dependsOn(dependsOn.toList())

      override fun jobDefinition(jobDefinition: String) {
        cdkBuilder.jobDefinition(jobDefinition)
      }

      override fun jobName(jobName: String) {
        cdkBuilder.jobName(jobName)
      }

      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      override fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
      }

      override fun retryStrategy(retryStrategy: IResolvable) {
        cdkBuilder.retryStrategy(retryStrategy.let(IResolvable::unwrap))
      }

      override fun retryStrategy(retryStrategy: BatchRetryStrategyProperty) {
        cdkBuilder.retryStrategy(retryStrategy.let(BatchRetryStrategyProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e98fc3a4d7335ae32d18386b6d01abb467445b94a9dfa4182e352180dde8135b")
      override fun retryStrategy(retryStrategy: BatchRetryStrategyProperty.Builder.() -> Unit): Unit
          = retryStrategy(BatchRetryStrategyProperty(retryStrategy))

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetBatchJobParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetBatchJobParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetBatchJobParametersProperty {
      override fun arrayProperties(): Any? = unwrap(this).getArrayProperties()

      override fun containerOverrides(): Any? = unwrap(this).getContainerOverrides()

      override fun dependsOn(): Any? = unwrap(this).getDependsOn()

      override fun jobDefinition(): String = unwrap(this).getJobDefinition()

      override fun jobName(): String = unwrap(this).getJobName()

      override fun parameters(): Any? = unwrap(this).getParameters()

      override fun retryStrategy(): Any? = unwrap(this).getRetryStrategy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetBatchJobParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetBatchJobParametersProperty):
          PipeTargetBatchJobParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetBatchJobParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetBatchJobParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetBatchJobParametersProperty
    }
  }

  public interface FirehoseLogDestinationProperty {
    public fun deliveryStreamArn(): String? = unwrap(this).getDeliveryStreamArn()

    @CdkDslMarker
    public interface Builder {
      public fun deliveryStreamArn(deliveryStreamArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.FirehoseLogDestinationProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.FirehoseLogDestinationProperty.builder()

      override fun deliveryStreamArn(deliveryStreamArn: String) {
        cdkBuilder.deliveryStreamArn(deliveryStreamArn)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.FirehoseLogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.FirehoseLogDestinationProperty,
    ) : CdkObject(cdkObject), FirehoseLogDestinationProperty {
      override fun deliveryStreamArn(): String? = unwrap(this).getDeliveryStreamArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FirehoseLogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.FirehoseLogDestinationProperty):
          FirehoseLogDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirehoseLogDestinationProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.FirehoseLogDestinationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.FirehoseLogDestinationProperty
    }
  }

  public interface PipeTargetParametersProperty {
    public fun batchJobParameters(): Any? = unwrap(this).getBatchJobParameters()

    public fun cloudWatchLogsParameters(): Any? = unwrap(this).getCloudWatchLogsParameters()

    public fun ecsTaskParameters(): Any? = unwrap(this).getEcsTaskParameters()

    public fun eventBridgeEventBusParameters(): Any? =
        unwrap(this).getEventBridgeEventBusParameters()

    public fun httpParameters(): Any? = unwrap(this).getHttpParameters()

    public fun inputTemplate(): String? = unwrap(this).getInputTemplate()

    public fun kinesisStreamParameters(): Any? = unwrap(this).getKinesisStreamParameters()

    public fun lambdaFunctionParameters(): Any? = unwrap(this).getLambdaFunctionParameters()

    public fun redshiftDataParameters(): Any? = unwrap(this).getRedshiftDataParameters()

    public fun sageMakerPipelineParameters(): Any? = unwrap(this).getSageMakerPipelineParameters()

    public fun sqsQueueParameters(): Any? = unwrap(this).getSqsQueueParameters()

    public fun stepFunctionStateMachineParameters(): Any? =
        unwrap(this).getStepFunctionStateMachineParameters()

    @CdkDslMarker
    public interface Builder {
      public fun batchJobParameters(batchJobParameters: IResolvable)

      public fun batchJobParameters(batchJobParameters: PipeTargetBatchJobParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdaf15f5e96b52ffa23847a4ceac42195e4993caf7b5d539406df36ef64fd297")
      public
          fun batchJobParameters(batchJobParameters: PipeTargetBatchJobParametersProperty.Builder.() -> Unit)

      public fun cloudWatchLogsParameters(cloudWatchLogsParameters: IResolvable)

      public
          fun cloudWatchLogsParameters(cloudWatchLogsParameters: PipeTargetCloudWatchLogsParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d94b1dca2737581a33c6d8a82a05839a568009d24dea8855bac1f0a056356861")
      public
          fun cloudWatchLogsParameters(cloudWatchLogsParameters: PipeTargetCloudWatchLogsParametersProperty.Builder.() -> Unit)

      public fun ecsTaskParameters(ecsTaskParameters: IResolvable)

      public fun ecsTaskParameters(ecsTaskParameters: PipeTargetEcsTaskParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b56b9f235c7f227fdecbf99946f8a4d55051de254773c79eda188c4371f362d8")
      public
          fun ecsTaskParameters(ecsTaskParameters: PipeTargetEcsTaskParametersProperty.Builder.() -> Unit)

      public fun eventBridgeEventBusParameters(eventBridgeEventBusParameters: IResolvable)

      public
          fun eventBridgeEventBusParameters(eventBridgeEventBusParameters: PipeTargetEventBridgeEventBusParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c5a979d38b6badf433e4697081dcf5ebaa01f03a54b50a27ec403d89398fda36")
      public
          fun eventBridgeEventBusParameters(eventBridgeEventBusParameters: PipeTargetEventBridgeEventBusParametersProperty.Builder.() -> Unit)

      public fun httpParameters(httpParameters: IResolvable)

      public fun httpParameters(httpParameters: PipeTargetHttpParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("60a10dc2e3a6d4149db45ceb008014cdb486663706bf2fc975bbb4dff2fdcdc0")
      public fun httpParameters(httpParameters: PipeTargetHttpParametersProperty.Builder.() -> Unit)

      public fun inputTemplate(inputTemplate: String)

      public fun kinesisStreamParameters(kinesisStreamParameters: IResolvable)

      public
          fun kinesisStreamParameters(kinesisStreamParameters: PipeTargetKinesisStreamParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7041253f54d2a8022b5edf392192de92458f27517c4b2fcd22920caf60d7f86")
      public
          fun kinesisStreamParameters(kinesisStreamParameters: PipeTargetKinesisStreamParametersProperty.Builder.() -> Unit)

      public fun lambdaFunctionParameters(lambdaFunctionParameters: IResolvable)

      public
          fun lambdaFunctionParameters(lambdaFunctionParameters: PipeTargetLambdaFunctionParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7b22e1eff3837d34aa5bff40756eaeec651842e77f84128fd3688e7cbe3afe51")
      public
          fun lambdaFunctionParameters(lambdaFunctionParameters: PipeTargetLambdaFunctionParametersProperty.Builder.() -> Unit)

      public fun redshiftDataParameters(redshiftDataParameters: IResolvable)

      public
          fun redshiftDataParameters(redshiftDataParameters: PipeTargetRedshiftDataParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6683ea8aeb687b4449f257a8375f98b755ace2518160fcfb7749e987f381d6c3")
      public
          fun redshiftDataParameters(redshiftDataParameters: PipeTargetRedshiftDataParametersProperty.Builder.() -> Unit)

      public fun sageMakerPipelineParameters(sageMakerPipelineParameters: IResolvable)

      public
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: PipeTargetSageMakerPipelineParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("09c82decebfa4d802c5bd64ec0a261aaee817f9f37480bd0fc326e0af8da78d7")
      public
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: PipeTargetSageMakerPipelineParametersProperty.Builder.() -> Unit)

      public fun sqsQueueParameters(sqsQueueParameters: IResolvable)

      public fun sqsQueueParameters(sqsQueueParameters: PipeTargetSqsQueueParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbe15509195fccf35855a8fbbc2b4a87d242b141ac82c4214512ebc00a21128d")
      public
          fun sqsQueueParameters(sqsQueueParameters: PipeTargetSqsQueueParametersProperty.Builder.() -> Unit)

      public fun stepFunctionStateMachineParameters(stepFunctionStateMachineParameters: IResolvable)

      public
          fun stepFunctionStateMachineParameters(stepFunctionStateMachineParameters: PipeTargetStateMachineParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c98c038add2c0bc4e1ab167709d03310995337108c405ec86f15195d3bfad285")
      public
          fun stepFunctionStateMachineParameters(stepFunctionStateMachineParameters: PipeTargetStateMachineParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetParametersProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetParametersProperty.builder()

      override fun batchJobParameters(batchJobParameters: IResolvable) {
        cdkBuilder.batchJobParameters(batchJobParameters.let(IResolvable::unwrap))
      }

      override fun batchJobParameters(batchJobParameters: PipeTargetBatchJobParametersProperty) {
        cdkBuilder.batchJobParameters(batchJobParameters.let(PipeTargetBatchJobParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdaf15f5e96b52ffa23847a4ceac42195e4993caf7b5d539406df36ef64fd297")
      override
          fun batchJobParameters(batchJobParameters: PipeTargetBatchJobParametersProperty.Builder.() -> Unit):
          Unit = batchJobParameters(PipeTargetBatchJobParametersProperty(batchJobParameters))

      override fun cloudWatchLogsParameters(cloudWatchLogsParameters: IResolvable) {
        cdkBuilder.cloudWatchLogsParameters(cloudWatchLogsParameters.let(IResolvable::unwrap))
      }

      override
          fun cloudWatchLogsParameters(cloudWatchLogsParameters: PipeTargetCloudWatchLogsParametersProperty) {
        cdkBuilder.cloudWatchLogsParameters(cloudWatchLogsParameters.let(PipeTargetCloudWatchLogsParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d94b1dca2737581a33c6d8a82a05839a568009d24dea8855bac1f0a056356861")
      override
          fun cloudWatchLogsParameters(cloudWatchLogsParameters: PipeTargetCloudWatchLogsParametersProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLogsParameters(PipeTargetCloudWatchLogsParametersProperty(cloudWatchLogsParameters))

      override fun ecsTaskParameters(ecsTaskParameters: IResolvable) {
        cdkBuilder.ecsTaskParameters(ecsTaskParameters.let(IResolvable::unwrap))
      }

      override fun ecsTaskParameters(ecsTaskParameters: PipeTargetEcsTaskParametersProperty) {
        cdkBuilder.ecsTaskParameters(ecsTaskParameters.let(PipeTargetEcsTaskParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b56b9f235c7f227fdecbf99946f8a4d55051de254773c79eda188c4371f362d8")
      override
          fun ecsTaskParameters(ecsTaskParameters: PipeTargetEcsTaskParametersProperty.Builder.() -> Unit):
          Unit = ecsTaskParameters(PipeTargetEcsTaskParametersProperty(ecsTaskParameters))

      override fun eventBridgeEventBusParameters(eventBridgeEventBusParameters: IResolvable) {
        cdkBuilder.eventBridgeEventBusParameters(eventBridgeEventBusParameters.let(IResolvable::unwrap))
      }

      override
          fun eventBridgeEventBusParameters(eventBridgeEventBusParameters: PipeTargetEventBridgeEventBusParametersProperty) {
        cdkBuilder.eventBridgeEventBusParameters(eventBridgeEventBusParameters.let(PipeTargetEventBridgeEventBusParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c5a979d38b6badf433e4697081dcf5ebaa01f03a54b50a27ec403d89398fda36")
      override
          fun eventBridgeEventBusParameters(eventBridgeEventBusParameters: PipeTargetEventBridgeEventBusParametersProperty.Builder.() -> Unit):
          Unit =
          eventBridgeEventBusParameters(PipeTargetEventBridgeEventBusParametersProperty(eventBridgeEventBusParameters))

      override fun httpParameters(httpParameters: IResolvable) {
        cdkBuilder.httpParameters(httpParameters.let(IResolvable::unwrap))
      }

      override fun httpParameters(httpParameters: PipeTargetHttpParametersProperty) {
        cdkBuilder.httpParameters(httpParameters.let(PipeTargetHttpParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("60a10dc2e3a6d4149db45ceb008014cdb486663706bf2fc975bbb4dff2fdcdc0")
      override
          fun httpParameters(httpParameters: PipeTargetHttpParametersProperty.Builder.() -> Unit):
          Unit = httpParameters(PipeTargetHttpParametersProperty(httpParameters))

      override fun inputTemplate(inputTemplate: String) {
        cdkBuilder.inputTemplate(inputTemplate)
      }

      override fun kinesisStreamParameters(kinesisStreamParameters: IResolvable) {
        cdkBuilder.kinesisStreamParameters(kinesisStreamParameters.let(IResolvable::unwrap))
      }

      override
          fun kinesisStreamParameters(kinesisStreamParameters: PipeTargetKinesisStreamParametersProperty) {
        cdkBuilder.kinesisStreamParameters(kinesisStreamParameters.let(PipeTargetKinesisStreamParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7041253f54d2a8022b5edf392192de92458f27517c4b2fcd22920caf60d7f86")
      override
          fun kinesisStreamParameters(kinesisStreamParameters: PipeTargetKinesisStreamParametersProperty.Builder.() -> Unit):
          Unit =
          kinesisStreamParameters(PipeTargetKinesisStreamParametersProperty(kinesisStreamParameters))

      override fun lambdaFunctionParameters(lambdaFunctionParameters: IResolvable) {
        cdkBuilder.lambdaFunctionParameters(lambdaFunctionParameters.let(IResolvable::unwrap))
      }

      override
          fun lambdaFunctionParameters(lambdaFunctionParameters: PipeTargetLambdaFunctionParametersProperty) {
        cdkBuilder.lambdaFunctionParameters(lambdaFunctionParameters.let(PipeTargetLambdaFunctionParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7b22e1eff3837d34aa5bff40756eaeec651842e77f84128fd3688e7cbe3afe51")
      override
          fun lambdaFunctionParameters(lambdaFunctionParameters: PipeTargetLambdaFunctionParametersProperty.Builder.() -> Unit):
          Unit =
          lambdaFunctionParameters(PipeTargetLambdaFunctionParametersProperty(lambdaFunctionParameters))

      override fun redshiftDataParameters(redshiftDataParameters: IResolvable) {
        cdkBuilder.redshiftDataParameters(redshiftDataParameters.let(IResolvable::unwrap))
      }

      override
          fun redshiftDataParameters(redshiftDataParameters: PipeTargetRedshiftDataParametersProperty) {
        cdkBuilder.redshiftDataParameters(redshiftDataParameters.let(PipeTargetRedshiftDataParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6683ea8aeb687b4449f257a8375f98b755ace2518160fcfb7749e987f381d6c3")
      override
          fun redshiftDataParameters(redshiftDataParameters: PipeTargetRedshiftDataParametersProperty.Builder.() -> Unit):
          Unit =
          redshiftDataParameters(PipeTargetRedshiftDataParametersProperty(redshiftDataParameters))

      override fun sageMakerPipelineParameters(sageMakerPipelineParameters: IResolvable) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters.let(IResolvable::unwrap))
      }

      override
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: PipeTargetSageMakerPipelineParametersProperty) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters.let(PipeTargetSageMakerPipelineParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("09c82decebfa4d802c5bd64ec0a261aaee817f9f37480bd0fc326e0af8da78d7")
      override
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: PipeTargetSageMakerPipelineParametersProperty.Builder.() -> Unit):
          Unit =
          sageMakerPipelineParameters(PipeTargetSageMakerPipelineParametersProperty(sageMakerPipelineParameters))

      override fun sqsQueueParameters(sqsQueueParameters: IResolvable) {
        cdkBuilder.sqsQueueParameters(sqsQueueParameters.let(IResolvable::unwrap))
      }

      override fun sqsQueueParameters(sqsQueueParameters: PipeTargetSqsQueueParametersProperty) {
        cdkBuilder.sqsQueueParameters(sqsQueueParameters.let(PipeTargetSqsQueueParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbe15509195fccf35855a8fbbc2b4a87d242b141ac82c4214512ebc00a21128d")
      override
          fun sqsQueueParameters(sqsQueueParameters: PipeTargetSqsQueueParametersProperty.Builder.() -> Unit):
          Unit = sqsQueueParameters(PipeTargetSqsQueueParametersProperty(sqsQueueParameters))

      override
          fun stepFunctionStateMachineParameters(stepFunctionStateMachineParameters: IResolvable) {
        cdkBuilder.stepFunctionStateMachineParameters(stepFunctionStateMachineParameters.let(IResolvable::unwrap))
      }

      override
          fun stepFunctionStateMachineParameters(stepFunctionStateMachineParameters: PipeTargetStateMachineParametersProperty) {
        cdkBuilder.stepFunctionStateMachineParameters(stepFunctionStateMachineParameters.let(PipeTargetStateMachineParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c98c038add2c0bc4e1ab167709d03310995337108c405ec86f15195d3bfad285")
      override
          fun stepFunctionStateMachineParameters(stepFunctionStateMachineParameters: PipeTargetStateMachineParametersProperty.Builder.() -> Unit):
          Unit =
          stepFunctionStateMachineParameters(PipeTargetStateMachineParametersProperty(stepFunctionStateMachineParameters))

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetParametersProperty {
      override fun batchJobParameters(): Any? = unwrap(this).getBatchJobParameters()

      override fun cloudWatchLogsParameters(): Any? = unwrap(this).getCloudWatchLogsParameters()

      override fun ecsTaskParameters(): Any? = unwrap(this).getEcsTaskParameters()

      override fun eventBridgeEventBusParameters(): Any? =
          unwrap(this).getEventBridgeEventBusParameters()

      override fun httpParameters(): Any? = unwrap(this).getHttpParameters()

      override fun inputTemplate(): String? = unwrap(this).getInputTemplate()

      override fun kinesisStreamParameters(): Any? = unwrap(this).getKinesisStreamParameters()

      override fun lambdaFunctionParameters(): Any? = unwrap(this).getLambdaFunctionParameters()

      override fun redshiftDataParameters(): Any? = unwrap(this).getRedshiftDataParameters()

      override fun sageMakerPipelineParameters(): Any? =
          unwrap(this).getSageMakerPipelineParameters()

      override fun sqsQueueParameters(): Any? = unwrap(this).getSqsQueueParameters()

      override fun stepFunctionStateMachineParameters(): Any? =
          unwrap(this).getStepFunctionStateMachineParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PipeTargetParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetParametersProperty):
          PipeTargetParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetParametersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetParametersProperty
    }
  }

  public interface PipeLogConfigurationProperty {
    public fun cloudwatchLogsLogDestination(): Any? = unwrap(this).getCloudwatchLogsLogDestination()

    public fun firehoseLogDestination(): Any? = unwrap(this).getFirehoseLogDestination()

    public fun includeExecutionData(): List<String> = unwrap(this).getIncludeExecutionData() ?:
        emptyList()

    public fun level(): String? = unwrap(this).getLevel()

    public fun s3LogDestination(): Any? = unwrap(this).getS3LogDestination()

    @CdkDslMarker
    public interface Builder {
      public fun cloudwatchLogsLogDestination(cloudwatchLogsLogDestination: IResolvable)

      public
          fun cloudwatchLogsLogDestination(cloudwatchLogsLogDestination: CloudwatchLogsLogDestinationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2868d9599846bb0f80a69232e538e1e3f52d7a455e0dfbcbe2b41e0481de7f10")
      public
          fun cloudwatchLogsLogDestination(cloudwatchLogsLogDestination: CloudwatchLogsLogDestinationProperty.Builder.() -> Unit)

      public fun firehoseLogDestination(firehoseLogDestination: IResolvable)

      public fun firehoseLogDestination(firehoseLogDestination: FirehoseLogDestinationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ccd62478289f6030d7ca6615926381df28db347b2571aae07bf10d0a25c0d64")
      public
          fun firehoseLogDestination(firehoseLogDestination: FirehoseLogDestinationProperty.Builder.() -> Unit)

      public fun includeExecutionData(includeExecutionData: List<String>)

      public fun includeExecutionData(vararg includeExecutionData: String)

      public fun level(level: String)

      public fun s3LogDestination(s3LogDestination: IResolvable)

      public fun s3LogDestination(s3LogDestination: S3LogDestinationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bc0940a20a9c9176130427adbc51573008b4daed153833bdef9e024cda4add7")
      public fun s3LogDestination(s3LogDestination: S3LogDestinationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeLogConfigurationProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeLogConfigurationProperty.builder()

      override fun cloudwatchLogsLogDestination(cloudwatchLogsLogDestination: IResolvable) {
        cdkBuilder.cloudwatchLogsLogDestination(cloudwatchLogsLogDestination.let(IResolvable::unwrap))
      }

      override
          fun cloudwatchLogsLogDestination(cloudwatchLogsLogDestination: CloudwatchLogsLogDestinationProperty) {
        cdkBuilder.cloudwatchLogsLogDestination(cloudwatchLogsLogDestination.let(CloudwatchLogsLogDestinationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2868d9599846bb0f80a69232e538e1e3f52d7a455e0dfbcbe2b41e0481de7f10")
      override
          fun cloudwatchLogsLogDestination(cloudwatchLogsLogDestination: CloudwatchLogsLogDestinationProperty.Builder.() -> Unit):
          Unit =
          cloudwatchLogsLogDestination(CloudwatchLogsLogDestinationProperty(cloudwatchLogsLogDestination))

      override fun firehoseLogDestination(firehoseLogDestination: IResolvable) {
        cdkBuilder.firehoseLogDestination(firehoseLogDestination.let(IResolvable::unwrap))
      }

      override fun firehoseLogDestination(firehoseLogDestination: FirehoseLogDestinationProperty) {
        cdkBuilder.firehoseLogDestination(firehoseLogDestination.let(FirehoseLogDestinationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ccd62478289f6030d7ca6615926381df28db347b2571aae07bf10d0a25c0d64")
      override
          fun firehoseLogDestination(firehoseLogDestination: FirehoseLogDestinationProperty.Builder.() -> Unit):
          Unit = firehoseLogDestination(FirehoseLogDestinationProperty(firehoseLogDestination))

      override fun includeExecutionData(includeExecutionData: List<String>) {
        cdkBuilder.includeExecutionData(includeExecutionData)
      }

      override fun includeExecutionData(vararg includeExecutionData: String): Unit =
          includeExecutionData(includeExecutionData.toList())

      override fun level(level: String) {
        cdkBuilder.level(level)
      }

      override fun s3LogDestination(s3LogDestination: IResolvable) {
        cdkBuilder.s3LogDestination(s3LogDestination.let(IResolvable::unwrap))
      }

      override fun s3LogDestination(s3LogDestination: S3LogDestinationProperty) {
        cdkBuilder.s3LogDestination(s3LogDestination.let(S3LogDestinationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bc0940a20a9c9176130427adbc51573008b4daed153833bdef9e024cda4add7")
      override fun s3LogDestination(s3LogDestination: S3LogDestinationProperty.Builder.() -> Unit):
          Unit = s3LogDestination(S3LogDestinationProperty(s3LogDestination))

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.PipeLogConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeLogConfigurationProperty,
    ) : CdkObject(cdkObject), PipeLogConfigurationProperty {
      override fun cloudwatchLogsLogDestination(): Any? =
          unwrap(this).getCloudwatchLogsLogDestination()

      override fun firehoseLogDestination(): Any? = unwrap(this).getFirehoseLogDestination()

      override fun includeExecutionData(): List<String> = unwrap(this).getIncludeExecutionData() ?:
          emptyList()

      override fun level(): String? = unwrap(this).getLevel()

      override fun s3LogDestination(): Any? = unwrap(this).getS3LogDestination()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PipeLogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeLogConfigurationProperty):
          PipeLogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeLogConfigurationProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeLogConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeLogConfigurationProperty
    }
  }

  public interface BatchJobDependencyProperty {
    public fun jobId(): String? = unwrap(this).getJobId()

    public fun type(): String? = unwrap(this).getType()

    @CdkDslMarker
    public interface Builder {
      public fun jobId(jobId: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchJobDependencyProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.BatchJobDependencyProperty.builder()

      override fun jobId(jobId: String) {
        cdkBuilder.jobId(jobId)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.BatchJobDependencyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchJobDependencyProperty,
    ) : CdkObject(cdkObject), BatchJobDependencyProperty {
      override fun jobId(): String? = unwrap(this).getJobId()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchJobDependencyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.BatchJobDependencyProperty):
          BatchJobDependencyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchJobDependencyProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.BatchJobDependencyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.BatchJobDependencyProperty
    }
  }

  public interface PipeTargetHttpParametersProperty {
    public fun headerParameters(): Any? = unwrap(this).getHeaderParameters()

    public fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
        emptyList()

    public fun queryStringParameters(): Any? = unwrap(this).getQueryStringParameters()

    @CdkDslMarker
    public interface Builder {
      public fun headerParameters(headerParameters: IResolvable)

      public fun headerParameters(headerParameters: Map<String, String>)

      public fun pathParameterValues(pathParameterValues: List<String>)

      public fun pathParameterValues(vararg pathParameterValues: String)

      public fun queryStringParameters(queryStringParameters: IResolvable)

      public fun queryStringParameters(queryStringParameters: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetHttpParametersProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetHttpParametersProperty.builder()

      override fun headerParameters(headerParameters: IResolvable) {
        cdkBuilder.headerParameters(headerParameters.let(IResolvable::unwrap))
      }

      override fun headerParameters(headerParameters: Map<String, String>) {
        cdkBuilder.headerParameters(headerParameters)
      }

      override fun pathParameterValues(pathParameterValues: List<String>) {
        cdkBuilder.pathParameterValues(pathParameterValues)
      }

      override fun pathParameterValues(vararg pathParameterValues: String): Unit =
          pathParameterValues(pathParameterValues.toList())

      override fun queryStringParameters(queryStringParameters: IResolvable) {
        cdkBuilder.queryStringParameters(queryStringParameters.let(IResolvable::unwrap))
      }

      override fun queryStringParameters(queryStringParameters: Map<String, String>) {
        cdkBuilder.queryStringParameters(queryStringParameters)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetHttpParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetHttpParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetHttpParametersProperty {
      override fun headerParameters(): Any? = unwrap(this).getHeaderParameters()

      override fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
          emptyList()

      override fun queryStringParameters(): Any? = unwrap(this).getQueryStringParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PipeTargetHttpParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetHttpParametersProperty):
          PipeTargetHttpParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetHttpParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetHttpParametersProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetHttpParametersProperty
    }
  }

  public interface PipeTargetEcsTaskParametersProperty {
    public fun capacityProviderStrategy(): Any? = unwrap(this).getCapacityProviderStrategy()

    public fun enableEcsManagedTags(): Any? = unwrap(this).getEnableEcsManagedTags()

    public fun enableExecuteCommand(): Any? = unwrap(this).getEnableExecuteCommand()

    public fun group(): String? = unwrap(this).getGroup()

    public fun launchType(): String? = unwrap(this).getLaunchType()

    public fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

    public fun overrides(): Any? = unwrap(this).getOverrides()

    public fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

    public fun placementStrategy(): Any? = unwrap(this).getPlacementStrategy()

    public fun platformVersion(): String? = unwrap(this).getPlatformVersion()

    public fun propagateTags(): String? = unwrap(this).getPropagateTags()

    public fun referenceId(): String? = unwrap(this).getReferenceId()

    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    public fun taskCount(): Number? = unwrap(this).getTaskCount()

    public fun taskDefinitionArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun capacityProviderStrategy(capacityProviderStrategy: IResolvable)

      public fun capacityProviderStrategy(capacityProviderStrategy: List<Any>)

      public fun capacityProviderStrategy(vararg capacityProviderStrategy: Any)

      public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

      public fun enableEcsManagedTags(enableEcsManagedTags: IResolvable)

      public fun enableExecuteCommand(enableExecuteCommand: Boolean)

      public fun enableExecuteCommand(enableExecuteCommand: IResolvable)

      public fun group(group: String)

      public fun launchType(launchType: String)

      public fun networkConfiguration(networkConfiguration: IResolvable)

      public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c7e89dc9b6033d1ae9fbfb05a091dcfe0b1ddf5eabb920fc47493dc171114b0")
      public
          fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit)

      public fun overrides(overrides: IResolvable)

      public fun overrides(overrides: EcsTaskOverrideProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe7b5a319437fa5477d5c6c3f363bf105c7bae2e5d6013e31153919a513fb440")
      public fun overrides(overrides: EcsTaskOverrideProperty.Builder.() -> Unit)

      public fun placementConstraints(placementConstraints: IResolvable)

      public fun placementConstraints(placementConstraints: List<Any>)

      public fun placementConstraints(vararg placementConstraints: Any)

      public fun placementStrategy(placementStrategy: IResolvable)

      public fun placementStrategy(placementStrategy: List<Any>)

      public fun placementStrategy(vararg placementStrategy: Any)

      public fun platformVersion(platformVersion: String)

      public fun propagateTags(propagateTags: String)

      public fun referenceId(referenceId: String)

      public fun tags(tags: List<CfnTag>)

      public fun tags(vararg tags: CfnTag)

      public fun taskCount(taskCount: Number)

      public fun taskDefinitionArn(taskDefinitionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEcsTaskParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEcsTaskParametersProperty.builder()

      override fun capacityProviderStrategy(capacityProviderStrategy: IResolvable) {
        cdkBuilder.capacityProviderStrategy(capacityProviderStrategy.let(IResolvable::unwrap))
      }

      override fun capacityProviderStrategy(capacityProviderStrategy: List<Any>) {
        cdkBuilder.capacityProviderStrategy(capacityProviderStrategy)
      }

      override fun capacityProviderStrategy(vararg capacityProviderStrategy: Any): Unit =
          capacityProviderStrategy(capacityProviderStrategy.toList())

      override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
      }

      override fun enableEcsManagedTags(enableEcsManagedTags: IResolvable) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags.let(IResolvable::unwrap))
      }

      override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand)
      }

      override fun enableExecuteCommand(enableExecuteCommand: IResolvable) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand.let(IResolvable::unwrap))
      }

      override fun group(group: String) {
        cdkBuilder.group(group)
      }

      override fun launchType(launchType: String) {
        cdkBuilder.launchType(launchType)
      }

      override fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
      }

      override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
        cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c7e89dc9b6033d1ae9fbfb05a091dcfe0b1ddf5eabb920fc47493dc171114b0")
      override
          fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
          Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

      override fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides.let(IResolvable::unwrap))
      }

      override fun overrides(overrides: EcsTaskOverrideProperty) {
        cdkBuilder.overrides(overrides.let(EcsTaskOverrideProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe7b5a319437fa5477d5c6c3f363bf105c7bae2e5d6013e31153919a513fb440")
      override fun overrides(overrides: EcsTaskOverrideProperty.Builder.() -> Unit): Unit =
          overrides(EcsTaskOverrideProperty(overrides))

      override fun placementConstraints(placementConstraints: IResolvable) {
        cdkBuilder.placementConstraints(placementConstraints.let(IResolvable::unwrap))
      }

      override fun placementConstraints(placementConstraints: List<Any>) {
        cdkBuilder.placementConstraints(placementConstraints)
      }

      override fun placementConstraints(vararg placementConstraints: Any): Unit =
          placementConstraints(placementConstraints.toList())

      override fun placementStrategy(placementStrategy: IResolvable) {
        cdkBuilder.placementStrategy(placementStrategy.let(IResolvable::unwrap))
      }

      override fun placementStrategy(placementStrategy: List<Any>) {
        cdkBuilder.placementStrategy(placementStrategy)
      }

      override fun placementStrategy(vararg placementStrategy: Any): Unit =
          placementStrategy(placementStrategy.toList())

      override fun platformVersion(platformVersion: String) {
        cdkBuilder.platformVersion(platformVersion)
      }

      override fun propagateTags(propagateTags: String) {
        cdkBuilder.propagateTags(propagateTags)
      }

      override fun referenceId(referenceId: String) {
        cdkBuilder.referenceId(referenceId)
      }

      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      override fun taskCount(taskCount: Number) {
        cdkBuilder.taskCount(taskCount)
      }

      override fun taskDefinitionArn(taskDefinitionArn: String) {
        cdkBuilder.taskDefinitionArn(taskDefinitionArn)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEcsTaskParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEcsTaskParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetEcsTaskParametersProperty {
      override fun capacityProviderStrategy(): Any? = unwrap(this).getCapacityProviderStrategy()

      override fun enableEcsManagedTags(): Any? = unwrap(this).getEnableEcsManagedTags()

      override fun enableExecuteCommand(): Any? = unwrap(this).getEnableExecuteCommand()

      override fun group(): String? = unwrap(this).getGroup()

      override fun launchType(): String? = unwrap(this).getLaunchType()

      override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

      override fun overrides(): Any? = unwrap(this).getOverrides()

      override fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

      override fun placementStrategy(): Any? = unwrap(this).getPlacementStrategy()

      override fun platformVersion(): String? = unwrap(this).getPlatformVersion()

      override fun propagateTags(): String? = unwrap(this).getPropagateTags()

      override fun referenceId(): String? = unwrap(this).getReferenceId()

      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

      override fun taskCount(): Number? = unwrap(this).getTaskCount()

      override fun taskDefinitionArn(): String = unwrap(this).getTaskDefinitionArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetEcsTaskParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEcsTaskParametersProperty):
          PipeTargetEcsTaskParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetEcsTaskParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEcsTaskParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEcsTaskParametersProperty
    }
  }

  public interface CloudwatchLogsLogDestinationProperty {
    public fun logGroupArn(): String? = unwrap(this).getLogGroupArn()

    @CdkDslMarker
    public interface Builder {
      public fun logGroupArn(logGroupArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.CloudwatchLogsLogDestinationProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.CloudwatchLogsLogDestinationProperty.builder()

      override fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.CloudwatchLogsLogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.CloudwatchLogsLogDestinationProperty,
    ) : CdkObject(cdkObject), CloudwatchLogsLogDestinationProperty {
      override fun logGroupArn(): String? = unwrap(this).getLogGroupArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudwatchLogsLogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.CloudwatchLogsLogDestinationProperty):
          CloudwatchLogsLogDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudwatchLogsLogDestinationProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.CloudwatchLogsLogDestinationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.CloudwatchLogsLogDestinationProperty
    }
  }

  public interface PlacementStrategyProperty {
    public fun `field`(): String? = unwrap(this).getField()

    public fun type(): String? = unwrap(this).getType()

    @CdkDslMarker
    public interface Builder {
      public fun `field`(`field`: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementStrategyProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementStrategyProperty.builder()

      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.PlacementStrategyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementStrategyProperty,
    ) : CdkObject(cdkObject), PlacementStrategyProperty {
      override fun `field`(): String? = unwrap(this).getField()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PlacementStrategyProperty):
          PlacementStrategyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementStrategyProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementStrategyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementStrategyProperty
    }
  }

  public interface PipeTargetRedshiftDataParametersProperty {
    public fun database(): String

    public fun dbUser(): String? = unwrap(this).getDbUser()

    public fun secretManagerArn(): String? = unwrap(this).getSecretManagerArn()

    public fun sqls(): List<String>

    public fun statementName(): String? = unwrap(this).getStatementName()

    public fun withEvent(): Any? = unwrap(this).getWithEvent()

    @CdkDslMarker
    public interface Builder {
      public fun database(database: String)

      public fun dbUser(dbUser: String)

      public fun secretManagerArn(secretManagerArn: String)

      public fun sqls(sqls: List<String>)

      public fun sqls(vararg sqls: String)

      public fun statementName(statementName: String)

      public fun withEvent(withEvent: Boolean)

      public fun withEvent(withEvent: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetRedshiftDataParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetRedshiftDataParametersProperty.builder()

      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      override fun dbUser(dbUser: String) {
        cdkBuilder.dbUser(dbUser)
      }

      override fun secretManagerArn(secretManagerArn: String) {
        cdkBuilder.secretManagerArn(secretManagerArn)
      }

      override fun sqls(sqls: List<String>) {
        cdkBuilder.sqls(sqls)
      }

      override fun sqls(vararg sqls: String): Unit = sqls(sqls.toList())

      override fun statementName(statementName: String) {
        cdkBuilder.statementName(statementName)
      }

      override fun withEvent(withEvent: Boolean) {
        cdkBuilder.withEvent(withEvent)
      }

      override fun withEvent(withEvent: IResolvable) {
        cdkBuilder.withEvent(withEvent.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetRedshiftDataParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetRedshiftDataParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetRedshiftDataParametersProperty {
      override fun database(): String = unwrap(this).getDatabase()

      override fun dbUser(): String? = unwrap(this).getDbUser()

      override fun secretManagerArn(): String? = unwrap(this).getSecretManagerArn()

      override fun sqls(): List<String> = unwrap(this).getSqls()

      override fun statementName(): String? = unwrap(this).getStatementName()

      override fun withEvent(): Any? = unwrap(this).getWithEvent()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetRedshiftDataParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetRedshiftDataParametersProperty):
          PipeTargetRedshiftDataParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetRedshiftDataParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetRedshiftDataParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetRedshiftDataParametersProperty
    }
  }

  public interface PipeSourceDynamoDBStreamParametersProperty {
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    public fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    public fun maximumRecordAgeInSeconds(): Number? = unwrap(this).getMaximumRecordAgeInSeconds()

    public fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

    public fun onPartialBatchItemFailure(): String? = unwrap(this).getOnPartialBatchItemFailure()

    public fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

    public fun startingPosition(): String

    @CdkDslMarker
    public interface Builder {
      public fun batchSize(batchSize: Number)

      public fun deadLetterConfig(deadLetterConfig: IResolvable)

      public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dacbe92b58839d5ce155c2659703438633ee0c027e107cab3c824896ba6d547e")
      public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit)

      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number)

      public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number)

      public fun maximumRetryAttempts(maximumRetryAttempts: Number)

      public fun onPartialBatchItemFailure(onPartialBatchItemFailure: String)

      public fun parallelizationFactor(parallelizationFactor: Number)

      public fun startingPosition(startingPosition: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceDynamoDBStreamParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceDynamoDBStreamParametersProperty.builder()

      override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      override fun deadLetterConfig(deadLetterConfig: IResolvable) {
        cdkBuilder.deadLetterConfig(deadLetterConfig.let(IResolvable::unwrap))
      }

      override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty) {
        cdkBuilder.deadLetterConfig(deadLetterConfig.let(DeadLetterConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dacbe92b58839d5ce155c2659703438633ee0c027e107cab3c824896ba6d547e")
      override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit):
          Unit = deadLetterConfig(DeadLetterConfigProperty(deadLetterConfig))

      override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      override fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
        cdkBuilder.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds)
      }

      override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
      }

      override fun onPartialBatchItemFailure(onPartialBatchItemFailure: String) {
        cdkBuilder.onPartialBatchItemFailure(onPartialBatchItemFailure)
      }

      override fun parallelizationFactor(parallelizationFactor: Number) {
        cdkBuilder.parallelizationFactor(parallelizationFactor)
      }

      override fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceDynamoDBStreamParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceDynamoDBStreamParametersProperty,
    ) : CdkObject(cdkObject), PipeSourceDynamoDBStreamParametersProperty {
      override fun batchSize(): Number? = unwrap(this).getBatchSize()

      override fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

      override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()

      override fun maximumRecordAgeInSeconds(): Number? =
          unwrap(this).getMaximumRecordAgeInSeconds()

      override fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

      override fun onPartialBatchItemFailure(): String? =
          unwrap(this).getOnPartialBatchItemFailure()

      override fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

      override fun startingPosition(): String = unwrap(this).getStartingPosition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeSourceDynamoDBStreamParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceDynamoDBStreamParametersProperty):
          PipeSourceDynamoDBStreamParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceDynamoDBStreamParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceDynamoDBStreamParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceDynamoDBStreamParametersProperty
    }
  }

  public interface PipeSourceSelfManagedKafkaParametersProperty {
    public fun additionalBootstrapServers(): List<String> =
        unwrap(this).getAdditionalBootstrapServers() ?: emptyList()

    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    public fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

    public fun credentials(): Any? = unwrap(this).getCredentials()

    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    public fun serverRootCaCertificate(): String? = unwrap(this).getServerRootCaCertificate()

    public fun startingPosition(): String? = unwrap(this).getStartingPosition()

    public fun topicName(): String

    public fun vpc(): Any? = unwrap(this).getVpc()

    @CdkDslMarker
    public interface Builder {
      public fun additionalBootstrapServers(additionalBootstrapServers: List<String>)

      public fun additionalBootstrapServers(vararg additionalBootstrapServers: String)

      public fun batchSize(batchSize: Number)

      public fun consumerGroupId(consumerGroupId: String)

      public fun credentials(credentials: IResolvable)

      public fun credentials(credentials: SelfManagedKafkaAccessConfigurationCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("608c4a62fa714f76e72b281f90139567a11defec495b6cac7eb485ac50212b54")
      public
          fun credentials(credentials: SelfManagedKafkaAccessConfigurationCredentialsProperty.Builder.() -> Unit)

      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number)

      public fun serverRootCaCertificate(serverRootCaCertificate: String)

      public fun startingPosition(startingPosition: String)

      public fun topicName(topicName: String)

      public fun vpc(vpc: IResolvable)

      public fun vpc(vpc: SelfManagedKafkaAccessConfigurationVpcProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3254ea480089933b424f01c7d30a3cfb1bafc805fd199f9254325c45c1a3b863")
      public fun vpc(vpc: SelfManagedKafkaAccessConfigurationVpcProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSelfManagedKafkaParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSelfManagedKafkaParametersProperty.builder()

      override fun additionalBootstrapServers(additionalBootstrapServers: List<String>) {
        cdkBuilder.additionalBootstrapServers(additionalBootstrapServers)
      }

      override fun additionalBootstrapServers(vararg additionalBootstrapServers: String): Unit =
          additionalBootstrapServers(additionalBootstrapServers.toList())

      override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      override fun consumerGroupId(consumerGroupId: String) {
        cdkBuilder.consumerGroupId(consumerGroupId)
      }

      override fun credentials(credentials: IResolvable) {
        cdkBuilder.credentials(credentials.let(IResolvable::unwrap))
      }

      override
          fun credentials(credentials: SelfManagedKafkaAccessConfigurationCredentialsProperty) {
        cdkBuilder.credentials(credentials.let(SelfManagedKafkaAccessConfigurationCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("608c4a62fa714f76e72b281f90139567a11defec495b6cac7eb485ac50212b54")
      override
          fun credentials(credentials: SelfManagedKafkaAccessConfigurationCredentialsProperty.Builder.() -> Unit):
          Unit = credentials(SelfManagedKafkaAccessConfigurationCredentialsProperty(credentials))

      override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      override fun serverRootCaCertificate(serverRootCaCertificate: String) {
        cdkBuilder.serverRootCaCertificate(serverRootCaCertificate)
      }

      override fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
      }

      override fun topicName(topicName: String) {
        cdkBuilder.topicName(topicName)
      }

      override fun vpc(vpc: IResolvable) {
        cdkBuilder.vpc(vpc.let(IResolvable::unwrap))
      }

      override fun vpc(vpc: SelfManagedKafkaAccessConfigurationVpcProperty) {
        cdkBuilder.vpc(vpc.let(SelfManagedKafkaAccessConfigurationVpcProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3254ea480089933b424f01c7d30a3cfb1bafc805fd199f9254325c45c1a3b863")
      override fun vpc(vpc: SelfManagedKafkaAccessConfigurationVpcProperty.Builder.() -> Unit): Unit
          = vpc(SelfManagedKafkaAccessConfigurationVpcProperty(vpc))

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSelfManagedKafkaParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSelfManagedKafkaParametersProperty,
    ) : CdkObject(cdkObject), PipeSourceSelfManagedKafkaParametersProperty {
      override fun additionalBootstrapServers(): List<String> =
          unwrap(this).getAdditionalBootstrapServers() ?: emptyList()

      override fun batchSize(): Number? = unwrap(this).getBatchSize()

      override fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

      override fun credentials(): Any? = unwrap(this).getCredentials()

      override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()

      override fun serverRootCaCertificate(): String? = unwrap(this).getServerRootCaCertificate()

      override fun startingPosition(): String? = unwrap(this).getStartingPosition()

      override fun topicName(): String = unwrap(this).getTopicName()

      override fun vpc(): Any? = unwrap(this).getVpc()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeSourceSelfManagedKafkaParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSelfManagedKafkaParametersProperty):
          PipeSourceSelfManagedKafkaParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceSelfManagedKafkaParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSelfManagedKafkaParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSelfManagedKafkaParametersProperty
    }
  }

  public interface PipeSourceKinesisStreamParametersProperty {
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    public fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    public fun maximumRecordAgeInSeconds(): Number? = unwrap(this).getMaximumRecordAgeInSeconds()

    public fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

    public fun onPartialBatchItemFailure(): String? = unwrap(this).getOnPartialBatchItemFailure()

    public fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

    public fun startingPosition(): String

    public fun startingPositionTimestamp(): String? = unwrap(this).getStartingPositionTimestamp()

    @CdkDslMarker
    public interface Builder {
      public fun batchSize(batchSize: Number)

      public fun deadLetterConfig(deadLetterConfig: IResolvable)

      public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("330804005739bdc46bcac3eab99716eee99837d9c978725c43669bb3a4b7adba")
      public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit)

      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number)

      public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number)

      public fun maximumRetryAttempts(maximumRetryAttempts: Number)

      public fun onPartialBatchItemFailure(onPartialBatchItemFailure: String)

      public fun parallelizationFactor(parallelizationFactor: Number)

      public fun startingPosition(startingPosition: String)

      public fun startingPositionTimestamp(startingPositionTimestamp: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceKinesisStreamParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceKinesisStreamParametersProperty.builder()

      override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      override fun deadLetterConfig(deadLetterConfig: IResolvable) {
        cdkBuilder.deadLetterConfig(deadLetterConfig.let(IResolvable::unwrap))
      }

      override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty) {
        cdkBuilder.deadLetterConfig(deadLetterConfig.let(DeadLetterConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("330804005739bdc46bcac3eab99716eee99837d9c978725c43669bb3a4b7adba")
      override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit):
          Unit = deadLetterConfig(DeadLetterConfigProperty(deadLetterConfig))

      override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      override fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
        cdkBuilder.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds)
      }

      override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
      }

      override fun onPartialBatchItemFailure(onPartialBatchItemFailure: String) {
        cdkBuilder.onPartialBatchItemFailure(onPartialBatchItemFailure)
      }

      override fun parallelizationFactor(parallelizationFactor: Number) {
        cdkBuilder.parallelizationFactor(parallelizationFactor)
      }

      override fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
      }

      override fun startingPositionTimestamp(startingPositionTimestamp: String) {
        cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceKinesisStreamParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceKinesisStreamParametersProperty,
    ) : CdkObject(cdkObject), PipeSourceKinesisStreamParametersProperty {
      override fun batchSize(): Number? = unwrap(this).getBatchSize()

      override fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

      override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()

      override fun maximumRecordAgeInSeconds(): Number? =
          unwrap(this).getMaximumRecordAgeInSeconds()

      override fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

      override fun onPartialBatchItemFailure(): String? =
          unwrap(this).getOnPartialBatchItemFailure()

      override fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

      override fun startingPosition(): String = unwrap(this).getStartingPosition()

      override fun startingPositionTimestamp(): String? =
          unwrap(this).getStartingPositionTimestamp()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeSourceKinesisStreamParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceKinesisStreamParametersProperty):
          PipeSourceKinesisStreamParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceKinesisStreamParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceKinesisStreamParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceKinesisStreamParametersProperty
    }
  }

  public interface FilterProperty {
    public fun pattern(): String? = unwrap(this).getPattern()

    @CdkDslMarker
    public interface Builder {
      public fun pattern(pattern: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.pipes.CfnPipe.FilterProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.FilterProperty.builder()

      override fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.FilterProperty,
    ) : CdkObject(cdkObject), FilterProperty {
      override fun pattern(): String? = unwrap(this).getPattern()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.FilterProperty):
          FilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.FilterProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.pipes.CfnPipe.FilterProperty
    }
  }

  public interface BatchArrayPropertiesProperty {
    public fun size(): Number? = unwrap(this).getSize()

    @CdkDslMarker
    public interface Builder {
      public fun size(size: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchArrayPropertiesProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.BatchArrayPropertiesProperty.builder()

      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.BatchArrayPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchArrayPropertiesProperty,
    ) : CdkObject(cdkObject), BatchArrayPropertiesProperty {
      override fun size(): Number? = unwrap(this).getSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchArrayPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.BatchArrayPropertiesProperty):
          BatchArrayPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchArrayPropertiesProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.BatchArrayPropertiesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.BatchArrayPropertiesProperty
    }
  }

  public interface PipeTargetStateMachineParametersProperty {
    public fun invocationType(): String? = unwrap(this).getInvocationType()

    @CdkDslMarker
    public interface Builder {
      public fun invocationType(invocationType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetStateMachineParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetStateMachineParametersProperty.builder()

      override fun invocationType(invocationType: String) {
        cdkBuilder.invocationType(invocationType)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetStateMachineParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetStateMachineParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetStateMachineParametersProperty {
      override fun invocationType(): String? = unwrap(this).getInvocationType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetStateMachineParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetStateMachineParametersProperty):
          PipeTargetStateMachineParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetStateMachineParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetStateMachineParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetStateMachineParametersProperty
    }
  }

  public interface EcsTaskOverrideProperty {
    public fun containerOverrides(): Any? = unwrap(this).getContainerOverrides()

    public fun cpu(): String? = unwrap(this).getCpu()

    public fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

    public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    public fun inferenceAcceleratorOverrides(): Any? =
        unwrap(this).getInferenceAcceleratorOverrides()

    public fun memory(): String? = unwrap(this).getMemory()

    public fun taskRoleArn(): String? = unwrap(this).getTaskRoleArn()

    @CdkDslMarker
    public interface Builder {
      public fun containerOverrides(containerOverrides: IResolvable)

      public fun containerOverrides(containerOverrides: List<Any>)

      public fun containerOverrides(vararg containerOverrides: Any)

      public fun cpu(cpu: String)

      public fun ephemeralStorage(ephemeralStorage: IResolvable)

      public fun ephemeralStorage(ephemeralStorage: EcsEphemeralStorageProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e66a1eef9e548aa48d8ef188ff03eefebd35f5fd3a521a9c9624ebde2ebe12b")
      public fun ephemeralStorage(ephemeralStorage: EcsEphemeralStorageProperty.Builder.() -> Unit)

      public fun executionRoleArn(executionRoleArn: String)

      public fun inferenceAcceleratorOverrides(inferenceAcceleratorOverrides: IResolvable)

      public fun inferenceAcceleratorOverrides(inferenceAcceleratorOverrides: List<Any>)

      public fun inferenceAcceleratorOverrides(vararg inferenceAcceleratorOverrides: Any)

      public fun memory(memory: String)

      public fun taskRoleArn(taskRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsTaskOverrideProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.EcsTaskOverrideProperty.builder()

      override fun containerOverrides(containerOverrides: IResolvable) {
        cdkBuilder.containerOverrides(containerOverrides.let(IResolvable::unwrap))
      }

      override fun containerOverrides(containerOverrides: List<Any>) {
        cdkBuilder.containerOverrides(containerOverrides)
      }

      override fun containerOverrides(vararg containerOverrides: Any): Unit =
          containerOverrides(containerOverrides.toList())

      override fun cpu(cpu: String) {
        cdkBuilder.cpu(cpu)
      }

      override fun ephemeralStorage(ephemeralStorage: IResolvable) {
        cdkBuilder.ephemeralStorage(ephemeralStorage.let(IResolvable::unwrap))
      }

      override fun ephemeralStorage(ephemeralStorage: EcsEphemeralStorageProperty) {
        cdkBuilder.ephemeralStorage(ephemeralStorage.let(EcsEphemeralStorageProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e66a1eef9e548aa48d8ef188ff03eefebd35f5fd3a521a9c9624ebde2ebe12b")
      override
          fun ephemeralStorage(ephemeralStorage: EcsEphemeralStorageProperty.Builder.() -> Unit):
          Unit = ephemeralStorage(EcsEphemeralStorageProperty(ephemeralStorage))

      override fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
      }

      override fun inferenceAcceleratorOverrides(inferenceAcceleratorOverrides: IResolvable) {
        cdkBuilder.inferenceAcceleratorOverrides(inferenceAcceleratorOverrides.let(IResolvable::unwrap))
      }

      override fun inferenceAcceleratorOverrides(inferenceAcceleratorOverrides: List<Any>) {
        cdkBuilder.inferenceAcceleratorOverrides(inferenceAcceleratorOverrides)
      }

      override fun inferenceAcceleratorOverrides(vararg inferenceAcceleratorOverrides: Any): Unit =
          inferenceAcceleratorOverrides(inferenceAcceleratorOverrides.toList())

      override fun memory(memory: String) {
        cdkBuilder.memory(memory)
      }

      override fun taskRoleArn(taskRoleArn: String) {
        cdkBuilder.taskRoleArn(taskRoleArn)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.EcsTaskOverrideProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsTaskOverrideProperty,
    ) : CdkObject(cdkObject), EcsTaskOverrideProperty {
      override fun containerOverrides(): Any? = unwrap(this).getContainerOverrides()

      override fun cpu(): String? = unwrap(this).getCpu()

      override fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

      override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

      override fun inferenceAcceleratorOverrides(): Any? =
          unwrap(this).getInferenceAcceleratorOverrides()

      override fun memory(): String? = unwrap(this).getMemory()

      override fun taskRoleArn(): String? = unwrap(this).getTaskRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EcsTaskOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsTaskOverrideProperty):
          EcsTaskOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsTaskOverrideProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.EcsTaskOverrideProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.EcsTaskOverrideProperty
    }
  }

  public interface PipeEnrichmentHttpParametersProperty {
    public fun headerParameters(): Any? = unwrap(this).getHeaderParameters()

    public fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
        emptyList()

    public fun queryStringParameters(): Any? = unwrap(this).getQueryStringParameters()

    @CdkDslMarker
    public interface Builder {
      public fun headerParameters(headerParameters: IResolvable)

      public fun headerParameters(headerParameters: Map<String, String>)

      public fun pathParameterValues(pathParameterValues: List<String>)

      public fun pathParameterValues(vararg pathParameterValues: String)

      public fun queryStringParameters(queryStringParameters: IResolvable)

      public fun queryStringParameters(queryStringParameters: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentHttpParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentHttpParametersProperty.builder()

      override fun headerParameters(headerParameters: IResolvable) {
        cdkBuilder.headerParameters(headerParameters.let(IResolvable::unwrap))
      }

      override fun headerParameters(headerParameters: Map<String, String>) {
        cdkBuilder.headerParameters(headerParameters)
      }

      override fun pathParameterValues(pathParameterValues: List<String>) {
        cdkBuilder.pathParameterValues(pathParameterValues)
      }

      override fun pathParameterValues(vararg pathParameterValues: String): Unit =
          pathParameterValues(pathParameterValues.toList())

      override fun queryStringParameters(queryStringParameters: IResolvable) {
        cdkBuilder.queryStringParameters(queryStringParameters.let(IResolvable::unwrap))
      }

      override fun queryStringParameters(queryStringParameters: Map<String, String>) {
        cdkBuilder.queryStringParameters(queryStringParameters)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentHttpParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentHttpParametersProperty,
    ) : CdkObject(cdkObject), PipeEnrichmentHttpParametersProperty {
      override fun headerParameters(): Any? = unwrap(this).getHeaderParameters()

      override fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
          emptyList()

      override fun queryStringParameters(): Any? = unwrap(this).getQueryStringParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeEnrichmentHttpParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentHttpParametersProperty):
          PipeEnrichmentHttpParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeEnrichmentHttpParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentHttpParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentHttpParametersProperty
    }
  }

  public interface MSKAccessCredentialsProperty {
    public fun clientCertificateTlsAuth(): String? = unwrap(this).getClientCertificateTlsAuth()

    public fun saslScram512Auth(): String? = unwrap(this).getSaslScram512Auth()

    @CdkDslMarker
    public interface Builder {
      public fun clientCertificateTlsAuth(clientCertificateTlsAuth: String)

      public fun saslScram512Auth(saslScram512Auth: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.MSKAccessCredentialsProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.MSKAccessCredentialsProperty.builder()

      override fun clientCertificateTlsAuth(clientCertificateTlsAuth: String) {
        cdkBuilder.clientCertificateTlsAuth(clientCertificateTlsAuth)
      }

      override fun saslScram512Auth(saslScram512Auth: String) {
        cdkBuilder.saslScram512Auth(saslScram512Auth)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.MSKAccessCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.MSKAccessCredentialsProperty,
    ) : CdkObject(cdkObject), MSKAccessCredentialsProperty {
      override fun clientCertificateTlsAuth(): String? = unwrap(this).getClientCertificateTlsAuth()

      override fun saslScram512Auth(): String? = unwrap(this).getSaslScram512Auth()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MSKAccessCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.MSKAccessCredentialsProperty):
          MSKAccessCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MSKAccessCredentialsProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.MSKAccessCredentialsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.MSKAccessCredentialsProperty
    }
  }

  public interface EcsResourceRequirementProperty {
    public fun type(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun type(type: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsResourceRequirementProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.EcsResourceRequirementProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.EcsResourceRequirementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsResourceRequirementProperty,
    ) : CdkObject(cdkObject), EcsResourceRequirementProperty {
      override fun type(): String = unwrap(this).getType()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EcsResourceRequirementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsResourceRequirementProperty):
          EcsResourceRequirementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsResourceRequirementProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.EcsResourceRequirementProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.EcsResourceRequirementProperty
    }
  }

  public interface PipeTargetCloudWatchLogsParametersProperty {
    public fun logStreamName(): String? = unwrap(this).getLogStreamName()

    public fun timestamp(): String? = unwrap(this).getTimestamp()

    @CdkDslMarker
    public interface Builder {
      public fun logStreamName(logStreamName: String)

      public fun timestamp(timestamp: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetCloudWatchLogsParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetCloudWatchLogsParametersProperty.builder()

      override fun logStreamName(logStreamName: String) {
        cdkBuilder.logStreamName(logStreamName)
      }

      override fun timestamp(timestamp: String) {
        cdkBuilder.timestamp(timestamp)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetCloudWatchLogsParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetCloudWatchLogsParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetCloudWatchLogsParametersProperty {
      override fun logStreamName(): String? = unwrap(this).getLogStreamName()

      override fun timestamp(): String? = unwrap(this).getTimestamp()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetCloudWatchLogsParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetCloudWatchLogsParametersProperty):
          PipeTargetCloudWatchLogsParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetCloudWatchLogsParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetCloudWatchLogsParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetCloudWatchLogsParametersProperty
    }
  }

  public interface NetworkConfigurationProperty {
    public fun awsvpcConfiguration(): Any? = unwrap(this).getAwsvpcConfiguration()

    @CdkDslMarker
    public interface Builder {
      public fun awsvpcConfiguration(awsvpcConfiguration: IResolvable)

      public fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("015d29762bcaa3c4aa1b0e65a21e6f6ddf4c669c51cab4b6634878489eedb96f")
      public
          fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.NetworkConfigurationProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.NetworkConfigurationProperty.builder()

      override fun awsvpcConfiguration(awsvpcConfiguration: IResolvable) {
        cdkBuilder.awsvpcConfiguration(awsvpcConfiguration.let(IResolvable::unwrap))
      }

      override fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty) {
        cdkBuilder.awsvpcConfiguration(awsvpcConfiguration.let(AwsVpcConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("015d29762bcaa3c4aa1b0e65a21e6f6ddf4c669c51cab4b6634878489eedb96f")
      override
          fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit):
          Unit = awsvpcConfiguration(AwsVpcConfigurationProperty(awsvpcConfiguration))

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.NetworkConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.NetworkConfigurationProperty,
    ) : CdkObject(cdkObject), NetworkConfigurationProperty {
      override fun awsvpcConfiguration(): Any? = unwrap(this).getAwsvpcConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.NetworkConfigurationProperty):
          NetworkConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.NetworkConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.NetworkConfigurationProperty
    }
  }
}
