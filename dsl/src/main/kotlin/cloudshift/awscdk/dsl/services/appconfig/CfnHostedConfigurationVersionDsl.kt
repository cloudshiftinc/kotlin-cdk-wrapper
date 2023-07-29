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

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion
import software.constructs.Construct

/**
 * Create a new configuration in the AWS AppConfig hosted configuration store.
 *
 * Configurations must be 1 MB or smaller. The AWS AppConfig hosted configuration store provides the
 * following benefits over other configuration store options.
 * * You don't need to set up and configure other services such as Amazon Simple Storage Service (
 *   Amazon S3 ) or Parameter Store.
 * * You don't need to configure AWS Identity and Access Management ( IAM ) permissions to use the
 *   configuration store.
 * * You can store configurations in any content type.
 * * There is no cost to use the store.
 * * You can create a configuration and add it to the store when you create a configuration profile.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * CfnHostedConfigurationVersion cfnHostedConfigurationVersion =
 * CfnHostedConfigurationVersion.Builder.create(this, "MyCfnHostedConfigurationVersion")
 * .applicationId("applicationId")
 * .configurationProfileId("configurationProfileId")
 * .content("content")
 * .contentType("contentType")
 * // the properties below are optional
 * .description("description")
 * .latestVersionNumber(123)
 * .versionLabel("versionLabel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html)
 */
@CdkDslMarker
public class CfnHostedConfigurationVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnHostedConfigurationVersion.Builder =
        CfnHostedConfigurationVersion.Builder.create(scope, id)

    /**
     * The application ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-applicationid)
     *
     * @param applicationId The application ID.
     */
    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    /**
     * The configuration profile ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-configurationprofileid)
     *
     * @param configurationProfileId The configuration profile ID.
     */
    public fun configurationProfileId(configurationProfileId: String) {
        cdkBuilder.configurationProfileId(configurationProfileId)
    }

    /**
     * The content of the configuration or the configuration data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-content)
     *
     * @param content The content of the configuration or the configuration data.
     */
    public fun content(content: String) {
        cdkBuilder.content(content)
    }

    /**
     * A standard MIME type describing the format of the configuration content.
     *
     * For more information, see
     * [Content-Type](https://docs.aws.amazon.com/https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-contenttype)
     *
     * @param contentType A standard MIME type describing the format of the configuration content.
     */
    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    /**
     * A description of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-description)
     *
     * @param description A description of the configuration.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * An optional locking token used to prevent race conditions from overwriting configuration
     * updates when creating a new version.
     *
     * To ensure your data is not overwritten when creating multiple hosted configuration versions
     * in rapid succession, specify the version number of the latest hosted configuration version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-latestversionnumber)
     *
     * @param latestVersionNumber An optional locking token used to prevent race conditions from
     *   overwriting configuration updates when creating a new version.
     */
    public fun latestVersionNumber(latestVersionNumber: Number) {
        cdkBuilder.latestVersionNumber(latestVersionNumber)
    }

    /**
     * A user-defined label for an AWS AppConfig hosted configuration version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-versionlabel)
     *
     * @param versionLabel A user-defined label for an AWS AppConfig hosted configuration version.
     */
    public fun versionLabel(versionLabel: String) {
        cdkBuilder.versionLabel(versionLabel)
    }

    public fun build(): CfnHostedConfigurationVersion = cdkBuilder.build()
}
