@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.macie

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnCustomDataIdentifierProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun ignoreWords(): List<String> = unwrap(this).getIgnoreWords() ?: emptyList()

  public fun keywords(): List<String> = unwrap(this).getKeywords() ?: emptyList()

  public fun maximumMatchDistance(): Number? = unwrap(this).getMaximumMatchDistance()

  public fun name(): String

  public fun regex(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun ignoreWords(ignoreWords: List<String>)

    public fun ignoreWords(vararg ignoreWords: String)

    public fun keywords(keywords: List<String>)

    public fun keywords(vararg keywords: String)

    public fun maximumMatchDistance(maximumMatchDistance: Number)

    public fun name(name: String)

    public fun regex(regex: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.macie.CfnCustomDataIdentifierProps.Builder =
        software.amazon.awscdk.services.macie.CfnCustomDataIdentifierProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun ignoreWords(ignoreWords: List<String>) {
      cdkBuilder.ignoreWords(ignoreWords)
    }

    override fun ignoreWords(vararg ignoreWords: String): Unit = ignoreWords(ignoreWords.toList())

    override fun keywords(keywords: List<String>) {
      cdkBuilder.keywords(keywords)
    }

    override fun keywords(vararg keywords: String): Unit = keywords(keywords.toList())

    override fun maximumMatchDistance(maximumMatchDistance: Number) {
      cdkBuilder.maximumMatchDistance(maximumMatchDistance)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun regex(regex: String) {
      cdkBuilder.regex(regex)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.macie.CfnCustomDataIdentifierProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.macie.CfnCustomDataIdentifierProps,
  ) : CdkObject(cdkObject), CfnCustomDataIdentifierProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun ignoreWords(): List<String> = unwrap(this).getIgnoreWords() ?: emptyList()

    override fun keywords(): List<String> = unwrap(this).getKeywords() ?: emptyList()

    override fun maximumMatchDistance(): Number? = unwrap(this).getMaximumMatchDistance()

    override fun name(): String = unwrap(this).getName()

    override fun regex(): String = unwrap(this).getRegex()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCustomDataIdentifierProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnCustomDataIdentifierProps):
        CfnCustomDataIdentifierProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCustomDataIdentifierProps):
        software.amazon.awscdk.services.macie.CfnCustomDataIdentifierProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.macie.CfnCustomDataIdentifierProps
  }
}
