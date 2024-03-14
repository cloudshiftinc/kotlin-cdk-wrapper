package io.cloudshiftdev.awscdk

import kotlin.Number
import kotlin.Unit

public interface CfnCodeDeployBlueGreenAdditionalOptions {
  public fun terminationWaitTimeInMinutes(): Number? =
      unwrap(this).getTerminationWaitTimeInMinutes()

  public interface Builder {
    public fun terminationWaitTimeInMinutes(terminationWaitTimeInMinutes: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions.Builder =
        software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions.builder()

    override fun terminationWaitTimeInMinutes(terminationWaitTimeInMinutes: Number) {
      cdkBuilder.terminationWaitTimeInMinutes(terminationWaitTimeInMinutes)
    }

    public fun build(): software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions,
  ) : CfnCodeDeployBlueGreenAdditionalOptions {
    override fun terminationWaitTimeInMinutes(): Number? =
        unwrap(this).getTerminationWaitTimeInMinutes()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnCodeDeployBlueGreenAdditionalOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions):
        CfnCodeDeployBlueGreenAdditionalOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCodeDeployBlueGreenAdditionalOptions):
        software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions = (wrapped as
        Wrapper).cdkObject
  }
}
