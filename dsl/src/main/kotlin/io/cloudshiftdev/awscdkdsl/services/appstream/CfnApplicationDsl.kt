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

package io.cloudshiftdev.awscdkdsl.services.appstream

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnApplication
import software.constructs.Construct

/**
 * This resource creates an application.
 *
 * Applications store the details about how to launch applications on streaming instances. This is
 * only supported for Elastic fleets.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
 * .appBlockArn("appBlockArn")
 * .iconS3Location(S3LocationProperty.builder()
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * .build())
 * .instanceFamilies(List.of("instanceFamilies"))
 * .launchPath("launchPath")
 * .name("name")
 * .platforms(List.of("platforms"))
 * // the properties below are optional
 * .attributesToDelete(List.of("attributesToDelete"))
 * .description("description")
 * .displayName("displayName")
 * .launchParameters("launchParameters")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .workingDirectory("workingDirectory")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html)
 */
@CdkDslMarker
public class CfnApplicationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApplication.Builder = CfnApplication.Builder.create(scope, id)

    private val _attributesToDelete: MutableList<String> = mutableListOf()

    private val _instanceFamilies: MutableList<String> = mutableListOf()

    private val _platforms: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The app block ARN with which the application should be associated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-appblockarn)
     *
     * @param appBlockArn The app block ARN with which the application should be associated.
     */
    public fun appBlockArn(appBlockArn: String) {
        cdkBuilder.appBlockArn(appBlockArn)
    }

    /**
     * A list of attributes to delete from an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-attributestodelete)
     *
     * @param attributesToDelete A list of attributes to delete from an application.
     */
    public fun attributesToDelete(vararg attributesToDelete: String) {
        _attributesToDelete.addAll(listOf(*attributesToDelete))
    }

    /**
     * A list of attributes to delete from an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-attributestodelete)
     *
     * @param attributesToDelete A list of attributes to delete from an application.
     */
    public fun attributesToDelete(attributesToDelete: Collection<String>) {
        _attributesToDelete.addAll(attributesToDelete)
    }

    /**
     * The description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-description)
     *
     * @param description The description of the application.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The display name of the application.
     *
     * This name is visible to users in the application catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-displayname)
     *
     * @param displayName The display name of the application.
     */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * The icon S3 location of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-icons3location)
     *
     * @param iconS3Location The icon S3 location of the application.
     */
    public fun iconS3Location(iconS3Location: IResolvable) {
        cdkBuilder.iconS3Location(iconS3Location)
    }

    /**
     * The icon S3 location of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-icons3location)
     *
     * @param iconS3Location The icon S3 location of the application.
     */
    public fun iconS3Location(iconS3Location: CfnApplication.S3LocationProperty) {
        cdkBuilder.iconS3Location(iconS3Location)
    }

    /**
     * The instance families the application supports.
     *
     * *Allowed Values* : `GENERAL_PURPOSE` | `GRAPHICS_G4`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-instancefamilies)
     *
     * @param instanceFamilies The instance families the application supports.
     */
    public fun instanceFamilies(vararg instanceFamilies: String) {
        _instanceFamilies.addAll(listOf(*instanceFamilies))
    }

    /**
     * The instance families the application supports.
     *
     * *Allowed Values* : `GENERAL_PURPOSE` | `GRAPHICS_G4`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-instancefamilies)
     *
     * @param instanceFamilies The instance families the application supports.
     */
    public fun instanceFamilies(instanceFamilies: Collection<String>) {
        _instanceFamilies.addAll(instanceFamilies)
    }

    /**
     * The launch parameters of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-launchparameters)
     *
     * @param launchParameters The launch parameters of the application.
     */
    public fun launchParameters(launchParameters: String) {
        cdkBuilder.launchParameters(launchParameters)
    }

    /**
     * The launch path of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-launchpath)
     *
     * @param launchPath The launch path of the application.
     */
    public fun launchPath(launchPath: String) {
        cdkBuilder.launchPath(launchPath)
    }

    /**
     * The name of the application.
     *
     * This name is visible to users when a name is not specified in the DisplayName property.
     *
     * *Pattern* : `^[a-zA-Z0-9][a-zA-Z0-9_.-]{0,100}$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-name)
     *
     * @param name The name of the application.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The platforms the application supports.
     *
     * *Allowed Values* : `WINDOWS_SERVER_2019` | `AMAZON_LINUX2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-platforms)
     *
     * @param platforms The platforms the application supports.
     */
    public fun platforms(vararg platforms: String) {
        _platforms.addAll(listOf(*platforms))
    }

    /**
     * The platforms the application supports.
     *
     * *Allowed Values* : `WINDOWS_SERVER_2019` | `AMAZON_LINUX2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-platforms)
     *
     * @param platforms The platforms the application supports.
     */
    public fun platforms(platforms: Collection<String>) {
        _platforms.addAll(platforms)
    }

    /**
     * The tags of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-tags)
     *
     * @param tags The tags of the application.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-tags)
     *
     * @param tags The tags of the application.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The working directory of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-workingdirectory)
     *
     * @param workingDirectory The working directory of the application.
     */
    public fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): CfnApplication {
        if (_attributesToDelete.isNotEmpty()) cdkBuilder.attributesToDelete(_attributesToDelete)
        if (_instanceFamilies.isNotEmpty()) cdkBuilder.instanceFamilies(_instanceFamilies)
        if (_platforms.isNotEmpty()) cdkBuilder.platforms(_platforms)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
