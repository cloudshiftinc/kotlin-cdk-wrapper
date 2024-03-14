package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCodeDeployBlueGreenEcsAttributes {
  /**
   * The logical IDs of the blue and green, respectively, AWS::ECS::TaskDefinition task definitions.
   */
  public fun taskDefinitions(): List<String>

  /**
   * The logical IDs of the blue and green, respectively, AWS::ECS::TaskSet task sets.
   */
  public fun taskSets(): List<String>

  /**
   * The traffic routing configuration.
   */
  public fun trafficRouting(): CfnTrafficRouting

  /**
   * A builder for [CfnCodeDeployBlueGreenEcsAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param taskDefinitions The logical IDs of the blue and green, respectively,
     * AWS::ECS::TaskDefinition task definitions. 
     */
    public fun taskDefinitions(taskDefinitions: List<String>)

    /**
     * @param taskDefinitions The logical IDs of the blue and green, respectively,
     * AWS::ECS::TaskDefinition task definitions. 
     */
    public fun taskDefinitions(vararg taskDefinitions: String)

    /**
     * @param taskSets The logical IDs of the blue and green, respectively, AWS::ECS::TaskSet task
     * sets. 
     */
    public fun taskSets(taskSets: List<String>)

    /**
     * @param taskSets The logical IDs of the blue and green, respectively, AWS::ECS::TaskSet task
     * sets. 
     */
    public fun taskSets(vararg taskSets: String)

    /**
     * @param trafficRouting The traffic routing configuration. 
     */
    public fun trafficRouting(trafficRouting: CfnTrafficRouting)

    /**
     * @param trafficRouting The traffic routing configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("651e074c6f5b0d634fb60252bb57c85f72cc306b0a4d5d9e42b254a81e7cd986")
    public fun trafficRouting(trafficRouting: CfnTrafficRouting.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes.Builder =
        software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes.builder()

    /**
     * @param taskDefinitions The logical IDs of the blue and green, respectively,
     * AWS::ECS::TaskDefinition task definitions. 
     */
    override fun taskDefinitions(taskDefinitions: List<String>) {
      cdkBuilder.taskDefinitions(taskDefinitions)
    }

    /**
     * @param taskDefinitions The logical IDs of the blue and green, respectively,
     * AWS::ECS::TaskDefinition task definitions. 
     */
    override fun taskDefinitions(vararg taskDefinitions: String): Unit =
        taskDefinitions(taskDefinitions.toList())

    /**
     * @param taskSets The logical IDs of the blue and green, respectively, AWS::ECS::TaskSet task
     * sets. 
     */
    override fun taskSets(taskSets: List<String>) {
      cdkBuilder.taskSets(taskSets)
    }

    /**
     * @param taskSets The logical IDs of the blue and green, respectively, AWS::ECS::TaskSet task
     * sets. 
     */
    override fun taskSets(vararg taskSets: String): Unit = taskSets(taskSets.toList())

    /**
     * @param trafficRouting The traffic routing configuration. 
     */
    override fun trafficRouting(trafficRouting: CfnTrafficRouting) {
      cdkBuilder.trafficRouting(trafficRouting.let(CfnTrafficRouting::unwrap))
    }

    /**
     * @param trafficRouting The traffic routing configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("651e074c6f5b0d634fb60252bb57c85f72cc306b0a4d5d9e42b254a81e7cd986")
    override fun trafficRouting(trafficRouting: CfnTrafficRouting.Builder.() -> Unit): Unit =
        trafficRouting(CfnTrafficRouting(trafficRouting))

    public fun build(): software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes,
  ) : CfnCodeDeployBlueGreenEcsAttributes {
    /**
     * The logical IDs of the blue and green, respectively, AWS::ECS::TaskDefinition task
     * definitions.
     */
    override fun taskDefinitions(): List<String> = unwrap(this).getTaskDefinitions()

    /**
     * The logical IDs of the blue and green, respectively, AWS::ECS::TaskSet task sets.
     */
    override fun taskSets(): List<String> = unwrap(this).getTaskSets()

    /**
     * The traffic routing configuration.
     */
    override fun trafficRouting(): CfnTrafficRouting =
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
