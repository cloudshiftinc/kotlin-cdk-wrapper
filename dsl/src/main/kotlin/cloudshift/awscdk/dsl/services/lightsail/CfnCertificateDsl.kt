@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.lightsail.CfnCertificate
import software.constructs.Construct

/**
 * The `AWS::Lightsail::Certificate` resource specifies an SSL/TLS certificate that you can use with
 * a content delivery network (CDN) distribution and a container service.
 *
 * For information about certificates that you can use with a load balancer, see
 * [AWS::Lightsail::LoadBalancerTlsCertificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * CfnCertificate cfnCertificate = CfnCertificate.Builder.create(this, "MyCfnCertificate")
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
@CdkDslMarker
public class CfnCertificateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCertificate.Builder = CfnCertificate.Builder.create(scope, id)

    private val _subjectAlternativeNames: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The name of the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-certificatename)
     *
     * @param certificateName The name of the certificate.
     */
    public fun certificateName(certificateName: String) {
        cdkBuilder.certificateName(certificateName)
    }

    /**
     * The domain name of the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-domainname)
     *
     * @param domainName The domain name of the certificate.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * An array of strings that specify the alternate domains (such as `example.org` ) and
     * subdomains (such as `blog.example.com` ) of the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-subjectalternativenames)
     *
     * @param subjectAlternativeNames An array of strings that specify the alternate domains (such
     *   as `example.org` ) and subdomains (such as `blog.example.com` ) of the certificate.
     */
    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String) {
        _subjectAlternativeNames.addAll(listOf(*subjectAlternativeNames))
    }

    /**
     * An array of strings that specify the alternate domains (such as `example.org` ) and
     * subdomains (such as `blog.example.com` ) of the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-subjectalternativenames)
     *
     * @param subjectAlternativeNames An array of strings that specify the alternate domains (such
     *   as `example.org` ) and subdomains (such as `blog.example.com` ) of the certificate.
     */
    public fun subjectAlternativeNames(subjectAlternativeNames: Collection<String>) {
        _subjectAlternativeNames.addAll(subjectAlternativeNames)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCertificate {
        if (_subjectAlternativeNames.isNotEmpty())
            cdkBuilder.subjectAlternativeNames(_subjectAlternativeNames)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
