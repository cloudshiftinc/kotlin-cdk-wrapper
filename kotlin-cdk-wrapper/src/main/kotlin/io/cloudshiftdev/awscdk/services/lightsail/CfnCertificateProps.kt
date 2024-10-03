@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnCertificate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lightsail.*;
 * CfnCertificateProps cfnCertificateProps = CfnCertificateProps.builder()
 * .certificateName("certificateName")
 * .domainName("domainName")
 * // the properties below are optional
 * .subjectAlternativeNames(List.of("subjectAlternativeNames"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
 */
public interface CfnCertificateProps {
  /**
   * The name of the certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-certificatename)
   */
  public fun certificateName(): String

  /**
   * The domain name of the certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-domainname)
   */
  public fun domainName(): String

  /**
   * An array of strings that specify the alternate domains (such as `example.org` ) and subdomains
   * (such as `blog.example.com` ) of the certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-subjectalternativenames)
   */
  public fun subjectAlternativeNames(): List<String> = unwrap(this).getSubjectAlternativeNames() ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *AWS CloudFormation User Guide* .
   *
   *
   * The `Value` of `Tags` is optional for Lightsail resources.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCertificateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificateName The name of the certificate. 
     */
    public fun certificateName(certificateName: String)

    /**
     * @param domainName The domain name of the certificate. 
     */
    public fun domainName(domainName: String)

    /**
     * @param subjectAlternativeNames An array of strings that specify the alternate domains (such
     * as `example.org` ) and subdomains (such as `blog.example.com` ) of the certificate.
     */
    public fun subjectAlternativeNames(subjectAlternativeNames: List<String>)

    /**
     * @param subjectAlternativeNames An array of strings that specify the alternate domains (such
     * as `example.org` ) and subdomains (such as `blog.example.com` ) of the certificate.
     */
    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnCertificateProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnCertificateProps.builder()

    /**
     * @param certificateName The name of the certificate. 
     */
    override fun certificateName(certificateName: String) {
      cdkBuilder.certificateName(certificateName)
    }

    /**
     * @param domainName The domain name of the certificate. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param subjectAlternativeNames An array of strings that specify the alternate domains (such
     * as `example.org` ) and subdomains (such as `blog.example.com` ) of the certificate.
     */
    override fun subjectAlternativeNames(subjectAlternativeNames: List<String>) {
      cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    /**
     * @param subjectAlternativeNames An array of strings that specify the alternate domains (such
     * as `example.org` ) and subdomains (such as `blog.example.com` ) of the certificate.
     */
    override fun subjectAlternativeNames(vararg subjectAlternativeNames: String): Unit =
        subjectAlternativeNames(subjectAlternativeNames.toList())

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lightsail.CfnCertificateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lightsail.CfnCertificateProps,
  ) : CdkObject(cdkObject),
      CfnCertificateProps {
    /**
     * The name of the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-certificatename)
     */
    override fun certificateName(): String = unwrap(this).getCertificateName()

    /**
     * The domain name of the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-domainname)
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * An array of strings that specify the alternate domains (such as `example.org` ) and
     * subdomains (such as `blog.example.com` ) of the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-subjectalternativenames)
     */
    override fun subjectAlternativeNames(): List<String> = unwrap(this).getSubjectAlternativeNames()
        ?: emptyList()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnCertificateProps):
        CfnCertificateProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCertificateProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCertificateProps):
        software.amazon.awscdk.services.lightsail.CfnCertificateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lightsail.CfnCertificateProps
  }
}
