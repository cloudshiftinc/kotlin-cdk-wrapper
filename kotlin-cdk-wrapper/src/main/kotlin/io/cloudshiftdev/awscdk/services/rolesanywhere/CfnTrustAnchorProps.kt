@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rolesanywhere

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
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnTrustAnchor`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rolesanywhere.*;
 * CfnTrustAnchorProps cfnTrustAnchorProps = CfnTrustAnchorProps.builder()
 * .name("name")
 * .source(SourceProperty.builder()
 * .sourceData(SourceDataProperty.builder()
 * .acmPcaArn("acmPcaArn")
 * .x509CertificateData("x509CertificateData")
 * .build())
 * .sourceType("sourceType")
 * .build())
 * // the properties below are optional
 * .enabled(false)
 * .notificationSettings(List.of(NotificationSettingProperty.builder()
 * .enabled(false)
 * .event("event")
 * // the properties below are optional
 * .channel("channel")
 * .threshold(123)
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html)
 */
public interface CfnTrustAnchorProps {
  /**
   * Indicates whether the trust anchor is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * The name of the trust anchor.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-name)
   */
  public fun name(): String

  /**
   * A list of notification settings to be associated to the trust anchor.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-notificationsettings)
   */
  public fun notificationSettings(): Any? = unwrap(this).getNotificationSettings()

  /**
   * The trust anchor type and its related certificate data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-source)
   */
  public fun source(): Any

  /**
   * The tags to attach to the trust anchor.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnTrustAnchorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param enabled Indicates whether the trust anchor is enabled.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled Indicates whether the trust anchor is enabled.
     */
    public fun enabled(enabled: IResolvable)

    /**
     * @param name The name of the trust anchor. 
     */
    public fun name(name: String)

    /**
     * @param notificationSettings A list of notification settings to be associated to the trust
     * anchor.
     */
    public fun notificationSettings(notificationSettings: IResolvable)

    /**
     * @param notificationSettings A list of notification settings to be associated to the trust
     * anchor.
     */
    public fun notificationSettings(notificationSettings: List<Any>)

    /**
     * @param notificationSettings A list of notification settings to be associated to the trust
     * anchor.
     */
    public fun notificationSettings(vararg notificationSettings: Any)

    /**
     * @param source The trust anchor type and its related certificate data. 
     */
    public fun source(source: IResolvable)

    /**
     * @param source The trust anchor type and its related certificate data. 
     */
    public fun source(source: CfnTrustAnchor.SourceProperty)

    /**
     * @param source The trust anchor type and its related certificate data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5416a12a5f11415d062edffe9e877454d1adaba2dd108e8baccc432b71b61f50")
    public fun source(source: CfnTrustAnchor.SourceProperty.Builder.() -> Unit)

    /**
     * @param tags The tags to attach to the trust anchor.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to attach to the trust anchor.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchorProps.Builder =
        software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchorProps.builder()

    /**
     * @param enabled Indicates whether the trust anchor is enabled.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Indicates whether the trust anchor is enabled.
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    /**
     * @param name The name of the trust anchor. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param notificationSettings A list of notification settings to be associated to the trust
     * anchor.
     */
    override fun notificationSettings(notificationSettings: IResolvable) {
      cdkBuilder.notificationSettings(notificationSettings.let(IResolvable::unwrap))
    }

    /**
     * @param notificationSettings A list of notification settings to be associated to the trust
     * anchor.
     */
    override fun notificationSettings(notificationSettings: List<Any>) {
      cdkBuilder.notificationSettings(notificationSettings.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param notificationSettings A list of notification settings to be associated to the trust
     * anchor.
     */
    override fun notificationSettings(vararg notificationSettings: Any): Unit =
        notificationSettings(notificationSettings.toList())

    /**
     * @param source The trust anchor type and its related certificate data. 
     */
    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable::unwrap))
    }

    /**
     * @param source The trust anchor type and its related certificate data. 
     */
    override fun source(source: CfnTrustAnchor.SourceProperty) {
      cdkBuilder.source(source.let(CfnTrustAnchor.SourceProperty::unwrap))
    }

    /**
     * @param source The trust anchor type and its related certificate data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5416a12a5f11415d062edffe9e877454d1adaba2dd108e8baccc432b71b61f50")
    override fun source(source: CfnTrustAnchor.SourceProperty.Builder.() -> Unit): Unit =
        source(CfnTrustAnchor.SourceProperty(source))

    /**
     * @param tags The tags to attach to the trust anchor.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to attach to the trust anchor.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchorProps,
  ) : CdkObject(cdkObject), CfnTrustAnchorProps {
    /**
     * Indicates whether the trust anchor is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-enabled)
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The name of the trust anchor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A list of notification settings to be associated to the trust anchor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-notificationsettings)
     */
    override fun notificationSettings(): Any? = unwrap(this).getNotificationSettings()

    /**
     * The trust anchor type and its related certificate data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-source)
     */
    override fun source(): Any = unwrap(this).getSource()

    /**
     * The tags to attach to the trust anchor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrustAnchorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchorProps):
        CfnTrustAnchorProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTrustAnchorProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrustAnchorProps):
        software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchorProps
  }
}
