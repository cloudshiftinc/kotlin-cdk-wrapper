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
import software.amazon.awscdk.services.datazone.CfnProjectProps

/**
 * Properties for defining a `CfnProject`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
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
public class CfnProjectPropsDsl {
    private val cdkBuilder: CfnProjectProps.Builder = CfnProjectProps.builder()

    private val _glossaryTerms: MutableList<String> = mutableListOf()

    /** @param description The description of a project. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param domainIdentifier The identifier of a Amazon DataZone domain where the project exists.
     */
    public fun domainIdentifier(domainIdentifier: String) {
        cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /** @param glossaryTerms The glossary terms that can be used in this Amazon DataZone project. */
    public fun glossaryTerms(vararg glossaryTerms: String) {
        _glossaryTerms.addAll(listOf(*glossaryTerms))
    }

    /** @param glossaryTerms The glossary terms that can be used in this Amazon DataZone project. */
    public fun glossaryTerms(glossaryTerms: Collection<String>) {
        _glossaryTerms.addAll(glossaryTerms)
    }

    /** @param name The name of a project. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnProjectProps {
        if (_glossaryTerms.isNotEmpty()) cdkBuilder.glossaryTerms(_glossaryTerms)
        return cdkBuilder.build()
    }
}
