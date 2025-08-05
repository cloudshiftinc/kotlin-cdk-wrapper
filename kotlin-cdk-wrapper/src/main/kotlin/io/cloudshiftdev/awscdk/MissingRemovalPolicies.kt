@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Manages removal policies for resources without existing policies within a construct scope.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * MissingRemovalPolicies missingRemovalPolicies = MissingRemovalPolicies.of(this);
 * ```
 */
public open class MissingRemovalPolicies(
  cdkObject: software.amazon.awscdk.MissingRemovalPolicies,
) : CdkObject(cdkObject) {
  /**
   * Apply a removal policy only to resources without existing policies within this scope.
   *
   * @param policy The removal policy to apply. 
   * @param props Configuration options.
   */
  public open fun apply(policy: RemovalPolicy) {
    unwrap(this).apply(policy.let(RemovalPolicy.Companion::unwrap))
  }

  /**
   * Apply a removal policy only to resources without existing policies within this scope.
   *
   * @param policy The removal policy to apply. 
   * @param props Configuration options.
   */
  public open fun apply(policy: RemovalPolicy, props: RemovalPolicyProps) {
    unwrap(this).apply(policy.let(RemovalPolicy.Companion::unwrap),
        props.let(RemovalPolicyProps.Companion::unwrap))
  }

  /**
   * Apply a removal policy only to resources without existing policies within this scope.
   *
   * @param policy The removal policy to apply. 
   * @param props Configuration options.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3b05e20f1d8aa77a82661183eed8d11178ad86b2d0ac19a2fccb742a68032ae4")
  public open fun apply(policy: RemovalPolicy, props: RemovalPolicyProps.Builder.() -> Unit): Unit =
      apply(policy, RemovalPolicyProps(props))

  /**
   * Apply DESTROY removal policy only to resources without existing policies within this scope.
   *
   * @param props Configuration options.
   */
  public open fun destroy() {
    unwrap(this).destroy()
  }

  /**
   * Apply DESTROY removal policy only to resources without existing policies within this scope.
   *
   * @param props Configuration options.
   */
  public open fun destroy(props: RemovalPolicyProps) {
    unwrap(this).destroy(props.let(RemovalPolicyProps.Companion::unwrap))
  }

  /**
   * Apply DESTROY removal policy only to resources without existing policies within this scope.
   *
   * @param props Configuration options.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("13e9a6d1a4bac2c77a0936142cc0a6d6cd58f10e46674f52b30bfab500cc0757")
  public open fun destroy(props: RemovalPolicyProps.Builder.() -> Unit): Unit =
      destroy(RemovalPolicyProps(props))

  /**
   * Apply RETAIN removal policy only to resources without existing policies within this scope.
   *
   * @param props Configuration options.
   */
  public open fun retain() {
    unwrap(this).retain()
  }

  /**
   * Apply RETAIN removal policy only to resources without existing policies within this scope.
   *
   * @param props Configuration options.
   */
  public open fun retain(props: RemovalPolicyProps) {
    unwrap(this).retain(props.let(RemovalPolicyProps.Companion::unwrap))
  }

  /**
   * Apply RETAIN removal policy only to resources without existing policies within this scope.
   *
   * @param props Configuration options.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ec79d815339f964854c04cc3277dac7ffbc21291cdfe6fd7b9be3580940d4b70")
  public open fun retain(props: RemovalPolicyProps.Builder.() -> Unit): Unit =
      retain(RemovalPolicyProps(props))

  /**
   * Apply RETAIN_ON_UPDATE_OR_DELETE removal policy only to resources without existing policies
   * within this scope.
   *
   * @param props Configuration options.
   */
  public open fun retainOnUpdateOrDelete() {
    unwrap(this).retainOnUpdateOrDelete()
  }

  /**
   * Apply RETAIN_ON_UPDATE_OR_DELETE removal policy only to resources without existing policies
   * within this scope.
   *
   * @param props Configuration options.
   */
  public open fun retainOnUpdateOrDelete(props: RemovalPolicyProps) {
    unwrap(this).retainOnUpdateOrDelete(props.let(RemovalPolicyProps.Companion::unwrap))
  }

  /**
   * Apply RETAIN_ON_UPDATE_OR_DELETE removal policy only to resources without existing policies
   * within this scope.
   *
   * @param props Configuration options.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("80dfb9608bfbe5a27f9f44181f3b03ef94d41fbebdee98d1ffc2155c8af7e12e")
  public open fun retainOnUpdateOrDelete(props: RemovalPolicyProps.Builder.() -> Unit): Unit =
      retainOnUpdateOrDelete(RemovalPolicyProps(props))

  /**
   * Apply SNAPSHOT removal policy only to resources without existing policies within this scope.
   *
   * @param props Configuration options.
   */
  public open fun snapshot() {
    unwrap(this).snapshot()
  }

  /**
   * Apply SNAPSHOT removal policy only to resources without existing policies within this scope.
   *
   * @param props Configuration options.
   */
  public open fun snapshot(props: RemovalPolicyProps) {
    unwrap(this).snapshot(props.let(RemovalPolicyProps.Companion::unwrap))
  }

  /**
   * Apply SNAPSHOT removal policy only to resources without existing policies within this scope.
   *
   * @param props Configuration options.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("295ccc1a20a12fa06383260092905d69063631dd60bdf359b77df257b4e2dfab")
  public open fun snapshot(props: RemovalPolicyProps.Builder.() -> Unit): Unit =
      snapshot(RemovalPolicyProps(props))

  public companion object {
    public fun of(scope: IConstruct): MissingRemovalPolicies =
        software.amazon.awscdk.MissingRemovalPolicies.of(scope.let(IConstruct.Companion::unwrap)).let(MissingRemovalPolicies::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.MissingRemovalPolicies):
        MissingRemovalPolicies = MissingRemovalPolicies(cdkObject)

    internal fun unwrap(wrapped: MissingRemovalPolicies):
        software.amazon.awscdk.MissingRemovalPolicies = wrapped.cdkObject as
        software.amazon.awscdk.MissingRemovalPolicies
  }
}
