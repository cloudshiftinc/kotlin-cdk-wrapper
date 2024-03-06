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
import software.amazon.awscdk.services.datazone.CfnEnvironmentProps

/**
 * Properties for defining a `CfnEnvironment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * CfnEnvironmentProps cfnEnvironmentProps = CfnEnvironmentProps.builder()
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
public class CfnEnvironmentPropsDsl {
    private val cdkBuilder: CfnEnvironmentProps.Builder = CfnEnvironmentProps.builder()

    private val _glossaryTerms: MutableList<String> = mutableListOf()

    private val _userParameters: MutableList<Any> = mutableListOf()

    /** @param description The description of the environment. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param domainIdentifier The identifier of the Amazon DataZone domain in which the environment
     *   is created.
     */
    public fun domainIdentifier(domainIdentifier: String) {
        cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * @param environmentProfileIdentifier The identifier of the environment profile that is used to
     *   create this Amazon DataZone environment.
     */
    public fun environmentProfileIdentifier(environmentProfileIdentifier: String) {
        cdkBuilder.environmentProfileIdentifier(environmentProfileIdentifier)
    }

    /**
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone environment.
     */
    public fun glossaryTerms(vararg glossaryTerms: String) {
        _glossaryTerms.addAll(listOf(*glossaryTerms))
    }

    /**
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone environment.
     */
    public fun glossaryTerms(glossaryTerms: Collection<String>) {
        _glossaryTerms.addAll(glossaryTerms)
    }

    /** @param name The name of the Amazon DataZone environment. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param projectIdentifier The identifier of the Amazon DataZone project in which this
     *   environment is created.
     */
    public fun projectIdentifier(projectIdentifier: String) {
        cdkBuilder.projectIdentifier(projectIdentifier)
    }

    /** @param userParameters The user parameters of this Amazon DataZone environment. */
    public fun userParameters(vararg userParameters: Any) {
        _userParameters.addAll(listOf(*userParameters))
    }

    /** @param userParameters The user parameters of this Amazon DataZone environment. */
    public fun userParameters(userParameters: Collection<Any>) {
        _userParameters.addAll(userParameters)
    }

    /** @param userParameters The user parameters of this Amazon DataZone environment. */
    public fun userParameters(userParameters: IResolvable) {
        cdkBuilder.userParameters(userParameters)
    }

    public fun build(): CfnEnvironmentProps {
        if (_glossaryTerms.isNotEmpty()) cdkBuilder.glossaryTerms(_glossaryTerms)
        if (_userParameters.isNotEmpty()) cdkBuilder.userParameters(_userParameters)
        return cdkBuilder.build()
    }
}
