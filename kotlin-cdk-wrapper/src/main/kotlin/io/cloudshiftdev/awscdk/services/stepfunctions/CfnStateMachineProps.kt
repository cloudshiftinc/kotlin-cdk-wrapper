@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

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

  public fun definitionS3Location(): Any? = unwrap(this).getDefinitionS3Location()

  public fun definitionString(): String? = unwrap(this).getDefinitionString()

  public fun definitionSubstitutions(): Any? = unwrap(this).getDefinitionSubstitutions()

  public fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

  public fun roleArn(): String

  public fun stateMachineName(): String? = unwrap(this).getStateMachineName()

  public fun stateMachineType(): String? = unwrap(this).getStateMachineType()

  public fun tags(): List<CfnStateMachine.TagsEntryProperty> =
      unwrap(this).getTags()?.map(CfnStateMachine.TagsEntryProperty::wrap) ?: emptyList()

  public fun tracingConfiguration(): Any? = unwrap(this).getTracingConfiguration()

  @CdkDslMarker
  public interface Builder {
    public fun definition(definition: Any)

    public fun definitionS3Location(definitionS3Location: IResolvable)

    public fun definitionS3Location(definitionS3Location: CfnStateMachine.S3LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ceca4784905d71e579346fca6fdc2394fc23355d49f7710b4fd69787588cdb3")
    public
        fun definitionS3Location(definitionS3Location: CfnStateMachine.S3LocationProperty.Builder.() -> Unit)

    public fun definitionString(definitionString: String)

    public fun definitionSubstitutions(definitionSubstitutions: IResolvable)

    public fun definitionSubstitutions(definitionSubstitutions: Map<String, String>)

    public fun loggingConfiguration(loggingConfiguration: IResolvable)

    public
        fun loggingConfiguration(loggingConfiguration: CfnStateMachine.LoggingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39ad5b48c2c230228bbf3e3453d76c2504b224388fb0654168c6a89ddc5d1c9e")
    public
        fun loggingConfiguration(loggingConfiguration: CfnStateMachine.LoggingConfigurationProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)

    public fun stateMachineName(stateMachineName: String)

    public fun stateMachineType(stateMachineType: String)

    public fun tags(tags: List<CfnStateMachine.TagsEntryProperty>)

    public fun tags(vararg tags: CfnStateMachine.TagsEntryProperty)

    public fun tracingConfiguration(tracingConfiguration: IResolvable)

    public
        fun tracingConfiguration(tracingConfiguration: CfnStateMachine.TracingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a22598fdcfa371b31092b87923be1fdc8c5eacb4cfdd5c49f08d189447235064")
    public
        fun tracingConfiguration(tracingConfiguration: CfnStateMachine.TracingConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps.Builder =
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps.builder()

    override fun definition(definition: Any) {
      cdkBuilder.definition(definition)
    }

    override fun definitionS3Location(definitionS3Location: IResolvable) {
      cdkBuilder.definitionS3Location(definitionS3Location.let(IResolvable::unwrap))
    }

    override fun definitionS3Location(definitionS3Location: CfnStateMachine.S3LocationProperty) {
      cdkBuilder.definitionS3Location(definitionS3Location.let(CfnStateMachine.S3LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ceca4784905d71e579346fca6fdc2394fc23355d49f7710b4fd69787588cdb3")
    override
        fun definitionS3Location(definitionS3Location: CfnStateMachine.S3LocationProperty.Builder.() -> Unit):
        Unit = definitionS3Location(CfnStateMachine.S3LocationProperty(definitionS3Location))

    override fun definitionString(definitionString: String) {
      cdkBuilder.definitionString(definitionString)
    }

    override fun definitionSubstitutions(definitionSubstitutions: IResolvable) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions.let(IResolvable::unwrap))
    }

    override fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions)
    }

    override fun loggingConfiguration(loggingConfiguration: IResolvable) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(IResolvable::unwrap))
    }

    override
        fun loggingConfiguration(loggingConfiguration: CfnStateMachine.LoggingConfigurationProperty) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(CfnStateMachine.LoggingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39ad5b48c2c230228bbf3e3453d76c2504b224388fb0654168c6a89ddc5d1c9e")
    override
        fun loggingConfiguration(loggingConfiguration: CfnStateMachine.LoggingConfigurationProperty.Builder.() -> Unit):
        Unit =
        loggingConfiguration(CfnStateMachine.LoggingConfigurationProperty(loggingConfiguration))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun stateMachineName(stateMachineName: String) {
      cdkBuilder.stateMachineName(stateMachineName)
    }

    override fun stateMachineType(stateMachineType: String) {
      cdkBuilder.stateMachineType(stateMachineType)
    }

    override fun tags(tags: List<CfnStateMachine.TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(CfnStateMachine.TagsEntryProperty::unwrap))
    }

    override fun tags(vararg tags: CfnStateMachine.TagsEntryProperty): Unit = tags(tags.toList())

    override fun tracingConfiguration(tracingConfiguration: IResolvable) {
      cdkBuilder.tracingConfiguration(tracingConfiguration.let(IResolvable::unwrap))
    }

    override
        fun tracingConfiguration(tracingConfiguration: CfnStateMachine.TracingConfigurationProperty) {
      cdkBuilder.tracingConfiguration(tracingConfiguration.let(CfnStateMachine.TracingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a22598fdcfa371b31092b87923be1fdc8c5eacb4cfdd5c49f08d189447235064")
    override
        fun tracingConfiguration(tracingConfiguration: CfnStateMachine.TracingConfigurationProperty.Builder.() -> Unit):
        Unit =
        tracingConfiguration(CfnStateMachine.TracingConfigurationProperty(tracingConfiguration))

    public fun build(): software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps,
  ) : CdkObject(cdkObject), CfnStateMachineProps {
    override fun definition(): Any? = unwrap(this).getDefinition()

    override fun definitionS3Location(): Any? = unwrap(this).getDefinitionS3Location()

    override fun definitionString(): String? = unwrap(this).getDefinitionString()

    override fun definitionSubstitutions(): Any? = unwrap(this).getDefinitionSubstitutions()

    override fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun stateMachineName(): String? = unwrap(this).getStateMachineName()

    override fun stateMachineType(): String? = unwrap(this).getStateMachineType()

    override fun tags(): List<CfnStateMachine.TagsEntryProperty> =
        unwrap(this).getTags()?.map(CfnStateMachine.TagsEntryProperty::wrap) ?: emptyList()

    override fun tracingConfiguration(): Any? = unwrap(this).getTracingConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStateMachineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps):
        CfnStateMachineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStateMachineProps):
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps
  }
}
