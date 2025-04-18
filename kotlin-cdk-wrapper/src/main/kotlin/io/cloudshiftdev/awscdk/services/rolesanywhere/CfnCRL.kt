@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rolesanywhere

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rolesanywhere.*;
 * CfnCRL cfnCRL = CfnCRL.Builder.create(this, "MyCfnCRL")
 * .crlData("crlData")
 * .name("name")
 * // the properties below are optional
 * .enabled(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .trustAnchorArn("trustAnchorArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html)
 */
public open class CfnCRL(
  cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnCRL,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCRLProps,
  ) :
      this(software.amazon.awscdk.services.rolesanywhere.CfnCRL(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCRLProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCRLProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCRLProps(props)
  )

  /**
   * The unique primary identifier of the Crl.
   */
  public open fun attrCrlId(): String = unwrap(this).getAttrCrlId()

  /**
   * The x509 v3 specified certificate revocation list (CRL).
   */
  public open fun crlData(): String = unwrap(this).getCrlData()

  /**
   * The x509 v3 specified certificate revocation list (CRL).
   */
  public open fun crlData(`value`: String) {
    unwrap(this).setCrlData(`value`)
  }

  /**
   * Specifies whether the certificate revocation list (CRL) is enabled.
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * Specifies whether the certificate revocation list (CRL) is enabled.
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * Specifies whether the certificate revocation list (CRL) is enabled.
   */
  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable.Companion::unwrap))
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
   * The name of the certificate revocation list (CRL).
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the certificate revocation list (CRL).
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tags to attach to the certificate revocation list (CRL).
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tags to attach to the certificate revocation list (CRL).
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of tags to attach to the certificate revocation list (CRL).
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
   */
  public open fun trustAnchorArn(): String? = unwrap(this).getTrustAnchorArn()

  /**
   * The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
   */
  public open fun trustAnchorArn(`value`: String) {
    unwrap(this).setTrustAnchorArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rolesanywhere.CfnCRL].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The x509 v3 specified certificate revocation list (CRL).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-crldata)
     * @param crlData The x509 v3 specified certificate revocation list (CRL). 
     */
    public fun crlData(crlData: String)

    /**
     * Specifies whether the certificate revocation list (CRL) is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-enabled)
     * @param enabled Specifies whether the certificate revocation list (CRL) is enabled. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * Specifies whether the certificate revocation list (CRL) is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-enabled)
     * @param enabled Specifies whether the certificate revocation list (CRL) is enabled. 
     */
    public fun enabled(enabled: IResolvable)

    /**
     * The name of the certificate revocation list (CRL).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-name)
     * @param name The name of the certificate revocation list (CRL). 
     */
    public fun name(name: String)

    /**
     * A list of tags to attach to the certificate revocation list (CRL).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-tags)
     * @param tags A list of tags to attach to the certificate revocation list (CRL). 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags to attach to the certificate revocation list (CRL).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-tags)
     * @param tags A list of tags to attach to the certificate revocation list (CRL). 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-trustanchorarn)
     * @param trustAnchorArn The ARN of the TrustAnchor the certificate revocation list (CRL) will
     * provide revocation for. 
     */
    public fun trustAnchorArn(trustAnchorArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rolesanywhere.CfnCRL.Builder =
        software.amazon.awscdk.services.rolesanywhere.CfnCRL.Builder.create(scope, id)

    /**
     * The x509 v3 specified certificate revocation list (CRL).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-crldata)
     * @param crlData The x509 v3 specified certificate revocation list (CRL). 
     */
    override fun crlData(crlData: String) {
      cdkBuilder.crlData(crlData)
    }

    /**
     * Specifies whether the certificate revocation list (CRL) is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-enabled)
     * @param enabled Specifies whether the certificate revocation list (CRL) is enabled. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * Specifies whether the certificate revocation list (CRL) is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-enabled)
     * @param enabled Specifies whether the certificate revocation list (CRL) is enabled. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * The name of the certificate revocation list (CRL).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-name)
     * @param name The name of the certificate revocation list (CRL). 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A list of tags to attach to the certificate revocation list (CRL).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-tags)
     * @param tags A list of tags to attach to the certificate revocation list (CRL). 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of tags to attach to the certificate revocation list (CRL).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-tags)
     * @param tags A list of tags to attach to the certificate revocation list (CRL). 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-trustanchorarn)
     * @param trustAnchorArn The ARN of the TrustAnchor the certificate revocation list (CRL) will
     * provide revocation for. 
     */
    override fun trustAnchorArn(trustAnchorArn: String) {
      cdkBuilder.trustAnchorArn(trustAnchorArn)
    }

    public fun build(): software.amazon.awscdk.services.rolesanywhere.CfnCRL = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rolesanywhere.CfnCRL.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCRL {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCRL(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnCRL): CfnCRL =
        CfnCRL(cdkObject)

    internal fun unwrap(wrapped: CfnCRL): software.amazon.awscdk.services.rolesanywhere.CfnCRL =
        wrapped.cdkObject as software.amazon.awscdk.services.rolesanywhere.CfnCRL
  }
}
