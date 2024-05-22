@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::IVS::PlaybackRestrictionPolicy` resource specifies an  playback restriction policy.
 *
 * A playback restriction policy constrains playback by country and/or origin sites. For more
 * information, see [Undesired Content and
 * Viewers](https://docs.aws.amazon.com/ivs/latest/LowLatencyUserGuide/undesired-content.html) in the
 * *Amazon IVS Low-Latency Streaming User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ivs.*;
 * CfnPlaybackRestrictionPolicy cfnPlaybackRestrictionPolicy =
 * CfnPlaybackRestrictionPolicy.Builder.create(this, "MyCfnPlaybackRestrictionPolicy")
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
public open class CfnPlaybackRestrictionPolicy(
  cdkObject: software.amazon.awscdk.services.ivs.CfnPlaybackRestrictionPolicy,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPlaybackRestrictionPolicyProps,
  ) :
      this(software.amazon.awscdk.services.ivs.CfnPlaybackRestrictionPolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPlaybackRestrictionPolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPlaybackRestrictionPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPlaybackRestrictionPolicyProps(props)
  )

  /**
   * A list of country codes that control geoblocking restrictions.
   */
  public open fun allowedCountries(): List<String> = unwrap(this).getAllowedCountries()

  /**
   * A list of country codes that control geoblocking restrictions.
   */
  public open fun allowedCountries(`value`: List<String>) {
    unwrap(this).setAllowedCountries(`value`)
  }

  /**
   * A list of country codes that control geoblocking restrictions.
   */
  public open fun allowedCountries(vararg `value`: String): Unit =
      allowedCountries(`value`.toList())

  /**
   * A list of origin sites that control CORS restriction.
   */
  public open fun allowedOrigins(): List<String> = unwrap(this).getAllowedOrigins()

  /**
   * A list of origin sites that control CORS restriction.
   */
  public open fun allowedOrigins(`value`: List<String>) {
    unwrap(this).setAllowedOrigins(`value`)
  }

  /**
   * A list of origin sites that control CORS restriction.
   */
  public open fun allowedOrigins(vararg `value`: String): Unit = allowedOrigins(`value`.toList())

  /**
   * The playback-restriction-policy ARN.
   *
   * For example: `arn:aws:ivs:us-west-2:123456789012:playback-restriction-policy/abcdABCDefgh`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Whether channel playback is constrained by the origin site.
   */
  public open fun enableStrictOriginEnforcement(): Any? =
      unwrap(this).getEnableStrictOriginEnforcement()

  /**
   * Whether channel playback is constrained by the origin site.
   */
  public open fun enableStrictOriginEnforcement(`value`: Boolean) {
    unwrap(this).setEnableStrictOriginEnforcement(`value`)
  }

  /**
   * Whether channel playback is constrained by the origin site.
   */
  public open fun enableStrictOriginEnforcement(`value`: IResolvable) {
    unwrap(this).setEnableStrictOriginEnforcement(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Playback-restriction-policy name.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * Playback-restriction-policy name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ivs.CfnPlaybackRestrictionPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of country codes that control geoblocking restrictions.
     *
     * Allowed values are the officially assigned ISO 3166-1 alpha-2 codes. Default: All countries
     * (an empty array).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-allowedcountries)
     * @param allowedCountries A list of country codes that control geoblocking restrictions. 
     */
    public fun allowedCountries(allowedCountries: List<String>)

    /**
     * A list of country codes that control geoblocking restrictions.
     *
     * Allowed values are the officially assigned ISO 3166-1 alpha-2 codes. Default: All countries
     * (an empty array).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-allowedcountries)
     * @param allowedCountries A list of country codes that control geoblocking restrictions. 
     */
    public fun allowedCountries(vararg allowedCountries: String)

    /**
     * A list of origin sites that control CORS restriction.
     *
     * Allowed values are the same as valid values of the Origin header defined at
     * [https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin"](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-allowedorigins)
     * @param allowedOrigins A list of origin sites that control CORS restriction. 
     */
    public fun allowedOrigins(allowedOrigins: List<String>)

    /**
     * A list of origin sites that control CORS restriction.
     *
     * Allowed values are the same as valid values of the Origin header defined at
     * [https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin"](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-allowedorigins)
     * @param allowedOrigins A list of origin sites that control CORS restriction. 
     */
    public fun allowedOrigins(vararg allowedOrigins: String)

    /**
     * Whether channel playback is constrained by the origin site.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-enablestrictoriginenforcement)
     * @param enableStrictOriginEnforcement Whether channel playback is constrained by the origin
     * site. 
     */
    public fun enableStrictOriginEnforcement(enableStrictOriginEnforcement: Boolean)

    /**
     * Whether channel playback is constrained by the origin site.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-enablestrictoriginenforcement)
     * @param enableStrictOriginEnforcement Whether channel playback is constrained by the origin
     * site. 
     */
    public fun enableStrictOriginEnforcement(enableStrictOriginEnforcement: IResolvable)

    /**
     * Playback-restriction-policy name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-name)
     * @param name Playback-restriction-policy name. 
     */
    public fun name(name: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-playbackrestrictionpolicy-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-playbackrestrictionpolicy-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnPlaybackRestrictionPolicy.Builder
        = software.amazon.awscdk.services.ivs.CfnPlaybackRestrictionPolicy.Builder.create(scope, id)

    /**
     * A list of country codes that control geoblocking restrictions.
     *
     * Allowed values are the officially assigned ISO 3166-1 alpha-2 codes. Default: All countries
     * (an empty array).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-allowedcountries)
     * @param allowedCountries A list of country codes that control geoblocking restrictions. 
     */
    override fun allowedCountries(allowedCountries: List<String>) {
      cdkBuilder.allowedCountries(allowedCountries)
    }

    /**
     * A list of country codes that control geoblocking restrictions.
     *
     * Allowed values are the officially assigned ISO 3166-1 alpha-2 codes. Default: All countries
     * (an empty array).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-allowedcountries)
     * @param allowedCountries A list of country codes that control geoblocking restrictions. 
     */
    override fun allowedCountries(vararg allowedCountries: String): Unit =
        allowedCountries(allowedCountries.toList())

    /**
     * A list of origin sites that control CORS restriction.
     *
     * Allowed values are the same as valid values of the Origin header defined at
     * [https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin"](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-allowedorigins)
     * @param allowedOrigins A list of origin sites that control CORS restriction. 
     */
    override fun allowedOrigins(allowedOrigins: List<String>) {
      cdkBuilder.allowedOrigins(allowedOrigins)
    }

    /**
     * A list of origin sites that control CORS restriction.
     *
     * Allowed values are the same as valid values of the Origin header defined at
     * [https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin"](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-allowedorigins)
     * @param allowedOrigins A list of origin sites that control CORS restriction. 
     */
    override fun allowedOrigins(vararg allowedOrigins: String): Unit =
        allowedOrigins(allowedOrigins.toList())

    /**
     * Whether channel playback is constrained by the origin site.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-enablestrictoriginenforcement)
     * @param enableStrictOriginEnforcement Whether channel playback is constrained by the origin
     * site. 
     */
    override fun enableStrictOriginEnforcement(enableStrictOriginEnforcement: Boolean) {
      cdkBuilder.enableStrictOriginEnforcement(enableStrictOriginEnforcement)
    }

    /**
     * Whether channel playback is constrained by the origin site.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-enablestrictoriginenforcement)
     * @param enableStrictOriginEnforcement Whether channel playback is constrained by the origin
     * site. 
     */
    override fun enableStrictOriginEnforcement(enableStrictOriginEnforcement: IResolvable) {
      cdkBuilder.enableStrictOriginEnforcement(enableStrictOriginEnforcement.let(IResolvable.Companion::unwrap))
    }

    /**
     * Playback-restriction-policy name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-name)
     * @param name Playback-restriction-policy name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-playbackrestrictionpolicy-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-playbackrestrictionpolicy-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackrestrictionpolicy.html#cfn-ivs-playbackrestrictionpolicy-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ivs.CfnPlaybackRestrictionPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ivs.CfnPlaybackRestrictionPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPlaybackRestrictionPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPlaybackRestrictionPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnPlaybackRestrictionPolicy):
        CfnPlaybackRestrictionPolicy = CfnPlaybackRestrictionPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnPlaybackRestrictionPolicy):
        software.amazon.awscdk.services.ivs.CfnPlaybackRestrictionPolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.ivs.CfnPlaybackRestrictionPolicy
  }
}
