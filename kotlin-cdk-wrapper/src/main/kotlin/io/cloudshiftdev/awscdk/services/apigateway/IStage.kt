@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents an APIGateway Stage.
 */
public interface IStage : IResource {
  /**
   * Add an ApiKey to this Stage.
   *
   * @param id 
   * @param options
   */
  public fun addApiKey(id: String): IApiKey

  /**
   * Add an ApiKey to this Stage.
   *
   * @param id 
   * @param options
   */
  public fun addApiKey(id: String, options: ApiKeyOptions): IApiKey

  /**
   * Add an ApiKey to this Stage.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2f7ef06bb21f3062b3d57e1e4464d4d9bce5c5321ad41fa8f19d3cd5e9443547")
  public fun addApiKey(id: String, options: ApiKeyOptions.Builder.() -> Unit): IApiKey

  /**
   * RestApi to which this stage is associated.
   */
  public fun restApi(): IRestApi

  /**
   * Name of this stage.
   */
  public fun stageName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.IStage,
  ) : CdkObject(cdkObject), IStage {
    /**
     * Add an ApiKey to this Stage.
     *
     * @param id 
     * @param options
     */
    override fun addApiKey(id: String): IApiKey = unwrap(this).addApiKey(id).let(IApiKey::wrap)

    /**
     * Add an ApiKey to this Stage.
     *
     * @param id 
     * @param options
     */
    override fun addApiKey(id: String, options: ApiKeyOptions): IApiKey = unwrap(this).addApiKey(id,
        options.let(ApiKeyOptions::unwrap)).let(IApiKey::wrap)

    /**
     * Add an ApiKey to this Stage.
     *
     * @param id 
     * @param options
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f7ef06bb21f3062b3d57e1e4464d4d9bce5c5321ad41fa8f19d3cd5e9443547")
    override fun addApiKey(id: String, options: ApiKeyOptions.Builder.() -> Unit): IApiKey =
        addApiKey(id, ApiKeyOptions(options))

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
     * RestApi to which this stage is associated.
     */
    override fun restApi(): IRestApi = unwrap(this).getRestApi().let(IRestApi::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * Name of this stage.
     */
    override fun stageName(): String = unwrap(this).getStageName()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IStage): IStage =
        CdkObjectWrappers.wrap(cdkObject) as? IStage ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStage): software.amazon.awscdk.services.apigateway.IStage =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IStage
  }
}
