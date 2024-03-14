package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface DefinitionConfig {
  /**
   *
   */
  public fun definition(): Any? = unwrap(this).getDefinition()

  /**
   *
   */
  public fun definitionS3Location(): CfnStateMachine.S3LocationProperty? =
      unwrap(this).getDefinitionS3Location()?.let(CfnStateMachine.S3LocationProperty::wrap)

  /**
   *
   */
  public fun definitionString(): String? = unwrap(this).getDefinitionString()

  /**
   * A builder for [DefinitionConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param definition the value to be set.
     */
    public fun definition(definition: Any)

    /**
     * @param definitionS3Location the value to be set.
     */
    public fun definitionS3Location(definitionS3Location: CfnStateMachine.S3LocationProperty)

    /**
     * @param definitionS3Location the value to be set.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("74b8aebc03e1dd04aa46dcdfe896ceb0e50df80fdd74079e76fec8d00025254b")
    public
        fun definitionS3Location(definitionS3Location: CfnStateMachine.S3LocationProperty.Builder.() -> Unit)

    /**
     * @param definitionString the value to be set.
     */
    public fun definitionString(definitionString: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.DefinitionConfig.Builder =
        software.amazon.awscdk.services.stepfunctions.DefinitionConfig.builder()

    /**
     * @param definition the value to be set.
     */
    override fun definition(definition: Any) {
      cdkBuilder.definition(definition)
    }

    /**
     * @param definitionS3Location the value to be set.
     */
    override fun definitionS3Location(definitionS3Location: CfnStateMachine.S3LocationProperty) {
      cdkBuilder.definitionS3Location(definitionS3Location.let(CfnStateMachine.S3LocationProperty::unwrap))
    }

    /**
     * @param definitionS3Location the value to be set.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("74b8aebc03e1dd04aa46dcdfe896ceb0e50df80fdd74079e76fec8d00025254b")
    override
        fun definitionS3Location(definitionS3Location: CfnStateMachine.S3LocationProperty.Builder.() -> Unit):
        Unit = definitionS3Location(CfnStateMachine.S3LocationProperty(definitionS3Location))

    /**
     * @param definitionString the value to be set.
     */
    override fun definitionString(definitionString: String) {
      cdkBuilder.definitionString(definitionString)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.DefinitionConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.DefinitionConfig,
  ) : CdkObject(cdkObject), DefinitionConfig {
    /**
     *
     */
    override fun definition(): Any? = unwrap(this).getDefinition()

    /**
     *
     */
    override fun definitionS3Location(): CfnStateMachine.S3LocationProperty? =
        unwrap(this).getDefinitionS3Location()?.let(CfnStateMachine.S3LocationProperty::wrap)

    /**
     *
     */
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
