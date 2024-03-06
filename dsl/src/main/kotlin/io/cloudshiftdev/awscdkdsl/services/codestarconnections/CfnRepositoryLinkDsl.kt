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

package io.cloudshiftdev.awscdkdsl.services.codestarconnections

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.codestarconnections.CfnRepositoryLink
import software.constructs.Construct

/**
 * Information about the repository link resource, such as the repository link ARN, the associated
 * connection ARN, encryption key ARN, and owner ID.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codestarconnections.*;
 * CfnRepositoryLink cfnRepositoryLink = CfnRepositoryLink.Builder.create(this,
 * "MyCfnRepositoryLink")
 * .connectionArn("connectionArn")
 * .ownerId("ownerId")
 * .repositoryName("repositoryName")
 * // the properties below are optional
 * .encryptionKeyArn("encryptionKeyArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html)
 */
@CdkDslMarker
public class CfnRepositoryLinkDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRepositoryLink.Builder = CfnRepositoryLink.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The Amazon Resource Name (ARN) of the connection associated with the repository link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-connectionarn)
     *
     * @param connectionArn The Amazon Resource Name (ARN) of the connection associated with the
     *   repository link.
     */
    public fun connectionArn(connectionArn: String) {
        cdkBuilder.connectionArn(connectionArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the encryption key for the repository associated with the
     * repository link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-encryptionkeyarn)
     *
     * @param encryptionKeyArn The Amazon Resource Name (ARN) of the encryption key for the
     *   repository associated with the repository link.
     */
    public fun encryptionKeyArn(encryptionKeyArn: String) {
        cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    /**
     * The owner ID for the repository associated with the repository link, such as the owner ID in
     * GitHub.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-ownerid)
     *
     * @param ownerId The owner ID for the repository associated with the repository link, such as
     *   the owner ID in GitHub.
     */
    public fun ownerId(ownerId: String) {
        cdkBuilder.ownerId(ownerId)
    }

    /**
     * The name of the repository associated with the repository link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-repositoryname)
     *
     * @param repositoryName The name of the repository associated with the repository link.
     */
    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * The tags for the repository to be associated with the repository link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-tags)
     *
     * @param tags The tags for the repository to be associated with the repository link.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags for the repository to be associated with the repository link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-tags)
     *
     * @param tags The tags for the repository to be associated with the repository link.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRepositoryLink {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
