@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

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
 * The interface representing the ReportGroup resource - either an existing one, imported using the
 * `ReportGroup.fromReportGroupName` method, or a new one, created with the `ReportGroup` class.
 */
public interface IReportGroup : IResource {
  /**
   * Grants the given entity permissions to write (that is, upload reports to) this report group.
   *
   * @param identity 
   */
  public fun grantWrite(identity: IGrantable): Grant

  /**
   * The ARN of the ReportGroup.
   */
  public fun reportGroupArn(): String

  /**
   * The name of the ReportGroup.
   */
  public fun reportGroupName(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codebuild.IReportGroup,
  ) : CdkObject(cdkObject), IReportGroup {
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

    /**
     * Grants the given entity permissions to write (that is, upload reports to) this report group.
     *
     * @param identity 
     */
    override fun grantWrite(identity: IGrantable): Grant =
        unwrap(this).grantWrite(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The ARN of the ReportGroup.
     */
    override fun reportGroupArn(): String = unwrap(this).getReportGroupArn()

    /**
     * The name of the ReportGroup.
     */
    override fun reportGroupName(): String = unwrap(this).getReportGroupName()

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.IReportGroup):
        IReportGroup = CdkObjectWrappers.wrap(cdkObject) as? IReportGroup ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IReportGroup):
        software.amazon.awscdk.services.codebuild.IReportGroup = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codebuild.IReportGroup
  }
}
