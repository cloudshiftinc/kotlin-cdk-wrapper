@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Less oft-needed functions to manipulate Tokens.
 */
public open class Tokenization(
  cdkObject: software.amazon.awscdk.Tokenization,
) : CdkObject(cdkObject) {
  public companion object {
    public fun isResolvable(obj: Any): Boolean =
        software.amazon.awscdk.Tokenization.isResolvable(obj)

    public fun resolve(obj: Any, options: ResolveOptions): Any =
        software.amazon.awscdk.Tokenization.resolve(obj, options.let(ResolveOptions::unwrap))

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9841a8d2bb08e26698ea12389362f3d4bba05a9b20c9f5fbb7b0a96c44839e52")
    public fun resolve(obj: Any, options: ResolveOptions.Builder.() -> Unit): Any = resolve(obj,
        ResolveOptions(options))

    public fun reverse(x: Any): IResolvable? =
        software.amazon.awscdk.Tokenization.reverse(x)?.let(IResolvable::wrap)

    public fun reverse(x: Any, options: ReverseOptions): IResolvable? =
        software.amazon.awscdk.Tokenization.reverse(x,
        options.let(ReverseOptions::unwrap))?.let(IResolvable::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11ed19a149174895c95c012a07fbd639e4a0f73c9514089a707b827a640f59d7")
    public fun reverse(x: Any, options: ReverseOptions.Builder.() -> Unit): IResolvable? =
        reverse(x, ReverseOptions(options))

    public fun reverseCompleteString(s: String): IResolvable? =
        software.amazon.awscdk.Tokenization.reverseCompleteString(s)?.let(IResolvable::wrap)

    public fun reverseList(l: List<String>): IResolvable? =
        software.amazon.awscdk.Tokenization.reverseList(l)?.let(IResolvable::wrap)

    public fun reverseList(vararg l: String): IResolvable? = reverseList(l.toList())

    public fun reverseNumber(n: Number): IResolvable? =
        software.amazon.awscdk.Tokenization.reverseNumber(n)?.let(IResolvable::wrap)

    public fun reverseString(s: String): TokenizedStringFragments =
        software.amazon.awscdk.Tokenization.reverseString(s).let(TokenizedStringFragments::wrap)

    public fun stringifyNumber(x: Number): String =
        software.amazon.awscdk.Tokenization.stringifyNumber(x)

    internal fun wrap(cdkObject: software.amazon.awscdk.Tokenization): Tokenization =
        Tokenization(cdkObject)

    internal fun unwrap(wrapped: Tokenization): software.amazon.awscdk.Tokenization =
        wrapped.cdkObject as software.amazon.awscdk.Tokenization
  }
}
