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

package io.cloudshiftdev.awscdkdsl.services.codeartifact

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.codeartifact.CfnRepositoryProps

/**
 * Properties for defining a `CfnRepository`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codeartifact.*;
 * Object permissionsPolicyDocument;
 * CfnRepositoryProps cfnRepositoryProps = CfnRepositoryProps.builder()
 * .domainName("domainName")
 * .repositoryName("repositoryName")
 * // the properties below are optional
 * .description("description")
 * .domainOwner("domainOwner")
 * .externalConnections(List.of("externalConnections"))
 * .permissionsPolicyDocument(permissionsPolicyDocument)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .upstreams(List.of("upstreams"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html)
 */
@CdkDslMarker
public class CfnRepositoryPropsDsl {
    private val cdkBuilder: CfnRepositoryProps.Builder = CfnRepositoryProps.builder()

    private val _externalConnections: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _upstreams: MutableList<String> = mutableListOf()

    /** @param description A text description of the repository. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param domainName The name of the domain that contains the repository. */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * @param domainOwner The 12-digit account number of the AWS account that owns the domain that
     *   contains the repository. It does not include dashes or spaces.
     */
    public fun domainOwner(domainOwner: String) {
        cdkBuilder.domainOwner(domainOwner)
    }

    /**
     * @param externalConnections An array of external connections associated with the repository.
     */
    public fun externalConnections(vararg externalConnections: String) {
        _externalConnections.addAll(listOf(*externalConnections))
    }

    /**
     * @param externalConnections An array of external connections associated with the repository.
     */
    public fun externalConnections(externalConnections: Collection<String>) {
        _externalConnections.addAll(externalConnections)
    }

    /**
     * @param permissionsPolicyDocument The document that defines the resource policy that is set on
     *   a repository.
     */
    public fun permissionsPolicyDocument(permissionsPolicyDocument: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(permissionsPolicyDocument)
        cdkBuilder.permissionsPolicyDocument(builder.map)
    }

    /**
     * @param permissionsPolicyDocument The document that defines the resource policy that is set on
     *   a repository.
     */
    public fun permissionsPolicyDocument(permissionsPolicyDocument: Any) {
        cdkBuilder.permissionsPolicyDocument(permissionsPolicyDocument)
    }

    /** @param repositoryName The name of an upstream repository. */
    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    /** @param tags A list of tags to be applied to the repository. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags A list of tags to be applied to the repository. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param upstreams A list of upstream repositories to associate with the repository. The order
     *   of the upstream repositories in the list determines their priority order when AWS
     *   CodeArtifact looks for a requested package version. For more information, see
     *   [Working with upstream repositories](https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html)
     *   .
     */
    public fun upstreams(vararg upstreams: String) {
        _upstreams.addAll(listOf(*upstreams))
    }

    /**
     * @param upstreams A list of upstream repositories to associate with the repository. The order
     *   of the upstream repositories in the list determines their priority order when AWS
     *   CodeArtifact looks for a requested package version. For more information, see
     *   [Working with upstream repositories](https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html)
     *   .
     */
    public fun upstreams(upstreams: Collection<String>) {
        _upstreams.addAll(upstreams)
    }

    public fun build(): CfnRepositoryProps {
        if (_externalConnections.isNotEmpty()) cdkBuilder.externalConnections(_externalConnections)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_upstreams.isNotEmpty()) cdkBuilder.upstreams(_upstreams)
        return cdkBuilder.build()
    }
}
