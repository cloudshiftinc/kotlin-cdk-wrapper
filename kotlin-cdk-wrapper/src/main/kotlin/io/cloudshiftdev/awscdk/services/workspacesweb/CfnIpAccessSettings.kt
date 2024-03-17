@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesweb

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This resource specifies IP access settings that can be associated with a web portal.
 *
 * For more information, see [Set up IP access controls
 * (optional)](https://docs.aws.amazon.com/workspaces-web/latest/adminguide/ip-access-controls.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspacesweb.*;
 * CfnIpAccessSettings cfnIpAccessSettings = CfnIpAccessSettings.Builder.create(this,
 * "MyCfnIpAccessSettings")
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
public open class CfnIpAccessSettings internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * Additional encryption context of the IP access settings.
   */
  public open fun additionalEncryptionContext(): Any? =
      unwrap(this).getAdditionalEncryptionContext()

  /**
   * Additional encryption context of the IP access settings.
   */
  public open fun additionalEncryptionContext(`value`: IResolvable) {
    unwrap(this).setAdditionalEncryptionContext(`value`.let(IResolvable::unwrap))
  }

  /**
   * Additional encryption context of the IP access settings.
   */
  public open fun additionalEncryptionContext(`value`: Map<String, String>) {
    unwrap(this).setAdditionalEncryptionContext(`value`)
  }

  /**
   * A list of web portal ARNs that this IP access settings resource is associated with.
   */
  public open fun attrAssociatedPortalArns(): List<String> =
      unwrap(this).getAttrAssociatedPortalArns()

  /**
   * The creation date timestamp of the IP access settings.
   */
  public open fun attrCreationDate(): String = unwrap(this).getAttrCreationDate()

  /**
   * The ARN of the IP access settings resource.
   */
  public open fun attrIpAccessSettingsArn(): String = unwrap(this).getAttrIpAccessSettingsArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The custom managed key of the IP access settings.
   */
  public open fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

  /**
   * The custom managed key of the IP access settings.
   */
  public open fun customerManagedKey(`value`: String) {
    unwrap(this).setCustomerManagedKey(`value`)
  }

  /**
   * The description of the IP access settings.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the IP access settings.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The display name of the IP access settings.
   */
  public open fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The display name of the IP access settings.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The IP rules of the IP access settings.
   */
  public open fun ipRules(): Any = unwrap(this).getIpRules()

  /**
   * The IP rules of the IP access settings.
   */
  public open fun ipRules(`value`: IResolvable) {
    unwrap(this).setIpRules(`value`.let(IResolvable::unwrap))
  }

  /**
   * The IP rules of the IP access settings.
   */
  public open fun ipRules(`value`: List<Any>) {
    unwrap(this).setIpRules(`value`)
  }

  /**
   * The IP rules of the IP access settings.
   */
  public open fun ipRules(vararg `value`: Any): Unit = ipRules(`value`.toList())

  /**
   * The tags to add to the browser settings resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags to add to the browser settings resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to add to the browser settings resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.workspacesweb.CfnIpAccessSettings].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Additional encryption context of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-additionalencryptioncontext)
     * @param additionalEncryptionContext Additional encryption context of the IP access settings. 
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable)

    /**
     * Additional encryption context of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-additionalencryptioncontext)
     * @param additionalEncryptionContext Additional encryption context of the IP access settings. 
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>)

    /**
     * The custom managed key of the IP access settings.
     *
     * *Pattern* : `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-customermanagedkey)
     * @param customerManagedKey The custom managed key of the IP access settings. 
     */
    public fun customerManagedKey(customerManagedKey: String)

    /**
     * The description of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-description)
     * @param description The description of the IP access settings. 
     */
    public fun description(description: String)

    /**
     * The display name of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-displayname)
     * @param displayName The display name of the IP access settings. 
     */
    public fun displayName(displayName: String)

    /**
     * The IP rules of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-iprules)
     * @param ipRules The IP rules of the IP access settings. 
     */
    public fun ipRules(ipRules: IResolvable)

    /**
     * The IP rules of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-iprules)
     * @param ipRules The IP rules of the IP access settings. 
     */
    public fun ipRules(ipRules: List<Any>)

    /**
     * The IP rules of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-iprules)
     * @param ipRules The IP rules of the IP access settings. 
     */
    public fun ipRules(vararg ipRules: Any)

    /**
     * The tags to add to the browser settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-tags)
     * @param tags The tags to add to the browser settings resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to add to the browser settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-tags)
     * @param tags The tags to add to the browser settings resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings.Builder.create(scope, id)

    /**
     * Additional encryption context of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-additionalencryptioncontext)
     * @param additionalEncryptionContext Additional encryption context of the IP access settings. 
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable::unwrap))
    }

    /**
     * Additional encryption context of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-additionalencryptioncontext)
     * @param additionalEncryptionContext Additional encryption context of the IP access settings. 
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * The custom managed key of the IP access settings.
     *
     * *Pattern* : `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-customermanagedkey)
     * @param customerManagedKey The custom managed key of the IP access settings. 
     */
    override fun customerManagedKey(customerManagedKey: String) {
      cdkBuilder.customerManagedKey(customerManagedKey)
    }

    /**
     * The description of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-description)
     * @param description The description of the IP access settings. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The display name of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-displayname)
     * @param displayName The display name of the IP access settings. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The IP rules of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-iprules)
     * @param ipRules The IP rules of the IP access settings. 
     */
    override fun ipRules(ipRules: IResolvable) {
      cdkBuilder.ipRules(ipRules.let(IResolvable::unwrap))
    }

    /**
     * The IP rules of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-iprules)
     * @param ipRules The IP rules of the IP access settings. 
     */
    override fun ipRules(ipRules: List<Any>) {
      cdkBuilder.ipRules(ipRules)
    }

    /**
     * The IP rules of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-iprules)
     * @param ipRules The IP rules of the IP access settings. 
     */
    override fun ipRules(vararg ipRules: Any): Unit = ipRules(ipRules.toList())

    /**
     * The tags to add to the browser settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-tags)
     * @param tags The tags to add to the browser settings resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to add to the browser settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-tags)
     * @param tags The tags to add to the browser settings resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIpAccessSettings {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIpAccessSettings(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings):
        CfnIpAccessSettings = CfnIpAccessSettings(cdkObject)

    internal fun unwrap(wrapped: CfnIpAccessSettings):
        software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings = wrapped.cdkObject
  }

  /**
   * The IP rules of the IP access settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesweb.*;
   * IpRuleProperty ipRuleProperty = IpRuleProperty.builder()
   * .ipRange("ipRange")
   * // the properties below are optional
   * .description("description")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-ipaccesssettings-iprule.html)
   */
  public interface IpRuleProperty {
    /**
     * The description of the IP rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-ipaccesssettings-iprule.html#cfn-workspacesweb-ipaccesssettings-iprule-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The IP range of the IP rule.
     *
     * This can either be a single IP address or a range using CIDR notation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-ipaccesssettings-iprule.html#cfn-workspacesweb-ipaccesssettings-iprule-iprange)
     */
    public fun ipRange(): String

    /**
     * A builder for [IpRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description The description of the IP rule.
       */
      public fun description(description: String)

      /**
       * @param ipRange The IP range of the IP rule. 
       * This can either be a single IP address or a range using CIDR notation.
       */
      public fun ipRange(ipRange: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings.IpRuleProperty.Builder =
          software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings.IpRuleProperty.builder()

      /**
       * @param description The description of the IP rule.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param ipRange The IP range of the IP rule. 
       * This can either be a single IP address or a range using CIDR notation.
       */
      override fun ipRange(ipRange: String) {
        cdkBuilder.ipRange(ipRange)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings.IpRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings.IpRuleProperty,
    ) : CdkObject(cdkObject), IpRuleProperty {
      /**
       * The description of the IP rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-ipaccesssettings-iprule.html#cfn-workspacesweb-ipaccesssettings-iprule-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The IP range of the IP rule.
       *
       * This can either be a single IP address or a range using CIDR notation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-ipaccesssettings-iprule.html#cfn-workspacesweb-ipaccesssettings-iprule-iprange)
       */
      override fun ipRange(): String = unwrap(this).getIpRange()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IpRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings.IpRuleProperty):
          IpRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? IpRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IpRuleProperty):
          software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings.IpRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings.IpRuleProperty
    }
  }
}
