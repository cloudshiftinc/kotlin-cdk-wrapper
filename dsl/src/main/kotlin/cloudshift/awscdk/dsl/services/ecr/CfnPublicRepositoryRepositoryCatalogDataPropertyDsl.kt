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

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecr.CfnPublicRepository

/**
 * The details about the repository that are publicly visible in the Amazon ECR Public Gallery.
 *
 * For more information, see
 * [Amazon ECR Public repository catalog data](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repository-catalog-data.html)
 * in the *Amazon ECR Public User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecr.*;
 * RepositoryCatalogDataProperty repositoryCatalogDataProperty =
 * RepositoryCatalogDataProperty.builder()
 * .aboutText("aboutText")
 * .architectures(List.of("architectures"))
 * .operatingSystems(List.of("operatingSystems"))
 * .repositoryDescription("repositoryDescription")
 * .usageText("usageText")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-publicrepository-repositorycatalogdata.html)
 */
@CdkDslMarker
public class CfnPublicRepositoryRepositoryCatalogDataPropertyDsl {
    private val cdkBuilder: CfnPublicRepository.RepositoryCatalogDataProperty.Builder =
        CfnPublicRepository.RepositoryCatalogDataProperty.builder()

    private val _architectures: MutableList<String> = mutableListOf()

    private val _operatingSystems: MutableList<String> = mutableListOf()

    /**
     * @param aboutText The longform description of the contents of the repository. This text
     *   appears in the repository details on the Amazon ECR Public Gallery.
     */
    public fun aboutText(aboutText: String) {
        cdkBuilder.aboutText(aboutText)
    }

    /** @param architectures The architecture tags that are associated with the repository. */
    public fun architectures(vararg architectures: String) {
        _architectures.addAll(listOf(*architectures))
    }

    /** @param architectures The architecture tags that are associated with the repository. */
    public fun architectures(architectures: Collection<String>) {
        _architectures.addAll(architectures)
    }

    /**
     * @param operatingSystems The operating system tags that are associated with the repository.
     */
    public fun operatingSystems(vararg operatingSystems: String) {
        _operatingSystems.addAll(listOf(*operatingSystems))
    }

    /**
     * @param operatingSystems The operating system tags that are associated with the repository.
     */
    public fun operatingSystems(operatingSystems: Collection<String>) {
        _operatingSystems.addAll(operatingSystems)
    }

    /** @param repositoryDescription The short description of the repository. */
    public fun repositoryDescription(repositoryDescription: String) {
        cdkBuilder.repositoryDescription(repositoryDescription)
    }

    /**
     * @param usageText The longform usage details of the contents of the repository. The usage text
     *   provides context for users of the repository.
     */
    public fun usageText(usageText: String) {
        cdkBuilder.usageText(usageText)
    }

    public fun build(): CfnPublicRepository.RepositoryCatalogDataProperty {
        if (_architectures.isNotEmpty()) cdkBuilder.architectures(_architectures)
        if (_operatingSystems.isNotEmpty()) cdkBuilder.operatingSystems(_operatingSystems)
        return cdkBuilder.build()
    }
}
