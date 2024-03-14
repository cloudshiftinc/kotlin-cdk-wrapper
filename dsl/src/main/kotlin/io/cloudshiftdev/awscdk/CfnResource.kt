package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResource internal constructor(
  private val cdkObject: software.amazon.awscdk.CfnResource,
) : CfnRefElement(cdkObject) {
  public open fun addDeletionOverride(path: String) {
    unwrap(this).addDeletionOverride(path)
  }

  public open fun addDependency(target: CfnResource) {
    unwrap(this).addDependency(target.let(CfnResource::unwrap))
  }

  @Deprecated(message = "deprecated in CDK")
  public open fun addDependsOn(target: CfnResource) {
    unwrap(this).addDependsOn(target.let(CfnResource::unwrap))
  }

  public open fun addMetadata(key: String, `value`: Any) {
    unwrap(this).addMetadata(key, `value`)
  }

  public open fun addOverride(path: String, `value`: Any) {
    unwrap(this).addOverride(path, `value`)
  }

  public open fun addPropertyDeletionOverride(propertyPath: String) {
    unwrap(this).addPropertyDeletionOverride(propertyPath)
  }

  public open fun addPropertyOverride(propertyPath: String, `value`: Any) {
    unwrap(this).addPropertyOverride(propertyPath, `value`)
  }

  public open fun applyRemovalPolicy() {
    unwrap(this).applyRemovalPolicy()
  }

  public open fun applyRemovalPolicy(policy: RemovalPolicy) {
    unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
  }

  public open fun applyRemovalPolicy(policy: RemovalPolicy, options: RemovalPolicyOptions) {
    unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap),
        options.let(RemovalPolicyOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a90918962feaeaebb71ba6d5cbff48f97056e79d196c85769b869dee2cf0abcb")
  public open fun applyRemovalPolicy(policy: RemovalPolicy,
      options: RemovalPolicyOptions.Builder.() -> Unit): Unit = applyRemovalPolicy(policy,
      RemovalPolicyOptions(options))

  public open fun att(attributeName: String): Reference =
      unwrap(this).getAtt(attributeName).let(Reference::wrap)

  public open fun att(attributeName: String, typeHint: ResolutionTypeHint): Reference =
      unwrap(this).getAtt(attributeName,
      typeHint.let(ResolutionTypeHint::unwrap)).let(Reference::wrap)

  public open fun cfnOptions(): ICfnResourceOptions =
      unwrap(this).getCfnOptions().let(ICfnResourceOptions::wrap)

  public open fun cfnResourceType(): String = unwrap(this).getCfnResourceType()

  public open fun metadata(key: String): Any = unwrap(this).getMetadata(key)

  public open fun obtainDependencies(): List<Any> = unwrap(this).obtainDependencies()

  public open fun obtainResourceDependencies(): List<CfnResource> =
      unwrap(this).obtainResourceDependencies().map(CfnResource::wrap)

  public open fun removeDependency(target: CfnResource) {
    unwrap(this).removeDependency(target.let(CfnResource::unwrap))
  }

  public open fun replaceDependency(target: CfnResource, newTarget: CfnResource) {
    unwrap(this).replaceDependency(target.let(CfnResource::unwrap),
        newTarget.let(CfnResource::unwrap))
  }

  public interface Builder {
    public fun properties(properties: Map<String, Any>)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnResource.Builder =
        software.amazon.awscdk.CfnResource.Builder.create(scope, id)

    override fun properties(properties: Map<String, Any>) {
      cdkBuilder.properties(properties)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.CfnResource = cdkBuilder.build()
  }

  public companion object {
    public open fun isCfnResource(x: Any): Boolean =
        software.amazon.awscdk.CfnResource.isCfnResource(x)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnResource): CfnResource =
        CfnResource(cdkObject)

    internal fun unwrap(wrapped: CfnResource): software.amazon.awscdk.CfnResource =
        wrapped.cdkObject
  }
}
