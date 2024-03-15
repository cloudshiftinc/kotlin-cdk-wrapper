@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPipeline internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun artifactStore(): Any? = unwrap(this).getArtifactStore()

  public open fun artifactStore(`value`: IResolvable) {
    unwrap(this).setArtifactStore(`value`.let(IResolvable::unwrap))
  }

  public open fun artifactStore(`value`: ArtifactStoreProperty) {
    unwrap(this).setArtifactStore(`value`.let(ArtifactStoreProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1f3ad5a8ffa98a15e0168a3cb475339233d6b9ba22fccb25e0ad4d6e56249a5a")
  public open fun artifactStore(`value`: ArtifactStoreProperty.Builder.() -> Unit): Unit =
      artifactStore(ArtifactStoreProperty(`value`))

  public open fun artifactStores(): Any? = unwrap(this).getArtifactStores()

  public open fun artifactStores(`value`: IResolvable) {
    unwrap(this).setArtifactStores(`value`.let(IResolvable::unwrap))
  }

  public open fun artifactStores(__idx_ac66f0: List<Any>) {
    unwrap(this).setArtifactStores(__idx_ac66f0)
  }

  public open fun artifactStores(vararg __idx_ac66f0: Any): Unit =
      artifactStores(__idx_ac66f0.toList())

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrVersion(): String = unwrap(this).getAttrVersion()

  public open fun disableInboundStageTransitions(): Any? =
      unwrap(this).getDisableInboundStageTransitions()

  public open fun disableInboundStageTransitions(`value`: IResolvable) {
    unwrap(this).setDisableInboundStageTransitions(`value`.let(IResolvable::unwrap))
  }

  public open fun disableInboundStageTransitions(__idx_ac66f0: List<Any>) {
    unwrap(this).setDisableInboundStageTransitions(__idx_ac66f0)
  }

  public open fun disableInboundStageTransitions(vararg __idx_ac66f0: Any): Unit =
      disableInboundStageTransitions(__idx_ac66f0.toList())

  public open fun executionMode(): String? = unwrap(this).getExecutionMode()

  public open fun executionMode(`value`: String) {
    unwrap(this).setExecutionMode(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun pipelineType(): String? = unwrap(this).getPipelineType()

  public open fun pipelineType(`value`: String) {
    unwrap(this).setPipelineType(`value`)
  }

  public open fun restartExecutionOnUpdate(): Any? = unwrap(this).getRestartExecutionOnUpdate()

  public open fun restartExecutionOnUpdate(`value`: Boolean) {
    unwrap(this).setRestartExecutionOnUpdate(`value`)
  }

  public open fun restartExecutionOnUpdate(`value`: IResolvable) {
    unwrap(this).setRestartExecutionOnUpdate(`value`.let(IResolvable::unwrap))
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun stages(): Any = unwrap(this).getStages()

  public open fun stages(`value`: IResolvable) {
    unwrap(this).setStages(`value`.let(IResolvable::unwrap))
  }

  public open fun stages(__idx_ac66f0: List<Any>) {
    unwrap(this).setStages(__idx_ac66f0)
  }

  public open fun stages(vararg __idx_ac66f0: Any): Unit = stages(__idx_ac66f0.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun triggers(): Any? = unwrap(this).getTriggers()

  public open fun triggers(`value`: IResolvable) {
    unwrap(this).setTriggers(`value`.let(IResolvable::unwrap))
  }

  public open fun triggers(__idx_ac66f0: List<Any>) {
    unwrap(this).setTriggers(__idx_ac66f0)
  }

  public open fun triggers(vararg __idx_ac66f0: Any): Unit = triggers(__idx_ac66f0.toList())

  public open fun variables(): Any? = unwrap(this).getVariables()

  public open fun variables(`value`: IResolvable) {
    unwrap(this).setVariables(`value`.let(IResolvable::unwrap))
  }

  public open fun variables(__idx_ac66f0: List<Any>) {
    unwrap(this).setVariables(__idx_ac66f0)
  }

  public open fun variables(vararg __idx_ac66f0: Any): Unit = variables(__idx_ac66f0.toList())

  @CdkDslMarker
  public interface Builder {
    public fun artifactStore(artifactStore: IResolvable)

    public fun artifactStore(artifactStore: ArtifactStoreProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad238c725f05707649514fdc6656ca88d63083455d9ed90d441eac83027d20da")
    public fun artifactStore(artifactStore: ArtifactStoreProperty.Builder.() -> Unit)

    public fun artifactStores(artifactStores: IResolvable)

    public fun artifactStores(artifactStores: List<Any>)

    public fun artifactStores(vararg artifactStores: Any)

    public fun disableInboundStageTransitions(disableInboundStageTransitions: IResolvable)

    public fun disableInboundStageTransitions(disableInboundStageTransitions: List<Any>)

    public fun disableInboundStageTransitions(vararg disableInboundStageTransitions: Any)

    public fun executionMode(executionMode: String)

    public fun name(name: String)

    public fun pipelineType(pipelineType: String)

    public fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean)

    public fun restartExecutionOnUpdate(restartExecutionOnUpdate: IResolvable)

    public fun roleArn(roleArn: String)

    public fun stages(stages: IResolvable)

    public fun stages(stages: List<Any>)

    public fun stages(vararg stages: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun triggers(triggers: IResolvable)

    public fun triggers(triggers: List<Any>)

    public fun triggers(vararg triggers: Any)

    public fun variables(variables: IResolvable)

    public fun variables(variables: List<Any>)

    public fun variables(vararg variables: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.CfnPipeline.Builder =
        software.amazon.awscdk.services.codepipeline.CfnPipeline.Builder.create(scope, id)

    override fun artifactStore(artifactStore: IResolvable) {
      cdkBuilder.artifactStore(artifactStore.let(IResolvable::unwrap))
    }

    override fun artifactStore(artifactStore: ArtifactStoreProperty) {
      cdkBuilder.artifactStore(artifactStore.let(ArtifactStoreProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad238c725f05707649514fdc6656ca88d63083455d9ed90d441eac83027d20da")
    override fun artifactStore(artifactStore: ArtifactStoreProperty.Builder.() -> Unit): Unit =
        artifactStore(ArtifactStoreProperty(artifactStore))

    override fun artifactStores(artifactStores: IResolvable) {
      cdkBuilder.artifactStores(artifactStores.let(IResolvable::unwrap))
    }

    override fun artifactStores(artifactStores: List<Any>) {
      cdkBuilder.artifactStores(artifactStores)
    }

    override fun artifactStores(vararg artifactStores: Any): Unit =
        artifactStores(artifactStores.toList())

    override fun disableInboundStageTransitions(disableInboundStageTransitions: IResolvable) {
      cdkBuilder.disableInboundStageTransitions(disableInboundStageTransitions.let(IResolvable::unwrap))
    }

    override fun disableInboundStageTransitions(disableInboundStageTransitions: List<Any>) {
      cdkBuilder.disableInboundStageTransitions(disableInboundStageTransitions)
    }

    override fun disableInboundStageTransitions(vararg disableInboundStageTransitions: Any): Unit =
        disableInboundStageTransitions(disableInboundStageTransitions.toList())

    override fun executionMode(executionMode: String) {
      cdkBuilder.executionMode(executionMode)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun pipelineType(pipelineType: String) {
      cdkBuilder.pipelineType(pipelineType)
    }

    override fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean) {
      cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate)
    }

    override fun restartExecutionOnUpdate(restartExecutionOnUpdate: IResolvable) {
      cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate.let(IResolvable::unwrap))
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun stages(stages: IResolvable) {
      cdkBuilder.stages(stages.let(IResolvable::unwrap))
    }

    override fun stages(stages: List<Any>) {
      cdkBuilder.stages(stages)
    }

    override fun stages(vararg stages: Any): Unit = stages(stages.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun triggers(triggers: IResolvable) {
      cdkBuilder.triggers(triggers.let(IResolvable::unwrap))
    }

    override fun triggers(triggers: List<Any>) {
      cdkBuilder.triggers(triggers)
    }

    override fun triggers(vararg triggers: Any): Unit = triggers(triggers.toList())

    override fun variables(variables: IResolvable) {
      cdkBuilder.variables(variables.let(IResolvable::unwrap))
    }

    override fun variables(variables: List<Any>) {
      cdkBuilder.variables(variables)
    }

    override fun variables(vararg variables: Any): Unit = variables(variables.toList())

    public fun build(): software.amazon.awscdk.services.codepipeline.CfnPipeline =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codepipeline.CfnPipeline.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPipeline {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPipeline(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline):
        CfnPipeline = CfnPipeline(cdkObject)

    internal fun unwrap(wrapped: CfnPipeline):
        software.amazon.awscdk.services.codepipeline.CfnPipeline = wrapped.cdkObject
  }

  public interface OutputArtifactProperty {
    public fun name(): String

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty.Builder =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty,
    ) : CdkObject(cdkObject), OutputArtifactProperty {
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputArtifactProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty):
          OutputArtifactProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputArtifactProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty
    }
  }

  public interface GitTagFilterCriteriaProperty {
    public fun excludes(): List<String> = unwrap(this).getExcludes() ?: emptyList()

    public fun includes(): List<String> = unwrap(this).getIncludes() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun excludes(excludes: List<String>)

      public fun excludes(vararg excludes: String)

      public fun includes(includes: List<String>)

      public fun includes(vararg includes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitTagFilterCriteriaProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitTagFilterCriteriaProperty.builder()

      override fun excludes(excludes: List<String>) {
        cdkBuilder.excludes(excludes)
      }

      override fun excludes(vararg excludes: String): Unit = excludes(excludes.toList())

      override fun includes(includes: List<String>) {
        cdkBuilder.includes(includes)
      }

      override fun includes(vararg includes: String): Unit = includes(includes.toList())

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitTagFilterCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitTagFilterCriteriaProperty,
    ) : CdkObject(cdkObject), GitTagFilterCriteriaProperty {
      override fun excludes(): List<String> = unwrap(this).getExcludes() ?: emptyList()

      override fun includes(): List<String> = unwrap(this).getIncludes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GitTagFilterCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.GitTagFilterCriteriaProperty):
          GitTagFilterCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitTagFilterCriteriaProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitTagFilterCriteriaProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitTagFilterCriteriaProperty
    }
  }

  public interface StageTransitionProperty {
    public fun reason(): String

    public fun stageName(): String

    @CdkDslMarker
    public interface Builder {
      public fun reason(reason: String)

      public fun stageName(stageName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty.Builder =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty.builder()

      override fun reason(reason: String) {
        cdkBuilder.reason(reason)
      }

      override fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty,
    ) : CdkObject(cdkObject), StageTransitionProperty {
      override fun reason(): String = unwrap(this).getReason()

      override fun stageName(): String = unwrap(this).getStageName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StageTransitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty):
          StageTransitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StageTransitionProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty
    }
  }

  public interface GitConfigurationProperty {
    public fun pullRequest(): Any? = unwrap(this).getPullRequest()

    public fun push(): Any? = unwrap(this).getPush()

    public fun sourceActionName(): String

    @CdkDslMarker
    public interface Builder {
      public fun pullRequest(pullRequest: IResolvable)

      public fun pullRequest(pullRequest: List<Any>)

      public fun pullRequest(vararg pullRequest: Any)

      public fun push(push: IResolvable)

      public fun push(push: List<Any>)

      public fun push(vararg push: Any)

      public fun sourceActionName(sourceActionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitConfigurationProperty.builder()

      override fun pullRequest(pullRequest: IResolvable) {
        cdkBuilder.pullRequest(pullRequest.let(IResolvable::unwrap))
      }

      override fun pullRequest(pullRequest: List<Any>) {
        cdkBuilder.pullRequest(pullRequest)
      }

      override fun pullRequest(vararg pullRequest: Any): Unit = pullRequest(pullRequest.toList())

      override fun push(push: IResolvable) {
        cdkBuilder.push(push.let(IResolvable::unwrap))
      }

      override fun push(push: List<Any>) {
        cdkBuilder.push(push)
      }

      override fun push(vararg push: Any): Unit = push(push.toList())

      override fun sourceActionName(sourceActionName: String) {
        cdkBuilder.sourceActionName(sourceActionName)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitConfigurationProperty,
    ) : CdkObject(cdkObject), GitConfigurationProperty {
      override fun pullRequest(): Any? = unwrap(this).getPullRequest()

      override fun push(): Any? = unwrap(this).getPush()

      override fun sourceActionName(): String = unwrap(this).getSourceActionName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GitConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.GitConfigurationProperty):
          GitConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitConfigurationProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitConfigurationProperty
    }
  }

  public interface InputArtifactProperty {
    public fun name(): String

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty.Builder =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty,
    ) : CdkObject(cdkObject), InputArtifactProperty {
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputArtifactProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty):
          InputArtifactProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputArtifactProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty
    }
  }

  public interface PipelineTriggerDeclarationProperty {
    public fun gitConfiguration(): Any? = unwrap(this).getGitConfiguration()

    public fun providerType(): String

    @CdkDslMarker
    public interface Builder {
      public fun gitConfiguration(gitConfiguration: IResolvable)

      public fun gitConfiguration(gitConfiguration: GitConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51cb2b4e2bd58be2966f809a82c34fbd0a7affb16285727bcf432cf200ebb552")
      public fun gitConfiguration(gitConfiguration: GitConfigurationProperty.Builder.() -> Unit)

      public fun providerType(providerType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.PipelineTriggerDeclarationProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.PipelineTriggerDeclarationProperty.builder()

      override fun gitConfiguration(gitConfiguration: IResolvable) {
        cdkBuilder.gitConfiguration(gitConfiguration.let(IResolvable::unwrap))
      }

      override fun gitConfiguration(gitConfiguration: GitConfigurationProperty) {
        cdkBuilder.gitConfiguration(gitConfiguration.let(GitConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51cb2b4e2bd58be2966f809a82c34fbd0a7affb16285727bcf432cf200ebb552")
      override fun gitConfiguration(gitConfiguration: GitConfigurationProperty.Builder.() -> Unit):
          Unit = gitConfiguration(GitConfigurationProperty(gitConfiguration))

      override fun providerType(providerType: String) {
        cdkBuilder.providerType(providerType)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.PipelineTriggerDeclarationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.PipelineTriggerDeclarationProperty,
    ) : CdkObject(cdkObject), PipelineTriggerDeclarationProperty {
      override fun gitConfiguration(): Any? = unwrap(this).getGitConfiguration()

      override fun providerType(): String = unwrap(this).getProviderType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipelineTriggerDeclarationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.PipelineTriggerDeclarationProperty):
          PipelineTriggerDeclarationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipelineTriggerDeclarationProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.PipelineTriggerDeclarationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.PipelineTriggerDeclarationProperty
    }
  }

  public interface ActionTypeIdProperty {
    public fun category(): String

    public fun owner(): String

    public fun provider(): String

    public fun version(): String

    @CdkDslMarker
    public interface Builder {
      public fun category(category: String)

      public fun owner(owner: String)

      public fun provider(provider: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty.Builder =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty.builder()

      override fun category(category: String) {
        cdkBuilder.category(category)
      }

      override fun owner(owner: String) {
        cdkBuilder.owner(owner)
      }

      override fun provider(provider: String) {
        cdkBuilder.provider(provider)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty,
    ) : CdkObject(cdkObject), ActionTypeIdProperty {
      override fun category(): String = unwrap(this).getCategory()

      override fun owner(): String = unwrap(this).getOwner()

      override fun provider(): String = unwrap(this).getProvider()

      override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionTypeIdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty):
          ActionTypeIdProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionTypeIdProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty
    }
  }

  public interface GitPullRequestFilterProperty {
    public fun branches(): Any? = unwrap(this).getBranches()

    public fun events(): List<String> = unwrap(this).getEvents() ?: emptyList()

    public fun filePaths(): Any? = unwrap(this).getFilePaths()

    @CdkDslMarker
    public interface Builder {
      public fun branches(branches: IResolvable)

      public fun branches(branches: GitBranchFilterCriteriaProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65cb80379ab7e3aa99eb8e992bafd8046bf7c6d0e0107faeefd4040cc6127ac2")
      public fun branches(branches: GitBranchFilterCriteriaProperty.Builder.() -> Unit)

      public fun events(events: List<String>)

      public fun events(vararg events: String)

      public fun filePaths(filePaths: IResolvable)

      public fun filePaths(filePaths: GitFilePathFilterCriteriaProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6d5bf2731910e29c1c9b8d2d2b130cde8712135db84adebde46c8d9a907d77a6")
      public fun filePaths(filePaths: GitFilePathFilterCriteriaProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPullRequestFilterProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPullRequestFilterProperty.builder()

      override fun branches(branches: IResolvable) {
        cdkBuilder.branches(branches.let(IResolvable::unwrap))
      }

      override fun branches(branches: GitBranchFilterCriteriaProperty) {
        cdkBuilder.branches(branches.let(GitBranchFilterCriteriaProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65cb80379ab7e3aa99eb8e992bafd8046bf7c6d0e0107faeefd4040cc6127ac2")
      override fun branches(branches: GitBranchFilterCriteriaProperty.Builder.() -> Unit): Unit =
          branches(GitBranchFilterCriteriaProperty(branches))

      override fun events(events: List<String>) {
        cdkBuilder.events(events)
      }

      override fun events(vararg events: String): Unit = events(events.toList())

      override fun filePaths(filePaths: IResolvable) {
        cdkBuilder.filePaths(filePaths.let(IResolvable::unwrap))
      }

      override fun filePaths(filePaths: GitFilePathFilterCriteriaProperty) {
        cdkBuilder.filePaths(filePaths.let(GitFilePathFilterCriteriaProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6d5bf2731910e29c1c9b8d2d2b130cde8712135db84adebde46c8d9a907d77a6")
      override fun filePaths(filePaths: GitFilePathFilterCriteriaProperty.Builder.() -> Unit): Unit
          = filePaths(GitFilePathFilterCriteriaProperty(filePaths))

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPullRequestFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPullRequestFilterProperty,
    ) : CdkObject(cdkObject), GitPullRequestFilterProperty {
      override fun branches(): Any? = unwrap(this).getBranches()

      override fun events(): List<String> = unwrap(this).getEvents() ?: emptyList()

      override fun filePaths(): Any? = unwrap(this).getFilePaths()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GitPullRequestFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPullRequestFilterProperty):
          GitPullRequestFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitPullRequestFilterProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPullRequestFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPullRequestFilterProperty
    }
  }

  public interface ArtifactStoreMapProperty {
    public fun artifactStore(): Any

    public fun region(): String

    @CdkDslMarker
    public interface Builder {
      public fun artifactStore(artifactStore: IResolvable)

      public fun artifactStore(artifactStore: ArtifactStoreProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("517dbcd794991f0a62ad3ab845d445462d9a0ab84342eb2be9405c85439e27e4")
      public fun artifactStore(artifactStore: ArtifactStoreProperty.Builder.() -> Unit)

      public fun region(region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty.builder()

      override fun artifactStore(artifactStore: IResolvable) {
        cdkBuilder.artifactStore(artifactStore.let(IResolvable::unwrap))
      }

      override fun artifactStore(artifactStore: ArtifactStoreProperty) {
        cdkBuilder.artifactStore(artifactStore.let(ArtifactStoreProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("517dbcd794991f0a62ad3ab845d445462d9a0ab84342eb2be9405c85439e27e4")
      override fun artifactStore(artifactStore: ArtifactStoreProperty.Builder.() -> Unit): Unit =
          artifactStore(ArtifactStoreProperty(artifactStore))

      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty,
    ) : CdkObject(cdkObject), ArtifactStoreMapProperty {
      override fun artifactStore(): Any = unwrap(this).getArtifactStore()

      override fun region(): String = unwrap(this).getRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ArtifactStoreMapProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty):
          ArtifactStoreMapProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArtifactStoreMapProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty
    }
  }

  public interface ArtifactStoreProperty {
    public fun encryptionKey(): Any? = unwrap(this).getEncryptionKey()

    public fun location(): String

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun encryptionKey(encryptionKey: IResolvable)

      public fun encryptionKey(encryptionKey: EncryptionKeyProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6c3aa9f37ce17445bbdd9e12eadba2c8a2843a6a19324999d3445e9540089011")
      public fun encryptionKey(encryptionKey: EncryptionKeyProperty.Builder.() -> Unit)

      public fun location(location: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty.Builder =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty.builder()

      override fun encryptionKey(encryptionKey: IResolvable) {
        cdkBuilder.encryptionKey(encryptionKey.let(IResolvable::unwrap))
      }

      override fun encryptionKey(encryptionKey: EncryptionKeyProperty) {
        cdkBuilder.encryptionKey(encryptionKey.let(EncryptionKeyProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6c3aa9f37ce17445bbdd9e12eadba2c8a2843a6a19324999d3445e9540089011")
      override fun encryptionKey(encryptionKey: EncryptionKeyProperty.Builder.() -> Unit): Unit =
          encryptionKey(EncryptionKeyProperty(encryptionKey))

      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty,
    ) : CdkObject(cdkObject), ArtifactStoreProperty {
      override fun encryptionKey(): Any? = unwrap(this).getEncryptionKey()

      override fun location(): String = unwrap(this).getLocation()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ArtifactStoreProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty):
          ArtifactStoreProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArtifactStoreProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty
    }
  }

  public interface BlockerDeclarationProperty {
    public fun name(): String

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty,
    ) : CdkObject(cdkObject), BlockerDeclarationProperty {
      override fun name(): String = unwrap(this).getName()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BlockerDeclarationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty):
          BlockerDeclarationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlockerDeclarationProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty
    }
  }

  public interface StageDeclarationProperty {
    public fun actions(): Any

    public fun blockers(): Any? = unwrap(this).getBlockers()

    public fun name(): String

    @CdkDslMarker
    public interface Builder {
      public fun actions(actions: IResolvable)

      public fun actions(actions: List<Any>)

      public fun actions(vararg actions: Any)

      public fun blockers(blockers: IResolvable)

      public fun blockers(blockers: List<Any>)

      public fun blockers(vararg blockers: Any)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty.builder()

      override fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions.let(IResolvable::unwrap))
      }

      override fun actions(actions: List<Any>) {
        cdkBuilder.actions(actions)
      }

      override fun actions(vararg actions: Any): Unit = actions(actions.toList())

      override fun blockers(blockers: IResolvable) {
        cdkBuilder.blockers(blockers.let(IResolvable::unwrap))
      }

      override fun blockers(blockers: List<Any>) {
        cdkBuilder.blockers(blockers)
      }

      override fun blockers(vararg blockers: Any): Unit = blockers(blockers.toList())

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty,
    ) : CdkObject(cdkObject), StageDeclarationProperty {
      override fun actions(): Any = unwrap(this).getActions()

      override fun blockers(): Any? = unwrap(this).getBlockers()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StageDeclarationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty):
          StageDeclarationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StageDeclarationProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty
    }
  }

  public interface EncryptionKeyProperty {
    public fun id(): String

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun id(id: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty.Builder =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty.builder()

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty,
    ) : CdkObject(cdkObject), EncryptionKeyProperty {
      override fun id(): String = unwrap(this).getId()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionKeyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty):
          EncryptionKeyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionKeyProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty
    }
  }

  public interface ActionDeclarationProperty {
    public fun actionTypeId(): Any

    public fun configuration(): Any? = unwrap(this).getConfiguration()

    public fun inputArtifacts(): Any? = unwrap(this).getInputArtifacts()

    public fun name(): String

    public fun namespace(): String? = unwrap(this).getNamespace()

    public fun outputArtifacts(): Any? = unwrap(this).getOutputArtifacts()

    public fun region(): String? = unwrap(this).getRegion()

    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public fun runOrder(): Number? = unwrap(this).getRunOrder()

    @CdkDslMarker
    public interface Builder {
      public fun actionTypeId(actionTypeId: IResolvable)

      public fun actionTypeId(actionTypeId: ActionTypeIdProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2092269ef9990e90dc63fe85f23371fa1920f3a0164d9fae3941e98a5e81871")
      public fun actionTypeId(actionTypeId: ActionTypeIdProperty.Builder.() -> Unit)

      public fun configuration(configuration: Any)

      public fun inputArtifacts(inputArtifacts: IResolvable)

      public fun inputArtifacts(inputArtifacts: List<Any>)

      public fun inputArtifacts(vararg inputArtifacts: Any)

      public fun name(name: String)

      public fun namespace(namespace: String)

      public fun outputArtifacts(outputArtifacts: IResolvable)

      public fun outputArtifacts(outputArtifacts: List<Any>)

      public fun outputArtifacts(vararg outputArtifacts: Any)

      public fun region(region: String)

      public fun roleArn(roleArn: String)

      public fun runOrder(runOrder: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.builder()

      override fun actionTypeId(actionTypeId: IResolvable) {
        cdkBuilder.actionTypeId(actionTypeId.let(IResolvable::unwrap))
      }

      override fun actionTypeId(actionTypeId: ActionTypeIdProperty) {
        cdkBuilder.actionTypeId(actionTypeId.let(ActionTypeIdProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2092269ef9990e90dc63fe85f23371fa1920f3a0164d9fae3941e98a5e81871")
      override fun actionTypeId(actionTypeId: ActionTypeIdProperty.Builder.() -> Unit): Unit =
          actionTypeId(ActionTypeIdProperty(actionTypeId))

      override fun configuration(configuration: Any) {
        cdkBuilder.configuration(configuration)
      }

      override fun inputArtifacts(inputArtifacts: IResolvable) {
        cdkBuilder.inputArtifacts(inputArtifacts.let(IResolvable::unwrap))
      }

      override fun inputArtifacts(inputArtifacts: List<Any>) {
        cdkBuilder.inputArtifacts(inputArtifacts)
      }

      override fun inputArtifacts(vararg inputArtifacts: Any): Unit =
          inputArtifacts(inputArtifacts.toList())

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      override fun outputArtifacts(outputArtifacts: IResolvable) {
        cdkBuilder.outputArtifacts(outputArtifacts.let(IResolvable::unwrap))
      }

      override fun outputArtifacts(outputArtifacts: List<Any>) {
        cdkBuilder.outputArtifacts(outputArtifacts)
      }

      override fun outputArtifacts(vararg outputArtifacts: Any): Unit =
          outputArtifacts(outputArtifacts.toList())

      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty,
    ) : CdkObject(cdkObject), ActionDeclarationProperty {
      override fun actionTypeId(): Any = unwrap(this).getActionTypeId()

      override fun configuration(): Any? = unwrap(this).getConfiguration()

      override fun inputArtifacts(): Any? = unwrap(this).getInputArtifacts()

      override fun name(): String = unwrap(this).getName()

      override fun namespace(): String? = unwrap(this).getNamespace()

      override fun outputArtifacts(): Any? = unwrap(this).getOutputArtifacts()

      override fun region(): String? = unwrap(this).getRegion()

      override fun roleArn(): String? = unwrap(this).getRoleArn()

      override fun runOrder(): Number? = unwrap(this).getRunOrder()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionDeclarationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty):
          ActionDeclarationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionDeclarationProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty
    }
  }

  public interface GitPushFilterProperty {
    public fun branches(): Any? = unwrap(this).getBranches()

    public fun filePaths(): Any? = unwrap(this).getFilePaths()

    public fun tags(): GitTagFilterCriteriaProperty? =
        unwrap(this).getTags()?.let(GitTagFilterCriteriaProperty::wrap)

    @CdkDslMarker
    public interface Builder {
      public fun branches(branches: IResolvable)

      public fun branches(branches: GitBranchFilterCriteriaProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddc8d1d60a7c59dd92f9a3fd0b948aabdedb5c2a813e665f3425b043167ecfa2")
      public fun branches(branches: GitBranchFilterCriteriaProperty.Builder.() -> Unit)

      public fun filePaths(filePaths: IResolvable)

      public fun filePaths(filePaths: GitFilePathFilterCriteriaProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b1024504832e9322cad548b5af6f2fa09f8daa9df5ff97b0054f20f7aacb5e1")
      public fun filePaths(filePaths: GitFilePathFilterCriteriaProperty.Builder.() -> Unit)

      public fun tags(tags: GitTagFilterCriteriaProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44cf19020829a8aec87bbe2965c6e33acffa44c7665020066918b4a1aceb2cb9")
      public fun tags(tags: GitTagFilterCriteriaProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPushFilterProperty.Builder =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPushFilterProperty.builder()

      override fun branches(branches: IResolvable) {
        cdkBuilder.branches(branches.let(IResolvable::unwrap))
      }

      override fun branches(branches: GitBranchFilterCriteriaProperty) {
        cdkBuilder.branches(branches.let(GitBranchFilterCriteriaProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddc8d1d60a7c59dd92f9a3fd0b948aabdedb5c2a813e665f3425b043167ecfa2")
      override fun branches(branches: GitBranchFilterCriteriaProperty.Builder.() -> Unit): Unit =
          branches(GitBranchFilterCriteriaProperty(branches))

      override fun filePaths(filePaths: IResolvable) {
        cdkBuilder.filePaths(filePaths.let(IResolvable::unwrap))
      }

      override fun filePaths(filePaths: GitFilePathFilterCriteriaProperty) {
        cdkBuilder.filePaths(filePaths.let(GitFilePathFilterCriteriaProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b1024504832e9322cad548b5af6f2fa09f8daa9df5ff97b0054f20f7aacb5e1")
      override fun filePaths(filePaths: GitFilePathFilterCriteriaProperty.Builder.() -> Unit): Unit
          = filePaths(GitFilePathFilterCriteriaProperty(filePaths))

      override fun tags(tags: GitTagFilterCriteriaProperty) {
        cdkBuilder.tags(tags.let(GitTagFilterCriteriaProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44cf19020829a8aec87bbe2965c6e33acffa44c7665020066918b4a1aceb2cb9")
      override fun tags(tags: GitTagFilterCriteriaProperty.Builder.() -> Unit): Unit =
          tags(GitTagFilterCriteriaProperty(tags))

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPushFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPushFilterProperty,
    ) : CdkObject(cdkObject), GitPushFilterProperty {
      override fun branches(): Any? = unwrap(this).getBranches()

      override fun filePaths(): Any? = unwrap(this).getFilePaths()

      override fun tags(): GitTagFilterCriteriaProperty? =
          unwrap(this).getTags()?.let(GitTagFilterCriteriaProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GitPushFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPushFilterProperty):
          GitPushFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitPushFilterProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPushFilterProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPushFilterProperty
    }
  }

  public interface VariableDeclarationProperty {
    public fun defaultValue(): String? = unwrap(this).getDefaultValue()

    public fun description(): String? = unwrap(this).getDescription()

    public fun name(): String

    @CdkDslMarker
    public interface Builder {
      public fun defaultValue(defaultValue: String)

      public fun description(description: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.VariableDeclarationProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.VariableDeclarationProperty.builder()

      override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.VariableDeclarationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.VariableDeclarationProperty,
    ) : CdkObject(cdkObject), VariableDeclarationProperty {
      override fun defaultValue(): String? = unwrap(this).getDefaultValue()

      override fun description(): String? = unwrap(this).getDescription()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VariableDeclarationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.VariableDeclarationProperty):
          VariableDeclarationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VariableDeclarationProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.VariableDeclarationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.VariableDeclarationProperty
    }
  }

  public interface GitFilePathFilterCriteriaProperty {
    public fun excludes(): List<String> = unwrap(this).getExcludes() ?: emptyList()

    public fun includes(): List<String> = unwrap(this).getIncludes() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun excludes(excludes: List<String>)

      public fun excludes(vararg excludes: String)

      public fun includes(includes: List<String>)

      public fun includes(vararg includes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitFilePathFilterCriteriaProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitFilePathFilterCriteriaProperty.builder()

      override fun excludes(excludes: List<String>) {
        cdkBuilder.excludes(excludes)
      }

      override fun excludes(vararg excludes: String): Unit = excludes(excludes.toList())

      override fun includes(includes: List<String>) {
        cdkBuilder.includes(includes)
      }

      override fun includes(vararg includes: String): Unit = includes(includes.toList())

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitFilePathFilterCriteriaProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitFilePathFilterCriteriaProperty,
    ) : CdkObject(cdkObject), GitFilePathFilterCriteriaProperty {
      override fun excludes(): List<String> = unwrap(this).getExcludes() ?: emptyList()

      override fun includes(): List<String> = unwrap(this).getIncludes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GitFilePathFilterCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.GitFilePathFilterCriteriaProperty):
          GitFilePathFilterCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitFilePathFilterCriteriaProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitFilePathFilterCriteriaProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitFilePathFilterCriteriaProperty
    }
  }

  public interface GitBranchFilterCriteriaProperty {
    public fun excludes(): List<String> = unwrap(this).getExcludes() ?: emptyList()

    public fun includes(): List<String> = unwrap(this).getIncludes() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun excludes(excludes: List<String>)

      public fun excludes(vararg excludes: String)

      public fun includes(includes: List<String>)

      public fun includes(vararg includes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitBranchFilterCriteriaProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitBranchFilterCriteriaProperty.builder()

      override fun excludes(excludes: List<String>) {
        cdkBuilder.excludes(excludes)
      }

      override fun excludes(vararg excludes: String): Unit = excludes(excludes.toList())

      override fun includes(includes: List<String>) {
        cdkBuilder.includes(includes)
      }

      override fun includes(vararg includes: String): Unit = includes(includes.toList())

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitBranchFilterCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitBranchFilterCriteriaProperty,
    ) : CdkObject(cdkObject), GitBranchFilterCriteriaProperty {
      override fun excludes(): List<String> = unwrap(this).getExcludes() ?: emptyList()

      override fun includes(): List<String> = unwrap(this).getIncludes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GitBranchFilterCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.GitBranchFilterCriteriaProperty):
          GitBranchFilterCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitBranchFilterCriteriaProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitBranchFilterCriteriaProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitBranchFilterCriteriaProperty
    }
  }
}
