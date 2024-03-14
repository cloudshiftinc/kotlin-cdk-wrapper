package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.services.s3.assets.AssetOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Code
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.appsync.Code,
) {
    /**
     * Bind source code to an AppSync Function or resolver.
     *
     * @param scope
     */
    public open fun bind(scope: Construct): CodeConfig =
        unwrap(this).bind(scope.let(Construct::unwrap)).let(CodeConfig::wrap)

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.appsync.Code,
    ) : Code(cdkObject)

    public companion object {
        public fun fromAsset(path: String): AssetCode =
            software.amazon.awscdk.services.appsync.Code.fromAsset(path).let(AssetCode::wrap)

        public fun fromAsset(path: String, options: AssetOptions): AssetCode =
            software.amazon.awscdk.services.appsync.Code.fromAsset(
                    path,
                    options.let(AssetOptions::unwrap)
                )
                .let(AssetCode::wrap)

        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("b6b30dc0029d3eae4bcdf8c40fd877adaafd1579c6e451b25506f9b13057af28")
        public fun fromAsset(path: String, options: AssetOptions.Builder.() -> Unit): AssetCode =
            fromAsset(path, AssetOptions(options))

        public fun fromInline(code: String): InlineCode =
            software.amazon.awscdk.services.appsync.Code.fromInline(code).let(InlineCode::wrap)

        internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.Code): Code =
            Wrapper(cdkObject)

        internal fun unwrap(wrapped: Code): software.amazon.awscdk.services.appsync.Code =
            (wrapped as Wrapper).cdkObject
    }
}
