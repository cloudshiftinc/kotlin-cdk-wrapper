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
 * Properties for defining a `CfnBrowserSettings`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspacesweb.*;
 * CfnBrowserSettingsProps cfnBrowserSettingsProps = CfnBrowserSettingsProps.builder()
 * .additionalEncryptionContext(Map.of(
 * "additionalEncryptionContextKey", "additionalEncryptionContext"))
 * .browserPolicy("browserPolicy")
 * .customerManagedKey("customerManagedKey")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html)
 */
public interface CfnBrowserSettingsProps {
  /**
   * Additional encryption context of the browser settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html#cfn-workspacesweb-browsersettings-additionalencryptioncontext)
   */
  public fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

  /**
   * A JSON string containing Chrome Enterprise policies that will be applied to all streaming
   * sessions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html#cfn-workspacesweb-browsersettings-browserpolicy)
   */
  public fun browserPolicy(): String? = unwrap(this).getBrowserPolicy()

  /**
   * The custom managed key of the browser settings.
   *
   * *Pattern* : `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html#cfn-workspacesweb-browsersettings-customermanagedkey)
   */
  public fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

  /**
   * The tags to add to the browser settings resource.
   *
   * A tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html#cfn-workspacesweb-browsersettings-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnBrowserSettingsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalEncryptionContext Additional encryption context of the browser settings.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable)

    /**
     * @param additionalEncryptionContext Additional encryption context of the browser settings.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>)

    /**
     * @param browserPolicy A JSON string containing Chrome Enterprise policies that will be applied
     * to all streaming sessions.
     */
    public fun browserPolicy(browserPolicy: String)

    /**
     * @param customerManagedKey The custom managed key of the browser settings.
     * *Pattern* : `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
     */
    public fun customerManagedKey(customerManagedKey: String)

    /**
     * @param tags The tags to add to the browser settings resource.
     * A tag is a key-value pair.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to add to the browser settings resource.
     * A tag is a key-value pair.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesweb.CfnBrowserSettingsProps.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnBrowserSettingsProps.builder()

    /**
     * @param additionalEncryptionContext Additional encryption context of the browser settings.
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable::unwrap))
    }

    /**
     * @param additionalEncryptionContext Additional encryption context of the browser settings.
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * @param browserPolicy A JSON string containing Chrome Enterprise policies that will be applied
     * to all streaming sessions.
     */
    override fun browserPolicy(browserPolicy: String) {
      cdkBuilder.browserPolicy(browserPolicy)
    }

    /**
     * @param customerManagedKey The custom managed key of the browser settings.
     * *Pattern* : `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
     */
    override fun customerManagedKey(customerManagedKey: String) {
      cdkBuilder.customerManagedKey(customerManagedKey)
    }

    /**
     * @param tags The tags to add to the browser settings resource.
     * A tag is a key-value pair.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to add to the browser settings resource.
     * A tag is a key-value pair.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnBrowserSettingsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.workspacesweb.CfnBrowserSettingsProps,
  ) : CdkObject(cdkObject), CfnBrowserSettingsProps {
    /**
     * Additional encryption context of the browser settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html#cfn-workspacesweb-browsersettings-additionalencryptioncontext)
     */
    override fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

    /**
     * A JSON string containing Chrome Enterprise policies that will be applied to all streaming
     * sessions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html#cfn-workspacesweb-browsersettings-browserpolicy)
     */
    override fun browserPolicy(): String? = unwrap(this).getBrowserPolicy()

    /**
     * The custom managed key of the browser settings.
     *
     * *Pattern* : `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html#cfn-workspacesweb-browsersettings-customermanagedkey)
     */
    override fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

    /**
     * The tags to add to the browser settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html#cfn-workspacesweb-browsersettings-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBrowserSettingsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnBrowserSettingsProps):
        CfnBrowserSettingsProps = CdkObjectWrappers.wrap(cdkObject) as? CfnBrowserSettingsProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBrowserSettingsProps):
        software.amazon.awscdk.services.workspacesweb.CfnBrowserSettingsProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.workspacesweb.CfnBrowserSettingsProps
  }
}
