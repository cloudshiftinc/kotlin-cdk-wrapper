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
import software.amazon.awscdk.services.codeartifact.CfnDomain
import software.constructs.Construct

/**
 * The `AWS::CodeArtifact::Domain` resource creates an AWS CodeArtifact domain.
 *
 * CodeArtifact *domains* make it easier to manage multiple repositories across an organization. You
 * can use a domain to apply permissions across many repositories owned by different AWS accounts.
 * For more information about domains, see the
 * [Domain concepts information](https://docs.aws.amazon.com/codeartifact/latest/ug/codeartifact-concepts.html#welcome-concepts-domain)
 * in the *CodeArtifact User Guide* . For more information about the `CreateDomain` API, see
 * [CreateDomain](https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_CreateDomain.html)
 * in the *CodeArtifact API Reference* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codeartifact.*;
 * Object permissionsPolicyDocument;
 * CfnDomain cfnDomain = CfnDomain.Builder.create(this, "MyCfnDomain")
 * .domainName("domainName")
 * // the properties below are optional
 * .encryptionKey("encryptionKey")
 * .permissionsPolicyDocument(permissionsPolicyDocument)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html)
 */
@CdkDslMarker
public class CfnDomainDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDomain.Builder = CfnDomain.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A string that specifies the name of the requested domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-domainname)
     *
     * @param domainName A string that specifies the name of the requested domain.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * The key used to encrypt the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-encryptionkey)
     *
     * @param encryptionKey The key used to encrypt the domain.
     */
    public fun encryptionKey(encryptionKey: String) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * The document that defines the resource policy that is set on a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-permissionspolicydocument)
     *
     * @param permissionsPolicyDocument The document that defines the resource policy that is set on
     *   a domain.
     */
    public fun permissionsPolicyDocument(permissionsPolicyDocument: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(permissionsPolicyDocument)
        cdkBuilder.permissionsPolicyDocument(builder.map)
    }

    /**
     * The document that defines the resource policy that is set on a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-permissionspolicydocument)
     *
     * @param permissionsPolicyDocument The document that defines the resource policy that is set on
     *   a domain.
     */
    public fun permissionsPolicyDocument(permissionsPolicyDocument: Any) {
        cdkBuilder.permissionsPolicyDocument(permissionsPolicyDocument)
    }

    /**
     * A list of tags to be applied to the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-tags)
     *
     * @param tags A list of tags to be applied to the domain.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of tags to be applied to the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-tags)
     *
     * @param tags A list of tags to be applied to the domain.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDomain {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
