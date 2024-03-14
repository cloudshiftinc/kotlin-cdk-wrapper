package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface ParameterGroupProps {
  /**
   * Description for this parameter group.
   *
   * Default: a CDK generated description
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The database engine for this parameter group.
   */
  public fun engine(): IEngine

  /**
   * The parameters in this parameter group.
   *
   * Default: - None
   */
  public fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

  /**
   * The CloudFormation policy to apply when the instance is removed from the stack or replaced
   * during an update.
   *
   * Default: - RemovalPolicy.DESTROY
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * A builder for [ParameterGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description Description for this parameter group.
     */
    public fun description(description: String)

    /**
     * @param engine The database engine for this parameter group. 
     */
    public fun engine(engine: IEngine)

    /**
     * @param parameters The parameters in this parameter group.
     */
    public fun parameters(parameters: Map<String, String>)

    /**
     * @param removalPolicy The CloudFormation policy to apply when the instance is removed from the
     * stack or replaced during an update.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ParameterGroupProps.Builder =
        software.amazon.awscdk.services.rds.ParameterGroupProps.builder()

    /**
     * @param description Description for this parameter group.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param engine The database engine for this parameter group. 
     */
    override fun engine(engine: IEngine) {
      cdkBuilder.engine(engine.let(IEngine::unwrap))
    }

    /**
     * @param parameters The parameters in this parameter group.
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param removalPolicy The CloudFormation policy to apply when the instance is removed from the
     * stack or replaced during an update.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.ParameterGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.ParameterGroupProps,
  ) : CdkObject(cdkObject), ParameterGroupProps {
    /**
     * Description for this parameter group.
     *
     * Default: a CDK generated description
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The database engine for this parameter group.
     */
    override fun engine(): IEngine = unwrap(this).getEngine().let(IEngine::wrap)

    /**
     * The parameters in this parameter group.
     *
     * Default: - None
     */
    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

    /**
     * The CloudFormation policy to apply when the instance is removed from the stack or replaced
     * during an update.
     *
     * Default: - RemovalPolicy.DESTROY
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ParameterGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ParameterGroupProps):
        ParameterGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ParameterGroupProps):
        software.amazon.awscdk.services.rds.ParameterGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.ParameterGroupProps
  }
}
