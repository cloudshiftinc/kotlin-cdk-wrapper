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
import software.amazon.awscdk.services.codestarconnections.CfnRepositoryLinkProps

/**
 * Properties for defining a `CfnRepositoryLink`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codestarconnections.*;
 * CfnRepositoryLinkProps cfnRepositoryLinkProps = CfnRepositoryLinkProps.builder()
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
public class CfnRepositoryLinkPropsDsl {
    private val cdkBuilder: CfnRepositoryLinkProps.Builder = CfnRepositoryLinkProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param connectionArn The Amazon Resource Name (ARN) of the connection associated with the
     *   repository link.
     */
    public fun connectionArn(connectionArn: String) {
        cdkBuilder.connectionArn(connectionArn)
    }

    /**
     * @param encryptionKeyArn The Amazon Resource Name (ARN) of the encryption key for the
     *   repository associated with the repository link.
     */
    public fun encryptionKeyArn(encryptionKeyArn: String) {
        cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    /**
     * @param ownerId The owner ID for the repository associated with the repository link, such as
     *   the owner ID in GitHub.
     */
    public fun ownerId(ownerId: String) {
        cdkBuilder.ownerId(ownerId)
    }

    /** @param repositoryName The name of the repository associated with the repository link. */
    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    /** @param tags The tags for the repository to be associated with the repository link. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags for the repository to be associated with the repository link. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRepositoryLinkProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
