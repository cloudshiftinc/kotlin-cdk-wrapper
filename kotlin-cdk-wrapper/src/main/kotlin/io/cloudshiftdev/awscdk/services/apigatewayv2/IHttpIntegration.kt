@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Node
import kotlin.String

/**
 * Represents an Integration for an HTTP API.
 */
public interface IHttpIntegration : IIntegration {
  /**
   * The HTTP API associated with this integration.
   */
  public fun httpApi(): IHttpApi

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpIntegration,
  ) : CdkObject(cdkObject), IHttpIntegration {
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
     * The HTTP API associated with this integration.
     */
    override fun httpApi(): IHttpApi = unwrap(this).getHttpApi().let(IHttpApi::wrap)

    /**
     * Id of the integration.
     */
    override fun integrationId(): String = unwrap(this).getIntegrationId()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpIntegration):
        IHttpIntegration = CdkObjectWrappers.wrap(cdkObject) as? IHttpIntegration ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IHttpIntegration):
        software.amazon.awscdk.services.apigatewayv2.IHttpIntegration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IHttpIntegration
  }
}
