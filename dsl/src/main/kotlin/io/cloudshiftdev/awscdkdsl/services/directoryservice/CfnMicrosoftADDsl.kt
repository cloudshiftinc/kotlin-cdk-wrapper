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
import software.constructs.Construct

/**
 * The `AWS::DirectoryService::MicrosoftAD` resource specifies a Microsoft Active Directory in AWS
 * so that your directory users and groups can access the AWS Management Console and AWS
 * applications using their existing credentials.
 *
 * For more information, see
 * [AWS Managed Microsoft AD](https://docs.aws.amazon.com/directoryservice/latest/admin-guide/directory_microsoft_ad.html)
 * in the *AWS Directory Service Admin Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.directoryservice.*;
 * CfnMicrosoftAD cfnMicrosoftAD = CfnMicrosoftAD.Builder.create(this, "MyCfnMicrosoftAD")
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
public class CfnMicrosoftADDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMicrosoftAD.Builder = CfnMicrosoftAD.Builder.create(scope, id)

    /**
     * Specifies an alias for a directory and assigns the alias to the directory.
     *
     * The alias is used to construct the access URL for the directory, such as
     * `http://&lt;alias&gt;.awsapps.com` . By default, AWS CloudFormation does not create an alias.
     *
     * After an alias has been created, it cannot be deleted or reused, so this operation should
     * only be used when absolutely necessary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-createalias)
     *
     * @param createAlias Specifies an alias for a directory and assigns the alias to the directory.
     */
    public fun createAlias(createAlias: Boolean) {
        cdkBuilder.createAlias(createAlias)
    }

    /**
     * Specifies an alias for a directory and assigns the alias to the directory.
     *
     * The alias is used to construct the access URL for the directory, such as
     * `http://&lt;alias&gt;.awsapps.com` . By default, AWS CloudFormation does not create an alias.
     *
     * After an alias has been created, it cannot be deleted or reused, so this operation should
     * only be used when absolutely necessary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-createalias)
     *
     * @param createAlias Specifies an alias for a directory and assigns the alias to the directory.
     */
    public fun createAlias(createAlias: IResolvable) {
        cdkBuilder.createAlias(createAlias)
    }

    /**
     * AWS Managed Microsoft AD is available in two editions: `Standard` and `Enterprise` .
     *
     * `Enterprise` is the default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-edition)
     *
     * @param edition AWS Managed Microsoft AD is available in two editions: `Standard` and
     *   `Enterprise` .
     */
    public fun edition(edition: String) {
        cdkBuilder.edition(edition)
    }

    /**
     * Whether to enable single sign-on for a Microsoft Active Directory in AWS .
     *
     * Single sign-on allows users in your directory to access certain AWS services from a computer
     * joined to the directory without having to enter their credentials separately. If you don't
     * specify a value, AWS CloudFormation disables single sign-on by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-enablesso)
     *
     * @param enableSso Whether to enable single sign-on for a Microsoft Active Directory in AWS .
     */
    public fun enableSso(enableSso: Boolean) {
        cdkBuilder.enableSso(enableSso)
    }

    /**
     * Whether to enable single sign-on for a Microsoft Active Directory in AWS .
     *
     * Single sign-on allows users in your directory to access certain AWS services from a computer
     * joined to the directory without having to enter their credentials separately. If you don't
     * specify a value, AWS CloudFormation disables single sign-on by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-enablesso)
     *
     * @param enableSso Whether to enable single sign-on for a Microsoft Active Directory in AWS .
     */
    public fun enableSso(enableSso: IResolvable) {
        cdkBuilder.enableSso(enableSso)
    }

    /**
     * The fully qualified domain name for the AWS Managed Microsoft AD directory, such as
     * `corp.example.com` . This name will resolve inside your VPC only. It does not need to be
     * publicly resolvable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-name)
     *
     * @param name The fully qualified domain name for the AWS Managed Microsoft AD directory, such
     *   as `corp.example.com` . This name will resolve inside your VPC only. It does not need to be
     *   publicly resolvable.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The password for the default administrative user named `Admin` .
     *
     * If you need to change the password for the administrator account, see the
     * [ResetUserPassword](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_ResetUserPassword.html)
     * API call in the *AWS Directory Service API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-password)
     *
     * @param password The password for the default administrative user named `Admin` .
     */
    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    /**
     * The NetBIOS name for your domain, such as `CORP` .
     *
     * If you don't specify a NetBIOS name, it will default to the first part of your directory DNS.
     * For example, `CORP` for the directory DNS `corp.example.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-shortname)
     *
     * @param shortName The NetBIOS name for your domain, such as `CORP` .
     */
    public fun shortName(shortName: String) {
        cdkBuilder.shortName(shortName)
    }

    /**
     * Specifies the VPC settings of the Microsoft AD directory server in AWS .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-vpcsettings)
     *
     * @param vpcSettings Specifies the VPC settings of the Microsoft AD directory server in AWS .
     */
    public fun vpcSettings(vpcSettings: IResolvable) {
        cdkBuilder.vpcSettings(vpcSettings)
    }

    /**
     * Specifies the VPC settings of the Microsoft AD directory server in AWS .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-vpcsettings)
     *
     * @param vpcSettings Specifies the VPC settings of the Microsoft AD directory server in AWS .
     */
    public fun vpcSettings(vpcSettings: CfnMicrosoftAD.VpcSettingsProperty) {
        cdkBuilder.vpcSettings(vpcSettings)
    }

    public fun build(): CfnMicrosoftAD = cdkBuilder.build()
}
