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
import software.amazon.awscdk.services.datazone.CfnEnvironment
import software.constructs.Construct

/**
 * The `AWS::DataZone::Environment` resource specifies an Amazon DataZone environment, which is a
 * collection of zero or more configured resources with a given set of IAM principals who can
 * operate on those resources.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * CfnEnvironment cfnEnvironment = CfnEnvironment.Builder.create(this, "MyCfnEnvironment")
 * .domainIdentifier("domainIdentifier")
 * .environmentProfileIdentifier("environmentProfileIdentifier")
 * .name("name")
 * .projectIdentifier("projectIdentifier")
 * // the properties below are optional
 * .description("description")
 * .glossaryTerms(List.of("glossaryTerms"))
 * .userParameters(List.of(EnvironmentParameterProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html)
 */
@CdkDslMarker
public class CfnEnvironmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEnvironment.Builder = CfnEnvironment.Builder.create(scope, id)

    private val _glossaryTerms: MutableList<String> = mutableListOf()

    private val _userParameters: MutableList<Any> = mutableListOf()

    /**
     * The description of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-description)
     *
     * @param description The description of the environment.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The identifier of the Amazon DataZone domain in which the environment is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-domainidentifier)
     *
     * @param domainIdentifier The identifier of the Amazon DataZone domain in which the environment
     *   is created.
     */
    public fun domainIdentifier(domainIdentifier: String) {
        cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * The identifier of the environment profile that is used to create this Amazon DataZone
     * environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-environmentprofileidentifier)
     *
     * @param environmentProfileIdentifier The identifier of the environment profile that is used to
     *   create this Amazon DataZone environment.
     */
    public fun environmentProfileIdentifier(environmentProfileIdentifier: String) {
        cdkBuilder.environmentProfileIdentifier(environmentProfileIdentifier)
    }

    /**
     * The glossary terms that can be used in this Amazon DataZone environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-glossaryterms)
     *
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone environment.
     */
    public fun glossaryTerms(vararg glossaryTerms: String) {
        _glossaryTerms.addAll(listOf(*glossaryTerms))
    }

    /**
     * The glossary terms that can be used in this Amazon DataZone environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-glossaryterms)
     *
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone environment.
     */
    public fun glossaryTerms(glossaryTerms: Collection<String>) {
        _glossaryTerms.addAll(glossaryTerms)
    }

    /**
     * The name of the Amazon DataZone environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-name)
     *
     * @param name The name of the Amazon DataZone environment.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The identifier of the Amazon DataZone project in which this environment is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-projectidentifier)
     *
     * @param projectIdentifier The identifier of the Amazon DataZone project in which this
     *   environment is created.
     */
    public fun projectIdentifier(projectIdentifier: String) {
        cdkBuilder.projectIdentifier(projectIdentifier)
    }

    /**
     * The user parameters of this Amazon DataZone environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-userparameters)
     *
     * @param userParameters The user parameters of this Amazon DataZone environment.
     */
    public fun userParameters(vararg userParameters: Any) {
        _userParameters.addAll(listOf(*userParameters))
    }

    /**
     * The user parameters of this Amazon DataZone environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-userparameters)
     *
     * @param userParameters The user parameters of this Amazon DataZone environment.
     */
    public fun userParameters(userParameters: Collection<Any>) {
        _userParameters.addAll(userParameters)
    }

    /**
     * The user parameters of this Amazon DataZone environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-userparameters)
     *
     * @param userParameters The user parameters of this Amazon DataZone environment.
     */
    public fun userParameters(userParameters: IResolvable) {
        cdkBuilder.userParameters(userParameters)
    }

    public fun build(): CfnEnvironment {
        if (_glossaryTerms.isNotEmpty()) cdkBuilder.glossaryTerms(_glossaryTerms)
        if (_userParameters.isNotEmpty()) cdkBuilder.userParameters(_userParameters)
        return cdkBuilder.build()
    }
}
