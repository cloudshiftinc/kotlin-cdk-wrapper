package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnCodeDeployBlueGreenApplicationTarget {
  /**
   * The logical id of the target resource.
   */
  public fun logicalId(): String

  /**
   * The resource type of the target being deployed.
   *
   * Right now, the only allowed value is 'AWS::ECS::Service'.
   */
  public fun type(): String

  /**
   * A builder for [CfnCodeDeployBlueGreenApplicationTarget]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param logicalId The logical id of the target resource. 
     */
    public fun logicalId(logicalId: String)

    /**
     * @param type The resource type of the target being deployed. 
     * Right now, the only allowed value is 'AWS::ECS::Service'.
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget.Builder =
        software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget.builder()

    /**
     * @param logicalId The logical id of the target resource. 
     */
    override fun logicalId(logicalId: String) {
      cdkBuilder.logicalId(logicalId)
    }

    /**
     * @param type The resource type of the target being deployed. 
     * Right now, the only allowed value is 'AWS::ECS::Service'.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget,
  ) : CfnCodeDeployBlueGreenApplicationTarget {
    /**
     * The logical id of the target resource.
     */
    override fun logicalId(): String = unwrap(this).getLogicalId()

    /**
     * The resource type of the target being deployed.
     *
     * Right now, the only allowed value is 'AWS::ECS::Service'.
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnCodeDeployBlueGreenApplicationTarget {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget):
        CfnCodeDeployBlueGreenApplicationTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCodeDeployBlueGreenApplicationTarget):
        software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget = (wrapped as
        Wrapper).cdkObject
  }
}
