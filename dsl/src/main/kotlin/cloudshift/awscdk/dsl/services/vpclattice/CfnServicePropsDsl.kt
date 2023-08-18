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

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnService
import software.amazon.awscdk.services.vpclattice.CfnServiceProps

/**
 * Properties for defining a `CfnService`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
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
@CdkDslMarker
public class CfnServicePropsDsl {
    private val cdkBuilder: CfnServiceProps.Builder = CfnServiceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param authType The type of IAM policy.
     * * `NONE` : The resource does not use an IAM policy. This is the default.
     * * `AWS_IAM` : The resource uses an IAM policy. When this type is used, auth is enabled and an
     *   auth policy is required.
     */
    public fun authType(authType: String) {
        cdkBuilder.authType(authType)
    }

    /** @param certificateArn The Amazon Resource Name (ARN) of the certificate. */
    public fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
    }

    /** @param customDomainName The custom domain name of the service. */
    public fun customDomainName(customDomainName: String) {
        cdkBuilder.customDomainName(customDomainName)
    }

    /** @param dnsEntry The DNS information of the service. */
    public fun dnsEntry(dnsEntry: IResolvable) {
        cdkBuilder.dnsEntry(dnsEntry)
    }

    /** @param dnsEntry The DNS information of the service. */
    public fun dnsEntry(dnsEntry: CfnService.DnsEntryProperty) {
        cdkBuilder.dnsEntry(dnsEntry)
    }

    /**
     * @param name The name of the service. The name must be unique within the account. The valid
     *   characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last
     *   character, or immediately after another hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param tags The tags for the service. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags for the service. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnServiceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
