@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

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
 * A NetworkAcl.
 */
public interface INetworkAcl : IResource {
  /**
   * Add a new entry to the ACL.
   *
   * @param id 
   * @param options 
   */
  public fun addEntry(id: String, options: CommonNetworkAclEntryOptions): NetworkAclEntry

  /**
   * Add a new entry to the ACL.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9ded3168e29970080cb3758417dce7573f6048a2cd62d2c05c7c24d3ed40bb13")
  public fun addEntry(id: String, options: CommonNetworkAclEntryOptions.Builder.() -> Unit):
      NetworkAclEntry

  /**
   * ID for the current Network ACL.
   */
  public fun networkAclId(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.INetworkAcl,
  ) : CdkObject(cdkObject), INetworkAcl {
    /**
     * Add a new entry to the ACL.
     *
     * @param id 
     * @param options 
     */
    override fun addEntry(id: String, options: CommonNetworkAclEntryOptions): NetworkAclEntry =
        unwrap(this).addEntry(id,
        options.let(CommonNetworkAclEntryOptions::unwrap)).let(NetworkAclEntry::wrap)

    /**
     * Add a new entry to the ACL.
     *
     * @param id 
     * @param options 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ded3168e29970080cb3758417dce7573f6048a2cd62d2c05c7c24d3ed40bb13")
    override fun addEntry(id: String, options: CommonNetworkAclEntryOptions.Builder.() -> Unit):
        NetworkAclEntry = addEntry(id, CommonNetworkAclEntryOptions(options))

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
     * ID for the current Network ACL.
     */
    override fun networkAclId(): String = unwrap(this).getNetworkAclId()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.INetworkAcl): INetworkAcl =
        CdkObjectWrappers.wrap(cdkObject) as? INetworkAcl ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: INetworkAcl): software.amazon.awscdk.services.ec2.INetworkAcl =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.INetworkAcl
  }
}
