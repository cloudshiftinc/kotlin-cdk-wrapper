package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.cloudassembly.schema.MissingContext
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Stack internal constructor(
  private val cdkObject: software.amazon.awscdk.Stack,
) : CloudshiftdevConstructsConstruct(cdkObject), ITaggable {
  public open fun account(): String = unwrap(this).getAccount()

  public open fun addDependency(target: Stack) {
    unwrap(this).addDependency(target.let(Stack::unwrap))
  }

  public open fun addDependency(target: Stack, reason: String) {
    unwrap(this).addDependency(target.let(Stack::unwrap), reason)
  }

  public open fun addMetadata(key: String, `value`: Any) {
    unwrap(this).addMetadata(key, `value`)
  }

  public open fun addTransform(transform: String) {
    unwrap(this).addTransform(transform)
  }

  public open fun artifactId(): String = unwrap(this).getArtifactId()

  public open fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
      emptyList()

  public open fun bundlingRequired(): Boolean = unwrap(this).getBundlingRequired()

  public open fun dependencies(): List<Stack> = unwrap(this).getDependencies().map(Stack::wrap)

  public open fun environment(): String = unwrap(this).getEnvironment()

  public open fun exportStringListValue(exportedValue: Any): List<String> =
      unwrap(this).exportStringListValue(exportedValue) ?: emptyList()

  public open fun exportStringListValue(exportedValue: Any, options: ExportValueOptions):
      List<String> = unwrap(this).exportStringListValue(exportedValue,
      options.let(ExportValueOptions::unwrap)) ?: emptyList()

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c97ef011f5520b889c1c1e0226ad73cc2af75d212f5dd7ed23287f54f3df3eca")
  public open fun exportStringListValue(exportedValue: Any,
      options: ExportValueOptions.Builder.() -> Unit): List<String> =
      exportStringListValue(exportedValue, ExportValueOptions(options))

  public open fun exportValue(exportedValue: Any): String = unwrap(this).exportValue(exportedValue)

  public open fun exportValue(exportedValue: Any, options: ExportValueOptions): String =
      unwrap(this).exportValue(exportedValue, options.let(ExportValueOptions::unwrap))

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("287d905a2cea921ded498a14ea31fc550739c7e59b46afb76bf782ac039ec978")
  public open fun exportValue(exportedValue: Any, options: ExportValueOptions.Builder.() -> Unit):
      String = exportValue(exportedValue, ExportValueOptions(options))

  public open fun formatArn(components: ArnComponents): String =
      unwrap(this).formatArn(components.let(ArnComponents::unwrap))

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5cb6ca9b4bf3e2cc29fe8b2c2a3330e4c5b57e53dcb25f4a8efdbca2514bf6b9")
  public open fun formatArn(components: ArnComponents.Builder.() -> Unit): String =
      formatArn(ArnComponents(components))

  public open fun logicalId(element: CfnElement): String =
      unwrap(this).getLogicalId(element.let(CfnElement::unwrap))

  public open fun nested(): Boolean = unwrap(this).getNested()

  public open fun nestedStackParent(): Stack? =
      unwrap(this).getNestedStackParent()?.let(Stack::wrap)

  public open fun nestedStackResource(): CfnResource? =
      unwrap(this).getNestedStackResource()?.let(CfnResource::wrap)

  public open fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?:
      emptyList()

  public open fun partition(): String = unwrap(this).getPartition()

  public open fun region(): String = unwrap(this).getRegion()

  public open fun regionalFact(factName: String): String = unwrap(this).regionalFact(factName)

  public open fun regionalFact(factName: String, defaultValue: String): String =
      unwrap(this).regionalFact(factName, defaultValue)

  public open fun renameLogicalId(oldId: String, newId: String) {
    unwrap(this).renameLogicalId(oldId, newId)
  }

  public open fun reportMissingContextKey(report: MissingContext) {
    unwrap(this).reportMissingContextKey(report.let(MissingContext::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eb28e30cb4a3bcd7cf10552329d3aac7f3a539ebb37a9dd82d6939a832826110")
  public open fun reportMissingContextKey(report: MissingContext.Builder.() -> Unit): Unit =
      reportMissingContextKey(MissingContext(report))

  public open fun resolve(obj: Any): Any = unwrap(this).resolve(obj)

  public open fun splitArn(arn: String, arnFormat: ArnFormat): ArnComponents =
      unwrap(this).splitArn(arn, arnFormat.let(ArnFormat::unwrap)).let(ArnComponents::wrap)

  public open fun stackId(): String = unwrap(this).getStackId()

  public open fun stackName(): String = unwrap(this).getStackName()

  public open fun synthesizer(): IStackSynthesizer =
      unwrap(this).getSynthesizer().let(IStackSynthesizer::wrap)

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun templateFile(): String = unwrap(this).getTemplateFile()

  public open fun templateOptions(): ITemplateOptions =
      unwrap(this).getTemplateOptions().let(ITemplateOptions::wrap)

  public open fun terminationProtection(): Boolean = unwrap(this).getTerminationProtection()

  public open fun terminationProtection(`value`: Boolean) {
    unwrap(this).setTerminationProtection(`value`)
  }

  public open fun toJsonString(obj: Any): String = unwrap(this).toJsonString(obj)

  public open fun toJsonString(obj: Any, space: Number): String = unwrap(this).toJsonString(obj,
      space)

  public open fun toYamlString(obj: Any): String = unwrap(this).toYamlString(obj)

  public open fun urlSuffix(): String = unwrap(this).getUrlSuffix()

  public interface Builder {
    public fun analyticsReporting(analyticsReporting: Boolean) {
    }

    public fun crossRegionReferences(crossRegionReferences: Boolean) {
    }

    public fun description(description: String) {
    }

    public fun env(env: Environment) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("257d47dfd98ff7d3e84d09d23159057e237273e6f9d86e0e1a4729cfbd62261d")
    public fun env(env: Environment.Builder.() -> Unit) {
    }

    public fun permissionsBoundary(permissionsBoundary: PermissionsBoundary) {
    }

    public fun stackName(stackName: String) {
    }

    public fun suppressTemplateIndentation(suppressTemplateIndentation: Boolean) {
    }

    public fun synthesizer(synthesizer: IStackSynthesizer) {
    }

    public fun tags(tags: Map<String, String>) {
    }

    public fun terminationProtection(terminationProtection: Boolean) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.Stack.Builder =
        software.amazon.awscdk.Stack.Builder.create(scope, id)

    public override fun analyticsReporting(analyticsReporting: Boolean) {
      cdkBuilder.analyticsReporting(analyticsReporting)
    }

    public override fun crossRegionReferences(crossRegionReferences: Boolean) {
      cdkBuilder.crossRegionReferences(crossRegionReferences)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun env(env: Environment) {
      cdkBuilder.env(env.let(Environment::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("257d47dfd98ff7d3e84d09d23159057e237273e6f9d86e0e1a4729cfbd62261d")
    public override fun env(env: Environment.Builder.() -> Unit): Unit = env(Environment(env))

    public override fun permissionsBoundary(permissionsBoundary: PermissionsBoundary) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(PermissionsBoundary::unwrap))
    }

    public override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    public override fun suppressTemplateIndentation(suppressTemplateIndentation: Boolean) {
      cdkBuilder.suppressTemplateIndentation(suppressTemplateIndentation)
    }

    public override fun synthesizer(synthesizer: IStackSynthesizer) {
      cdkBuilder.synthesizer(synthesizer.let(IStackSynthesizer::unwrap))
    }

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public override fun terminationProtection(terminationProtection: Boolean) {
      cdkBuilder.terminationProtection(terminationProtection)
    }

    public fun build(): software.amazon.awscdk.Stack = cdkBuilder.build()
  }

  public companion object {
    public open fun isStack(x: Any): Boolean = software.amazon.awscdk.Stack.isStack(x)

    public open fun of(construct: IConstruct): Stack =
        software.amazon.awscdk.Stack.of(construct.let(IConstruct::unwrap)).let(Stack::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Stack {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Stack(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.Stack): Stack = Stack(cdkObject)

    internal fun unwrap(wrapped: Stack): software.amazon.awscdk.Stack = wrapped.cdkObject
  }
}
