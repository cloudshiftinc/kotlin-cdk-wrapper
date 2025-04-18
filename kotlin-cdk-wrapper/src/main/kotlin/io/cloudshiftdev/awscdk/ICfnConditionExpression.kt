@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.collections.List

/**
 * Represents a CloudFormation element that can be used within a Condition.
 *
 * You can use intrinsic functions, such as `Fn.conditionIf`,
 * `Fn.conditionEquals`, and `Fn.conditionNot`, to conditionally create
 * stack resources. These conditions are evaluated based on input parameters
 * that you declare when you create or update a stack. After you define all your
 * conditions, you can associate them with resources or resource properties in
 * the Resources and Outputs sections of a template.
 *
 * You define all conditions in the Conditions section of a template except for
 * `Fn.conditionIf` conditions. You can use the `Fn.conditionIf` condition
 * in the metadata attribute, update policy attribute, and property values in
 * the Resources section and Outputs sections of a template.
 *
 * You might use conditions when you want to reuse a template that can create
 * resources in different contexts, such as a test environment versus a
 * production environment. In your template, you can add an EnvironmentType
 * input parameter, which accepts either prod or test as inputs. For the
 * production environment, you might include Amazon EC2 instances with certain
 * capabilities; however, for the test environment, you want to use less
 * capabilities to save costs. With conditions, you can define which resources
 * are created and how they're configured for each environment type.
 *
 * You can use `toString` when you wish to embed a condition expression
 * in a property value that accepts a `string`. For example:
 *
 * ```
 * Queue.Builder.create(this, "MyQueue")
 * .queueName(Fn.conditionIf("Condition", "Hello", "World").toString())
 * .build();
 * ```
 */
public interface ICfnConditionExpression : IResolvable {
  private class Wrapper(
    cdkObject: software.amazon.awscdk.ICfnConditionExpression,
  ) : CdkObject(cdkObject),
      ICfnConditionExpression {
    /**
     * The creation stack of this resolvable which will be appended to errors thrown during
     * resolution.
     *
     * This may return an array with a single informational element indicating how
     * to get this property populated, if it was skipped for performance reasons.
     */
    override fun creationStack(): List<String> = unwrap(this).getCreationStack()

    /**
     * Produce the Token's value at resolution time.
     *
     * @param context 
     */
    override fun resolve(context: IResolveContext): Any =
        unwrap(this).resolve(context.let(IResolveContext.Companion::unwrap))

    /**
     * Return a string representation of this resolvable object.
     *
     * Returns a reversible string representation.
     */
    override fun toString(): String = unwrap(this).toString()

    /**
     * The type that this token will likely resolve to.
     */
    override fun typeHint(): ResolutionTypeHint? =
        unwrap(this).getTypeHint()?.let(ResolutionTypeHint::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ICfnConditionExpression):
        ICfnConditionExpression = CdkObjectWrappers.wrap(cdkObject) as? ICfnConditionExpression ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICfnConditionExpression):
        software.amazon.awscdk.ICfnConditionExpression = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.ICfnConditionExpression
  }
}
