package io.cloudshiftdev.awscdk

import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Boolean

public abstract class Resource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.Resource,
) : Construct(cdkObject), IResource {
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
  public override fun applyRemovalPolicy(policy: RemovalPolicy) {
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
  public override fun env(): ResourceEnvironment =
      unwrap(this).getEnv().let(ResourceEnvironment::wrap)

  /**
   * The stack in which this resource is defined.
   */
  public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.Resource,
  ) : Resource(cdkObject)

  public companion object {
    public fun isOwnedResource(construct: IConstruct): Boolean =
        software.amazon.awscdk.Resource.isOwnedResource(construct.let(IConstruct::unwrap))

    public fun isResource(construct: IConstruct): Boolean =
        software.amazon.awscdk.Resource.isResource(construct.let(IConstruct::unwrap))

    internal fun wrap(cdkObject: software.amazon.awscdk.Resource): Resource = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Resource): software.amazon.awscdk.Resource = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.Resource
  }
}
