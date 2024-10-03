@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Boolean

/**
 * A construct which represents an AWS resource.
 *
 * Example:
 *
 * ```
 * public class MyConstruct extends Resource implements ITaggable {
 * public final Object tags;
 * public MyConstruct(Construct scope, String id) {
 * super(scope, id);
 * CfnResource.Builder.create(this, "Resource")
 * .type("Whatever::The::Type")
 * .properties(Map.of(
 * // ...
 * "Tags", this.tags.getRenderedTags()))
 * .build();
 * }
 * }
 * ```
 */
public abstract class Resource(
  cdkObject: software.amazon.awscdk.Resource,
) : Construct(cdkObject),
    IResource {
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
  public override fun env(): ResourceEnvironment =
      unwrap(this).getEnv().let(ResourceEnvironment::wrap)

  /**
   * The stack in which this resource is defined.
   */
  public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.Resource,
  ) : Resource(cdkObject)

  public companion object {
    public fun isOwnedResource(construct: IConstruct): Boolean =
        software.amazon.awscdk.Resource.isOwnedResource(construct.let(IConstruct.Companion::unwrap))

    public fun isResource(construct: IConstruct): Boolean =
        software.amazon.awscdk.Resource.isResource(construct.let(IConstruct.Companion::unwrap))

    internal fun wrap(cdkObject: software.amazon.awscdk.Resource): Resource =
        CdkObjectWrappers.wrap(cdkObject) as? Resource ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Resource): software.amazon.awscdk.Resource = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.Resource
  }
}
