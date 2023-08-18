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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD
import software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps
import software.amazon.awscdk.services.directoryservice.CfnSimpleAD
import software.amazon.awscdk.services.directoryservice.CfnSimpleADProps
import software.constructs.Construct

public object directoryservice {
    /**
     * The `AWS::DirectoryService::MicrosoftAD` resource specifies a Microsoft Active Directory in
     * AWS so that your directory users and groups can access the AWS Management Console and AWS
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
    public inline fun cfnMicrosoftAD(
        scope: Construct,
        id: String,
        block: CfnMicrosoftADDsl.() -> Unit = {},
    ): CfnMicrosoftAD {
        val builder = CfnMicrosoftADDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnMicrosoftADProps(
        block: CfnMicrosoftADPropsDsl.() -> Unit = {}
    ): CfnMicrosoftADProps {
        val builder = CfnMicrosoftADPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains VPC information for the
     * [CreateDirectory](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateDirectory.html)
     * or
     * [CreateMicrosoftAD](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateMicrosoftAD.html)
     * operation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.directoryservice.*;
     * VpcSettingsProperty vpcSettingsProperty = VpcSettingsProperty.builder()
     * .subnetIds(List.of("subnetIds"))
     * .vpcId("vpcId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-microsoftad-vpcsettings.html)
     */
    public inline fun cfnMicrosoftADVpcSettingsProperty(
        block: CfnMicrosoftADVpcSettingsPropertyDsl.() -> Unit = {}
    ): CfnMicrosoftAD.VpcSettingsProperty {
        val builder = CfnMicrosoftADVpcSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DirectoryService::SimpleAD` resource specifies an AWS Directory Service Simple
     * Active Directory ( Simple AD ) in AWS so that your directory users and groups can access the
     * AWS Management Console and AWS applications using their existing credentials.
     *
     * Simple AD is a Microsoft Active Directory–compatible directory. For more information, see
     * [Simple Active Directory](https://docs.aws.amazon.com/directoryservice/latest/admin-guide/directory_simple_ad.html)
     * in the *AWS Directory Service Admin Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.directoryservice.*;
     * CfnSimpleAD cfnSimpleAD = CfnSimpleAD.Builder.create(this, "MyCfnSimpleAD")
     * .name("name")
     * .size("size")
     * .vpcSettings(VpcSettingsProperty.builder()
     * .subnetIds(List.of("subnetIds"))
     * .vpcId("vpcId")
     * .build())
     * // the properties below are optional
     * .createAlias(false)
     * .description("description")
     * .enableSso(false)
     * .password("password")
     * .shortName("shortName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html)
     */
    public inline fun cfnSimpleAD(
        scope: Construct,
        id: String,
        block: CfnSimpleADDsl.() -> Unit = {},
    ): CfnSimpleAD {
        val builder = CfnSimpleADDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSimpleAD`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.directoryservice.*;
     * CfnSimpleADProps cfnSimpleADProps = CfnSimpleADProps.builder()
     * .name("name")
     * .size("size")
     * .vpcSettings(VpcSettingsProperty.builder()
     * .subnetIds(List.of("subnetIds"))
     * .vpcId("vpcId")
     * .build())
     * // the properties below are optional
     * .createAlias(false)
     * .description("description")
     * .enableSso(false)
     * .password("password")
     * .shortName("shortName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html)
     */
    public inline fun cfnSimpleADProps(
        block: CfnSimpleADPropsDsl.() -> Unit = {}
    ): CfnSimpleADProps {
        val builder = CfnSimpleADPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains VPC information for the
     * [CreateDirectory](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateDirectory.html)
     * or
     * [CreateMicrosoftAD](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateMicrosoftAD.html)
     * operation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.directoryservice.*;
     * VpcSettingsProperty vpcSettingsProperty = VpcSettingsProperty.builder()
     * .subnetIds(List.of("subnetIds"))
     * .vpcId("vpcId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-simplead-vpcsettings.html)
     */
    public inline fun cfnSimpleADVpcSettingsProperty(
        block: CfnSimpleADVpcSettingsPropertyDsl.() -> Unit = {}
    ): CfnSimpleAD.VpcSettingsProperty {
        val builder = CfnSimpleADVpcSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
