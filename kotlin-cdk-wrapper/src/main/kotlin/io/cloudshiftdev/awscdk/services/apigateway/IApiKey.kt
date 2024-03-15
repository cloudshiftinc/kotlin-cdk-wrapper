@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

/**
 * API keys are alphanumeric string values that you distribute to app developer customers to grant
 * access to your API.
 */
public interface IApiKey : IResource {
  /**
   * The API key ARN.
   */
  public fun keyArn(): String

  /**
   * The API key ID.
   */
  public fun keyId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.IApiKey,
  ) : CdkObject(cdkObject), IApiKey {
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

    /**
     * The API key ARN.
     */
    override fun keyArn(): String = unwrap(this).getKeyArn()

    /**
     * The API key ID.
     */
    override fun keyId(): String = unwrap(this).getKeyId()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IApiKey): IApiKey =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IApiKey): software.amazon.awscdk.services.apigateway.IApiKey =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IApiKey
  }
}
