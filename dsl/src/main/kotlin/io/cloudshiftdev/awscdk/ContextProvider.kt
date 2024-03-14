package io.cloudshiftdev.awscdk

import io.cloudshiftdev.constructs.Construct
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class ContextProvider internal constructor(
  internal override val cdkObject: software.amazon.awscdk.ContextProvider,
) : CdkObject(cdkObject) {
  public companion object {
    public fun key(scope: Construct, options: GetContextKeyOptions): GetContextKeyResult =
        software.amazon.awscdk.ContextProvider.getKey(scope.let(Construct::unwrap),
        options.let(GetContextKeyOptions::unwrap)).let(GetContextKeyResult::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d496bb868e70dcad2a53237cef63aa8154067471be32c59fb83f455da6964d14")
    public fun key(scope: Construct, options: GetContextKeyOptions.Builder.() -> Unit):
        GetContextKeyResult = key(scope, GetContextKeyOptions(options))

    public fun `value`(scope: Construct, options: GetContextValueOptions): GetContextValueResult =
        software.amazon.awscdk.ContextProvider.getValue(scope.let(Construct::unwrap),
        options.let(GetContextValueOptions::unwrap)).let(GetContextValueResult::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("955804e5b028c434617788cb209425e3eb3abe8900e9dfbc4368a300a0e9fc20")
    public fun `value`(scope: Construct, options: GetContextValueOptions.Builder.() -> Unit):
        GetContextValueResult = `value`(scope, GetContextValueOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.ContextProvider): ContextProvider =
        ContextProvider(cdkObject)

    internal fun unwrap(wrapped: ContextProvider): software.amazon.awscdk.ContextProvider =
        wrapped.cdkObject
  }
}
