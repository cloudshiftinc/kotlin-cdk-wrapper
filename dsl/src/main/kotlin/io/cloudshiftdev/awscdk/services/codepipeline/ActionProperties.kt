package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ActionProperties {
  public fun account(): String? = unwrap(this).getAccount()

  public fun actionName(): String

  public fun artifactBounds(): ActionArtifactBounds

  public fun category(): ActionCategory

  public fun inputs(): List<Artifact> = unwrap(this).getInputs()?.map(Artifact::wrap) ?: emptyList()

  public fun outputs(): List<Artifact> = unwrap(this).getOutputs()?.map(Artifact::wrap) ?:
      emptyList()

  public fun owner(): String? = unwrap(this).getOwner()

  public fun provider(): String

  public fun region(): String? = unwrap(this).getRegion()

  public fun resource(): IResource? = unwrap(this).getResource()?.let(IResource::wrap)

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun runOrder(): Number? = unwrap(this).getRunOrder()

  public fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()

  public fun version(): String? = unwrap(this).getVersion()

  public interface Builder {
    public fun account(account: String)

    public fun actionName(actionName: String)

    public fun artifactBounds(artifactBounds: ActionArtifactBounds)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6099b65dcf2f09bb493af592c9431d5733bcd10b0d137c52e34d7d769ffa62ff")
    public fun artifactBounds(artifactBounds: ActionArtifactBounds.Builder.() -> Unit)

    public fun category(category: ActionCategory)

    public fun inputs(inputs: List<Artifact>)

    public fun outputs(outputs: List<Artifact>)

    public fun owner(owner: String)

    public fun provider(provider: String)

    public fun region(region: String)

    public fun resource(resource: IResource)

    public fun role(role: IRole)

    public fun runOrder(runOrder: Number)

    public fun variablesNamespace(variablesNamespace: String)

    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.ActionProperties.Builder =
        software.amazon.awscdk.services.codepipeline.ActionProperties.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun artifactBounds(artifactBounds: ActionArtifactBounds) {
      cdkBuilder.artifactBounds(artifactBounds.let(ActionArtifactBounds::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6099b65dcf2f09bb493af592c9431d5733bcd10b0d137c52e34d7d769ffa62ff")
    override fun artifactBounds(artifactBounds: ActionArtifactBounds.Builder.() -> Unit): Unit =
        artifactBounds(ActionArtifactBounds(artifactBounds))

    override fun category(category: ActionCategory) {
      cdkBuilder.category(category.let(ActionCategory::unwrap))
    }

    override fun inputs(inputs: List<Artifact>) {
      cdkBuilder.inputs(inputs.map(Artifact::unwrap))
    }

    override fun outputs(outputs: List<Artifact>) {
      cdkBuilder.outputs(outputs.map(Artifact::unwrap))
    }

    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    override fun provider(provider: String) {
      cdkBuilder.provider(provider)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun resource(resource: IResource) {
      cdkBuilder.resource(resource.let(IResource::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.ActionProperties =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codepipeline.ActionProperties,
  ) : ActionProperties {
    override fun account(): String? = unwrap(this).getAccount()

    override fun actionName(): String = unwrap(this).getActionName()

    override fun artifactBounds(): ActionArtifactBounds =
        unwrap(this).getArtifactBounds().let(ActionArtifactBounds::wrap)

    override fun category(): ActionCategory = unwrap(this).getCategory().let(ActionCategory::wrap)

    override fun inputs(): List<Artifact> = unwrap(this).getInputs()?.map(Artifact::wrap) ?:
        emptyList()

    override fun outputs(): List<Artifact> = unwrap(this).getOutputs()?.map(Artifact::wrap) ?:
        emptyList()

    override fun owner(): String? = unwrap(this).getOwner()

    override fun provider(): String = unwrap(this).getProvider()

    override fun region(): String? = unwrap(this).getRegion()

    override fun resource(): IResource? = unwrap(this).getResource()?.let(IResource::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()

    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperties {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.ActionProperties):
        ActionProperties = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ActionProperties):
        software.amazon.awscdk.services.codepipeline.ActionProperties = (wrapped as
        Wrapper).cdkObject
  }
}
