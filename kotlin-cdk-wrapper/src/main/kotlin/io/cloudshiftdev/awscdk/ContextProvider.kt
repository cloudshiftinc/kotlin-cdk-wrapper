@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Base class for the model side of context providers.
 *
 * Instances of this class communicate with context provider plugins in the 'cdk
 * toolkit' via context variables (input), outputting specialized queries for
 * more context variables (output).
 *
 * ContextProvider needs access to a Construct to hook into the context mechanism.
 */
public open class ContextProvider(
  cdkObject: software.amazon.awscdk.ContextProvider,
) : CdkObject(cdkObject) {
  public companion object {
    public fun key(scope: Construct, options: GetContextKeyOptions): GetContextKeyResult =
        software.amazon.awscdk.ContextProvider.getKey(scope.let(Construct.Companion::unwrap),
        options.let(GetContextKeyOptions.Companion::unwrap)).let(GetContextKeyResult::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d496bb868e70dcad2a53237cef63aa8154067471be32c59fb83f455da6964d14")
    public fun key(scope: Construct, options: GetContextKeyOptions.Builder.() -> Unit):
        GetContextKeyResult = key(scope, GetContextKeyOptions(options))

    public fun `value`(scope: Construct, options: GetContextValueOptions): GetContextValueResult =
        software.amazon.awscdk.ContextProvider.getValue(scope.let(Construct.Companion::unwrap),
        options.let(GetContextValueOptions.Companion::unwrap)).let(GetContextValueResult::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("955804e5b028c434617788cb209425e3eb3abe8900e9dfbc4368a300a0e9fc20")
    public fun `value`(scope: Construct, options: GetContextValueOptions.Builder.() -> Unit):
        GetContextValueResult = `value`(scope, GetContextValueOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.ContextProvider): ContextProvider =
        ContextProvider(cdkObject)

    internal fun unwrap(wrapped: ContextProvider): software.amazon.awscdk.ContextProvider =
        wrapped.cdkObject as software.amazon.awscdk.ContextProvider
  }
}
