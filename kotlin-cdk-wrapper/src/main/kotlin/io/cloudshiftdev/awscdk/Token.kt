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
 * Represents a special or lazily-evaluated value.
 *
 * Can be used to delay evaluation of a certain value in case, for example,
 * that it requires some context or late-bound data. Can also be used to
 * mark values that need special processing at document rendering time.
 *
 * Tokens can be embedded into strings while retaining their original
 * semantics.
 */
public open class Token(
  cdkObject: software.amazon.awscdk.Token,
) : CdkObject(cdkObject) {
  public companion object {
    public fun asAny(`value`: Any): IResolvable =
        software.amazon.awscdk.Token.asAny(`value`).let(IResolvable::wrap)

    public fun asList(`value`: Any): List<String> = software.amazon.awscdk.Token.asList(`value`)

    public fun asList(`value`: Any, options: EncodingOptions): List<String> =
        software.amazon.awscdk.Token.asList(`value`, options.let(EncodingOptions.Companion::unwrap))

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71c301f4d135222014b54f1101d2150ef2f4eae8df253a9ddeafbebe3d869be2")
    public fun asList(`value`: Any, options: EncodingOptions.Builder.() -> Unit): List<String> =
        asList(`value`, EncodingOptions(options))

    public fun asNumber(`value`: Any): Number = software.amazon.awscdk.Token.asNumber(`value`)

    public fun asString(`value`: Any): String = software.amazon.awscdk.Token.asString(`value`)

    public fun asString(`value`: Any, options: EncodingOptions): String =
        software.amazon.awscdk.Token.asString(`value`,
        options.let(EncodingOptions.Companion::unwrap))

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bed20f382e13a2fe74d4737ca66d5b4f6e9aafe77d5a63e6cf8ff6ac901f119")
    public fun asString(`value`: Any, options: EncodingOptions.Builder.() -> Unit): String =
        asString(`value`, EncodingOptions(options))

    public fun compareStrings(possibleToken1: String, possibleToken2: String): TokenComparison =
        software.amazon.awscdk.Token.compareStrings(possibleToken1,
        possibleToken2).let(TokenComparison::wrap)

    public fun isUnresolved(obj: Any): Boolean = software.amazon.awscdk.Token.isUnresolved(obj)

    internal fun wrap(cdkObject: software.amazon.awscdk.Token): Token = Token(cdkObject)

    internal fun unwrap(wrapped: Token): software.amazon.awscdk.Token = wrapped.cdkObject as
        software.amazon.awscdk.Token
  }
}
