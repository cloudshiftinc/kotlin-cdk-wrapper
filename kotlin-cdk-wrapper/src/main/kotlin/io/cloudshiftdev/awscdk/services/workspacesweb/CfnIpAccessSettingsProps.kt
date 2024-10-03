@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnIpAccessSettings`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspacesweb.*;
 * CfnIpAccessSettingsProps cfnIpAccessSettingsProps = CfnIpAccessSettingsProps.builder()
 * .ipRules(List.of(IpRuleProperty.builder()
 * .ipRange("ipRange")
 * // the properties below are optional
 * .description("description")
 * .build()))
 * // the properties below are optional
 * .additionalEncryptionContext(Map.of(
 * "additionalEncryptionContextKey", "additionalEncryptionContext"))
 * .customerManagedKey("customerManagedKey")
 * .description("description")
 * .displayName("displayName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html)
 */
public interface CfnIpAccessSettingsProps {
  /**
   * Additional encryption context of the IP access settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-additionalencryptioncontext)
   */
  public fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

  /**
   * The custom managed key of the IP access settings.
   *
   * *Pattern* : `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-customermanagedkey)
   */
  public fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

  /**
   * The description of the IP access settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The display name of the IP access settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-displayname)
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The IP rules of the IP access settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-iprules)
   */
  public fun ipRules(): Any

  /**
   * The tags to add to the IP access settings resource.
   *
   * A tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnIpAccessSettingsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalEncryptionContext Additional encryption context of the IP access settings.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable)

    /**
     * @param additionalEncryptionContext Additional encryption context of the IP access settings.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>)

    /**
     * @param customerManagedKey The custom managed key of the IP access settings.
     * *Pattern* : `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
     */
    public fun customerManagedKey(customerManagedKey: String)

    /**
     * @param description The description of the IP access settings.
     */
    public fun description(description: String)

    /**
     * @param displayName The display name of the IP access settings.
     */
    public fun displayName(displayName: String)

    /**
     * @param ipRules The IP rules of the IP access settings. 
     */
    public fun ipRules(ipRules: IResolvable)

    /**
     * @param ipRules The IP rules of the IP access settings. 
     */
    public fun ipRules(ipRules: List<Any>)

    /**
     * @param ipRules The IP rules of the IP access settings. 
     */
    public fun ipRules(vararg ipRules: Any)

    /**
     * @param tags The tags to add to the IP access settings resource.
     * A tag is a key-value pair.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to add to the IP access settings resource.
     * A tag is a key-value pair.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettingsProps.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettingsProps.builder()

    /**
     * @param additionalEncryptionContext Additional encryption context of the IP access settings.
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param additionalEncryptionContext Additional encryption context of the IP access settings.
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * @param customerManagedKey The custom managed key of the IP access settings.
     * *Pattern* : `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
     */
    override fun customerManagedKey(customerManagedKey: String) {
      cdkBuilder.customerManagedKey(customerManagedKey)
    }

    /**
     * @param description The description of the IP access settings.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName The display name of the IP access settings.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param ipRules The IP rules of the IP access settings. 
     */
    override fun ipRules(ipRules: IResolvable) {
      cdkBuilder.ipRules(ipRules.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ipRules The IP rules of the IP access settings. 
     */
    override fun ipRules(ipRules: List<Any>) {
      cdkBuilder.ipRules(ipRules.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param ipRules The IP rules of the IP access settings. 
     */
    override fun ipRules(vararg ipRules: Any): Unit = ipRules(ipRules.toList())

    /**
     * @param tags The tags to add to the IP access settings resource.
     * A tag is a key-value pair.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to add to the IP access settings resource.
     * A tag is a key-value pair.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettingsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettingsProps,
  ) : CdkObject(cdkObject),
      CfnIpAccessSettingsProps {
    /**
     * Additional encryption context of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-additionalencryptioncontext)
     */
    override fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

    /**
     * The custom managed key of the IP access settings.
     *
     * *Pattern* : `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-customermanagedkey)
     */
    override fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

    /**
     * The description of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The display name of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-displayname)
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * The IP rules of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-iprules)
     */
    override fun ipRules(): Any = unwrap(this).getIpRules()

    /**
     * The tags to add to the IP access settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIpAccessSettingsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettingsProps):
        CfnIpAccessSettingsProps = CdkObjectWrappers.wrap(cdkObject) as? CfnIpAccessSettingsProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIpAccessSettingsProps):
        software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettingsProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettingsProps
  }
}
