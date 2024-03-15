@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.customerprofiles

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDomainProps {
  public fun deadLetterQueueUrl(): String? = unwrap(this).getDeadLetterQueueUrl()

  public fun defaultEncryptionKey(): String? = unwrap(this).getDefaultEncryptionKey()

  public fun defaultExpirationDays(): Number

  public fun domainName(): String

  public fun matching(): Any? = unwrap(this).getMatching()

  public fun ruleBasedMatching(): Any? = unwrap(this).getRuleBasedMatching()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun deadLetterQueueUrl(deadLetterQueueUrl: String)

    public fun defaultEncryptionKey(defaultEncryptionKey: String)

    public fun defaultExpirationDays(defaultExpirationDays: Number)

    public fun domainName(domainName: String)

    public fun matching(matching: IResolvable)

    public fun matching(matching: CfnDomain.MatchingProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("616c3918a5393a6a5027daf5ea382fa821ebf54d29fd36ba7c7f98cef57ca758")
    public fun matching(matching: CfnDomain.MatchingProperty.Builder.() -> Unit)

    public fun ruleBasedMatching(ruleBasedMatching: IResolvable)

    public fun ruleBasedMatching(ruleBasedMatching: CfnDomain.RuleBasedMatchingProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("605a04d3abbfdc9a3c6ad04e7489192f80af21dd850989cbb6e5e9ffe25157ee")
    public
        fun ruleBasedMatching(ruleBasedMatching: CfnDomain.RuleBasedMatchingProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.customerprofiles.CfnDomainProps.Builder
        = software.amazon.awscdk.services.customerprofiles.CfnDomainProps.builder()

    override fun deadLetterQueueUrl(deadLetterQueueUrl: String) {
      cdkBuilder.deadLetterQueueUrl(deadLetterQueueUrl)
    }

    override fun defaultEncryptionKey(defaultEncryptionKey: String) {
      cdkBuilder.defaultEncryptionKey(defaultEncryptionKey)
    }

    override fun defaultExpirationDays(defaultExpirationDays: Number) {
      cdkBuilder.defaultExpirationDays(defaultExpirationDays)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun matching(matching: IResolvable) {
      cdkBuilder.matching(matching.let(IResolvable::unwrap))
    }

    override fun matching(matching: CfnDomain.MatchingProperty) {
      cdkBuilder.matching(matching.let(CfnDomain.MatchingProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("616c3918a5393a6a5027daf5ea382fa821ebf54d29fd36ba7c7f98cef57ca758")
    override fun matching(matching: CfnDomain.MatchingProperty.Builder.() -> Unit): Unit =
        matching(CfnDomain.MatchingProperty(matching))

    override fun ruleBasedMatching(ruleBasedMatching: IResolvable) {
      cdkBuilder.ruleBasedMatching(ruleBasedMatching.let(IResolvable::unwrap))
    }

    override fun ruleBasedMatching(ruleBasedMatching: CfnDomain.RuleBasedMatchingProperty) {
      cdkBuilder.ruleBasedMatching(ruleBasedMatching.let(CfnDomain.RuleBasedMatchingProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("605a04d3abbfdc9a3c6ad04e7489192f80af21dd850989cbb6e5e9ffe25157ee")
    override
        fun ruleBasedMatching(ruleBasedMatching: CfnDomain.RuleBasedMatchingProperty.Builder.() -> Unit):
        Unit = ruleBasedMatching(CfnDomain.RuleBasedMatchingProperty(ruleBasedMatching))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.customerprofiles.CfnDomainProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomainProps,
  ) : CdkObject(cdkObject), CfnDomainProps {
    override fun deadLetterQueueUrl(): String? = unwrap(this).getDeadLetterQueueUrl()

    override fun defaultEncryptionKey(): String? = unwrap(this).getDefaultEncryptionKey()

    override fun defaultExpirationDays(): Number = unwrap(this).getDefaultExpirationDays()

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun matching(): Any? = unwrap(this).getMatching()

    override fun ruleBasedMatching(): Any? = unwrap(this).getRuleBasedMatching()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomainProps):
        CfnDomainProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainProps):
        software.amazon.awscdk.services.customerprofiles.CfnDomainProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.customerprofiles.CfnDomainProps
  }
}
