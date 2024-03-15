@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface RoutingRule {
  public fun condition(): RoutingRuleCondition? =
      unwrap(this).getCondition()?.let(RoutingRuleCondition::wrap)

  public fun hostName(): String? = unwrap(this).getHostName()

  public fun httpRedirectCode(): String? = unwrap(this).getHttpRedirectCode()

  public fun protocol(): RedirectProtocol? = unwrap(this).getProtocol()?.let(RedirectProtocol::wrap)

  public fun replaceKey(): ReplaceKey? = unwrap(this).getReplaceKey()?.let(ReplaceKey::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun condition(condition: RoutingRuleCondition)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("343b62e0c35922af7d69081fbaa066d8dcba0345f65421dbfb265797fd504091")
    public fun condition(condition: RoutingRuleCondition.Builder.() -> Unit)

    public fun hostName(hostName: String)

    public fun httpRedirectCode(httpRedirectCode: String)

    public fun protocol(protocol: RedirectProtocol)

    public fun replaceKey(replaceKey: ReplaceKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.RoutingRule.Builder =
        software.amazon.awscdk.services.s3.RoutingRule.builder()

    override fun condition(condition: RoutingRuleCondition) {
      cdkBuilder.condition(condition.let(RoutingRuleCondition::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("343b62e0c35922af7d69081fbaa066d8dcba0345f65421dbfb265797fd504091")
    override fun condition(condition: RoutingRuleCondition.Builder.() -> Unit): Unit =
        condition(RoutingRuleCondition(condition))

    override fun hostName(hostName: String) {
      cdkBuilder.hostName(hostName)
    }

    override fun httpRedirectCode(httpRedirectCode: String) {
      cdkBuilder.httpRedirectCode(httpRedirectCode)
    }

    override fun protocol(protocol: RedirectProtocol) {
      cdkBuilder.protocol(protocol.let(RedirectProtocol::unwrap))
    }

    override fun replaceKey(replaceKey: ReplaceKey) {
      cdkBuilder.replaceKey(replaceKey.let(ReplaceKey::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.RoutingRule = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.RoutingRule,
  ) : CdkObject(cdkObject), RoutingRule {
    override fun condition(): RoutingRuleCondition? =
        unwrap(this).getCondition()?.let(RoutingRuleCondition::wrap)

    override fun hostName(): String? = unwrap(this).getHostName()

    override fun httpRedirectCode(): String? = unwrap(this).getHttpRedirectCode()

    override fun protocol(): RedirectProtocol? =
        unwrap(this).getProtocol()?.let(RedirectProtocol::wrap)

    override fun replaceKey(): ReplaceKey? = unwrap(this).getReplaceKey()?.let(ReplaceKey::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RoutingRule {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.RoutingRule): RoutingRule =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RoutingRule): software.amazon.awscdk.services.s3.RoutingRule =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.s3.RoutingRule
  }
}
