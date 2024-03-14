package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCodeDeployBlueGreenEcsAttributes {
  public fun taskDefinitions(): List<String>

  public fun taskSets(): List<String>

  public fun trafficRouting(): CfnTrafficRouting

  public interface Builder {
    public fun taskDefinitions(taskDefinitions: List<String>) {
    }

    public fun taskSets(taskSets: List<String>) {
    }

    public fun trafficRouting(trafficRouting: CfnTrafficRouting) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("651e074c6f5b0d634fb60252bb57c85f72cc306b0a4d5d9e42b254a81e7cd986")
    public fun trafficRouting(trafficRouting: CfnTrafficRouting.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes.Builder =
        software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes.builder()

    public override fun taskDefinitions(taskDefinitions: List<String>) {
      cdkBuilder.taskDefinitions(taskDefinitions)
    }

    public override fun taskSets(taskSets: List<String>) {
      cdkBuilder.taskSets(taskSets)
    }

    public override fun trafficRouting(trafficRouting: CfnTrafficRouting) {
      cdkBuilder.trafficRouting(trafficRouting.let(CfnTrafficRouting::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("651e074c6f5b0d634fb60252bb57c85f72cc306b0a4d5d9e42b254a81e7cd986")
    public override fun trafficRouting(trafficRouting: CfnTrafficRouting.Builder.() -> Unit): Unit =
        trafficRouting(CfnTrafficRouting(trafficRouting))

    public fun build(): software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes,
  ) : CfnCodeDeployBlueGreenEcsAttributes {
    public override fun taskDefinitions(): List<String> = unwrap(this).getTaskDefinitions() ?:
        emptyList()

    public override fun taskSets(): List<String> = unwrap(this).getTaskSets() ?: emptyList()

    public override fun trafficRouting(): CfnTrafficRouting =
        unwrap(this).getTrafficRouting().let(CfnTrafficRouting::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnCodeDeployBlueGreenEcsAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes):
        CfnCodeDeployBlueGreenEcsAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCodeDeployBlueGreenEcsAttributes):
        software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes = (wrapped as Wrapper).cdkObject
  }
}
