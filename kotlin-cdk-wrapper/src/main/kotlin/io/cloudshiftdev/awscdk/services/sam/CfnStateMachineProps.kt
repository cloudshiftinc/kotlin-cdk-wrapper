@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnStateMachineProps {
  public fun definition(): Any? = unwrap(this).getDefinition()

  public fun definitionSubstitutions(): Any? = unwrap(this).getDefinitionSubstitutions()

  public fun definitionUri(): Any? = unwrap(this).getDefinitionUri()

  public fun events(): Any? = unwrap(this).getEvents()

  public fun logging(): Any? = unwrap(this).getLogging()

  public fun name(): String? = unwrap(this).getName()

  public fun permissionsBoundaries(): String? = unwrap(this).getPermissionsBoundaries()

  public fun policies(): Any? = unwrap(this).getPolicies()

  public fun role(): String? = unwrap(this).getRole()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun tracing(): Any? = unwrap(this).getTracing()

  public fun type(): String? = unwrap(this).getType()

  @CdkDslMarker
  public interface Builder {
    public fun definition(definition: Any)

    public fun definitionSubstitutions(definitionSubstitutions: IResolvable)

    public fun definitionSubstitutions(definitionSubstitutions: Map<String, String>)

    public fun definitionUri(definitionUri: String)

    public fun definitionUri(definitionUri: IResolvable)

    public fun definitionUri(definitionUri: CfnStateMachine.S3LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3be3d9929004f3c8f180ee6e259b6b8368f8ebca14fe1ab0cad01b113ac2afc4")
    public fun definitionUri(definitionUri: CfnStateMachine.S3LocationProperty.Builder.() -> Unit)

    public fun events(events: IResolvable)

    public fun events(events: Map<String, Any>)

    public fun logging(logging: IResolvable)

    public fun logging(logging: CfnStateMachine.LoggingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6519bffeda588033351817b9339bf6717ec8436a60e0e7b9aee642665a2cb88")
    public fun logging(logging: CfnStateMachine.LoggingConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun permissionsBoundaries(permissionsBoundaries: String)

    public fun policies(policies: String)

    public fun policies(policies: IResolvable)

    public fun policies(policies: CfnStateMachine.IAMPolicyDocumentProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98b2e9acdc511c0d8aafbfdd4cd2459397cd08d033060a2dadb7393ad24121a5")
    public fun policies(policies: CfnStateMachine.IAMPolicyDocumentProperty.Builder.() -> Unit)

    public fun policies(policies: List<Any>)

    public fun policies(vararg policies: Any)

    public fun role(role: String)

    public fun tags(tags: Map<String, String>)

    public fun tracing(tracing: IResolvable)

    public fun tracing(tracing: CfnStateMachine.TracingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("479e439c6d6c54a40e605f7032d71a535fbded5ef0a6e3da0bde1f16bb57bbd8")
    public fun tracing(tracing: CfnStateMachine.TracingConfigurationProperty.Builder.() -> Unit)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnStateMachineProps.Builder =
        software.amazon.awscdk.services.sam.CfnStateMachineProps.builder()

    override fun definition(definition: Any) {
      cdkBuilder.definition(definition)
    }

    override fun definitionSubstitutions(definitionSubstitutions: IResolvable) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions.let(IResolvable::unwrap))
    }

    override fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions)
    }

    override fun definitionUri(definitionUri: String) {
      cdkBuilder.definitionUri(definitionUri)
    }

    override fun definitionUri(definitionUri: IResolvable) {
      cdkBuilder.definitionUri(definitionUri.let(IResolvable::unwrap))
    }

    override fun definitionUri(definitionUri: CfnStateMachine.S3LocationProperty) {
      cdkBuilder.definitionUri(definitionUri.let(CfnStateMachine.S3LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3be3d9929004f3c8f180ee6e259b6b8368f8ebca14fe1ab0cad01b113ac2afc4")
    override
        fun definitionUri(definitionUri: CfnStateMachine.S3LocationProperty.Builder.() -> Unit):
        Unit = definitionUri(CfnStateMachine.S3LocationProperty(definitionUri))

    override fun events(events: IResolvable) {
      cdkBuilder.events(events.let(IResolvable::unwrap))
    }

    override fun events(events: Map<String, Any>) {
      cdkBuilder.events(events)
    }

    override fun logging(logging: IResolvable) {
      cdkBuilder.logging(logging.let(IResolvable::unwrap))
    }

    override fun logging(logging: CfnStateMachine.LoggingConfigurationProperty) {
      cdkBuilder.logging(logging.let(CfnStateMachine.LoggingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6519bffeda588033351817b9339bf6717ec8436a60e0e7b9aee642665a2cb88")
    override fun logging(logging: CfnStateMachine.LoggingConfigurationProperty.Builder.() -> Unit):
        Unit = logging(CfnStateMachine.LoggingConfigurationProperty(logging))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun permissionsBoundaries(permissionsBoundaries: String) {
      cdkBuilder.permissionsBoundaries(permissionsBoundaries)
    }

    override fun policies(policies: String) {
      cdkBuilder.policies(policies)
    }

    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable::unwrap))
    }

    override fun policies(policies: CfnStateMachine.IAMPolicyDocumentProperty) {
      cdkBuilder.policies(policies.let(CfnStateMachine.IAMPolicyDocumentProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98b2e9acdc511c0d8aafbfdd4cd2459397cd08d033060a2dadb7393ad24121a5")
    override fun policies(policies: CfnStateMachine.IAMPolicyDocumentProperty.Builder.() -> Unit):
        Unit = policies(CfnStateMachine.IAMPolicyDocumentProperty(policies))

    override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies)
    }

    override fun policies(vararg policies: Any): Unit = policies(policies.toList())

    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun tracing(tracing: IResolvable) {
      cdkBuilder.tracing(tracing.let(IResolvable::unwrap))
    }

    override fun tracing(tracing: CfnStateMachine.TracingConfigurationProperty) {
      cdkBuilder.tracing(tracing.let(CfnStateMachine.TracingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("479e439c6d6c54a40e605f7032d71a535fbded5ef0a6e3da0bde1f16bb57bbd8")
    override fun tracing(tracing: CfnStateMachine.TracingConfigurationProperty.Builder.() -> Unit):
        Unit = tracing(CfnStateMachine.TracingConfigurationProperty(tracing))

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnStateMachineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sam.CfnStateMachineProps,
  ) : CdkObject(cdkObject), CfnStateMachineProps {
    override fun definition(): Any? = unwrap(this).getDefinition()

    override fun definitionSubstitutions(): Any? = unwrap(this).getDefinitionSubstitutions()

    override fun definitionUri(): Any? = unwrap(this).getDefinitionUri()

    override fun events(): Any? = unwrap(this).getEvents()

    override fun logging(): Any? = unwrap(this).getLogging()

    override fun name(): String? = unwrap(this).getName()

    override fun permissionsBoundaries(): String? = unwrap(this).getPermissionsBoundaries()

    override fun policies(): Any? = unwrap(this).getPolicies()

    override fun role(): String? = unwrap(this).getRole()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun tracing(): Any? = unwrap(this).getTracing()

    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStateMachineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachineProps):
        CfnStateMachineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStateMachineProps):
        software.amazon.awscdk.services.sam.CfnStateMachineProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sam.CfnStateMachineProps
  }
}
