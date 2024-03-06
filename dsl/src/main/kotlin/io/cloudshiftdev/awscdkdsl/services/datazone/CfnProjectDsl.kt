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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.datazone.CfnProject
import software.constructs.Construct

/**
 * The `AWS::DataZone::Project` resource specifies an Amazon DataZone project.
 *
 * Projects enable a group of users to collaborate on various business use cases that involve
 * publishing, discovering, subscribing to, and consuming data in the Amazon DataZone catalog.
 * Project members consume assets from the Amazon DataZone catalog and produce new assets using one
 * or more analytical workflows.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * CfnProject cfnProject = CfnProject.Builder.create(this, "MyCfnProject")
 * .domainIdentifier("domainIdentifier")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .glossaryTerms(List.of("glossaryTerms"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html)
 */
@CdkDslMarker
public class CfnProjectDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnProject.Builder = CfnProject.Builder.create(scope, id)

    private val _glossaryTerms: MutableList<String> = mutableListOf()

    /**
     * The description of a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-description)
     *
     * @param description The description of a project.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The identifier of a Amazon DataZone domain where the project exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-domainidentifier)
     *
     * @param domainIdentifier The identifier of a Amazon DataZone domain where the project exists.
     */
    public fun domainIdentifier(domainIdentifier: String) {
        cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * The glossary terms that can be used in this Amazon DataZone project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-glossaryterms)
     *
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone project.
     */
    public fun glossaryTerms(vararg glossaryTerms: String) {
        _glossaryTerms.addAll(listOf(*glossaryTerms))
    }

    /**
     * The glossary terms that can be used in this Amazon DataZone project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-glossaryterms)
     *
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone project.
     */
    public fun glossaryTerms(glossaryTerms: Collection<String>) {
        _glossaryTerms.addAll(glossaryTerms)
    }

    /**
     * The name of a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-name)
     *
     * @param name The name of a project.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnProject {
        if (_glossaryTerms.isNotEmpty()) cdkBuilder.glossaryTerms(_glossaryTerms)
        return cdkBuilder.build()
    }
}
