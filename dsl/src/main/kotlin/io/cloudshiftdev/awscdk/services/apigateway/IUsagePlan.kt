package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IUsagePlan : IResource {
  /**
   * Adds an ApiKey.
   *
   * @param apiKey the api key to associate with this usage plan. 
   * @param options options that control the behaviour of this method.
   */
  public fun addApiKey(apiKey: IApiKey)

  /**
   * Adds an ApiKey.
   *
   * @param apiKey the api key to associate with this usage plan. 
   * @param options options that control the behaviour of this method.
   */
  public fun addApiKey(apiKey: IApiKey, options: AddApiKeyOptions)

  /**
   * Adds an ApiKey.
   *
   * @param apiKey the api key to associate with this usage plan. 
   * @param options options that control the behaviour of this method.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4f5ef86a87be3209ae0cbdb48ee812520d7927d679407f259483e5c3856b59ac")
  public fun addApiKey(apiKey: IApiKey, options: AddApiKeyOptions.Builder.() -> Unit)

  /**
   * Id of the usage plan.
   */
  public fun usagePlanId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.IUsagePlan,
  ) : IUsagePlan {
    /**
     * Adds an ApiKey.
     *
     * @param apiKey the api key to associate with this usage plan. 
     * @param options options that control the behaviour of this method.
     */
    override fun addApiKey(apiKey: IApiKey) {
      unwrap(this).addApiKey(apiKey.let(IApiKey::unwrap))
    }

    /**
     * Adds an ApiKey.
     *
     * @param apiKey the api key to associate with this usage plan. 
     * @param options options that control the behaviour of this method.
     */
    override fun addApiKey(apiKey: IApiKey, options: AddApiKeyOptions) {
      unwrap(this).addApiKey(apiKey.let(IApiKey::unwrap), options.let(AddApiKeyOptions::unwrap))
    }

    /**
     * Adds an ApiKey.
     *
     * @param apiKey the api key to associate with this usage plan. 
     * @param options options that control the behaviour of this method.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f5ef86a87be3209ae0cbdb48ee812520d7927d679407f259483e5c3856b59ac")
    override fun addApiKey(apiKey: IApiKey, options: AddApiKeyOptions.Builder.() -> Unit): Unit =
        addApiKey(apiKey, AddApiKeyOptions(options))

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

    /**
     * Id of the usage plan.
     */
    override fun usagePlanId(): String = unwrap(this).getUsagePlanId()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IUsagePlan): IUsagePlan
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IUsagePlan): software.amazon.awscdk.services.apigateway.IUsagePlan
        = (wrapped as Wrapper).cdkObject
  }
}
