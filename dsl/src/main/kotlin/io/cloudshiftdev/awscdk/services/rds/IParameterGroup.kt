package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IParameterGroup : IResource {
  /**
   * Adds a parameter to this group.
   *
   * If this is an imported parameter group,
   * this method does nothing.
   *
   * @return true if the parameter was actually added
   * (i.e., this ParameterGroup is not imported),
   * false otherwise
   * @param key 
   * @param value 
   */
  public fun addParameter(key: String, `value`: String): Boolean

  /**
   * Method called when this Parameter Group is used when defining a database cluster.
   *
   * @param options 
   */
  public fun bindToCluster(options: ParameterGroupClusterBindOptions): ParameterGroupClusterConfig

  /**
   * Method called when this Parameter Group is used when defining a database cluster.
   *
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d28cdc7226268867666e1b55a9f41f9760704e0a8aea5aed647fb9bc4accfa14")
  public fun bindToCluster(options: ParameterGroupClusterBindOptions.Builder.() -> Unit):
      ParameterGroupClusterConfig

  /**
   * Method called when this Parameter Group is used when defining a database instance.
   *
   * @param options 
   */
  public fun bindToInstance(options: ParameterGroupInstanceBindOptions):
      ParameterGroupInstanceConfig

  /**
   * Method called when this Parameter Group is used when defining a database instance.
   *
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fda7f99b0973a1794d583b4748a0034342e5fc0557269fbcea9db1b8801b312b")
  public fun bindToInstance(options: ParameterGroupInstanceBindOptions.Builder.() -> Unit):
      ParameterGroupInstanceConfig

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.IParameterGroup,
  ) : IParameterGroup {
    /**
     * Adds a parameter to this group.
     *
     * If this is an imported parameter group,
     * this method does nothing.
     *
     * @return true if the parameter was actually added
     * (i.e., this ParameterGroup is not imported),
     * false otherwise
     * @param key 
     * @param value 
     */
    override fun addParameter(key: String, `value`: String): Boolean =
        unwrap(this).addParameter(key, `value`)

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * Method called when this Parameter Group is used when defining a database cluster.
     *
     * @param options 
     */
    override fun bindToCluster(options: ParameterGroupClusterBindOptions):
        ParameterGroupClusterConfig =
        unwrap(this).bindToCluster(options.let(ParameterGroupClusterBindOptions::unwrap)).let(ParameterGroupClusterConfig::wrap)

    /**
     * Method called when this Parameter Group is used when defining a database cluster.
     *
     * @param options 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d28cdc7226268867666e1b55a9f41f9760704e0a8aea5aed647fb9bc4accfa14")
    override fun bindToCluster(options: ParameterGroupClusterBindOptions.Builder.() -> Unit):
        ParameterGroupClusterConfig = bindToCluster(ParameterGroupClusterBindOptions(options))

    /**
     * Method called when this Parameter Group is used when defining a database instance.
     *
     * @param options 
     */
    override fun bindToInstance(options: ParameterGroupInstanceBindOptions):
        ParameterGroupInstanceConfig =
        unwrap(this).bindToInstance(options.let(ParameterGroupInstanceBindOptions::unwrap)).let(ParameterGroupInstanceConfig::wrap)

    /**
     * Method called when this Parameter Group is used when defining a database instance.
     *
     * @param options 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fda7f99b0973a1794d583b4748a0034342e5fc0557269fbcea9db1b8801b312b")
    override fun bindToInstance(options: ParameterGroupInstanceBindOptions.Builder.() -> Unit):
        ParameterGroupInstanceConfig = bindToInstance(ParameterGroupInstanceBindOptions(options))

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IParameterGroup):
        IParameterGroup = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IParameterGroup):
        software.amazon.awscdk.services.rds.IParameterGroup = (wrapped as Wrapper).cdkObject
  }
}
