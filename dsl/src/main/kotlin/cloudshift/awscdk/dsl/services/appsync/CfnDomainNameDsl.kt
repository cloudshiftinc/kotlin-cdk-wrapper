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
import software.amazon.awscdk.services.appsync.CfnDomainName
import software.constructs.Construct

/**
 * The `AWS::AppSync::DomainName` resource creates a `DomainNameConfig` object to configure a custom
 * domain.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * CfnDomainName cfnDomainName = CfnDomainName.Builder.create(this, "MyCfnDomainName")
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
public class CfnDomainNameDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDomainName.Builder = CfnDomainName.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the certificate.
     *
     * This will be an AWS Certificate Manager certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainname.html#cfn-appsync-domainname-certificatearn)
     *
     * @param certificateArn The Amazon Resource Name (ARN) of the certificate.
     */
    public fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
    }

    /**
     * The decription for your domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainname.html#cfn-appsync-domainname-description)
     *
     * @param description The decription for your domain name.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainname.html#cfn-appsync-domainname-domainname)
     *
     * @param domainName The domain name.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun build(): CfnDomainName = cdkBuilder.build()
}
