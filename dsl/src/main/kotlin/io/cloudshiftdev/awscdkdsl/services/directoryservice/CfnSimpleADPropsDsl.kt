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
import software.amazon.awscdk.services.directoryservice.CfnSimpleAD
import software.amazon.awscdk.services.directoryservice.CfnSimpleADProps

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
@CdkDslMarker
public class CfnSimpleADPropsDsl {
    private val cdkBuilder: CfnSimpleADProps.Builder = CfnSimpleADProps.builder()

    /**
     * @param createAlias If set to `true` , specifies an alias for a directory and assigns the
     *   alias to the directory. The alias is used to construct the access URL for the directory,
     *   such as `http://&lt;alias&gt;.awsapps.com` . By default, this property is set to `false` .
     *
     * After an alias has been created, it cannot be deleted or reused, so this operation should
     * only be used when absolutely necessary.
     */
    public fun createAlias(createAlias: Boolean) {
        cdkBuilder.createAlias(createAlias)
    }

    /**
     * @param createAlias If set to `true` , specifies an alias for a directory and assigns the
     *   alias to the directory. The alias is used to construct the access URL for the directory,
     *   such as `http://&lt;alias&gt;.awsapps.com` . By default, this property is set to `false` .
     *
     * After an alias has been created, it cannot be deleted or reused, so this operation should
     * only be used when absolutely necessary.
     */
    public fun createAlias(createAlias: IResolvable) {
        cdkBuilder.createAlias(createAlias)
    }

    /** @param description A description for the directory. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param enableSso Whether to enable single sign-on for a directory. If you don't specify a
     *   value, AWS CloudFormation disables single sign-on by default.
     */
    public fun enableSso(enableSso: Boolean) {
        cdkBuilder.enableSso(enableSso)
    }

    /**
     * @param enableSso Whether to enable single sign-on for a directory. If you don't specify a
     *   value, AWS CloudFormation disables single sign-on by default.
     */
    public fun enableSso(enableSso: IResolvable) {
        cdkBuilder.enableSso(enableSso)
    }

    /** @param name The fully qualified name for the directory, such as `corp.example.com` . */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param password The password for the directory administrator. The directory creation process
     *   creates a directory administrator account with the user name `Administrator` and this
     *   password.
     *
     * If you need to change the password for the administrator account, see the
     * [ResetUserPassword](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_ResetUserPassword.html)
     * API call in the *AWS Directory Service API Reference* .
     */
    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    /** @param shortName The NetBIOS name of the directory, such as `CORP` . */
    public fun shortName(shortName: String) {
        cdkBuilder.shortName(shortName)
    }

    /**
     * @param size The size of the directory. For valid values, see
     *   [CreateDirectory](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateDirectory.html)
     *   in the *AWS Directory Service API Reference* .
     */
    public fun size(size: String) {
        cdkBuilder.size(size)
    }

    /**
     * @param vpcSettings A
     *   [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
     *   object that contains additional information for the operation.
     */
    public fun vpcSettings(vpcSettings: IResolvable) {
        cdkBuilder.vpcSettings(vpcSettings)
    }

    /**
     * @param vpcSettings A
     *   [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
     *   object that contains additional information for the operation.
     */
    public fun vpcSettings(vpcSettings: CfnSimpleAD.VpcSettingsProperty) {
        cdkBuilder.vpcSettings(vpcSettings)
    }

    public fun build(): CfnSimpleADProps = cdkBuilder.build()
}
