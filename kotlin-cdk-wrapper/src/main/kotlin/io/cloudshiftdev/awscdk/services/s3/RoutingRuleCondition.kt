@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * Bucket bucket = Bucket.Builder.create(this, "MyRedirectedBucket")
 * .websiteRoutingRules(List.of(RoutingRule.builder()
 * .hostName("www.example.com")
 * .httpRedirectCode("302")
 * .protocol(RedirectProtocol.HTTPS)
 * .replaceKey(ReplaceKey.prefixWith("test/"))
 * .condition(RoutingRuleCondition.builder()
 * .httpErrorCodeReturnedEquals("200")
 * .keyPrefixEquals("prefix")
 * .build())
 * .build()))
 * .build();
 * ```
 */
public interface RoutingRuleCondition {
  /**
   * The HTTP error code when the redirect is applied.
   *
   * In the event of an error, if the error code equals this value, then the specified redirect is
   * applied.
   *
   * If both condition properties are specified, both must be true for the redirect to be applied.
   *
   * Default: - The HTTP error code will not be verified
   */
  public fun httpErrorCodeReturnedEquals(): String? = unwrap(this).getHttpErrorCodeReturnedEquals()

  /**
   * The object key name prefix when the redirect is applied.
   *
   * If both condition properties are specified, both must be true for the redirect to be applied.
   *
   * Default: - The object key name will not be verified
   */
  public fun keyPrefixEquals(): String? = unwrap(this).getKeyPrefixEquals()

  /**
   * A builder for [RoutingRuleCondition]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param httpErrorCodeReturnedEquals The HTTP error code when the redirect is applied.
     * In the event of an error, if the error code equals this value, then the specified redirect is
     * applied.
     *
     * If both condition properties are specified, both must be true for the redirect to be applied.
     */
    public fun httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals: String)

    /**
     * @param keyPrefixEquals The object key name prefix when the redirect is applied.
     * If both condition properties are specified, both must be true for the redirect to be applied.
     */
    public fun keyPrefixEquals(keyPrefixEquals: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.RoutingRuleCondition.Builder =
        software.amazon.awscdk.services.s3.RoutingRuleCondition.builder()

    /**
     * @param httpErrorCodeReturnedEquals The HTTP error code when the redirect is applied.
     * In the event of an error, if the error code equals this value, then the specified redirect is
     * applied.
     *
     * If both condition properties are specified, both must be true for the redirect to be applied.
     */
    override fun httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals: String) {
      cdkBuilder.httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals)
    }

    /**
     * @param keyPrefixEquals The object key name prefix when the redirect is applied.
     * If both condition properties are specified, both must be true for the redirect to be applied.
     */
    override fun keyPrefixEquals(keyPrefixEquals: String) {
      cdkBuilder.keyPrefixEquals(keyPrefixEquals)
    }

    public fun build(): software.amazon.awscdk.services.s3.RoutingRuleCondition = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.RoutingRuleCondition,
  ) : CdkObject(cdkObject), RoutingRuleCondition {
    /**
     * The HTTP error code when the redirect is applied.
     *
     * In the event of an error, if the error code equals this value, then the specified redirect is
     * applied.
     *
     * If both condition properties are specified, both must be true for the redirect to be applied.
     *
     * Default: - The HTTP error code will not be verified
     */
    override fun httpErrorCodeReturnedEquals(): String? =
        unwrap(this).getHttpErrorCodeReturnedEquals()

    /**
     * The object key name prefix when the redirect is applied.
     *
     * If both condition properties are specified, both must be true for the redirect to be applied.
     *
     * Default: - The object key name will not be verified
     */
    override fun keyPrefixEquals(): String? = unwrap(this).getKeyPrefixEquals()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RoutingRuleCondition {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.RoutingRuleCondition):
        RoutingRuleCondition = CdkObjectWrappers.wrap(cdkObject) as RoutingRuleCondition

    internal fun unwrap(wrapped: RoutingRuleCondition):
        software.amazon.awscdk.services.s3.RoutingRuleCondition = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.s3.RoutingRuleCondition
  }
}
