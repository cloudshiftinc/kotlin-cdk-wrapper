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

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolDomain
import software.constructs.Construct

/**
 * The AWS::Cognito::UserPoolDomain resource creates a new domain for a user pool.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * CfnUserPoolDomain cfnUserPoolDomain = CfnUserPoolDomain.Builder.create(this,
 * "MyCfnUserPoolDomain")
 * .domain("domain")
 * .userPoolId("userPoolId")
 * // the properties below are optional
 * .customDomainConfig(CustomDomainConfigTypeProperty.builder()
 * .certificateArn("certificateArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html)
 */
@CdkDslMarker
public class CfnUserPoolDomainDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnUserPoolDomain.Builder = CfnUserPoolDomain.Builder.create(scope, id)

    /**
     * The configuration for a custom domain that hosts the sign-up and sign-in pages for your
     * application.
     *
     * Use this object to specify an SSL certificate that is managed by ACM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-customdomainconfig)
     *
     * @param customDomainConfig The configuration for a custom domain that hosts the sign-up and
     *   sign-in pages for your application.
     */
    public fun customDomainConfig(customDomainConfig: IResolvable) {
        cdkBuilder.customDomainConfig(customDomainConfig)
    }

    /**
     * The configuration for a custom domain that hosts the sign-up and sign-in pages for your
     * application.
     *
     * Use this object to specify an SSL certificate that is managed by ACM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-customdomainconfig)
     *
     * @param customDomainConfig The configuration for a custom domain that hosts the sign-up and
     *   sign-in pages for your application.
     */
    public fun customDomainConfig(
        customDomainConfig: CfnUserPoolDomain.CustomDomainConfigTypeProperty
    ) {
        cdkBuilder.customDomainConfig(customDomainConfig)
    }

    /**
     * The domain name for the domain that hosts the sign-up and sign-in pages for your application.
     *
     * For example: `auth.example.com` . If you're using a prefix domain, this field denotes the
     * first part of the domain before `.auth.[region].amazoncognito.com` .
     *
     * This string can include only lowercase letters, numbers, and hyphens. Don't use a hyphen for
     * the first or last character. Use periods to separate subdomain names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-domain)
     *
     * @param domain The domain name for the domain that hosts the sign-up and sign-in pages for
     *   your application.
     */
    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    /**
     * The user pool ID for the user pool where you want to associate a user pool domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-userpoolid)
     *
     * @param userPoolId The user pool ID for the user pool where you want to associate a user pool
     *   domain.
     */
    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): CfnUserPoolDomain = cdkBuilder.build()
}
