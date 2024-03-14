package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CustomStateProps {
  /**
   * Amazon States Language (JSON-based) definition of the state.
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
   */
  public fun stateJson(): Map<String, Any>

  /**
   * A builder for [CustomStateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param stateJson Amazon States Language (JSON-based) definition of the state. 
     */
    public fun stateJson(stateJson: Map<String, Any>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.CustomStateProps.Builder =
        software.amazon.awscdk.services.stepfunctions.CustomStateProps.builder()

    /**
     * @param stateJson Amazon States Language (JSON-based) definition of the state. 
     */
    override fun stateJson(stateJson: Map<String, Any>) {
      cdkBuilder.stateJson(stateJson)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.CustomStateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.CustomStateProps,
  ) : CdkObject(cdkObject), CustomStateProps {
    /**
     * Amazon States Language (JSON-based) definition of the state.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
     */
    override fun stateJson(): Map<String, Any> = unwrap(this).getStateJson() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomStateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CustomStateProps):
        CustomStateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomStateProps):
        software.amazon.awscdk.services.stepfunctions.CustomStateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.CustomStateProps
  }
}
