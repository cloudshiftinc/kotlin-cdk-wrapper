@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Aspects can be applied to CDK tree scopes and can operate on the tree before synthesis.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * import software.constructs.Construct;
 * import software.constructs.IConstruct;
 * public class MyAspect implements IAspect {
 * public void visit(IConstruct node) {
 * if (node instanceof CfnResource &amp;&amp; node.getCfnResourceType() == "Foo::Bar") {
 * this.error(node, "we do not want a Foo::Bar resource");
 * }
 * }
 * public void error(IConstruct node, String message) {
 * Annotations.of(node).addError(message);
 * }
 * }
 * public class MyStack extends Stack {
 * public MyStack(Construct scope, String id) {
 * super(scope, id);
 * Stack stack = new Stack();
 * CfnResource.Builder.create(stack, "Foo")
 * .type("Foo::Bar")
 * .properties(Map.of(
 * "Fred", "Thud"))
 * .build();
 * Aspects.of(stack).add(new MyAspect());
 * }
 * }
 * ```
 */
public open class Aspects(
  cdkObject: software.amazon.awscdk.Aspects,
) : CdkObject(cdkObject) {
  /**
   * Adds an aspect to apply this scope before synthesis.
   *
   * @param aspect The aspect to add. 
   * @param options Options to apply on this aspect.
   */
  public open fun add(aspect: IAspect) {
    unwrap(this).add(aspect.let(IAspect.Companion::unwrap))
  }

  /**
   * Adds an aspect to apply this scope before synthesis.
   *
   * @param aspect The aspect to add. 
   * @param options Options to apply on this aspect.
   */
  public open fun add(aspect: IAspect, options: AspectOptions) {
    unwrap(this).add(aspect.let(IAspect.Companion::unwrap),
        options.let(AspectOptions.Companion::unwrap))
  }

  /**
   * Adds an aspect to apply this scope before synthesis.
   *
   * @param aspect The aspect to add. 
   * @param options Options to apply on this aspect.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7c7a94e73bcbb8adc2d333796757f5f75d97fe4d1944117a1a9d747d5d4c417b")
  public open fun add(aspect: IAspect, options: AspectOptions.Builder.() -> Unit): Unit =
      add(aspect, AspectOptions(options))

  /**
   * The list of aspects which were directly applied on this scope.
   */
  public open fun all(): List<IAspect> = unwrap(this).getAll().map(IAspect::wrap)

  /**
   * The list of aspects with priority which were directly applied on this scope.
   *
   * Also returns inherited Aspects of this node.
   */
  public open fun applied(): List<AspectApplication> =
      unwrap(this).getApplied().map(AspectApplication::wrap)

  public companion object {
    public fun of(scope: IConstruct): Aspects =
        software.amazon.awscdk.Aspects.of(scope.let(IConstruct.Companion::unwrap)).let(Aspects::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.Aspects): Aspects = Aspects(cdkObject)

    internal fun unwrap(wrapped: Aspects): software.amazon.awscdk.Aspects = wrapped.cdkObject as
        software.amazon.awscdk.Aspects
  }
}
