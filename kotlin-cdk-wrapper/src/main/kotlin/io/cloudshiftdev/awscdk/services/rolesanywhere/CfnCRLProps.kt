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

/**
 * Properties for defining a `CfnCRL`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rolesanywhere.*;
 * CfnCRLProps cfnCRLProps = CfnCRLProps.builder()
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
public interface CfnCRLProps {
  /**
   * The x509 v3 specified certificate revocation list (CRL).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-crldata)
   */
  public fun crlData(): String

  /**
   * Specifies whether the certificate revocation list (CRL) is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * The name of the certificate revocation list (CRL).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-name)
   */
  public fun name(): String

  /**
   * A list of tags to attach to the certificate revocation list (CRL).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-trustanchorarn)
   */
  public fun trustAnchorArn(): String? = unwrap(this).getTrustAnchorArn()

  /**
   * A builder for [CfnCRLProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param crlData The x509 v3 specified certificate revocation list (CRL). 
     */
    public fun crlData(crlData: String)

    /**
     * @param enabled Specifies whether the certificate revocation list (CRL) is enabled.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled Specifies whether the certificate revocation list (CRL) is enabled.
     */
    public fun enabled(enabled: IResolvable)

    /**
     * @param name The name of the certificate revocation list (CRL). 
     */
    public fun name(name: String)

    /**
     * @param tags A list of tags to attach to the certificate revocation list (CRL).
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags to attach to the certificate revocation list (CRL).
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param trustAnchorArn The ARN of the TrustAnchor the certificate revocation list (CRL) will
     * provide revocation for.
     */
    public fun trustAnchorArn(trustAnchorArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rolesanywhere.CfnCRLProps.Builder =
        software.amazon.awscdk.services.rolesanywhere.CfnCRLProps.builder()

    /**
     * @param crlData The x509 v3 specified certificate revocation list (CRL). 
     */
    override fun crlData(crlData: String) {
      cdkBuilder.crlData(crlData)
    }

    /**
     * @param enabled Specifies whether the certificate revocation list (CRL) is enabled.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specifies whether the certificate revocation list (CRL) is enabled.
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param name The name of the certificate revocation list (CRL). 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags A list of tags to attach to the certificate revocation list (CRL).
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of tags to attach to the certificate revocation list (CRL).
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param trustAnchorArn The ARN of the TrustAnchor the certificate revocation list (CRL) will
     * provide revocation for.
     */
    override fun trustAnchorArn(trustAnchorArn: String) {
      cdkBuilder.trustAnchorArn(trustAnchorArn)
    }

    public fun build(): software.amazon.awscdk.services.rolesanywhere.CfnCRLProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnCRLProps,
  ) : CdkObject(cdkObject),
      CfnCRLProps {
    /**
     * The x509 v3 specified certificate revocation list (CRL).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-crldata)
     */
    override fun crlData(): String = unwrap(this).getCrlData()

    /**
     * Specifies whether the certificate revocation list (CRL) is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-enabled)
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The name of the certificate revocation list (CRL).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A list of tags to attach to the certificate revocation list (CRL).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-trustanchorarn)
     */
    override fun trustAnchorArn(): String? = unwrap(this).getTrustAnchorArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCRLProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnCRLProps):
        CfnCRLProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCRLProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCRLProps):
        software.amazon.awscdk.services.rolesanywhere.CfnCRLProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rolesanywhere.CfnCRLProps
  }
}
