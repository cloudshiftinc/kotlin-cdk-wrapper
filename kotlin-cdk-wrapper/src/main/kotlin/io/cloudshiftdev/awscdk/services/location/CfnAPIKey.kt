@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The API key resource in your AWS account, which lets you grant actions for Amazon Location
 * resources to the API key bearer.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.location.*;
 * CfnAPIKey cfnAPIKey = CfnAPIKey.Builder.create(this, "MyCfnAPIKey")
 * .keyName("keyName")
 * .restrictions(ApiKeyRestrictionsProperty.builder()
 * .allowActions(List.of("allowActions"))
 * .allowResources(List.of("allowResources"))
 * // the properties below are optional
 * .allowReferers(List.of("allowReferers"))
 * .build())
 * // the properties below are optional
 * .description("description")
 * .expireTime("expireTime")
 * .forceDelete(false)
 * .forceUpdate(false)
 * .noExpiry(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html)
 */
public open class CfnAPIKey(
  cdkObject: software.amazon.awscdk.services.location.CfnAPIKey,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAPIKeyProps,
  ) :
      this(software.amazon.awscdk.services.location.CfnAPIKey(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAPIKeyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAPIKeyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAPIKeyProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) for the resource.
   *
   * Used when you need to specify a resource across all AWS .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The timestamp for when the API key resource was created in ISO 8601 format:
   * YYYY-MM-DDThh:mm:ss.sssZ.
   */
  public open fun attrCreateTime(): String = unwrap(this).getAttrCreateTime()

  /**
   * The Amazon Resource Name (ARN) for the API key resource.
   *
   * Used when you need to specify a resource across all AWS .
   */
  public open fun attrKeyArn(): String = unwrap(this).getAttrKeyArn()

  /**
   * The timestamp for when the API key resource was last updated in ISO 8601 format:
   * `YYYY-MM-DDThh:mm:ss.sssZ` .
   */
  public open fun attrUpdateTime(): String = unwrap(this).getAttrUpdateTime()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Updates the description for the API key resource.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * Updates the description for the API key resource.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The optional timestamp for when the API key resource will expire in [ISO 8601
   * format](https://docs.aws.amazon.com/https://www.iso.org/iso-8601-date-and-time-format.html) .
   */
  public open fun expireTime(): String? = unwrap(this).getExpireTime()

  /**
   * The optional timestamp for when the API key resource will expire in [ISO 8601
   * format](https://docs.aws.amazon.com/https://www.iso.org/iso-8601-date-and-time-format.html) .
   */
  public open fun expireTime(`value`: String) {
    unwrap(this).setExpireTime(`value`)
  }

  /**
   * ForceDelete bypasses an API key's expiry conditions and deletes the key.
   */
  public open fun forceDelete(): Any? = unwrap(this).getForceDelete()

  /**
   * ForceDelete bypasses an API key's expiry conditions and deletes the key.
   */
  public open fun forceDelete(`value`: Boolean) {
    unwrap(this).setForceDelete(`value`)
  }

  /**
   * ForceDelete bypasses an API key's expiry conditions and deletes the key.
   */
  public open fun forceDelete(`value`: IResolvable) {
    unwrap(this).setForceDelete(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The boolean flag to be included for updating `ExpireTime` or Restrictions details.
   */
  public open fun forceUpdate(): Any? = unwrap(this).getForceUpdate()

  /**
   * The boolean flag to be included for updating `ExpireTime` or Restrictions details.
   */
  public open fun forceUpdate(`value`: Boolean) {
    unwrap(this).setForceUpdate(`value`)
  }

  /**
   * The boolean flag to be included for updating `ExpireTime` or Restrictions details.
   */
  public open fun forceUpdate(`value`: IResolvable) {
    unwrap(this).setForceUpdate(`value`.let(IResolvable.Companion::unwrap))
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
   * A custom name for the API key resource.
   */
  public open fun keyName(): String = unwrap(this).getKeyName()

  /**
   * A custom name for the API key resource.
   */
  public open fun keyName(`value`: String) {
    unwrap(this).setKeyName(`value`)
  }

  /**
   * Whether the API key should expire.
   */
  public open fun noExpiry(): Any? = unwrap(this).getNoExpiry()

  /**
   * Whether the API key should expire.
   */
  public open fun noExpiry(`value`: Boolean) {
    unwrap(this).setNoExpiry(`value`)
  }

  /**
   * Whether the API key should expire.
   */
  public open fun noExpiry(`value`: IResolvable) {
    unwrap(this).setNoExpiry(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The API key restrictions for the API key resource.
   */
  public open fun restrictions(): Any = unwrap(this).getRestrictions()

  /**
   * The API key restrictions for the API key resource.
   */
  public open fun restrictions(`value`: IResolvable) {
    unwrap(this).setRestrictions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The API key restrictions for the API key resource.
   */
  public open fun restrictions(`value`: ApiKeyRestrictionsProperty) {
    unwrap(this).setRestrictions(`value`.let(ApiKeyRestrictionsProperty.Companion::unwrap))
  }

  /**
   * The API key restrictions for the API key resource.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("de2d779539a481439a314d1ac07203d94326f20c265005251ab2980ac4da871c")
  public open fun restrictions(`value`: ApiKeyRestrictionsProperty.Builder.() -> Unit): Unit =
      restrictions(ApiKeyRestrictionsProperty(`value`))

  /**
   * Applies one or more tags to the map resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Applies one or more tags to the map resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Applies one or more tags to the map resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.location.CfnAPIKey].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Updates the description for the API key resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-description)
     * @param description Updates the description for the API key resource. 
     */
    public fun description(description: String)

    /**
     * The optional timestamp for when the API key resource will expire in [ISO 8601
     * format](https://docs.aws.amazon.com/https://www.iso.org/iso-8601-date-and-time-format.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-expiretime)
     * @param expireTime The optional timestamp for when the API key resource will expire in [ISO
     * 8601 format](https://docs.aws.amazon.com/https://www.iso.org/iso-8601-date-and-time-format.html)
     * . 
     */
    public fun expireTime(expireTime: String)

    /**
     * ForceDelete bypasses an API key's expiry conditions and deletes the key.
     *
     * Set the parameter `true` to delete the key or to `false` to not preemptively delete the API
     * key.
     *
     * Valid values: `true` , or `false` .
     *
     *
     * This action is irreversible. Only use ForceDelete if you are certain the key is no longer in
     * use.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-forcedelete)
     * @param forceDelete ForceDelete bypasses an API key's expiry conditions and deletes the key. 
     */
    public fun forceDelete(forceDelete: Boolean)

    /**
     * ForceDelete bypasses an API key's expiry conditions and deletes the key.
     *
     * Set the parameter `true` to delete the key or to `false` to not preemptively delete the API
     * key.
     *
     * Valid values: `true` , or `false` .
     *
     *
     * This action is irreversible. Only use ForceDelete if you are certain the key is no longer in
     * use.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-forcedelete)
     * @param forceDelete ForceDelete bypasses an API key's expiry conditions and deletes the key. 
     */
    public fun forceDelete(forceDelete: IResolvable)

    /**
     * The boolean flag to be included for updating `ExpireTime` or Restrictions details.
     *
     * Must be set to `true` to update an API key resource that has been used in the past 7 days.
     * `False` if force update is not preferred.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-forceupdate)
     * @param forceUpdate The boolean flag to be included for updating `ExpireTime` or Restrictions
     * details. 
     */
    public fun forceUpdate(forceUpdate: Boolean)

    /**
     * The boolean flag to be included for updating `ExpireTime` or Restrictions details.
     *
     * Must be set to `true` to update an API key resource that has been used in the past 7 days.
     * `False` if force update is not preferred.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-forceupdate)
     * @param forceUpdate The boolean flag to be included for updating `ExpireTime` or Restrictions
     * details. 
     */
    public fun forceUpdate(forceUpdate: IResolvable)

    /**
     * A custom name for the API key resource.
     *
     * Requirements:
     *
     * * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
     * underscores (_).
     * * Must be a unique API key name.
     * * No spaces allowed. For example, `ExampleAPIKey` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-keyname)
     * @param keyName A custom name for the API key resource. 
     */
    public fun keyName(keyName: String)

    /**
     * Whether the API key should expire.
     *
     * Set to `true` to set the API key to have no expiration time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-noexpiry)
     * @param noExpiry Whether the API key should expire. 
     */
    public fun noExpiry(noExpiry: Boolean)

    /**
     * Whether the API key should expire.
     *
     * Set to `true` to set the API key to have no expiration time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-noexpiry)
     * @param noExpiry Whether the API key should expire. 
     */
    public fun noExpiry(noExpiry: IResolvable)

    /**
     * The API key restrictions for the API key resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-restrictions)
     * @param restrictions The API key restrictions for the API key resource. 
     */
    public fun restrictions(restrictions: IResolvable)

    /**
     * The API key restrictions for the API key resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-restrictions)
     * @param restrictions The API key restrictions for the API key resource. 
     */
    public fun restrictions(restrictions: ApiKeyRestrictionsProperty)

    /**
     * The API key restrictions for the API key resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-restrictions)
     * @param restrictions The API key restrictions for the API key resource. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28df308d066f6b9260576bb3b0f83accbb556eecab505dc18fb18a99fee74a1d")
    public fun restrictions(restrictions: ApiKeyRestrictionsProperty.Builder.() -> Unit)

    /**
     * Applies one or more tags to the map resource.
     *
     * A tag is a key-value pair that helps manage, identify, search, and filter your resources by
     * labelling them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-tags)
     * @param tags Applies one or more tags to the map resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Applies one or more tags to the map resource.
     *
     * A tag is a key-value pair that helps manage, identify, search, and filter your resources by
     * labelling them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-tags)
     * @param tags Applies one or more tags to the map resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnAPIKey.Builder =
        software.amazon.awscdk.services.location.CfnAPIKey.Builder.create(scope, id)

    /**
     * Updates the description for the API key resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-description)
     * @param description Updates the description for the API key resource. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The optional timestamp for when the API key resource will expire in [ISO 8601
     * format](https://docs.aws.amazon.com/https://www.iso.org/iso-8601-date-and-time-format.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-expiretime)
     * @param expireTime The optional timestamp for when the API key resource will expire in [ISO
     * 8601 format](https://docs.aws.amazon.com/https://www.iso.org/iso-8601-date-and-time-format.html)
     * . 
     */
    override fun expireTime(expireTime: String) {
      cdkBuilder.expireTime(expireTime)
    }

    /**
     * ForceDelete bypasses an API key's expiry conditions and deletes the key.
     *
     * Set the parameter `true` to delete the key or to `false` to not preemptively delete the API
     * key.
     *
     * Valid values: `true` , or `false` .
     *
     *
     * This action is irreversible. Only use ForceDelete if you are certain the key is no longer in
     * use.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-forcedelete)
     * @param forceDelete ForceDelete bypasses an API key's expiry conditions and deletes the key. 
     */
    override fun forceDelete(forceDelete: Boolean) {
      cdkBuilder.forceDelete(forceDelete)
    }

    /**
     * ForceDelete bypasses an API key's expiry conditions and deletes the key.
     *
     * Set the parameter `true` to delete the key or to `false` to not preemptively delete the API
     * key.
     *
     * Valid values: `true` , or `false` .
     *
     *
     * This action is irreversible. Only use ForceDelete if you are certain the key is no longer in
     * use.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-forcedelete)
     * @param forceDelete ForceDelete bypasses an API key's expiry conditions and deletes the key. 
     */
    override fun forceDelete(forceDelete: IResolvable) {
      cdkBuilder.forceDelete(forceDelete.let(IResolvable.Companion::unwrap))
    }

    /**
     * The boolean flag to be included for updating `ExpireTime` or Restrictions details.
     *
     * Must be set to `true` to update an API key resource that has been used in the past 7 days.
     * `False` if force update is not preferred.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-forceupdate)
     * @param forceUpdate The boolean flag to be included for updating `ExpireTime` or Restrictions
     * details. 
     */
    override fun forceUpdate(forceUpdate: Boolean) {
      cdkBuilder.forceUpdate(forceUpdate)
    }

    /**
     * The boolean flag to be included for updating `ExpireTime` or Restrictions details.
     *
     * Must be set to `true` to update an API key resource that has been used in the past 7 days.
     * `False` if force update is not preferred.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-forceupdate)
     * @param forceUpdate The boolean flag to be included for updating `ExpireTime` or Restrictions
     * details. 
     */
    override fun forceUpdate(forceUpdate: IResolvable) {
      cdkBuilder.forceUpdate(forceUpdate.let(IResolvable.Companion::unwrap))
    }

    /**
     * A custom name for the API key resource.
     *
     * Requirements:
     *
     * * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
     * underscores (_).
     * * Must be a unique API key name.
     * * No spaces allowed. For example, `ExampleAPIKey` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-keyname)
     * @param keyName A custom name for the API key resource. 
     */
    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    /**
     * Whether the API key should expire.
     *
     * Set to `true` to set the API key to have no expiration time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-noexpiry)
     * @param noExpiry Whether the API key should expire. 
     */
    override fun noExpiry(noExpiry: Boolean) {
      cdkBuilder.noExpiry(noExpiry)
    }

    /**
     * Whether the API key should expire.
     *
     * Set to `true` to set the API key to have no expiration time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-noexpiry)
     * @param noExpiry Whether the API key should expire. 
     */
    override fun noExpiry(noExpiry: IResolvable) {
      cdkBuilder.noExpiry(noExpiry.let(IResolvable.Companion::unwrap))
    }

    /**
     * The API key restrictions for the API key resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-restrictions)
     * @param restrictions The API key restrictions for the API key resource. 
     */
    override fun restrictions(restrictions: IResolvable) {
      cdkBuilder.restrictions(restrictions.let(IResolvable.Companion::unwrap))
    }

    /**
     * The API key restrictions for the API key resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-restrictions)
     * @param restrictions The API key restrictions for the API key resource. 
     */
    override fun restrictions(restrictions: ApiKeyRestrictionsProperty) {
      cdkBuilder.restrictions(restrictions.let(ApiKeyRestrictionsProperty.Companion::unwrap))
    }

    /**
     * The API key restrictions for the API key resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-restrictions)
     * @param restrictions The API key restrictions for the API key resource. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28df308d066f6b9260576bb3b0f83accbb556eecab505dc18fb18a99fee74a1d")
    override fun restrictions(restrictions: ApiKeyRestrictionsProperty.Builder.() -> Unit): Unit =
        restrictions(ApiKeyRestrictionsProperty(restrictions))

    /**
     * Applies one or more tags to the map resource.
     *
     * A tag is a key-value pair that helps manage, identify, search, and filter your resources by
     * labelling them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-tags)
     * @param tags Applies one or more tags to the map resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Applies one or more tags to the map resource.
     *
     * A tag is a key-value pair that helps manage, identify, search, and filter your resources by
     * labelling them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-tags)
     * @param tags Applies one or more tags to the map resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.location.CfnAPIKey = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.location.CfnAPIKey.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAPIKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAPIKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnAPIKey): CfnAPIKey =
        CfnAPIKey(cdkObject)

    internal fun unwrap(wrapped: CfnAPIKey): software.amazon.awscdk.services.location.CfnAPIKey =
        wrapped.cdkObject as software.amazon.awscdk.services.location.CfnAPIKey
  }

  /**
   * API Restrictions on the allowed actions, resources, and referers for an API key resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.location.*;
   * ApiKeyRestrictionsProperty apiKeyRestrictionsProperty = ApiKeyRestrictionsProperty.builder()
   * .allowActions(List.of("allowActions"))
   * .allowResources(List.of("allowResources"))
   * // the properties below are optional
   * .allowReferers(List.of("allowReferers"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-apikey-apikeyrestrictions.html)
   */
  public interface ApiKeyRestrictionsProperty {
    /**
     * A list of allowed actions that an API key resource grants permissions to perform.
     *
     * You must have at least one action for each type of resource. For example, if you have a place
     * resource, you must include at least one place action.
     *
     * The following are valid values for the actions.
     *
     * * *Map actions*
     * * `geo:GetMap*` - Allows all actions needed for map rendering.
     * * *Place actions*
     * * `geo:SearchPlaceIndexForText` - Allows geocoding.
     * * `geo:SearchPlaceIndexForPosition` - Allows reverse geocoding.
     * * `geo:SearchPlaceIndexForSuggestions` - Allows generating suggestions from text.
     * * `geo:GetPlace` - Allows finding a place by place ID.
     * * *Route actions*
     * * `geo:CalculateRoute` - Allows point to point routing.
     * * `geo:CalculateRouteMatrix` - Allows calculating a matrix of routes.
     *
     *
     * You must use these strings exactly. For example, to provide access to map rendering, the only
     * valid action is `geo:GetMap*` as an input to the list. `["geo:GetMap*"]` is valid but
     * `["geo:GetMapTile"]` is not. Similarly, you cannot use `["geo:SearchPlaceIndexFor*"]` - you must
     * list each of the Place actions separately.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-apikey-apikeyrestrictions.html#cfn-location-apikey-apikeyrestrictions-allowactions)
     */
    public fun allowActions(): List<String>

    /**
     * An optional list of allowed HTTP referers for which requests must originate from.
     *
     * Requests using this API key from other domains will not be allowed.
     *
     * Requirements:
     *
     * * Contain only alphanumeric characters (A–Z, a–z, 0–9) or any symbols in this list
     * `$\-._+!*`(),;/?:&#64;=&amp;`
     * * May contain a percent (%) if followed by 2 hexadecimal digits (A-F, a-f, 0-9); this is used
     * for URL encoding purposes.
     * * May contain wildcard characters question mark (?) and asterisk (*).
     *
     * Question mark (?) will replace any single character (including hexadecimal digits).
     *
     * Asterisk (*) will replace any multiple characters (including multiple hexadecimal digits).
     *
     * * No spaces allowed. For example, `https://example.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-apikey-apikeyrestrictions.html#cfn-location-apikey-apikeyrestrictions-allowreferers)
     */
    public fun allowReferers(): List<String> = unwrap(this).getAllowReferers() ?: emptyList()

    /**
     * A list of allowed resource ARNs that a API key bearer can perform actions on.
     *
     * * The ARN must be the correct ARN for a map, place, or route ARN. You may include wildcards
     * in the resource-id to match multiple resources of the same type.
     * * The resources must be in the same `partition` , `region` , and `account-id` as the key that
     * is being created.
     * * Other than wildcards, you must include the full ARN, including the `arn` , `partition` ,
     * `service` , `region` , `account-id` and `resource-id` delimited by colons (:).
     * * No spaces allowed, even with wildcards. For example, `arn:aws:geo:region: *account-id*
     * :map/ExampleMap*` .
     *
     * For more information about ARN format, see [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-apikey-apikeyrestrictions.html#cfn-location-apikey-apikeyrestrictions-allowresources)
     */
    public fun allowResources(): List<String>

    /**
     * A builder for [ApiKeyRestrictionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowActions A list of allowed actions that an API key resource grants permissions
       * to perform. 
       * You must have at least one action for each type of resource. For example, if you have a
       * place resource, you must include at least one place action.
       *
       * The following are valid values for the actions.
       *
       * * *Map actions*
       * * `geo:GetMap*` - Allows all actions needed for map rendering.
       * * *Place actions*
       * * `geo:SearchPlaceIndexForText` - Allows geocoding.
       * * `geo:SearchPlaceIndexForPosition` - Allows reverse geocoding.
       * * `geo:SearchPlaceIndexForSuggestions` - Allows generating suggestions from text.
       * * `geo:GetPlace` - Allows finding a place by place ID.
       * * *Route actions*
       * * `geo:CalculateRoute` - Allows point to point routing.
       * * `geo:CalculateRouteMatrix` - Allows calculating a matrix of routes.
       *
       *
       * You must use these strings exactly. For example, to provide access to map rendering, the
       * only valid action is `geo:GetMap*` as an input to the list. `["geo:GetMap*"]` is valid but
       * `["geo:GetMapTile"]` is not. Similarly, you cannot use `["geo:SearchPlaceIndexFor*"]` - you
       * must list each of the Place actions separately.
       */
      public fun allowActions(allowActions: List<String>)

      /**
       * @param allowActions A list of allowed actions that an API key resource grants permissions
       * to perform. 
       * You must have at least one action for each type of resource. For example, if you have a
       * place resource, you must include at least one place action.
       *
       * The following are valid values for the actions.
       *
       * * *Map actions*
       * * `geo:GetMap*` - Allows all actions needed for map rendering.
       * * *Place actions*
       * * `geo:SearchPlaceIndexForText` - Allows geocoding.
       * * `geo:SearchPlaceIndexForPosition` - Allows reverse geocoding.
       * * `geo:SearchPlaceIndexForSuggestions` - Allows generating suggestions from text.
       * * `geo:GetPlace` - Allows finding a place by place ID.
       * * *Route actions*
       * * `geo:CalculateRoute` - Allows point to point routing.
       * * `geo:CalculateRouteMatrix` - Allows calculating a matrix of routes.
       *
       *
       * You must use these strings exactly. For example, to provide access to map rendering, the
       * only valid action is `geo:GetMap*` as an input to the list. `["geo:GetMap*"]` is valid but
       * `["geo:GetMapTile"]` is not. Similarly, you cannot use `["geo:SearchPlaceIndexFor*"]` - you
       * must list each of the Place actions separately.
       */
      public fun allowActions(vararg allowActions: String)

      /**
       * @param allowReferers An optional list of allowed HTTP referers for which requests must
       * originate from.
       * Requests using this API key from other domains will not be allowed.
       *
       * Requirements:
       *
       * * Contain only alphanumeric characters (A–Z, a–z, 0–9) or any symbols in this list
       * `$\-._+!*`(),;/?:&#64;=&amp;`
       * * May contain a percent (%) if followed by 2 hexadecimal digits (A-F, a-f, 0-9); this is
       * used for URL encoding purposes.
       * * May contain wildcard characters question mark (?) and asterisk (*).
       *
       * Question mark (?) will replace any single character (including hexadecimal digits).
       *
       * Asterisk (*) will replace any multiple characters (including multiple hexadecimal digits).
       *
       * * No spaces allowed. For example, `https://example.com` .
       */
      public fun allowReferers(allowReferers: List<String>)

      /**
       * @param allowReferers An optional list of allowed HTTP referers for which requests must
       * originate from.
       * Requests using this API key from other domains will not be allowed.
       *
       * Requirements:
       *
       * * Contain only alphanumeric characters (A–Z, a–z, 0–9) or any symbols in this list
       * `$\-._+!*`(),;/?:&#64;=&amp;`
       * * May contain a percent (%) if followed by 2 hexadecimal digits (A-F, a-f, 0-9); this is
       * used for URL encoding purposes.
       * * May contain wildcard characters question mark (?) and asterisk (*).
       *
       * Question mark (?) will replace any single character (including hexadecimal digits).
       *
       * Asterisk (*) will replace any multiple characters (including multiple hexadecimal digits).
       *
       * * No spaces allowed. For example, `https://example.com` .
       */
      public fun allowReferers(vararg allowReferers: String)

      /**
       * @param allowResources A list of allowed resource ARNs that a API key bearer can perform
       * actions on. 
       * * The ARN must be the correct ARN for a map, place, or route ARN. You may include wildcards
       * in the resource-id to match multiple resources of the same type.
       * * The resources must be in the same `partition` , `region` , and `account-id` as the key
       * that is being created.
       * * Other than wildcards, you must include the full ARN, including the `arn` , `partition` ,
       * `service` , `region` , `account-id` and `resource-id` delimited by colons (:).
       * * No spaces allowed, even with wildcards. For example, `arn:aws:geo:region: *account-id*
       * :map/ExampleMap*` .
       *
       * For more information about ARN format, see [Amazon Resource Names
       * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) .
       */
      public fun allowResources(allowResources: List<String>)

      /**
       * @param allowResources A list of allowed resource ARNs that a API key bearer can perform
       * actions on. 
       * * The ARN must be the correct ARN for a map, place, or route ARN. You may include wildcards
       * in the resource-id to match multiple resources of the same type.
       * * The resources must be in the same `partition` , `region` , and `account-id` as the key
       * that is being created.
       * * Other than wildcards, you must include the full ARN, including the `arn` , `partition` ,
       * `service` , `region` , `account-id` and `resource-id` delimited by colons (:).
       * * No spaces allowed, even with wildcards. For example, `arn:aws:geo:region: *account-id*
       * :map/ExampleMap*` .
       *
       * For more information about ARN format, see [Amazon Resource Names
       * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) .
       */
      public fun allowResources(vararg allowResources: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.location.CfnAPIKey.ApiKeyRestrictionsProperty.Builder =
          software.amazon.awscdk.services.location.CfnAPIKey.ApiKeyRestrictionsProperty.builder()

      /**
       * @param allowActions A list of allowed actions that an API key resource grants permissions
       * to perform. 
       * You must have at least one action for each type of resource. For example, if you have a
       * place resource, you must include at least one place action.
       *
       * The following are valid values for the actions.
       *
       * * *Map actions*
       * * `geo:GetMap*` - Allows all actions needed for map rendering.
       * * *Place actions*
       * * `geo:SearchPlaceIndexForText` - Allows geocoding.
       * * `geo:SearchPlaceIndexForPosition` - Allows reverse geocoding.
       * * `geo:SearchPlaceIndexForSuggestions` - Allows generating suggestions from text.
       * * `geo:GetPlace` - Allows finding a place by place ID.
       * * *Route actions*
       * * `geo:CalculateRoute` - Allows point to point routing.
       * * `geo:CalculateRouteMatrix` - Allows calculating a matrix of routes.
       *
       *
       * You must use these strings exactly. For example, to provide access to map rendering, the
       * only valid action is `geo:GetMap*` as an input to the list. `["geo:GetMap*"]` is valid but
       * `["geo:GetMapTile"]` is not. Similarly, you cannot use `["geo:SearchPlaceIndexFor*"]` - you
       * must list each of the Place actions separately.
       */
      override fun allowActions(allowActions: List<String>) {
        cdkBuilder.allowActions(allowActions)
      }

      /**
       * @param allowActions A list of allowed actions that an API key resource grants permissions
       * to perform. 
       * You must have at least one action for each type of resource. For example, if you have a
       * place resource, you must include at least one place action.
       *
       * The following are valid values for the actions.
       *
       * * *Map actions*
       * * `geo:GetMap*` - Allows all actions needed for map rendering.
       * * *Place actions*
       * * `geo:SearchPlaceIndexForText` - Allows geocoding.
       * * `geo:SearchPlaceIndexForPosition` - Allows reverse geocoding.
       * * `geo:SearchPlaceIndexForSuggestions` - Allows generating suggestions from text.
       * * `geo:GetPlace` - Allows finding a place by place ID.
       * * *Route actions*
       * * `geo:CalculateRoute` - Allows point to point routing.
       * * `geo:CalculateRouteMatrix` - Allows calculating a matrix of routes.
       *
       *
       * You must use these strings exactly. For example, to provide access to map rendering, the
       * only valid action is `geo:GetMap*` as an input to the list. `["geo:GetMap*"]` is valid but
       * `["geo:GetMapTile"]` is not. Similarly, you cannot use `["geo:SearchPlaceIndexFor*"]` - you
       * must list each of the Place actions separately.
       */
      override fun allowActions(vararg allowActions: String): Unit =
          allowActions(allowActions.toList())

      /**
       * @param allowReferers An optional list of allowed HTTP referers for which requests must
       * originate from.
       * Requests using this API key from other domains will not be allowed.
       *
       * Requirements:
       *
       * * Contain only alphanumeric characters (A–Z, a–z, 0–9) or any symbols in this list
       * `$\-._+!*`(),;/?:&#64;=&amp;`
       * * May contain a percent (%) if followed by 2 hexadecimal digits (A-F, a-f, 0-9); this is
       * used for URL encoding purposes.
       * * May contain wildcard characters question mark (?) and asterisk (*).
       *
       * Question mark (?) will replace any single character (including hexadecimal digits).
       *
       * Asterisk (*) will replace any multiple characters (including multiple hexadecimal digits).
       *
       * * No spaces allowed. For example, `https://example.com` .
       */
      override fun allowReferers(allowReferers: List<String>) {
        cdkBuilder.allowReferers(allowReferers)
      }

      /**
       * @param allowReferers An optional list of allowed HTTP referers for which requests must
       * originate from.
       * Requests using this API key from other domains will not be allowed.
       *
       * Requirements:
       *
       * * Contain only alphanumeric characters (A–Z, a–z, 0–9) or any symbols in this list
       * `$\-._+!*`(),;/?:&#64;=&amp;`
       * * May contain a percent (%) if followed by 2 hexadecimal digits (A-F, a-f, 0-9); this is
       * used for URL encoding purposes.
       * * May contain wildcard characters question mark (?) and asterisk (*).
       *
       * Question mark (?) will replace any single character (including hexadecimal digits).
       *
       * Asterisk (*) will replace any multiple characters (including multiple hexadecimal digits).
       *
       * * No spaces allowed. For example, `https://example.com` .
       */
      override fun allowReferers(vararg allowReferers: String): Unit =
          allowReferers(allowReferers.toList())

      /**
       * @param allowResources A list of allowed resource ARNs that a API key bearer can perform
       * actions on. 
       * * The ARN must be the correct ARN for a map, place, or route ARN. You may include wildcards
       * in the resource-id to match multiple resources of the same type.
       * * The resources must be in the same `partition` , `region` , and `account-id` as the key
       * that is being created.
       * * Other than wildcards, you must include the full ARN, including the `arn` , `partition` ,
       * `service` , `region` , `account-id` and `resource-id` delimited by colons (:).
       * * No spaces allowed, even with wildcards. For example, `arn:aws:geo:region: *account-id*
       * :map/ExampleMap*` .
       *
       * For more information about ARN format, see [Amazon Resource Names
       * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) .
       */
      override fun allowResources(allowResources: List<String>) {
        cdkBuilder.allowResources(allowResources)
      }

      /**
       * @param allowResources A list of allowed resource ARNs that a API key bearer can perform
       * actions on. 
       * * The ARN must be the correct ARN for a map, place, or route ARN. You may include wildcards
       * in the resource-id to match multiple resources of the same type.
       * * The resources must be in the same `partition` , `region` , and `account-id` as the key
       * that is being created.
       * * Other than wildcards, you must include the full ARN, including the `arn` , `partition` ,
       * `service` , `region` , `account-id` and `resource-id` delimited by colons (:).
       * * No spaces allowed, even with wildcards. For example, `arn:aws:geo:region: *account-id*
       * :map/ExampleMap*` .
       *
       * For more information about ARN format, see [Amazon Resource Names
       * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) .
       */
      override fun allowResources(vararg allowResources: String): Unit =
          allowResources(allowResources.toList())

      public fun build():
          software.amazon.awscdk.services.location.CfnAPIKey.ApiKeyRestrictionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.location.CfnAPIKey.ApiKeyRestrictionsProperty,
    ) : CdkObject(cdkObject), ApiKeyRestrictionsProperty {
      /**
       * A list of allowed actions that an API key resource grants permissions to perform.
       *
       * You must have at least one action for each type of resource. For example, if you have a
       * place resource, you must include at least one place action.
       *
       * The following are valid values for the actions.
       *
       * * *Map actions*
       * * `geo:GetMap*` - Allows all actions needed for map rendering.
       * * *Place actions*
       * * `geo:SearchPlaceIndexForText` - Allows geocoding.
       * * `geo:SearchPlaceIndexForPosition` - Allows reverse geocoding.
       * * `geo:SearchPlaceIndexForSuggestions` - Allows generating suggestions from text.
       * * `geo:GetPlace` - Allows finding a place by place ID.
       * * *Route actions*
       * * `geo:CalculateRoute` - Allows point to point routing.
       * * `geo:CalculateRouteMatrix` - Allows calculating a matrix of routes.
       *
       *
       * You must use these strings exactly. For example, to provide access to map rendering, the
       * only valid action is `geo:GetMap*` as an input to the list. `["geo:GetMap*"]` is valid but
       * `["geo:GetMapTile"]` is not. Similarly, you cannot use `["geo:SearchPlaceIndexFor*"]` - you
       * must list each of the Place actions separately.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-apikey-apikeyrestrictions.html#cfn-location-apikey-apikeyrestrictions-allowactions)
       */
      override fun allowActions(): List<String> = unwrap(this).getAllowActions()

      /**
       * An optional list of allowed HTTP referers for which requests must originate from.
       *
       * Requests using this API key from other domains will not be allowed.
       *
       * Requirements:
       *
       * * Contain only alphanumeric characters (A–Z, a–z, 0–9) or any symbols in this list
       * `$\-._+!*`(),;/?:&#64;=&amp;`
       * * May contain a percent (%) if followed by 2 hexadecimal digits (A-F, a-f, 0-9); this is
       * used for URL encoding purposes.
       * * May contain wildcard characters question mark (?) and asterisk (*).
       *
       * Question mark (?) will replace any single character (including hexadecimal digits).
       *
       * Asterisk (*) will replace any multiple characters (including multiple hexadecimal digits).
       *
       * * No spaces allowed. For example, `https://example.com` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-apikey-apikeyrestrictions.html#cfn-location-apikey-apikeyrestrictions-allowreferers)
       */
      override fun allowReferers(): List<String> = unwrap(this).getAllowReferers() ?: emptyList()

      /**
       * A list of allowed resource ARNs that a API key bearer can perform actions on.
       *
       * * The ARN must be the correct ARN for a map, place, or route ARN. You may include wildcards
       * in the resource-id to match multiple resources of the same type.
       * * The resources must be in the same `partition` , `region` , and `account-id` as the key
       * that is being created.
       * * Other than wildcards, you must include the full ARN, including the `arn` , `partition` ,
       * `service` , `region` , `account-id` and `resource-id` delimited by colons (:).
       * * No spaces allowed, even with wildcards. For example, `arn:aws:geo:region: *account-id*
       * :map/ExampleMap*` .
       *
       * For more information about ARN format, see [Amazon Resource Names
       * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-apikey-apikeyrestrictions.html#cfn-location-apikey-apikeyrestrictions-allowresources)
       */
      override fun allowResources(): List<String> = unwrap(this).getAllowResources()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApiKeyRestrictionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnAPIKey.ApiKeyRestrictionsProperty):
          ApiKeyRestrictionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ApiKeyRestrictionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApiKeyRestrictionsProperty):
          software.amazon.awscdk.services.location.CfnAPIKey.ApiKeyRestrictionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.location.CfnAPIKey.ApiKeyRestrictionsProperty
    }
  }
}
