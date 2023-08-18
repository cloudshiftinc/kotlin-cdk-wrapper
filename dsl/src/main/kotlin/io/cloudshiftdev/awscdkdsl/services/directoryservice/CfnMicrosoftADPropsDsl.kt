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

package io.cloudshiftdev.awscdkdsl.services.directoryservice

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD
import software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps

/**
 * Properties for defining a `CfnMicrosoftAD`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.directoryservice.*;
 * CfnMicrosoftADProps cfnMicrosoftADProps = CfnMicrosoftADProps.builder()
 * .name("name")
 * .password("password")
 * .vpcSettings(VpcSettingsProperty.builder()
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * .build())
 * // the properties below are optional
 * .createAlias(false)
 * .edition("edition")
 * .enableSso(false)
 * .shortName("shortName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html)
 */
@CdkDslMarker
public class CfnMicrosoftADPropsDsl {
    private val cdkBuilder: CfnMicrosoftADProps.Builder = CfnMicrosoftADProps.builder()

    /**
     * @param createAlias Specifies an alias for a directory and assigns the alias to the directory.
     *   The alias is used to construct the access URL for the directory, such as
     *   `http://&lt;alias&gt;.awsapps.com` . By default, AWS CloudFormation does not create an
     *   alias.
     *
     * After an alias has been created, it cannot be deleted or reused, so this operation should
     * only be used when absolutely necessary.
     */
    public fun createAlias(createAlias: Boolean) {
        cdkBuilder.createAlias(createAlias)
    }

    /**
     * @param createAlias Specifies an alias for a directory and assigns the alias to the directory.
     *   The alias is used to construct the access URL for the directory, such as
     *   `http://&lt;alias&gt;.awsapps.com` . By default, AWS CloudFormation does not create an
     *   alias.
     *
     * After an alias has been created, it cannot be deleted or reused, so this operation should
     * only be used when absolutely necessary.
     */
    public fun createAlias(createAlias: IResolvable) {
        cdkBuilder.createAlias(createAlias)
    }

    /**
     * @param edition AWS Managed Microsoft AD is available in two editions: `Standard` and
     *   `Enterprise` . `Enterprise` is the default.
     */
    public fun edition(edition: String) {
        cdkBuilder.edition(edition)
    }

    /**
     * @param enableSso Whether to enable single sign-on for a Microsoft Active Directory in AWS .
     *   Single sign-on allows users in your directory to access certain AWS services from a
     *   computer joined to the directory without having to enter their credentials separately. If
     *   you don't specify a value, AWS CloudFormation disables single sign-on by default.
     */
    public fun enableSso(enableSso: Boolean) {
        cdkBuilder.enableSso(enableSso)
    }

    /**
     * @param enableSso Whether to enable single sign-on for a Microsoft Active Directory in AWS .
     *   Single sign-on allows users in your directory to access certain AWS services from a
     *   computer joined to the directory without having to enter their credentials separately. If
     *   you don't specify a value, AWS CloudFormation disables single sign-on by default.
     */
    public fun enableSso(enableSso: IResolvable) {
        cdkBuilder.enableSso(enableSso)
    }

    /**
     * @param name The fully qualified domain name for the AWS Managed Microsoft AD directory, such
     *   as `corp.example.com` . This name will resolve inside your VPC only. It does not need to be
     *   publicly resolvable.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param password The password for the default administrative user named `Admin` . If you need
     *   to change the password for the administrator account, see the
     *   [ResetUserPassword](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_ResetUserPassword.html)
     *   API call in the *AWS Directory Service API Reference* .
     */
    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    /**
     * @param shortName The NetBIOS name for your domain, such as `CORP` . If you don't specify a
     *   NetBIOS name, it will default to the first part of your directory DNS. For example, `CORP`
     *   for the directory DNS `corp.example.com` .
     */
    public fun shortName(shortName: String) {
        cdkBuilder.shortName(shortName)
    }

    /**
     * @param vpcSettings Specifies the VPC settings of the Microsoft AD directory server in AWS .
     */
    public fun vpcSettings(vpcSettings: IResolvable) {
        cdkBuilder.vpcSettings(vpcSettings)
    }

    /**
     * @param vpcSettings Specifies the VPC settings of the Microsoft AD directory server in AWS .
     */
    public fun vpcSettings(vpcSettings: CfnMicrosoftAD.VpcSettingsProperty) {
        cdkBuilder.vpcSettings(vpcSettings)
    }

    public fun build(): CfnMicrosoftADProps = cdkBuilder.build()
}
