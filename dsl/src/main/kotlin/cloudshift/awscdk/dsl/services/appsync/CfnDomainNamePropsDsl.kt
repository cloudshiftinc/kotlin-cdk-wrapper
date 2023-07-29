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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnDomainNameProps

/**
 * Properties for defining a `CfnDomainName`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * CfnDomainNameProps cfnDomainNameProps = CfnDomainNameProps.builder()
 * .certificateArn("certificateArn")
 * .domainName("domainName")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainname.html)
 */
@CdkDslMarker
public class CfnDomainNamePropsDsl {
    private val cdkBuilder: CfnDomainNameProps.Builder = CfnDomainNameProps.builder()

    /**
     * @param certificateArn The Amazon Resource Name (ARN) of the certificate. This will be an AWS
     *   Certificate Manager certificate.
     */
    public fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
    }

    /** @param description The decription for your domain name. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param domainName The domain name. */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun build(): CfnDomainNameProps = cdkBuilder.build()
}
