@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface DefinitionConfig {
  public fun definition(): Any? = unwrap(this).getDefinition()

  public fun definitionS3Location(): CfnStateMachine.S3LocationProperty? =
      unwrap(this).getDefinitionS3Location()?.let(CfnStateMachine.S3LocationProperty::wrap)

  public fun definitionString(): String? = unwrap(this).getDefinitionString()

  @CdkDslMarker
  public interface Builder {
    public fun definition(definition: Any)

    public fun definitionS3Location(definitionS3Location: CfnStateMachine.S3LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("74b8aebc03e1dd04aa46dcdfe896ceb0e50df80fdd74079e76fec8d00025254b")
    public
        fun definitionS3Location(definitionS3Location: CfnStateMachine.S3LocationProperty.Builder.() -> Unit)

    public fun definitionString(definitionString: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.DefinitionConfig.Builder =
        software.amazon.awscdk.services.stepfunctions.DefinitionConfig.builder()

    override fun definition(definition: Any) {
      cdkBuilder.definition(definition)
    }

    override fun definitionS3Location(definitionS3Location: CfnStateMachine.S3LocationProperty) {
      cdkBuilder.definitionS3Location(definitionS3Location.let(CfnStateMachine.S3LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("74b8aebc03e1dd04aa46dcdfe896ceb0e50df80fdd74079e76fec8d00025254b")
    override
        fun definitionS3Location(definitionS3Location: CfnStateMachine.S3LocationProperty.Builder.() -> Unit):
        Unit = definitionS3Location(CfnStateMachine.S3LocationProperty(definitionS3Location))

    override fun definitionString(definitionString: String) {
      cdkBuilder.definitionString(definitionString)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.DefinitionConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.DefinitionConfig,
  ) : CdkObject(cdkObject), DefinitionConfig {
    override fun definition(): Any? = unwrap(this).getDefinition()

    override fun definitionS3Location(): CfnStateMachine.S3LocationProperty? =
        unwrap(this).getDefinitionS3Location()?.let(CfnStateMachine.S3LocationProperty::wrap)

    override fun definitionString(): String? = unwrap(this).getDefinitionString()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DefinitionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.DefinitionConfig):
        DefinitionConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DefinitionConfig):
        software.amazon.awscdk.services.stepfunctions.DefinitionConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.DefinitionConfig
  }
}
