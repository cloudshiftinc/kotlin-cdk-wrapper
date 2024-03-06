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

package io.cloudshiftdev.awscdkdsl.services.datazone

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datazone.CfnEnvironmentProfile
import software.constructs.Construct

/**
 * The details of an environment profile.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * CfnEnvironmentProfile cfnEnvironmentProfile = CfnEnvironmentProfile.Builder.create(this,
 * "MyCfnEnvironmentProfile")
 * .awsAccountId("awsAccountId")
 * .awsAccountRegion("awsAccountRegion")
 * .domainIdentifier("domainIdentifier")
 * .environmentBlueprintIdentifier("environmentBlueprintIdentifier")
 * .name("name")
 * .projectIdentifier("projectIdentifier")
 * // the properties below are optional
 * .description("description")
 * .userParameters(List.of(EnvironmentParameterProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html)
 */
@CdkDslMarker
public class CfnEnvironmentProfileDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEnvironmentProfile.Builder =
        CfnEnvironmentProfile.Builder.create(scope, id)

    private val _userParameters: MutableList<Any> = mutableListOf()

    /**
     * The identifier of an AWS account in which an environment profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-awsaccountid)
     *
     * @param awsAccountId The identifier of an AWS account in which an environment profile exists.
     */
    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * The AWS Region in which an environment profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-awsaccountregion)
     *
     * @param awsAccountRegion The AWS Region in which an environment profile exists.
     */
    public fun awsAccountRegion(awsAccountRegion: String) {
        cdkBuilder.awsAccountRegion(awsAccountRegion)
    }

    /**
     * The description of the environment profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-description)
     *
     * @param description The description of the environment profile.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The identifier of the Amazon DataZone domain in which the environment profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-domainidentifier)
     *
     * @param domainIdentifier The identifier of the Amazon DataZone domain in which the environment
     *   profile exists.
     */
    public fun domainIdentifier(domainIdentifier: String) {
        cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * The identifier of a blueprint with which an environment profile is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-environmentblueprintidentifier)
     *
     * @param environmentBlueprintIdentifier The identifier of a blueprint with which an environment
     *   profile is created.
     */
    public fun environmentBlueprintIdentifier(environmentBlueprintIdentifier: String) {
        cdkBuilder.environmentBlueprintIdentifier(environmentBlueprintIdentifier)
    }

    /**
     * The name of the environment profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-name)
     *
     * @param name The name of the environment profile.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The identifier of a project in which an environment profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-projectidentifier)
     *
     * @param projectIdentifier The identifier of a project in which an environment profile exists.
     */
    public fun projectIdentifier(projectIdentifier: String) {
        cdkBuilder.projectIdentifier(projectIdentifier)
    }

    /**
     * The user parameters of this Amazon DataZone environment profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-userparameters)
     *
     * @param userParameters The user parameters of this Amazon DataZone environment profile.
     */
    public fun userParameters(vararg userParameters: Any) {
        _userParameters.addAll(listOf(*userParameters))
    }

    /**
     * The user parameters of this Amazon DataZone environment profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-userparameters)
     *
     * @param userParameters The user parameters of this Amazon DataZone environment profile.
     */
    public fun userParameters(userParameters: Collection<Any>) {
        _userParameters.addAll(userParameters)
    }

    /**
     * The user parameters of this Amazon DataZone environment profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-userparameters)
     *
     * @param userParameters The user parameters of this Amazon DataZone environment profile.
     */
    public fun userParameters(userParameters: IResolvable) {
        cdkBuilder.userParameters(userParameters)
    }

    public fun build(): CfnEnvironmentProfile {
        if (_userParameters.isNotEmpty()) cdkBuilder.userParameters(_userParameters)
        return cdkBuilder.build()
    }
}
