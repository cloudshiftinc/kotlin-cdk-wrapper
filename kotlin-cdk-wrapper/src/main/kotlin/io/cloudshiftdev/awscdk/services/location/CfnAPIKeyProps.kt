@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnAPIKey`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.location.*;
 * CfnAPIKeyProps cfnAPIKeyProps = CfnAPIKeyProps.builder()
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
public interface CfnAPIKeyProps {
  /**
   * Updates the description for the API key resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The optional timestamp for when the API key resource will expire in [ISO 8601
   * format](https://docs.aws.amazon.com/https://www.iso.org/iso-8601-date-and-time-format.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-expiretime)
   */
  public fun expireTime(): String? = unwrap(this).getExpireTime()

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
   */
  public fun forceDelete(): Any? = unwrap(this).getForceDelete()

  /**
   * The boolean flag to be included for updating `ExpireTime` or Restrictions details.
   *
   * Must be set to `true` to update an API key resource that has been used in the past 7 days.
   * `False` if force update is not preferred.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-forceupdate)
   */
  public fun forceUpdate(): Any? = unwrap(this).getForceUpdate()

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
   */
  public fun keyName(): String

  /**
   * Whether the API key should expire.
   *
   * Set to `true` to set the API key to have no expiration time.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-noexpiry)
   */
  public fun noExpiry(): Any? = unwrap(this).getNoExpiry()

  /**
   * The API key restrictions for the API key resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-restrictions)
   */
  public fun restrictions(): Any

  /**
   * Applies one or more tags to the map resource.
   *
   * A tag is a key-value pair that helps manage, identify, search, and filter your resources by
   * labelling them.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAPIKeyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description Updates the description for the API key resource.
     */
    public fun description(description: String)

    /**
     * @param expireTime The optional timestamp for when the API key resource will expire in [ISO
     * 8601 format](https://docs.aws.amazon.com/https://www.iso.org/iso-8601-date-and-time-format.html)
     * .
     */
    public fun expireTime(expireTime: String)

    /**
     * @param forceDelete ForceDelete bypasses an API key's expiry conditions and deletes the key.
     * Set the parameter `true` to delete the key or to `false` to not preemptively delete the API
     * key.
     *
     * Valid values: `true` , or `false` .
     *
     *
     * This action is irreversible. Only use ForceDelete if you are certain the key is no longer in
     * use.
     */
    public fun forceDelete(forceDelete: Boolean)

    /**
     * @param forceDelete ForceDelete bypasses an API key's expiry conditions and deletes the key.
     * Set the parameter `true` to delete the key or to `false` to not preemptively delete the API
     * key.
     *
     * Valid values: `true` , or `false` .
     *
     *
     * This action is irreversible. Only use ForceDelete if you are certain the key is no longer in
     * use.
     */
    public fun forceDelete(forceDelete: IResolvable)

    /**
     * @param forceUpdate The boolean flag to be included for updating `ExpireTime` or Restrictions
     * details.
     * Must be set to `true` to update an API key resource that has been used in the past 7 days.
     * `False` if force update is not preferred.
     */
    public fun forceUpdate(forceUpdate: Boolean)

    /**
     * @param forceUpdate The boolean flag to be included for updating `ExpireTime` or Restrictions
     * details.
     * Must be set to `true` to update an API key resource that has been used in the past 7 days.
     * `False` if force update is not preferred.
     */
    public fun forceUpdate(forceUpdate: IResolvable)

    /**
     * @param keyName A custom name for the API key resource. 
     * Requirements:
     *
     * * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
     * underscores (_).
     * * Must be a unique API key name.
     * * No spaces allowed. For example, `ExampleAPIKey` .
     */
    public fun keyName(keyName: String)

    /**
     * @param noExpiry Whether the API key should expire.
     * Set to `true` to set the API key to have no expiration time.
     */
    public fun noExpiry(noExpiry: Boolean)

    /**
     * @param noExpiry Whether the API key should expire.
     * Set to `true` to set the API key to have no expiration time.
     */
    public fun noExpiry(noExpiry: IResolvable)

    /**
     * @param restrictions The API key restrictions for the API key resource. 
     */
    public fun restrictions(restrictions: IResolvable)

    /**
     * @param restrictions The API key restrictions for the API key resource. 
     */
    public fun restrictions(restrictions: CfnAPIKey.ApiKeyRestrictionsProperty)

    /**
     * @param restrictions The API key restrictions for the API key resource. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ce5501c93733aac7bff890abef8c6103b3ce86c9f5cf7069e975052698181d2")
    public fun restrictions(restrictions: CfnAPIKey.ApiKeyRestrictionsProperty.Builder.() -> Unit)

    /**
     * @param tags Applies one or more tags to the map resource.
     * A tag is a key-value pair that helps manage, identify, search, and filter your resources by
     * labelling them.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Applies one or more tags to the map resource.
     * A tag is a key-value pair that helps manage, identify, search, and filter your resources by
     * labelling them.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnAPIKeyProps.Builder =
        software.amazon.awscdk.services.location.CfnAPIKeyProps.builder()

    /**
     * @param description Updates the description for the API key resource.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param expireTime The optional timestamp for when the API key resource will expire in [ISO
     * 8601 format](https://docs.aws.amazon.com/https://www.iso.org/iso-8601-date-and-time-format.html)
     * .
     */
    override fun expireTime(expireTime: String) {
      cdkBuilder.expireTime(expireTime)
    }

    /**
     * @param forceDelete ForceDelete bypasses an API key's expiry conditions and deletes the key.
     * Set the parameter `true` to delete the key or to `false` to not preemptively delete the API
     * key.
     *
     * Valid values: `true` , or `false` .
     *
     *
     * This action is irreversible. Only use ForceDelete if you are certain the key is no longer in
     * use.
     */
    override fun forceDelete(forceDelete: Boolean) {
      cdkBuilder.forceDelete(forceDelete)
    }

    /**
     * @param forceDelete ForceDelete bypasses an API key's expiry conditions and deletes the key.
     * Set the parameter `true` to delete the key or to `false` to not preemptively delete the API
     * key.
     *
     * Valid values: `true` , or `false` .
     *
     *
     * This action is irreversible. Only use ForceDelete if you are certain the key is no longer in
     * use.
     */
    override fun forceDelete(forceDelete: IResolvable) {
      cdkBuilder.forceDelete(forceDelete.let(IResolvable::unwrap))
    }

    /**
     * @param forceUpdate The boolean flag to be included for updating `ExpireTime` or Restrictions
     * details.
     * Must be set to `true` to update an API key resource that has been used in the past 7 days.
     * `False` if force update is not preferred.
     */
    override fun forceUpdate(forceUpdate: Boolean) {
      cdkBuilder.forceUpdate(forceUpdate)
    }

    /**
     * @param forceUpdate The boolean flag to be included for updating `ExpireTime` or Restrictions
     * details.
     * Must be set to `true` to update an API key resource that has been used in the past 7 days.
     * `False` if force update is not preferred.
     */
    override fun forceUpdate(forceUpdate: IResolvable) {
      cdkBuilder.forceUpdate(forceUpdate.let(IResolvable::unwrap))
    }

    /**
     * @param keyName A custom name for the API key resource. 
     * Requirements:
     *
     * * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
     * underscores (_).
     * * Must be a unique API key name.
     * * No spaces allowed. For example, `ExampleAPIKey` .
     */
    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    /**
     * @param noExpiry Whether the API key should expire.
     * Set to `true` to set the API key to have no expiration time.
     */
    override fun noExpiry(noExpiry: Boolean) {
      cdkBuilder.noExpiry(noExpiry)
    }

    /**
     * @param noExpiry Whether the API key should expire.
     * Set to `true` to set the API key to have no expiration time.
     */
    override fun noExpiry(noExpiry: IResolvable) {
      cdkBuilder.noExpiry(noExpiry.let(IResolvable::unwrap))
    }

    /**
     * @param restrictions The API key restrictions for the API key resource. 
     */
    override fun restrictions(restrictions: IResolvable) {
      cdkBuilder.restrictions(restrictions.let(IResolvable::unwrap))
    }

    /**
     * @param restrictions The API key restrictions for the API key resource. 
     */
    override fun restrictions(restrictions: CfnAPIKey.ApiKeyRestrictionsProperty) {
      cdkBuilder.restrictions(restrictions.let(CfnAPIKey.ApiKeyRestrictionsProperty::unwrap))
    }

    /**
     * @param restrictions The API key restrictions for the API key resource. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ce5501c93733aac7bff890abef8c6103b3ce86c9f5cf7069e975052698181d2")
    override
        fun restrictions(restrictions: CfnAPIKey.ApiKeyRestrictionsProperty.Builder.() -> Unit):
        Unit = restrictions(CfnAPIKey.ApiKeyRestrictionsProperty(restrictions))

    /**
     * @param tags Applies one or more tags to the map resource.
     * A tag is a key-value pair that helps manage, identify, search, and filter your resources by
     * labelling them.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Applies one or more tags to the map resource.
     * A tag is a key-value pair that helps manage, identify, search, and filter your resources by
     * labelling them.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.location.CfnAPIKeyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.location.CfnAPIKeyProps,
  ) : CdkObject(cdkObject), CfnAPIKeyProps {
    /**
     * Updates the description for the API key resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The optional timestamp for when the API key resource will expire in [ISO 8601
     * format](https://docs.aws.amazon.com/https://www.iso.org/iso-8601-date-and-time-format.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-expiretime)
     */
    override fun expireTime(): String? = unwrap(this).getExpireTime()

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
     */
    override fun forceDelete(): Any? = unwrap(this).getForceDelete()

    /**
     * The boolean flag to be included for updating `ExpireTime` or Restrictions details.
     *
     * Must be set to `true` to update an API key resource that has been used in the past 7 days.
     * `False` if force update is not preferred.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-forceupdate)
     */
    override fun forceUpdate(): Any? = unwrap(this).getForceUpdate()

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
     */
    override fun keyName(): String = unwrap(this).getKeyName()

    /**
     * Whether the API key should expire.
     *
     * Set to `true` to set the API key to have no expiration time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-noexpiry)
     */
    override fun noExpiry(): Any? = unwrap(this).getNoExpiry()

    /**
     * The API key restrictions for the API key resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-restrictions)
     */
    override fun restrictions(): Any = unwrap(this).getRestrictions()

    /**
     * Applies one or more tags to the map resource.
     *
     * A tag is a key-value pair that helps manage, identify, search, and filter your resources by
     * labelling them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html#cfn-location-apikey-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAPIKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnAPIKeyProps):
        CfnAPIKeyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAPIKeyProps):
        software.amazon.awscdk.services.location.CfnAPIKeyProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.location.CfnAPIKeyProps
  }
}
