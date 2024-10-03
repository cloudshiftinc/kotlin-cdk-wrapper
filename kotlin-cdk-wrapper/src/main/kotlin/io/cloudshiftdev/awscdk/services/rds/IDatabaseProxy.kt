@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

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
 * DB Proxy.
 */
public interface IDatabaseProxy : IResource {
  /**
   * DB Proxy ARN.
   */
  public fun dbProxyArn(): String

  /**
   * DB Proxy Name.
   */
  public fun dbProxyName(): String

  /**
   * Endpoint.
   */
  public fun endpoint(): String

  /**
   * Grant the given identity connection access to the proxy.
   *
   * Default: - if the Proxy had been provided a single Secret value,
   * the user will be taken from that Secret
   *
   * @param grantee the Principal to grant the permissions to. 
   * @param dbUser the name of the database user to allow connecting as to the proxy.
   */
  public fun grantConnect(grantee: IGrantable): Grant

  /**
   * Grant the given identity connection access to the proxy.
   *
   * Default: - if the Proxy had been provided a single Secret value,
   * the user will be taken from that Secret
   *
   * @param grantee the Principal to grant the permissions to. 
   * @param dbUser the name of the database user to allow connecting as to the proxy.
   */
  public fun grantConnect(grantee: IGrantable, dbUser: String): Grant

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.IDatabaseProxy,
  ) : CdkObject(cdkObject),
      IDatabaseProxy {
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
     * DB Proxy ARN.
     */
    override fun dbProxyArn(): String = unwrap(this).getDbProxyArn()

    /**
     * DB Proxy Name.
     */
    override fun dbProxyName(): String = unwrap(this).getDbProxyName()

    /**
     * Endpoint.
     */
    override fun endpoint(): String = unwrap(this).getEndpoint()

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
     * Grant the given identity connection access to the proxy.
     *
     * Default: - if the Proxy had been provided a single Secret value,
     * the user will be taken from that Secret
     *
     * @param grantee the Principal to grant the permissions to. 
     * @param dbUser the name of the database user to allow connecting as to the proxy.
     */
    override fun grantConnect(grantee: IGrantable): Grant =
        unwrap(this).grantConnect(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * Grant the given identity connection access to the proxy.
     *
     * Default: - if the Proxy had been provided a single Secret value,
     * the user will be taken from that Secret
     *
     * @param grantee the Principal to grant the permissions to. 
     * @param dbUser the name of the database user to allow connecting as to the proxy.
     */
    override fun grantConnect(grantee: IGrantable, dbUser: String): Grant =
        unwrap(this).grantConnect(grantee.let(IGrantable.Companion::unwrap),
        dbUser).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IDatabaseProxy): IDatabaseProxy
        = CdkObjectWrappers.wrap(cdkObject) as? IDatabaseProxy ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDatabaseProxy): software.amazon.awscdk.services.rds.IDatabaseProxy
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.rds.IDatabaseProxy
  }
}
