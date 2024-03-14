package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ParameterGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rds.ParameterGroup,
) : Resource(cdkObject), IParameterGroup {
  /**
   * Add a parameter to this parameter group.
   *
   * @param key The key of the parameter to be added. 
   * @param value The value of the parameter to be added. 
   */
  public override fun addParameter(key: String, `value`: String): Boolean =
      unwrap(this).addParameter(key, `value`)

  /**
   * Method called when this Parameter Group is used when defining a database cluster.
   *
   * @param _options 
   */
  public override fun bindToCluster(_options: ParameterGroupClusterBindOptions):
      ParameterGroupClusterConfig =
      unwrap(this).bindToCluster(_options.let(ParameterGroupClusterBindOptions::unwrap)).let(ParameterGroupClusterConfig::wrap)

  /**
   * Method called when this Parameter Group is used when defining a database cluster.
   *
   * @param _options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d28cdc7226268867666e1b55a9f41f9760704e0a8aea5aed647fb9bc4accfa14")
  public override fun bindToCluster(_options: ParameterGroupClusterBindOptions.Builder.() -> Unit):
      ParameterGroupClusterConfig = bindToCluster(ParameterGroupClusterBindOptions(_options))

  /**
   * Method called when this Parameter Group is used when defining a database instance.
   *
   * @param _options 
   */
  public override fun bindToInstance(_options: ParameterGroupInstanceBindOptions):
      ParameterGroupInstanceConfig =
      unwrap(this).bindToInstance(_options.let(ParameterGroupInstanceBindOptions::unwrap)).let(ParameterGroupInstanceConfig::wrap)

  /**
   * Method called when this Parameter Group is used when defining a database instance.
   *
   * @param _options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fda7f99b0973a1794d583b4748a0034342e5fc0557269fbcea9db1b8801b312b")
  public override
      fun bindToInstance(_options: ParameterGroupInstanceBindOptions.Builder.() -> Unit):
      ParameterGroupInstanceConfig = bindToInstance(ParameterGroupInstanceBindOptions(_options))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.ParameterGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Description for this parameter group.
     *
     * Default: a CDK generated description
     *
     * @param description Description for this parameter group. 
     */
    public fun description(description: String)

    /**
     * The database engine for this parameter group.
     *
     * @param engine The database engine for this parameter group. 
     */
    public fun engine(engine: IEngine)

    /**
     * The parameters in this parameter group.
     *
     * Default: - None
     *
     * @param parameters The parameters in this parameter group. 
     */
    public fun parameters(parameters: Map<String, String>)

    /**
     * The CloudFormation policy to apply when the instance is removed from the stack or replaced
     * during an update.
     *
     * Default: - RemovalPolicy.DESTROY
     *
     * @param removalPolicy The CloudFormation policy to apply when the instance is removed from the
     * stack or replaced during an update. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ParameterGroup.Builder =
        software.amazon.awscdk.services.rds.ParameterGroup.Builder.create(scope, id)

    /**
     * Description for this parameter group.
     *
     * Default: a CDK generated description
     *
     * @param description Description for this parameter group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The database engine for this parameter group.
     *
     * @param engine The database engine for this parameter group. 
     */
    override fun engine(engine: IEngine) {
      cdkBuilder.engine(engine.let(IEngine::unwrap))
    }

    /**
     * The parameters in this parameter group.
     *
     * Default: - None
     *
     * @param parameters The parameters in this parameter group. 
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * The CloudFormation policy to apply when the instance is removed from the stack or replaced
     * during an update.
     *
     * Default: - RemovalPolicy.DESTROY
     *
     * @param removalPolicy The CloudFormation policy to apply when the instance is removed from the
     * stack or replaced during an update. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.ParameterGroup = cdkBuilder.build()
  }

  public companion object {
    public fun fromParameterGroupName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      parameterGroupName: String,
    ): IParameterGroup =
        software.amazon.awscdk.services.rds.ParameterGroup.fromParameterGroupName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, parameterGroupName).let(IParameterGroup::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ParameterGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ParameterGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ParameterGroup): ParameterGroup
        = ParameterGroup(cdkObject)

    internal fun unwrap(wrapped: ParameterGroup): software.amazon.awscdk.services.rds.ParameterGroup
        = wrapped.cdkObject
  }
}
