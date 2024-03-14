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
    public fun allowlist(allowlist: List<String>) {
    }

    public fun denylist(denylist: List<String>) {
    }

    public fun matchPrefixes(matchPrefixes: List<String>) {
    }

    public fun matchSuffixes(matchSuffixes: List<String>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.StringConditions.Builder =
        software.amazon.awscdk.services.sns.StringConditions.builder()

    public override fun allowlist(allowlist: List<String>) {
      cdkBuilder.allowlist(allowlist)
    }

    public override fun denylist(denylist: List<String>) {
      cdkBuilder.denylist(denylist)
    }

    public override fun matchPrefixes(matchPrefixes: List<String>) {
      cdkBuilder.matchPrefixes(matchPrefixes)
    }

    public override fun matchSuffixes(matchSuffixes: List<String>) {
      cdkBuilder.matchSuffixes(matchSuffixes)
    }

    public fun build(): software.amazon.awscdk.services.sns.StringConditions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.sns.StringConditions,
  ) : StringConditions {
    public override fun allowlist(): List<String> = unwrap(this).getAllowlist() ?: emptyList()

    public override fun denylist(): List<String> = unwrap(this).getDenylist() ?: emptyList()

    public override fun matchPrefixes(): List<String> = unwrap(this).getMatchPrefixes() ?:
        emptyList()

    public override fun matchSuffixes(): List<String> = unwrap(this).getMatchSuffixes() ?:
        emptyList()
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
