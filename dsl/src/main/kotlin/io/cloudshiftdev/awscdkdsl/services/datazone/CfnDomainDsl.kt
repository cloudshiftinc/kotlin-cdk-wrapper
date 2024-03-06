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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datazone.CfnDomain
import software.constructs.Construct

/**
 * The `AWS::DataZone::Domain` resource specifies an Amazon DataZone domain.
 *
 * You can use domains to organize your assets, users, and their projects.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * CfnDomain cfnDomain = CfnDomain.Builder.create(this, "MyCfnDomain")
 * .domainExecutionRole("domainExecutionRole")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .kmsKeyIdentifier("kmsKeyIdentifier")
 * .singleSignOn(SingleSignOnProperty.builder()
 * .type("type")
 * .userAssignment("userAssignment")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html)
 */
@CdkDslMarker
public class CfnDomainDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDomain.Builder = CfnDomain.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The description of the Amazon DataZone domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-description)
     *
     * @param description The description of the Amazon DataZone domain.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The domain execution role that is created when an Amazon DataZone domain is created.
     *
     * The domain execution role is created in the AWS account that houses the Amazon DataZone
     * domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-domainexecutionrole)
     *
     * @param domainExecutionRole The domain execution role that is created when an Amazon DataZone
     *   domain is created.
     */
    public fun domainExecutionRole(domainExecutionRole: String) {
        cdkBuilder.domainExecutionRole(domainExecutionRole)
    }

    /**
     * The identifier of the AWS Key Management Service (KMS) key that is used to encrypt the Amazon
     * DataZone domain, metadata, and reporting data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-kmskeyidentifier)
     *
     * @param kmsKeyIdentifier The identifier of the AWS Key Management Service (KMS) key that is
     *   used to encrypt the Amazon DataZone domain, metadata, and reporting data.
     */
    public fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
        cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
    }

    /**
     * The name of the Amazon DataZone domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-name)
     *
     * @param name The name of the Amazon DataZone domain.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The single sign-on details in Amazon DataZone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-singlesignon)
     *
     * @param singleSignOn The single sign-on details in Amazon DataZone.
     */
    public fun singleSignOn(singleSignOn: IResolvable) {
        cdkBuilder.singleSignOn(singleSignOn)
    }

    /**
     * The single sign-on details in Amazon DataZone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-singlesignon)
     *
     * @param singleSignOn The single sign-on details in Amazon DataZone.
     */
    public fun singleSignOn(singleSignOn: CfnDomain.SingleSignOnProperty) {
        cdkBuilder.singleSignOn(singleSignOn)
    }

    /**
     * The tags specified for the Amazon DataZone domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-tags)
     *
     * @param tags The tags specified for the Amazon DataZone domain.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags specified for the Amazon DataZone domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-tags)
     *
     * @param tags The tags specified for the Amazon DataZone domain.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDomain {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
