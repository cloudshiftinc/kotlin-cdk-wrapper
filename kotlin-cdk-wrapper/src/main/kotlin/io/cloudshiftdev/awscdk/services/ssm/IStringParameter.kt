@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

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
 * A String SSM Parameter.
 */
public interface IStringParameter : IParameter {
  /**
   * The parameter value.
   *
   * Value must not nest another parameter. Do not use {{}} in the value.
   */
  public fun stringValue(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ssm.IStringParameter,
  ) : CdkObject(cdkObject), IStringParameter {
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
     * Grants read (DescribeParameter, GetParameters, GetParameter, GetParameterHistory) permissions
     * on the SSM Parameter.
     *
     * @param grantee the role to be granted read-only access to the parameter. 
     */
    override fun grantRead(grantee: IGrantable): Grant =
        unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Grants write (PutParameter) permissions on the SSM Parameter.
     *
     * @param grantee the role to be granted write access to the parameter. 
     */
    override fun grantWrite(grantee: IGrantable): Grant =
        unwrap(this).grantWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The ARN of the SSM Parameter resource.
     */
    override fun parameterArn(): String = unwrap(this).getParameterArn()

    /**
     * The name of the SSM Parameter resource.
     */
    override fun parameterName(): String = unwrap(this).getParameterName()

    /**
     * The type of the SSM Parameter resource.
     */
    override fun parameterType(): String = unwrap(this).getParameterType()

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * The parameter value.
     *
     * Value must not nest another parameter. Do not use {{}} in the value.
     */
    override fun stringValue(): String = unwrap(this).getStringValue()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.IStringParameter):
        IStringParameter = CdkObjectWrappers.wrap(cdkObject) as? IStringParameter ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStringParameter):
        software.amazon.awscdk.services.ssm.IStringParameter = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ssm.IStringParameter
  }
}
