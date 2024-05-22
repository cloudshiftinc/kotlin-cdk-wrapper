@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnPlaybackRestrictionPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ivs.*;
 * CfnPlaybackRestrictionPolicyProps cfnPlaybackRestrictionPolicyProps =
 * CfnPlaybackRestrictionPolicyProps.builder()
 * .allowedCountries(List.of("allowedCountries"))
 * .allowedOrigins(List.of("allowedOrigins"))
 * // the properties below are optional
 * .enableStrictOriginEnforcement(false)
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html)
 */
public interface CfnPlaybackRestrictionPolicyProps {
  /**
   * A list of country codes that control geoblocking restrictions.
   *
   * Allowed values are the officially assigned ISO 3166-1 alpha-2 codes. Default: All countries (an
   * empty array).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-allowedcountries)
   */
  public fun allowedCountries(): List<String>

  /**
   * A list of origin sites that control CORS restriction.
   *
   * Allowed values are the same as valid values of the Origin header defined at
   * [https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin"](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-allowedorigins)
   */
  public fun allowedOrigins(): List<String>

  /**
   * Whether channel playback is constrained by the origin site.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-enablestrictoriginenforcement)
   */
  public fun enableStrictOriginEnforcement(): Any? = unwrap(this).getEnableStrictOriginEnforcement()

  /**
   * Playback-restriction-policy name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-playbackrestrictionpolicy-tag.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPlaybackRestrictionPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowedCountries A list of country codes that control geoblocking restrictions. 
     * Allowed values are the officially assigned ISO 3166-1 alpha-2 codes. Default: All countries
     * (an empty array).
     */
    public fun allowedCountries(allowedCountries: List<String>)

    /**
     * @param allowedCountries A list of country codes that control geoblocking restrictions. 
     * Allowed values are the officially assigned ISO 3166-1 alpha-2 codes. Default: All countries
     * (an empty array).
     */
    public fun allowedCountries(vararg allowedCountries: String)

    /**
     * @param allowedOrigins A list of origin sites that control CORS restriction. 
     * Allowed values are the same as valid values of the Origin header defined at
     * [https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin"](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin)
     */
    public fun allowedOrigins(allowedOrigins: List<String>)

    /**
     * @param allowedOrigins A list of origin sites that control CORS restriction. 
     * Allowed values are the same as valid values of the Origin header defined at
     * [https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin"](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin)
     */
    public fun allowedOrigins(vararg allowedOrigins: String)

    /**
     * @param enableStrictOriginEnforcement Whether channel playback is constrained by the origin
     * site.
     */
    public fun enableStrictOriginEnforcement(enableStrictOriginEnforcement: Boolean)

    /**
     * @param enableStrictOriginEnforcement Whether channel playback is constrained by the origin
     * site.
     */
    public fun enableStrictOriginEnforcement(enableStrictOriginEnforcement: IResolvable)

    /**
     * @param name Playback-restriction-policy name.
     */
    public fun name(name: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-playbackrestrictionpolicy-tag.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-playbackrestrictionpolicy-tag.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ivs.CfnPlaybackRestrictionPolicyProps.Builder =
        software.amazon.awscdk.services.ivs.CfnPlaybackRestrictionPolicyProps.builder()

    /**
     * @param allowedCountries A list of country codes that control geoblocking restrictions. 
     * Allowed values are the officially assigned ISO 3166-1 alpha-2 codes. Default: All countries
     * (an empty array).
     */
    override fun allowedCountries(allowedCountries: List<String>) {
      cdkBuilder.allowedCountries(allowedCountries)
    }

    /**
     * @param allowedCountries A list of country codes that control geoblocking restrictions. 
     * Allowed values are the officially assigned ISO 3166-1 alpha-2 codes. Default: All countries
     * (an empty array).
     */
    override fun allowedCountries(vararg allowedCountries: String): Unit =
        allowedCountries(allowedCountries.toList())

    /**
     * @param allowedOrigins A list of origin sites that control CORS restriction. 
     * Allowed values are the same as valid values of the Origin header defined at
     * [https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin"](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin)
     */
    override fun allowedOrigins(allowedOrigins: List<String>) {
      cdkBuilder.allowedOrigins(allowedOrigins)
    }

    /**
     * @param allowedOrigins A list of origin sites that control CORS restriction. 
     * Allowed values are the same as valid values of the Origin header defined at
     * [https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin"](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin)
     */
    override fun allowedOrigins(vararg allowedOrigins: String): Unit =
        allowedOrigins(allowedOrigins.toList())

    /**
     * @param enableStrictOriginEnforcement Whether channel playback is constrained by the origin
     * site.
     */
    override fun enableStrictOriginEnforcement(enableStrictOriginEnforcement: Boolean) {
      cdkBuilder.enableStrictOriginEnforcement(enableStrictOriginEnforcement)
    }

    /**
     * @param enableStrictOriginEnforcement Whether channel playback is constrained by the origin
     * site.
     */
    override fun enableStrictOriginEnforcement(enableStrictOriginEnforcement: IResolvable) {
      cdkBuilder.enableStrictOriginEnforcement(enableStrictOriginEnforcement.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param name Playback-restriction-policy name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-playbackrestrictionpolicy-tag.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-playbackrestrictionpolicy-tag.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ivs.CfnPlaybackRestrictionPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ivs.CfnPlaybackRestrictionPolicyProps,
  ) : CdkObject(cdkObject), CfnPlaybackRestrictionPolicyProps {
    /**
     * A list of country codes that control geoblocking restrictions.
     *
     * Allowed values are the officially assigned ISO 3166-1 alpha-2 codes. Default: All countries
     * (an empty array).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-allowedcountries)
     */
    override fun allowedCountries(): List<String> = unwrap(this).getAllowedCountries()

    /**
     * A list of origin sites that control CORS restriction.
     *
     * Allowed values are the same as valid values of the Origin header defined at
     * [https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin"](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-allowedorigins)
     */
    override fun allowedOrigins(): List<String> = unwrap(this).getAllowedOrigins()

    /**
     * Whether channel playback is constrained by the origin site.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-enablestrictoriginenforcement)
     */
    override fun enableStrictOriginEnforcement(): Any? =
        unwrap(this).getEnableStrictOriginEnforcement()

    /**
     * Playback-restriction-policy name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-playbackrestrictionpolicy-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPlaybackRestrictionPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnPlaybackRestrictionPolicyProps):
        CfnPlaybackRestrictionPolicyProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnPlaybackRestrictionPolicyProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPlaybackRestrictionPolicyProps):
        software.amazon.awscdk.services.ivs.CfnPlaybackRestrictionPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ivs.CfnPlaybackRestrictionPolicyProps
  }
}
