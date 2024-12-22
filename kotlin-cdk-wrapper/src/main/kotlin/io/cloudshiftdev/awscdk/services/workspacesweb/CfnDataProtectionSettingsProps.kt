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
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDataProtectionSettings`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspacesweb.*;
 * CfnDataProtectionSettingsProps cfnDataProtectionSettingsProps =
 * CfnDataProtectionSettingsProps.builder()
 * .additionalEncryptionContext(Map.of(
 * "additionalEncryptionContextKey", "additionalEncryptionContext"))
 * .customerManagedKey("customerManagedKey")
 * .description("description")
 * .displayName("displayName")
 * .inlineRedactionConfiguration(InlineRedactionConfigurationProperty.builder()
 * .inlineRedactionPatterns(List.of(InlineRedactionPatternProperty.builder()
 * .redactionPlaceHolder(RedactionPlaceHolderProperty.builder()
 * .redactionPlaceHolderType("redactionPlaceHolderType")
 * // the properties below are optional
 * .redactionPlaceHolderText("redactionPlaceHolderText")
 * .build())
 * // the properties below are optional
 * .builtInPatternId("builtInPatternId")
 * .confidenceLevel(123)
 * .customPattern(CustomPatternProperty.builder()
 * .patternName("patternName")
 * .patternRegex("patternRegex")
 * // the properties below are optional
 * .keywordRegex("keywordRegex")
 * .patternDescription("patternDescription")
 * .build())
 * .enforcedUrls(List.of("enforcedUrls"))
 * .exemptUrls(List.of("exemptUrls"))
 * .build()))
 * // the properties below are optional
 * .globalConfidenceLevel(123)
 * .globalEnforcedUrls(List.of("globalEnforcedUrls"))
 * .globalExemptUrls(List.of("globalExemptUrls"))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html)
 */
public interface CfnDataProtectionSettingsProps {
  /**
   * The additional encryption context of the data protection settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-additionalencryptioncontext)
   */
  public fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

  /**
   * The customer managed key used to encrypt sensitive information in the data protection settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-customermanagedkey)
   */
  public fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

  /**
   * The description of the data protection settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The display name of the data protection settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-displayname)
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The inline redaction configuration for the data protection settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionconfiguration)
   */
  public fun inlineRedactionConfiguration(): Any? = unwrap(this).getInlineRedactionConfiguration()

  /**
   * The tags of the data protection settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDataProtectionSettingsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalEncryptionContext The additional encryption context of the data protection
     * settings.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable)

    /**
     * @param additionalEncryptionContext The additional encryption context of the data protection
     * settings.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>)

    /**
     * @param customerManagedKey The customer managed key used to encrypt sensitive information in
     * the data protection settings.
     */
    public fun customerManagedKey(customerManagedKey: String)

    /**
     * @param description The description of the data protection settings.
     */
    public fun description(description: String)

    /**
     * @param displayName The display name of the data protection settings.
     */
    public fun displayName(displayName: String)

    /**
     * @param inlineRedactionConfiguration The inline redaction configuration for the data
     * protection settings.
     */
    public fun inlineRedactionConfiguration(inlineRedactionConfiguration: IResolvable)

    /**
     * @param inlineRedactionConfiguration The inline redaction configuration for the data
     * protection settings.
     */
    public
        fun inlineRedactionConfiguration(inlineRedactionConfiguration: CfnDataProtectionSettings.InlineRedactionConfigurationProperty)

    /**
     * @param inlineRedactionConfiguration The inline redaction configuration for the data
     * protection settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71a926c6ec76f1fd306f865792d30aba87051af27b8b7bfae8110bd93947aeef")
    public
        fun inlineRedactionConfiguration(inlineRedactionConfiguration: CfnDataProtectionSettings.InlineRedactionConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags The tags of the data protection settings.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags of the data protection settings.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettingsProps.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettingsProps.builder()

    /**
     * @param additionalEncryptionContext The additional encryption context of the data protection
     * settings.
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param additionalEncryptionContext The additional encryption context of the data protection
     * settings.
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * @param customerManagedKey The customer managed key used to encrypt sensitive information in
     * the data protection settings.
     */
    override fun customerManagedKey(customerManagedKey: String) {
      cdkBuilder.customerManagedKey(customerManagedKey)
    }

    /**
     * @param description The description of the data protection settings.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName The display name of the data protection settings.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param inlineRedactionConfiguration The inline redaction configuration for the data
     * protection settings.
     */
    override fun inlineRedactionConfiguration(inlineRedactionConfiguration: IResolvable) {
      cdkBuilder.inlineRedactionConfiguration(inlineRedactionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param inlineRedactionConfiguration The inline redaction configuration for the data
     * protection settings.
     */
    override
        fun inlineRedactionConfiguration(inlineRedactionConfiguration: CfnDataProtectionSettings.InlineRedactionConfigurationProperty) {
      cdkBuilder.inlineRedactionConfiguration(inlineRedactionConfiguration.let(CfnDataProtectionSettings.InlineRedactionConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param inlineRedactionConfiguration The inline redaction configuration for the data
     * protection settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71a926c6ec76f1fd306f865792d30aba87051af27b8b7bfae8110bd93947aeef")
    override
        fun inlineRedactionConfiguration(inlineRedactionConfiguration: CfnDataProtectionSettings.InlineRedactionConfigurationProperty.Builder.() -> Unit):
        Unit =
        inlineRedactionConfiguration(CfnDataProtectionSettings.InlineRedactionConfigurationProperty(inlineRedactionConfiguration))

    /**
     * @param tags The tags of the data protection settings.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags of the data protection settings.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettingsProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettingsProps,
  ) : CdkObject(cdkObject),
      CfnDataProtectionSettingsProps {
    /**
     * The additional encryption context of the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-additionalencryptioncontext)
     */
    override fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

    /**
     * The customer managed key used to encrypt sensitive information in the data protection
     * settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-customermanagedkey)
     */
    override fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

    /**
     * The description of the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The display name of the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-displayname)
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * The inline redaction configuration for the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionconfiguration)
     */
    override fun inlineRedactionConfiguration(): Any? =
        unwrap(this).getInlineRedactionConfiguration()

    /**
     * The tags of the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataProtectionSettingsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettingsProps):
        CfnDataProtectionSettingsProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnDataProtectionSettingsProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataProtectionSettingsProps):
        software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettingsProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettingsProps
  }
}
