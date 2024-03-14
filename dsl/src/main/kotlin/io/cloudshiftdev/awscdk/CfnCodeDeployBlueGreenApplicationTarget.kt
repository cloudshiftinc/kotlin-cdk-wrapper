package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit

public interface CfnCodeDeployBlueGreenApplicationTarget {
  public fun logicalId(): String

  public fun type(): String

  public interface Builder {
    public fun logicalId(logicalId: String)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget.Builder =
        software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget.builder()

    override fun logicalId(logicalId: String) {
      cdkBuilder.logicalId(logicalId)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget,
  ) : CfnCodeDeployBlueGreenApplicationTarget {
    override fun logicalId(): String = unwrap(this).getLogicalId()

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
