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

public open class CfnCRL internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnCRL,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   *
   */
  public open fun attrCrlId(): String = unwrap(this).getAttrCrlId()

  /**
   *
   */
  public open fun crlData(): String = unwrap(this).getCrlData()

  /**
   *
   */
  public open fun crlData(`value`: String) {
    unwrap(this).setCrlData(`value`)
  }

  /**
   *
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   *
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   *
   */
  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
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
   *
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   *
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   *
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   *
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   *
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-crldata)
     * @param crlData 
     */
    public fun crlData(crlData: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-enabled)
     * @param enabled 
     */
    public fun enabled(enabled: Boolean)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-enabled)
     * @param enabled 
     */
    public fun enabled(enabled: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-name)
     * @param name 
     */
    public fun name(name: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-tags)
     * @param tags 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-tags)
     * @param tags 
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-crldata)
     * @param crlData 
     */
    override fun crlData(crlData: String) {
      cdkBuilder.crlData(crlData)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-enabled)
     * @param enabled 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-enabled)
     * @param enabled 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-name)
     * @param name 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-tags)
     * @param tags 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-tags)
     * @param tags 
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
        wrapped.cdkObject
  }
}