package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IDomainName : IResource {
  /**
   * The domain name (e.g. `example.com`).
   */
  public fun domainName(): String

  /**
   * The Route53 alias target to use in order to connect a record set to this domain through an
   * alias.
   */
  public fun domainNameAliasDomainName(): String

  /**
   * The Route53 hosted zone ID to use in order to connect a record set to this domain through an
   * alias.
   */
  public fun domainNameAliasHostedZoneId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.IDomainName,
  ) : CdkObject(cdkObject), IDomainName {
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
     * The domain name (e.g. `example.com`).
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * The Route53 alias target to use in order to connect a record set to this domain through an
     * alias.
     */
    override fun domainNameAliasDomainName(): String = unwrap(this).getDomainNameAliasDomainName()

    /**
     * The Route53 hosted zone ID to use in order to connect a record set to this domain through an
     * alias.
     */
    override fun domainNameAliasHostedZoneId(): String =
        unwrap(this).getDomainNameAliasHostedZoneId()

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
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IDomainName):
        IDomainName = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDomainName):
        software.amazon.awscdk.services.apigateway.IDomainName = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.apigateway.IDomainName
  }
}
