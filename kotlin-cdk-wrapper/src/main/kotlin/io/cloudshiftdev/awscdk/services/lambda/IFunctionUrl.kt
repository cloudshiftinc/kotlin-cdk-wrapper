@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String

/**
 * A Lambda function Url.
 */
public interface IFunctionUrl : IResource {
  /**
   * The ARN of the function this URL refers to.
   */
  public fun functionArn(): String

  /**
   * Grant the given identity permissions to invoke this Lambda Function URL.
   *
   * @param identity 
   */
  public fun grantInvokeUrl(identity: IGrantable): Grant

  /**
   * The url of the Lambda function.
   */
  public fun url(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.IFunctionUrl,
  ) : CdkObject(cdkObject), IFunctionUrl {
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
     * The ARN of the function this URL refers to.
     */
    override fun functionArn(): String = unwrap(this).getFunctionArn()

    /**
     * Grant the given identity permissions to invoke this Lambda Function URL.
     *
     * @param identity 
     */
    override fun grantInvokeUrl(identity: IGrantable): Grant =
        unwrap(this).grantInvokeUrl(identity.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * The url of the Lambda function.
     */
    override fun url(): String = unwrap(this).getUrl()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IFunctionUrl): IFunctionUrl
        = CdkObjectWrappers.wrap(cdkObject) as? IFunctionUrl ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFunctionUrl): software.amazon.awscdk.services.lambda.IFunctionUrl
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.IFunctionUrl
  }
}
