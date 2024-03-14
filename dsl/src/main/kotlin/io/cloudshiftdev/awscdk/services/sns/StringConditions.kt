package io.cloudshiftdev.awscdk.services.sns

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface StringConditions {
  public fun allowlist(): List<String> = unwrap(this).getAllowlist() ?: emptyList()

  public fun denylist(): List<String> = unwrap(this).getDenylist() ?: emptyList()

  public fun matchPrefixes(): List<String> = unwrap(this).getMatchPrefixes() ?: emptyList()

  public fun matchSuffixes(): List<String> = unwrap(this).getMatchSuffixes() ?: emptyList()

  public interface Builder {
    public fun allowlist(allowlist: List<String>)

    public fun allowlist(vararg allowlist: String)

    public fun denylist(denylist: List<String>)

    public fun denylist(vararg denylist: String)

    public fun matchPrefixes(matchPrefixes: List<String>)

    public fun matchPrefixes(vararg matchPrefixes: String)

    public fun matchSuffixes(matchSuffixes: List<String>)

    public fun matchSuffixes(vararg matchSuffixes: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.StringConditions.Builder =
        software.amazon.awscdk.services.sns.StringConditions.builder()

    override fun allowlist(allowlist: List<String>) {
      cdkBuilder.allowlist(allowlist)
    }

    override fun allowlist(vararg allowlist: String): Unit = allowlist(allowlist.toList())

    override fun denylist(denylist: List<String>) {
      cdkBuilder.denylist(denylist)
    }

    override fun denylist(vararg denylist: String): Unit = denylist(denylist.toList())

    override fun matchPrefixes(matchPrefixes: List<String>) {
      cdkBuilder.matchPrefixes(matchPrefixes)
    }

    override fun matchPrefixes(vararg matchPrefixes: String): Unit =
        matchPrefixes(matchPrefixes.toList())

    override fun matchSuffixes(matchSuffixes: List<String>) {
      cdkBuilder.matchSuffixes(matchSuffixes)
    }

    override fun matchSuffixes(vararg matchSuffixes: String): Unit =
        matchSuffixes(matchSuffixes.toList())

    public fun build(): software.amazon.awscdk.services.sns.StringConditions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.sns.StringConditions,
  ) : StringConditions {
    override fun allowlist(): List<String> = unwrap(this).getAllowlist() ?: emptyList()

    override fun denylist(): List<String> = unwrap(this).getDenylist() ?: emptyList()

    override fun matchPrefixes(): List<String> = unwrap(this).getMatchPrefixes() ?: emptyList()

    override fun matchSuffixes(): List<String> = unwrap(this).getMatchSuffixes() ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): StringConditions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.StringConditions):
        StringConditions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StringConditions):
        software.amazon.awscdk.services.sns.StringConditions = (wrapped as Wrapper).cdkObject
  }
}
