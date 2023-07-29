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

package cloudshift.awscdk.dsl.services.codeartifact

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.codeartifact.CfnRepository
import software.constructs.Construct

/**
 * The `AWS::CodeArtifact::Repository` resource creates an AWS CodeArtifact repository.
 *
 * CodeArtifact *repositories* contain a set of package versions. For more information about
 * repositories, see the
 * [Repository concepts information](https://docs.aws.amazon.com/codeartifact/latest/ug/codeartifact-concepts.html#welcome-concepts-repository)
 * in the *CodeArtifact User Guide* . For more information about the `CreateRepository` API, see
 * [CreateRepository](https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_CreateRepository.html)
 * in the *CodeArtifact API Reference* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codeartifact.*;
 * Object permissionsPolicyDocument;
 * CfnRepository cfnRepository = CfnRepository.Builder.create(this, "MyCfnRepository")
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
public class CfnRepositoryDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRepository.Builder = CfnRepository.Builder.create(scope, id)

    private val _externalConnections: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _upstreams: MutableList<String> = mutableListOf()

    /**
     * A text description of the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-description)
     *
     * @param description A text description of the repository.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the domain that contains the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-domainname)
     *
     * @param domainName The name of the domain that contains the repository.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * The 12-digit account number of the AWS account that owns the domain that contains the
     * repository.
     *
     * It does not include dashes or spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-domainowner)
     *
     * @param domainOwner The 12-digit account number of the AWS account that owns the domain that
     *   contains the repository.
     */
    public fun domainOwner(domainOwner: String) {
        cdkBuilder.domainOwner(domainOwner)
    }

    /**
     * An array of external connections associated with the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-externalconnections)
     *
     * @param externalConnections An array of external connections associated with the repository.
     */
    public fun externalConnections(vararg externalConnections: String) {
        _externalConnections.addAll(listOf(*externalConnections))
    }

    /**
     * An array of external connections associated with the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-externalconnections)
     *
     * @param externalConnections An array of external connections associated with the repository.
     */
    public fun externalConnections(externalConnections: Collection<String>) {
        _externalConnections.addAll(externalConnections)
    }

    /**
     * The document that defines the resource policy that is set on a repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-permissionspolicydocument)
     *
     * @param permissionsPolicyDocument The document that defines the resource policy that is set on
     *   a repository.
     */
    public fun permissionsPolicyDocument(permissionsPolicyDocument: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(permissionsPolicyDocument)
        cdkBuilder.permissionsPolicyDocument(builder.map)
    }

    /**
     * The document that defines the resource policy that is set on a repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-permissionspolicydocument)
     *
     * @param permissionsPolicyDocument The document that defines the resource policy that is set on
     *   a repository.
     */
    public fun permissionsPolicyDocument(permissionsPolicyDocument: Any) {
        cdkBuilder.permissionsPolicyDocument(permissionsPolicyDocument)
    }

    /**
     * The name of an upstream repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-repositoryname)
     *
     * @param repositoryName The name of an upstream repository.
     */
    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * A list of tags to be applied to the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-tags)
     *
     * @param tags A list of tags to be applied to the repository.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of tags to be applied to the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-tags)
     *
     * @param tags A list of tags to be applied to the repository.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * A list of upstream repositories to associate with the repository.
     *
     * The order of the upstream repositories in the list determines their priority order when AWS
     * CodeArtifact looks for a requested package version. For more information, see
     * [Working with upstream repositories](https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-upstreams)
     *
     * @param upstreams A list of upstream repositories to associate with the repository.
     */
    public fun upstreams(vararg upstreams: String) {
        _upstreams.addAll(listOf(*upstreams))
    }

    /**
     * A list of upstream repositories to associate with the repository.
     *
     * The order of the upstream repositories in the list determines their priority order when AWS
     * CodeArtifact looks for a requested package version. For more information, see
     * [Working with upstream repositories](https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-upstreams)
     *
     * @param upstreams A list of upstream repositories to associate with the repository.
     */
    public fun upstreams(upstreams: Collection<String>) {
        _upstreams.addAll(upstreams)
    }

    public fun build(): CfnRepository {
        if (_externalConnections.isNotEmpty()) cdkBuilder.externalConnections(_externalConnections)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_upstreams.isNotEmpty()) cdkBuilder.upstreams(_upstreams)
        return cdkBuilder.build()
    }
}
