@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Node
import kotlin.String

/**
 * Interface for API Destinations.
 */
public interface IApiDestination : IResource {
  /**
   * The ARN of the Api Destination created.
   */
  public fun apiDestinationArn(): String

  /**
   * The Amazon Resource Name (ARN) of an API destination in resource format, so it can be used in
   * the Resource element of IAM permission policy statements.
   *
   * [Documentation](https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazoneventbridge.html#amazoneventbridge-resources-for-iam-policies)
   */
  public fun apiDestinationArnForPolicy(): String? = unwrap(this).getApiDestinationArnForPolicy()

  /**
   * The Name of the Api Destination created.
   */
  public fun apiDestinationName(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.IApiDestination,
  ) : CdkObject(cdkObject),
      IApiDestination {
    /**
     * The ARN of the Api Destination created.
     */
    override fun apiDestinationArn(): String = unwrap(this).getApiDestinationArn()

    /**
     * The Amazon Resource Name (ARN) of an API destination in resource format, so it can be used in
     * the Resource element of IAM permission policy statements.
     *
     * [Documentation](https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazoneventbridge.html#amazoneventbridge-resources-for-iam-policies)
     */
    override fun apiDestinationArnForPolicy(): String? =
        unwrap(this).getApiDestinationArnForPolicy()

    /**
     * The Name of the Api Destination created.
     */
    override fun apiDestinationName(): String = unwrap(this).getApiDestinationName()

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
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
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
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.IApiDestination):
        IApiDestination = CdkObjectWrappers.wrap(cdkObject) as? IApiDestination ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IApiDestination):
        software.amazon.awscdk.services.events.IApiDestination = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.events.IApiDestination
  }
}
