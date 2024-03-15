@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnService`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * CfnServiceProps cfnServiceProps = CfnServiceProps.builder()
 * .authType("authType")
 * .certificateArn("certificateArn")
 * .customDomainName("customDomainName")
 * .dnsEntry(DnsEntryProperty.builder()
 * .domainName("domainName")
 * .hostedZoneId("hostedZoneId")
 * .build())
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html)
 */
public interface CfnServiceProps {
  /**
   * The type of IAM policy.
   *
   * * `NONE` : The resource does not use an IAM policy. This is the default.
   * * `AWS_IAM` : The resource uses an IAM policy. When this type is used, auth is enabled and an
   * auth policy is required.
   *
   * Default: - "NONE"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-authtype)
   */
  public fun authType(): String? = unwrap(this).getAuthType()

  /**
   * The Amazon Resource Name (ARN) of the certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-certificatearn)
   */
  public fun certificateArn(): String? = unwrap(this).getCertificateArn()

  /**
   * The custom domain name of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-customdomainname)
   */
  public fun customDomainName(): String? = unwrap(this).getCustomDomainName()

  /**
   * The DNS information of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-dnsentry)
   */
  public fun dnsEntry(): Any? = unwrap(this).getDnsEntry()

  /**
   * The name of the service.
   *
   * The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens (-).
   * You can't use a hyphen as the first or last character, or immediately after another hyphen.
   *
   * If you don't specify a name, CloudFormation generates one. However, if you specify a name, and
   * later want to replace the resource, you must specify a new name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The tags for the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnServiceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authType The type of IAM policy.
     * * `NONE` : The resource does not use an IAM policy. This is the default.
     * * `AWS_IAM` : The resource uses an IAM policy. When this type is used, auth is enabled and an
     * auth policy is required.
     */
    public fun authType(authType: String)

    /**
     * @param certificateArn The Amazon Resource Name (ARN) of the certificate.
     */
    public fun certificateArn(certificateArn: String)

    /**
     * @param customDomainName The custom domain name of the service.
     */
    public fun customDomainName(customDomainName: String)

    /**
     * @param dnsEntry The DNS information of the service.
     */
    public fun dnsEntry(dnsEntry: IResolvable)

    /**
     * @param dnsEntry The DNS information of the service.
     */
    public fun dnsEntry(dnsEntry: CfnService.DnsEntryProperty)

    /**
     * @param dnsEntry The DNS information of the service.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3efe9b948caff662dde3459e0c0997e86b85201c4c333d14d68fcc0d3a5e07fa")
    public fun dnsEntry(dnsEntry: CfnService.DnsEntryProperty.Builder.() -> Unit)

    /**
     * @param name The name of the service.
     * The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens
     * (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     */
    public fun name(name: String)

    /**
     * @param tags The tags for the service.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the service.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnServiceProps.Builder =
        software.amazon.awscdk.services.vpclattice.CfnServiceProps.builder()

    /**
     * @param authType The type of IAM policy.
     * * `NONE` : The resource does not use an IAM policy. This is the default.
     * * `AWS_IAM` : The resource uses an IAM policy. When this type is used, auth is enabled and an
     * auth policy is required.
     */
    override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    /**
     * @param certificateArn The Amazon Resource Name (ARN) of the certificate.
     */
    override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    /**
     * @param customDomainName The custom domain name of the service.
     */
    override fun customDomainName(customDomainName: String) {
      cdkBuilder.customDomainName(customDomainName)
    }

    /**
     * @param dnsEntry The DNS information of the service.
     */
    override fun dnsEntry(dnsEntry: IResolvable) {
      cdkBuilder.dnsEntry(dnsEntry.let(IResolvable::unwrap))
    }

    /**
     * @param dnsEntry The DNS information of the service.
     */
    override fun dnsEntry(dnsEntry: CfnService.DnsEntryProperty) {
      cdkBuilder.dnsEntry(dnsEntry.let(CfnService.DnsEntryProperty::unwrap))
    }

    /**
     * @param dnsEntry The DNS information of the service.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3efe9b948caff662dde3459e0c0997e86b85201c4c333d14d68fcc0d3a5e07fa")
    override fun dnsEntry(dnsEntry: CfnService.DnsEntryProperty.Builder.() -> Unit): Unit =
        dnsEntry(CfnService.DnsEntryProperty(dnsEntry))

    /**
     * @param name The name of the service.
     * The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens
     * (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags for the service.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags for the service.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceProps,
  ) : CdkObject(cdkObject), CfnServiceProps {
    /**
     * The type of IAM policy.
     *
     * * `NONE` : The resource does not use an IAM policy. This is the default.
     * * `AWS_IAM` : The resource uses an IAM policy. When this type is used, auth is enabled and an
     * auth policy is required.
     *
     * Default: - "NONE"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-authtype)
     */
    override fun authType(): String? = unwrap(this).getAuthType()

    /**
     * The Amazon Resource Name (ARN) of the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-certificatearn)
     */
    override fun certificateArn(): String? = unwrap(this).getCertificateArn()

    /**
     * The custom domain name of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-customdomainname)
     */
    override fun customDomainName(): String? = unwrap(this).getCustomDomainName()

    /**
     * The DNS information of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-dnsentry)
     */
    override fun dnsEntry(): Any? = unwrap(this).getDnsEntry()

    /**
     * The name of the service.
     *
     * The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens
     * (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The tags for the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceProps):
        CfnServiceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceProps):
        software.amazon.awscdk.services.vpclattice.CfnServiceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.vpclattice.CfnServiceProps
  }
}
