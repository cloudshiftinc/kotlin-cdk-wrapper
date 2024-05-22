@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Node
import kotlin.String

/**
 * A database instance.
 */
public interface IDatabaseInstance : IResource {
  /**
   * The instance endpoint address.
   */
  public fun dbInstanceEndpointAddress(): String

  /**
   * The instance endpoint port.
   */
  public fun dbInstanceEndpointPort(): String

  /**
   * The instance arn.
   */
  public fun instanceArn(): String

  /**
   * The instance endpoint.
   */
  public fun instanceEndpoint(): Endpoint

  /**
   * The instance identifier.
   */
  public fun instanceIdentifier(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.docdb.IDatabaseInstance,
  ) : CdkObject(cdkObject), IDatabaseInstance {
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
     * The instance endpoint address.
     */
    override fun dbInstanceEndpointAddress(): String = unwrap(this).getDbInstanceEndpointAddress()

    /**
     * The instance endpoint port.
     */
    override fun dbInstanceEndpointPort(): String = unwrap(this).getDbInstanceEndpointPort()

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
     * The instance arn.
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /**
     * The instance endpoint.
     */
    override fun instanceEndpoint(): Endpoint =
        unwrap(this).getInstanceEndpoint().let(Endpoint::wrap)

    /**
     * The instance identifier.
     */
    override fun instanceIdentifier(): String = unwrap(this).getInstanceIdentifier()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.IDatabaseInstance):
        IDatabaseInstance = CdkObjectWrappers.wrap(cdkObject) as? IDatabaseInstance ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDatabaseInstance):
        software.amazon.awscdk.services.docdb.IDatabaseInstance = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.docdb.IDatabaseInstance
  }
}
