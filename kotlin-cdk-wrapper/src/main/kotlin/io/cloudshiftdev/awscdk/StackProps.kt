@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface StackProps {
  public fun analyticsReporting(): Boolean? = unwrap(this).getAnalyticsReporting()

  public fun crossRegionReferences(): Boolean? = unwrap(this).getCrossRegionReferences()

  public fun description(): String? = unwrap(this).getDescription()

  public fun env(): Environment? = unwrap(this).getEnv()?.let(Environment::wrap)

  public fun permissionsBoundary(): PermissionsBoundary? =
      unwrap(this).getPermissionsBoundary()?.let(PermissionsBoundary::wrap)

  public fun stackName(): String? = unwrap(this).getStackName()

  public fun suppressTemplateIndentation(): Boolean? = unwrap(this).getSuppressTemplateIndentation()

  public fun synthesizer(): IStackSynthesizer? =
      unwrap(this).getSynthesizer()?.let(IStackSynthesizer::wrap)

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun terminationProtection(): Boolean? = unwrap(this).getTerminationProtection()

  @CdkDslMarker
  public interface Builder {
    public fun analyticsReporting(analyticsReporting: Boolean)

    public fun crossRegionReferences(crossRegionReferences: Boolean)

    public fun description(description: String)

    public fun env(env: Environment)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06595668ad8f96a9bf80be18cf5bc6ae0f52849715a13f6b3ed94434fd56c74f")
    public fun env(env: Environment.Builder.() -> Unit)

    public fun permissionsBoundary(permissionsBoundary: PermissionsBoundary)

    public fun stackName(stackName: String)

    public fun suppressTemplateIndentation(suppressTemplateIndentation: Boolean)

    public fun synthesizer(synthesizer: IStackSynthesizer)

    public fun tags(tags: Map<String, String>)

    public fun terminationProtection(terminationProtection: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.StackProps.Builder =
        software.amazon.awscdk.StackProps.builder()

    override fun analyticsReporting(analyticsReporting: Boolean) {
      cdkBuilder.analyticsReporting(analyticsReporting)
    }

    override fun crossRegionReferences(crossRegionReferences: Boolean) {
      cdkBuilder.crossRegionReferences(crossRegionReferences)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun env(env: Environment) {
      cdkBuilder.env(env.let(Environment::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06595668ad8f96a9bf80be18cf5bc6ae0f52849715a13f6b3ed94434fd56c74f")
    override fun env(env: Environment.Builder.() -> Unit): Unit = env(Environment(env))

    override fun permissionsBoundary(permissionsBoundary: PermissionsBoundary) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(PermissionsBoundary::unwrap))
    }

    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    override fun suppressTemplateIndentation(suppressTemplateIndentation: Boolean) {
      cdkBuilder.suppressTemplateIndentation(suppressTemplateIndentation)
    }

    override fun synthesizer(synthesizer: IStackSynthesizer) {
      cdkBuilder.synthesizer(synthesizer.let(IStackSynthesizer::unwrap))
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun terminationProtection(terminationProtection: Boolean) {
      cdkBuilder.terminationProtection(terminationProtection)
    }

    public fun build(): software.amazon.awscdk.StackProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.StackProps,
  ) : CdkObject(cdkObject), StackProps {
    override fun analyticsReporting(): Boolean? = unwrap(this).getAnalyticsReporting()

    override fun crossRegionReferences(): Boolean? = unwrap(this).getCrossRegionReferences()

    override fun description(): String? = unwrap(this).getDescription()

    override fun env(): Environment? = unwrap(this).getEnv()?.let(Environment::wrap)

    override fun permissionsBoundary(): PermissionsBoundary? =
        unwrap(this).getPermissionsBoundary()?.let(PermissionsBoundary::wrap)

    override fun stackName(): String? = unwrap(this).getStackName()

    override fun suppressTemplateIndentation(): Boolean? =
        unwrap(this).getSuppressTemplateIndentation()

    override fun synthesizer(): IStackSynthesizer? =
        unwrap(this).getSynthesizer()?.let(IStackSynthesizer::wrap)

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun terminationProtection(): Boolean? = unwrap(this).getTerminationProtection()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StackProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.StackProps): StackProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StackProps): software.amazon.awscdk.StackProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.StackProps
  }
}
